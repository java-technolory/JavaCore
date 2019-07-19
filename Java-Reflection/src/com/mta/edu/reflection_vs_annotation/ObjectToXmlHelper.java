package com.mta.edu.reflection_vs_annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.*;

public class ObjectToXmlHelper {

    /**
     * Chuyển đối tượng sang xml
     */
    public static <T> String convertToXml(T obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml verstion=\"1.0\" encoding=\"UTF-8\" ?>\n");
        sb.append(convertToXml(obj, 0));
        return sb.toString();
    }

    /**
     * Chuyển đối tượng sang xml
     */
    private static <T> String convertToXml(T obj, int numOfTab) {
        StringBuilder sb = new StringBuilder();

        // Get Class of object
        Class<?> clazz = obj.getClass();

        // Kiểm tra xem class này có được chú tích XmlRootElement hay không.
        boolean isXmlDoc = clazz.isAnnotationPresent(XmlRootElement.class);

        List<Field> fields;
        String name;
        String value;

        if (isXmlDoc) {
            // Lấy đối tượng XmlRootElement, chú thích trên lớp này.
            XmlRootElement rootNote = clazz.getAnnotation(XmlRootElement.class);
            fields = getFields(clazz, null);
            if (rootNote.name().equals("book")) {
                String anBt = "";
                String valueBt = "";
                Field field1 = null;
                if (fields.size() > 3) {
                    field1 = fields.get(3);
                    XmlAttribute attribute = field1.getAnnotation(XmlAttribute.class);
                    field1.setAccessible(true);
                    anBt = attribute.name();
                    valueBt = getValueOfField(field1, obj);
                }
                sb.append(getTab(numOfTab));  // Add tab
                sb.append("<" + rootNote.name() + " " + anBt + "=\"" + valueBt + "\"" + ">");     // Root element if (isNotEmpty(rootNote.namespace))
                sb.append("\n");    // Add new
            } else {
                sb.append(getTab(numOfTab));  // Add tab
                sb.append("<" + rootNote.name() + ">");     // Root element if (isNotEmpty(rootNote.namespace))
                sb.append("\n");    // Add new
            }

            if (!fields.isEmpty()) {
                // Create xml elements
                for (Field field : fields) {
                    field.setAccessible(true);
                    if (field.isAnnotationPresent(XmlElementWrapper.class)) {
                        sb.append(createXmlWrapper(field, obj, numOfTab + 1));
                    } else if (field.isAnnotationPresent(XmlElement.class)) {
                        sb.append(createXmlElement(field, fields, obj, numOfTab + 1));
                    }
                }
            }
            sb.append(getTab(numOfTab));
            sb.append("</" + rootNote.name() + ">");    // End root element
        }
        return sb.toString();
    }

    private static String createXmlWrapper(Field field, Object obj, int numOfTab) {
        StringBuilder sb = new StringBuilder();
        XmlElementWrapper ann = field.getAnnotation(XmlElementWrapper.class);
        String name = ann.name();   // Get Element's name
        sb.append(getTab(numOfTab));    // create 1 tab
        sb.append("<" + name + ">");    // start element
        sb.append("\n");    // add new line
        Collection<?> collections = getListValueOfField(field, obj);
        if (collections != null && !collections.isEmpty()) {
            // Create xml sub element
            for (Object collection : collections) {
                sb.append(convertToXml(collection, numOfTab + 1));  // Increase tab
                sb.append("\n");    // Add new line
            }
        }
        sb.append(getTab(numOfTab));    // Create 1 tab
        sb.append("</" + name + ">");   // End Element
        sb.append("\n");    // Add new line
        return sb.toString();
    }

    private static String createXmlElement(Field field, List<Field> fields, Object obj, int numOfTab) {
        StringBuilder sb = new StringBuilder();
        XmlElement ann = field.getAnnotation(XmlElement.class);
        String name = ann.name();   // Get  Element' name
        String value = getValueOfField(field, obj);  // Get Value Of Field
        sb.append(getTab(numOfTab));    // Create tab
        sb.append("<" + name + ">");    // Start Element
        sb.append(value);   // Element's content
        sb.append("</" + name + ">");   // End Element
        sb.append("\n");    // Add new element
        return sb.toString();
    }

    //
    private static String getNameAttribute(Field field, Object obj) {
        XmlAttribute ann = field.getAnnotation(XmlAttribute.class);
        String name = ann.name();
        return name;
    }

    // Lấy giá trị kiểu chuỗi
    private static String getValueOfField(Field field, Object obj) {
        String value = "";
        try {
            value = String.valueOf(field.get(obj));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return value;
    }

    // Lấy giá trị kiểu Collection (List, ArrayList, ...)
    private static Collection<?> getListValueOfField(Field field, Object obj) {
        Collection<?> collection = null;
        try {
            Object objValue = field.get(obj);
            if (objValue instanceof Collection) {
                collection = (Collection<?>) objValue;
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return collection;
    }

    // Kiểm tra chuỗi rỗng
    private static boolean isNotEmpty(String str) {
        return str != null && !str.isEmpty();
    }

    // Lấy danh sách Field có sử dụng Annotation
    private static List<Field> getFields(Class<?> clazz, Class<? extends Annotation> ann) {
        List<Field> fieldAttribute = new ArrayList<>();

        Field[] fields = clazz.getDeclaredFields();
        if (ann == null) {
            fieldAttribute.addAll(Arrays.asList(fields));
        } else {
            for (Field field : fields) {
                fieldAttribute.add(field);
            }
        }
        return fieldAttribute;
    }

    // Lấy số dấu tab
    private static String getTab(int numOfTab) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= numOfTab; i++) {
            sb.append("\t");    // thêm dấu tab
        }
        return sb.toString();
    }
}

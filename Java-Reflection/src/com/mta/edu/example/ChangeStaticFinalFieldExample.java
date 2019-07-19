package com.mta.edu.example;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ChangeStaticFinalFieldExample {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

/*        // Create Cat
        Cat cat = new Cat();

        // Get field instance
        Field field = cat.getClass().getDeclaredField("NUMBER_OF_LEGS");
        field.setAccessible(true);  // Suppress Java Language access checking (bỏ qua kiểm tra truy cập ngôn ngữ java)

        // Remove "final"
//        Field modifierField = Field.class.getDeclaredField("modifiers");
        Field modifierField = Field.class.getDeclaredField("modifiers");
        modifierField.setAccessible(true);
        modifierField.setInt(field, field.getModifiers() & ~Modifier.FINAL);

        // Get value
        Integer fieldValue = (Integer) field.get(null);
        System.out.println(cat.getNumberOfLegs());

        // Set value
        field.set(null, 2);
        System.out.println(cat.getNumberOfLegs());*/

        // create Cat
        Cat cat = new Cat();

        // Get field instance
        Field field = cat.getClass().getDeclaredField("NUMBER_OF_LEGS");
        field.setAccessible(true); // Suppress Java language access checking

        // Remove "final" modifier
//        Field modifiersField = Field.class.getDeclaredField("modifiers");
//        modifiersField.setAccessible(true);
//        modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);

        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);

        // Get value
        Integer fieldValue = (Integer) field.get(null);
        System.out.println(cat.getNumberOfLegs()); // -> 4

        // Set value
        field.set(null, 2);
        System.out.println(cat.getNumberOfLegs()); // -> 2
    }

    private static void setFinalStaticField(Class<?> clazz, String fieldName, Object value)

            throws ReflectiveOperationException {

        Field field = clazz.getDeclaredField(fieldName);

        field.setAccessible(true);

        Field modifiers = Field.class.getDeclaredField("modifiers");

        modifiers.setAccessible(true);

        modifiers.setInt(field, field.getModifiers() & ~Modifier.FINAL);

        field.set(null, value);

    }
}

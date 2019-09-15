package com.mta.edu.example;

import java.lang.reflect.Field;

public class AccessPrivateFieldExample {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        // Tạo đối tượng Class mô tả class Cat
        Class<Cat> aClazz = Cat.class;

        // Class.getField(String) chỉ lấy được các trường public.
        // Sử dụng Class.getDeclaredField(String): lấy đối tượng Field mô tả trường name của class Cat.
        Field private_nameField = aClazz.getDeclaredField("name");

        // Cho phép để truy cập vào các trường private.
        // Nếu không sẽ bị ngoại lệ IllegaAccessException.
        private_nameField.setAccessible(true);

        Cat tom = new Cat("Tom");

        String fieldName = (String) private_nameField.get(tom);
        System.out.println("Value field name = " + fieldName);

        // Set giá trị mới cho trường name.
        private_nameField.set(tom, "Tom Cat");
        System.out.println("New value = " + tom.getName());
    }
}

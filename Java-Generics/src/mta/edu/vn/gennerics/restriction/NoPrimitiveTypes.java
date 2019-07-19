package mta.edu.vn.gennerics.restriction;

import javax.lang.model.type.ReferenceType;

public class NoPrimitiveTypes {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();

        // compiler error
        // referenceType
        // Syntax error, insert "Dimensions" to complete
//        ReferenceType
//        Box<int> box = new Box<int>();

        integerBox.add(100);
        printBox(integerBox);
    }

    static void printBox(Box box) {
        System.out.println("Value : " + box.get());
    }
}

package mta.edu.vn.gennerics.restriction;

public class NoCast {
    public static void main(String[] args) {

        Box<Integer> integerBox = new Box<>();
        // chỉ cast được khi parameter được tham số hóa bằng ký tự đại diện (?)
        Box<?> numberBox = new Box<>();
        integerBox = (Box<Integer>) numberBox;

/*
        // Compiler error: Cannot cast from Box<Number> to Box<Float>
        Box<Float> floatBox = new Box<>();
        Box<Number> numberBox1 = new Box<>();
        floatBox = (Box<Float>)numberBox1;
*/

    }

    public static void add(Box<?> box) {
        Box<Integer> integerBox = (Box<Integer>) box;
    }
}

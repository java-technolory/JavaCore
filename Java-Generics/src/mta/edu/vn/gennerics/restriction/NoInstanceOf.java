package mta.edu.vn.gennerics.restriction;

public class NoInstanceOf {
    public static void main(String[] args) {

        Box<Integer> box = new Box<>();
        // Compiler error:
        // Cannot perform istanceof check against
        // parameterized type Box<Integer>.
        // Use the form Box<?> instead since further
        // generic type information will be erased at runtime
/*        if (box instanceof Box<Integer>){

        }
*/

        if (box instanceof Box<?>){

        }
    }
}

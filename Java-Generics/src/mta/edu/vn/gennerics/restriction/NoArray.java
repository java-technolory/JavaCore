package mta.edu.vn.gennerics.restriction;

public class NoArray {
    public static void main(String[] args) {
        // Cannot create a generic array of Box<Integer>
        //Box<Integer> [] arrayOfLists = new Box<Integer>[2];

//        Object[] stringBoxes = new Box<String>[0];

//        stringBoxes[0] = new Box<>();

        Object[] obj = new Object[100];
    }
}

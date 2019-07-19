package mta.edu.vn;

import java.util.*;

/*
* Primitive types (like int, long, double, ...) are not allowed to be used in generic. It mean whenever you need to
* parameterize(tham số hóa) your generic type with a primitive one, the respective (tương ứng) class wraper
* (Integer, Long, Double, ...) has to used instead (thay thế).
*
*[ Kiểu dữ liệu primitive (like int, long, double, ...) là không được phép sử dụng trong generic. Nó có nghĩa bất cứ khi nào
*  bạn cần tham số hóa kiểu generic của mình with một primitive (kiểu dữ liệu nguyên thủy), tương ứng với class wraper
*  ( Integer, Long, Double, ...) phải được sử dụng thay thế.
*]
*
*
*
* */
class Test {
    final List<Long> longs = new ArrayList<>();
    final Set<Integer> integers = new HashSet<>();

    public static void main(String [] args){
        System.out.println("Hello World ...");
    }

    public void main(){

        longs.add(0L);  // 'long' is boxed to 'Long'

        long value = longs.get(0); // 'Long' is unboxed to 'long'

    }

//    void sort(Collection String){
//
//    }

//    void sorts(Collection<String> strings){
//
//    }

/*    void sort( Collection< String > strings ) {
        // Some implementation over strings heres
    }*/

    void sort( Collection< Number > numbers ) {
        // Some implementation over numbers here
    }

    // error compile
/*
    public <T> void perform(final T action){
        T[] as = new T[0];
    }
*/

/*    // error compile
    static <T> void action(Class<T> as){
        if (as instanceof T){

        }
    }*/
}
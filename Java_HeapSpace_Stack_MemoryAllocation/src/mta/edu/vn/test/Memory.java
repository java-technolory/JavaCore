package mta.edu.vn.test;

/**
 * Step execution of the program
 *
 * 1. Khi chúng ta chạy chương trình, nó sẽ tải tất cả các lớp Runtime vào Heap Space. Khi tìm thấy phương thức main()
 *    ở dòng 1 (line 1), Java Runtime tạo stack memory được sử dụng bởi main() method thread.
 *
 * 2. Chúng ta đang tạo biến cục bộ ở dòng 2 (line 2), vì vậy nó sẽ được tạo và được lưu trữ trên stack memory của
 *    phương thức main()
 *
 * 3. Vì chúng ta đang tạo một object ở dòng 3 (line 3), nên nó được tạo trong Head memory và stack memory
 *    chứa tham chiếu cho nó. Quá trình tương tự xảy ra khi chúng ta tạo đối tượng Memory ở dòng 4 (line 4)
 *
 * 4. Bây giờ khi chúng gọi phương thức foo() ở dòng 5 (line 5), một block ở đầu stack được tạo để sử dụng bởi phương thức foo().
 *    Do java được truyền theo giá trị, nên một tham chiếu mới đến Object được tạo trong khối ngăn xếp foo() ở dòng 6 (line 6)
 *
 * 5. Một string được tạo ra ở dòng 7 (line 7) nó đi vào Spring Pool trong Head Space và một reference được tạo trong
 *    Stack Space foo() cho nó.
 *
 * 6. Phương thức foo() được kết thúc ở dòng 8 (line 8), tại thời điểm này khối bộ nhớ được phân bổ cho foo() trong stack
 *    trở lên free.
 *
 * 7. Ở dòng 9 (line 9) phương thức main() kết thúc và stack memory được tạo cho phương thức main() bị bị hủy.
 *    Ngoài ra chương trình kết thúc tại dòng này, do đó Java Runtime giải phóng tất cả các bộ nhớ và kết thúc quá trình thực
 *    thi chương trình.
 *
 */

public class Memory {
    public static void main(String [] args){  // line 1
        int i = 0;  // line 2
        Object obj = new Object();  // line 3
        Memory mem = new Memory();  // line 4
        mem.foo(obj);   // line 5
    } // line 9

    private void foo(Object param){ // line 6
        String str = param.toString();  // line 7
        System.err.println(str.hashCode());
        System.out.println(str);
        System.err.println(param.hashCode());
        System.out.println(param);
        System.err.println("");
    } // line 8
}

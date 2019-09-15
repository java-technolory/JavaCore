package mta.edu.vn.test;

import java.lang.annotation.*;

/**
 * Note:
 *     1. Các annotation method không có parameters
 *
 *     2. Các kiểu trả về của annotation method được gới hạn ở các kiểu dữ liệu nguyên thủy (long, int, byte, ...), String
 *        Enum, Annotation or array các kiểu dữ liệu này.
 *
 *     3. Các method annotation có thể có giá trị mặc định (default).
 *
 *     4. Các annotation có thể có meta annotation kèm theo. Meta annotation được sử dụng để cung cấp thông tin về chú thích.
 *
 *********************************************************************************************************************************
 *********************************************************************************************************************************
 * Build-in annotation in Java
 *
 *  - Có 5 build-in annotations:
 *
 *      1. @Override - Khi chúng ta muốn overrice một method của Superclass, chúng ta nên sử dụng annotation này để thông báo
 *         cho trình biên dịch (compiler) rằng chúng ta đang ghi đè (override) một method(). Vì vậy khi một method của superclass
 *         bị loại bỏ (removed) hoặc thay đổi (changed), trình biên dịch sẽ hiển thị thông báo lỗi
 *
 *      2. @Deprecated - Khi chúng ta muốn trình biên dịch biết rằng một method() không được dùng nữa, chúng ta nên sử dụng
 *         annotation này. Java kiến nghị rằng trong javadoc, chúng ta nên cung cấp thông tin về lý do tại sao phương thức này
 *         không được dùng nữa và đâu là phương án thay thế sử dụng.
 *
 *      3. @SupperessWarnings - Đây chỉ là để báo cho trình biên dịch (compiler) bỏ qua các cảnh báo cụ thể mà nó tạo ra,
 *         ví dụ sử dụng row type trong generics. Chính sách duy trì của nó là SOURCE và nó bị loại bỏ bởi trình biên dịch.
 *
 *      4. @FunctionalInterface - Chú thích này được giới thiệu trong java 8 để chỉ ra rằng interface được dự định là một
 *         function interface.
 *
 *      5. @SafeVarargs - Lập trình viên khẳng định rằng phần thân của method() hoặc constructor() được chú thích không thực
 *         hiện các hoạt động không an toàn tiềm ẩn trên tham số varargs parameter của nó.
 *
 **********************************************************************************************************************************
 **********************************************************************************************************************************
 *
 * Meta Annotations in Java:
 *
 *  - Có 5 loại meta anotations:
 *
 *      1. @Documented - chỉ ra rằng các element sử dụng annotation phải được ghi lại bằng javadoc và các công cụ tương tự.
 *         Loại này nên được sử dụng để chú thích các khai báo của các loại có chú thích ảnh hướng đến việc sử dụng các phần
 *         tử chú thích bởi client chúng. Nếu một loại khái báo là annotaion with @Documented, các chú thích của nó sẽ trở
 *         thành một phần của API công khai của các thành phần được chú thích.
 *
 *      2. @Target - cho biết các loại phần tử của chương trình mà loại chú thích được áp dụng. Một vài giá trị có thể:
 *         TYPE, METHOD, CONSTRUCTOR, FILED etc. Nếu @Target meta-annotation không có mặt, thì chú thích có thể được sử dụng
 *         trên bất kỳ thành phần chương trình nào.
 *
 *      3. @Inherited - chỉ ra rằng một loại chú thích được tự động kế thừa. Nếu người dùng truy vấn loại chú thích trên một
 *         class và khai báo một class không có annotation cho loại này thì class của superclass sẽ tự động được truy vấn
 *         cho loại chú thích. Quá trình này được lặp đi lặp lại nhiều lần cho đến khi tìm thấy một chú thích cho loại này
 *         hoặc đạt đến đỉnh của hệ thống phân cấp class (object).
 *
 *      4. @Retention - cho biết thời gian chú thích với loại chú thích sẽ được giữa lại. Phải có đối số RetentionPolicy có giá
 *         trị là SOURCE, CLASS, and RUNTIME
 *
 *      5. @Repeatable - được sử dụng để chỉ ra rằng loại chú thích mà nó khai báo là có thệ lặp lại.
 *
 *
 */

@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {

    String author() default "Hai";

    String date();

    int revision() default 1;

    String comments();

    int i = 10;

}

package mta.edu.vn.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Retention Policy
 *
 * 1. RetentionPolicy.CLASS :: Annotaion sẽ được ghi lại trong file bởi compiler nhưng JVM không cần dữ liệu trong thời gian chạy
 *
 * 2. RetentionPolicy.RUNTIME :: Annotaion sẽ được ghi lại trong file bởi compiler và được JVM giữ lại trong thời gian chạy,
 *                               vì vậy chúng có thể được đọc một cách reflection (ánh xạ).
 *
 * 3. RetentionPolicy.CLASS :: Các Annotaion sẽ được compiler loại bỏ.
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotaionWithRetention {
}

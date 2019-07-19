package mta.edu.vn.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class RepeatingAnnotaions {

    // 1. Declare a Repeatable Annotaion Type
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Filter {
        String value();
    }

    // 2. Declare the Nested Annotation Type
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Filters {
        Filter[] value();
    }

    // 3. Use repeating annotation
    @Filters({@Filter("Filter1"), @Filter("Filter2")})
    public interface Filterable {
    }

    public static void main(String [] args){
        // 4. Retrieving Annotations via The Filters Class
        Filters  filters = Filterable.class.getAnnotation(Filters.class);
        System.err.println(filters);
        for (Filter filter : filters.value()){
            System.out.println(filter.value());
        }
    }
}

package mta.edu.vn.threads.runtimeclass;

import java.io.IOException;

public class Runtime1 {
    public static void main(String[] args) throws IOException {
        Runtime.getRuntime().exec("notepad");   // will open a new notepad
/*        Runtime.getRuntime().exec("shutdown -s -t o");   // will shutdown since 0 secons*/
    }
}

package semana2.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest {

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("color");
        } catch (IOException ioe) {

        }
    }
}


package exception.checkedexception;

import java.io.*;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        FileReader file = null;
        try {
            file = new FileReader("A.txt");
            BufferedReader fileInput = new BufferedReader(file);
            // Print first 3 lines of file "C:\test\a.txt"
            for (int counter = 0; counter < 3; counter++)
                System.out.println(fileInput.readLine());
            fileInput.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 
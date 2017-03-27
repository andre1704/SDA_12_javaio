package streamy;

import java.io.*;
import java.util.Scanner;

/**
 * Created by RENT on 2017-03-11.
 */
public class BufferedInStream {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream=new FileInputStream("text.txt");
        BufferedInputStream bufferedInputStream=new BufferedInputStream(inputStream);
        bufferedInputStream.read();



        bufferedInputStream.close();
        inputStream.close();

        FileOutputStream fileOutputStream=new FileOutputStream("text.txt");
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
        bufferedOutputStream.write(9);
        bufferedOutputStream.write(9);
        bufferedOutputStream.write(9);
        bufferedOutputStream.write(9);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        fileOutputStream.close();

//        System.console().readLine();
//        new Scanner(System.in).nextLine();


        FileWriter fileWriter=new FileWriter("text.txt",true);
        fileWriter.write("aabbcc");
        fileWriter.close();

    }
}

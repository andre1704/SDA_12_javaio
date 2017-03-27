package streamy;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by RENT on 2017-03-11.
 */
public class Streams {
    public static void main(String[] args) throws IOException {
        PrintStream out=System.out;
        out.println("nowe");
        PrintStream err=System.err;
        err.println("blad");
        System.err.println("blad 2");
//        int read=System.in.read();
//        System.out.println(read);
        String line=new Scanner(System.in).nextLine();
        System.out.println(line);




    }
}

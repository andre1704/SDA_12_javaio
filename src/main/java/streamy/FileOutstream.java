package streamy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by RENT on 2017-03-11.
 */
public class FileOutstream {

    //FileOutputStream
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("text.txt",true);

        fos.write(21);
        String testString ="lorem ipsum";
        byte[] bytes=testString.getBytes();
        fos.write(bytes);
        fos.close();

        FileInputStream fileInputStream=new FileInputStream("plik.txt");
//        int read=fileInputStream.read();
//        while((read=fileInputStream.read())>0){
//            System.out.println((char)read);
//        }
        byte[] array=new byte[4];
        fileInputStream.read(array);
        String s=new String((array));
        System.out.println(s);
        fileInputStream.close();
    }
}

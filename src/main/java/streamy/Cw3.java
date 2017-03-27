package streamy;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by RENT on 2017-03-11.
 */
public class Cw3 {
    public static void main(String[] args) throws IOException {
        FileWriter nowy=new FileWriter("nova.csv");
        for (int i = 0; i <=20; i++) {
            if(i==20){
                nowy.write(String.valueOf(i));
            }else
            nowy.write(String.valueOf(i)+",");
        }
        nowy.close();
    }
}

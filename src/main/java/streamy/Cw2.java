package streamy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by RENT on 2017-03-11.
 */
public class Cw2 {
    public static int wystapienie=0;
    private char znak;
    private int znakWystapienie;
//    public static HashMap<Integer, String> wystapienie(HashMap<Integer, String> mapa,char znak){
//        for(String el:mapa)
//    }



    public static void main(String[] args) throws IOException {
        FileInputStream in= new FileInputStream("text.txt");
        StringBuilder stringBuilder=new StringBuilder();
        int f;
        while((f= in.read())>-1){
            char g= (char) f;
            if(g=='e')
                wystapienie++;
            stringBuilder.append(g);
        }
        in.close();
        System.out.println(stringBuilder.toString());
        System.out.println(wystapienie);
    }
}

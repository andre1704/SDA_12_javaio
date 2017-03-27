package streamy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-03-11.
 */
public class Cw {
    public static void main(String[] args) throws IOException {
        FileInputStream in=new FileInputStream("plik.txt");
        List<Integer> list=new ArrayList<Integer>();
        int f;
        while((f=in.read())>0){
            f=f-48;
            list.add(f);

        }

        int liczba=0;
        int y;int x;
        for (int i = 0; i <list.size() ; i++) {
            y= (int) Math.pow(10,list.size()-1-i);
            x=list.get(i)*y;
            liczba+=x;
        }
        System.out.println(liczba);

        in.close();

    }
}

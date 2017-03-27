package streamy;

import com.google.common.base.Charsets;
import com.google.common.io.CharSink;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-03-11.
 */
public class GuavaDemo {
    public static void main(String[] args) throws IOException {
        List<String> strings = Files.readLines(new File("text.txt"), Charsets.UTF_8);
        CharSink charSink=Files.asCharSink(new File("text.txt"),Charsets.UTF_8);
        List<String> stringListr=new ArrayList<>();
        stringListr.add("ABC");
        charSink.writeLines(stringListr);
    }
}

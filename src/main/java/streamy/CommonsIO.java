package streamy;

import com.google.common.base.Charsets;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.comparator.SizeFileComparator;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by RENT on 2017-03-11.
 */
public class CommonsIO {
    public static void main(String[] args) throws IOException {
        List<String> list= FileUtils.readLines(new File("text.txt"), Charsets.UTF_8);
        SizeFileComparator sizeFileComparator=new SizeFileComparator();
        File [] files={new File("a.txt"),new File("b.txt")};
        sizeFileComparator.sort(files);

    }
}

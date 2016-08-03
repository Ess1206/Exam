import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Stan on 01.08.2016.
 */
public class brakeMehods {
    @Test
    public void openFile() throws IOException {
        Scanner scanner = new Scanner(File.createTempFile("qqq","txt"));
    }
}


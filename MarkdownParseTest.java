import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class MarkdownParseTest {

    @Test
    public void test() throws IOException{
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("https://something.com","some-page.html"));
	    assertEquals(expected, links);
        
    }

    public void test2() throws IOException{
        Path fileName = Path.of("test-file-2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("https://something.com","some-page.html"));
	    assertEquals(expected, links);
    }

  
  
  
  
    }

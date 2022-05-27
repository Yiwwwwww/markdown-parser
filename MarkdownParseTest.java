import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class MarkdownParseTest {

    @Test
    public void testSnippet1() throws IOException{
        
        Path fileName = Path.of("Snippet1.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("`google.com","google.com","ucsd.edu"));
	    assertEquals(expected, links);
    }
    @Test
    public void testSnippet2() throws IOException{
        
        Path fileName = Path.of("Snippet2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("a.com","a.com(())","example.com"));
	    assertEquals(expected, links);
    }
    @Test
    public void testSnippet3() throws IOException{
        
        Path fileName = Path.of("Snippet3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule"));
	    assertEquals(expected, links);
    }
  
  
  
    }

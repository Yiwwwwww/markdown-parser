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
        System.out.println("Test1");
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("https://something.com","some-page.html"));
	    assertEquals(expected, links);
        
        
    }
    @Test
    public void test2() throws IOException{
        System.out.println("Test2");
        Path fileName = Path.of("test-file-2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("https://something.com","some-page.html"));
	    assertEquals(expected, links);
    }
    @Test
    public void testSnippet1() throws IOException{
        System.out.println("Test3");
        Path fileName = Path.of("Snippet1.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("url.com","google.com","ucsd.edu"));
	    assertEquals(expected, links);
    }
    @Test
    public void testSnippet2() throws IOException{
        System.out.println("Test4");
        Path fileName = Path.of("Snippet2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("a.com","a.com(())","example.com"));
	    assertEquals(expected, links);
    }
    @Test
    public void testSnippet3() throws IOException{
        System.out.println("Test5");
        Path fileName = Path.of("Snippet3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("https://www.twitter.com","https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule"));
	    assertEquals(expected, links);
    }
  
  
  
    }

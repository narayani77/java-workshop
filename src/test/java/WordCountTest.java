import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class WordCountTest {
     @Test
     public void testWordCount() {
        WordCount WordCount= new WordCount();
        int count = WordCount.count("this the java program to test the splite string");
        Assertions.assertEquals(9,count);
     }
     @Test
     public void testAnotherString(){
        WordCount wordcount = new WordCount();
        int count = wordcount.count("nara yani");
        Assertions.assertEquals(2,wordcount); 
     }

}

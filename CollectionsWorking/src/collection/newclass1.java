// com.company.Main.java
import com.company.input.InputReader;
import com.company.stringprocessing.StringProcessor;

public class Main {
    public static void main(String[] args) {
        String sentence = InputReader.readString("Enter the String:");
        String searchString = InputReader.readString("Enter the String to search:");

        String result = StringProcessor.processString(sentence, searchString);

        System.out.println("Sample Output:");
        System.out.println(result);
    }
}


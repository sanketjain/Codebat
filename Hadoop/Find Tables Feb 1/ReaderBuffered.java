import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.io.IOException;


public class ReaderBuffered{
	public static void main(String[] args){
		Charset charset = Charset.forName("US-ASCII");
		try (BufferedReader reader = Files.newBufferedReader(InputFile.txt, charset)) {
		    String line = null;
		    while ((line = reader.readLine()) != null) {
		        System.out.println(line);
		    }
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
	}
}
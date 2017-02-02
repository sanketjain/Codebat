import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;


public class FiletoTable{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new FileReader("InputFile.txt"));
		try {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
    	String everything = sb.toString();
		} finally {
			br.close();
		}
	}
}
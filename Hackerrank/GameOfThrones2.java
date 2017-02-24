import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameOfThrones2 {
	public static void main(String[] args) throws IOException {
		char[] word = new BufferedReader(new InputStreamReader(System.in)).readLine().toCharArray();
		int[] counts = new int['z'-'a'+1];
		for (char c : word) ++counts[c-'a'];
		int[] odds = new int[2];
		for (int i : counts) if (i > 0) ++odds[i % 2];
		System.out.println((odds[1] < 2)? "YES" : "NO");
	}
}
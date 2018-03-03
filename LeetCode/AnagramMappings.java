import java.util.*;

public class AnagramMappings{
	public static void main(String[] args){
		int[] A = new int[]{10,20,30,40,50};
		int[] B = new int[]{50,10,40,30,20};
		int[] result = new int[A.length];
		result = anagramMapping(A, B);
		for(int elementResult: result){
			System.out.println(elementResult);
		}
	}
	public static int[] anagramMapping(int[] A, int[] B){
		Map<Integer, Integer> map = new HashMap();
		for(int indexB=0; indexB < B.length; ++indexB){
			map.put(B[indexB], indexB);
		}
		int[] ans = new int[A.length];
		int indexAns = 0;		
		for(int elementA : A){
			ans[indexAns++] = map.get(elementA);
		}
		return ans;
	}
}
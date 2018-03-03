import java.util.*;

public class HashTableAndMap{
	public static void main(String[] args){
		HashMap<Integer, String> hMap = new HashMap<>();
		hMap.put(100, "Sanket1");
		hMap.put(101, "Jain1");
		hMap.put(100, "Sanket2");
		hMap.put(103, "Jain2");

		System.out.println("HashMap values stored are: ");
		for(Map.Entry m : hMap.entrySet()){
			System.out.println(m.getKey() + " " + m.getValue());
		}

		Hashtable<Integer, String> hTable = new Hashtable<>();
		hTable.put(100, "Sanket1");
		hTable.put(101, "Jain1");
		hTable.put(100, "Sanket2");
		hTable.put(103, "Jain2");
		System.out.println("Values stored in HashTable are: ");
		for(Map.Entry t: hTable.entrySet()){
			System.out.println(t.getKey() + " " + t.getValue());
		}
	}
}

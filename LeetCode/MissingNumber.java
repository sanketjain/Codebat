import java.util.*;

public class MissingNumber {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        
        int sumOfNums=0;
        for(int elementNums : nums){
            set.add(elementNums);    
        }

        for(int number : nums){
            sumOfNums+=number;
        }

        int sumOfSet=0;
        for(int setElement : set){
            sumOfSet+=setElement;
        }
        
        return (2*sumOfSet)-sumOfNums;
        
    }
}
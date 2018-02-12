public class Solution {
    public boolean isPalindrome(int x) {
        int reverseN = reverseIntegerN(int n);  
        return (n==reverseN);
    }
    
    public int reverseIntegerN(int n){
        //get front number
        //add to new number 
        //get second front
        //multiply secondFront by 10 and add to new number;
        
        int newNumber = 0;
        int front = n%10;
        while(n>0){
            newNumber = newNumber + front * 10; 
            n = n % 10;
            front = n;
        }
        return newNumber;
    }
}
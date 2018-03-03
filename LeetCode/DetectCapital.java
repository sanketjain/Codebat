class DetectCapital {
    public static boolean detectCapitalUse(String word) {
        int capitalCount = 0;
        // Count captial letters.
        for(char currentCharacter: word.toCharArray()) {
            if('Z' - currentCharacter >= 0){ 
                capitalCount++;
            }
        }
        // 3 cases:
        // 1. There is no capital letters.
        // 2. There are all capital letters.
        // 3. if there is only 1 captial letter we check if only First character is captial not any other.
        return ((capitalCount==0 || capitalCount==word.length()) || (capitalCount==1 && 'Z' - word.charAt(0)>=0));
        
        //return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
    }

    public static void main(String[] args){
        System.out.println(detectCapitalUse("Abcdef"));
        System.out.println(detectCapitalUse("abcdef"));
        System.out.println(detectCapitalUse("ABCDEF"));
        System.out.println(detectCapitalUse("AbcdeF"));
    }
}

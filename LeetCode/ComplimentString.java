public class ComplimentString {

    public static void main(String[] args){
        System.out.println(findComplement(5));
    }

    public static int findComplement(int num) {
        String binaryString = Integer.toBinaryString(num);

        String binaryComplimentString = "";
        for(int index=0; index < binaryString.length(); index++){
            if((binaryString.charAt(index))=='0'){
                binaryComplimentString = binaryComplimentString + "1";
            } else {
                binaryComplimentString = binaryComplimentString + "0";
            }
        }
        
        int numCompliment = Integer.parseInt(binaryComplimentString, 2);
        return numCompliment;
    }
}
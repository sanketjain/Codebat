public class ComplimentStringBuilder {

    public static void main(String[] args){
        System.out.println(findComplement(5));
    }

    public static int findComplement(int num) {
        String binaryString = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder("");

        for(int index=0; index < binaryString.length(); index++){
            if((binaryString.charAt(index))=='0'){
                sb.append("1");
            } else {
                sb.append("0");
            }
        }
        
        String binaryComplimentString = sb.toString();
        int numCompliment = Integer.parseInt(binaryComplimentString, 2);
        return numCompliment;
    }
}
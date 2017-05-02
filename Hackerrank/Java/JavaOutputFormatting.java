import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
              //Complete this line
                int lenS1 = s1.length();
                int lenX = (String.valueOf(x)).length();
                String S1Spaces = "";
                String num=Integer.toString(x);
                for(int j=0; j<(15-lenS1); j++){
                    S1Spaces += " ";
                }
                for(int k=0; k<(3-lenX); k++){
                    num = "0" + num;
                }
                
                System.out.println(s1 + S1Spaces + num);
            }
            System.out.println("================================");

    }
}

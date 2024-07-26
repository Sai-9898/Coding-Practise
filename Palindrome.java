import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String reversestr="";
        int stri=str.length();
        for(int i = stri-1;i>=0; --i)
        {
            reversestr=reversestr+str.charAt(i);
        }
        if(reversestr.toLowerCase().equals(str.toLowerCase()))
        {
            System.out.println("palindrom");
        }
       else
        {
          System.out.println("not");
       }
    }
}

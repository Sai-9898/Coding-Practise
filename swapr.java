import java.util.Scanner;

public class swapr {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
    a=a^b;
    b=a^b;
    a=a^b;
        System.out.println(a+""+b);
    }
}

package itm.oss;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            Calculator cal=new Calculator();
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(cal.add(a,b));
            System.out.println(cal.subtract(a, b));
            System.out.println(cal.multiple(a, b));
            System.out.println(cal.subtract(a,b));
    }
}
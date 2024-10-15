package itm.oss;

import java.util.Scanner;
import java.util.function.BiFunction;
public class FunctionCalculator{
    static BiFunction<Integer,Integer,Integer> add=(x,y)->x+y;
    static BiFunction<Integer,Integer,Integer> subtract=(x,y)->x-y;
    static BiFunction<Integer,Integer,Integer> multiply=(x,y)->x*y;
    static BiFunction<Integer,Integer,Integer> divide=(x,y)->{
        if(y!=0) return x/y;
        else throw new ArithmeticException("Cannot divide by zero");
    }
    public static int calculate(BiFunction<Integer,Integer,Integer>operation,int x,int y){
        return operation.apply(x,y);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(("Addition: "+calculate(add,a,b)));
        System.out.println("subtraction: "+calculate(subtract,a,b));
        System.out.println("Multiply"+calculate(multiply,a,b));
        System.out.println("divide: "+calculate(divide,a,b));
    }
}
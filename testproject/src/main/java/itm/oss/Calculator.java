package itm.oss;

import java.util.Scanner;

public class Calculator {
        Scanner sc=new Scanner(System.in);
        public int add(int a,int b){
            int c;
            c=a+b;
            return c;
        }
        public int subtract(int a,int b){
            int d;
            d=a-b;
            return d;
        }
        public int multiple(int a,int b){
            int e;
            e=a*b;
            return e;
        }
        public float divide(int a,int b){
            if(b==0) {
                throw new ArithmeticException("Division by zero");
            }
            else{
                int f;
                f=a/b;
                return f;
            }
        }
        public boolean isPrime(int number){
            for(int i=0;i<number;i++){
                if(number%i==0){
                    return false;
                }
            }
            return true;
        }
        public int getNextPrime(int number){
            int index=number;
            while(true){
                index+=1;
                if(isPrime(index)){
                    return index;
                }
            }
        }


}

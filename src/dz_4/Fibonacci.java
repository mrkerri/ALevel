package dz_4;

public class Fibonacci {
    public static void main(String[] args){
        int sum = 0; int a = 1; int b =1;
        System.out.print(a + " "+ b + " ");
        for(int i=0; i<=8;i++) {
            sum = a + b;
            a=b;
            b=sum;
            System.out.print(sum + " ");
        }


    }
}

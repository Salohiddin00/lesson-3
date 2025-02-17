package begin;

import java.util.Scanner;

public class Begin28 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print(" A:");
        double x= a.nextDouble();
        double a2=x*x;
        double a3=a2*x;
        double a5=Math.pow(x,5);
        double a10=Math.pow(x,10);
        double a15=Math.pow(x,15);
        System.out.println("A2:"+a2);
        System.out.println("A3:"+a3);
        System.out.println("A5:"+a5);
        System.out.println("A10:"+a10);
        System.out.println("A15:"+a15);
    }
}

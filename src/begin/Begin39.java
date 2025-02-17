package begin;

import java.util.Scanner;

public class Begin39 {
    public static void main(String[] args) {
        Scanner a1=new Scanner(System.in);
        System.out.print("A:");
        double a= a1.nextDouble();
        Scanner b1=new Scanner(System.in);
        System.out.print("B:");
        double b= b1.nextDouble();
        Scanner c1=new Scanner(System.in);
        System.out.print("C:");
        double c= c1.nextDouble();
        double d=(b*b)-(4*a*c);
        double x1=(-b+(Math.sqrt(d)))/(2*a);
        double x2=(-b-(Math.sqrt(d)))/(2*a);
        System.out.println("X1:"+x1);
        System.out.println("X2:"+x2);
    }
}

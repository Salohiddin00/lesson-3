package begin;

import java.util.Scanner;

public class Begin40 {
    public static void main(String[] args) {
        Scanner a11=new Scanner(System.in);
        System.out.print("A1:");
        double a1= a11.nextDouble();
        Scanner b11=new Scanner(System.in);
        System.out.print("B1:");
        double b1= b11.nextDouble();
        Scanner c11=new Scanner(System.in);
        System.out.print("C1:");
        double c1= c11.nextDouble();
        Scanner a12=new Scanner(System.in);
        System.out.print("A2:");
        double a2= a11.nextDouble();
        Scanner b12=new Scanner(System.in);
        System.out.print("B2:");
        double b2= b12.nextDouble();
        Scanner c12=new Scanner(System.in);
        System.out.print("C:");
        double c2= c12.nextDouble();
        double D=(a1*b2)-(a2*b1);
        double y=(((a1*c2)-(a2*c1))/D);
        double x=(((c1*b2)-(c2*b1))/D);
        System.out.println("D:"+D);
        System.out.println("Y:"+y);
        System.out.println("X:"+x);
    }
}

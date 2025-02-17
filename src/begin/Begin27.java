package begin;

import java.util.Scanner;

public class Begin27 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print(" A:");
        double x= a.nextDouble();
        double a2=x*x;
        double a4=a2*a2;
        double a8=a4*a4;
        System.out.println("A2:"+a2);
        System.out.println("A4:"+a4);
        System.out.println("A8:"+a8);
    }
}

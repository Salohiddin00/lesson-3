package begin;

import java.util.Scanner;

public class Begin13 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("R1 :");
        double r1= a.nextDouble();
        Scanner b=new Scanner(System.in);
        System.out.print("R2 :");
        double r2=b.nextDouble();
        double S1=3.14*r1*r1;
        double S2=3.14*r2*r2;
        double S3=S1-S2;
        System.out.println("S1 :"+S1);
        System.out.println("S2 :"+S2);
        System.out.println("S3 :"+S3);
    }
}

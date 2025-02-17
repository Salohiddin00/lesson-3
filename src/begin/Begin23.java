package begin;

import java.util.Scanner;

public class Begin23 {
    public static void main(String[] args) {
        Scanner a1=new Scanner(System.in);
        System.out.print(" A :");
        double A= a1.nextDouble();
        Scanner a2=new Scanner(System.in);
        System.out.print(" B :");
        double B= a2.nextDouble();
        Scanner b1=new Scanner(System.in);
        System.out.print(" C :");
        double C= b1.nextDouble();
        double D=A;
        A=B;
        B=C;
        C=D;
        System.out.println(" A:"+A);
        System.out.println(" B:"+B);
        System.out.println(" C:"+C);
    }
}

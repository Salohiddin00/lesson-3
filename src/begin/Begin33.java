package begin;

import java.util.Scanner;

public class Begin33 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print(" X:");
        double x= a.nextDouble();
        Scanner b=new Scanner(System.in);
        System.out.print(" A:");
        double A= b.nextDouble();
        Scanner y=new Scanner(System.in);
        System.out.print(" Y:");
        double Y= a.nextDouble();
        double som=(A/x)*Y;
        double kg=A/x;
        System.out.println("1 kg:"+kg);
        System.out.println("Y kg:"+som);
    }
}

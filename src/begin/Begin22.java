package begin;

import java.util.Scanner;

public class Begin22 {
    public static void main(String[] args) {
        Scanner a1=new Scanner(System.in);
        System.out.print(" a :");
        double a= a1.nextDouble();
        Scanner a2=new Scanner(System.in);
        System.out.print(" b :");
        double b= a2.nextDouble();
        Scanner a3=new Scanner(System.in);
        System.out.print(" c :");
        double c= a3.nextDouble();
        double p=(a+b+c)/2;
        double S=Math.sqrt((p*(p-a)*(p-b)*(p-c)));
        System.out.println(" Yarim P:"+p);
        System.out.println(" Yuzi :"+S);
    }
}

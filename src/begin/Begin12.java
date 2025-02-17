package begin;

import java.util.Scanner;

public class Begin12 {
    public static void main(String[] args) {
        Scanner a1=new Scanner(System.in);
        System.out.print( " a :");
        double a = a1.nextDouble();
        Scanner b1=new Scanner(System.in);
        System.out.println(" b :");
        double b= b1.nextDouble();
        double c=Math.sqrt((a*a+b*b));
        double P=a+b+c;
        System.out.println("Gipotenuza:"+c);
        System.out.println("Perimetr:"+P);
    }
}

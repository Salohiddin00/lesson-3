package begin;

import java.util.Scanner;

public class Begin34 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print(" X kg:");
        double x= a.nextDouble();
        Scanner b1=new Scanner(System.in);
        System.out.print(" A so'm:");
        double A= b1.nextDouble();
        Scanner y=new Scanner(System.in);
        System.out.print(" Y kg:");
        double Y= a.nextDouble();
        Scanner b11=new Scanner(System.in);
        System.out.print("B so'm:");
        double b= b11.nextDouble();
        double shokalad=A/x;
        double kanfet=b/Y;
        System.out.println("1 kg shokalad so'm:"+shokalad);
        System.out.println("1 kg konfet so'm:"+kanfet);
    }
}

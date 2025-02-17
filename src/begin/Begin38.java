package begin;

import java.util.Scanner;

public class Begin38 {
    public static void main(String[] args) {
        Scanner a1=new Scanner(System.in);
        System.out.print("A:");
        double a= a1.nextDouble();
        Scanner b1=new Scanner(System.in);
        System.out.print("B:");
        double b= b1.nextDouble();
        double x=(-b)/a;
        System.out.println("Kayfiysent:"+x);
    }
}

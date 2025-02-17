package begin;

import java.util.Scanner;

public class Begin16 {
    public static void main(String[] args) {
        Scanner a1=new Scanner(System.in);
        System.out.print(" a :");
        double a= a1.nextDouble();
        Scanner b1=new Scanner(System.in);
        System.out.print(" b :");
        double b= b1.nextDouble();
        double c=Math.abs((a-b));
        System.out.println("Orasidagi masofa:"+c);
    }
}

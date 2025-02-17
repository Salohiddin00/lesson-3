package begin;

import java.util.Scanner;

public class Begin11 {
    public static void main(String[] args) {
        Scanner a1 = new Scanner(System.in);
        System.out.print(" a :");
        double a = a1.nextDouble();
        Scanner b1 = new Scanner(System.in);
        System.out.print(" b :");
        double b = b1.nextDouble();
        double sum = a+b;
        double kopaytma = a*b;
        System.out.println("Yigindi:"+sum);
        System.out.println("Kopaytma:"+kopaytma);
        System.out.println("a sonning moduli:"+Math.abs(a));
        System.out.println("b sonning moduli:"+Math.abs(b));
    }
}

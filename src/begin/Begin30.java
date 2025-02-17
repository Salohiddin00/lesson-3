package begin;

import java.util.Scanner;

public class Begin30 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print(" A:");
        double x= a.nextDouble();
        double gradus=x*(180/Math.PI);
        System.out.println("Gradus:"+gradus);
    }
}

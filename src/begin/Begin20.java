package begin;

import java.util.Scanner;

public class Begin20 {
    public static void main(String[] args) {
        Scanner a1=new Scanner(System.in);
        System.out.print(" x1 :");
        double x1= a1.nextDouble();
        Scanner a2=new Scanner(System.in);
        System.out.print(" x2 :");
        double x2= a1.nextDouble();
        Scanner b1=new Scanner(System.in);
        System.out.print(" y1 :");
        double y1= b1.nextDouble();
        Scanner b2=new Scanner(System.in);
        System.out.print(" y2 :");
        double y2= b2.nextDouble();
        double masofa=Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
        System.out.println("Masofa :"+masofa);
    }
}

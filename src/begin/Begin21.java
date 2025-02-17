package begin;

import java.util.Scanner;

public class Begin21 {
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
        Scanner a3=new Scanner(System.in);
        System.out.print(" x3 :");
        double x3= a1.nextDouble();
        Scanner b3=new Scanner(System.in);
        System.out.print(" y3 :");
        double y3= b1.nextDouble();
        double masofa1=Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
        System.out.println("Masofa 1:"+masofa1);
        double masofa2=Math.sqrt(((x1-x3)*(x1-x3))+((y1-y3)*(y1-y3)));
        System.out.println("Masofa 2:"+masofa2);
        double masofa3=Math.sqrt(((x3-x2)*(x3-x2))+((y2-y3)*(y2-y3)));
        System.out.println("Masofa 3:"+masofa3);
    }
}

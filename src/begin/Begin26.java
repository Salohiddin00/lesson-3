package begin;

import java.util.Scanner;

public class Begin26 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print(" X:");
        double x= a.nextDouble();
        double y=4*Math.pow((x-3),6)-7*Math.pow((x-3),2)+2;
        System.out.println(" Y:"+y);
    }
}

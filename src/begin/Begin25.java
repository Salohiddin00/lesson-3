package begin;

import java.util.Scanner;

public class Begin25 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print(" X:");
        double x= a.nextDouble();
        double y=3*Math.pow(x,6)-6*Math.pow(x,2)-7;
        System.out.println(" Y:"+y);
    }
}

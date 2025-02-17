package begin;

import java.util.Scanner;

public class Begin18 {
    public static void main(String[] args) {
        Scanner a1=new Scanner(System.in);
        System.out.print(" A :");
        double A=a1.nextDouble();
        Scanner b1=new Scanner(System.in);
        System.out.print(" B :");
        double B=b1.nextDouble();
        Scanner c1=new Scanner(System.in);
        System.out.print(" C :");
        double C= c1.nextDouble();
        double AC=Math.abs((C-A));
        double BC=Math.abs((C-B));
        System.out.println(" AC :"+AC);
        System.out.println(" BC :"+BC);
        System.out.println(" AC*BC :"+(AC*BC));
    }
}

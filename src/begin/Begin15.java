package begin;

import java.util.Scanner;

public class Begin15 {
    public static void main(String[] args) {
        Scanner yuza=new Scanner(System.in);
        System.out.print(" S :");
        double S= yuza.nextDouble();
        double R=Math.sqrt(S/3.14);
        double L=2*3.14*R;
        System.out.println("Radiusi:"+R);
        System.out.println(" L :"+L);
    }
}

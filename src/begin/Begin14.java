package begin;

import java.util.Scanner;

public class Begin14 {
    public static void main(String[] args) {
        Scanner uzunlik=new Scanner(System.in);
        System.out.print(" L :");
        double L= uzunlik.nextDouble();
        double R=L/(2*3.14);
        double S=3.14*R*R;
        System.out.println("Radiusi:"+R);
        System.out.println("Yuzi:"+S);
    }
}

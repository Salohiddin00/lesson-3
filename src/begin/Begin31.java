package begin;

import java.util.Scanner;

public class Begin31 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print(" TF:");
        double x= a.nextDouble();
        double TC=(x-32)*(5/9);
        System.out.println("TC:"+TC);
    }
}

package begin;

import java.util.Scanner;

public class Begin35 {
    public static void main(String[] args) {
        Scanner u1=new Scanner(System.in);
        System.out.print("Daryo tezligi:");
        double u= u1.nextDouble();
        Scanner v1=new Scanner(System.in);
        System.out.print("Qayiq tezligi:");
        double v= v1.nextDouble();
        Scanner t1=new Scanner(System.in);
        System.out.print("Daryo oqimi T1:");
        double T1= t1.nextDouble();
        Scanner t2=new Scanner(System.in);
        System.out.print("Oqimga qarshi T2:");
        double T2= t2.nextDouble();
        double s=((u+v)*T1)+((v-u)*T2);
        System.out.println("Masofa:"+s);
    }
}

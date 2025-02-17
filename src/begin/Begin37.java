package begin;

import java.util.Scanner;

public class Begin37 {
    public static void main(String[] args) {
        Scanner v1=new Scanner(System.in);
        System.out.print("V1:");
        double V1= v1.nextDouble();
        Scanner v2=new Scanner(System.in);
        System.out.print("V2:");
        double V2= v2.nextDouble();
        Scanner s1=new Scanner(System.in);
        System.out.print("S:");
        double s= s1.nextDouble();
        Scanner t1=new Scanner(System.in);
        System.out.print("T:");
        double t= t1.nextDouble();
        double S3=s-((V1+V2)*t);
        System.out.println("Masofa:"+S3);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Begin1 {
    public static void main(String[] args) {
        // 1-misol
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a:");
        double a= scanner.nextDouble();
        double perimetr =4*a;
        System.out.println("Perimetr :"+perimetr);*/

        // 2-misol
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a:");
        double a= scanner.nextDouble();
        double S=a*a;
        System.out.println("Yuzi S:"+S);*/

        // 3-misol
        /*Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter a:");
        double a = scanner1.nextDouble();
        System.out.print("Enter b:");
        Scanner scanner2 = new Scanner(System.in);
        double b = scanner2.nextDouble();
        double S = a*b;
        double P = 2*(a+b);
        System.out.println("Yuzi S:" + S);
        System.out.println("Perimetr P:" + P);*/

        // 4-misol
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter D:");
        double d = scanner.nextDouble();
        double L = 3.14*d;
        System.out.println("Aylana uzunligi:"+L);*/

        // 5-misol
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Kubning qirrasi:");
        double a = scanner.nextDouble();
        double V = a*a*a;
        double S = 6*a*a;
        System.out.println("Hajmi V:"+V);
        System.out.println("Yuzi S:"+S);*/

        // 6-misol
        /*Scanner scanner1 = new Scanner(System.in);
        System.out.print(" a :");
        double a= scanner1.nextDouble();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print(" b :");
        double b= scanner2.nextDouble();
        Scanner scanner3 = new Scanner(System.in);
        System.out.print(" c :");
        double c= scanner3.nextDouble();
        double V =a*b*c;
        double S = 2*(a*b+b*c+a*c);
        System.out.println("Hajm :"+V);
        System.out.println("Yuz :"+S);*/

        // 7-misol
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Radius:");
        double R= scanner.nextDouble();
        double L=2*3.14*R;
        double S=3.14*R*R;
        System.out.println("Aylana L:"+L);
        System.out.println("Aylana S:"+S);*/

        // 8-misol
        /*Scanner a1 = new Scanner(System.in);
        System.out.print("a :");
        double a= a1.nextDouble();
        Scanner b1 = new Scanner(System.in);
        System.out.print("b :");
        double b = b1.nextDouble();
        double orta = (a+b)/2;
        System.out.println("O'rta arifmetigi:"+orta);*/

        // 9-misol
        /*Scanner a1 = new Scanner(System.in);
        System.out.print("a :");
        double a= a1.nextDouble();
        Scanner b1 = new Scanner(System.in);
        System.out.print("b :");
        double b = b1.nextDouble();
        double ortageo = Math.pow((a*b),(1.0/2));
        System.out.println("O'rta geometrik:"+ortageo);*/

        // 10-misol
        /*Scanner a1 = new Scanner(System.in);
        System.out.print(" a :");
        double a = a1.nextDouble();
        Scanner b1 = new Scanner(System.in);
        System.out.print(" b :");
        double b = b1.nextDouble();
        double sum = a+b;
        double kopaytma = a*b;
        System.out.println("Yigindi:"+sum);
        System.out.println("Kopaytma:"+kopaytma);
        System.out.println("a sonning kvadrati:"+(a*a));
        System.out.println("b sonning kvadrati:"+(b*b));*/

        // 11 misol
        /*Scanner a1 = new Scanner(System.in);
        System.out.print(" a :");
        double a = a1.nextDouble();
        Scanner b1 = new Scanner(System.in);
        System.out.print(" b :");
        double b = b1.nextDouble();
        double sum = a+b;
        double kopaytma = a*b;
        System.out.println("Yigindi:"+sum);
        System.out.println("Kopaytma:"+kopaytma);
        System.out.println("a sonning moduli:"+Math.abs(a));
        System.out.println("b sonning moduli:"+Math.abs(b));*/

        // 12 misol
        /*Scanner a1=new Scanner(System.in);
        System.out.print( " a :");
        double a = a1.nextDouble();
        Scanner b1=new Scanner(System.in);
        System.out.println(" b :");
        double b= b1.nextDouble();
        double c=Math.sqrt((a*a+b*b));
        double P=a+b+c;
        System.out.println("Gipotenuza:"+c);
        System.out.println("Perimetr:"+P);*/

        // 13 misol
        /*Scanner a=new Scanner(System.in);
        System.out.print("R1 :");
        double r1= a.nextDouble();
        Scanner b=new Scanner(System.in);
        System.out.print("R2 :");
        double r2=b.nextDouble();
        double S1=3.14*r1*r1;
        double S2=3.14*r2*r2;
        double S3=S1-S2;
        System.out.println("S1 :"+S1);
        System.out.println("S2 :"+S2);
        System.out.println("S3 :"+S3);*/

        //14 misol
        /*Scanner uzunlik=new Scanner(System.in);
        System.out.print(" L :");
        double L= uzunlik.nextDouble();
        double R=L/(2*3.14);
        double S=3.14*R*R;
        System.out.println("Radiusi:"+R);
        System.out.println("Yuzi:"+S);*/

        //15 misol
        /*Scanner yuza=new Scanner(System.in);
        System.out.print(" S :");
        double S= yuza.nextDouble();
        double R=Math.sqrt(S/3.14);
        double L=2*3.14*R;
        System.out.println("Radiusi:"+R);
        System.out.println(" L :"+L);*/

        // 16 misol
        /*Scanner a1=new Scanner(System.in);
        System.out.print(" a :");
        double a= a1.nextDouble();
        Scanner b1=new Scanner(System.in);
        System.out.print(" b :");
        double b= b1.nextDouble();
        double c=Math.abs((a-b));
        System.out.println("Orasidagi masofa:"+c);*/

        // 17 misol
        /*Scanner a1=new Scanner(System.in);
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
        System.out.println(" BC :"+BC);*/

        // 18 misol
        /*Scanner a1=new Scanner(System.in);
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
        System.out.println(" AC*BC :"+(AC*BC));*/

        // 19 misol
        /*Scanner a1=new Scanner(System.in);
        System.out.print(" x1 :");
        double x1= a1.nextDouble();*/

        // 20 misol
        /*Scanner a1=new Scanner(System.in);
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
        System.out.println("Masofa :"+masofa);*/

        // 21 misol
        /*Scanner a1=new Scanner(System.in);
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
        System.out.println("Masofa 3:"+masofa3);*/

        // 22 misol 1
        /*Scanner a1=new Scanner(System.in);
        System.out.print(" a :");
        double a= a1.nextDouble();
        Scanner a2=new Scanner(System.in);
        System.out.print(" b :");
        double b= a2.nextDouble();
        Scanner a3=new Scanner(System.in);
        System.out.print(" c :");
        double c= a3.nextDouble();
        double p=(a+b+c)/2;
        double S=Math.sqrt((p*(p-a)*(p-b)*(p-c)));
        System.out.println(" Yarim P:"+p);
        System.out.println(" Yuzi :"+S);*/

        // 22 misol
        /*Scanner a1=new Scanner(System.in);
        System.out.print(" A :");
        double A= a1.nextDouble();
        Scanner b1=new Scanner(System.in);
        System.out.print(" B :");
        double B= b1.nextDouble();
        double C=A;
        A=B;
        B=C;
        System.out.println(" A:"+A);
        System.out.println(" B:"+B);*/

        // 23 misol
        /*Scanner a1=new Scanner(System.in);
        System.out.print(" A :");
        double A= a1.nextDouble();
        Scanner a2=new Scanner(System.in);
        System.out.print(" B :");
        double B= a2.nextDouble();
        Scanner b1=new Scanner(System.in);
        System.out.print(" C :");
        double C= b1.nextDouble();
        double D=A;
        A=B;
        B=C;
        C=D;
        System.out.println(" A:"+A);
        System.out.println(" B:"+B);
        System.out.println(" C:"+C);*/

        // 24 misol
        /*Scanner a1=new Scanner(System.in);
        System.out.print(" A :");
        double A= a1.nextDouble();
        Scanner a2=new Scanner(System.in);
        System.out.print(" B :");
        double B= a2.nextDouble();
        Scanner b1=new Scanner(System.in);
        System.out.print(" C :");
        double C= b1.nextDouble();
        double D=A;
        A=C;
        C=B;
        B=D;
        System.out.println(" A:"+A);
        System.out.println(" B:"+B);
        System.out.println(" C:"+C);*/

        // 25 misol
        /*Scanner a=new Scanner(System.in);
        System.out.print(" X:");
        double x= a.nextDouble();
        double y=3*Math.pow(x,6)-6*Math.pow(x,2)-7;
        System.out.println(" Y:"+y);*/

        // 26 misol
        /*Scanner a=new Scanner(System.in);
        System.out.print(" X:");
        double x= a.nextDouble();
        double y=4*Math.pow((x-3),6)-7*Math.pow((x-3),2)+2;
        System.out.println(" Y:"+y);*/

        //27 misol
        /*Scanner a=new Scanner(System.in);
        System.out.print(" A:");
        double x= a.nextDouble();
        double a2=x*x;
        double a4=a2*a2;
        double a8=a4*a4;
        System.out.println("A2:"+a2);
        System.out.println("A4:"+a4);
        System.out.println("A8:"+a8);*/

        // 28 misol
        /*Scanner a=new Scanner(System.in);
        System.out.print(" A:");
        double x= a.nextDouble();
        double a2=x*x;
        double a3=a2*x;
        double a5=Math.pow(x,5);
        double a10=Math.pow(x,10);
        double a15=Math.pow(x,15);
        System.out.println("A2:"+a2);
        System.out.println("A3:"+a3);
        System.out.println("A5:"+a5);
        System.out.println("A10:"+a10);
        System.out.println("A15:"+a15);*/

        // 29 misol
        /*Scanner a=new Scanner(System.in);
        System.out.print(" A:");
        double x= a.nextDouble();
        double radian=x*(Math.PI/180);
        System.out.println("Radian:"+radian);*/

        // 30 misol
        /*Scanner a=new Scanner(System.in);
        System.out.print(" A:");
        double x= a.nextDouble();
        double gradus=x*(180/Math.PI);
        System.out.println("Gradus:"+gradus);*/

        // 31 misol
        /*Scanner a=new Scanner(System.in);
        System.out.print(" TF:");
        double x= a.nextDouble();
        double TC=(x-32)*(5/9);
        System.out.println("TC:"+TC);*/

        // 32 misol
        /*Scanner a=new Scanner(System.in);
        System.out.print(" TC:");
        double x= a.nextDouble();
        double TF=(9*x)/5+32;*/

        // 33 misol
        /*Scanner a=new Scanner(System.in);
        System.out.print(" X:");
        double x= a.nextDouble();
        Scanner b=new Scanner(System.in);
        System.out.print(" A:");
        double A= b.nextDouble();
        Scanner y=new Scanner(System.in);
        System.out.print(" Y:");
        double Y= a.nextDouble();
        double som=(A/x)*Y;
        double kg=A/x;
        System.out.println("1 kg:"+kg);
        System.out.println("Y kg:"+som);*/

        // 34 misol
        /*Scanner a=new Scanner(System.in);
        System.out.print(" X kg:");
        double x= a.nextDouble();
        Scanner b1=new Scanner(System.in);
        System.out.print(" A so'm:");
        double A= b1.nextDouble();
        Scanner y=new Scanner(System.in);
        System.out.print(" Y kg:");
        double Y= a.nextDouble();
        Scanner b11=new Scanner(System.in);
        System.out.print("B so'm:");
        double b= b11.nextDouble();
        double shokalad=A/x;
        double kanfet=b/Y;
        System.out.println("1 kg shokalad so'm:"+shokalad);
        System.out.println("1 kg konfet so'm:"+kanfet);*/

        // 35 misol
        /*Scanner u1=new Scanner(System.in);
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
        System.out.println("Masofa:"+s);*/

        // 36 misol
        /*Scanner v1=new Scanner(System.in);
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
        double S3=s+((V1+V2)*t);
        System.out.println("Masofa:"+S3);*/

        // 37 misol
        /*Scanner v1=new Scanner(System.in);
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
        System.out.println("Masofa:"+S3);*/

        // 38 misol
        /*Scanner a1=new Scanner(System.in);
        System.out.print("A:");
        double a= a1.nextDouble();
        Scanner b1=new Scanner(System.in);
        System.out.print("B:");
        double b= b1.nextDouble();
        double x=(-b)/a;
        System.out.println("Kayfiysent:"+x);*/

        // 39 misol
        /*Scanner a1=new Scanner(System.in);
        System.out.print("A:");
        double a= a1.nextDouble();
        Scanner b1=new Scanner(System.in);
        System.out.print("B:");
        double b= b1.nextDouble();
        Scanner c1=new Scanner(System.in);
        System.out.print("C:");
        double c= c1.nextDouble();
        double d=(b*b)-(4*a*c);
        double x1=(-b+(Math.sqrt(d)))/(2*a);
        double x2=(-b-(Math.sqrt(d)))/(2*a);
        System.out.println("X1:"+x1);
        System.out.println("X2:"+x2);*/

        // 40 misol
        /*Scanner a11=new Scanner(System.in);
        System.out.print("A1:");
        double a1= a11.nextDouble();
        Scanner b11=new Scanner(System.in);
        System.out.print("B1:");
        double b1= b11.nextDouble();
        Scanner c11=new Scanner(System.in);
        System.out.print("C1:");
        double c1= c11.nextDouble();
        Scanner a12=new Scanner(System.in);
        System.out.print("A2:");
        double a2= a11.nextDouble();
        Scanner b12=new Scanner(System.in);
        System.out.print("B2:");
        double b2= b12.nextDouble();
        Scanner c12=new Scanner(System.in);
        System.out.print("C:");
        double c2= c12.nextDouble();
        double D=(a1*b2)-(a2*b1);
        double y=(((a1*c2)-(a2*c1))/D);
        double x=(((c1*b2)-(c2*b1))/D);
        System.out.println("D:"+D);
        System.out.println("Y:"+y);
        System.out.println("X:"+x);*/

    }
}
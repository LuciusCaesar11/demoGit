package BTTH;
import java.util.Scanner;
public class b2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap bac da thuc:");
        int n=scanner.nextInt();
        int []a=new int[n+1];
        for(int i=0; i<n; i++)
        {
            System.out.printf("nhap he so a[%d]:",i);
            a[i]=scanner.nextInt();
        }
        System.out.println("nhap gia tri x:");
        int x=scanner.nextInt();
        scanner.close();
        int sum=0;
        for(int i=0; i<n; i++)
        {
            sum+=a[i]*Math.pow(x,i);
        }
        System.out.println("tonhg cua da thuc la:"+sum);
    }
}

package BTTH;
import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap dia chi email: ");
        String email = scanner.nextLine();
        String[] part=email.split("@");
        System.out.println("phan ten dia chi email: "+part[0]+" "+part[1]);
        System.out.println("\n");
        System.out.println("nhap chuoi de dem ki tu in hoa: ");
        String s=scanner.nextLine();
        int count =0;
        for(int i=0; i<s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))) {
                count++;
            }
        }
        System.out.println("so ki tu in hoa:"+count);
        scanner.close();
    }
}

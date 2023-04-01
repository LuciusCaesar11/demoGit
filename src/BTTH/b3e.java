package BTTH;

import java.util.Scanner;

public class b3e {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap chuoi chuan hoa: ");
        String input=scanner.nextLine();
        scanner.close();
        String[] word=input.trim().replaceAll("\\s+"," ").toLowerCase().split(" ");
        StringBuilder res=new StringBuilder();
        for (String string : word) {
            res.append(string.substring(0,1).toUpperCase());
            res.append(string.substring(1));
            res.append(" ");
        }
        String res1=res.toString().trim();
        System.out.println(res1);
    }
}

package BTTH;
import java.util.Scanner;

public class b3d {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap xau can dem tu:");
        String words=scanner.nextLine();
        scanner.close();
        String[] word=words.split("[\\s,;]+");
        int wordcnt =word.length;//dem so phan tu 1 mang
        System.out.println("so tu trong xau la:"+wordcnt);
        int maxlength=0;
        String longesString="";
        for (String w : word) {
            if(w.length() >maxlength)//dem so ki tu trong 1 xau
            {
                maxlength=w.length();
                longesString=w;
            }
        }
        System.out.println("tu dai nhat trong xau: " + longesString);
    }
}

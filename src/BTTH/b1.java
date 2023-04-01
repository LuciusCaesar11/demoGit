package BTTH;
import java.util.Scanner;
import java.util.Random;

public class b1 {
    public static void main(String[] args) {
       Random random=new Random();
       int secretnumber=random.nextInt(100)+1;
       try (Scanner sc = new Scanner(System.in)) {
        int guess=0;
           while(guess!=secretnumber)
           {
            System.out.println("so ban doan la gi ?");
            guess=sc.nextInt();
            if(guess<secretnumber)
                System.out.println("So ban doan nho hon");
            else if(guess>secretnumber)
                System.out.println("so ban doan lon hon");
            else
                {
                    System.out.println("ban doan dung");
                }
           }
    }
    }
}


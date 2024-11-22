package project_pavan_bogasamudram;
import java.util.Scanner;

public class file1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username or email:");
        String username=sc.nextLine();
        System.out.println("Enter password:");
        String pass=sc.nextLine();
        System.out.println("Re-enter the password to confirm password:");
        String cpass=sc.nextLine();
        if (pass==cpass)
        	System.out.println("Signn up succesful");
        else
        	System.out.println("Sugn up unsuccesful");

    }
}

import java.util.Scanner;

public class Name {
    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter your fullname");

        String nama = scan.nextLine();
        int Space = nama.indexOf(" ");

        String Namadepan = nama.substring(0,Space);
        String Namabelakang = nama.substring(Space+1);
        System.out.println("Welcome back Mr " + Namabelakang+ " " +Namadepan.substring(0,1));

    }
}

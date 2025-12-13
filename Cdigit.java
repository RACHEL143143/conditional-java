import java.util.Scanner;

public class Cdigit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char b=sc.next().charAt(0);
        if(b>=0 && b<=9){
            System.out.println("digit");
        }else{
            System.out.println("not a digit");
        }
    }
}

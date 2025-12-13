import java.util.Scanner;

public class Calphabet {
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char b=sc.next().charAt(0);
        b=Character.toLowerCase(b);
        if(b>='a'&&b<='z'){
            System.out.println("alphabet");
        }else{
            System.out.println("not alphabet");
        }
    }
}

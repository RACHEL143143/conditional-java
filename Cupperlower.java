import java.util.Scanner;

public class Cupperlower {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char b=sc.next().charAt(0);
        if(b>='a'&&b<='z'){
            System.out.println("lowercase");
        }else if(b>='A'||b<='Z'){
            System.out.println("uppercase");
        }else if(b>=0 &&  b<=9){
            System.out.println("digit");
        }else{
            System.out.println("special symbol");
        }
        
        }
    
}

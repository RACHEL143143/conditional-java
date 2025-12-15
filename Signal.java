import java.util.Scanner;

public class Signal {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       String a=sc.next();
       a=a.toLowerCase();
       if(a.equals("red")){
        System.out.println("STOP");
       }else if(a.equals("yellow")){
        System.out.println("READY");
       }else{
        System.out.println("GO");
       }
       
}
}

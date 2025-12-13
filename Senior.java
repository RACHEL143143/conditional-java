import java.util.Scanner;

public class Senior {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       if(a>=60){
        System.out.println("eligible");
       }else{
        System.out.println("not eligible");
       }
}
}

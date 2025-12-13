import java.util.Scanner;

public class Discount {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       double discount;
       if(a<1000){
       discount=0;
       }else if(a<5000){
        discount=a*0.10;
       }else{
        discount=a*0.20;
       }
       double bill=a-discount;
       System.out.println("bill:"+a);
       System.out.println("discount:"+discount);
       System.out.println("pay:"+bill);
}
}

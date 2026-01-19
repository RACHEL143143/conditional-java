import java.util.Scanner;

public class Acheckace {
     public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int []arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    
    }
    boolean ace=false;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(!(arr[i]<arr[j])){
                ace=false;
            }else{
                ace=true;
            }
        }
    }
    if(ace){
        System.out.println("ace");
    }else{
        System.out.println("not");
    }
}
}

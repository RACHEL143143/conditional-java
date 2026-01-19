import java.util.Scanner;

public class AduplicateArray {
      public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int []arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    
    }
    int index=0;
    int []arrn=new int[n];
    for(int i=0;i<=n;i++){
        for(int j=i+1;j<n-1;j++){
             if(arr[i]==arr[j]){
                 arrn[index++]=arr[i];
                 break;
             }else{
                arrn[index++]=arr[i];    
             }
        }
    }
    for(int i=0;i<index;i++){
        System.out.print(arrn[i]+" ");
    }
}
}

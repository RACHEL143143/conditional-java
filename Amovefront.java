import java.util.Scanner;

public class Amovefront {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int []arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=n-1;i>=0;i--){
         if(arr[i]==0){
        for(int j=i;j>0;j--){
           
                 int temp=arr[j];
                 arr[j]=arr[j-1];
                 arr[j-1]=temp;
}
        }
        }
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
}
}


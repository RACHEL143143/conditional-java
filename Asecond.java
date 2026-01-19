import java.util.Scanner;

public class Asecond {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int []arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int max=arr[0];
    int sec=arr[0];
    for(int i=1;i<n;i++){
        if(arr[i]>max){
            sec=max;
            max=arr[i];
        }
    }
    if(max>sec&&sec!=max){
        System.out.println(sec);}

    }
}

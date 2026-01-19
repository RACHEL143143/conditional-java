public class Missing {
    public static void main(String args[]){
        
        int a[]=new int[]{};
        int n=a.length;
        int sum=0;
        int b=a[n-1];
        for(int i=1;i<=b;i++){
            sum=sum+i;
        }
        for(int i=0;i<n;i++){
            sum=sum-a[i];
        }
        System.out.println("Missing number is: "+sum);
    }
}

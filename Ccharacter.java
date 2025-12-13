import java.util.Scanner;
public class Ccharacter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char b=sc.next().charAt(0);
        b=Character.toLowerCase(b);
        if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'){
            System.out.println("vowels");
        }else{
            System.out.println("consonents");
        }
    }
}

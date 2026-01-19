public class new {
    public class Student
 {
	    int rollNo;
	    String name;
	    int mark1,mark2,mark3;
	    int total;
	    double average;
	   Student(){
	        rollNo=0;
	        name="";
	        mark1=mark2=mark3=0;
	        total=0;
	        average=0.0;
	    }
		void input(){
		    java.util.Scanner sc=new java.util.Scanner(System.in);
		    
		    System.out.println("Enter roll no:");
		    rollNo=sc.nextInt();
		    System.out.println("Enter name:");
		    name=sc.nextLine();
		    System.out.println("Enter mark1:");
		    mark1=sc.nextInt();
		    System.out.println("Enter mark2:");
		    mark2=sc.nextInt();
		    System.out.println("Enter mark3:");
		    mark3=sc.nextInt();
		    }
		    void calculate(){
		        total=mark1+mark2+mark3;
		        average=total/3.0;
		    }
		    void display(){
		        System.out.println("\n___ STUDENT DETAILS");
		        System.out.println("rollno:"+rollNo);
		        System.out.println("name:"+name);
		        System.out.println("total:"+total);
		        System.out.println("average:"+average);
		        
		    }
		    public static void main(String args[]){
		        Student s=new Student();
		        s.input();
		        s.calculate();
		        s.display();
		    }
	}

}

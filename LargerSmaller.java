import java.util.Scanner;
class LargerSmaller{
          public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the three numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		//larger among the three
		 if (n1>n2) {
		 	   if (n1>n3) {
		         System.out.println(n1+"is larger");
		 	   }else{
		         System.out.println(n3+"is larger");
               }
		 }else{
		 if (n2>n3){
		         System.out.println(n2+" is larger");
		 	   }else{
		           System.out.println(n3+"is larger");
		         }
		     }    
		//Smaller among the three
		    if (n1<n2) 
		       {
		 	     if (n1<n3) {
		              System.out.println(n1+" is Smaller");
		 	        }else{
		              System.out.println(n3+" is Smaller");
                   }
		       }
		 else {
		 	if(n2<n3){
		         System.out.println(n2+"is Smaller");
		 	   }else{
		           System.out.println(n3+"is Smaller");
		         }      
		       }  
	}
}
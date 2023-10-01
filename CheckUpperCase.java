import java.util.Scanner;
class CheckUpperCase{
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Alphabet");
		char alpha=sc.next().charAt(0);
		if (alpha >=65 && alpha <=90) {
			System.out.println(alpha+"UpperCase Alphabet");
		}else if(alpha >=97 && alpha <=122)
				{
					System.out.println(alpha+" LowerCase Alphabet");
				}
		else {
				System.out.println(alpha+" is not an Alphabet");
			}
	

	}
}
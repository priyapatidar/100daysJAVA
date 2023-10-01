import java.util.Scanner;
class Vowels{
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Alphabet");
		char alpha=sc.next().charAt(0);
		if (alpha >=65 && alpha <=122) {
			System.out.println(alpha+"is a Alphabet");
		}else{
			System.out.println(alpha+"is not a Alphabet")
		}
	

	}
}
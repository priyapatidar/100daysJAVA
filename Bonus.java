import java.util.Scanner;
class Bonus{
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Salary");
		double salary=sc.nextDouble();
		System.out.println("Enter the Year");
		int year=sc.nextInt();
		double bonus;
		if (year > 5) {
			bonus=(5*salary)/100;
			System.out.println("net bonus "+bonus);
		}
	}
}
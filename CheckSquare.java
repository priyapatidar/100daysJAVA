import java.util.Scanner;
class CheckSquare{
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first side");
		int side1=sc.nextInt();
		System.out.println("Enter the second side");
		int side2=sc.nextInt();
		System.out.println("Enter the third side");
		int side3=sc.nextInt();
		System.out.println("Enter the third side");
		int side4=sc.nextInt();
		if (side1==side2 && side2==side3 && side3==side4) {
			System.out.println("It is a Square");
		}else{
			System.out.println("Its not a Square");
		}
	}
}
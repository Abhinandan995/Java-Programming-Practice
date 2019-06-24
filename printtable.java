// To print a particular Table
import java.util.Scanner;
class printtable {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Particular Table You Need");
		int n = sc.nextInt();
		System.out.println("Enter the Table Upto Value");
		int m = sc.nextInt();
		for(int i = 1;i<=m;i++)
		{
			System.out.println(n+" * "+i +" = "+n*i);
		}
	}

}

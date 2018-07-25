package practicejava;
import java.util.Scanner;
class pksoft {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Double x;
		int ans=0;
		System.out.println("Please enter your total CGPA in SEE exam \n");
		x = scn.nextDouble();
		/** 
		 * Making algorithm of PK SOft GPA to % Provider
		 * @author PurushottamKafle
		 *
		 */
		ans = (int) ((x+1)*20);
			System.out.println(ans+"%"+" is your total Percentage!");
		}
}

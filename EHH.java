package DecentProjects;

public class OOFLOOP {
	static int noOfSpaces = 5;
	public static void main(String[] args) {
		int additions = 0;
		for (int i = 1; i < 6; i++) {
			noOfSpaces--;
			
			for (int j = noOfSpaces; j >= 0; j--) {
				System.out.print(" ");}
			for (int m = 0; m < i; m++) {
				System.out.print("*");

			}
			for(int add = 0; add < additions; add++) {
				System.out.print("*");
			}
			additions++;
			System.out.print("\n");
		
		}
 }
}

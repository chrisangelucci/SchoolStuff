package DecentProjects;

public class nestedForLoops {
	 
	public static void main(String[] args) {
		int frickBro = 1;
		for (int i = 1; i < 6; i++) {
			for (int m = 0; m < i; m++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		for (int i = 5; i > 0; i--) {
			for (int m = 0; m < i; m++) {
				System.out.print("*");
			}
			System.out.print("\n");
	 }
		for (int i = 1; i < 6; i++) {
			for (int m = 0; m < i; m++) {
				System.out.print(m+1);
			}
			System.out.print("\n");
		}
		for (int i = 5; i > 0; i--) {
			for (int m = 0; m < i; m++) {
				System.out.print(m+1);
			}
			System.out.print("\n");
	 }
		for (int i = 1; i < 6; i++) {
			for (int m = 0; m < i; m++) {
				System.out.print(frickBro);
				frickBro++;
			}
			System.out.print("\n");
		}
	}
}

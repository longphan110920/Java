import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so:");
		n = scanner.nextInt();
		if(n%2==0) {
			System.out.println("So chan");
		}else {
			System.out.println("So le");
		}
		
	}

}

import java.util.Scanner;

public class bai5 {
	public static void main(String[] args) {
		int songuyen;
		int tong=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so nguyen:");
		do {
			songuyen = scanner.nextInt();
			tong = tong + songuyen;
			if(tong>100) {
				break;
			}
		}while(songuyen>0);
		System.out.println("Tong = " + tong);
	}

}
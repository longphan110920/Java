import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		float a,b;
		float tong;
		float hieu;
		float tich;
		float thuong;
		float du;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so nguyen a:");
		a = scanner.nextInt();
		System.out.println("Nhap so nguyen b:");
		b = scanner.nextInt();
		tong = a + b;
		hieu = a - b;
		tich = a * b;
		thuong = a / b;
		du = a % b;
		System.out.println("Tong =" + tong);
		System.out.println("Hieu =" + hieu);
		System.out.println("Tich =" + tich);
		System.out.println("Thuong =" + thuong);
		System.out.println("Du =" + du);
	}

}
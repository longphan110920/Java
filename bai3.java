import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		int n, tuoi;
		String ten;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten:");
		ten = scanner.next();
		System.out.println("Nhap nam sinh:");
		n = scanner.nextInt();
		tuoi = 2021 - n;
		System.out.println("Tuoi:" + tuoi);
		if(tuoi>0 && tuoi<18) {
			System.out.println("Vi thanh nien");
		}else if(tuoi>18 && tuoi<30) {
			System.out.println("Truong thanh");
		}else if(tuoi>30 &&  tuoi<50) {
			System.out.println("Trung nien");
		}else {
			System.out.println("Gia");
		}
	}

}

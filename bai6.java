  
import java.util.Scanner;
public class bai6 {
	public static void main(String[] agrs) {
		int n, temp = 1;
        long gt = 1;
        Scanner scanner = new Scanner(System.in);
        do {
        System.out.println("Nhap n: ");
        n = scanner.nextInt();
        } while ((n <= 0) || (n > 10));
        while (temp <= n) {
            gt *= temp;
            temp++;
        }
         
        System.out.println(n + "! = " + gt);
	}
}
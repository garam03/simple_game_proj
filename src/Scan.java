import java.util.Scanner;
public class Scan {
	
	Scanner scan = new Scanner(System.in);
	
	public int Scan(int scani) {//���� �Է�
		scani = scan.nextInt();
		return scani;
	}
	public String Scan(String scans) {//���ڿ� �Է�
		scans = scan.next();
		return scans;
	}
}

import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int count = countNumberRetest(scan);
        System.out.println("Số lần thi lại: " + count);
	}
	
	public static int countNumberRetest(Scanner scan) {
		int count = 0;
		float score = 0;
		while (score < 5) {
			System.out.println("Nhập điểm thi của bạn: ");
			score = Float.parseFloat(scan.nextLine());
		    if(score < 5) {
		    	count++;
		    } else {
		    	System.out.println("Chúc mừng bạn đã thi đậu.");
		    }
		}
		return count;
	}

}

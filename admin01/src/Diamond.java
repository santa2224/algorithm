import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 번호 받아오기
		System.out.println("임의의 홀수입력(1~49)= ");
		int num = scan.nextInt();
		
		// 증가되는 삼각형
		// i = 세로줄의 개수
		for (int i=1; i<=num;i++) {
			// j =줄마다의 별 개수
			System.out.print("");
			//가로줄
			for( int j=1; j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}
		//감소되는 삼각형
		for (int i=num; i<num;i++) {
			for (int j=num;j<num;j--) {
				System.out.print("*");		
			}System.out.println();
		}
		
	}
		
		



}

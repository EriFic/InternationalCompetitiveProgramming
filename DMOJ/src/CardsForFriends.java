import java.util.Scanner;

public class CardsForFriends {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = 0;
		t = input.nextInt();
		for(int i=0;i<t;i++) {
			int w=0;
			int h=0;
			int n=0;
			int counter = 1;
			int[] data = new int[3];
			for(int a=0;a<=2;a++) {
				data[a] = input.nextInt();
				//System.out.println("abc");
			}
			w = data[0];
			h = data[1];
			n = data[2];
			while (w % 2 == 0 ||h % 2 == 0){
				if (w % 2 == 0) {
					w = w/2;
					counter = counter*2;
				} else if (h % 2 == 0) {
					h = h/2;
					counter = counter*2;
				} else {
					System.out.println("abc");
				}
			} 
			
			if (counter >= n) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}

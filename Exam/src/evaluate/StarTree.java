package evaluate;

public class StarTree {
	public static void main(String[] args) {
		int floorCnt = 4;
		
		for(int i=1; i<=floorCnt; i++) {
			for(int j=floorCnt-i; j>0; j--) {
				System.out.print("☆");
			}
			for(int k=1; k<=i*2-1; k++) {
				System.out.print("★");
			}
			for(int l=floorCnt-i; l>0; l--) {
				System.out.print("☆");
			}
			System.out.println();
		}
	}
}

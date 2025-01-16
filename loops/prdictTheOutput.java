package loops;

public class prdictTheOutput {

	public static void main(String[] args) {
//		int i;
//		while(i=10) {
//			System.out.println();
//		}
		
//		int i = 10;
//		while(i=20)
//		System.out.println("A computer buff!");
		
		int x=4, y=0;
		while(x>=0) {
			x--;
			y++;
			if(x==y) {
				continue;
			}else {
				System.out.println(x + " " + y);
			}
		}
	}
	
}

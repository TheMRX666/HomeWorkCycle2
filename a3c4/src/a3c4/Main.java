package a3c4;

public class Main {

	private static int counter(int i, int j) {
		int h1 =i/10;
		int h2 =i%10;
		int m1 =j/10;
		int m2 =j%10;
		
		if(h1 == m2 && h2 == m1) {
			return 1;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int count = 0;
		int legetive = 0;
		for(int i = 0; i <= 24; i++) {
			for(int j = 0; j <= 60; j++) {
				legetive = counter(i, j);
				if(legetive == 1) {
					count +=1;
				} 
			}
		}
		System.out.printf("Result is: %s", count);
	}
	
}

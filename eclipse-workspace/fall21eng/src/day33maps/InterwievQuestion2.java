package day33maps;

public class InterwievQuestion2 {

	public static void main(String[] args) {
		int numOfRows=5;
		int k=0;
		
		for(int i=1; i<=numOfRows;i++,k=0) {
			for (int space=1; space<=numOfRows-i; space++) {
				System.out.print("  ");
			}
			while(k!=2*i-1) {
				System.out.print("* ");
				k++;
				
			}


		System.out.println();
		}
			

	}

}

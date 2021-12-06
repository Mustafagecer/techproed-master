package day33maps;

public class Intw3 {

	public static void main(String[] args) {
		int numOfRows=5;
		int k=0;
		
		for(int i=numOfRows; i>0;i--,k=0) {
			for (int space=1; space<=numOfRows-i; space++) {
				System.out.print("  ");
			}
			while(k!=2*i-1) {
				System.out.print("* ");
				k++;
				
			}


		System.out.println();
		}
		
		
		int k1=0;
		
		for(int i=2; i<=numOfRows;i++,k1=0) {
			for (int space=1; space<=numOfRows-i; space++) {
				System.out.print("  ");
			}
			while(k1!=2*i-1) {
				System.out.print("* ");
				k1++;
				
			}


		System.out.println();
		}
			
			
	}

}

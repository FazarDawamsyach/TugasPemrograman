import java.util.Scanner;
	public class Tugasmodul6 {
		public static void main(String args []) {
			Scanner masuk = new Scanner(System.in);
			int data,x;
			double jumlah,rata,input;
			System.out.print("Banyaknya data : ");
			data = masuk.nextInt();
			x = 1;
			jumlah = 0;
			input = 0;
			do {
				System.out.print("Data ke-"+x+" : ");
					input =masuk.nextInt();
					jumlah+=input;
					x++;
			
			}
			while (x<=data);
			rata =jumlah/data;
			System.out.print("Rata-ratanya adalah : "+rata);
	}
	}
	
	
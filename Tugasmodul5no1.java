import java.util.Scanner;
public class Tugasmodul5no1
{
	public static void main(String args[])
	{
		Scanner masuk = new Scanner(System.in);
		int data,x,ke;
		double jumlah,datake,rata2;
		System.out.print("Banyaknya data : ");
		data = masuk.nextInt();
		jumlah = 0;
		datake = 0;
		x =1;
		ke = 1;
		while (x<=data){
			System.out.print("data ke-"+ke+ " : ");
			datake = masuk.nextDouble();
			jumlah+=datake;
			x++;ke++;
			
		}
			rata2 = jumlah/data;
		System.out.println("rata rata : " +rata2);
		System.out.println("jumlah  : " +jumlah);
	}
}


import java.util.Scanner;
public class Tugasmodul5no2 {
public static void main(String args []){
	Scanner masuk = new Scanner(System.in);
	int data,x,min,max,nilai;
	x = 0;
	min = 0;max=0;
	System.out.print("Banyak data : ");
	data = masuk.nextInt();
	while (x<data) {
		x++;
		System.out.print("data ke-"+x+" : ");
		nilai = masuk.nextInt();
		if (x==1) {
			min = nilai; max = nilai;
		}
		else if (nilai<min) {
			min = nilai;
		}
		else if (nilai>max) {
			max = nilai;
		}	
					}
		System.out.println("nilai max adalah : "+max);
		System.out.println("nilai min adalah : "+min);

}

}


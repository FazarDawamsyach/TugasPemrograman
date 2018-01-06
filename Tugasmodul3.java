import java.util.Scanner;
public class Tugasmodul3 {
public static void main(String args[]){

Scanner masuk = new Scanner(System.in);
System.out.print("Masukkan nilai a : ");
int a = masuk.nextInt();
System.out.print("Masukkan nilai b : ");
int b = masuk.nextInt();
System.out.print("Masukkan nilai c : ");
int c = masuk.nextInt();

 int D = b*b-(4*a*c);
 if (D==0)
	 System.out.println("Akar Kembar");
 else if (D>0)
		System.out.println("Akar beda");
 else if  (D<0)
	 System.out.println("Akar Imajiner");
}
}
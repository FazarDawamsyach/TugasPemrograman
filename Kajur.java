import java.util.Scanner;

 public class Kajur {
	public static void main(String args []) {
	
	Scanner input = new Scanner(System.in);
	String namafakultas;
	System.out.print("Nama Fakultas : ");
	namafakultas = input.nextLine();
	
	String mtk = ("Drs.Helmi,M.Si.");
	String fisika = ("Boni Pahlanop Lapanporo,S.Si.,M.Cs.");
	String kimia = ("Dr.Andi Hairil Alimuddin,M.Si.");
	String biologi = ("Riza Linda,S.Si.,M.Si.");
	String siskom = ("Dedy Triyanto,ST,.MT.");
	String laut = ("Nora Idiawati,S.Si.,M.Si.");
	String sisfo = ("Ilhamsyah,S.Si.,M.Cs.");

	System.out.println("Daftar Nama Ketua Jurusan FMIPA");
	System.out.println("*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*");
	System.out.println("Ketua jurusan Matematika       = " + mtk);
	System.out.println("Ketua jurusan Fisika           = " + fisika);
	System.out.println("Ketua jurusan Kimia            = " + kimia);
	System.out.println("Ketua jurusan Biologi          = " + biologi);
	System.out.println("Ketua jurusan Sistem Komputer  = " + siskom);
	System.out.println("Ketua jurusan Ilmu Kelautan    = " + laut);
	System.out.println("Ketua jurusan Sistem Informasi = " + sisfo);

	}
}
class Siswa2{
	String nama;
	String nim;
	
	void isiData(String nama,String nim){
	this.nama =nama;
	this.nim = nim;
}
public static void main (String [] args) {
	Siswa2 mahasiswa = new Siswa2();
	
	mahasiswa.isiData("Fazar","H1051171035");
	
	System.out.println("Nama : " + mahasiswa.nama);
	System.out.println("Nim : " + mahasiswa.nim);
}
}


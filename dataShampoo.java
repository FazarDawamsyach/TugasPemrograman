class Shampoo {
	private String namamerek;
	private String warna;
	private int netto;
	
	public Shampoo (String nm , String war , int nett)
	{	this.namamerek = nm;
		this.warna = war;
		this.netto = nett;
	}
	public void munculkandata()
	{System.out.println("data shampoo");
	System.out.println("merek shampoo : "+this.namamerek);
	System.out.println("warna shampoo : "+this.warna);
	System.out.println("berat bersih : " +this.netto);
	System.out.println("");
	System.out.println("");
	}
}
	public class dataShampoo {
	public static void main (String args []){
		Shampoo sham1=new Shampoo("Clear","hijau menthol",250);
		sham1.munculkandata();
	}
}



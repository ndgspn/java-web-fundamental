package training.internet.banking;

public class Nasabah {
	public static Integer jumlahNasabah = 0;
	private String nomor;
	private String nama;
	private String email;

	public Nasabah() {
		jumlahNasabah = jumlahNasabah + 1;
	}
	
	// getter setter
	

	public String getNama() {
		System.out.println(nama + " adalah nasabah ke-"+jumlahNasabah);
		return nama;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public String getNomor() {
		return nomor;
	}
	
	public void setNomor(String nomor) {
		this.nomor = nomor;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public static void tampilkanJumlahNasabah() {
		System.out.println("Jumlah nasabah saat ini adalah: "+ jumlahNasabah);
		//System.out.println("Nasabah terbaru adalah " + nama);
	}


}

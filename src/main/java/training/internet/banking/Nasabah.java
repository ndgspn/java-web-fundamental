package training.internet.banking;

public class Nasabah {
	// public static integer jumlahNasabah = 0
	// variable nomor, nama, email
	// constructor Nasabah jumlahNasabah
	// getter setter
	// tampilkan jumlah nasabah
	
	public static Integer jumlahNasabah = 0;
	private String nomor;
	private String nama;
	private String email;
	
	public Nasabah() {
		jumlahNasabah = jumlahNasabah + 1;
	}
	
	public String getNomor() {
		return nomor;
	}
	
	public String getNama() {
		return nama;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setNomor(String nomor) {
		this.nomor = nomor;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public static void tampilkanJumlahNasabah() {
		System.out.println("Jumlah Nasabah : "+jumlahNasabah);
	}
}

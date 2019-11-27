package belajar.java.fundamental.hari1;

import java.util.Date;

import training.internet.banking.Nasabah;

public class Halo {
	
	private Date waktu = new Date();
	
	public void sapa(String nama) {
		System.out.println("Halo " + nama);
	}
	
	public void tampilkanWaktu() {
		System.out.println("Waktu hari ini: " + waktu);
	}
	
	public static void main(String[] xxx) {
		System.out.println("Ini method main");
		System.out.println("Jumlah nasabah: " + Nasabah.jumlahNasabah);

		Nasabah.tampilkanJumlahNasabah();
		Nasabah nasabah = new Nasabah();
		nasabah.setNama("Nandang");
		System.out.println("Nama nasabah: " + nasabah.getNama());
		System.out.println("Jumlah nasabah: " + Nasabah.jumlahNasabah);
		
		Nasabah nasabah2 = new Nasabah();
		nasabah2.setNama("Ayu");
		System.out.println("Nama nasabah: " + nasabah2.getNama());
		System.out.println("Jumlah nasabah: " + Nasabah.jumlahNasabah);
		
		Kalkulator kalkulator = new Kalkulator();
		System.out.println("Hasil dari 2.5 + 2.5 adalah: " + kalkulator.tambah(2.5, 2.5));
		
		Kalkulator perkalian = new Kalkulator();
		System.out.println("5 x 5 = " + perkalian.kali(7.5, 15.0));
	}

}

package belajar.java.fundamental.hari1;

import java.io.IOException;

import training.internet.banking.helper.NasabahFileImporter;

public class DemoBacaFile {
	public static void main(String [] args) {
		NasabahFileImporter nasabahfileimporter = new NasabahFileImporter("src/main/resources/daftar-nasabah.txt");
		try {
			nasabahfileimporter.process();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

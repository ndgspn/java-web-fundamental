package training.internet.banking.helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import training.internet.banking.Nasabah;

public class NasabahFileImporter {
	private File inputFile;
	private BufferedReader fileReader;
	
	public NasabahFileImporter(String inputFile) {
		this.inputFile = new File(inputFile);
	}
	
	private void openFile() throws FileNotFoundException {
		if(!inputFile.exists()) {
			throw new FileNotFoundException("File not found!");
		}
		
		fileReader = new BufferedReader(new FileReader(inputFile));
	}
	
	private void closeFile() throws IOException {
		if(fileReader != null) {
			fileReader.close();
		}
	}
	
	public List<Nasabah> process() throws IOException {
		openFile();
		
		String data = fileReader.readLine();
		System.out.println("Header : "+data);
		
		while(data != null) {
			data = fileReader.readLine();
			System.out.println("Data: "+data);
		}
		
		closeFile();
		return null;
	}
}

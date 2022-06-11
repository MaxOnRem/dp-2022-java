package crud;

import fileIO.FileIO;
import fileIO.FileIOInterface;
import laptops.Laptops;

public class FileCrud implements CrudInterface {
	
	FileIOInterface fio;
	
	public FileCrud() {
		this.fio = new FileIO();
	}

	@Override
	public Laptops readLaptops() {
		// TODO Auto-generated method stub
		return (Laptops) fio.loadFromFile();
	}

	@Override
	public void updateLaptops(Laptops laptops) {
		// TODO Auto-generated method stub
		fio.saveToFile(laptops);
	}

}
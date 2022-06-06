package fileIO;

import table.Table;

public class Main {

	public static void main(String[] args) {
		
		Table table = new Table("Mock1", 5, 2.6f);
		
		FileIOInterface fio = new FileIO();
		
		fio.saveToFile(table);
		
		System.out.println((Table)fio.loadromFile());
	}

}

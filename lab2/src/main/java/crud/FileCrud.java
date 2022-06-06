package crud;

import fileIO.FileIO;
import fileIO.FileIOInterface;
import table.Table;

public class FileCrud implements Lab2CrudInterface {
	
	FileIOInterface fio;
	
	public FileCrud() {
		this.fio = new FileIO();
	}

	@Override
	public Table readTable() {
		// TODO Auto-generated method stub
		return (Table)fio.loadromFile();
	}

	@Override
	public void updateTable(Table table) {
		fio.saveToFile(table);

	}

}

package mock;

import crud.Lab2CrudInterface;
import table.Table;

public class Lab2CrudMock implements Lab2CrudInterface {

	@Override
	public Table readTable() {
		// TODO Auto-generated method stub
		return new Table("Mock1", 5, 2.6f);
	}

	@Override
	public void updateTable(Table table) {
		// TODO Auto-generated method stub

	}

}

package com.vanenburgdemo.exapp.base.model;
import com.vs.rappit.base.model.BaseModel;
import com.vs.rappit.base.annotations.Table;
import com.vs.rappit.base.annotations.Searchable;


@Table(name="ExportTable", keys={"sid"})
public class ExportTableBase extends BaseModel {

	@Searchable(index = true)
	private String table1;
	@Searchable(index = true)
	private String name;
	@Searchable(index = true)
	private String department;
	@Searchable(index = true)
	private String sequence;

	public void setTable1(String table1) {
		this.table1 = table1;
	}

	public String getTable1() {
		return table1;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public String getSequence() {
		return sequence;
	}



}
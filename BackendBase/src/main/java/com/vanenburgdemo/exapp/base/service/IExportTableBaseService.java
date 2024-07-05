package com.vanenburgdemo.exapp.base.service;

import com.vs.rappit.base.logic.ICRUDOperation;
import com.vanenburgdemo.exapp.base.model.ExportTableBase;


public interface IExportTableBaseService<T extends ExportTableBase> extends ICRUDOperation<T>{
	public T getByName(String name);

	
}
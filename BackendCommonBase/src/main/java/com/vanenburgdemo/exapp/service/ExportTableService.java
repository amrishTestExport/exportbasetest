package com.vanenburgdemo.exapp.service;

import com.vs.rappit.base.acl.IPerimeterManager;
import com.vanenburgdemo.exapp.base.service.ExportTableBaseService;
import com.vanenburgdemo.exapp.model.ExportTable;
import com.vanenburgdemo.exapp.service.ExportTablePerimeterImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service("ExportTable")
public class ExportTableService extends ExportTableBaseService<ExportTable> implements IExportTableService<ExportTable>{

		@Autowired
		private  ExportTablePerimeterImpl  exporttablePerimeterImpl;

		public ExportTableService(ChangelogService changelogService) {
		super(ExportTable.class);	
		setChangelogService(changelogService); 
		
	}
	
}
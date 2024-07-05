package com.vanenburgdemo.exapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import com.vs.rappit.base.logger.Logger;
import com.vs.rappit.base.logger.LoggerFactory;
import org.springframework.http.ResponseEntity;
import com.vs.rappit.base.factory.InstanceFactory;
import com.vanenburgdemo.exapp.base.controller.ExportTableBaseController;
import com.vanenburgdemo.exapp.service.IExportTableService;
import com.vanenburgdemo.exapp.service.ExportTableService;
import com.vanenburgdemo.exapp.model.ExportTable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "rest/exporttables/", produces = "application/json")
public class ExportTableController extends ExportTableBaseController<IExportTableService<ExportTable>, ExportTable> {
	private static final Logger LOGGER = LoggerFactory.getLogger(ExportTableController.class.getName());
	public ExportTableController(ExportTableService exporttableService) {
		super(exporttableService);
	}
}

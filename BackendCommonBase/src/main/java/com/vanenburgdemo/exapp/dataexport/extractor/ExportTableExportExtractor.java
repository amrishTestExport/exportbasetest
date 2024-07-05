package com.vanenburgdemo.exapp.dataexport.extractor;

import com.vs.rappit.base.logger.Logger;
import com.vs.rappit.base.logger.LoggerFactory;
import com.vanenburgdemo.exapp.base.model.ExportTableAnalyticalBase;
import com.vanenburgdemo.exapp.base.dataexport.extractor.ExportTableBaseExportExtractor;
import com.vanenburgdemo.exapp.dataexport.extractor.ExportTableAnalyticalExtractorService;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Scope;

@Service
@Scope(value = "prototype")
public class ExportTableExportExtractor extends ExportTableBaseExportExtractor<ExportTableAnalyticalExtractorService, ExportTableAnalyticalBase> {

	private Logger LOGGER = LoggerFactory.getLogger(ExportTableExportExtractor.class);
	
	public ExportTableExportExtractor(ExportTableAnalyticalExtractorService logic) {
		super(true, logic);
	}

	
}

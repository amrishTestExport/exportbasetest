package com.vanenburgdemo.exapp.dataexport.extractor;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.vs.rappit.base.logger.Logger;
import com.vs.rappit.base.logger.LoggerFactory;
import com.vanenburgdemo.exapp.base.model.ExportTableAnalyticalBase;
import com.vanenburgdemo.exapp.base.dataexport.extractor.ExportTableBaseAnalyticalExtractorService;
import com.vs.rappit.base.listener.BaseApplicationConfiguration;

@Component
@Scope(value = "prototype")
public class ExportTableAnalyticalExtractorService extends ExportTableBaseAnalyticalExtractorService<ExportTableAnalyticalBase> {
	private Logger LOGGER = LoggerFactory.getLogger(ExportTableAnalyticalExtractorService.class);
	
	public ExportTableAnalyticalExtractorService(BaseApplicationConfiguration baseApplicationConfiguration) {
		super(ExportTableAnalyticalBase.class, baseApplicationConfiguration);
	}
}

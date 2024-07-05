package com.vanenburgdemo.exapp.base.service;

import com.vs.rappit.base.model.IModelTransformer;
import com.vanenburgdemo.exapp.base.model.ExportTableBase;
import com.vanenburgdemo.exapp.base.model.ExportTableAnalyticalBase;
import com.vs.rappit.base.util.Configuration;
import java.util.stream.Collectors;

public class ExportTableAnalyticalTransformer<T extends ExportTableBase, M extends ExportTableAnalyticalBase>
		implements IModelTransformer<T, M> {
	private static final String SEPARATOR = "#@$%!*&";
	@Override
	public M writeTo(T model) {
		ExportTableAnalyticalBase exportTableAnalyticalBase = new ExportTableAnalyticalBase();
			exportTableAnalyticalBase.setTable1(model.getTable1());
	exportTableAnalyticalBase.setName(model.getName());
	exportTableAnalyticalBase.setDepartment(model.getDepartment());
	exportTableAnalyticalBase.setSequence(model.getSequence());
		exportTableAnalyticalBase.setSid(model.getSid());
		return (M) exportTableAnalyticalBase;
	}

	@Override
	public Object readFrom(M data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<T> getSourceClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<M> getTargetClass() {
		// TODO Auto-generated method stub
		return null;
	}

}

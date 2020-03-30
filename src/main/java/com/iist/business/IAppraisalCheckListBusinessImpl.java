package com.iist.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.iist.dao.IAppraisalChecklistDAO;
import com.iist.dto.IAppraisalChecklistDTO;


public class IAppraisalCheckListBusinessImpl implements IAppraisalCheckListBusiness {
	
	@Autowired
	private IAppraisalChecklistDAO iAppraisalChecklistDAO;

	@Override
	public List<IAppraisalChecklistDTO> getList() {
		return iAppraisalChecklistDAO.getList();
	}

}

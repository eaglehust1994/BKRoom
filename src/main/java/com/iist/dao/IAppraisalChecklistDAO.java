package com.iist.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.iist.dto.IAppraisalChecklistDTO;

public class IAppraisalChecklistDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public List<IAppraisalChecklistDTO> getList(){
		List<IAppraisalChecklistDTO> list = sessionFactory.getCurrentSession().createQuery("from I_APPRAISAL_CHECKLIST ").list();
		return list;
	}

}

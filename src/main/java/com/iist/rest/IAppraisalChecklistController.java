package com.iist.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iist.business.IAppraisalCheckListBusinessImpl;
import com.iist.dto.IAppraisalChecklistDTO;

@RestController
public class IAppraisalChecklistController {
	@Autowired
	private IAppraisalCheckListBusinessImpl iAppraisalCheckListBusinessImpl;
	
	@GetMapping("api/list")
	public ResponseEntity<List<IAppraisalChecklistDTO>> getList(){
		List<IAppraisalChecklistDTO> list = iAppraisalCheckListBusinessImpl.getList();
		return ResponseEntity.ok().body(list);
		
	}
	
}

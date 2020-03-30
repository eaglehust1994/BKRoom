package com.iist.dto;

import java.util.Date;

import com.iist.base.BaseFwDTOImpl;
import com.iist.bo.IAppraisalChecklistBO;

public class IAppraisalChecklistDTO extends BaseFwDTOImpl<IAppraisalChecklistBO> {
	
    private Long appraisalChecklistConfigId;
    private String content;
    private Long orderNumber;
    private Date createdDate;
    private Long createdBy;
    private Date startTime;
    private Date endTime;
    private Date updatedDate;
    private Long updatedBy;
    private String processType;
    private String description;
    private Long status;
    private Long appraisalGroup;
    
    
    
	
	 public Long getAppraisalChecklistConfigId() {
		return appraisalChecklistConfigId;
	}




	public void setAppraisalChecklistConfigId(Long appraisalChecklistConfigId) {
		this.appraisalChecklistConfigId = appraisalChecklistConfigId;
	}




	public String getContent() {
		return content;
	}




	public void setContent(String content) {
		this.content = content;
	}




	public Long getOrderNumber() {
		return orderNumber;
	}




	public void setOrderNumber(Long orderNumber) {
		this.orderNumber = orderNumber;
	}




	public Date getCreatedDate() {
		return createdDate;
	}




	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}




	public Long getCreatedBy() {
		return createdBy;
	}




	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}




	public Date getStartTime() {
		return startTime;
	}




	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}




	public Date getEndTime() {
		return endTime;
	}




	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}




	public Date getUpdatedDate() {
		return updatedDate;
	}




	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}




	public Long getUpdatedBy() {
		return updatedBy;
	}




	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}




	public String getProcessType() {
		return processType;
	}




	public void setProcessType(String processType) {
		this.processType = processType;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public Long getStatus() {
		return status;
	}




	public void setStatus(Long status) {
		this.status = status;
	}




	public Long getAppraisalGroup() {
		return appraisalGroup;
	}




	public void setAppraisalGroup(Long appraisalGroup) {
		this.appraisalGroup = appraisalGroup;
	}

		@Override
	    public Long getFWModelId() {
	       return appraisalChecklistConfigId;
	   }
	  
	   @Override
	   public String catchName() {
	       return getAppraisalChecklistConfigId().toString();
	   }


	@Override
	    public IAppraisalChecklistBO toModel(){
	        IAppraisalChecklistBO appraisalChecklistBO = new IAppraisalChecklistBO();
	        appraisalChecklistBO.setAppraisalChecklistConfigId(this.appraisalChecklistConfigId);
	        appraisalChecklistBO.setContent(this.content);
	        appraisalChecklistBO.setOrderNumber(this.orderNumber);
	        appraisalChecklistBO.setCreatedDate(this.createdDate);
	        appraisalChecklistBO.setCreatedBy(this.createdBy);
	        appraisalChecklistBO.setStartTime(this.startTime);
	        appraisalChecklistBO.setEndTime(this.endTime);
	        appraisalChecklistBO.setUpdatedBy(this.updatedBy);
	        appraisalChecklistBO.setUpdatedDate(this.updatedDate);
	        appraisalChecklistBO.setProcessType(this.processType);
	        appraisalChecklistBO.setDescription(this.description);
	        appraisalChecklistBO.setStatus(this.status);
	        appraisalChecklistBO.setAppraisalGroup(this.appraisalGroup);
	        return appraisalChecklistBO;
	    }
}

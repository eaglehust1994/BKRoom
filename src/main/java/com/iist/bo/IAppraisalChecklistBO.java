package com.iist.bo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.iist.base.BaseFwModelImpl;
import com.iist.dto.IAppraisalChecklistDTO;


@Entity
@Table(name="I_APPRAISAL_CHECKLIST")
public class IAppraisalChecklistBO  extends BaseFwModelImpl{

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
    
    public IAppraisalChecklistBO() {
        setColId("appraisalChecklistConfigId");
        setColName("appraisalChecklistConfigId");
        setUniqueColumn(new String[]{"appraisalChecklistConfigId"});
    }
    @Id
    @GeneratedValue(generator = "sequence")
    @GenericGenerator(name = "sequence", strategy = "sequence",
            parameters = {
                @Parameter(name = "sequence", value = "I_APPRAISAL_CHECKLIST_SEQ")
            }
    )
 
    @Column(name = "APPRAISAL_CHECKLIST_CONFIG_ID", length = 10)
    public Long getAppraisalChecklistConfigId() {
        return appraisalChecklistConfigId;
    }

    public void setAppraisalChecklistConfigId(Long appraisalChecklistConfigId) {
        this.appraisalChecklistConfigId = appraisalChecklistConfigId;
    }
    @Column(name = "CONTENT" , length = 2000)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    @Column(name = "ORDER_NUMBER" , length = 10)
    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }
    @Column(name = "CREATED_DATE" , length = 10)
    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    @Column(name = "CREATED_BY" , length = 10)
    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }
    @Column(name = "START_TIME" , length = 10)
    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    @Column(name = "END_TIME" , length = 10)
    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    @Column(name = "UPDATED_DATE" , length = 10)
    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
    @Column(name = "UPDATED_BY" , length = 10)
    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }
     @Column(name = "PROCESS_TYPE" , length = 10)
    public String getProcessType() {
        return processType;
    }

    public void setProcessType(String processType) {
        this.processType = processType;
    }
    @Column(name = "DESCRIPTION" , length = 10)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    @Column(name = "STATUS" , length = 1)
    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    @Column(name = "APPRAISAL_GROUP", length = 10)
    public Long getAppraisalGroup() {
        return appraisalGroup;
    }

    public void setAppraisalGroup(Long appraisalGroup) {
        this.appraisalGroup = appraisalGroup;
    }
   	
    
    public IAppraisalChecklistDTO toDTO(){
        IAppraisalChecklistDTO appraisalChecklistDTO = new IAppraisalChecklistDTO();
        appraisalChecklistDTO.setAppraisalChecklistConfigId(this.appraisalChecklistConfigId);
        appraisalChecklistDTO.setContent(this.content);
        appraisalChecklistDTO.setOrderNumber(this.orderNumber);
        appraisalChecklistDTO.setCreatedDate(this.createdDate);
        appraisalChecklistDTO.setCreatedBy(this.createdBy);
        appraisalChecklistDTO.setStartTime(this.startTime);
        appraisalChecklistDTO.setEndTime(this.endTime);
        appraisalChecklistDTO.setUpdatedBy(this.updatedBy);
        appraisalChecklistDTO.setUpdatedDate(this.updatedDate);
        appraisalChecklistDTO.setProcessType(this.processType);
        appraisalChecklistDTO.setDescription(this.description);
        appraisalChecklistDTO.setStatus(this.status);
        appraisalChecklistDTO.setAppraisalGroup(this.appraisalGroup);
        return appraisalChecklistDTO;
    }
    
}

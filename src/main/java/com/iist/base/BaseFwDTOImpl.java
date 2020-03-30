package com.iist.base;

import java.io.Serializable;


public abstract class BaseFwDTOImpl<TBO extends BaseFwModelImpl> implements BaseFwDTO<TBO>, Serializable {
	  protected String defaultSortField = "name";
	  
	  public String getDefaultSortField() {
	    return this.defaultSortField;
	  }
	  
	  public void setDefaultSortField(String defaultSortField) {
	    this.defaultSortField = defaultSortField;
	  }
	  

	public int compareTo(BaseFwDTO o) {
	    return catchName().compareTo(o.catchName());
	  }
	}
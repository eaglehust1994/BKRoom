package com.iist.base;

@SuppressWarnings({ "rawtypes", "serial" })
public abstract class BaseFwModelImpl implements BaseFwModel{
	 private transient String colId = "ID";
	  
	  private transient String colName = "NAME";
	  
	  private transient String[] uniqueColumn = new String[0];
	  
	  public String getModelName() {
	    return getClass().getSimpleName();
	  }
	  
	  public String getColId() {
	    return this.colId;
	  }
	  
	  public void setColId(String colId) {
	    this.colId = colId;
	  }
	  
	  public String getColName() {
	    return this.colName;
	  }
	  
	  public void setColName(String colName) {
	    this.colName = colName;
	  }
	  
	  public String[] getUniqueColumn() {
	    return this.uniqueColumn;
	  }
	  
	  public void setUniqueColumn(String[] uniqueColumn) {
	    this.uniqueColumn = uniqueColumn;
	  }
}

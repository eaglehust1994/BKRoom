package com.iist.base;


public interface BaseFwDTO<TModel extends BaseFwModelImpl> extends Comparable<BaseFwDTO> {
	  TModel toModel();
	  
	  Long getFWModelId();
	  
	  String catchName();
}

package com.iist.base;


import java.io.Serializable;

@SuppressWarnings("rawtypes")
public interface BaseFwModel<TDTO extends BaseFwDTOImpl> extends Serializable {
  TDTO toDTO();
}
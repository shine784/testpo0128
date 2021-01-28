	
package com.CellDO;

import java.io.IOException;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Collections;

import com.tmax.promapper.engine.dto.record.common.FieldProperty;
import com.tmax.proobject.model.exception.FieldNotFoundException;

import com.tmax.proobject.model.dataobject.DataObject;


/****************************************************************************************************
* Copyright ⓒ TmaxSoft. All rights reserved.                                             
* (주)티맥스소프트의 사전 승인 없이 본 내용의 전부 또는 일부에 대한 복사, 배포,사용을 금합니다.   
* (주)티맥스소프트의 사전 승인 없이 소스를 변경하여 사용하는 경우                                 
* 소스에 대한 품질과 성능을 보장하지 않습니다.                                                
*                                                                                             
* If you modify this source without TmaxSoft approval.                                  
* TmaxSoft dose not guarantee the quality and performance of source.                      
***************************************************************************************************
* @since TmaxSoft                                                                                                                                   
* @author        2020-11-26 14:26:37 
**************************************************************************************************/

/**************************************************************************************************************
* 화일명 : HCGETDO.class
* 사용프로그램 : HCGETDO
* 설명 :  
**************************************************************************************************************/

@com.tmax.proobject.core.DataObject
public class HCGETDO extends DataObject {
	private static final String DTO_LOGICAL_NAME = "HCGETDO";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public HCGETDO() {
			super();
			
	}
	
	private transient boolean isModified = false;

	@Override
	public void clearAllIsModified() {
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	}
	 
	public Object clone() {
		HCGETDO copyObj = new HCGETDO();	
		copyObj.clone(this);
		return copyObj;
	}
	
	public void clone(DataObject _hCGETDO) {
		if(this == _hCGETDO) return;
		HCGETDO __hCGETDO = (HCGETDO) _hCGETDO;
		
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
		
		return buffer.toString();
	}
	
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(0);
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return Collections.unmodifiableMap(fieldPropertyMap);
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return Collections.unmodifiableMap(fieldPropertyMap);
	}	

	@SuppressWarnings("unchecked")
	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			default : throw new FieldNotFoundException(fieldName);		
		}
	}

	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		HCGETDO _HCGETDO = (HCGETDO) obj;
		return true;
	}

	@Override
	public int hashCode() {
		int prime  = 31;
		int result = 1;
		return result;
	}
	
	@Override
	public void clear() {	
		clearAllIsModified();
	}

	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}

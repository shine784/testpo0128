	
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
* @author        2020-09-23 21:28:40 
**************************************************************************************************/

/**************************************************************************************************************
* 화일명 : ROWCREATEINPUT.class
* 사용프로그램 : ROWCREATEINPUT
* 설명 :  
**************************************************************************************************************/

@com.tmax.proobject.core.DataObject
public class ROWCREATEINPUT extends DataObject {
	private static final String DTO_LOGICAL_NAME = "ROWCREATEINPUT";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public ROWCREATEINPUT() {
			super();
			
	}
	
	private transient boolean isModified = false;

	/**
	 * LogicalName : ypos
	 * Comments    : ypos
	 */		

	private int ypos = 0;
	
	private transient boolean ypos_nullable = false;
	
	public boolean isNullableYpos() {
		return this.ypos_nullable;
	}
	
	private transient boolean ypos_invalidation = false;
	
	public void setInvalidationYpos(boolean invalidation) { 
		this.ypos_invalidation = invalidation;
	}
	
	public boolean isInvalidationYpos() {
		return this.ypos_invalidation;
	}
	
	private transient boolean ypos_modified = false;
	

	public boolean isModifiedYpos() {
		return this.ypos_modified;
	}
	
	public void unModifiedYpos() {
		this.ypos_modified = false;
	}

	public FieldProperty getYposFieldProperty() {
		return fieldPropertyMap.get("ypos");
	}

	public int getYpos() {
		return ypos;
	}
	
	public void setYpos(int ypos) {
	this.ypos = ypos;
	this.ypos_modified = true;
	this.isModified = true;
	}
	public void setYpos(Integer ypos) {
		if( ypos == null) {
			this.ypos = 0;
		} else{
			this.ypos = ypos.intValue();
		}
		this.ypos_modified = true;
		this.isModified = true;
	}
	public void setYpos(String ypos) {
		if  (ypos==null || ypos.length() == 0) {
			this.ypos = 0;
		} else {
			this.ypos = Integer.parseInt(ypos);
		}
		this.ypos_modified = true;
		this.isModified = true;
	}		


	/**
	 * LogicalName : yname
	 * Comments    : yname
	 */		

	private String yname = null;
	
	private transient boolean yname_nullable = true;
	
	public boolean isNullableYname() {
		return this.yname_nullable;
	}
	
	private transient boolean yname_invalidation = false;
	
	public void setInvalidationYname(boolean invalidation) { 
		this.yname_invalidation = invalidation;
	}
	
	public boolean isInvalidationYname() {
		return this.yname_invalidation;
	}
	
	private transient boolean yname_modified = false;
	

	public boolean isModifiedYname() {
		return this.yname_modified;
	}
	
	public void unModifiedYname() {
		this.yname_modified = false;
	}

	public FieldProperty getYnameFieldProperty() {
		return fieldPropertyMap.get("yname");
	}

	public String getYname() {
		return yname;
	}
	public String getNvlYname() {
		if(getYname() == null) {
			return EMPTY_STRING;
		} else {
			return getYname();
		}
	}
	
	public void setYname(String yname) {
		if(yname == null) {
			this.yname = null;
		} else {
			this.yname = yname;
		}
		this.yname_modified = true;
		this.isModified = true;
	}		


	@Override
	public void clearAllIsModified() {
		this.ypos_modified = false;
		this.yname_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.ypos_modified == true)
			modifiedFields.add("ypos");
		if(this.yname_modified == true)
			modifiedFields.add("yname");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	}
	 
	public Object clone() {
		ROWCREATEINPUT copyObj = new ROWCREATEINPUT();	
		copyObj.clone(this);
		return copyObj;
	}
	
	public void clone(DataObject _rOWCREATEINPUT) {
		if(this == _rOWCREATEINPUT) return;
		ROWCREATEINPUT __rOWCREATEINPUT = (ROWCREATEINPUT) _rOWCREATEINPUT;
		
		this.setYpos(__rOWCREATEINPUT.getYpos());
		this.setYname(__rOWCREATEINPUT.getYname());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("ypos : ").append(ypos).append("\n");				
		buffer.append("yname : ").append(yname).append("\n");		
		return buffer.toString();
	}
	
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(2);
		fieldPropertyMap.put("ypos", FieldProperty.builder()
              .setPhysicalName("ypos")
              .setLogicalName("ypos")
              .setType(FieldProperty.TYPE_PRIMITIVE_INT)
              .setLength(10)
              .setDecimal(-1)
              .build());
		fieldPropertyMap.put("yname", FieldProperty.builder()
              .setPhysicalName("yname")
              .setLogicalName("yname")
              .setType(FieldProperty.TYPE_OBJECT_STRING)
              .setLength(10)
              .setDecimal(-1)
              .build());
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
			case "ypos" : return getYpos();
			case "yname" : return getYname();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}

	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "ypos" : setYpos((Integer)arg);break;
			case "yname" : setYname((String)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		ROWCREATEINPUT _ROWCREATEINPUT = (ROWCREATEINPUT) obj;				
		if(this.ypos != _ROWCREATEINPUT.getYpos()) return false;
		if(this.yname == null) {
			if(_ROWCREATEINPUT.getYname() != null)
				return false;
		} else if(!this.yname.equals(_ROWCREATEINPUT.getYname()))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		int prime  = 31;
		int result = 1;
		result     = prime * result + this.ypos;					
		result     = prime * result + ((this.yname == null) ? 0 : this.yname.hashCode());
		return result;
	}
	
	@Override
	public void clear() {
		ypos = 0;
		yname = null;	
		clearAllIsModified();
	}

	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}

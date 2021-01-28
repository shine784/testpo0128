	
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
* @author        2020-10-16 13:59:11 
**************************************************************************************************/

/**************************************************************************************************************
* 화일명 : ROWHEADERWIDTHDO.class
* 사용프로그램 : ROWHEADERWIDTHDO
* 설명 :  
**************************************************************************************************************/

@com.tmax.proobject.core.DataObject
public class ROWHEADERWIDTHDO extends DataObject {
	private static final String DTO_LOGICAL_NAME = "ROWHEADERWIDTHDO";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public ROWHEADERWIDTHDO() {
			super();
			
	}
	
	private transient boolean isModified = false;

	/**
	 * LogicalName : ywidth
	 * Comments    : 
	 */		

	private int ywidth = 0;
	
	private transient boolean ywidth_nullable = false;
	
	public boolean isNullableYwidth() {
		return this.ywidth_nullable;
	}
	
	private transient boolean ywidth_invalidation = false;
	
	public void setInvalidationYwidth(boolean invalidation) { 
		this.ywidth_invalidation = invalidation;
	}
	
	public boolean isInvalidationYwidth() {
		return this.ywidth_invalidation;
	}
	
	private transient boolean ywidth_modified = false;
	

	public boolean isModifiedYwidth() {
		return this.ywidth_modified;
	}
	
	public void unModifiedYwidth() {
		this.ywidth_modified = false;
	}

	public FieldProperty getYwidthFieldProperty() {
		return fieldPropertyMap.get("ywidth");
	}

	public int getYwidth() {
		return ywidth;
	}
	
	public void setYwidth(int ywidth) {
	this.ywidth = ywidth;
	this.ywidth_modified = true;
	this.isModified = true;
	}
	public void setYwidth(Integer ywidth) {
		if( ywidth == null) {
			this.ywidth = 0;
		} else{
			this.ywidth = ywidth.intValue();
		}
		this.ywidth_modified = true;
		this.isModified = true;
	}
	public void setYwidth(String ywidth) {
		if  (ywidth==null || ywidth.length() == 0) {
			this.ywidth = 0;
		} else {
			this.ywidth = Integer.parseInt(ywidth);
		}
		this.ywidth_modified = true;
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
	 * LogicalName : fromv
	 * Comments    : fromv
	 */		

	private String fromv = null;
	
	private transient boolean fromv_nullable = true;
	
	public boolean isNullableFromv() {
		return this.fromv_nullable;
	}
	
	private transient boolean fromv_invalidation = false;
	
	public void setInvalidationFromv(boolean invalidation) { 
		this.fromv_invalidation = invalidation;
	}
	
	public boolean isInvalidationFromv() {
		return this.fromv_invalidation;
	}
	
	private transient boolean fromv_modified = false;
	

	public boolean isModifiedFromv() {
		return this.fromv_modified;
	}
	
	public void unModifiedFromv() {
		this.fromv_modified = false;
	}

	public FieldProperty getFromvFieldProperty() {
		return fieldPropertyMap.get("fromv");
	}

	public String getFromv() {
		return fromv;
	}
	public String getNvlFromv() {
		if(getFromv() == null) {
			return EMPTY_STRING;
		} else {
			return getFromv();
		}
	}
	
	public void setFromv(String fromv) {
		if(fromv == null) {
			this.fromv = null;
		} else {
			this.fromv = fromv;
		}
		this.fromv_modified = true;
		this.isModified = true;
	}		


	/**
	 * LogicalName : tov
	 * Comments    : tov
	 */		

	private String tov = null;
	
	private transient boolean tov_nullable = true;
	
	public boolean isNullableTov() {
		return this.tov_nullable;
	}
	
	private transient boolean tov_invalidation = false;
	
	public void setInvalidationTov(boolean invalidation) { 
		this.tov_invalidation = invalidation;
	}
	
	public boolean isInvalidationTov() {
		return this.tov_invalidation;
	}
	
	private transient boolean tov_modified = false;
	

	public boolean isModifiedTov() {
		return this.tov_modified;
	}
	
	public void unModifiedTov() {
		this.tov_modified = false;
	}

	public FieldProperty getTovFieldProperty() {
		return fieldPropertyMap.get("tov");
	}

	public String getTov() {
		return tov;
	}
	public String getNvlTov() {
		if(getTov() == null) {
			return EMPTY_STRING;
		} else {
			return getTov();
		}
	}
	
	public void setTov(String tov) {
		if(tov == null) {
			this.tov = null;
		} else {
			this.tov = tov;
		}
		this.tov_modified = true;
		this.isModified = true;
	}		


	@Override
	public void clearAllIsModified() {
		this.ywidth_modified = false;
		this.yname_modified = false;
		this.ypos_modified = false;
		this.fromv_modified = false;
		this.tov_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.ywidth_modified == true)
			modifiedFields.add("ywidth");
		if(this.yname_modified == true)
			modifiedFields.add("yname");
		if(this.ypos_modified == true)
			modifiedFields.add("ypos");
		if(this.fromv_modified == true)
			modifiedFields.add("fromv");
		if(this.tov_modified == true)
			modifiedFields.add("tov");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	}
	 
	public Object clone() {
		ROWHEADERWIDTHDO copyObj = new ROWHEADERWIDTHDO();	
		copyObj.clone(this);
		return copyObj;
	}
	
	public void clone(DataObject _rOWHEADERWIDTHDO) {
		if(this == _rOWHEADERWIDTHDO) return;
		ROWHEADERWIDTHDO __rOWHEADERWIDTHDO = (ROWHEADERWIDTHDO) _rOWHEADERWIDTHDO;
		
		this.setYwidth(__rOWHEADERWIDTHDO.getYwidth());
		this.setYname(__rOWHEADERWIDTHDO.getYname());
		this.setYpos(__rOWHEADERWIDTHDO.getYpos());
		this.setFromv(__rOWHEADERWIDTHDO.getFromv());
		this.setTov(__rOWHEADERWIDTHDO.getTov());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("ywidth : ").append(ywidth).append("\n");				
		buffer.append("yname : ").append(yname).append("\n");				
		buffer.append("ypos : ").append(ypos).append("\n");				
		buffer.append("fromv : ").append(fromv).append("\n");				
		buffer.append("tov : ").append(tov).append("\n");		
		return buffer.toString();
	}
	
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(5);
		fieldPropertyMap.put("ywidth", FieldProperty.builder()
              .setPhysicalName("ywidth")
              .setLogicalName("ywidth")
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
		fieldPropertyMap.put("ypos", FieldProperty.builder()
              .setPhysicalName("ypos")
              .setLogicalName("ypos")
              .setType(FieldProperty.TYPE_PRIMITIVE_INT)
              .setLength(10)
              .setDecimal(-1)
              .build());
		fieldPropertyMap.put("fromv", FieldProperty.builder()
              .setPhysicalName("fromv")
              .setLogicalName("fromv")
              .setType(FieldProperty.TYPE_OBJECT_STRING)
              .setLength(10)
              .setDecimal(-1)
              .build());
		fieldPropertyMap.put("tov", FieldProperty.builder()
              .setPhysicalName("tov")
              .setLogicalName("tov")
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
			case "ywidth" : return getYwidth();
			case "yname" : return getYname();
			case "ypos" : return getYpos();
			case "fromv" : return getFromv();
			case "tov" : return getTov();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}

	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "ywidth" : setYwidth((Integer)arg);break;
			case "yname" : setYname((String)arg);break;
			case "ypos" : setYpos((Integer)arg);break;
			case "fromv" : setFromv((String)arg);break;
			case "tov" : setTov((String)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		ROWHEADERWIDTHDO _ROWHEADERWIDTHDO = (ROWHEADERWIDTHDO) obj;				
		if(this.ywidth != _ROWHEADERWIDTHDO.getYwidth()) return false;
		if(this.yname == null) {
			if(_ROWHEADERWIDTHDO.getYname() != null)
				return false;
		} else if(!this.yname.equals(_ROWHEADERWIDTHDO.getYname()))
			return false;				
		if(this.ypos != _ROWHEADERWIDTHDO.getYpos()) return false;
		if(this.fromv == null) {
			if(_ROWHEADERWIDTHDO.getFromv() != null)
				return false;
		} else if(!this.fromv.equals(_ROWHEADERWIDTHDO.getFromv()))
			return false;
		if(this.tov == null) {
			if(_ROWHEADERWIDTHDO.getTov() != null)
				return false;
		} else if(!this.tov.equals(_ROWHEADERWIDTHDO.getTov()))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		int prime  = 31;
		int result = 1;
		result     = prime * result + this.ywidth;					
		result     = prime * result + ((this.yname == null) ? 0 : this.yname.hashCode());
		result     = prime * result + this.ypos;					
		result     = prime * result + ((this.fromv == null) ? 0 : this.fromv.hashCode());					
		result     = prime * result + ((this.tov == null) ? 0 : this.tov.hashCode());
		return result;
	}
	
	@Override
	public void clear() {
		ywidth = 0;
		yname = null;
		ypos = 0;
		fromv = null;
		tov = null;	
		clearAllIsModified();
	}

	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}

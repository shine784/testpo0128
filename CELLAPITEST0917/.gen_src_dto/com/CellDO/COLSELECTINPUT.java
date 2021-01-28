	
package com.CellDO;

import java.io.IOException;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Collections;

import com.tmax.promapper.engine.dto.record.common.FieldProperty;
import com.tmax.proobject.model.exception.FieldNotFoundException;

import com.tmax.proobject.model.dataobject.DataObject;






@com.tmax.proobject.core.DataObject
public class COLSELECTINPUT extends DataObject {
	private static final String DTO_LOGICAL_NAME = "COLSELECTINPUT";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public COLSELECTINPUT() {
			super();
			
	}
	
	private transient boolean isModified = false;

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
	 * LogicalName : fromh
	 * Comments    : fromh
	 */		

	private String fromh = null;
	
	private transient boolean fromh_nullable = true;
	
	public boolean isNullableFromh() {
		return this.fromh_nullable;
	}
	
	private transient boolean fromh_invalidation = false;
	
	public void setInvalidationFromh(boolean invalidation) { 
		this.fromh_invalidation = invalidation;
	}
	
	public boolean isInvalidationFromh() {
		return this.fromh_invalidation;
	}
	
	private transient boolean fromh_modified = false;
	

	public boolean isModifiedFromh() {
		return this.fromh_modified;
	}
	
	public void unModifiedFromh() {
		this.fromh_modified = false;
	}

	public FieldProperty getFromhFieldProperty() {
		return fieldPropertyMap.get("fromh");
	}

	public String getFromh() {
		return fromh;
	}
	public String getNvlFromh() {
		if(getFromh() == null) {
			return EMPTY_STRING;
		} else {
			return getFromh();
		}
	}
	
	public void setFromh(String fromh) {
		if(fromh == null) {
			this.fromh = null;
		} else {
			this.fromh = fromh;
		}
		this.fromh_modified = true;
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


	/**
	 * LogicalName : toh
	 * Comments    : toh
	 */		

	private String toh = null;
	
	private transient boolean toh_nullable = true;
	
	public boolean isNullableToh() {
		return this.toh_nullable;
	}
	
	private transient boolean toh_invalidation = false;
	
	public void setInvalidationToh(boolean invalidation) { 
		this.toh_invalidation = invalidation;
	}
	
	public boolean isInvalidationToh() {
		return this.toh_invalidation;
	}
	
	private transient boolean toh_modified = false;
	

	public boolean isModifiedToh() {
		return this.toh_modified;
	}
	
	public void unModifiedToh() {
		this.toh_modified = false;
	}

	public FieldProperty getTohFieldProperty() {
		return fieldPropertyMap.get("toh");
	}

	public String getToh() {
		return toh;
	}
	public String getNvlToh() {
		if(getToh() == null) {
			return EMPTY_STRING;
		} else {
			return getToh();
		}
	}
	
	public void setToh(String toh) {
		if(toh == null) {
			this.toh = null;
		} else {
			this.toh = toh;
		}
		this.toh_modified = true;
		this.isModified = true;
	}		


	@Override
	public void clearAllIsModified() {
		this.fromv_modified = false;
		this.fromh_modified = false;
		this.tov_modified = false;
		this.toh_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.fromv_modified == true)
			modifiedFields.add("fromv");
		if(this.fromh_modified == true)
			modifiedFields.add("fromh");
		if(this.tov_modified == true)
			modifiedFields.add("tov");
		if(this.toh_modified == true)
			modifiedFields.add("toh");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	}
	 
	public Object clone() {
		COLSELECTINPUT copyObj = new COLSELECTINPUT();	
		copyObj.clone(this);
		return copyObj;
	}
	
	public void clone(DataObject _cOLSELECTINPUT) {
		if(this == _cOLSELECTINPUT) return;
		COLSELECTINPUT __cOLSELECTINPUT = (COLSELECTINPUT) _cOLSELECTINPUT;
		
		this.setFromv(__cOLSELECTINPUT.getFromv());
		this.setFromh(__cOLSELECTINPUT.getFromh());
		this.setTov(__cOLSELECTINPUT.getTov());
		this.setToh(__cOLSELECTINPUT.getToh());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("fromv : ").append(fromv).append("\n");				
		buffer.append("fromh : ").append(fromh).append("\n");				
		buffer.append("tov : ").append(tov).append("\n");				
		buffer.append("toh : ").append(toh).append("\n");		
		return buffer.toString();
	}
	
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(4);
		fieldPropertyMap.put("fromv", FieldProperty.builder()
              .setPhysicalName("fromv")
              .setLogicalName("fromv")
              .setType(FieldProperty.TYPE_OBJECT_STRING)
              .setLength(10)
              .setDecimal(-1)
              .build());
		fieldPropertyMap.put("fromh", FieldProperty.builder()
              .setPhysicalName("fromh")
              .setLogicalName("fromh")
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
		fieldPropertyMap.put("toh", FieldProperty.builder()
              .setPhysicalName("toh")
              .setLogicalName("toh")
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
			case "fromv" : return getFromv();
			case "fromh" : return getFromh();
			case "tov" : return getTov();
			case "toh" : return getToh();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}

	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "fromv" : setFromv((String)arg);break;
			case "fromh" : setFromh((String)arg);break;
			case "tov" : setTov((String)arg);break;
			case "toh" : setToh((String)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		COLSELECTINPUT _COLSELECTINPUT = (COLSELECTINPUT) obj;
		if(this.fromv == null) {
			if(_COLSELECTINPUT.getFromv() != null)
				return false;
		} else if(!this.fromv.equals(_COLSELECTINPUT.getFromv()))
			return false;
		if(this.fromh == null) {
			if(_COLSELECTINPUT.getFromh() != null)
				return false;
		} else if(!this.fromh.equals(_COLSELECTINPUT.getFromh()))
			return false;
		if(this.tov == null) {
			if(_COLSELECTINPUT.getTov() != null)
				return false;
		} else if(!this.tov.equals(_COLSELECTINPUT.getTov()))
			return false;
		if(this.toh == null) {
			if(_COLSELECTINPUT.getToh() != null)
				return false;
		} else if(!this.toh.equals(_COLSELECTINPUT.getToh()))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		int prime  = 31;
		int result = 1;					
		result     = prime * result + ((this.fromv == null) ? 0 : this.fromv.hashCode());					
		result     = prime * result + ((this.fromh == null) ? 0 : this.fromh.hashCode());					
		result     = prime * result + ((this.tov == null) ? 0 : this.tov.hashCode());					
		result     = prime * result + ((this.toh == null) ? 0 : this.toh.hashCode());
		return result;
	}
	
	@Override
	public void clear() {
		fromv = null;
		fromh = null;
		tov = null;
		toh = null;	
		clearAllIsModified();
	}

	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}

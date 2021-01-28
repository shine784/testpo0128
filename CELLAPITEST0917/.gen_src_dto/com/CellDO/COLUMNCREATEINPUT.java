	
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
public class COLUMNCREATEINPUT extends DataObject {
	private static final String DTO_LOGICAL_NAME = "COLUMNCREATEINPUT";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public COLUMNCREATEINPUT() {
			super();
			
	}
	
	private transient boolean isModified = false;

	/**
	 * LogicalName : xpos
	 * Comments    : 
	 */		

	private int xpos = 0;
	
	private transient boolean xpos_nullable = false;
	
	public boolean isNullableXpos() {
		return this.xpos_nullable;
	}
	
	private transient boolean xpos_invalidation = false;
	
	public void setInvalidationXpos(boolean invalidation) { 
		this.xpos_invalidation = invalidation;
	}
	
	public boolean isInvalidationXpos() {
		return this.xpos_invalidation;
	}
	
	private transient boolean xpos_modified = false;
	

	public boolean isModifiedXpos() {
		return this.xpos_modified;
	}
	
	public void unModifiedXpos() {
		this.xpos_modified = false;
	}

	public FieldProperty getXposFieldProperty() {
		return fieldPropertyMap.get("xpos");
	}

	public int getXpos() {
		return xpos;
	}
	
	public void setXpos(int xpos) {
	this.xpos = xpos;
	this.xpos_modified = true;
	this.isModified = true;
	}
	public void setXpos(Integer xpos) {
		if( xpos == null) {
			this.xpos = 0;
		} else{
			this.xpos = xpos.intValue();
		}
		this.xpos_modified = true;
		this.isModified = true;
	}
	public void setXpos(String xpos) {
		if  (xpos==null || xpos.length() == 0) {
			this.xpos = 0;
		} else {
			this.xpos = Integer.parseInt(xpos);
		}
		this.xpos_modified = true;
		this.isModified = true;
	}		


	/**
	 * LogicalName : xname
	 * Comments    : xname
	 */		

	private String xname = null;
	
	private transient boolean xname_nullable = true;
	
	public boolean isNullableXname() {
		return this.xname_nullable;
	}
	
	private transient boolean xname_invalidation = false;
	
	public void setInvalidationXname(boolean invalidation) { 
		this.xname_invalidation = invalidation;
	}
	
	public boolean isInvalidationXname() {
		return this.xname_invalidation;
	}
	
	private transient boolean xname_modified = false;
	

	public boolean isModifiedXname() {
		return this.xname_modified;
	}
	
	public void unModifiedXname() {
		this.xname_modified = false;
	}

	public FieldProperty getXnameFieldProperty() {
		return fieldPropertyMap.get("xname");
	}

	public String getXname() {
		return xname;
	}
	public String getNvlXname() {
		if(getXname() == null) {
			return EMPTY_STRING;
		} else {
			return getXname();
		}
	}
	
	public void setXname(String xname) {
		if(xname == null) {
			this.xname = null;
		} else {
			this.xname = xname;
		}
		this.xname_modified = true;
		this.isModified = true;
	}		


	@Override
	public void clearAllIsModified() {
		this.xpos_modified = false;
		this.xname_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.xpos_modified == true)
			modifiedFields.add("xpos");
		if(this.xname_modified == true)
			modifiedFields.add("xname");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	}
	 
	public Object clone() {
		COLUMNCREATEINPUT copyObj = new COLUMNCREATEINPUT();	
		copyObj.clone(this);
		return copyObj;
	}
	
	public void clone(DataObject _cOLUMNCREATEINPUT) {
		if(this == _cOLUMNCREATEINPUT) return;
		COLUMNCREATEINPUT __cOLUMNCREATEINPUT = (COLUMNCREATEINPUT) _cOLUMNCREATEINPUT;
		
		this.setXpos(__cOLUMNCREATEINPUT.getXpos());
		this.setXname(__cOLUMNCREATEINPUT.getXname());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("xpos : ").append(xpos).append("\n");				
		buffer.append("xname : ").append(xname).append("\n");		
		return buffer.toString();
	}
	
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(2);
		fieldPropertyMap.put("xpos", FieldProperty.builder()
              .setPhysicalName("xpos")
              .setLogicalName("xpos")
              .setType(FieldProperty.TYPE_PRIMITIVE_INT)
              .setLength(10)
              .setDecimal(-1)
              .build());
		fieldPropertyMap.put("xname", FieldProperty.builder()
              .setPhysicalName("xname")
              .setLogicalName("xname")
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
			case "xpos" : return getXpos();
			case "xname" : return getXname();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}

	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "xpos" : setXpos((Integer)arg);break;
			case "xname" : setXname((String)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		COLUMNCREATEINPUT _COLUMNCREATEINPUT = (COLUMNCREATEINPUT) obj;				
		if(this.xpos != _COLUMNCREATEINPUT.getXpos()) return false;
		if(this.xname == null) {
			if(_COLUMNCREATEINPUT.getXname() != null)
				return false;
		} else if(!this.xname.equals(_COLUMNCREATEINPUT.getXname()))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		int prime  = 31;
		int result = 1;
		result     = prime * result + this.xpos;					
		result     = prime * result + ((this.xname == null) ? 0 : this.xname.hashCode());
		return result;
	}
	
	@Override
	public void clear() {
		xpos = 0;
		xname = null;	
		clearAllIsModified();
	}

	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}

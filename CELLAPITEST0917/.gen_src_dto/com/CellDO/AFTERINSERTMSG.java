	
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
public class AFTERINSERTMSG extends DataObject {
	private static final String DTO_LOGICAL_NAME = "AFTERINSERTMSG";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public AFTERINSERTMSG() {
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
		AFTERINSERTMSG copyObj = new AFTERINSERTMSG();	
		copyObj.clone(this);
		return copyObj;
	}
	
	public void clone(DataObject _aFTERINSERTMSG) {
		if(this == _aFTERINSERTMSG) return;
		AFTERINSERTMSG __aFTERINSERTMSG = (AFTERINSERTMSG) _aFTERINSERTMSG;
		
		
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
		AFTERINSERTMSG _AFTERINSERTMSG = (AFTERINSERTMSG) obj;
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

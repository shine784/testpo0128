	
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
* @author        2020-09-25 16:38:41 
**************************************************************************************************/

/**************************************************************************************************************
* 화일명 : COLSELECTDOROW.class
* 사용프로그램 : COLSELECTDOROW
* 설명 :  
**************************************************************************************************************/

@com.tmax.proobject.core.DataObject
public class COLSELECTDOROW extends COLSELECTDOLIST {
	private static final String DTO_LOGICAL_NAME = "COLSELECTDOROW";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public COLSELECTDOROW() {
			super();
			
	}
	
	private transient boolean isModified = false;

	/**
	 * LogicalName : Row
	 * Comments    : 
	 */
	private List<com.CellDO.COLSELECTDOLIST> Row = null;
	
	public List<com.CellDO.COLSELECTDOLIST> getRowList() {
        if(Row == null)
            return null;
		return this.Row;
	}		
	private transient boolean Row_nullable = true;
	
	public boolean isNullableRow() {
		return this.Row_nullable;
	}
	
	private transient boolean Row_invalidation = false;
	
	public void setInvalidationRow(boolean invalidation) { 
		this.Row_invalidation = invalidation;
	}
	
	public boolean isInvalidationRow() {
		return this.Row_invalidation;
	}
	
	private transient boolean Row_modified = false;
	
	public boolean isModifiedRow() {
		if(this.Row_modified) return true;
		for(int index=0; index < this.sizeRow(); index++) {
			if(this.getRow(index).isModified()) return true;
		}
		return false;
	}
	
	public void unModifiedRow() {
		this.Row_modified = false;
	}
	
	public void clearRow() {
		if(Row != null)
			Row.clear();
		this.Row_modified = false;
	}
	
	public void ensureCapacityRow(int minCapacity) {
		if(Row == null)
			Row = new ArrayList<com.CellDO.COLSELECTDOLIST>(minCapacity);
		else
			((ArrayList<com.CellDO.COLSELECTDOLIST>)Row).ensureCapacity( minCapacity );	
	}	
	public void createRow(int _size) {
        if(Row == null) {
            ensureCapacityRow(_size);
        } else {
            ((ArrayList<com.CellDO.COLSELECTDOLIST>)Row).ensureCapacity(_size);
        }
		for(int i = Row.size(); i < _size; i++) {
			Row.add( new com.CellDO.COLSELECTDOLIST());
			this.Row_modified = true;
		}
	}
	public COLSELECTDOROW fillRow(int _index) {
		ensureCapacityRow(_index+1);
		for (int i = sizeRow(); i <  _index + 1; i++) {
			this.Row.add(i, new com.CellDO.COLSELECTDOLIST());
			this.Row_modified = true;
		}
		return this;
	}
	
	public int sizeRow() {
		if(Row == null)
			return 0;
		
		return Row.size();
	}
	
	public com.CellDO.COLSELECTDOLIST[] getRow() {
		if(this.Row == null)
			return null;
		
		return (com.CellDO.COLSELECTDOLIST[])Row.toArray(new com.CellDO.COLSELECTDOLIST[Row.size()]);
	}
	public com.CellDO.COLSELECTDOLIST getRow(int _index) {
		return (com.CellDO.COLSELECTDOLIST)Row.get(_index);
	}
	 
	public void setRow(List<com.CellDO.COLSELECTDOLIST> Row) {
		
		if(Row == null) {
			this.Row = null;
		} else {
			ensureCapacityRow(Row.size());
            this.Row.clear();
			for(int i = 0, n=Row.size(); i < n; i++) {
				if( Row.get(i) == null ) {
					this.Row.add(null);
				}
				else {
					this.Row.add(Row.get(i));
				}
			}
		}
		this.Row_modified = true;
		this.isModified = true;
	}
	
	public void setRow(com.CellDO.COLSELECTDOLIST[] Row) {
		
		if(Row == null) {
			this.Row = null;
		} else {
			ensureCapacityRow(Row.length);
            this.Row.clear();
			for(int i = 0, n=Row.length; i < n; i++) {
				if( Row[i] == null ) {
					this.Row.add(null);
				}
				else {
					this.Row.add(Row[i]);
				}
			}
		}
		this.Row_modified = true;
		this.isModified = true;
	}
	
	public void setRow(int _index, com.CellDO.COLSELECTDOLIST Row) {
		if(Row == null) {
			this.Row.set(_index, null);
		} else {
			this.Row.set(_index, Row);
		}
		this.Row_modified = true;
		this.isModified = true;
	}				
		
	
	public void addRow(int _index, com.CellDO.COLSELECTDOLIST Row) {
		if(this.Row == null)
			this.Row = new ArrayList<com.CellDO.COLSELECTDOLIST>(1000);
		if(Row == null) {
			this.Row.add(_index, null);
		} else {
			this.Row.add(_index, Row);
		}
		this.Row_modified = true;
		this.isModified = true;
	}
		
	public void addRow(com.CellDO.COLSELECTDOLIST Row) {
		if(this.Row == null)
			this.Row = new ArrayList<com.CellDO.COLSELECTDOLIST>(1000);
		if(Row == null) {
			this.Row.add(null);
		} else {
			this.Row.add(Row);
		}
		this.Row_modified = true;
		this.isModified = true;
	}
		
	
	public com.CellDO.COLSELECTDOLIST removeRow(int _index) {
		this.Row_modified = true;
		this.isModified = true;
		return (com.CellDO.COLSELECTDOLIST)this.Row.remove(_index);
	}


	@Override
	public void clearAllIsModified() {
		super.clearAllIsModified();
		this.Row_modified = false;
		for(int index=0; index < this.sizeRow(); index++) {
			if(this.getRow(index) != null)
				this.getRow(index).clearAllIsModified();
		}
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(super.getIsModifiedField() != null)
            modifiedFields.addAll(super.getIsModifiedField());
		if(this.Row_modified == true)
			modifiedFields.add("Row");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
		if(super.isModified())
			return true;
	    return isModified;
	}
	
	public Object clone() {
		COLSELECTDOROW copyObj = new COLSELECTDOROW();	
		copyObj.clone(this);
		return copyObj;
	}
	
	public void clone(DataObject _cOLSELECTDOROW) {
		if(this == _cOLSELECTDOROW) return;
		COLSELECTDOROW __cOLSELECTDOROW = (COLSELECTDOROW) _cOLSELECTDOROW;
		super.clone(__cOLSELECTDOROW);
		
		this.clearRow();
        if(this.getRow() == null && __cOLSELECTDOROW.getRow() != null)
            this.ensureCapacityRow(__cOLSELECTDOROW.sizeRow());
        
		for (int index = 0; index < __cOLSELECTDOROW.sizeRow(); index++) {
            com.CellDO.COLSELECTDOLIST _value0 = __cOLSELECTDOROW.getRow(index);
            if(_value0 == null) {
                this.addRow(index, null);
            } else {
                this.addRow(index, (com.CellDO.COLSELECTDOLIST)_value0.clone());		
            }
		}
	
	}
	public String toString() {
		StringBuilder buffer = new StringBuilder();
		buffer.append(super.toString());
		
		buffer.append("Row [");
		for (int index = 0; index < sizeRow(); index++) {
			buffer.append("(").append(index).append(") : ").append(getRow(index)).append(" ");
		}

		buffer.append("]");
		buffer.append("\n");	
		return buffer.toString();
	}
	

	private static final Map<String,FieldProperty> parentfieldPropertyMap;
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		parentfieldPropertyMap = com.CellDO.COLSELECTDOLIST.getFieldPropertyMapByStatic();
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>( parentfieldPropertyMap.size() + 1);
		fieldPropertyMap.putAll( parentfieldPropertyMap );
		fieldPropertyMap.put("Row", FieldProperty.builder()
              .setPhysicalName("Row")
              .setLogicalName("Row")
              .setType(FieldProperty.TYPE_ABSTRACT_INCLUDE)
              .setDecimal(-1)
              .setArray("1000")
              .setReference("com.CellDO.COLSELECTDOLIST")
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
			case "Row" : return getRowList();
			default : return super.get(fieldName);		
		}
	}

	@SuppressWarnings("unchecked")
	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "Row" : setRow((List<com.CellDO.COLSELECTDOLIST>)arg);break;
			default : super.set(fieldName, arg); break;		
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if ((obj instanceof COLSELECTDOROW) == false) return false;
		if(!super.equals(obj)) return false;
		COLSELECTDOROW _COLSELECTDOROW = (COLSELECTDOROW) obj;
		if(this.Row == null) {
			if(_COLSELECTDOROW.getRowList() != null)
				return false;
		}

		if(sizeRow() != _COLSELECTDOROW.sizeRow()) return false;
		else {
			for(int i = 0, n = sizeRow(); i < n; i++ ){ 
                if(this.getRow(i) == null && _COLSELECTDOROW.getRow(i) != null) return false;
                if(this.getRow(i) == null && _COLSELECTDOROW.getRow(i) == null) continue;
                    
				if(!this.getRow(i).equals(_COLSELECTDOROW.getRow(i))) return false;
			}
		}
		return true;
	}

	@Override
	public int hashCode() {
		int prime  = 31;
		int result = 1;		
		result     = prime * result + super.hashCode();
		result     = prime * result + ((this.Row == null) ? 0 : this.Row.hashCode());
		return result;
	}
	
	@Override
	public void clear() {
		Row = null;
		super.clear();	
		clearAllIsModified();
	}

	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}

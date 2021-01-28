	
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
public class COLSELECTMULTIROWS extends DataObject {
	private static final String DTO_LOGICAL_NAME = "COLSELECTMULTIROWS";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public COLSELECTMULTIROWS() {
			super();
			
	}
	
	private transient boolean isModified = false;

	/**
	 * LogicalName : Rows
	 * Comments    : 
	 */
	private List<com.CellDO.COLSELECTDOROW> Rows = null;
	
	public List<com.CellDO.COLSELECTDOROW> getRowsList() {
        if(Rows == null)
            return null;
		return this.Rows;
	}		
	private transient boolean Rows_nullable = true;
	
	public boolean isNullableRows() {
		return this.Rows_nullable;
	}
	
	private transient boolean Rows_invalidation = false;
	
	public void setInvalidationRows(boolean invalidation) { 
		this.Rows_invalidation = invalidation;
	}
	
	public boolean isInvalidationRows() {
		return this.Rows_invalidation;
	}
	
	private transient boolean Rows_modified = false;
	
	public boolean isModifiedRows() {
		if(this.Rows_modified) return true;
		for(int index=0; index < this.sizeRows(); index++) {
			if(this.getRows(index).isModified()) return true;
		}
		return false;
	}
	
	public void unModifiedRows() {
		this.Rows_modified = false;
	}
	
	public void clearRows() {
		if(Rows != null)
			Rows.clear();
		this.Rows_modified = false;
	}
	
	public void ensureCapacityRows(int minCapacity) {
		if(Rows == null)
			Rows = new ArrayList<com.CellDO.COLSELECTDOROW>(minCapacity);
		else
			((ArrayList<com.CellDO.COLSELECTDOROW>)Rows).ensureCapacity( minCapacity );	
	}	
	public void createRows(int _size) {
        if(Rows == null) {
            ensureCapacityRows(_size);
        } else {
            ((ArrayList<com.CellDO.COLSELECTDOROW>)Rows).ensureCapacity(_size);
        }
		for(int i = Rows.size(); i < _size; i++) {
			Rows.add( new com.CellDO.COLSELECTDOROW());
			this.Rows_modified = true;
		}
	}
	public COLSELECTMULTIROWS fillRows(int _index) {
		ensureCapacityRows(_index+1);
		for (int i = sizeRows(); i <  _index + 1; i++) {
			this.Rows.add(i, new com.CellDO.COLSELECTDOROW());
			this.Rows_modified = true;
		}
		return this;
	}
	
	public int sizeRows() {
		if(Rows == null)
			return 0;
		
		return Rows.size();
	}
	
	public com.CellDO.COLSELECTDOROW[] getRows() {
		if(this.Rows == null)
			return null;
		
		return (com.CellDO.COLSELECTDOROW[])Rows.toArray(new com.CellDO.COLSELECTDOROW[Rows.size()]);
	}
	public com.CellDO.COLSELECTDOROW getRows(int _index) {
		return (com.CellDO.COLSELECTDOROW)Rows.get(_index);
	}
	 
	public void setRows(List<com.CellDO.COLSELECTDOROW> Rows) {
		
		if(Rows == null) {
			this.Rows = null;
		} else {
			ensureCapacityRows(Rows.size());
            this.Rows.clear();
			for(int i = 0, n=Rows.size(); i < n; i++) {
				if( Rows.get(i) == null ) {
					this.Rows.add(null);
				}
				else {
					this.Rows.add(Rows.get(i));
				}
			}
		}
		this.Rows_modified = true;
		this.isModified = true;
	}
	
	public void setRows(com.CellDO.COLSELECTDOROW[] Rows) {
		
		if(Rows == null) {
			this.Rows = null;
		} else {
			ensureCapacityRows(Rows.length);
            this.Rows.clear();
			for(int i = 0, n=Rows.length; i < n; i++) {
				if( Rows[i] == null ) {
					this.Rows.add(null);
				}
				else {
					this.Rows.add(Rows[i]);
				}
			}
		}
		this.Rows_modified = true;
		this.isModified = true;
	}
	
	public void setRows(int _index, com.CellDO.COLSELECTDOROW Rows) {
		if(Rows == null) {
			this.Rows.set(_index, null);
		} else {
			this.Rows.set(_index, Rows);
		}
		this.Rows_modified = true;
		this.isModified = true;
	}				
		
	
	public void addRows(int _index, com.CellDO.COLSELECTDOROW Rows) {
		if(this.Rows == null)
			this.Rows = new ArrayList<com.CellDO.COLSELECTDOROW>(1000);
		if(Rows == null) {
			this.Rows.add(_index, null);
		} else {
			this.Rows.add(_index, Rows);
		}
		this.Rows_modified = true;
		this.isModified = true;
	}
		
	public void addRows(com.CellDO.COLSELECTDOROW Rows) {
		if(this.Rows == null)
			this.Rows = new ArrayList<com.CellDO.COLSELECTDOROW>(1000);
		if(Rows == null) {
			this.Rows.add(null);
		} else {
			this.Rows.add(Rows);
		}
		this.Rows_modified = true;
		this.isModified = true;
	}
		
	
	public com.CellDO.COLSELECTDOROW removeRows(int _index) {
		this.Rows_modified = true;
		this.isModified = true;
		return (com.CellDO.COLSELECTDOROW)this.Rows.remove(_index);
	}


	@Override
	public void clearAllIsModified() {
		this.Rows_modified = false;
		for(int index=0; index < this.sizeRows(); index++) {
			if(this.getRows(index) != null)
				this.getRows(index).clearAllIsModified();
		}
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.Rows_modified == true)
			modifiedFields.add("Rows");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	}
	 
	public Object clone() {
		COLSELECTMULTIROWS copyObj = new COLSELECTMULTIROWS();	
		copyObj.clone(this);
		return copyObj;
	}
	
	public void clone(DataObject _cOLSELECTMULTIROWS) {
		if(this == _cOLSELECTMULTIROWS) return;
		COLSELECTMULTIROWS __cOLSELECTMULTIROWS = (COLSELECTMULTIROWS) _cOLSELECTMULTIROWS;
		
		this.clearRows();
        if(this.getRows() == null && __cOLSELECTMULTIROWS.getRows() != null)
            this.ensureCapacityRows(__cOLSELECTMULTIROWS.sizeRows());
        
		for (int index = 0; index < __cOLSELECTMULTIROWS.sizeRows(); index++) {
            com.CellDO.COLSELECTDOROW _value0 = __cOLSELECTMULTIROWS.getRows(index);
            if(_value0 == null) {
                this.addRows(index, null);
            } else {
                this.addRows(index, (com.CellDO.COLSELECTDOROW)_value0.clone());		
            }
		}
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
		
		buffer.append("Rows [");
		for (int index = 0; index < sizeRows(); index++) {
			buffer.append("(").append(index).append(") : ").append(getRows(index)).append(" ");
		}

		buffer.append("]");
		buffer.append("\n");
		return buffer.toString();
	}
	
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(1);
		fieldPropertyMap.put("Rows", FieldProperty.builder()
              .setPhysicalName("Rows")
              .setLogicalName("Rows")
              .setType(FieldProperty.TYPE_ABSTRACT_INCLUDE)
              .setDecimal(-1)
              .setArray("1000")
              .setReference("com.CellDO.COLSELECTDOROW")
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
			case "Rows" : return getRowsList();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}

	@SuppressWarnings("unchecked")
	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "Rows" : setRows((List<com.CellDO.COLSELECTDOROW>)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		COLSELECTMULTIROWS _COLSELECTMULTIROWS = (COLSELECTMULTIROWS) obj;
		if(this.Rows == null) {
			if(_COLSELECTMULTIROWS.getRowsList() != null)
				return false;
		}

		if(sizeRows() != _COLSELECTMULTIROWS.sizeRows()) return false;
		else {
			for(int i = 0, n = sizeRows(); i < n; i++ ){ 
                if(this.getRows(i) == null && _COLSELECTMULTIROWS.getRows(i) != null) return false;
                if(this.getRows(i) == null && _COLSELECTMULTIROWS.getRows(i) == null) continue;
                    
				if(!this.getRows(i).equals(_COLSELECTMULTIROWS.getRows(i))) return false;
			}
		}
		return true;
	}

	@Override
	public int hashCode() {
		int prime  = 31;
		int result = 1;
		result     = prime * result + ((this.Rows == null) ? 0 : this.Rows.hashCode());
		return result;
	}
	
	@Override
	public void clear() {
		Rows = null;	
		clearAllIsModified();
	}

	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}

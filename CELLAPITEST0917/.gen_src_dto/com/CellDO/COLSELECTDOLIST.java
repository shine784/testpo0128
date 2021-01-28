	
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
public class COLSELECTDOLIST extends DataObject {
	private static final String DTO_LOGICAL_NAME = "COLSELECTDOLIST";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public COLSELECTDOLIST() {
			super();
			
	}
	
	private transient boolean isModified = false;

	/**
	 * LogicalName : Cells
	 * Comments    : 
	 */
	private List<com.CellDO.COLSELECTDO> Cells = null;
	
	public List<com.CellDO.COLSELECTDO> getCellsList() {
        if(Cells == null)
            return null;
		return this.Cells;
	}		
	private transient boolean Cells_nullable = true;
	
	public boolean isNullableCells() {
		return this.Cells_nullable;
	}
	
	private transient boolean Cells_invalidation = false;
	
	public void setInvalidationCells(boolean invalidation) { 
		this.Cells_invalidation = invalidation;
	}
	
	public boolean isInvalidationCells() {
		return this.Cells_invalidation;
	}
	
	private transient boolean Cells_modified = false;
	
	public boolean isModifiedCells() {
		if(this.Cells_modified) return true;
		for(int index=0; index < this.sizeCells(); index++) {
			if(this.getCells(index).isModified()) return true;
		}
		return false;
	}
	
	public void unModifiedCells() {
		this.Cells_modified = false;
	}
	
	public void clearCells() {
		if(Cells != null)
			Cells.clear();
		this.Cells_modified = false;
	}
	
	public void ensureCapacityCells(int minCapacity) {
		if(Cells == null)
			Cells = new ArrayList<com.CellDO.COLSELECTDO>(minCapacity);
		else
			((ArrayList<com.CellDO.COLSELECTDO>)Cells).ensureCapacity( minCapacity );	
	}	
	public void createCells(int _size) {
        if(Cells == null) {
            ensureCapacityCells(_size);
        } else {
            ((ArrayList<com.CellDO.COLSELECTDO>)Cells).ensureCapacity(_size);
        }
		for(int i = Cells.size(); i < _size; i++) {
			Cells.add( new com.CellDO.COLSELECTDO());
			this.Cells_modified = true;
		}
	}
	public COLSELECTDOLIST fillCells(int _index) {
		ensureCapacityCells(_index+1);
		for (int i = sizeCells(); i <  _index + 1; i++) {
			this.Cells.add(i, new com.CellDO.COLSELECTDO());
			this.Cells_modified = true;
		}
		return this;
	}
	
	public int sizeCells() {
		if(Cells == null)
			return 0;
		
		return Cells.size();
	}
	
	public com.CellDO.COLSELECTDO[] getCells() {
		if(this.Cells == null)
			return null;
		
		return (com.CellDO.COLSELECTDO[])Cells.toArray(new com.CellDO.COLSELECTDO[Cells.size()]);
	}
	public com.CellDO.COLSELECTDO getCells(int _index) {
		return (com.CellDO.COLSELECTDO)Cells.get(_index);
	}
	 
	public void setCells(List<com.CellDO.COLSELECTDO> Cells) {
		
		if(Cells == null) {
			this.Cells = null;
		} else {
			ensureCapacityCells(Cells.size());
            this.Cells.clear();
			for(int i = 0, n=Cells.size(); i < n; i++) {
				if( Cells.get(i) == null ) {
					this.Cells.add(null);
				}
				else {
					this.Cells.add(Cells.get(i));
				}
			}
		}
		this.Cells_modified = true;
		this.isModified = true;
	}
	
	public void setCells(com.CellDO.COLSELECTDO[] Cells) {
		
		if(Cells == null) {
			this.Cells = null;
		} else {
			ensureCapacityCells(Cells.length);
            this.Cells.clear();
			for(int i = 0, n=Cells.length; i < n; i++) {
				if( Cells[i] == null ) {
					this.Cells.add(null);
				}
				else {
					this.Cells.add(Cells[i]);
				}
			}
		}
		this.Cells_modified = true;
		this.isModified = true;
	}
	
	public void setCells(int _index, com.CellDO.COLSELECTDO Cells) {
		if(Cells == null) {
			this.Cells.set(_index, null);
		} else {
			this.Cells.set(_index, Cells);
		}
		this.Cells_modified = true;
		this.isModified = true;
	}				
		
	
	public void addCells(int _index, com.CellDO.COLSELECTDO Cells) {
		if(this.Cells == null)
			this.Cells = new ArrayList<com.CellDO.COLSELECTDO>(1000);
		if(Cells == null) {
			this.Cells.add(_index, null);
		} else {
			this.Cells.add(_index, Cells);
		}
		this.Cells_modified = true;
		this.isModified = true;
	}
		
	public void addCells(com.CellDO.COLSELECTDO Cells) {
		if(this.Cells == null)
			this.Cells = new ArrayList<com.CellDO.COLSELECTDO>(1000);
		if(Cells == null) {
			this.Cells.add(null);
		} else {
			this.Cells.add(Cells);
		}
		this.Cells_modified = true;
		this.isModified = true;
	}
		
	
	public com.CellDO.COLSELECTDO removeCells(int _index) {
		this.Cells_modified = true;
		this.isModified = true;
		return (com.CellDO.COLSELECTDO)this.Cells.remove(_index);
	}


	/**
	 * LogicalName : idx
	 * Comments    : idx
	 */		

	private int idx = 0;
	
	private transient boolean idx_nullable = false;
	
	public boolean isNullableIdx() {
		return this.idx_nullable;
	}
	
	private transient boolean idx_invalidation = false;
	
	public void setInvalidationIdx(boolean invalidation) { 
		this.idx_invalidation = invalidation;
	}
	
	public boolean isInvalidationIdx() {
		return this.idx_invalidation;
	}
	
	private transient boolean idx_modified = false;
	

	public boolean isModifiedIdx() {
		return this.idx_modified;
	}
	
	public void unModifiedIdx() {
		this.idx_modified = false;
	}

	public FieldProperty getIdxFieldProperty() {
		return fieldPropertyMap.get("idx");
	}

	public int getIdx() {
		return idx;
	}
	
	public void setIdx(int idx) {
	this.idx = idx;
	this.idx_modified = true;
	this.isModified = true;
	}
	public void setIdx(Integer idx) {
		if( idx == null) {
			this.idx = 0;
		} else{
			this.idx = idx.intValue();
		}
		this.idx_modified = true;
		this.isModified = true;
	}
	public void setIdx(String idx) {
		if  (idx==null || idx.length() == 0) {
			this.idx = 0;
		} else {
			this.idx = Integer.parseInt(idx);
		}
		this.idx_modified = true;
		this.isModified = true;
	}		


	/**
	 * LogicalName : val
	 * Comments    : val
	 */		

	private String val = null;
	
	private transient boolean val_nullable = true;
	
	public boolean isNullableVal() {
		return this.val_nullable;
	}
	
	private transient boolean val_invalidation = false;
	
	public void setInvalidationVal(boolean invalidation) { 
		this.val_invalidation = invalidation;
	}
	
	public boolean isInvalidationVal() {
		return this.val_invalidation;
	}
	
	private transient boolean val_modified = false;
	

	public boolean isModifiedVal() {
		return this.val_modified;
	}
	
	public void unModifiedVal() {
		this.val_modified = false;
	}

	public FieldProperty getValFieldProperty() {
		return fieldPropertyMap.get("val");
	}

	public String getVal() {
		return val;
	}
	public String getNvlVal() {
		if(getVal() == null) {
			return EMPTY_STRING;
		} else {
			return getVal();
		}
	}
	
	public void setVal(String val) {
		if(val == null) {
			this.val = null;
		} else {
			this.val = val;
		}
		this.val_modified = true;
		this.isModified = true;
	}		


	@Override
	public void clearAllIsModified() {
		this.Cells_modified = false;
		for(int index=0; index < this.sizeCells(); index++) {
			if(this.getCells(index) != null)
				this.getCells(index).clearAllIsModified();
		}
		this.idx_modified = false;
		this.val_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.Cells_modified == true)
			modifiedFields.add("Cells");
		if(this.idx_modified == true)
			modifiedFields.add("idx");
		if(this.val_modified == true)
			modifiedFields.add("val");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	}
	 
	public Object clone() {
		COLSELECTDOLIST copyObj = new COLSELECTDOLIST();	
		copyObj.clone(this);
		return copyObj;
	}
	
	public void clone(DataObject _cOLSELECTDOLIST) {
		if(this == _cOLSELECTDOLIST) return;
		COLSELECTDOLIST __cOLSELECTDOLIST = (COLSELECTDOLIST) _cOLSELECTDOLIST;
		
		this.clearCells();
        if(this.getCells() == null && __cOLSELECTDOLIST.getCells() != null)
            this.ensureCapacityCells(__cOLSELECTDOLIST.sizeCells());
        
		for (int index = 0; index < __cOLSELECTDOLIST.sizeCells(); index++) {
            com.CellDO.COLSELECTDO _value0 = __cOLSELECTDOLIST.getCells(index);
            if(_value0 == null) {
                this.addCells(index, null);
            } else {
                this.addCells(index, (com.CellDO.COLSELECTDO)_value0.clone());		
            }
		}
		this.setIdx(__cOLSELECTDOLIST.getIdx());
		this.setVal(__cOLSELECTDOLIST.getVal());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
		
		buffer.append("Cells [");
		for (int index = 0; index < sizeCells(); index++) {
			buffer.append("(").append(index).append(") : ").append(getCells(index)).append(" ");
		}

		buffer.append("]");
		buffer.append("\n");		
		buffer.append("idx : ").append(idx).append("\n");				
		buffer.append("val : ").append(val).append("\n");		
		return buffer.toString();
	}
	
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(3);
		fieldPropertyMap.put("Cells", FieldProperty.builder()
              .setPhysicalName("Cells")
              .setLogicalName("Cells")
              .setType(FieldProperty.TYPE_ABSTRACT_INCLUDE)
              .setDecimal(-1)
              .setArray("1000")
              .setReference("com.CellDO.COLSELECTDO")
              .build());
		fieldPropertyMap.put("idx", FieldProperty.builder()
              .setPhysicalName("idx")
              .setLogicalName("idx")
              .setType(FieldProperty.TYPE_PRIMITIVE_INT)
              .setLength(10)
              .setDecimal(-1)
              .build());
		fieldPropertyMap.put("val", FieldProperty.builder()
              .setPhysicalName("val")
              .setLogicalName("val")
              .setType(FieldProperty.TYPE_OBJECT_STRING)
              .setLength(30)
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
			case "Cells" : return getCellsList();
			case "idx" : return getIdx();
			case "val" : return getVal();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}

	@SuppressWarnings("unchecked")
	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "Cells" : setCells((List<com.CellDO.COLSELECTDO>)arg);break;
			case "idx" : setIdx((Integer)arg);break;
			case "val" : setVal((String)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		COLSELECTDOLIST _COLSELECTDOLIST = (COLSELECTDOLIST) obj;
		if(this.Cells == null) {
			if(_COLSELECTDOLIST.getCellsList() != null)
				return false;
		}

		if(sizeCells() != _COLSELECTDOLIST.sizeCells()) return false;
		else {
			for(int i = 0, n = sizeCells(); i < n; i++ ){ 
                if(this.getCells(i) == null && _COLSELECTDOLIST.getCells(i) != null) return false;
                if(this.getCells(i) == null && _COLSELECTDOLIST.getCells(i) == null) continue;
                    
				if(!this.getCells(i).equals(_COLSELECTDOLIST.getCells(i))) return false;
			}
		}				
		if(this.idx != _COLSELECTDOLIST.getIdx()) return false;
		if(this.val == null) {
			if(_COLSELECTDOLIST.getVal() != null)
				return false;
		} else if(!this.val.equals(_COLSELECTDOLIST.getVal()))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		int prime  = 31;
		int result = 1;
		result     = prime * result + ((this.Cells == null) ? 0 : this.Cells.hashCode());
		result     = prime * result + this.idx;					
		result     = prime * result + ((this.val == null) ? 0 : this.val.hashCode());
		return result;
	}
	
	@Override
	public void clear() {
		Cells = null;
		idx = 0;
		val = null;	
		clearAllIsModified();
	}

	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}

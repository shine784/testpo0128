	
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
public class COLHEADERWIDTHLIST extends DataObject {
	private static final String DTO_LOGICAL_NAME = "COLHEADERWIDTHLIST";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public COLHEADERWIDTHLIST() {
			super();
			
	}
	
	private transient boolean isModified = false;

	/**
	 * LogicalName : width배열
	 * Comments    : 
	 */
	private List<com.CellDO.COLHEADERWIDTHDO> widthlist = null;
	
	public List<com.CellDO.COLHEADERWIDTHDO> getWidthlistList() {
        if(widthlist == null)
            return null;
		return this.widthlist;
	}		
	private transient boolean widthlist_nullable = true;
	
	public boolean isNullableWidthlist() {
		return this.widthlist_nullable;
	}
	
	private transient boolean widthlist_invalidation = false;
	
	public void setInvalidationWidthlist(boolean invalidation) { 
		this.widthlist_invalidation = invalidation;
	}
	
	public boolean isInvalidationWidthlist() {
		return this.widthlist_invalidation;
	}
	
	private transient boolean widthlist_modified = false;
	
	public boolean isModifiedWidthlist() {
		if(this.widthlist_modified) return true;
		for(int index=0; index < this.sizeWidthlist(); index++) {
			if(this.getWidthlist(index).isModified()) return true;
		}
		return false;
	}
	
	public void unModifiedWidthlist() {
		this.widthlist_modified = false;
	}
	
	public void clearWidthlist() {
		if(widthlist != null)
			widthlist.clear();
		this.widthlist_modified = false;
	}
	
	public void ensureCapacityWidthlist(int minCapacity) {
		if(widthlist == null)
			widthlist = new ArrayList<com.CellDO.COLHEADERWIDTHDO>(minCapacity);
		else
			((ArrayList<com.CellDO.COLHEADERWIDTHDO>)widthlist).ensureCapacity( minCapacity );	
	}	
	public void createWidthlist(int _size) {
        if(widthlist == null) {
            ensureCapacityWidthlist(_size);
        } else {
            ((ArrayList<com.CellDO.COLHEADERWIDTHDO>)widthlist).ensureCapacity(_size);
        }
		for(int i = widthlist.size(); i < _size; i++) {
			widthlist.add( new com.CellDO.COLHEADERWIDTHDO());
			this.widthlist_modified = true;
		}
	}
	public COLHEADERWIDTHLIST fillWidthlist(int _index) {
		ensureCapacityWidthlist(_index+1);
		for (int i = sizeWidthlist(); i <  _index + 1; i++) {
			this.widthlist.add(i, new com.CellDO.COLHEADERWIDTHDO());
			this.widthlist_modified = true;
		}
		return this;
	}
	
	public int sizeWidthlist() {
		if(widthlist == null)
			return 0;
		
		return widthlist.size();
	}
	
	public com.CellDO.COLHEADERWIDTHDO[] getWidthlist() {
		if(this.widthlist == null)
			return null;
		
		return (com.CellDO.COLHEADERWIDTHDO[])widthlist.toArray(new com.CellDO.COLHEADERWIDTHDO[widthlist.size()]);
	}
	public com.CellDO.COLHEADERWIDTHDO getWidthlist(int _index) {
		return (com.CellDO.COLHEADERWIDTHDO)widthlist.get(_index);
	}
	 
	public void setWidthlist(List<com.CellDO.COLHEADERWIDTHDO> widthlist) {
		
		if(widthlist == null) {
			this.widthlist = null;
		} else {
			ensureCapacityWidthlist(widthlist.size());
            this.widthlist.clear();
			for(int i = 0, n=widthlist.size(); i < n; i++) {
				if( widthlist.get(i) == null ) {
					this.widthlist.add(null);
				}
				else {
					this.widthlist.add(widthlist.get(i));
				}
			}
		}
		this.widthlist_modified = true;
		this.isModified = true;
	}
	
	public void setWidthlist(com.CellDO.COLHEADERWIDTHDO[] widthlist) {
		
		if(widthlist == null) {
			this.widthlist = null;
		} else {
			ensureCapacityWidthlist(widthlist.length);
            this.widthlist.clear();
			for(int i = 0, n=widthlist.length; i < n; i++) {
				if( widthlist[i] == null ) {
					this.widthlist.add(null);
				}
				else {
					this.widthlist.add(widthlist[i]);
				}
			}
		}
		this.widthlist_modified = true;
		this.isModified = true;
	}
	
	public void setWidthlist(int _index, com.CellDO.COLHEADERWIDTHDO widthlist) {
		if(widthlist == null) {
			this.widthlist.set(_index, null);
		} else {
			this.widthlist.set(_index, widthlist);
		}
		this.widthlist_modified = true;
		this.isModified = true;
	}				
		
	
	public void addWidthlist(int _index, com.CellDO.COLHEADERWIDTHDO widthlist) {
		if(this.widthlist == null)
			this.widthlist = new ArrayList<com.CellDO.COLHEADERWIDTHDO>(1000);
		if(widthlist == null) {
			this.widthlist.add(_index, null);
		} else {
			this.widthlist.add(_index, widthlist);
		}
		this.widthlist_modified = true;
		this.isModified = true;
	}
		
	public void addWidthlist(com.CellDO.COLHEADERWIDTHDO widthlist) {
		if(this.widthlist == null)
			this.widthlist = new ArrayList<com.CellDO.COLHEADERWIDTHDO>(1000);
		if(widthlist == null) {
			this.widthlist.add(null);
		} else {
			this.widthlist.add(widthlist);
		}
		this.widthlist_modified = true;
		this.isModified = true;
	}
		
	
	public com.CellDO.COLHEADERWIDTHDO removeWidthlist(int _index) {
		this.widthlist_modified = true;
		this.isModified = true;
		return (com.CellDO.COLHEADERWIDTHDO)this.widthlist.remove(_index);
	}


	@Override
	public void clearAllIsModified() {
		this.widthlist_modified = false;
		for(int index=0; index < this.sizeWidthlist(); index++) {
			if(this.getWidthlist(index) != null)
				this.getWidthlist(index).clearAllIsModified();
		}
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.widthlist_modified == true)
			modifiedFields.add("widthlist");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	}
	 
	public Object clone() {
		COLHEADERWIDTHLIST copyObj = new COLHEADERWIDTHLIST();	
		copyObj.clone(this);
		return copyObj;
	}
	
	public void clone(DataObject _cOLHEADERWIDTHLIST) {
		if(this == _cOLHEADERWIDTHLIST) return;
		COLHEADERWIDTHLIST __cOLHEADERWIDTHLIST = (COLHEADERWIDTHLIST) _cOLHEADERWIDTHLIST;
		
		this.clearWidthlist();
        if(this.getWidthlist() == null && __cOLHEADERWIDTHLIST.getWidthlist() != null)
            this.ensureCapacityWidthlist(__cOLHEADERWIDTHLIST.sizeWidthlist());
        
		for (int index = 0; index < __cOLHEADERWIDTHLIST.sizeWidthlist(); index++) {
            com.CellDO.COLHEADERWIDTHDO _value0 = __cOLHEADERWIDTHLIST.getWidthlist(index);
            if(_value0 == null) {
                this.addWidthlist(index, null);
            } else {
                this.addWidthlist(index, (com.CellDO.COLHEADERWIDTHDO)_value0.clone());		
            }
		}
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
		
		buffer.append("widthlist [");
		for (int index = 0; index < sizeWidthlist(); index++) {
			buffer.append("(").append(index).append(") : ").append(getWidthlist(index)).append(" ");
		}

		buffer.append("]");
		buffer.append("\n");
		return buffer.toString();
	}
	
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(1);
		fieldPropertyMap.put("widthlist", FieldProperty.builder()
              .setPhysicalName("widthlist")
              .setLogicalName("width배열")
              .setType(FieldProperty.TYPE_ABSTRACT_INCLUDE)
              .setDecimal(-1)
              .setArray("1000")
              .setReference("com.CellDO.COLHEADERWIDTHDO")
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
			case "widthlist" : return getWidthlistList();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}

	@SuppressWarnings("unchecked")
	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "widthlist" : setWidthlist((List<com.CellDO.COLHEADERWIDTHDO>)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		COLHEADERWIDTHLIST _COLHEADERWIDTHLIST = (COLHEADERWIDTHLIST) obj;
		if(this.widthlist == null) {
			if(_COLHEADERWIDTHLIST.getWidthlistList() != null)
				return false;
		}

		if(sizeWidthlist() != _COLHEADERWIDTHLIST.sizeWidthlist()) return false;
		else {
			for(int i = 0, n = sizeWidthlist(); i < n; i++ ){ 
                if(this.getWidthlist(i) == null && _COLHEADERWIDTHLIST.getWidthlist(i) != null) return false;
                if(this.getWidthlist(i) == null && _COLHEADERWIDTHLIST.getWidthlist(i) == null) continue;
                    
				if(!this.getWidthlist(i).equals(_COLHEADERWIDTHLIST.getWidthlist(i))) return false;
			}
		}
		return true;
	}

	@Override
	public int hashCode() {
		int prime  = 31;
		int result = 1;
		result     = prime * result + ((this.widthlist == null) ? 0 : this.widthlist.hashCode());
		return result;
	}
	
	@Override
	public void clear() {
		widthlist = null;	
		clearAllIsModified();
	}

	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}

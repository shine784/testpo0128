	
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
public class ROWHEADERWIDTHLIST extends DataObject {
	private static final String DTO_LOGICAL_NAME = "ROWHEADERWIDTHLIST";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public ROWHEADERWIDTHLIST() {
			super();
			
	}
	
	private transient boolean isModified = false;

	/**
	 * LogicalName : width배열
	 * Comments    : 
	 */
	private List<com.CellDO.ROWHEADERWIDTHDO> widthlist = null;
	
	public List<com.CellDO.ROWHEADERWIDTHDO> getWidthlistList() {
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
			widthlist = new ArrayList<com.CellDO.ROWHEADERWIDTHDO>(minCapacity);
		else
			((ArrayList<com.CellDO.ROWHEADERWIDTHDO>)widthlist).ensureCapacity( minCapacity );	
	}	
	public void createWidthlist(int _size) {
        if(widthlist == null) {
            ensureCapacityWidthlist(_size);
        } else {
            ((ArrayList<com.CellDO.ROWHEADERWIDTHDO>)widthlist).ensureCapacity(_size);
        }
		for(int i = widthlist.size(); i < _size; i++) {
			widthlist.add( new com.CellDO.ROWHEADERWIDTHDO());
			this.widthlist_modified = true;
		}
	}
	public ROWHEADERWIDTHLIST fillWidthlist(int _index) {
		ensureCapacityWidthlist(_index+1);
		for (int i = sizeWidthlist(); i <  _index + 1; i++) {
			this.widthlist.add(i, new com.CellDO.ROWHEADERWIDTHDO());
			this.widthlist_modified = true;
		}
		return this;
	}
	
	public int sizeWidthlist() {
		if(widthlist == null)
			return 0;
		
		return widthlist.size();
	}
	
	public com.CellDO.ROWHEADERWIDTHDO[] getWidthlist() {
		if(this.widthlist == null)
			return null;
		
		return (com.CellDO.ROWHEADERWIDTHDO[])widthlist.toArray(new com.CellDO.ROWHEADERWIDTHDO[widthlist.size()]);
	}
	public com.CellDO.ROWHEADERWIDTHDO getWidthlist(int _index) {
		return (com.CellDO.ROWHEADERWIDTHDO)widthlist.get(_index);
	}
	 
	public void setWidthlist(List<com.CellDO.ROWHEADERWIDTHDO> widthlist) {
		
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
	
	public void setWidthlist(com.CellDO.ROWHEADERWIDTHDO[] widthlist) {
		
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
	
	public void setWidthlist(int _index, com.CellDO.ROWHEADERWIDTHDO widthlist) {
		if(widthlist == null) {
			this.widthlist.set(_index, null);
		} else {
			this.widthlist.set(_index, widthlist);
		}
		this.widthlist_modified = true;
		this.isModified = true;
	}				
		
	
	public void addWidthlist(int _index, com.CellDO.ROWHEADERWIDTHDO widthlist) {
		if(this.widthlist == null)
			this.widthlist = new ArrayList<com.CellDO.ROWHEADERWIDTHDO>(1000);
		if(widthlist == null) {
			this.widthlist.add(_index, null);
		} else {
			this.widthlist.add(_index, widthlist);
		}
		this.widthlist_modified = true;
		this.isModified = true;
	}
		
	public void addWidthlist(com.CellDO.ROWHEADERWIDTHDO widthlist) {
		if(this.widthlist == null)
			this.widthlist = new ArrayList<com.CellDO.ROWHEADERWIDTHDO>(1000);
		if(widthlist == null) {
			this.widthlist.add(null);
		} else {
			this.widthlist.add(widthlist);
		}
		this.widthlist_modified = true;
		this.isModified = true;
	}
		
	
	public com.CellDO.ROWHEADERWIDTHDO removeWidthlist(int _index) {
		this.widthlist_modified = true;
		this.isModified = true;
		return (com.CellDO.ROWHEADERWIDTHDO)this.widthlist.remove(_index);
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
		ROWHEADERWIDTHLIST copyObj = new ROWHEADERWIDTHLIST();	
		copyObj.clone(this);
		return copyObj;
	}
	
	public void clone(DataObject _rOWHEADERWIDTHLIST) {
		if(this == _rOWHEADERWIDTHLIST) return;
		ROWHEADERWIDTHLIST __rOWHEADERWIDTHLIST = (ROWHEADERWIDTHLIST) _rOWHEADERWIDTHLIST;
		
		this.clearWidthlist();
        if(this.getWidthlist() == null && __rOWHEADERWIDTHLIST.getWidthlist() != null)
            this.ensureCapacityWidthlist(__rOWHEADERWIDTHLIST.sizeWidthlist());
        
		for (int index = 0; index < __rOWHEADERWIDTHLIST.sizeWidthlist(); index++) {
            com.CellDO.ROWHEADERWIDTHDO _value0 = __rOWHEADERWIDTHLIST.getWidthlist(index);
            if(_value0 == null) {
                this.addWidthlist(index, null);
            } else {
                this.addWidthlist(index, (com.CellDO.ROWHEADERWIDTHDO)_value0.clone());		
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
              .setReference("com.CellDO.ROWHEADERWIDTHDO")
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
			case "widthlist" : setWidthlist((List<com.CellDO.ROWHEADERWIDTHDO>)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		ROWHEADERWIDTHLIST _ROWHEADERWIDTHLIST = (ROWHEADERWIDTHLIST) obj;
		if(this.widthlist == null) {
			if(_ROWHEADERWIDTHLIST.getWidthlistList() != null)
				return false;
		}

		if(sizeWidthlist() != _ROWHEADERWIDTHLIST.sizeWidthlist()) return false;
		else {
			for(int i = 0, n = sizeWidthlist(); i < n; i++ ){ 
                if(this.getWidthlist(i) == null && _ROWHEADERWIDTHLIST.getWidthlist(i) != null) return false;
                if(this.getWidthlist(i) == null && _ROWHEADERWIDTHLIST.getWidthlist(i) == null) continue;
                    
				if(!this.getWidthlist(i).equals(_ROWHEADERWIDTHLIST.getWidthlist(i))) return false;
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

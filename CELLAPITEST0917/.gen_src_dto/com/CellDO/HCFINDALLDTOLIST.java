	
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
public class HCFINDALLDTOLIST extends DataObject {
	private static final String DTO_LOGICAL_NAME = "HCFINDALLDTOLIST";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public HCFINDALLDTOLIST() {
			super();
			
	}
	
	private transient boolean isModified = false;

	/**
	 * LogicalName : content
	 * Comments    : 
	 */
	private List<com.CellDO.HCFINDALLDTOGET> content = null;
	
	public List<com.CellDO.HCFINDALLDTOGET> getContentList() {
        if(content == null)
            return null;
		return this.content;
	}		
	private transient boolean content_nullable = true;
	
	public boolean isNullableContent() {
		return this.content_nullable;
	}
	
	private transient boolean content_invalidation = false;
	
	public void setInvalidationContent(boolean invalidation) { 
		this.content_invalidation = invalidation;
	}
	
	public boolean isInvalidationContent() {
		return this.content_invalidation;
	}
	
	private transient boolean content_modified = false;
	
	public boolean isModifiedContent() {
		if(this.content_modified) return true;
		for(int index=0; index < this.sizeContent(); index++) {
			if(this.getContent(index).isModified()) return true;
		}
		return false;
	}
	
	public void unModifiedContent() {
		this.content_modified = false;
	}
	
	public void clearContent() {
		if(content != null)
			content.clear();
		this.content_modified = false;
	}
	
	public void ensureCapacityContent(int minCapacity) {
		if(content == null)
			content = new ArrayList<com.CellDO.HCFINDALLDTOGET>(minCapacity);
		else
			((ArrayList<com.CellDO.HCFINDALLDTOGET>)content).ensureCapacity( minCapacity );	
	}	
	public void createContent(int _size) {
        if(content == null) {
            ensureCapacityContent(_size);
        } else {
            ((ArrayList<com.CellDO.HCFINDALLDTOGET>)content).ensureCapacity(_size);
        }
		for(int i = content.size(); i < _size; i++) {
			content.add( new com.CellDO.HCFINDALLDTOGET());
			this.content_modified = true;
		}
	}
	public HCFINDALLDTOLIST fillContent(int _index) {
		ensureCapacityContent(_index+1);
		for (int i = sizeContent(); i <  _index + 1; i++) {
			this.content.add(i, new com.CellDO.HCFINDALLDTOGET());
			this.content_modified = true;
		}
		return this;
	}
	
	public int sizeContent() {
		if(content == null)
			return 0;
		
		return content.size();
	}
	
	public com.CellDO.HCFINDALLDTOGET[] getContent() {
		if(this.content == null)
			return null;
		
		return (com.CellDO.HCFINDALLDTOGET[])content.toArray(new com.CellDO.HCFINDALLDTOGET[content.size()]);
	}
	public com.CellDO.HCFINDALLDTOGET getContent(int _index) {
		return (com.CellDO.HCFINDALLDTOGET)content.get(_index);
	}
	 
	public void setContent(List<com.CellDO.HCFINDALLDTOGET> content) {
		
		if(content == null) {
			this.content = null;
		} else {
			ensureCapacityContent(content.size());
            this.content.clear();
			for(int i = 0, n=content.size(); i < n; i++) {
				if( content.get(i) == null ) {
					this.content.add(null);
				}
				else {
					this.content.add(content.get(i));
				}
			}
		}
		this.content_modified = true;
		this.isModified = true;
	}
	
	public void setContent(com.CellDO.HCFINDALLDTOGET[] content) {
		
		if(content == null) {
			this.content = null;
		} else {
			ensureCapacityContent(content.length);
            this.content.clear();
			for(int i = 0, n=content.length; i < n; i++) {
				if( content[i] == null ) {
					this.content.add(null);
				}
				else {
					this.content.add(content[i]);
				}
			}
		}
		this.content_modified = true;
		this.isModified = true;
	}
	
	public void setContent(int _index, com.CellDO.HCFINDALLDTOGET content) {
		if(content == null) {
			this.content.set(_index, null);
		} else {
			this.content.set(_index, content);
		}
		this.content_modified = true;
		this.isModified = true;
	}				
		
	
	public void addContent(int _index, com.CellDO.HCFINDALLDTOGET content) {
		if(this.content == null)
			this.content = new ArrayList<com.CellDO.HCFINDALLDTOGET>(50);
		if(content == null) {
			this.content.add(_index, null);
		} else {
			this.content.add(_index, content);
		}
		this.content_modified = true;
		this.isModified = true;
	}
		
	public void addContent(com.CellDO.HCFINDALLDTOGET content) {
		if(this.content == null)
			this.content = new ArrayList<com.CellDO.HCFINDALLDTOGET>(50);
		if(content == null) {
			this.content.add(null);
		} else {
			this.content.add(content);
		}
		this.content_modified = true;
		this.isModified = true;
	}
		
	
	public com.CellDO.HCFINDALLDTOGET removeContent(int _index) {
		this.content_modified = true;
		this.isModified = true;
		return (com.CellDO.HCFINDALLDTOGET)this.content.remove(_index);
	}


	@Override
	public void clearAllIsModified() {
		this.content_modified = false;
		for(int index=0; index < this.sizeContent(); index++) {
			if(this.getContent(index) != null)
				this.getContent(index).clearAllIsModified();
		}
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.content_modified == true)
			modifiedFields.add("content");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	}
	 
	public Object clone() {
		HCFINDALLDTOLIST copyObj = new HCFINDALLDTOLIST();	
		copyObj.clone(this);
		return copyObj;
	}
	
	public void clone(DataObject _hCFINDALLDTOLIST) {
		if(this == _hCFINDALLDTOLIST) return;
		HCFINDALLDTOLIST __hCFINDALLDTOLIST = (HCFINDALLDTOLIST) _hCFINDALLDTOLIST;
		
		this.clearContent();
        if(this.getContent() == null && __hCFINDALLDTOLIST.getContent() != null)
            this.ensureCapacityContent(__hCFINDALLDTOLIST.sizeContent());
        
		for (int index = 0; index < __hCFINDALLDTOLIST.sizeContent(); index++) {
            com.CellDO.HCFINDALLDTOGET _value0 = __hCFINDALLDTOLIST.getContent(index);
            if(_value0 == null) {
                this.addContent(index, null);
            } else {
                this.addContent(index, (com.CellDO.HCFINDALLDTOGET)_value0.clone());		
            }
		}
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
		
		buffer.append("content [");
		for (int index = 0; index < sizeContent(); index++) {
			buffer.append("(").append(index).append(") : ").append(getContent(index)).append(" ");
		}

		buffer.append("]");
		buffer.append("\n");
		return buffer.toString();
	}
	
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(1);
		fieldPropertyMap.put("content", FieldProperty.builder()
              .setPhysicalName("content")
              .setLogicalName("content")
              .setType(FieldProperty.TYPE_ABSTRACT_INCLUDE)
              .setDecimal(-1)
              .setArray("50")
              .setReference("com.CellDO.HCFINDALLDTOGET")
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
			case "content" : return getContentList();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}

	@SuppressWarnings("unchecked")
	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "content" : setContent((List<com.CellDO.HCFINDALLDTOGET>)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		HCFINDALLDTOLIST _HCFINDALLDTOLIST = (HCFINDALLDTOLIST) obj;
		if(this.content == null) {
			if(_HCFINDALLDTOLIST.getContentList() != null)
				return false;
		}

		if(sizeContent() != _HCFINDALLDTOLIST.sizeContent()) return false;
		else {
			for(int i = 0, n = sizeContent(); i < n; i++ ){ 
                if(this.getContent(i) == null && _HCFINDALLDTOLIST.getContent(i) != null) return false;
                if(this.getContent(i) == null && _HCFINDALLDTOLIST.getContent(i) == null) continue;
                    
				if(!this.getContent(i).equals(_HCFINDALLDTOLIST.getContent(i))) return false;
			}
		}
		return true;
	}

	@Override
	public int hashCode() {
		int prime  = 31;
		int result = 1;
		result     = prime * result + ((this.content == null) ? 0 : this.content.hashCode());
		return result;
	}
	
	@Override
	public void clear() {
		content = null;	
		clearAllIsModified();
	}

	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}

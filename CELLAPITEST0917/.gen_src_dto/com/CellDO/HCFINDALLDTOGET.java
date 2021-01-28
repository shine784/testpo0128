	
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
public class HCFINDALLDTOGET extends DataObject {
	private static final String DTO_LOGICAL_NAME = "HCFINDALLDTOGET";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public HCFINDALLDTOGET() {
			super();
			
	}
	
	private transient boolean isModified = false;

	/**
	 * LogicalName : id
	 * Comments    : id
	 */		

	private String id = null;
	
	private transient boolean id_nullable = true;
	
	public boolean isNullableId() {
		return this.id_nullable;
	}
	
	private transient boolean id_invalidation = false;
	
	public void setInvalidationId(boolean invalidation) { 
		this.id_invalidation = invalidation;
	}
	
	public boolean isInvalidationId() {
		return this.id_invalidation;
	}
	
	private transient boolean id_modified = false;
	

	public boolean isModifiedId() {
		return this.id_modified;
	}
	
	public void unModifiedId() {
		this.id_modified = false;
	}

	public FieldProperty getIdFieldProperty() {
		return fieldPropertyMap.get("id");
	}

	public String getId() {
		return id;
	}
	public String getNvlId() {
		if(getId() == null) {
			return EMPTY_STRING;
		} else {
			return getId();
		}
	}
	
	public void setId(String id) {
		if(id == null) {
			this.id = null;
		} else {
			this.id = id;
		}
		this.id_modified = true;
		this.isModified = true;
	}		


	/**
	 * LogicalName : child_id
	 * Comments    : child_id
	 */		

	private String childId = null;
	
	private transient boolean childId_nullable = true;
	
	public boolean isNullableChildId() {
		return this.childId_nullable;
	}
	
	private transient boolean childId_invalidation = false;
	
	public void setInvalidationChildId(boolean invalidation) { 
		this.childId_invalidation = invalidation;
	}
	
	public boolean isInvalidationChildId() {
		return this.childId_invalidation;
	}
	
	private transient boolean childId_modified = false;
	

	public boolean isModifiedChildId() {
		return this.childId_modified;
	}
	
	public void unModifiedChildId() {
		this.childId_modified = false;
	}

	public FieldProperty getChildIdFieldProperty() {
		return fieldPropertyMap.get("childId");
	}

	public String getChildId() {
		return childId;
	}
	public String getNvlChildId() {
		if(getChildId() == null) {
			return EMPTY_STRING;
		} else {
			return getChildId();
		}
	}
	
	public void setChildId(String childId) {
		if(childId == null) {
			this.childId = null;
		} else {
			this.childId = childId;
		}
		this.childId_modified = true;
		this.isModified = true;
	}		


	/**
	 * LogicalName : next_id
	 * Comments    : next_id
	 */		

	private String nextId = null;
	
	private transient boolean nextId_nullable = true;
	
	public boolean isNullableNextId() {
		return this.nextId_nullable;
	}
	
	private transient boolean nextId_invalidation = false;
	
	public void setInvalidationNextId(boolean invalidation) { 
		this.nextId_invalidation = invalidation;
	}
	
	public boolean isInvalidationNextId() {
		return this.nextId_invalidation;
	}
	
	private transient boolean nextId_modified = false;
	

	public boolean isModifiedNextId() {
		return this.nextId_modified;
	}
	
	public void unModifiedNextId() {
		this.nextId_modified = false;
	}

	public FieldProperty getNextIdFieldProperty() {
		return fieldPropertyMap.get("nextId");
	}

	public String getNextId() {
		return nextId;
	}
	public String getNvlNextId() {
		if(getNextId() == null) {
			return EMPTY_STRING;
		} else {
			return getNextId();
		}
	}
	
	public void setNextId(String nextId) {
		if(nextId == null) {
			this.nextId = null;
		} else {
			this.nextId = nextId;
		}
		this.nextId_modified = true;
		this.isModified = true;
	}		


	/**
	 * LogicalName : content_data
	 * Comments    : content_data
	 */		

	private String contentData = null;
	
	private transient boolean contentData_nullable = true;
	
	public boolean isNullableContentData() {
		return this.contentData_nullable;
	}
	
	private transient boolean contentData_invalidation = false;
	
	public void setInvalidationContentData(boolean invalidation) { 
		this.contentData_invalidation = invalidation;
	}
	
	public boolean isInvalidationContentData() {
		return this.contentData_invalidation;
	}
	
	private transient boolean contentData_modified = false;
	

	public boolean isModifiedContentData() {
		return this.contentData_modified;
	}
	
	public void unModifiedContentData() {
		this.contentData_modified = false;
	}

	public FieldProperty getContentDataFieldProperty() {
		return fieldPropertyMap.get("contentData");
	}

	public String getContentData() {
		return contentData;
	}
	public String getNvlContentData() {
		if(getContentData() == null) {
			return EMPTY_STRING;
		} else {
			return getContentData();
		}
	}
	
	public void setContentData(String contentData) {
		if(contentData == null) {
			this.contentData = null;
		} else {
			this.contentData = contentData;
		}
		this.contentData_modified = true;
		this.isModified = true;
	}		


	/**
	 * LogicalName : content_type
	 * Comments    : content_type
	 */		

	private String contentType = null;
	
	private transient boolean contentType_nullable = true;
	
	public boolean isNullableContentType() {
		return this.contentType_nullable;
	}
	
	private transient boolean contentType_invalidation = false;
	
	public void setInvalidationContentType(boolean invalidation) { 
		this.contentType_invalidation = invalidation;
	}
	
	public boolean isInvalidationContentType() {
		return this.contentType_invalidation;
	}
	
	private transient boolean contentType_modified = false;
	

	public boolean isModifiedContentType() {
		return this.contentType_modified;
	}
	
	public void unModifiedContentType() {
		this.contentType_modified = false;
	}

	public FieldProperty getContentTypeFieldProperty() {
		return fieldPropertyMap.get("contentType");
	}

	public String getContentType() {
		return contentType;
	}
	public String getNvlContentType() {
		if(getContentType() == null) {
			return EMPTY_STRING;
		} else {
			return getContentType();
		}
	}
	
	public void setContentType(String contentType) {
		if(contentType == null) {
			this.contentType = null;
		} else {
			this.contentType = contentType;
		}
		this.contentType_modified = true;
		this.isModified = true;
	}		


	@Override
	public void clearAllIsModified() {
		this.id_modified = false;
		this.childId_modified = false;
		this.nextId_modified = false;
		this.contentData_modified = false;
		this.contentType_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.id_modified == true)
			modifiedFields.add("id");
		if(this.childId_modified == true)
			modifiedFields.add("childId");
		if(this.nextId_modified == true)
			modifiedFields.add("nextId");
		if(this.contentData_modified == true)
			modifiedFields.add("contentData");
		if(this.contentType_modified == true)
			modifiedFields.add("contentType");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	}
	 
	public Object clone() {
		HCFINDALLDTOGET copyObj = new HCFINDALLDTOGET();	
		copyObj.clone(this);
		return copyObj;
	}
	
	public void clone(DataObject _hCFINDALLDTOGET) {
		if(this == _hCFINDALLDTOGET) return;
		HCFINDALLDTOGET __hCFINDALLDTOGET = (HCFINDALLDTOGET) _hCFINDALLDTOGET;
		
		this.setId(__hCFINDALLDTOGET.getId());
		this.setChildId(__hCFINDALLDTOGET.getChildId());
		this.setNextId(__hCFINDALLDTOGET.getNextId());
		this.setContentData(__hCFINDALLDTOGET.getContentData());
		this.setContentType(__hCFINDALLDTOGET.getContentType());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("id : ").append(id).append("\n");				
		buffer.append("childId : ").append(childId).append("\n");				
		buffer.append("nextId : ").append(nextId).append("\n");				
		buffer.append("contentData : ").append(contentData).append("\n");				
		buffer.append("contentType : ").append(contentType).append("\n");		
		return buffer.toString();
	}
	
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(5);
		fieldPropertyMap.put("id", FieldProperty.builder()
              .setPhysicalName("id")
              .setLogicalName("id")
              .setType(FieldProperty.TYPE_OBJECT_STRING)
              .setLength(20)
              .setDecimal(-1)
              .build());
		fieldPropertyMap.put("childId", FieldProperty.builder()
              .setPhysicalName("childId")
              .setLogicalName("child_id")
              .setType(FieldProperty.TYPE_OBJECT_STRING)
              .setLength(20)
              .setDecimal(-1)
              .build());
		fieldPropertyMap.put("nextId", FieldProperty.builder()
              .setPhysicalName("nextId")
              .setLogicalName("next_id")
              .setType(FieldProperty.TYPE_OBJECT_STRING)
              .setLength(20)
              .setDecimal(-1)
              .build());
		fieldPropertyMap.put("contentData", FieldProperty.builder()
              .setPhysicalName("contentData")
              .setLogicalName("content_data")
              .setType(FieldProperty.TYPE_OBJECT_STRING)
              .setLength(10000)
              .setDecimal(-1)
              .build());
		fieldPropertyMap.put("contentType", FieldProperty.builder()
              .setPhysicalName("contentType")
              .setLogicalName("content_type")
              .setType(FieldProperty.TYPE_OBJECT_STRING)
              .setLength(20)
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
			case "id" : return getId();
			case "childId" : return getChildId();
			case "nextId" : return getNextId();
			case "contentData" : return getContentData();
			case "contentType" : return getContentType();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}

	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "id" : setId((String)arg);break;
			case "childId" : setChildId((String)arg);break;
			case "nextId" : setNextId((String)arg);break;
			case "contentData" : setContentData((String)arg);break;
			case "contentType" : setContentType((String)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		HCFINDALLDTOGET _HCFINDALLDTOGET = (HCFINDALLDTOGET) obj;
		if(this.id == null) {
			if(_HCFINDALLDTOGET.getId() != null)
				return false;
		} else if(!this.id.equals(_HCFINDALLDTOGET.getId()))
			return false;
		if(this.childId == null) {
			if(_HCFINDALLDTOGET.getChildId() != null)
				return false;
		} else if(!this.childId.equals(_HCFINDALLDTOGET.getChildId()))
			return false;
		if(this.nextId == null) {
			if(_HCFINDALLDTOGET.getNextId() != null)
				return false;
		} else if(!this.nextId.equals(_HCFINDALLDTOGET.getNextId()))
			return false;
		if(this.contentData == null) {
			if(_HCFINDALLDTOGET.getContentData() != null)
				return false;
		} else if(!this.contentData.equals(_HCFINDALLDTOGET.getContentData()))
			return false;
		if(this.contentType == null) {
			if(_HCFINDALLDTOGET.getContentType() != null)
				return false;
		} else if(!this.contentType.equals(_HCFINDALLDTOGET.getContentType()))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		int prime  = 31;
		int result = 1;					
		result     = prime * result + ((this.id == null) ? 0 : this.id.hashCode());					
		result     = prime * result + ((this.childId == null) ? 0 : this.childId.hashCode());					
		result     = prime * result + ((this.nextId == null) ? 0 : this.nextId.hashCode());					
		result     = prime * result + ((this.contentData == null) ? 0 : this.contentData.hashCode());					
		result     = prime * result + ((this.contentType == null) ? 0 : this.contentType.hashCode());
		return result;
	}
	
	@Override
	public void clear() {
		id = null;
		childId = null;
		nextId = null;
		contentData = null;
		contentType = null;	
		clearAllIsModified();
	}

	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}

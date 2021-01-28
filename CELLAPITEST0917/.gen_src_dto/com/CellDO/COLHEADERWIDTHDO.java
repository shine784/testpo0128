	
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
public class COLHEADERWIDTHDO extends DataObject {
	private static final String DTO_LOGICAL_NAME = "COLHEADERWIDTHDO";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public COLHEADERWIDTHDO() {
			super();
			
	}
	
	private transient boolean isModified = false;

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


	/**
	 * LogicalName : xwidth
	 * Comments    : 
	 */		

	private int xwidth = 0;
	
	private transient boolean xwidth_nullable = false;
	
	public boolean isNullableXwidth() {
		return this.xwidth_nullable;
	}
	
	private transient boolean xwidth_invalidation = false;
	
	public void setInvalidationXwidth(boolean invalidation) { 
		this.xwidth_invalidation = invalidation;
	}
	
	public boolean isInvalidationXwidth() {
		return this.xwidth_invalidation;
	}
	
	private transient boolean xwidth_modified = false;
	

	public boolean isModifiedXwidth() {
		return this.xwidth_modified;
	}
	
	public void unModifiedXwidth() {
		this.xwidth_modified = false;
	}

	public FieldProperty getXwidthFieldProperty() {
		return fieldPropertyMap.get("xwidth");
	}

	public int getXwidth() {
		return xwidth;
	}
	
	public void setXwidth(int xwidth) {
	this.xwidth = xwidth;
	this.xwidth_modified = true;
	this.isModified = true;
	}
	public void setXwidth(Integer xwidth) {
		if( xwidth == null) {
			this.xwidth = 0;
		} else{
			this.xwidth = xwidth.intValue();
		}
		this.xwidth_modified = true;
		this.isModified = true;
	}
	public void setXwidth(String xwidth) {
		if  (xwidth==null || xwidth.length() == 0) {
			this.xwidth = 0;
		} else {
			this.xwidth = Integer.parseInt(xwidth);
		}
		this.xwidth_modified = true;
		this.isModified = true;
	}		


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
		this.xname_modified = false;
		this.xwidth_modified = false;
		this.xpos_modified = false;
		this.fromh_modified = false;
		this.toh_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.xname_modified == true)
			modifiedFields.add("xname");
		if(this.xwidth_modified == true)
			modifiedFields.add("xwidth");
		if(this.xpos_modified == true)
			modifiedFields.add("xpos");
		if(this.fromh_modified == true)
			modifiedFields.add("fromh");
		if(this.toh_modified == true)
			modifiedFields.add("toh");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	}
	 
	public Object clone() {
		COLHEADERWIDTHDO copyObj = new COLHEADERWIDTHDO();	
		copyObj.clone(this);
		return copyObj;
	}
	
	public void clone(DataObject _cOLHEADERWIDTHDO) {
		if(this == _cOLHEADERWIDTHDO) return;
		COLHEADERWIDTHDO __cOLHEADERWIDTHDO = (COLHEADERWIDTHDO) _cOLHEADERWIDTHDO;
		
		this.setXname(__cOLHEADERWIDTHDO.getXname());
		this.setXwidth(__cOLHEADERWIDTHDO.getXwidth());
		this.setXpos(__cOLHEADERWIDTHDO.getXpos());
		this.setFromh(__cOLHEADERWIDTHDO.getFromh());
		this.setToh(__cOLHEADERWIDTHDO.getToh());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("xname : ").append(xname).append("\n");				
		buffer.append("xwidth : ").append(xwidth).append("\n");				
		buffer.append("xpos : ").append(xpos).append("\n");				
		buffer.append("fromh : ").append(fromh).append("\n");				
		buffer.append("toh : ").append(toh).append("\n");		
		return buffer.toString();
	}
	
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(5);
		fieldPropertyMap.put("xname", FieldProperty.builder()
              .setPhysicalName("xname")
              .setLogicalName("xname")
              .setType(FieldProperty.TYPE_OBJECT_STRING)
              .setLength(10)
              .setDecimal(-1)
              .build());
		fieldPropertyMap.put("xwidth", FieldProperty.builder()
              .setPhysicalName("xwidth")
              .setLogicalName("xwidth")
              .setType(FieldProperty.TYPE_PRIMITIVE_INT)
              .setLength(10)
              .setDecimal(-1)
              .build());
		fieldPropertyMap.put("xpos", FieldProperty.builder()
              .setPhysicalName("xpos")
              .setLogicalName("xpos")
              .setType(FieldProperty.TYPE_PRIMITIVE_INT)
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
			case "xname" : return getXname();
			case "xwidth" : return getXwidth();
			case "xpos" : return getXpos();
			case "fromh" : return getFromh();
			case "toh" : return getToh();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}

	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "xname" : setXname((String)arg);break;
			case "xwidth" : setXwidth((Integer)arg);break;
			case "xpos" : setXpos((Integer)arg);break;
			case "fromh" : setFromh((String)arg);break;
			case "toh" : setToh((String)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		COLHEADERWIDTHDO _COLHEADERWIDTHDO = (COLHEADERWIDTHDO) obj;
		if(this.xname == null) {
			if(_COLHEADERWIDTHDO.getXname() != null)
				return false;
		} else if(!this.xname.equals(_COLHEADERWIDTHDO.getXname()))
			return false;				
		if(this.xwidth != _COLHEADERWIDTHDO.getXwidth()) return false;				
		if(this.xpos != _COLHEADERWIDTHDO.getXpos()) return false;
		if(this.fromh == null) {
			if(_COLHEADERWIDTHDO.getFromh() != null)
				return false;
		} else if(!this.fromh.equals(_COLHEADERWIDTHDO.getFromh()))
			return false;
		if(this.toh == null) {
			if(_COLHEADERWIDTHDO.getToh() != null)
				return false;
		} else if(!this.toh.equals(_COLHEADERWIDTHDO.getToh()))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		int prime  = 31;
		int result = 1;					
		result     = prime * result + ((this.xname == null) ? 0 : this.xname.hashCode());
		result     = prime * result + this.xwidth;
		result     = prime * result + this.xpos;					
		result     = prime * result + ((this.fromh == null) ? 0 : this.fromh.hashCode());					
		result     = prime * result + ((this.toh == null) ? 0 : this.toh.hashCode());
		return result;
	}
	
	@Override
	public void clear() {
		xname = null;
		xwidth = 0;
		xpos = 0;
		fromh = null;
		toh = null;	
		clearAllIsModified();
	}

	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}

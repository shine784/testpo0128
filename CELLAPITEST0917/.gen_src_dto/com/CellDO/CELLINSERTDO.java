	
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
public class CELLINSERTDO extends DataObject {
	private static final String DTO_LOGICAL_NAME = "CELLINSERTDO";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public CELLINSERTDO() {
			super();
			
	}
	
	private transient boolean isModified = false;

	/**
	 * LogicalName : ypos
	 * Comments    : ypos
	 */		

	private int ypos = 0;
	
	private transient boolean ypos_nullable = false;
	
	public boolean isNullableYpos() {
		return this.ypos_nullable;
	}
	
	private transient boolean ypos_invalidation = false;
	
	public void setInvalidationYpos(boolean invalidation) { 
		this.ypos_invalidation = invalidation;
	}
	
	public boolean isInvalidationYpos() {
		return this.ypos_invalidation;
	}
	
	private transient boolean ypos_modified = false;
	

	public boolean isModifiedYpos() {
		return this.ypos_modified;
	}
	
	public void unModifiedYpos() {
		this.ypos_modified = false;
	}

	public FieldProperty getYposFieldProperty() {
		return fieldPropertyMap.get("ypos");
	}

	public int getYpos() {
		return ypos;
	}
	
	public void setYpos(int ypos) {
	this.ypos = ypos;
	this.ypos_modified = true;
	this.isModified = true;
	}
	public void setYpos(Integer ypos) {
		if( ypos == null) {
			this.ypos = 0;
		} else{
			this.ypos = ypos.intValue();
		}
		this.ypos_modified = true;
		this.isModified = true;
	}
	public void setYpos(String ypos) {
		if  (ypos==null || ypos.length() == 0) {
			this.ypos = 0;
		} else {
			this.ypos = Integer.parseInt(ypos);
		}
		this.ypos_modified = true;
		this.isModified = true;
	}		


	/**
	 * LogicalName : stringdata
	 * Comments    : stringdata
	 */		

	private String stringdata = null;
	
	private transient boolean stringdata_nullable = true;
	
	public boolean isNullableStringdata() {
		return this.stringdata_nullable;
	}
	
	private transient boolean stringdata_invalidation = false;
	
	public void setInvalidationStringdata(boolean invalidation) { 
		this.stringdata_invalidation = invalidation;
	}
	
	public boolean isInvalidationStringdata() {
		return this.stringdata_invalidation;
	}
	
	private transient boolean stringdata_modified = false;
	

	public boolean isModifiedStringdata() {
		return this.stringdata_modified;
	}
	
	public void unModifiedStringdata() {
		this.stringdata_modified = false;
	}

	public FieldProperty getStringdataFieldProperty() {
		return fieldPropertyMap.get("stringdata");
	}

	public String getStringdata() {
		return stringdata;
	}
	public String getNvlStringdata() {
		if(getStringdata() == null) {
			return EMPTY_STRING;
		} else {
			return getStringdata();
		}
	}
	
	public void setStringdata(String stringdata) {
		if(stringdata == null) {
			this.stringdata = null;
		} else {
			this.stringdata = stringdata;
		}
		this.stringdata_modified = true;
		this.isModified = true;
	}		


	/**
	 * LogicalName : doubledata
	 * Comments    : doubledata
	 */		

	private int doubledata = 0;
	
	private transient boolean doubledata_nullable = false;
	
	public boolean isNullableDoubledata() {
		return this.doubledata_nullable;
	}
	
	private transient boolean doubledata_invalidation = false;
	
	public void setInvalidationDoubledata(boolean invalidation) { 
		this.doubledata_invalidation = invalidation;
	}
	
	public boolean isInvalidationDoubledata() {
		return this.doubledata_invalidation;
	}
	
	private transient boolean doubledata_modified = false;
	

	public boolean isModifiedDoubledata() {
		return this.doubledata_modified;
	}
	
	public void unModifiedDoubledata() {
		this.doubledata_modified = false;
	}

	public FieldProperty getDoubledataFieldProperty() {
		return fieldPropertyMap.get("doubledata");
	}

	public int getDoubledata() {
		return doubledata;
	}
	
	public void setDoubledata(int doubledata) {
	this.doubledata = doubledata;
	this.doubledata_modified = true;
	this.isModified = true;
	}
	public void setDoubledata(Integer doubledata) {
		if( doubledata == null) {
			this.doubledata = 0;
		} else{
			this.doubledata = doubledata.intValue();
		}
		this.doubledata_modified = true;
		this.isModified = true;
	}
	public void setDoubledata(String doubledata) {
		if  (doubledata==null || doubledata.length() == 0) {
			this.doubledata = 0;
		} else {
			this.doubledata = Integer.parseInt(doubledata);
		}
		this.doubledata_modified = true;
		this.isModified = true;
	}		


	/**
	 * LogicalName : formula
	 * Comments    : formula
	 */		

	private String formula = null;
	
	private transient boolean formula_nullable = true;
	
	public boolean isNullableFormula() {
		return this.formula_nullable;
	}
	
	private transient boolean formula_invalidation = false;
	
	public void setInvalidationFormula(boolean invalidation) { 
		this.formula_invalidation = invalidation;
	}
	
	public boolean isInvalidationFormula() {
		return this.formula_invalidation;
	}
	
	private transient boolean formula_modified = false;
	

	public boolean isModifiedFormula() {
		return this.formula_modified;
	}
	
	public void unModifiedFormula() {
		this.formula_modified = false;
	}

	public FieldProperty getFormulaFieldProperty() {
		return fieldPropertyMap.get("formula");
	}

	public String getFormula() {
		return formula;
	}
	public String getNvlFormula() {
		if(getFormula() == null) {
			return EMPTY_STRING;
		} else {
			return getFormula();
		}
	}
	
	public void setFormula(String formula) {
		if(formula == null) {
			this.formula = null;
		} else {
			this.formula = formula;
		}
		this.formula_modified = true;
		this.isModified = true;
	}		


	/**
	 * LogicalName : style
	 * Comments    : style
	 */		

	private String style = null;
	
	private transient boolean style_nullable = true;
	
	public boolean isNullableStyle() {
		return this.style_nullable;
	}
	
	private transient boolean style_invalidation = false;
	
	public void setInvalidationStyle(boolean invalidation) { 
		this.style_invalidation = invalidation;
	}
	
	public boolean isInvalidationStyle() {
		return this.style_invalidation;
	}
	
	private transient boolean style_modified = false;
	

	public boolean isModifiedStyle() {
		return this.style_modified;
	}
	
	public void unModifiedStyle() {
		this.style_modified = false;
	}

	public FieldProperty getStyleFieldProperty() {
		return fieldPropertyMap.get("style");
	}

	public String getStyle() {
		return style;
	}
	public String getNvlStyle() {
		if(getStyle() == null) {
			return EMPTY_STRING;
		} else {
			return getStyle();
		}
	}
	
	public void setStyle(String style) {
		if(style == null) {
			this.style = null;
		} else {
			this.style = style;
		}
		this.style_modified = true;
		this.isModified = true;
	}		


	/**
	 * LogicalName : chain
	 * Comments    : chain
	 */		

	private String chain = null;
	
	private transient boolean chain_nullable = true;
	
	public boolean isNullableChain() {
		return this.chain_nullable;
	}
	
	private transient boolean chain_invalidation = false;
	
	public void setInvalidationChain(boolean invalidation) { 
		this.chain_invalidation = invalidation;
	}
	
	public boolean isInvalidationChain() {
		return this.chain_invalidation;
	}
	
	private transient boolean chain_modified = false;
	

	public boolean isModifiedChain() {
		return this.chain_modified;
	}
	
	public void unModifiedChain() {
		this.chain_modified = false;
	}

	public FieldProperty getChainFieldProperty() {
		return fieldPropertyMap.get("chain");
	}

	public String getChain() {
		return chain;
	}
	public String getNvlChain() {
		if(getChain() == null) {
			return EMPTY_STRING;
		} else {
			return getChain();
		}
	}
	
	public void setChain(String chain) {
		if(chain == null) {
			this.chain = null;
		} else {
			this.chain = chain;
		}
		this.chain_modified = true;
		this.isModified = true;
	}		


	/**
	 * LogicalName : datatype
	 * Comments    : datatype
	 */		

	private String datatype = null;
	
	private transient boolean datatype_nullable = true;
	
	public boolean isNullableDatatype() {
		return this.datatype_nullable;
	}
	
	private transient boolean datatype_invalidation = false;
	
	public void setInvalidationDatatype(boolean invalidation) { 
		this.datatype_invalidation = invalidation;
	}
	
	public boolean isInvalidationDatatype() {
		return this.datatype_invalidation;
	}
	
	private transient boolean datatype_modified = false;
	

	public boolean isModifiedDatatype() {
		return this.datatype_modified;
	}
	
	public void unModifiedDatatype() {
		this.datatype_modified = false;
	}

	public FieldProperty getDatatypeFieldProperty() {
		return fieldPropertyMap.get("datatype");
	}

	public String getDatatype() {
		return datatype;
	}
	public String getNvlDatatype() {
		if(getDatatype() == null) {
			return EMPTY_STRING;
		} else {
			return getDatatype();
		}
	}
	
	public void setDatatype(String datatype) {
		if(datatype == null) {
			this.datatype = null;
		} else {
			this.datatype = datatype;
		}
		this.datatype_modified = true;
		this.isModified = true;
	}		


	/**
	 * LogicalName : cellkey
	 * Comments    : cellkey
	 */		

	private String cellkey = null;
	
	private transient boolean cellkey_nullable = true;
	
	public boolean isNullableCellkey() {
		return this.cellkey_nullable;
	}
	
	private transient boolean cellkey_invalidation = false;
	
	public void setInvalidationCellkey(boolean invalidation) { 
		this.cellkey_invalidation = invalidation;
	}
	
	public boolean isInvalidationCellkey() {
		return this.cellkey_invalidation;
	}
	
	private transient boolean cellkey_modified = false;
	

	public boolean isModifiedCellkey() {
		return this.cellkey_modified;
	}
	
	public void unModifiedCellkey() {
		this.cellkey_modified = false;
	}

	public FieldProperty getCellkeyFieldProperty() {
		return fieldPropertyMap.get("cellkey");
	}

	public String getCellkey() {
		return cellkey;
	}
	public String getNvlCellkey() {
		if(getCellkey() == null) {
			return EMPTY_STRING;
		} else {
			return getCellkey();
		}
	}
	
	public void setCellkey(String cellkey) {
		if(cellkey == null) {
			this.cellkey = null;
		} else {
			this.cellkey = cellkey;
		}
		this.cellkey_modified = true;
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


	@Override
	public void clearAllIsModified() {
		this.ypos_modified = false;
		this.stringdata_modified = false;
		this.doubledata_modified = false;
		this.formula_modified = false;
		this.style_modified = false;
		this.chain_modified = false;
		this.datatype_modified = false;
		this.cellkey_modified = false;
		this.xpos_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.ypos_modified == true)
			modifiedFields.add("ypos");
		if(this.stringdata_modified == true)
			modifiedFields.add("stringdata");
		if(this.doubledata_modified == true)
			modifiedFields.add("doubledata");
		if(this.formula_modified == true)
			modifiedFields.add("formula");
		if(this.style_modified == true)
			modifiedFields.add("style");
		if(this.chain_modified == true)
			modifiedFields.add("chain");
		if(this.datatype_modified == true)
			modifiedFields.add("datatype");
		if(this.cellkey_modified == true)
			modifiedFields.add("cellkey");
		if(this.xpos_modified == true)
			modifiedFields.add("xpos");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	}
	 
	public Object clone() {
		CELLINSERTDO copyObj = new CELLINSERTDO();	
		copyObj.clone(this);
		return copyObj;
	}
	
	public void clone(DataObject _cELLINSERTDO) {
		if(this == _cELLINSERTDO) return;
		CELLINSERTDO __cELLINSERTDO = (CELLINSERTDO) _cELLINSERTDO;
		
		this.setYpos(__cELLINSERTDO.getYpos());
		this.setStringdata(__cELLINSERTDO.getStringdata());
		this.setDoubledata(__cELLINSERTDO.getDoubledata());
		this.setFormula(__cELLINSERTDO.getFormula());
		this.setStyle(__cELLINSERTDO.getStyle());
		this.setChain(__cELLINSERTDO.getChain());
		this.setDatatype(__cELLINSERTDO.getDatatype());
		this.setCellkey(__cELLINSERTDO.getCellkey());
		this.setXpos(__cELLINSERTDO.getXpos());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("ypos : ").append(ypos).append("\n");				
		buffer.append("stringdata : ").append(stringdata).append("\n");				
		buffer.append("doubledata : ").append(doubledata).append("\n");				
		buffer.append("formula : ").append(formula).append("\n");				
		buffer.append("style : ").append(style).append("\n");				
		buffer.append("chain : ").append(chain).append("\n");				
		buffer.append("datatype : ").append(datatype).append("\n");				
		buffer.append("cellkey : ").append(cellkey).append("\n");				
		buffer.append("xpos : ").append(xpos).append("\n");		
		return buffer.toString();
	}
	
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(9);
		fieldPropertyMap.put("ypos", FieldProperty.builder()
              .setPhysicalName("ypos")
              .setLogicalName("ypos")
              .setType(FieldProperty.TYPE_PRIMITIVE_INT)
              .setLength(10)
              .setDecimal(-1)
              .build());
		fieldPropertyMap.put("stringdata", FieldProperty.builder()
              .setPhysicalName("stringdata")
              .setLogicalName("stringdata")
              .setType(FieldProperty.TYPE_OBJECT_STRING)
              .setLength(255)
              .setDecimal(-1)
              .build());
		fieldPropertyMap.put("doubledata", FieldProperty.builder()
              .setPhysicalName("doubledata")
              .setLogicalName("doubledata")
              .setType(FieldProperty.TYPE_PRIMITIVE_INT)
              .setLength(10)
              .setDecimal(-1)
              .build());
		fieldPropertyMap.put("formula", FieldProperty.builder()
              .setPhysicalName("formula")
              .setLogicalName("formula")
              .setType(FieldProperty.TYPE_OBJECT_STRING)
              .setLength(30)
              .setDecimal(-1)
              .build());
		fieldPropertyMap.put("style", FieldProperty.builder()
              .setPhysicalName("style")
              .setLogicalName("style")
              .setType(FieldProperty.TYPE_OBJECT_STRING)
              .setLength(255)
              .setDecimal(-1)
              .build());
		fieldPropertyMap.put("chain", FieldProperty.builder()
              .setPhysicalName("chain")
              .setLogicalName("chain")
              .setType(FieldProperty.TYPE_OBJECT_STRING)
              .setLength(255)
              .setDecimal(-1)
              .build());
		fieldPropertyMap.put("datatype", FieldProperty.builder()
              .setPhysicalName("datatype")
              .setLogicalName("datatype")
              .setType(FieldProperty.TYPE_OBJECT_STRING)
              .setLength(10)
              .setDecimal(-1)
              .build());
		fieldPropertyMap.put("cellkey", FieldProperty.builder()
              .setPhysicalName("cellkey")
              .setLogicalName("cellkey")
              .setType(FieldProperty.TYPE_OBJECT_STRING)
              .setLength(20)
              .setDecimal(-1)
              .build());
		fieldPropertyMap.put("xpos", FieldProperty.builder()
              .setPhysicalName("xpos")
              .setLogicalName("xpos")
              .setType(FieldProperty.TYPE_PRIMITIVE_INT)
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
			case "ypos" : return getYpos();
			case "stringdata" : return getStringdata();
			case "doubledata" : return getDoubledata();
			case "formula" : return getFormula();
			case "style" : return getStyle();
			case "chain" : return getChain();
			case "datatype" : return getDatatype();
			case "cellkey" : return getCellkey();
			case "xpos" : return getXpos();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}

	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "ypos" : setYpos((Integer)arg);break;
			case "stringdata" : setStringdata((String)arg);break;
			case "doubledata" : setDoubledata((Integer)arg);break;
			case "formula" : setFormula((String)arg);break;
			case "style" : setStyle((String)arg);break;
			case "chain" : setChain((String)arg);break;
			case "datatype" : setDatatype((String)arg);break;
			case "cellkey" : setCellkey((String)arg);break;
			case "xpos" : setXpos((Integer)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		CELLINSERTDO _CELLINSERTDO = (CELLINSERTDO) obj;				
		if(this.ypos != _CELLINSERTDO.getYpos()) return false;
		if(this.stringdata == null) {
			if(_CELLINSERTDO.getStringdata() != null)
				return false;
		} else if(!this.stringdata.equals(_CELLINSERTDO.getStringdata()))
			return false;				
		if(this.doubledata != _CELLINSERTDO.getDoubledata()) return false;
		if(this.formula == null) {
			if(_CELLINSERTDO.getFormula() != null)
				return false;
		} else if(!this.formula.equals(_CELLINSERTDO.getFormula()))
			return false;
		if(this.style == null) {
			if(_CELLINSERTDO.getStyle() != null)
				return false;
		} else if(!this.style.equals(_CELLINSERTDO.getStyle()))
			return false;
		if(this.chain == null) {
			if(_CELLINSERTDO.getChain() != null)
				return false;
		} else if(!this.chain.equals(_CELLINSERTDO.getChain()))
			return false;
		if(this.datatype == null) {
			if(_CELLINSERTDO.getDatatype() != null)
				return false;
		} else if(!this.datatype.equals(_CELLINSERTDO.getDatatype()))
			return false;
		if(this.cellkey == null) {
			if(_CELLINSERTDO.getCellkey() != null)
				return false;
		} else if(!this.cellkey.equals(_CELLINSERTDO.getCellkey()))
			return false;				
		if(this.xpos != _CELLINSERTDO.getXpos()) return false;
		return true;
	}

	@Override
	public int hashCode() {
		int prime  = 31;
		int result = 1;
		result     = prime * result + this.ypos;					
		result     = prime * result + ((this.stringdata == null) ? 0 : this.stringdata.hashCode());
		result     = prime * result + this.doubledata;					
		result     = prime * result + ((this.formula == null) ? 0 : this.formula.hashCode());					
		result     = prime * result + ((this.style == null) ? 0 : this.style.hashCode());					
		result     = prime * result + ((this.chain == null) ? 0 : this.chain.hashCode());					
		result     = prime * result + ((this.datatype == null) ? 0 : this.datatype.hashCode());					
		result     = prime * result + ((this.cellkey == null) ? 0 : this.cellkey.hashCode());
		result     = prime * result + this.xpos;
		return result;
	}
	
	@Override
	public void clear() {
		ypos = 0;
		stringdata = null;
		doubledata = 0;
		formula = null;
		style = null;
		chain = null;
		datatype = null;
		cellkey = null;
		xpos = 0;	
		clearAllIsModified();
	}

	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}

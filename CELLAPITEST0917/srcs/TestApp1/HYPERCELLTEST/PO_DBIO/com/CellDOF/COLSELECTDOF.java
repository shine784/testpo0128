package com.CellDOF;

import org.apache.ibatis.scripting.xmltags.ExpressionEvaluator;
import java.util.HashMap;
import java.util.Map;
import com.tmax.proobject.dataobject.factory.DynamicQuery;
import com.tmax.proobject.dataobject.dynamic.util.DynamicQueryUtil;
        
import java.sql.PreparedStatement;
import com.tmax.proobject.model.dataobject.Session;
import com.tmax.proobject.model.dataobject.DataObject;
import com.CellDO.COLSELECTDO;
import com.tmax.proobject.dataobject.factory.Query;
import com.tmax.proobject.dataobject.factory.DBDataObjectFactory;
import com.tmax.proobject.dataobject.model.MetaField;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import com.tmax.proobject.model.exception.FieldNotFoundException;

public class COLSELECTDOF extends DBDataObjectFactory<COLSELECTDO>
{
	public COLSELECTDOF(){
		super();
	}
	
	public COLSELECTDOF(Session session){
		super(session);
	}
	
	public COLSELECTDOF(String datasource){
		super(datasource);
	}
	
	public COLSELECTDOF(String datasource, boolean autocommit){
			super(datasource, autocommit);
	}
	
	private Integer _cellkey;
	private String _chain;
	private String _datatype;
	private Integer _doubledata;
	private String _formula;
	private String _fromh;
	private String _fromv;
	private String _stringdata;
	private String _style;
	private String _tov;
	
	
	public static enum FULLQUERY  implements Query {
		SELECT_DEFAULT_0("/* com.CellDOF.COLSELECTDOF */ \n"
		                                  + "SELECT     A.CELLKEY, \n"
		                                  + "A.STRINGDATA, \n"
		                                  + "A.DOUBLEDATA, \n"
		                                  + "A.FORMULA, \n"
		                                  + "A.STYLE, \n"
		                                  + "A.CHAIN, \n"
		                                  + "A.DATATYPE \n"
		                                  + "FROM \n"
		                                  + "TESTCELLINFO    A \n"
		                                  + "WHERE \n"
		                                  + "A.CELLKEY = ? \n"
		                                  + "AND A.STRINGDATA = ? \n"
		                                  + "AND A.DOUBLEDATA = ? \n"
		                                  + "AND A.FORMULA = ? \n"
		                                  + "AND A.STYLE = ? \n"
		                                  + "AND A.CHAIN = ? \n"
		                                  + "    AND A.DATATYPE = ?"),
		UPDATE_DEFAULT_0("/* com.CellDOF.COLSELECTDOF */ \n"
		                                  + "UPDATE     TESTCELLINFO \n"
		                                  + "SET \n"
		                                  + "CELLKEY = ?, \n"
		                                  + "STRINGDATA = ?, \n"
		                                  + "DOUBLEDATA = ?, \n"
		                                  + "FORMULA = ?, \n"
		                                  + "STYLE = ?, \n"
		                                  + "CHAIN = ?, \n"
		                                  + "DATATYPE = ? \n"
		                                  + "WHERE \n"
		                                  + "A.CELLKEY = ? \n"
		                                  + "AND A.STRINGDATA = ? \n"
		                                  + "AND A.DOUBLEDATA = ? \n"
		                                  + "AND A.FORMULA = ? \n"
		                                  + "AND A.STYLE = ? \n"
		                                  + "AND A.CHAIN = ? \n"
		                                  + "    AND A.DATATYPE = ?"),
		INSERT_DEFAULT_0("/* com.CellDOF.COLSELECTDOF */ \n"
		                                  + "INSERT INTO TESTCELLINFO ( \n"
		                                  + "CELLKEY, \n"
		                                  + "STRINGDATA, \n"
		                                  + "DOUBLEDATA, \n"
		                                  + "FORMULA, \n"
		                                  + "STYLE, \n"
		                                  + "CHAIN, \n"
		                                  + "DATATYPE \n"
		                                  + ") VALUES ( \n"
		                                  + "?, \n"
		                                  + "?, \n"
		                                  + "?, \n"
		                                  + "?, \n"
		                                  + "?, \n"
		                                  + "?, \n"
		                                  + "? \n"
		                                  + ")"),
		DELETE_DEFAULT_0("/* com.CellDOF.COLSELECTDOF */ \n"
		                                  + "DELETE FROM TESTCELLINFO \n"
		                                  + "WHERE \n"
		                                  + "A.CELLKEY = ? \n"
		                                  + "AND A.STRINGDATA = ? \n"
		                                  + "AND A.DOUBLEDATA = ? \n"
		                                  + "AND A.FORMULA = ? \n"
		                                  + "AND A.STYLE = ? \n"
		                                  + "AND A.CHAIN = ? \n"
		                                  + "    AND A.DATATYPE = ?")
	;
		private final String value;
	
		FULLQUERY(String v) {
			value = v;
		}
	
		public String value() {
			return value;
		}
	
		public static FULLQUERY fromValue(String v) {
			return valueOf(v);
		}
		
		public static Query getDefaultQuery(DBType type) {
			switch(type) {
				case SELECT :
					return FULLQUERY.SELECT_DEFAULT_0;
				case INSERT :
					return FULLQUERY.INSERT_DEFAULT_0;
				case UPDATE :
					return FULLQUERY.UPDATE_DEFAULT_0;
				case DELETE :
					return FULLQUERY.DELETE_DEFAULT_0;
				default :
					return null;
			}
		}
	}
	
	
	public static enum DynamicQueryImple  implements DynamicQuery<COLSELECTDOF> {
		
			GOODQUERY("SELECT I.cellkey, I.doubledata, I.stringdata, I.formula, I.style, I.chain, I.datatype     \n"
			                                  + "FROM testcellinfo I \n"
			                                  + "JOIN testcells T  ON (I.CELLKEY=T.CELLKEY) \n"
			                                  + "JOIN verticalmap V  ON ( \n"
			                                  + "? = V.YNAME or \n"
			                                  + "T.C4=V.YNAME or \n"
			                                  + "T.C5=V.YNAME \n"
			                                  + ")  and ( V.YPOS between ? and ?);"){
				@Override
				public String getDynamicQuery(COLSELECTDOF factory) {
					Map<String,Object> varMap = factory.getMybatisdynamicVariableTempMap();
					for(MetaField meta: factory.getFactoryFields()){
					varMap.put( meta.getFieldName(), factory.getField(meta.getFieldName()));
					}
					ExpressionEvaluator evaluator = new ExpressionEvaluator();
					StringBuilder sqlSrcBuilder = new StringBuilder();
					{
					  sqlSrcBuilder.append("SELECT I.cellkey, I.doubledata, I.stringdata, I.formula, I.style, I.chain, I.datatype    \n");
					  sqlSrcBuilder.append("FROM testcellinfo I   \n");
					  sqlSrcBuilder.append("JOIN testcells T  ON (I.CELLKEY=T.CELLKEY)   \n");
					  sqlSrcBuilder.append("JOIN verticalmap V  ON (\n");
					  sqlSrcBuilder.append(":fromh = V.YNAME or\n");
					  sqlSrcBuilder.append("T.C4=V.YNAME or\n");
					  sqlSrcBuilder.append("T.C5=V.YNAME \n");
					  sqlSrcBuilder.append(")  and ( V.YPOS between :fromv and :tov);\n");
					}
					String query = sqlSrcBuilder.toString();
					return query;
				}
			}
			
	;	DynamicQueryImple(String script){
		            this.script = script;
		        }
		public final String script;
	
		public String getScript(){
			return script;
		}
		
		public String value(){
					return script;
				}
	
		public static DynamicQueryImple fromValue(String v) {
			return valueOf(v);
		}
		
		public static Query getDefaultQuery(DBType type) {
			switch(type) {
				case SELECT :
					return FULLQUERY.SELECT_DEFAULT_0;
				case INSERT :
					return FULLQUERY.INSERT_DEFAULT_0;
				case UPDATE :
					return FULLQUERY.UPDATE_DEFAULT_0;
				case DELETE :
					return FULLQUERY.DELETE_DEFAULT_0;
				default :
					return null;
			}
		}
	}
	 	
	private static String[] _QUERY_TABLES = {"TESTCELLINFO"};
	private static List<MetaField> _FACTORY_FIELDS = new ArrayList<MetaField>();
	
	@Override
	public void init() {
		_cellkey = null;
		_chain = null;
		_datatype = null;
		_doubledata = null;
		_formula = null;
		_fromh = null;
		_fromv = null;
		_stringdata = null;
		_style = null;
		_tov = null;
		super.init();
	}
	
	@Override
	public String[] getQueryTables() {
	    return _QUERY_TABLES.clone();
	}      
	
	@Override
	public Query getDefaultQuery(DBType type) {
		return FULLQUERY.getDefaultQuery(type);
	}
	
	@Override
	public COLSELECTDO getDataObject() {
		return new COLSELECTDO();
	}
	
	public void setFullQuery(COLSELECTDOF.FULLQUERY query) {
		useFullQuery = true;
		this.query = query;
	}
	
	public void setFullQuery(String name) {
		COLSELECTDOF.FULLQUERY query = COLSELECTDOF.FULLQUERY.valueOf(name);
		setFullQuery(query);
	}
	
	@Override
	public List<MetaField> getFactoryFields() {
		return _FACTORY_FIELDS;
	}
	
	public Integer getCellkey() {
	    return _cellkey;
	}
	
	public void setCellkey(Integer _cellkey) {
	    this._cellkey = _cellkey;
	}
	
	
	public String getChain() {
	    return _chain;
	}
	
	public void setChain(String _chain) {
	    this._chain = _chain;
	}
	
	
	public String getDatatype() {
	    return _datatype;
	}
	
	public void setDatatype(String _datatype) {
	    this._datatype = _datatype;
	}
	
	
	public Integer getDoubledata() {
	    return _doubledata;
	}
	
	public void setDoubledata(Integer _doubledata) {
	    this._doubledata = _doubledata;
	}
	
	
	public String getFormula() {
	    return _formula;
	}
	
	public void setFormula(String _formula) {
	    this._formula = _formula;
	}
	
	
	public String getFromh() {
	    return _fromh;
	}
	
	public void setFromh(String _fromh) {
	    this._fromh = _fromh;
	}
	
	
	public String getFromv() {
	    return _fromv;
	}
	
	public void setFromv(String _fromv) {
	    this._fromv = _fromv;
	}
	
	
	public String getStringdata() {
	    return _stringdata;
	}
	
	public void setStringdata(String _stringdata) {
	    this._stringdata = _stringdata;
	}
	
	
	public String getStyle() {
	    return _style;
	}
	
	public void setStyle(String _style) {
	    this._style = _style;
	}
	
	
	public String getTov() {
	    return _tov;
	}
	
	public void setTov(String _tov) {
	    this._tov = _tov;
	}
	
	
	
	@Override
	public Object getField(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
		case "cellkey" : return _cellkey;
		case "chain" : return _chain;
		case "datatype" : return _datatype;
		case "doubledata" : return _doubledata;
		case "formula" : return _formula;
		case "fromh" : return _fromh;
		case "fromv" : return _fromv;
		case "stringdata" : return _stringdata;
		case "style" : return _style;
		case "tov" : return _tov;
		default : throw new FieldNotFoundException("unknown fieldName : "+fieldName+"("+fieldName.hashCode()+")");
		}
	}    
	
	@Override
	public void setField(String fieldName, Object value) throws FieldNotFoundException {
		switch(fieldName) {
		case "cellkey" : this._cellkey = ((Integer)value); break;
		case "chain" : this._chain = ((String)value); break;
		case "datatype" : this._datatype = ((String)value); break;
		case "doubledata" : this._doubledata = ((Integer)value); break;
		case "formula" : this._formula = ((String)value); break;
		case "fromh" : this._fromh = ((String)value); break;
		case "fromv" : this._fromv = ((String)value); break;
		case "stringdata" : this._stringdata = ((String)value); break;
		case "style" : this._style = ((String)value); break;
		case "tov" : this._tov = ((String)value); break;
		default : throw new FieldNotFoundException("unknown fieldName : "+fieldName+"("+fieldName.hashCode()+")");
		}
	}
	
	@Override
	public Class<?> getFieldClassType(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "cellkey" :
				return Integer.class;
			case "chain" :
				return String.class;
			case "datatype" :
				return String.class;
			case "doubledata" :
				return Integer.class;
			case "formula" :
				return String.class;
			case "fromh" :
				return String.class;
			case "fromv" :
				return String.class;
			case "stringdata" :
				return String.class;
			case "style" :
				return String.class;
			case "tov" :
				return String.class;
			default : throw new FieldNotFoundException("unknown fieldName : "+fieldName+"("+fieldName.hashCode()+")");
		}
	}
	
	
	
	
	@Override
	public void onPrepareFullQuery(PreparedStatement ps, DataObject dataObject) {
		if(useFullQuery && query == COLSELECTDOF.FULLQUERY.SELECT_DEFAULT_0) {
			onPrepareFullQuerySelect_default_0(ps, (COLSELECTDO)dataObject);
		} else if(useFullQuery && query == COLSELECTDOF.FULLQUERY.UPDATE_DEFAULT_0) {
			onPrepareFullQueryUpdate_default_0(ps, (COLSELECTDO)dataObject);
		} else if(useFullQuery && query == COLSELECTDOF.FULLQUERY.INSERT_DEFAULT_0) {
			onPrepareFullQueryInsert_default_0(ps, (COLSELECTDO)dataObject);
		} else if(useFullQuery && query == COLSELECTDOF.FULLQUERY.DELETE_DEFAULT_0) {
			onPrepareFullQueryDelete_default_0(ps, (COLSELECTDO)dataObject);
		}
	}
	
	public void onPrepareFullQueryDelete_default_0 (PreparedStatement ps, COLSELECTDO dataObject) {
		set(index++, Integer.class, this._cellkey, ps);
		set(index++, String.class, this._stringdata, ps);
		set(index++, Integer.class, this._doubledata, ps);
		set(index++, String.class, this._formula, ps);
		set(index++, String.class, this._style, ps);
		set(index++, String.class, this._chain, ps);
		set(index++, String.class, this._datatype, ps);
	}
	
	public void onPrepareFullQuerySelect_default_0 (PreparedStatement ps, COLSELECTDO dataObject) {
		set(index++, Integer.class, this._cellkey, ps);
		set(index++, String.class, this._stringdata, ps);
		set(index++, Integer.class, this._doubledata, ps);
		set(index++, String.class, this._formula, ps);
		set(index++, String.class, this._style, ps);
		set(index++, String.class, this._chain, ps);
		set(index++, String.class, this._datatype, ps);
	}
	
	public void onPrepareFullQueryUpdate_default_0 (PreparedStatement ps, COLSELECTDO dataObject) {
		set(index++, Integer.class, dataObject.getCellkey(), "cellkey", ps);
		set(index++, String.class, dataObject.getStringdata(), "stringdata", ps);
		set(index++, Integer.class, dataObject.getDoubledata(), "doubledata", ps);
		set(index++, String.class, dataObject.getFormula(), "formula", ps);
		set(index++, String.class, dataObject.getStyle(), "style", ps);
		set(index++, String.class, dataObject.getChain(), "chain", ps);
		set(index++, String.class, dataObject.getDatatype(), "datatype", ps);
		set(index++, Integer.class, this._cellkey, ps);
		set(index++, String.class, this._stringdata, ps);
		set(index++, Integer.class, this._doubledata, ps);
		set(index++, String.class, this._formula, ps);
		set(index++, String.class, this._style, ps);
		set(index++, String.class, this._chain, ps);
		set(index++, String.class, this._datatype, ps);
	}
	
	public void onPrepareFullQueryInsert_default_0 (PreparedStatement ps, COLSELECTDO dataObject) {
		set(index++, Integer.class, dataObject.getCellkey(), "cellkey", ps);
		set(index++, String.class, dataObject.getStringdata(), "stringdata", ps);
		set(index++, Integer.class, dataObject.getDoubledata(), "doubledata", ps);
		set(index++, String.class, dataObject.getFormula(), "formula", ps);
		set(index++, String.class, dataObject.getStyle(), "style", ps);
		set(index++, String.class, dataObject.getChain(), "chain", ps);
		set(index++, String.class, dataObject.getDatatype(), "datatype", ps);
	}
	
	static {
		_FACTORY_FIELDS.add(new MetaField("cellkey",Integer.class,"","","",false,false));
		_FACTORY_FIELDS.add(new MetaField("chain",String.class,"","","",false,false));
		_FACTORY_FIELDS.add(new MetaField("datatype",String.class,"","","",false,false));
		_FACTORY_FIELDS.add(new MetaField("doubledata",Integer.class,"","","",false,false));
		_FACTORY_FIELDS.add(new MetaField("formula",String.class,"","","",false,false));
		_FACTORY_FIELDS.add(new MetaField("fromh",String.class,"","","",false,false));
		_FACTORY_FIELDS.add(new MetaField("fromv",String.class,"","","",false,false));
		_FACTORY_FIELDS.add(new MetaField("stringdata",String.class,"","","",false,false));
		_FACTORY_FIELDS.add(new MetaField("style",String.class,"","","",false,false));
		_FACTORY_FIELDS.add(new MetaField("tov",String.class,"","","",false,false));
	
		_FACTORY_FIELDS = Collections.unmodifiableList(_FACTORY_FIELDS);
	}
	
	@Override
	public int add(DataObject insert, boolean immediate) {
		return super.add(insert, immediate);
	}
	@Override
	public int add(COLSELECTDO insert, String... autoIncreasedFields) {
		return super.add(insert, autoIncreasedFields);
	}
	@Override
	public int update(DataObject update, boolean immediate) {
		return super.update(update, immediate);
	}
	@Override
	public int update(DataObject update, String... autoIncreasedColumns) {
		return super.update(update, autoIncreasedColumns);
	}
	    
	
	@Override
	public String toString() {
	    return "COLSELECTDOF [" + super.toString()
	        + ", cellkey=" + _cellkey
	        + ", chain=" + _chain
	        + ", datatype=" + _datatype
	        + ", doubledata=" + _doubledata
	        + ", formula=" + _formula
	        + ", fromh=" + _fromh
	        + ", fromv=" + _fromv
	        + ", stringdata=" + _stringdata
	        + ", style=" + _style
	        + ", tov=" + _tov
	        + "]";
	}
}


package com.CellDOF;

        
import java.sql.PreparedStatement;
import com.tmax.proobject.model.dataobject.Session;
import com.tmax.proobject.model.dataobject.DataObject;
import com.CellDO.COLHEADERWIDTHDO;
import com.tmax.proobject.dataobject.factory.Query;
import com.tmax.proobject.dataobject.factory.DBDataObjectFactory;
import com.tmax.proobject.dataobject.model.MetaField;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import com.tmax.proobject.model.exception.FieldNotFoundException;

public class COLHEADERWIDTHDOF extends DBDataObjectFactory<COLHEADERWIDTHDO>
{
	public COLHEADERWIDTHDOF(){
		super();
	}
	
	public COLHEADERWIDTHDOF(Session session){
		super(session);
	}
	
	public COLHEADERWIDTHDOF(String datasource){
		super(datasource);
	}
	
	public COLHEADERWIDTHDOF(String datasource, boolean autocommit){
			super(datasource, autocommit);
	}
	
	private String _fromh;
	private String _toh;
	private String _xname;
	private Integer _xpos;
	private Integer _xwidth;
	
	
	public static enum FULLQUERY  implements Query {
		SELECT_DEFAULT_0("/* com.CellDOF.COLHEADERWIDTHDOF */ \n"
		                                  + "/* com.CellDOF.ROWHEADERWIDTHDOF */ \n"
		                                  + "select W.XWIDTH \n"
		                                  + "from horizonwidth W \n"
		                                  + "join horizonmap M \n"
		                                  + "on (W.XNAME=M.XNAME) \n"
		                                  + "where M.XPOS >= ? and M.XPOS < ?;"),
		UPDATE_DEFAULT_0("/* com.CellDOF.COLHEADERWIDTHDOF */ \n"
		                                  + "UPDATE     HORIZONWIDTH \n"
		                                  + "SET \n"
		                                  + "XWIDTH = ? \n"
		                                  + "WHERE \n"
		                                  + "XNAME = (SELECT XNAME from HORIZONMAP WHERE XPOS = ?); \n"
		                                  + " \n"
		                                  + "    "),
		INSERT_DEFAULT_0("/* com.CellDOF.COLHEADERWIDTHDOF */ \n"
		                                  + "INSERT INTO HORIZONWIDTH ( \n"
		                                  + "XNAME \n"
		                                  + ") VALUES ( \n"
		                                  + "? \n"
		                                  + ")"),
		DELETE_DEFAULT_0("/* com.CellDOF.COLHEADERWIDTHDOF */ \n"
		                                  + "DELETE FROM HORIZONWIDTH \n"
		                                  + "WHERE \n"
		                                  + "A.XWIDTH = ? \n"
		                                  + "    AND A.XNAME = ?")
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
	
	
	 	
	private static String[] _QUERY_TABLES = {"horizonwidth", "horizonmap", "HORIZONWIDTH", "HORIZONMAP"};
	private static List<MetaField> _FACTORY_FIELDS = new ArrayList<MetaField>();
	
	@Override
	public void init() {
		_fromh = null;
		_toh = null;
		_xname = null;
		_xpos = null;
		_xwidth = null;
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
	public COLHEADERWIDTHDO getDataObject() {
		return new COLHEADERWIDTHDO();
	}
	
	public void setFullQuery(COLHEADERWIDTHDOF.FULLQUERY query) {
		useFullQuery = true;
		this.query = query;
	}
	
	public void setFullQuery(String name) {
		COLHEADERWIDTHDOF.FULLQUERY query = COLHEADERWIDTHDOF.FULLQUERY.valueOf(name);
		setFullQuery(query);
	}
	
	@Override
	public List<MetaField> getFactoryFields() {
		return _FACTORY_FIELDS;
	}
	
	public String getFromh() {
	    return _fromh;
	}
	
	public void setFromh(String _fromh) {
	    this._fromh = _fromh;
	}
	
	
	public String getToh() {
	    return _toh;
	}
	
	public void setToh(String _toh) {
	    this._toh = _toh;
	}
	
	
	public String getXname() {
	    return _xname;
	}
	
	public void setXname(String _xname) {
	    this._xname = _xname;
	}
	
	
	public Integer getXpos() {
	    return _xpos;
	}
	
	public void setXpos(Integer _xpos) {
	    this._xpos = _xpos;
	}
	
	
	public Integer getXwidth() {
	    return _xwidth;
	}
	
	public void setXwidth(Integer _xwidth) {
	    this._xwidth = _xwidth;
	}
	
	
	
	@Override
	public Object getField(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
		case "fromh" : return _fromh;
		case "toh" : return _toh;
		case "xname" : return _xname;
		case "xpos" : return _xpos;
		case "xwidth" : return _xwidth;
		default : throw new FieldNotFoundException("unknown fieldName : "+fieldName+"("+fieldName.hashCode()+")");
		}
	}    
	
	@Override
	public void setField(String fieldName, Object value) throws FieldNotFoundException {
		switch(fieldName) {
		case "fromh" : this._fromh = ((String)value); break;
		case "toh" : this._toh = ((String)value); break;
		case "xname" : this._xname = ((String)value); break;
		case "xpos" : this._xpos = ((Integer)value); break;
		case "xwidth" : this._xwidth = ((Integer)value); break;
		default : throw new FieldNotFoundException("unknown fieldName : "+fieldName+"("+fieldName.hashCode()+")");
		}
	}
	
	@Override
	public Class<?> getFieldClassType(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "fromh" :
				return String.class;
			case "toh" :
				return String.class;
			case "xname" :
				return String.class;
			case "xpos" :
				return Integer.class;
			case "xwidth" :
				return Integer.class;
			default : throw new FieldNotFoundException("unknown fieldName : "+fieldName+"("+fieldName.hashCode()+")");
		}
	}
	
	
	
	
	@Override
	public void onPrepareFullQuery(PreparedStatement ps, DataObject dataObject) {
		if(useFullQuery && query == COLHEADERWIDTHDOF.FULLQUERY.SELECT_DEFAULT_0) {
			onPrepareFullQuerySelect_default_0(ps, (COLHEADERWIDTHDO)dataObject);
		} else if(useFullQuery && query == COLHEADERWIDTHDOF.FULLQUERY.UPDATE_DEFAULT_0) {
			onPrepareFullQueryUpdate_default_0(ps, (COLHEADERWIDTHDO)dataObject);
		} else if(useFullQuery && query == COLHEADERWIDTHDOF.FULLQUERY.INSERT_DEFAULT_0) {
			onPrepareFullQueryInsert_default_0(ps, (COLHEADERWIDTHDO)dataObject);
		} else if(useFullQuery && query == COLHEADERWIDTHDOF.FULLQUERY.DELETE_DEFAULT_0) {
			onPrepareFullQueryDelete_default_0(ps, (COLHEADERWIDTHDO)dataObject);
		}
	}
	
	public void onPrepareFullQueryDelete_default_0 (PreparedStatement ps, COLHEADERWIDTHDO dataObject) {
		set(index++, Integer.class, this._xwidth, ps);
		set(index++, String.class, this._xname, ps);
	}
	
	public void onPrepareFullQuerySelect_default_0 (PreparedStatement ps, COLHEADERWIDTHDO dataObject) {
		set(index++, String.class, this._fromh, ps);
		set(index++, String.class, this._toh, ps);
	}
	
	public void onPrepareFullQueryUpdate_default_0 (PreparedStatement ps, COLHEADERWIDTHDO dataObject) {
		set(index++, Integer.class, dataObject.getXwidth(), "xwidth", ps);
		set(index++, Integer.class, this._xpos, ps);
	}
	
	public void onPrepareFullQueryInsert_default_0 (PreparedStatement ps, COLHEADERWIDTHDO dataObject) {
		set(index++, String.class, dataObject.getXname(), "xname", ps);
	}
	
	static {
		_FACTORY_FIELDS.add(new MetaField("fromh",String.class,"","","",false,false));
		_FACTORY_FIELDS.add(new MetaField("toh",String.class,"","","",false,false));
		_FACTORY_FIELDS.add(new MetaField("xname",String.class,"","","",false,false));
		_FACTORY_FIELDS.add(new MetaField("xpos",Integer.class,"","","",false,false));
		_FACTORY_FIELDS.add(new MetaField("xwidth",Integer.class,"","","",false,false));
	
		_FACTORY_FIELDS = Collections.unmodifiableList(_FACTORY_FIELDS);
	}
	
	@Override
	public int add(DataObject insert, boolean immediate) {
		return super.add(insert, immediate);
	}
	@Override
	public int add(COLHEADERWIDTHDO insert, String... autoIncreasedFields) {
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
	    return "COLHEADERWIDTHDOF [" + super.toString()
	        + ", fromh=" + _fromh
	        + ", toh=" + _toh
	        + ", xname=" + _xname
	        + ", xpos=" + _xpos
	        + ", xwidth=" + _xwidth
	        + "]";
	}
}


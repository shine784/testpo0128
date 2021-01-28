package com.CellDOF;

        
import java.sql.PreparedStatement;
import com.tmax.proobject.model.dataobject.Session;
import com.tmax.proobject.model.dataobject.DataObject;
import com.CellDO.COLUMNCREATEINPUT;
import com.tmax.proobject.dataobject.factory.Query;
import com.tmax.proobject.dataobject.factory.DBDataObjectFactory;
import com.tmax.proobject.dataobject.model.MetaField;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import com.tmax.proobject.model.exception.FieldNotFoundException;

public class COLUMNCREATEDOF extends DBDataObjectFactory<COLUMNCREATEINPUT>
{
	public COLUMNCREATEDOF(){
		super();
	}
	
	public COLUMNCREATEDOF(Session session){
		super(session);
	}
	
	public COLUMNCREATEDOF(String datasource){
		super(datasource);
	}
	
	public COLUMNCREATEDOF(String datasource, boolean autocommit){
			super(datasource, autocommit);
	}
	
	private String _xname;
	private Integer _xpos;
	
	
	public static enum FULLQUERY  implements Query {
		SELECT_DEFAULT_0("/* com.CellDOF.COLUMNCREATEDOF */ \n"
		                                  + "SELECT     A.XPOS, \n"
		                                  + "A.XNAME \n"
		                                  + "FROM \n"
		                                  + "HORIZONMAP    A \n"
		                                  + "WHERE \n"
		                                  + "A.XPOS = ? \n"
		                                  + "    AND A.XNAME = ?"),
		UPDATE_DEFAULT_0("/* com.CellDOF.COLUMNCREATEDOF */ \n"
		                                  + "UPDATE     HORIZONMAP \n"
		                                  + "SET \n"
		                                  + "XPOS = ?, \n"
		                                  + "XNAME = ? \n"
		                                  + "WHERE \n"
		                                  + "A.XPOS = ? \n"
		                                  + "    AND A.XNAME = ?"),
		INSERT_DEFAULT_0("/* com.CellDOF.COLUMNCREATEDOF */ \n"
		                                  + "INSERT INTO HORIZONMAP ( \n"
		                                  + "XPOS, \n"
		                                  + "XNAME \n"
		                                  + ") VALUES ( \n"
		                                  + "?, \n"
		                                  + "? \n"
		                                  + ")"),
		DELETE_DEFAULT_0("/* com.CellDOF.COLUMNCREATEDOF */ \n"
		                                  + "DELETE FROM HORIZONMAP \n"
		                                  + "WHERE \n"
		                                  + "A.XPOS = ? \n"
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
	
	
	 	
	private static String[] _QUERY_TABLES = {};
	private static List<MetaField> _FACTORY_FIELDS = new ArrayList<MetaField>();
	
	@Override
	public void init() {
		_xname = null;
		_xpos = null;
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
	public COLUMNCREATEINPUT getDataObject() {
		return new COLUMNCREATEINPUT();
	}
	
	public void setFullQuery(COLUMNCREATEDOF.FULLQUERY query) {
		useFullQuery = true;
		this.query = query;
	}
	
	public void setFullQuery(String name) {
		COLUMNCREATEDOF.FULLQUERY query = COLUMNCREATEDOF.FULLQUERY.valueOf(name);
		setFullQuery(query);
	}
	
	@Override
	public List<MetaField> getFactoryFields() {
		return _FACTORY_FIELDS;
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
	
	
	
	@Override
	public Object getField(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
		case "xname" : return _xname;
		case "xpos" : return _xpos;
		default : throw new FieldNotFoundException("unknown fieldName : "+fieldName+"("+fieldName.hashCode()+")");
		}
	}    
	
	@Override
	public void setField(String fieldName, Object value) throws FieldNotFoundException {
		switch(fieldName) {
		case "xname" : this._xname = ((String)value); break;
		case "xpos" : this._xpos = ((Integer)value); break;
		default : throw new FieldNotFoundException("unknown fieldName : "+fieldName+"("+fieldName.hashCode()+")");
		}
	}
	
	@Override
	public Class<?> getFieldClassType(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "xname" :
				return String.class;
			case "xpos" :
				return Integer.class;
			default : throw new FieldNotFoundException("unknown fieldName : "+fieldName+"("+fieldName.hashCode()+")");
		}
	}
	
	
	
	
	@Override
	public void onPrepareFullQuery(PreparedStatement ps, DataObject dataObject) {
		if(useFullQuery && query == COLUMNCREATEDOF.FULLQUERY.SELECT_DEFAULT_0) {
			onPrepareFullQuerySelect_default_0(ps, (COLUMNCREATEINPUT)dataObject);
		} else if(useFullQuery && query == COLUMNCREATEDOF.FULLQUERY.UPDATE_DEFAULT_0) {
			onPrepareFullQueryUpdate_default_0(ps, (COLUMNCREATEINPUT)dataObject);
		} else if(useFullQuery && query == COLUMNCREATEDOF.FULLQUERY.INSERT_DEFAULT_0) {
			onPrepareFullQueryInsert_default_0(ps, (COLUMNCREATEINPUT)dataObject);
		} else if(useFullQuery && query == COLUMNCREATEDOF.FULLQUERY.DELETE_DEFAULT_0) {
			onPrepareFullQueryDelete_default_0(ps, (COLUMNCREATEINPUT)dataObject);
		}
	}
	
	public void onPrepareFullQueryDelete_default_0 (PreparedStatement ps, COLUMNCREATEINPUT dataObject) {
		set(index++, Integer.class, this._xpos, ps);
		set(index++, String.class, this._xname, ps);
	}
	
	public void onPrepareFullQuerySelect_default_0 (PreparedStatement ps, COLUMNCREATEINPUT dataObject) {
		set(index++, Integer.class, this._xpos, ps);
		set(index++, String.class, this._xname, ps);
	}
	
	public void onPrepareFullQueryUpdate_default_0 (PreparedStatement ps, COLUMNCREATEINPUT dataObject) {
		set(index++, Integer.class, dataObject.getXpos(), "xpos", ps);
		set(index++, String.class, dataObject.getXname(), "xname", ps);
		set(index++, Integer.class, this._xpos, ps);
		set(index++, String.class, this._xname, ps);
	}
	
	public void onPrepareFullQueryInsert_default_0 (PreparedStatement ps, COLUMNCREATEINPUT dataObject) {
		set(index++, Integer.class, dataObject.getXpos(), "xpos", ps);
		set(index++, String.class, dataObject.getXname(), "xname", ps);
	}
	
	static {
		_FACTORY_FIELDS.add(new MetaField("xname",String.class,"","","",false,false));
		_FACTORY_FIELDS.add(new MetaField("xpos",Integer.class,"","","",false,false));
	
		_FACTORY_FIELDS = Collections.unmodifiableList(_FACTORY_FIELDS);
	}
	
	@Override
	public int add(DataObject insert, boolean immediate) {
		return super.add(insert, immediate);
	}
	@Override
	public int add(COLUMNCREATEINPUT insert, String... autoIncreasedFields) {
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
	    return "COLUMNCREATEDOF [" + super.toString()
	        + ", xname=" + _xname
	        + ", xpos=" + _xpos
	        + "]";
	}
}


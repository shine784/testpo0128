package com.CellDOF;

        
import java.sql.PreparedStatement;
import com.tmax.proobject.model.dataobject.Session;
import com.tmax.proobject.model.dataobject.DataObject;
import com.CellDO.ROWCREATEINPUT;
import com.tmax.proobject.dataobject.factory.Query;
import com.tmax.proobject.dataobject.factory.DBDataObjectFactory;
import com.tmax.proobject.dataobject.model.MetaField;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import com.tmax.proobject.model.exception.FieldNotFoundException;

public class ROWCREATEDOF extends DBDataObjectFactory<ROWCREATEINPUT>
{
	public ROWCREATEDOF(){
		super();
	}
	
	public ROWCREATEDOF(Session session){
		super(session);
	}
	
	public ROWCREATEDOF(String datasource){
		super(datasource);
	}
	
	public ROWCREATEDOF(String datasource, boolean autocommit){
			super(datasource, autocommit);
	}
	
	private String _yname;
	private Integer _ypos;
	
	
	public static enum FULLQUERY  implements Query {
		SELECT_DEFAULT_0("/* com.CellDOF.ROWCREATEDOF */ \n"
		                                  + "SELECT     A.YPOS, \n"
		                                  + "A.YNAME \n"
		                                  + "FROM \n"
		                                  + "VERTICALMAP    A \n"
		                                  + "WHERE \n"
		                                  + "A.YPOS = ? \n"
		                                  + "    AND A.YNAME = ?"),
		UPDATE_DEFAULT_0("/* com.CellDOF.ROWCREATEDOF */ \n"
		                                  + "UPDATE     VERTICALMAP \n"
		                                  + "SET \n"
		                                  + "YPOS = ?, \n"
		                                  + "YNAME = ? \n"
		                                  + "WHERE \n"
		                                  + "A.YPOS = ? \n"
		                                  + "    AND A.YNAME = ?"),
		INSERT_DEFAULT_0("/* com.CellDOF.ROWCREATEDOF */ \n"
		                                  + "INSERT INTO VERTICALMAP ( \n"
		                                  + "YPOS, \n"
		                                  + "YNAME \n"
		                                  + ") VALUES ( \n"
		                                  + "?, \n"
		                                  + "? \n"
		                                  + ")"),
		DELETE_DEFAULT_0("/* com.CellDOF.ROWCREATEDOF */ \n"
		                                  + "DELETE FROM VERTICALMAP \n"
		                                  + "WHERE \n"
		                                  + "A.YPOS = ? \n"
		                                  + "    AND A.YNAME = ?")
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
	
	
	 	
	private static String[] _QUERY_TABLES = {"VERTICALMAP"};
	private static List<MetaField> _FACTORY_FIELDS = new ArrayList<MetaField>();
	
	@Override
	public void init() {
		_yname = null;
		_ypos = null;
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
	public ROWCREATEINPUT getDataObject() {
		return new ROWCREATEINPUT();
	}
	
	public void setFullQuery(ROWCREATEDOF.FULLQUERY query) {
		useFullQuery = true;
		this.query = query;
	}
	
	public void setFullQuery(String name) {
		ROWCREATEDOF.FULLQUERY query = ROWCREATEDOF.FULLQUERY.valueOf(name);
		setFullQuery(query);
	}
	
	@Override
	public List<MetaField> getFactoryFields() {
		return _FACTORY_FIELDS;
	}
	
	public String getYname() {
	    return _yname;
	}
	
	public void setYname(String _yname) {
	    this._yname = _yname;
	}
	
	
	public Integer getYpos() {
	    return _ypos;
	}
	
	public void setYpos(Integer _ypos) {
	    this._ypos = _ypos;
	}
	
	
	
	@Override
	public Object getField(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
		case "yname" : return _yname;
		case "ypos" : return _ypos;
		default : throw new FieldNotFoundException("unknown fieldName : "+fieldName+"("+fieldName.hashCode()+")");
		}
	}    
	
	@Override
	public void setField(String fieldName, Object value) throws FieldNotFoundException {
		switch(fieldName) {
		case "yname" : this._yname = ((String)value); break;
		case "ypos" : this._ypos = ((Integer)value); break;
		default : throw new FieldNotFoundException("unknown fieldName : "+fieldName+"("+fieldName.hashCode()+")");
		}
	}
	
	@Override
	public Class<?> getFieldClassType(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "yname" :
				return String.class;
			case "ypos" :
				return Integer.class;
			default : throw new FieldNotFoundException("unknown fieldName : "+fieldName+"("+fieldName.hashCode()+")");
		}
	}
	
	
	
	
	@Override
	public void onPrepareFullQuery(PreparedStatement ps, DataObject dataObject) {
		if(useFullQuery && query == ROWCREATEDOF.FULLQUERY.SELECT_DEFAULT_0) {
			onPrepareFullQuerySelect_default_0(ps, (ROWCREATEINPUT)dataObject);
		} else if(useFullQuery && query == ROWCREATEDOF.FULLQUERY.UPDATE_DEFAULT_0) {
			onPrepareFullQueryUpdate_default_0(ps, (ROWCREATEINPUT)dataObject);
		} else if(useFullQuery && query == ROWCREATEDOF.FULLQUERY.INSERT_DEFAULT_0) {
			onPrepareFullQueryInsert_default_0(ps, (ROWCREATEINPUT)dataObject);
		} else if(useFullQuery && query == ROWCREATEDOF.FULLQUERY.DELETE_DEFAULT_0) {
			onPrepareFullQueryDelete_default_0(ps, (ROWCREATEINPUT)dataObject);
		}
	}
	
	public void onPrepareFullQueryDelete_default_0 (PreparedStatement ps, ROWCREATEINPUT dataObject) {
		set(index++, Integer.class, this._ypos, ps);
		set(index++, String.class, this._yname, ps);
	}
	
	public void onPrepareFullQuerySelect_default_0 (PreparedStatement ps, ROWCREATEINPUT dataObject) {
		set(index++, Integer.class, this._ypos, ps);
		set(index++, String.class, this._yname, ps);
	}
	
	public void onPrepareFullQueryUpdate_default_0 (PreparedStatement ps, ROWCREATEINPUT dataObject) {
		set(index++, Integer.class, dataObject.getYpos(), "ypos", ps);
		set(index++, String.class, dataObject.getYname(), "yname", ps);
		set(index++, Integer.class, this._ypos, ps);
		set(index++, String.class, this._yname, ps);
	}
	
	public void onPrepareFullQueryInsert_default_0 (PreparedStatement ps, ROWCREATEINPUT dataObject) {
		set(index++, Integer.class, dataObject.getYpos(), "ypos", ps);
		set(index++, String.class, dataObject.getYname(), "yname", ps);
	}
	
	static {
		_FACTORY_FIELDS.add(new MetaField("yname",String.class,"","","",false,false));
		_FACTORY_FIELDS.add(new MetaField("ypos",Integer.class,"","","",false,false));
	
		_FACTORY_FIELDS = Collections.unmodifiableList(_FACTORY_FIELDS);
	}
	
	@Override
	public int add(DataObject insert, boolean immediate) {
		return super.add(insert, immediate);
	}
	@Override
	public int add(ROWCREATEINPUT insert, String... autoIncreasedFields) {
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
	    return "ROWCREATEDOF [" + super.toString()
	        + ", yname=" + _yname
	        + ", ypos=" + _ypos
	        + "]";
	}
}


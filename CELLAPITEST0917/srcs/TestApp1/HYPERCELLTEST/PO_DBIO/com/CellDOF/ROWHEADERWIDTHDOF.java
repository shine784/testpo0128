package com.CellDOF;

        
import java.sql.PreparedStatement;
import com.tmax.proobject.model.dataobject.Session;
import com.tmax.proobject.model.dataobject.DataObject;
import com.CellDO.ROWHEADERWIDTHDO;
import com.tmax.proobject.dataobject.factory.Query;
import com.tmax.proobject.dataobject.factory.DBDataObjectFactory;
import com.tmax.proobject.dataobject.model.MetaField;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import com.tmax.proobject.model.exception.FieldNotFoundException;

public class ROWHEADERWIDTHDOF extends DBDataObjectFactory<ROWHEADERWIDTHDO>
{
	public ROWHEADERWIDTHDOF(){
		super();
	}
	
	public ROWHEADERWIDTHDOF(Session session){
		super(session);
	}
	
	public ROWHEADERWIDTHDOF(String datasource){
		super(datasource);
	}
	
	public ROWHEADERWIDTHDOF(String datasource, boolean autocommit){
			super(datasource, autocommit);
	}
	
	private String _fromv;
	private String _tov;
	private String _yname;
	private Integer _ypos;
	private Integer _ywidth;
	
	
	public static enum FULLQUERY  implements Query {
		SELECT_DEFAULT_0("/* com.CellDOF.ROWHEADERWIDTHDOF */ \n"
		                                  + "select W.YWIDTH \n"
		                                  + "from verticalwidth W \n"
		                                  + "join verticalmap M \n"
		                                  + "on (W.YNAME=M.YNAME) \n"
		                                  + "where M.YPOS >= ? and M.YPOS < ?;"),
		UPDATE_DEFAULT_0("/* com.CellDOF.ROWHEADERWIDTHDOF */ \n"
		                                  + "UPDATE     VERTICALWIDTH \n"
		                                  + "SET \n"
		                                  + "YWIDTH = ? \n"
		                                  + "WHERE \n"
		                                  + "    YNAME = (SELECT YNAME from VERTICALMAP WHERE YPOS = ?);"),
		INSERT_DEFAULT_0("/* com.CellDOF.ROWHEADERWIDTHDOF */ \n"
		                                  + "INSERT INTO VERTICALWIDTH ( \n"
		                                  + "YNAME \n"
		                                  + ") VALUES ( \n"
		                                  + "? \n"
		                                  + ")"),
		DELETE_DEFAULT_0("/* com.CellDOF.ROWHEADERWIDTHDOF */ \n"
		                                  + "DELETE FROM VERTICALWIDTH \n"
		                                  + "WHERE \n"
		                                  + "A.YWIDTH = ? \n"
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
	
	
	 	
	private static String[] _QUERY_TABLES = {"verticalwidth", "verticalmap", "VERTICALWIDTH", "VERTICALMAP"};
	private static List<MetaField> _FACTORY_FIELDS = new ArrayList<MetaField>();
	
	@Override
	public void init() {
		_fromv = null;
		_tov = null;
		_yname = null;
		_ypos = null;
		_ywidth = null;
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
	public ROWHEADERWIDTHDO getDataObject() {
		return new ROWHEADERWIDTHDO();
	}
	
	public void setFullQuery(ROWHEADERWIDTHDOF.FULLQUERY query) {
		useFullQuery = true;
		this.query = query;
	}
	
	public void setFullQuery(String name) {
		ROWHEADERWIDTHDOF.FULLQUERY query = ROWHEADERWIDTHDOF.FULLQUERY.valueOf(name);
		setFullQuery(query);
	}
	
	@Override
	public List<MetaField> getFactoryFields() {
		return _FACTORY_FIELDS;
	}
	
	public String getFromv() {
	    return _fromv;
	}
	
	public void setFromv(String _fromv) {
	    this._fromv = _fromv;
	}
	
	
	public String getTov() {
	    return _tov;
	}
	
	public void setTov(String _tov) {
	    this._tov = _tov;
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
	
	
	public Integer getYwidth() {
	    return _ywidth;
	}
	
	public void setYwidth(Integer _ywidth) {
	    this._ywidth = _ywidth;
	}
	
	
	
	@Override
	public Object getField(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
		case "fromv" : return _fromv;
		case "tov" : return _tov;
		case "yname" : return _yname;
		case "ypos" : return _ypos;
		case "ywidth" : return _ywidth;
		default : throw new FieldNotFoundException("unknown fieldName : "+fieldName+"("+fieldName.hashCode()+")");
		}
	}    
	
	@Override
	public void setField(String fieldName, Object value) throws FieldNotFoundException {
		switch(fieldName) {
		case "fromv" : this._fromv = ((String)value); break;
		case "tov" : this._tov = ((String)value); break;
		case "yname" : this._yname = ((String)value); break;
		case "ypos" : this._ypos = ((Integer)value); break;
		case "ywidth" : this._ywidth = ((Integer)value); break;
		default : throw new FieldNotFoundException("unknown fieldName : "+fieldName+"("+fieldName.hashCode()+")");
		}
	}
	
	@Override
	public Class<?> getFieldClassType(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "fromv" :
				return String.class;
			case "tov" :
				return String.class;
			case "yname" :
				return String.class;
			case "ypos" :
				return Integer.class;
			case "ywidth" :
				return Integer.class;
			default : throw new FieldNotFoundException("unknown fieldName : "+fieldName+"("+fieldName.hashCode()+")");
		}
	}
	
	
	
	
	@Override
	public void onPrepareFullQuery(PreparedStatement ps, DataObject dataObject) {
		if(useFullQuery && query == ROWHEADERWIDTHDOF.FULLQUERY.SELECT_DEFAULT_0) {
			onPrepareFullQuerySelect_default_0(ps, (ROWHEADERWIDTHDO)dataObject);
		} else if(useFullQuery && query == ROWHEADERWIDTHDOF.FULLQUERY.UPDATE_DEFAULT_0) {
			onPrepareFullQueryUpdate_default_0(ps, (ROWHEADERWIDTHDO)dataObject);
		} else if(useFullQuery && query == ROWHEADERWIDTHDOF.FULLQUERY.INSERT_DEFAULT_0) {
			onPrepareFullQueryInsert_default_0(ps, (ROWHEADERWIDTHDO)dataObject);
		} else if(useFullQuery && query == ROWHEADERWIDTHDOF.FULLQUERY.DELETE_DEFAULT_0) {
			onPrepareFullQueryDelete_default_0(ps, (ROWHEADERWIDTHDO)dataObject);
		}
	}
	
	public void onPrepareFullQueryDelete_default_0 (PreparedStatement ps, ROWHEADERWIDTHDO dataObject) {
		set(index++, Integer.class, this._ywidth, ps);
		set(index++, String.class, this._yname, ps);
	}
	
	public void onPrepareFullQuerySelect_default_0 (PreparedStatement ps, ROWHEADERWIDTHDO dataObject) {
		set(index++, String.class, this._fromv, ps);
		set(index++, String.class, this._tov, ps);
	}
	
	public void onPrepareFullQueryUpdate_default_0 (PreparedStatement ps, ROWHEADERWIDTHDO dataObject) {
		set(index++, Integer.class, dataObject.getYwidth(), "ywidth", ps);
		set(index++, Integer.class, this._ypos, ps);
	}
	
	public void onPrepareFullQueryInsert_default_0 (PreparedStatement ps, ROWHEADERWIDTHDO dataObject) {
		set(index++, String.class, dataObject.getYname(), "yname", ps);
	}
	
	static {
		_FACTORY_FIELDS.add(new MetaField("fromv",String.class,"","","",false,false));
		_FACTORY_FIELDS.add(new MetaField("tov",String.class,"","","",false,false));
		_FACTORY_FIELDS.add(new MetaField("yname",String.class,"","","",false,false));
		_FACTORY_FIELDS.add(new MetaField("ypos",Integer.class,"","","",false,false));
		_FACTORY_FIELDS.add(new MetaField("ywidth",Integer.class,"","","",false,false));
	
		_FACTORY_FIELDS = Collections.unmodifiableList(_FACTORY_FIELDS);
	}
	
	@Override
	public int add(DataObject insert, boolean immediate) {
		return super.add(insert, immediate);
	}
	@Override
	public int add(ROWHEADERWIDTHDO insert, String... autoIncreasedFields) {
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
	    return "ROWHEADERWIDTHDOF [" + super.toString()
	        + ", fromv=" + _fromv
	        + ", tov=" + _tov
	        + ", yname=" + _yname
	        + ", ypos=" + _ypos
	        + ", ywidth=" + _ywidth
	        + "]";
	}
}


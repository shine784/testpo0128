package com.CellDOF;

        
import java.sql.PreparedStatement;
import com.tmax.proobject.model.dataobject.Session;
import com.tmax.proobject.model.dataobject.DataObject;
import com.CellDO.HCFINDALLDTOGET;
import com.tmax.proobject.dataobject.factory.Query;
import com.tmax.proobject.dataobject.factory.DBDataObjectFactory;
import com.tmax.proobject.dataobject.model.MetaField;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import com.tmax.proobject.model.exception.FieldNotFoundException;

public class HCFINDALLDOFGET extends DBDataObjectFactory<HCFINDALLDTOGET>
{
	public HCFINDALLDOFGET(){
		super();
	}
	
	public HCFINDALLDOFGET(Session session){
		super(session);
	}
	
	public HCFINDALLDOFGET(String datasource){
		super(datasource);
	}
	
	public HCFINDALLDOFGET(String datasource, boolean autocommit){
			super(datasource, autocommit);
	}
	
	
	
	public static enum FULLQUERY  implements Query {
		SELECT_DEFAULT_0("/* com.CellDOF.HCFINDALLDOFGET */ \n"
		                                  + "SELECT     A.ID, \n"
		                                  + "A.NEXTID, \n"
		                                  + "A.CHILDID, \n"
		                                  + "A.CONTENTDATA, \n"
		                                  + "A.CONTENTTYPE \n"
		                                  + "FROM \n"
		                                  + "    DOCUMENTNODE    A")
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
				default :
					return null;
			}
		}
	}
	
	
	 	
	private static String[] _QUERY_TABLES = {"DOCUMENTNODE"};
	private static List<MetaField> _FACTORY_FIELDS = new ArrayList<MetaField>();
	
	@Override
	public void init() {
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
	public HCFINDALLDTOGET getDataObject() {
		return new HCFINDALLDTOGET();
	}
	
	public void setFullQuery(HCFINDALLDOFGET.FULLQUERY query) {
		useFullQuery = true;
		this.query = query;
	}
	
	public void setFullQuery(String name) {
		HCFINDALLDOFGET.FULLQUERY query = HCFINDALLDOFGET.FULLQUERY.valueOf(name);
		setFullQuery(query);
	}
	
	@Override
	public List<MetaField> getFactoryFields() {
		return _FACTORY_FIELDS;
	}
	
	
	@Override
	public Object getField(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
		default : throw new FieldNotFoundException("unknown fieldName : "+fieldName+"("+fieldName.hashCode()+")");
		}
	}    
	
	@Override
	public void setField(String fieldName, Object value) throws FieldNotFoundException {
		switch(fieldName) {
		default : throw new FieldNotFoundException("unknown fieldName : "+fieldName+"("+fieldName.hashCode()+")");
		}
	}
	
	@Override
	public Class<?> getFieldClassType(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			default : throw new FieldNotFoundException("unknown fieldName : "+fieldName+"("+fieldName.hashCode()+")");
		}
	}
	
	
	
	
	
	static {
	
		_FACTORY_FIELDS = Collections.unmodifiableList(_FACTORY_FIELDS);
	}
	
	@Override
	public int add(DataObject insert, boolean immediate) {
		return super.add(insert, immediate);
	}
	@Override
	public int add(HCFINDALLDTOGET insert, String... autoIncreasedFields) {
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
	    return "HCFINDALLDOFGET [" + super.toString()
	        + "]";
	}
}


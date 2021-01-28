package com.CellDOF;

        
import java.sql.PreparedStatement;
import com.tmax.proobject.model.dataobject.Session;
import com.tmax.proobject.model.dataobject.DataObject;
import com.CellDO.CELLINSERTDO;
import com.tmax.proobject.dataobject.factory.Query;
import com.tmax.proobject.dataobject.factory.DBDataObjectFactory;
import com.tmax.proobject.dataobject.model.MetaField;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import com.tmax.proobject.model.exception.FieldNotFoundException;

public class CELLINSERTDOF extends DBDataObjectFactory<CELLINSERTDO>
{
	public CELLINSERTDOF(){
		super();
	}
	
	public CELLINSERTDOF(Session session){
		super(session);
	}
	
	public CELLINSERTDOF(String datasource){
		super(datasource);
	}
	
	public CELLINSERTDOF(String datasource, boolean autocommit){
			super(datasource, autocommit);
	}
	
	
	
	public static enum FULLQUERY  implements Query {
		CELLINSERT("INSERT INTO testcells(C\"+arg0.getXpos()+\",cellkey) values('R\"+arg0.getYpos()+\"',cell_seq.currval);"),
		CELLINFOINSERT("INSERT INTO testcellinfo values(cell_seq.currval,'C\"+arg0.getXpos()+\"' ,'\"+arg0.getStringdata()+\"','',null,null,null,'D');"),
		CELLINFOUPDATE("UPDATE testcellinfo set STRINGDATA='\"+arg0.getStringdata()+\"', DOUBLEDATA=\"+arg0.getDoubledata()+\" where cellkey = (select cellkey from testcells where C\"+arg0.getXpos()+\"='R\"+arg0.getYpos()+\"');")
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
				case UPDATE :
					return FULLQUERY.CELLINFOUPDATE;
				default :
					return null;
			}
		}
	}
	
	
	 	
	private static String[] _QUERY_TABLES = {"testcells", "testcellinfo"};
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
	public CELLINSERTDO getDataObject() {
		return new CELLINSERTDO();
	}
	
	public void setFullQuery(CELLINSERTDOF.FULLQUERY query) {
		useFullQuery = true;
		this.query = query;
	}
	
	public void setFullQuery(String name) {
		CELLINSERTDOF.FULLQUERY query = CELLINSERTDOF.FULLQUERY.valueOf(name);
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
	public int add(CELLINSERTDO insert, String... autoIncreasedFields) {
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
	    return "CELLINSERTDOF [" + super.toString()
	        + "]";
	}
}


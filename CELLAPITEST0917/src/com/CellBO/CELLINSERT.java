package com.CellBO;

import com.CellDO.AFTERINSERTMSG;
import com.CellDO.CELLINSERTDO;
import com.CellDOF.CELLINSERTDOF;
import com.tmax.proobject.core.BizObject;
import com.tmax.proobject.core.DataSource;
import com.tmax.proobject.model.business.BusinessObject;
import com.tmax.proobject.logger.ProObjectLogger;
import com.tmax.proobject.logger.application.ServiceLogger;
//get -> get, update->update, Insert->add, delete->remove
/* CELLINSERT */
@BizObject(logicalName = "CELLINSERT")
public class CELLINSERT implements BusinessObject {
	private ProObjectLogger logger = ServiceLogger.getLogger();
	@DataSource(name="tibero6_dev")
	private CELLINSERTDOF var1 = null;
	    	
	public AFTERINSERTMSG Mathod2(CELLINSERTDO arg0) throws Throwable
	{
	//[BEGIN_NODE_BLOCK, , Mathod2(int)]
		var1 = new CELLINSERTDOF("tibero6_dev"); 
		AFTERINSERTMSG doCall1 = new AFTERINSERTMSG();
		int resultCnt1 = 0;
		StringBuilder Insertquery = new StringBuilder();
		StringBuilder Insertquery2 = new StringBuilder();
		StringBuilder Updatequery = new StringBuilder();
		String cellkey = "C"+arg0.getXpos()+"R"+arg0.getYpos();
		Insertquery.append("INSERT INTO testcells(C"+arg0.getXpos()+",cellkey) values('R"+arg0.getYpos()+"','"+cellkey+"');");
		Insertquery2.append("INSERT INTO testcellinfo values('"+cellkey+"','C"+arg0.getXpos()+"','"+arg0.getStringdata()+"','"+arg0.getDoubledata()+"','"+arg0.getFormula()+"','"+arg0.getStyle()+"','"+arg0.getChain()+"','"+arg0.getDatatype()+"');");
		//Insertquery.append(" COMMIT;");
		Updatequery.append("UPDATE testcellinfo set STRINGDATA='"+arg0.getStringdata()+"', DOUBLEDATA="+arg0.getDoubledata()+
				", FORMULA='"+arg0.getFormula()+"', STYLE='"+arg0.getStyle()+"', CHAIN='"+arg0.getChain()+"', DATATYPE='"+arg0.getDatatype()+"' where cellkey = '"+cellkey+"'");
		try{
			var1.setUserQuery(Insertquery.toString());
			var1.add();
			var1.setUserQuery(Insertquery2.toString());
			var1.add();
			//var1.executeAll();
		}catch (Exception e){
		    //에러시 수행
			//var1.setFullQuery(CELLINSERTDOF.FULLQUERY.CELLINFOUPDATE);
			var1.setUserQuery(Updatequery.toString());
			var1.update();
		}finally{
		    //무조건 수행
			
		} 
			//factory
		return doCall1;
	//[END_NODE_BLOCK, , Mathod2(int)]
	}
}
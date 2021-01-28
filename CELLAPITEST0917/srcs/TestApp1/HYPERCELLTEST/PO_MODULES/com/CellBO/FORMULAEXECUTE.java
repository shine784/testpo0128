package com.CellBO;

import com.CellDO.AFTERINSERTMSG;
import com.CellDO.CELLINSERTDO;
import com.CellDOF.CELLINSERTDOF;
import com.tmax.proobject.core.BizObject;
import com.tmax.proobject.core.DataSource;
import com.tmax.proobject.model.business.BusinessObject;
import com.tmax.proobject.logger.ProObjectLogger;
import com.tmax.proobject.logger.application.ServiceLogger;

/*  */
@BizObject(logicalName = "FORMULAEXECUTE")
public class FORMULAEXECUTE implements BusinessObject {
	private ProObjectLogger logger = ServiceLogger.getLogger();
	@DataSource(name="tibero6_dev")
	private CELLINSERTDOF var1 = null;
	    	
	public AFTERINSERTMSG Mathod2(CELLINSERTDO arg0) throws Throwable
	{
	//[BEGIN_NODE_BLOCK, , Mathod2(int)]
		var1 = new CELLINSERTDOF("tibero6_dev"); 
		AFTERINSERTMSG doCall1 = new AFTERINSERTMSG();
		String cellkey = "C"+arg0.getXpos()+"R"+arg0.getYpos();
		String formula = arg0.getFormula();
		
		try{

		}catch (Exception e){
		}finally{
		    //무조건 수행
			
		} 
		return doCall1;
	}
}
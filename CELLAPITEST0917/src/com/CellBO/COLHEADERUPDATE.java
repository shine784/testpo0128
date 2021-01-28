package com.CellBO;

import com.CellDO.COLHEADERWIDTHDO;
import com.CellDOF.COLHEADERWIDTHDOF;
import com.tmax.proobject.core.BizObject;
import com.tmax.proobject.core.DataSource;
import com.tmax.proobject.model.business.BusinessObject;
import com.tmax.proobject.logger.ProObjectLogger;
import com.tmax.proobject.logger.application.ServiceLogger;

/*  */
@BizObject(logicalName = "COLHEADERUPDATE")
public class COLHEADERUPDATE implements BusinessObject {
	private ProObjectLogger logger = ServiceLogger.getLogger();
	@DataSource(name="tibero6_dev")
	private COLHEADERWIDTHDOF var1 = null;
	
	public COLHEADERWIDTHDO Mathod1(COLHEADERWIDTHDO arg0) throws Throwable
	{
		COLHEADERWIDTHDO doCall1 = new COLHEADERWIDTHDO();
		var1 = new COLHEADERWIDTHDOF("tibero6_dev");
		StringBuilder Update = new StringBuilder();
		Update.append("update horizonwidth set XWIDTH = "+arg0.getXwidth()+" where xname = (select XNAME from horizonmap where XPOS="+arg0.getXpos()+");");
		
		{
			try{
				
				//var1.setXpos(arg0.getXpos());
				//var1.setXwidth(arg0.getXwidth());
				
				//var1.setFullQuery(COLHEADERWIDTHDOF.FULLQUERY.UPDATE_DEFAULT_0);
				var1.setUserQuery(Update.toString());
				var1.update();
				var1.executeAll();
			}catch (Exception e){
				System.out.println(e);
			}
		return doCall1;
		}
	}
	//[END_NODE_BLOCK, , Mathod2(int)]

}
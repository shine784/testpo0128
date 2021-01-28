package com.CellBO;

import com.CellDO.AFTERINSERTMSG;
import com.CellDO.ROWCREATEINPUT;
import com.CellDO.ROWHEADERWIDTHDO;
import com.CellDOF.ROWCREATEDOF;
import com.CellDOF.ROWHEADERWIDTHDOF;
import com.tmax.proobject.core.BizObject;
import com.tmax.proobject.core.DataSource;
import com.tmax.proobject.model.business.BusinessObject;
import com.tmax.proobject.logger.ProObjectLogger;
import com.tmax.proobject.logger.application.ServiceLogger;

/*  */
@BizObject(logicalName = "ROWHEADERUPDATE")
public class ROWHEADERUPDATE implements BusinessObject {
	private ProObjectLogger logger = ServiceLogger.getLogger();
	@DataSource(name="tibero6_dev")
	private ROWHEADERWIDTHDOF var1 = null;
	
	public ROWHEADERWIDTHDO Mathod1(ROWHEADERWIDTHDO arg0) throws Throwable
	{
		ROWHEADERWIDTHDO doCall1 = new ROWHEADERWIDTHDO();
		var1 = new ROWHEADERWIDTHDOF("tibero6_dev");
		StringBuilder Update = new StringBuilder();
		Update.append("update verticalwidth set YWIDTH = "+arg0.getYwidth()+" where yname = (select YNAME from verticalmap where YPOS="+arg0.getYpos()+");");
		{
			try{
				//var1.setYpos(arg0.getYpos());
				//var1.setYwidth(arg0.getYwidth());
				
				//var1.setFullQuery(ROWHEADERWIDTHDOF.FULLQUERY.UPDATE_DEFAULT_0);
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
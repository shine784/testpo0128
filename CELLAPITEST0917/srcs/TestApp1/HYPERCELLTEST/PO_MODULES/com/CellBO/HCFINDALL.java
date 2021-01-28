package com.CellBO;

import com.CellDO.HCFINDALLDTOGET;
import com.CellDO.HCFINDALLDTOLIST;
import com.CellDOF.HCFINDALLDOFGET;
import com.tmax.proobject.core.BizObject;
import com.tmax.proobject.core.DataSource;
import com.tmax.proobject.model.business.BusinessObject;
import com.tmax.proobject.logger.ProObjectLogger;
import com.tmax.proobject.logger.application.ServiceLogger;

/*  */
@BizObject(logicalName = "HCFINDALL")
public class HCFINDALL implements BusinessObject {
	private ProObjectLogger logger = ServiceLogger.getLogger();
	@DataSource(name="tibero6_dev")
	private HCFINDALLDOFGET var1 = null;
	
	public HCFINDALLDTOLIST Mathod1(HCFINDALLDTOGET req) throws Throwable
	{
		HCFINDALLDTOLIST doCall1 = new HCFINDALLDTOLIST();
		var1 = new HCFINDALLDOFGET("tibero6_dev");
		var1.setFullQuery(HCFINDALLDOFGET.FULLQUERY.SELECT_DEFAULT_0);//변경
		doCall1.setContent(var1.getDataObjectList());
		
		return doCall1;
	}
	//[END_NODE_BLOCK, , Mathod2(int)]
}
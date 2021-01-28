package com.CellBO;

import java.util.ArrayList;
import com.CellDO.COLHEADERWIDTHDO;
import com.CellDO.COLHEADERWIDTHLIST;
import com.CellDOF.COLHEADERWIDTHDOF;
import com.tmax.proobject.core.BizObject;
import com.tmax.proobject.core.DataSource;
import com.tmax.proobject.engine.servicemanager.ServiceManager;
import com.tmax.proobject.model.business.BusinessObject;
import com.tmax.proobject.model.network.ProObjectRequest;
import com.tmax.proobject.model.network.RequestContext;
import com.tmax.proobject.logger.ProObjectLogger;
import com.tmax.proobject.logger.application.ServiceLogger;

/*  */
@BizObject(logicalName = "COLHEADERSELECT")
public class COLHEADERSELECT implements BusinessObject {
	private ProObjectLogger logger = ServiceLogger.getLogger();
	@DataSource(name="tibero6_dev")
	private COLHEADERWIDTHDOF var1 = null;
	
	public COLHEADERWIDTHLIST Mathod1(COLHEADERWIDTHDO arg0) throws Throwable
	{
	    RequestContext requestContext = ServiceManager.getCurrentRequestContext();
	    ProObjectRequest preq = requestContext.getRequest();
	    String[] fh = preq.getQueryString("fromh");
	    String[] th = preq.getQueryString("toh");
	    
		COLHEADERWIDTHLIST doCall1 = new COLHEADERWIDTHLIST();
		
		var1 = new COLHEADERWIDTHDOF("tibero6_dev");
		var1.setFromh(fh[0]);
		var1.setToh(th[0]);
		
		var1.setFullQuery(COLHEADERWIDTHDOF.FULLQUERY.SELECT_DEFAULT_0);
		doCall1.setWidthlist(var1.getDataObjectList());
		
			try{
			}catch (Exception e){
				System.out.println(e);
			}
		return doCall1;
	}
	//[END_NODE_BLOCK, , Mathod2(int)]

}
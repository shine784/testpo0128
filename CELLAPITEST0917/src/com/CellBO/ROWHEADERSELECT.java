package com.CellBO;

import java.util.ArrayList;
import com.CellDO.COLSELECTDO;
import com.CellDO.COLSELECTDOROW;
import com.CellDO.ROWHEADERWIDTHDO;
import com.CellDO.ROWHEADERWIDTHLIST;
import com.CellDOF.COLHEADERWIDTHDOF;
import com.CellDOF.ROWHEADERWIDTHDOF;
import com.tmax.proobject.core.BizObject;
import com.tmax.proobject.core.DataSource;
import com.tmax.proobject.engine.servicemanager.ServiceManager;
import com.tmax.proobject.model.business.BusinessObject;
import com.tmax.proobject.model.network.ProObjectRequest;
import com.tmax.proobject.model.network.RequestContext;
import com.tmax.proobject.logger.ProObjectLogger;
import com.tmax.proobject.logger.application.ServiceLogger;

/*  */
@BizObject(logicalName = "ROWHEADERSELECT")
public class ROWHEADERSELECT implements BusinessObject {
	private ProObjectLogger logger = ServiceLogger.getLogger();
	@DataSource(name="tibero6_dev")
	private ROWHEADERWIDTHDOF var1 = null;
	
	public ROWHEADERWIDTHLIST Mathod1(ROWHEADERWIDTHDO arg0) throws Throwable
	{
	    RequestContext requestContext = ServiceManager.getCurrentRequestContext();
	    ProObjectRequest preq = requestContext.getRequest();
	    String[] fv = preq.getQueryString("fromv");;
	    String[] tv = preq.getQueryString("tov");
	    
		ROWHEADERWIDTHLIST doCall1 = new ROWHEADERWIDTHLIST();
		var1 = new ROWHEADERWIDTHDOF("tibero6_dev");
		var1.setFromv(fv[0]);
		var1.setTov(tv[0]);
		
		var1.setFullQuery(ROWHEADERWIDTHDOF.FULLQUERY.SELECT_DEFAULT_0);
		doCall1.setWidthlist(var1.getDataObjectList());
		
			try{
			}catch (Exception e){
				System.out.println(e);
			}
		return doCall1;
	}
	//[END_NODE_BLOCK, , Mathod2(int)]

}
package com.CellBO;

import com.CellDO.HCFINDALLDTOGET;
import com.CellDO.HCFINDALLDTOLIST;
import com.CellDOF.HCFINDALLDOFGET;
import com.tmax.proobject.core.BizObject;
import com.tmax.proobject.core.DataSource;
import com.tmax.proobject.engine.servicemanager.ServiceManager;
import com.tmax.proobject.model.business.BusinessObject;
import com.tmax.proobject.model.network.ProObjectRequest;
import com.tmax.proobject.model.network.RequestContext;
import com.tmax.proobject.logger.ProObjectLogger;
import com.tmax.proobject.logger.application.ServiceLogger;

/*  */
@BizObject(logicalName = "PAMTESTBO")
public class PAMTESTBO implements BusinessObject {
	private ProObjectLogger logger = ServiceLogger.getLogger();
	@DataSource(name="tibero6_dev")
	private HCFINDALLDOFGET var1 = null;
	
	public HCFINDALLDTOLIST Mathod1(HCFINDALLDTOGET  req) throws Throwable
	
	{	   
		
	    RequestContext requestContext = ServiceManager.getCurrentRequestContext();
	    ProObjectRequest preq = requestContext.getRequest();
	    String[] query = preq.getQueryString("id");
	    String[] query2 = preq.getQueryString("name");
	    
	    
	    //SELECT DISTINCT V.YPOS, H.XPOS, I.cellkey, I.doubledata, I.stringdata, I.formula, I.style, I.chain, I.datatype    FROM testcellinfo I   JOIN testcells T  ON (I.CELLKEY=T.CELLKEY)   JOIN verticalmap V ON(T.C2=V.YNAME and V.YPOS =2) JOIN horizonmap H ON( I.XNAME = H.XNAME);

	    
		HCFINDALLDTOLIST doCall1 = new HCFINDALLDTOLIST();
		var1 = new HCFINDALLDOFGET("tibero6_dev");
		var1.setFullQuery(HCFINDALLDOFGET.FULLQUERY.SELECT_DEFAULT_0);//변경
		doCall1.setContent(var1.getDataObjectList());
		
		return doCall1;
	}
	//[END_NODE_BLOCK, , Mathod2(int)]
}
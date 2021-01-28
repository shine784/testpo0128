package com.CellSO;


import com.tmax.proobject.core.ServiceObject;
import com.tmax.proobject.model.business.BusinessObject;
import com.tmax.proobject.model.dataobject.DataObject;
import com.tmax.proobject.engine.servicemanager.*;
import com.tmax.proobject.logger.ProObjectLogger;
import com.tmax.proobject.logger.application.ServiceLogger;
import com.tmax.proobject.model.dto.*;
import com.tmax.proobject.core.DataSource;
import javax.inject.Inject;
import com.tmax.proobject.engine.waitobject.WaitObject;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.io.File;
import com.tmax.proobject.model.transaction.TransactionType;
import com.tmax.proobject.service.RCallReturn;
import com.tmax.proobject.dataobject.util.DataDefinitionExecutor;
import com.CellDO.COLHEADERWIDTHDO;
import com.CellDO.COLHEADERWIDTHLIST;
import com.CellBO.COLHEADERSELECT;

@ServiceObject
public class COLHEADERSELECTSO implements com.tmax.proobject.model.service.ServiceObject<com.CellDO.COLHEADERWIDTHDO, com.CellDO.COLHEADERWIDTHLIST>
{
	
	private ProObjectLogger logger = ServiceLogger.getLogger();
	public com.CellDO.COLHEADERWIDTHDO input = new com.CellDO.COLHEADERWIDTHDO();
	public com.CellBO.COLHEADERSELECT var1 = new com.CellBO.COLHEADERSELECT();
	public com.CellDO.COLHEADERWIDTHLIST output = new com.CellDO.COLHEADERWIDTHLIST();
	    	
	
	    	
	@Override
	public com.CellDO.COLHEADERWIDTHLIST service(com.CellDO.COLHEADERWIDTHDO arg0) throws java.lang.Throwable
	{
	//[BEGIN_NODE_BLOCK, , service(COLHEADERWIDTHDO)]
	{
	
	//[BEGIN_NODE_BLOCK, 0, service(COLHEADERWIDTHDO)]
	{
	    //[BEGIN_PRE_ASSIGN_BLOCK, 0, service(COLHEADERWIDTHDO)]
	    
	    //[END_PRE_ASSIGN_BLOCK, 0, service(COLHEADERWIDTHDO)]
	    output = var1.Mathod1(arg0);
	    //[BEGIN_POST_ASSIGN_BLOCK, 0, service(COLHEADERWIDTHDO)]
	    
	    //[END_POST_ASSIGN_BLOCK, 0, service(COLHEADERWIDTHDO)]
	}
	//[END_NODE_BLOCK, 0, service(COLHEADERWIDTHDO)]
	
	//[BEGIN_NODE_BLOCK, 1, service(COLHEADERWIDTHDO)]
	{
	//버추얼 모듈
	 //[BEGIN_VIRTUAL_CODE_BLOCK, 1, service(COLHEADERWIDTHDO)]
	 {
		 return output;
	 }
	 //[END_VIRTUAL_CODE_BLOCK, 1, service(COLHEADERWIDTHDO)]
	
	}
	//[END_NODE_BLOCK, 1, service(COLHEADERWIDTHDO)]
	}
	//[END_NODE_BLOCK, , service(COLHEADERWIDTHDO)]
	}
	
}


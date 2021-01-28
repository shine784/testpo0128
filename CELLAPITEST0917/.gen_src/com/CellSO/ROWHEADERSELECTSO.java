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
import com.CellDO.ROWHEADERWIDTHDO;
import com.CellDO.ROWHEADERWIDTHLIST;
import com.CellBO.ROWHEADERSELECT;

@ServiceObject
public class ROWHEADERSELECTSO implements com.tmax.proobject.model.service.ServiceObject<com.CellDO.ROWHEADERWIDTHDO, com.CellDO.ROWHEADERWIDTHLIST>
{
	
	private ProObjectLogger logger = ServiceLogger.getLogger();
	public com.CellDO.ROWHEADERWIDTHDO input = new com.CellDO.ROWHEADERWIDTHDO();
	public com.CellDO.ROWHEADERWIDTHLIST output = new com.CellDO.ROWHEADERWIDTHLIST();
	public com.CellBO.ROWHEADERSELECT var1 = new com.CellBO.ROWHEADERSELECT();
	    	
	
	    	
	@Override
	public com.CellDO.ROWHEADERWIDTHLIST service(com.CellDO.ROWHEADERWIDTHDO arg0) throws java.lang.Throwable
	{
	//[BEGIN_NODE_BLOCK, , service(ROWHEADERWIDTHDO)]
	{
	
	//[BEGIN_NODE_BLOCK, 0, service(ROWHEADERWIDTHDO)]
	{
	    //[BEGIN_PRE_ASSIGN_BLOCK, 0, service(ROWHEADERWIDTHDO)]
	    
	    //[END_PRE_ASSIGN_BLOCK, 0, service(ROWHEADERWIDTHDO)]
	    output = var1.Mathod1(arg0);
	    //[BEGIN_POST_ASSIGN_BLOCK, 0, service(ROWHEADERWIDTHDO)]
	    
	    //[END_POST_ASSIGN_BLOCK, 0, service(ROWHEADERWIDTHDO)]
	}
	//[END_NODE_BLOCK, 0, service(ROWHEADERWIDTHDO)]
	
	//[BEGIN_NODE_BLOCK, 1, service(ROWHEADERWIDTHDO)]
	{
	//버추얼 모듈
	 //[BEGIN_VIRTUAL_CODE_BLOCK, 1, service(ROWHEADERWIDTHDO)]
	 {
return output;
	 }
	 //[END_VIRTUAL_CODE_BLOCK, 1, service(ROWHEADERWIDTHDO)]
	
	}
	//[END_NODE_BLOCK, 1, service(ROWHEADERWIDTHDO)]
	}
	//[END_NODE_BLOCK, , service(ROWHEADERWIDTHDO)]
	}
	
}


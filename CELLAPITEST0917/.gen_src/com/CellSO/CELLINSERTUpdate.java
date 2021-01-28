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
import com.CellDO.CELLINSERTDO;
import com.CellBO.CELLINSERT;
import com.CellDO.AFTERINSERTMSG;

@ServiceObject
public class CELLINSERTUpdate implements com.tmax.proobject.model.service.ServiceObject<com.CellDO.CELLINSERTDO, com.CellDO.AFTERINSERTMSG>
{
	
	private ProObjectLogger logger = ServiceLogger.getLogger();
	public com.CellDO.CELLINSERTDO input = new com.CellDO.CELLINSERTDO();
	public com.CellBO.CELLINSERT var1 = new com.CellBO.CELLINSERT();
	public com.CellDO.AFTERINSERTMSG output = new com.CellDO.AFTERINSERTMSG();
	    	
	
	    	
	@Override
	public com.CellDO.AFTERINSERTMSG service(com.CellDO.CELLINSERTDO arg0) throws java.lang.Throwable
	{
	//[BEGIN_NODE_BLOCK, , service(CELLINSERTDO)]
	{
	
	//[BEGIN_NODE_BLOCK, 0, service(CELLINSERTDO)]
	{
	    //[BEGIN_PRE_ASSIGN_BLOCK, 0, service(CELLINSERTDO)]
	    
	    //[END_PRE_ASSIGN_BLOCK, 0, service(CELLINSERTDO)]
	    output = var1.Mathod2(arg0);
	    //[BEGIN_POST_ASSIGN_BLOCK, 0, service(CELLINSERTDO)]
	    
	    //[END_POST_ASSIGN_BLOCK, 0, service(CELLINSERTDO)]
	}
	//[END_NODE_BLOCK, 0, service(CELLINSERTDO)]
	
	//[BEGIN_NODE_BLOCK, 1, service(CELLINSERTDO)]
	{
	//버추얼 모듈
	 //[BEGIN_VIRTUAL_CODE_BLOCK, 1, service(CELLINSERTDO)]
	 {
		 	return output;
	 }
	 //[END_VIRTUAL_CODE_BLOCK, 1, service(CELLINSERTDO)]
	
	}
	//[END_NODE_BLOCK, 1, service(CELLINSERTDO)]
	}
	//[END_NODE_BLOCK, , service(CELLINSERTDO)]
	}
	
}


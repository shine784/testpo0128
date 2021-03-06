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
import com.CellDO.HCFINDALLDTOLIST;
import com.CellBO.PAMTESTBO;
import com.CellDO.HCFINDALLDTOGET;

@ServiceObject
public class PAMTESTGet implements com.tmax.proobject.model.service.ServiceObject<com.CellDO.HCFINDALLDTOGET, com.CellDO.HCFINDALLDTOLIST>
{
	
	private ProObjectLogger logger = ServiceLogger.getLogger();
	public com.CellDO.HCFINDALLDTOLIST output = new com.CellDO.HCFINDALLDTOLIST();
	public com.CellBO.PAMTESTBO var1 = new com.CellBO.PAMTESTBO();
	public com.CellDO.HCFINDALLDTOGET input = new com.CellDO.HCFINDALLDTOGET();
	    	
	
	    	
	@Override
	public com.CellDO.HCFINDALLDTOLIST service(com.CellDO.HCFINDALLDTOGET arg0) throws java.lang.Throwable
	{
	//[BEGIN_NODE_BLOCK, , service(HCFINDALLDTOGET)]
	{
	
	//[BEGIN_NODE_BLOCK, 0, service(HCFINDALLDTOGET)]
	{
	    //[BEGIN_PRE_ASSIGN_BLOCK, 0, service(HCFINDALLDTOGET)]
	    
	    //[END_PRE_ASSIGN_BLOCK, 0, service(HCFINDALLDTOGET)]
	    output = var1.Mathod1(arg0);
	    //[BEGIN_POST_ASSIGN_BLOCK, 0, service(HCFINDALLDTOGET)]
	    
	    //[END_POST_ASSIGN_BLOCK, 0, service(HCFINDALLDTOGET)]
	}
	//[END_NODE_BLOCK, 0, service(HCFINDALLDTOGET)]
	
	//[BEGIN_NODE_BLOCK, 1, service(HCFINDALLDTOGET)]
	{
	//버추얼 모듈
	 //[BEGIN_VIRTUAL_CODE_BLOCK, 1, service(HCFINDALLDTOGET)]
	 {
		 return output;
	 }
	 //[END_VIRTUAL_CODE_BLOCK, 1, service(HCFINDALLDTOGET)]
	
	}
	//[END_NODE_BLOCK, 1, service(HCFINDALLDTOGET)]
	}
	//[END_NODE_BLOCK, , service(HCFINDALLDTOGET)]
	}
	
}


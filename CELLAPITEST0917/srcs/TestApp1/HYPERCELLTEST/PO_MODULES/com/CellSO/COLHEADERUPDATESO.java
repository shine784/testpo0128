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
import com.CellBO.COLHEADERUPDATE;

/**************************************************************************************************************
* 화일명 : COLHEADERUPDATESO.class
* 사용프로그램 : COLHEADERUPDATESOUpdate
* 설명 :  
**************************************************************************************************************/
@ServiceObject
public class COLHEADERUPDATESO implements com.tmax.proobject.model.service.ServiceObject<com.CellDO.COLHEADERWIDTHDO, com.CellDO.COLHEADERWIDTHDO>
{
	
	private ProObjectLogger logger = ServiceLogger.getLogger();
	public com.CellDO.COLHEADERWIDTHDO input = new com.CellDO.COLHEADERWIDTHDO();
	public com.CellDO.COLHEADERWIDTHDO output = new com.CellDO.COLHEADERWIDTHDO();
	public com.CellBO.COLHEADERUPDATE var1 = new com.CellBO.COLHEADERUPDATE();
	    	
	
	    	
	/**
	* @메소드명  : service 
	* @논리명    : service
	* @입력      : ${arg.type} ${arg.name}
	* @출력      : COLHEADERWIDTHDO
	* @ throws Exception java.lang.Throwable Throwable
	* @설명 : 
	*/
	@Override
	public com.CellDO.COLHEADERWIDTHDO service(com.CellDO.COLHEADERWIDTHDO arg0) throws java.lang.Throwable
	{
	//[BEGIN_NODE_BLOCK, , service(COLHEADERWIDTHDO)]
	{
	
	//[BEGIN_NODE_BLOCK, 1, service(COLHEADERWIDTHDO)]
	{
	    //[BEGIN_PRE_ASSIGN_BLOCK, 1, service(COLHEADERWIDTHDO)]
	    
	    //[END_PRE_ASSIGN_BLOCK, 1, service(COLHEADERWIDTHDO)]
	    output = var1.Mathod1(arg0);
	    //[BEGIN_POST_ASSIGN_BLOCK, 1, service(COLHEADERWIDTHDO)]
	    
	    //[END_POST_ASSIGN_BLOCK, 1, service(COLHEADERWIDTHDO)]
	}
	//[END_NODE_BLOCK, 1, service(COLHEADERWIDTHDO)]
	
	//[BEGIN_NODE_BLOCK, 0, service(COLHEADERWIDTHDO)]
	{
	//버추얼 모듈
	 //[BEGIN_VIRTUAL_CODE_BLOCK, 0, service(COLHEADERWIDTHDO)]
	 {
		 return output;
	 }
	 //[END_VIRTUAL_CODE_BLOCK, 0, service(COLHEADERWIDTHDO)]
	
	}
	//[END_NODE_BLOCK, 0, service(COLHEADERWIDTHDO)]
	}
	//[END_NODE_BLOCK, , service(COLHEADERWIDTHDO)]
	}
	
}


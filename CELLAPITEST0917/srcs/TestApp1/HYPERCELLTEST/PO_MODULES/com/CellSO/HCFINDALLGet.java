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
import com.CellDO.HCFINDALLDTOGET;
import com.CellDO.HCFINDALLDTOLIST;
import com.CellBO.HCFINDALL;

/**************************************************************************************************************
* 화일명 : HCFINDALLGet.class
* 사용프로그램 : HCFINDALLGet
* 설명 :  
**************************************************************************************************************/
@ServiceObject
public class HCFINDALLGet implements com.tmax.proobject.model.service.ServiceObject<com.CellDO.HCFINDALLDTOGET, com.CellDO.HCFINDALLDTOLIST>
{
	
	private ProObjectLogger logger = ServiceLogger.getLogger();
	public com.CellDO.HCFINDALLDTOGET input = new com.CellDO.HCFINDALLDTOGET();
	public com.CellDO.HCFINDALLDTOLIST output = new com.CellDO.HCFINDALLDTOLIST();
	public com.CellBO.HCFINDALL var1 = new com.CellBO.HCFINDALL();
	    	
	
	    	
	/**
	* @메소드명  : service 
	* @논리명    : service
	* @입력      : ${arg.type} ${arg.name}
	* @출력      : HCFINDALLDTOLIST
	* @ throws Exception java.lang.Throwable Throwable
	* @설명 : 
	*/
	@Override
	public com.CellDO.HCFINDALLDTOLIST service(com.CellDO.HCFINDALLDTOGET arg0) throws java.lang.Throwable
	{
	//[BEGIN_NODE_BLOCK, , service(HCFINDALLDTOGET)]
	{
	
	//[BEGIN_NODE_BLOCK, 2, service(HCFINDALLDTOGET)]
	{
	    //[BEGIN_PRE_ASSIGN_BLOCK, 2, service(HCFINDALLDTOGET)]
	    
	    //[END_PRE_ASSIGN_BLOCK, 2, service(HCFINDALLDTOGET)]
	    output = var1.Mathod1(arg0);
	    //[BEGIN_POST_ASSIGN_BLOCK, 2, service(HCFINDALLDTOGET)]
	    
	    //[END_POST_ASSIGN_BLOCK, 2, service(HCFINDALLDTOGET)]
	}
	//[END_NODE_BLOCK, 2, service(HCFINDALLDTOGET)]
	
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


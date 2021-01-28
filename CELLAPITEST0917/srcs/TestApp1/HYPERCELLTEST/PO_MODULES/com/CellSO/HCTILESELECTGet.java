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
import com.CellDO.HCGETDO;
import com.CellDO.COLSELECTMULTIROWS;
import com.CellBO.HCTILESELECT;

/**************************************************************************************************************
* 화일명 : HCTILESELECTGet.class
* 사용프로그램 : HCTILESELECTGet
* 설명 :  
**************************************************************************************************************/
@ServiceObject
public class HCTILESELECTGet implements com.tmax.proobject.model.service.ServiceObject<com.CellDO.HCGETDO, com.CellDO.COLSELECTMULTIROWS>
{
	
	private ProObjectLogger logger = ServiceLogger.getLogger();
	public com.CellDO.HCGETDO input = new com.CellDO.HCGETDO();
	public com.CellDO.COLSELECTMULTIROWS output = new com.CellDO.COLSELECTMULTIROWS();
	public com.CellBO.HCTILESELECT var1 = new com.CellBO.HCTILESELECT();
	    	
	
	    	
	/**
	* @메소드명  : service 
	* @논리명    : service
	* @입력      : ${arg.type} ${arg.name}
	* @출력      : COLSELECTMULTIROWS
	* @ throws Exception java.lang.Throwable Throwable
	* @설명 : 
	*/
	@Override
	public com.CellDO.COLSELECTMULTIROWS service(com.CellDO.HCGETDO arg0) throws java.lang.Throwable
	{
	//[BEGIN_NODE_BLOCK, , service(HCGETDO)]
	{
	
	//[BEGIN_NODE_BLOCK, 0, service(HCGETDO)]
	{
	    //[BEGIN_PRE_ASSIGN_BLOCK, 0, service(HCGETDO)]
	    
	    //[END_PRE_ASSIGN_BLOCK, 0, service(HCGETDO)]
	    output = var1.Mathod2(arg0);
	    //[BEGIN_POST_ASSIGN_BLOCK, 0, service(HCGETDO)]
	    
	    //[END_POST_ASSIGN_BLOCK, 0, service(HCGETDO)]
	}
	//[END_NODE_BLOCK, 0, service(HCGETDO)]
	
	//[BEGIN_NODE_BLOCK, 1, service(HCGETDO)]
	{
	//버추얼 모듈
	 //[BEGIN_VIRTUAL_CODE_BLOCK, 1, service(HCGETDO)]
	 {
		 return output;
	 }
	 //[END_VIRTUAL_CODE_BLOCK, 1, service(HCGETDO)]
	
	}
	//[END_NODE_BLOCK, 1, service(HCGETDO)]
	}
	//[END_NODE_BLOCK, , service(HCGETDO)]
	}
	
}


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
import com.CellDO.COLSELECTDO;
import com.CellBO.COLSELECT;

/**************************************************************************************************************
* 화일명 : COLSELECTSO.class
* 사용프로그램 : COLSELECTSO
* 설명 :  
**************************************************************************************************************/
@ServiceObject
public class COLSELECTSO implements com.tmax.proobject.model.service.ServiceObject<com.CellDO.COLSELECTINPUT, com.CellDO.COLSELECTMULTIROWS>
{
	
	private ProObjectLogger logger = ServiceLogger.getLogger();
	public com.CellDO.COLSELECTINPUT input = new com.CellDO.COLSELECTINPUT();
	public com.CellDO.COLSELECTMULTIROWS output = new com.CellDO.COLSELECTMULTIROWS();
	public com.CellBO.COLSELECT var1 = new com.CellBO.COLSELECT();
	    	
	
	    	
	/**
	* @메소드명  : service 
	* @논리명    : service
	* @입력      : ${arg.type} ${arg.name}
	* @출력      : COLSELECTMULTIROWS
	* @ throws Exception java.lang.Throwable Throwable
	* @설명 : 
	*/
	@Override
	public com.CellDO.COLSELECTMULTIROWS service(com.CellDO.COLSELECTINPUT arg0) throws java.lang.Throwable
	{
	//[BEGIN_NODE_BLOCK, , service(COLSELECTINPUT)]
	{
	
	//[BEGIN_NODE_BLOCK, 0, service(COLSELECTINPUT)]
	{
	    //[BEGIN_PRE_ASSIGN_BLOCK, 0, service(COLSELECTINPUT)]
	    
	    //[END_PRE_ASSIGN_BLOCK, 0, service(COLSELECTINPUT)]
	    output = var1.Mathod2(arg0);
	    //[BEGIN_POST_ASSIGN_BLOCK, 0, service(COLSELECTINPUT)]
	    
	    //[END_POST_ASSIGN_BLOCK, 0, service(COLSELECTINPUT)]
	}
	//[END_NODE_BLOCK, 0, service(COLSELECTINPUT)]
	
	//[BEGIN_NODE_BLOCK, 1, service(COLSELECTINPUT)]
	{
	//버추얼 모듈
	 //[BEGIN_VIRTUAL_CODE_BLOCK, 1, service(COLSELECTINPUT)]
	 {
return output;
	 }
	 //[END_VIRTUAL_CODE_BLOCK, 1, service(COLSELECTINPUT)]
	
	}
	//[END_NODE_BLOCK, 1, service(COLSELECTINPUT)]
	}
	//[END_NODE_BLOCK, , service(COLSELECTINPUT)]
	}
	
}


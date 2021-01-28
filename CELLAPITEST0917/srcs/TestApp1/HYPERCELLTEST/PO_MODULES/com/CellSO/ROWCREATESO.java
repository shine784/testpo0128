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
import com.CellDO.ROWCREATEINPUT;
import com.CellDO.AFTERINSERTMSG;
import com.CellBO.ROWCREATE;

/**************************************************************************************************************
* 화일명 : ROWCREATESO.class
* 사용프로그램 : ROWCREATESO
* 설명 : rowcreate 
**************************************************************************************************************/
@ServiceObject
public class ROWCREATESO implements com.tmax.proobject.model.service.ServiceObject<com.CellDO.ROWCREATEINPUT, com.CellDO.AFTERINSERTMSG>
{
	
	private ProObjectLogger logger = ServiceLogger.getLogger();
	public com.CellDO.ROWCREATEINPUT input = new com.CellDO.ROWCREATEINPUT();
	public com.CellDO.AFTERINSERTMSG output = new com.CellDO.AFTERINSERTMSG();
	public com.CellBO.ROWCREATE var1 = new com.CellBO.ROWCREATE();
	    	
	
	    	
	/**
	* @메소드명  : service 
	* @논리명    : service
	* @입력      : ${arg.type} ${arg.name}
	* @출력      : AFTERINSERTMSG
	* @ throws Exception java.lang.Throwable Throwable
	* @설명 : 
	*/
	@Override
	public com.CellDO.AFTERINSERTMSG service(com.CellDO.ROWCREATEINPUT arg0) throws java.lang.Throwable
	{
	//[BEGIN_NODE_BLOCK, , service(ROWCREATEINPUT)]
	{
	
	//[BEGIN_NODE_BLOCK, 0, service(ROWCREATEINPUT)]
	{
	    //[BEGIN_PRE_ASSIGN_BLOCK, 0, service(ROWCREATEINPUT)]
	    
	    //[END_PRE_ASSIGN_BLOCK, 0, service(ROWCREATEINPUT)]
	    output = var1.Mathod2(arg0);
	    //[BEGIN_POST_ASSIGN_BLOCK, 0, service(ROWCREATEINPUT)]
	    
	    //[END_POST_ASSIGN_BLOCK, 0, service(ROWCREATEINPUT)]
	}
	//[END_NODE_BLOCK, 0, service(ROWCREATEINPUT)]
	
	//[BEGIN_NODE_BLOCK, 1, service(ROWCREATEINPUT)]
	{
	//버추얼 모듈
	 //[BEGIN_VIRTUAL_CODE_BLOCK, 1, service(ROWCREATEINPUT)]
	 {
return output;
	 }
	 //[END_VIRTUAL_CODE_BLOCK, 1, service(ROWCREATEINPUT)]
	
	}
	//[END_NODE_BLOCK, 1, service(ROWCREATEINPUT)]
	}
	//[END_NODE_BLOCK, , service(ROWCREATEINPUT)]
	}
	
}


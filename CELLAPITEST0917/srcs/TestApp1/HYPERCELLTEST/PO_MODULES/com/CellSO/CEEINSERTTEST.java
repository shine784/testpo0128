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
import com.CellDO.COLUMNCREATEINPUT;
import com.CellDO.AFTERINSERTMSG;
import com.TestBo.CELLINSERTTESTBO;

/**************************************************************************************************************
* 화일명 : CEEINSERTTEST.class
* 사용프로그램 : CEEINSERTTEST
* 설명 : CEEINSERTTEST 
**************************************************************************************************************/
@ServiceObject
public class CEEINSERTTEST implements com.tmax.proobject.model.service.ServiceObject<com.CellDO.COLUMNCREATEINPUT, com.CellDO.COLUMNCREATEINPUT>
{
	
	private ProObjectLogger logger = ServiceLogger.getLogger();
	public com.CellDO.COLUMNCREATEINPUT input = new com.CellDO.COLUMNCREATEINPUT();
	public com.TestBo.CELLINSERTTESTBO var1 = new com.TestBo.CELLINSERTTESTBO();
	public com.CellDO.COLUMNCREATEINPUT output = new com.CellDO.COLUMNCREATEINPUT();
	    	
	
	    	
	/**
	* @메소드명  : service 
	* @논리명    : service
	* @입력      : ${arg.type} ${arg.name}
	* @출력      : COLUMNCREATEINPUT
	* @ throws Exception java.lang.Throwable Throwable
	* @설명 : 
	*/
	@Override
	public com.CellDO.COLUMNCREATEINPUT service(com.CellDO.COLUMNCREATEINPUT arg0) throws java.lang.Throwable
	{
	//[BEGIN_NODE_BLOCK, , service(COLUMNCREATEINPUT)]
	{
	
	//[BEGIN_NODE_BLOCK, 0, service(COLUMNCREATEINPUT)]
	{
	    //[BEGIN_PRE_ASSIGN_BLOCK, 0, service(COLUMNCREATEINPUT)]
	    
	    //[END_PRE_ASSIGN_BLOCK, 0, service(COLUMNCREATEINPUT)]
	    output = var1.Method3(arg0);
	    //[BEGIN_POST_ASSIGN_BLOCK, 0, service(COLUMNCREATEINPUT)]
	    
	    //[END_POST_ASSIGN_BLOCK, 0, service(COLUMNCREATEINPUT)]
	}
	//[END_NODE_BLOCK, 0, service(COLUMNCREATEINPUT)]
	
	//[BEGIN_NODE_BLOCK, 1, service(COLUMNCREATEINPUT)]
	{
	//버추얼 모듈
	 //[BEGIN_VIRTUAL_CODE_BLOCK, 1, service(COLUMNCREATEINPUT)]
	 {
		 return output;
	 }
	 //[END_VIRTUAL_CODE_BLOCK, 1, service(COLUMNCREATEINPUT)]
	
	}
	//[END_NODE_BLOCK, 1, service(COLUMNCREATEINPUT)]
	}
	//[END_NODE_BLOCK, , service(COLUMNCREATEINPUT)]
	}
	
}


package com.TestBo;


import com.tmax.proobject.core.BizObject;
import com.tmax.proobject.model.business.BusinessObject;
import com.tmax.proobject.engine.servicemanager.*;
import com.tmax.proobject.logger.ProObjectLogger;
import com.tmax.proobject.logger.application.ServiceLogger;
import com.tmax.proobject.model.dto.*;
import java.math.BigDecimal;
import java.util.List;
import javax.inject.Inject;
import com.tmax.proobject.core.DataSource;
import com.tmax.proobject.engine.waitobject.WaitObject;
import java.util.ArrayList;
import java.util.logging.Level;
import java.io.File;
import com.tmax.proobject.model.transaction.TransactionType;
import com.tmax.proobject.dataobject.util.DataDefinitionExecutor;
import com.CellDOF.COLUMNCREATEDOF;
import com.CellDO.AFTERINSERTMSG;
import com.CellDO.COLUMNCREATEINPUT;

/**************************************************************************************************************
* 화일명 : CELLINSERTTESTBO.class
* 사용프로그램 : CELLINSERTTESTBO
* 설명 : CELLINSERTTESTBO 
**************************************************************************************************************/
@BizObject(logicalName = "CELLINSERTTESTBO")
public class CELLINSERTTESTBO implements BusinessObject
{
	
	private ProObjectLogger logger = ServiceLogger.getLogger();
	@DataSource(name="tibero6_dev")
	private com.CellDOF.COLUMNCREATEDOF var1 = null;
	    	
	
	    	
	/**
	* @메소드명  : Method3 
	* @논리명    : Method3
	* @입력      : ${arg.type} ${arg.name}
	* @출력      : COLUMNCREATEINPUT
	* @ throws Exception Throwable Throwable
	* @설명 : 
	*/
	public com.CellDO.COLUMNCREATEINPUT Method3(com.CellDO.COLUMNCREATEINPUT arg0) throws Throwable
	{
	//[BEGIN_NODE_BLOCK, , Method3(COLUMNCREATEINPUT)]
	{
	    //DECLARE ENTRY VARIABLES
	    com.CellDO.COLUMNCREATEINPUT doCall1 = new com.CellDO.COLUMNCREATEINPUT();
	    int resultCnt1 = 0;
	    
	    //[BEGIN_NODE_BLOCK, 0, Method3(COLUMNCREATEINPUT)]
	    {
	        //var1
	        //[BEGIN_BEFORE_CODE, 0, Method3(COLUMNCREATEINPUT)]
	        var1 = new com.CellDOF.COLUMNCREATEDOF();
	        //[END_BEFORE_CODE, 0, Method3(COLUMNCREATEINPUT)]
	        
	        //[BEGIN_PRE_ASSIGN_BLOCK, 0, Method3(COLUMNCREATEINPUT)]
	        {
	        	var1.setYpos(arg0.getYpos());
	        }
	        {
	        	var1.setYname(arg0.getYname());
	        }
	        
	        //[END_PRE_ASSIGN_BLOCK, 0, Method3(COLUMNCREATEINPUT)]
	        
	        var1.setFullQuery(com.CellDOF.COLUMNCREATEDOF.FULLQUERY.INSERT_DEFAULT_0);
	        var1.add(doCall1);
	        
	        //[BEGIN_POST_ASSIGN_BLOCK, 0, Method3(COLUMNCREATEINPUT)]
	        //[END_POST_ASSIGN_BLOCK, 0, Method3(COLUMNCREATEINPUT)]
	        
	        //[BEGIN_AFTER_CODE, 0, Method3(COLUMNCREATEINPUT)]
	        return doCall1;
	        //[END_AFTER_CODE, 0, Method3(COLUMNCREATEINPUT)]
	    }
	    //[END_NODE_BLOCK, 0, Method3(COLUMNCREATEINPUT)]
	}
	//[END_NODE_BLOCK, , Method3(COLUMNCREATEINPUT)]
	}
	
}


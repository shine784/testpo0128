package com.CellBO;

import java.sql.Statement;
import com.CellDO.AFTERINSERTMSG;
import com.CellDO.COLHEADERWIDTHDO;
import com.CellDO.COLSELECTDOLIST;
import com.CellDO.COLSELECTINPUT;
import com.CellDO.COLUMNCREATEINPUT;
import com.CellDOF.COLHEADERWIDTHDOF;
import com.CellDOF.COLSELECTDOF;
import com.CellDOF.COLUMNCREATEDOF;
import com.CellDOF.ROWCREATEDOF;
import com.tmax.proobject.core.BizObject;
import com.tmax.proobject.core.DataSource;
import com.tmax.proobject.dataobject.util.DataDefinitionExecutor;
import com.tmax.proobject.dataobject.util.ForwardList;
import com.tmax.proobject.model.business.BusinessObject;
import sun.util.locale.ParseStatus;
import com.tmax.proobject.logger.ProObjectLogger;
import com.tmax.proobject.logger.application.ServiceLogger;

/*  */
@BizObject(logicalName = "COLUMNCREATE")
public class COLUMNCREATE implements BusinessObject {
	private ProObjectLogger logger = ServiceLogger.getLogger();
	@DataSource(name="tibero6_dev")
	private COLUMNCREATEDOF var1 = null;
	private COLHEADERWIDTHDOF var2 = null;
	private COLHEADERWIDTHDO arg1 = new COLHEADERWIDTHDO();
	    	
	public AFTERINSERTMSG Mathod2(COLUMNCREATEINPUT arg0) throws Throwable
	{
	//[BEGIN_NODE_BLOCK, , Mathod2(int)]
		AFTERINSERTMSG doCall1 = new AFTERINSERTMSG();
		int resultCnt1 = 0;
	{
		int fromx = arg0.getXpos();//최초이기만 이전에 insert가 있으면  생성해야하는 Xpos가  사용자가 정확히알기어렵다
		String atl = "";
		String Xname="";
		var1 = new COLUMNCREATEDOF("tibero6_dev");
		var2 = new COLHEADERWIDTHDOF("tibero6_dev");
		
		for(int i=fromx;i<fromx + 300;i++){
				Xname = "C"+i;
				arg0.setXname(Xname);
				atl = atl + Xname + " VARCHAR2(10),";//조건을 넣어야하는데 넣으면 alter문 에러남 ㅄ임 
				arg0.setXpos(Integer.toString(i));
				var1.setFullQuery(COLUMNCREATEDOF.FULLQUERY.INSERT_DEFAULT_0);
				var1.add(arg0,false);
				//width
				arg1.setXname(Xname);
				var2.setFullQuery(COLHEADERWIDTHDOF.FULLQUERY.INSERT_DEFAULT_0);
				var2.add(arg1,false);
		}
		try{
		    var1.executeAll();
		    var1.clearBatch();
		    var2.executeAll();
		    var2.clearBatch();
	        atl = atl.substring(0, atl.length()-1);    
	        String str = "ALTER TABLE testcells add("+atl+")";
	        DataDefinitionExecutor.getInstance("tibero6_dev").execute(str);
		}catch (Exception e){
			System.out.println(e);
		}

        {
	        return doCall1;
	    }
	}
	//[END_NODE_BLOCK, , Mathod2(int)]
	}
}
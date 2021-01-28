package com.CellBO;

import java.sql.Statement;
import com.CellDO.AFTERINSERTMSG;
import com.CellDO.COLHEADERWIDTHDO;
import com.CellDO.ROWCREATEINPUT;
import com.CellDO.ROWHEADERWIDTHDO;
import com.CellDOF.COLHEADERWIDTHDOF;
import com.CellDOF.ROWCREATEDOF;
import com.CellDOF.ROWHEADERWIDTHDOF;
import com.tmax.proobject.core.BizObject;
import com.tmax.proobject.core.DataSource;
import com.tmax.proobject.dataobject.util.ForwardList;
import com.tmax.proobject.model.business.BusinessObject;
import sun.util.locale.ParseStatus;
import com.tmax.proobject.logger.ProObjectLogger;
import com.tmax.proobject.logger.application.ServiceLogger;

/*  */
@BizObject(logicalName = "COLUMNCREATE")
public class ROWCREATE implements BusinessObject {
	private ProObjectLogger logger = ServiceLogger.getLogger();
	@DataSource(name="tibero6_dev")
	private ROWCREATEDOF var1 = null;
	private ROWHEADERWIDTHDOF var2 = null;
	private ROWHEADERWIDTHDO arg1 = new ROWHEADERWIDTHDO();
	
	public AFTERINSERTMSG Mathod2(ROWCREATEINPUT arg0) throws Throwable
	{
	//[BEGIN_NODE_BLOCK, , Mathod2(int)]
		AFTERINSERTMSG doCall1 = new AFTERINSERTMSG();
		int resultCnt1 = 0;
	{
		int fromy = arg0.getYpos();
		String atl = "";
		String Yname="";
		var1 = new ROWCREATEDOF("tibero6_dev"); 
		var2 = new ROWHEADERWIDTHDOF("tibero6_dev");
		
			for(int i=fromy;i<fromy+300;i++){
				Yname = "R"+i;
				arg0.setYname(Yname);
				arg0.setYpos(Integer.toString(i));
				var1.setFullQuery(ROWCREATEDOF.FULLQUERY.INSERT_DEFAULT_0);
				var1.add(arg0,false);
				//width
				arg1.setYname(Yname);
				var2.setFullQuery(ROWHEADERWIDTHDOF.FULLQUERY.INSERT_DEFAULT_0);
				var2.add(arg1,false);
			}
			try{
				var1.executeAll();
				var2.executeAll(); 
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
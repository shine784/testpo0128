package com.CellBO;


import com.tmax.proobject.core.BizObject;
import com.tmax.proobject.core.DataSource;
import com.tmax.proobject.engine.servicemanager.ServiceManager;
import com.tmax.proobject.logger.ProObjectLogger;
import com.tmax.proobject.logger.application.ServiceLogger;
import com.tmax.proobject.model.business.BusinessObject;
import com.tmax.proobject.model.network.ProObjectRequest;
import com.tmax.proobject.model.network.RequestContext;
import com.CellDO.COLSELECTINPUT;
import java.sql.Array;
import java.util.ArrayList;
import com.CellDO.COLSELECTDO;
import com.CellDO.COLSELECTDOROW;
import com.CellDO.COLSELECTMULTIROWS;
import com.CellDO.HCGETDO;
import com.CellDOF.COLSELECTDOF;


@BizObject(logicalName = "FUNCKINGBO")
public class HCTILESELECT implements BusinessObject
{
	private ProObjectLogger logger = ServiceLogger.getLogger();
	@DataSource(name="tibero6_dev")
	private COLSELECTDOF var1 = null;
 	
	
	private COLSELECTDOROW row = null;
	private COLSELECTMULTIROWS rows = null;
	
	public COLSELECTMULTIROWS Mathod2(HCGETDO arg0) throws Throwable
	{
	//[BEGIN_NODE_BLOCK, , Mathod2(int)]
		COLSELECTMULTIROWS doCall1 = new COLSELECTMULTIROWS();
	{
	    RequestContext requestContext = ServiceManager.getCurrentRequestContext();
	    ProObjectRequest preq = requestContext.getRequest();
	    String[] fh = preq.getQueryString("fromh");
	    String[] fv = preq.getQueryString("fromv");;
	    String[] th = preq.getQueryString("toh");
	    String[] tv = preq.getQueryString("tov");
		
	    var1 = new COLSELECTDOF("tibero6_dev");
		StringBuilder query = new StringBuilder();
		query.append(" SELECT V.YPOS, H.XPOS, I.cellkey, I.doubledata, I.stringdata, I.formula, I.style, I.chain, I.datatype FROM testcellinfo I JOIN testcells T  ON (I.CELLKEY=T.CELLKEY)   JOIN verticalmap V ON(");
		int fromh =  Integer.parseInt(fh[0]);
		int toh =  Integer.parseInt(th[0]);
		for(int i=fromh;i<toh;i++){
			
			query.append(" T.C"+i+"=V.YNAME");//실제 로 단순히 C C+i 가아니라 매핑이기떄문에 이부분 서비스 미리 받아와야함 (3~5 -> AC~AF) 같은
			if(i<toh-1){
				query.append(" or");
			}
		}			
		query.append(" )and (V.YPOS >= "+fv[0]+" and V.YPOS < "+tv[0]+") JOIN horizonmap H ON( I.XNAME = H.XNAME) order by V.YPOS;");
		var1.setUserQuery(query.toString());
		int y = 0;
		rows = new COLSELECTMULTIROWS();
		
		//rows를 감싸는 하나가 더필요
		int prev = -1;
		ArrayList<COLSELECTDO> li = var1.getDataObjectList();
		row = null;
		row = new COLSELECTDOROW();
		for(int i = 0;i<li.size();i++){
			COLSELECTDO a = li.get(i);
			y = a.getYpos();
			if(i==0){
				prev = y;
				row.setIdx(y);
				row.setVal(null);
			}
			if(y!=prev){
				rows.addRows(row);
				row = null;
				row = new COLSELECTDOROW();
				row.setIdx(y);
				row.setVal(null);
				prev = y;
			}
			row.addCells(a);
			if(i==li.size()-1){
				  rows.addRows(row);
			}
		}
		return rows;
	}
	//[END_NODE_BLOCK, , Mathod2(int)]
	}
	
}


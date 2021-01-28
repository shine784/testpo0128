package com.CellSO;

import com.tmax.proobject.engine.service.executor.ServiceExecutor;

public class COLSELECTSOExecutor extends ServiceExecutor
{
	public COLSELECTSOExecutor() {
		serviceObject = new COLSELECTSO();
	}
	
	public Object execute(Object serviceInput, String serviceExecutionMethod) throws Throwable {
		
		return serviceObject.service(serviceInput);
	}
	
	public String getRendezvousMethodName(String service){
		return null;
	}
	
}


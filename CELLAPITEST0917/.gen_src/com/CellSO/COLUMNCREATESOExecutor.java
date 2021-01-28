package com.CellSO;

import com.tmax.proobject.engine.service.executor.ServiceExecutor;

public class COLUMNCREATESOExecutor extends ServiceExecutor
{
	public COLUMNCREATESOExecutor() {
		serviceObject = new COLUMNCREATESO();
	}
	
	public Object execute(Object serviceInput, String serviceExecutionMethod) throws Throwable {
		
		return serviceObject.service(serviceInput);
	}
	
	public String getRendezvousMethodName(String service){
		return null;
	}
	
}


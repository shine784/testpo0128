package com.CellSO;

import com.tmax.proobject.engine.service.executor.ServiceExecutor;

public class FORMULAINSERTUpdateExecutor extends ServiceExecutor
{
	public FORMULAINSERTUpdateExecutor() {
		serviceObject = new FORMULAINSERTUpdate();
	}
	
	public Object execute(Object serviceInput, String serviceExecutionMethod) throws Throwable {
		
		return serviceObject.service(serviceInput);
	}
	
	public String getRendezvousMethodName(String service){
		return null;
	}
	
}


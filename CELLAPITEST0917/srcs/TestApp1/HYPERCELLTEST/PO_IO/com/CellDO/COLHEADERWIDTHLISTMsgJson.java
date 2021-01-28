	
package com.CellDO;

import com.tmax.promapper.engine.base.Message;


import com.tmax.proobject.model.dataobject.DataObject;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.io.IOException;

import org.w3c.dom.Node;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.JsonToken;



import com.tmax.promapper.engine.exception.MarshalException;
import com.tmax.promapper.engine.exception.UnmarshalException;

/****************************************************************************************************
* Copyright ⓒ TmaxSoft. All rights reserved.                                             
* (주)티맥스소프트의 사전 승인 없이 본 내용의 전부 또는 일부에 대한 복사, 배포,사용을 금합니다.   
* (주)티맥스소프트의 사전 승인 없이 소스를 변경하여 사용하는 경우                                 
* 소스에 대한 품질과 성능을 보장하지 않습니다.                                                
*                                                                                             
* If you modify this source without TmaxSoft approval.                                  
* TmaxSoft dose not guarantee the quality and performance of source.                      
***************************************************************************************************
* @since TmaxSoft                                                                                                                                   
* @author         
**************************************************************************************************/
/**************************************************************************************************************
* 화일명 : COLHEADERWIDTHLISTMsgJson.class
* 사용프로그램 : COLHEADERWIDTHLIST메세지Json
* 설명 :  
**************************************************************************************************************/
public class COLHEADERWIDTHLISTMsgJson extends Message {	
	public byte[] marshal(DataObject obj) throws MarshalException {
		com.CellDO.COLHEADERWIDTHLIST _COLHEADERWIDTHLIST = (com.CellDO.COLHEADERWIDTHLIST)obj;
		
		if(_COLHEADERWIDTHLIST == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _COLHEADERWIDTHLIST, jw);
			
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} catch(Exception e) {
			throw new MarshalException(e);
		} finally{
            try {
                if( jw != null )
                    try {
                        jw.close();
                    } catch (IOException e) {
                        throw new MarshalException(e);
                    }
            } finally {
                if( bw != null )
                    try {
                        bw.close();
                    } catch (IOException e) {
                        throw new MarshalException(e);
                    }
            }
		}
	}
	
	
	public void marshal(com.CellDO.COLHEADERWIDTHLIST _COLHEADERWIDTHLIST, JsonWriter writer )throws IOException {
        int arraySize0 = _COLHEADERWIDTHLIST.sizeWidthlist();
		writer.name("widthlist");
        if(_COLHEADERWIDTHLIST.getWidthlist() == null) {
            writer.nullValue();
        } else {					    					
            com.CellDO.COLHEADERWIDTHDOMsgJson __widthlist = new com.CellDO.COLHEADERWIDTHDOMsgJson();
            writer.beginArray();					
            for(int i = 0; i < arraySize0; i++) {
                if(_COLHEADERWIDTHLIST.getWidthlist(i) != null) {
	
                    writer.beginObject();
                    __widthlist.marshal((com.CellDO.COLHEADERWIDTHDO)_COLHEADERWIDTHLIST.getWidthlist(i), writer);
                    writer.endObject();
	
                } else {
                    writer.nullValue();
                }
            }
            writer.endArray();
        }							  					
	}

	/**
     * do not use
     */
	public void marshal(DataObject dataobject, Node node) throws MarshalException { 
  	}

  	public String removeNullChar(String charString) {
    		if( charString == null )
    			return "";
    		
			StringBuffer sb = new StringBuffer();
			for (int i = 0 ; i<charString.length(); i++) {
				if(charString.charAt(i) == (char)0) {
					sb.append("");
				} else {
					sb.append(charString.charAt(i));
				}
			}
			return sb.toString();
  	}
	
	
	public DataObject unmarshal(byte[] bytes, int i) throws UnmarshalException {		
		com.CellDO.COLHEADERWIDTHLIST _COLHEADERWIDTHLIST = new com.CellDO.COLHEADERWIDTHLIST();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.CellDO.COLHEADERWIDTHLIST();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_COLHEADERWIDTHLIST = (com.CellDO.COLHEADERWIDTHLIST)unmarshal( jr,  _COLHEADERWIDTHLIST);
     
             
		jr.endObject();
		jr.close();
			
		} catch(Exception e) {
		    throw new UnmarshalException(e);
		} finally{
            try {
                if( jr != null )
                    try {
                        jr.close();
                    } catch (IOException e) {
                        throw new UnmarshalException(e);
                    }
            } finally {
                if( reader != null )
                    try {
                        reader.close();
                    } catch (IOException e) {
                        throw new UnmarshalException(e);
                    }
            }
		}
		                       
        return _COLHEADERWIDTHLIST;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws UnmarshalException {		
		
		com.CellDO.COLHEADERWIDTHLIST _COLHEADERWIDTHLIST = (com.CellDO.COLHEADERWIDTHLIST) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.CellDO.COLHEADERWIDTHLIST();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));
			jr = new JsonReader( reader );
			jr.beginObject();


					_COLHEADERWIDTHLIST = (com.CellDO.COLHEADERWIDTHLIST)unmarshal( jr,  _COLHEADERWIDTHLIST);
         
		         
			jr.endObject();
			jr.close();
				
		} catch(Exception e) {
            throw new UnmarshalException(e);
        } finally{
            try {
                if( jr != null )
                    try {
                        jr.close();
                    } catch (IOException e) {
                        throw new UnmarshalException(e);
                    }
            } finally {
                if( reader != null )
                    try {
                        reader.close();
                    } catch (IOException e) {
                        throw new UnmarshalException(e);
                    }
            }
        }
		                       
	    return _COLHEADERWIDTHLIST;
	}
		
		
	public DataObject unmarshal(JsonReader reader, com.CellDO.COLHEADERWIDTHLIST dto) throws IOException {		 

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
		 
		 dto.clearAllIsModified();
		 
       	 return dto;
	}
		 
	protected void setField(com.CellDO.COLHEADERWIDTHLIST dto, JsonReader reader, String name) throws IOException {
		
		switch(name) {		
		case "widthlist" :
		{
			if(reader.peek() != JsonToken.NULL) {
				reader.beginArray();
				com.CellDO.COLHEADERWIDTHDOMsgJson __widthlist = new com.CellDO.COLHEADERWIDTHDOMsgJson();
				while( reader.hasNext() ){	
					if(reader.peek() != JsonToken.NULL) {			
						com.CellDO.COLHEADERWIDTHDO ___COLHEADERWIDTHDO = new com.CellDO.COLHEADERWIDTHDO();	
                        reader.beginObject();
						dto.addWidthlist((com.CellDO.COLHEADERWIDTHDO)__widthlist.unmarshal( reader, ___COLHEADERWIDTHDO ));
						reader.endObject();
					} else {
						reader.nextNull();
					}
				}
				reader.endArray();
			} else {
				reader.nextNull();
			}
			break;
		}		
		default :
			reader.skipValue();
			break;
		}
	}
		 
    /**
     * do not use
     */
	public int unmarshal(byte[] bytes, int i, DataObject dataobject){		
		return -1;
	}
	
	/**
     * do not use
     */
	public DataObject unmarshal(Node node) throws UnmarshalException {	
		return null;
	}
    
 	
}

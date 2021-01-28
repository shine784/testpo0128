	
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
* 화일명 : COLHEADERWIDTHDOMsgJson.class
* 사용프로그램 : COLHEADERWIDTHDO메세지Json
* 설명 :  
**************************************************************************************************************/
public class COLHEADERWIDTHDOMsgJson extends Message {	
	public byte[] marshal(DataObject obj) throws MarshalException {
		com.CellDO.COLHEADERWIDTHDO _COLHEADERWIDTHDO = (com.CellDO.COLHEADERWIDTHDO)obj;
		
		if(_COLHEADERWIDTHDO == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _COLHEADERWIDTHDO, jw);
			
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
	
	
	public void marshal(com.CellDO.COLHEADERWIDTHDO _COLHEADERWIDTHDO, JsonWriter writer )throws IOException {	
	
		writer.name("xname"); 
		if (_COLHEADERWIDTHDO.getXname() != null) {
			
			writer.value(_COLHEADERWIDTHDO.getXname());
			 
		} else {
			writer.nullValue();
		}
	
		
		writer.name("xwidth"); 
	
		writer.value(_COLHEADERWIDTHDO.getXwidth());
		
		writer.name("xpos"); 
	
		writer.value(_COLHEADERWIDTHDO.getXpos());
		
	
		writer.name("fromh"); 
		if (_COLHEADERWIDTHDO.getFromh() != null) {
			
			writer.value(_COLHEADERWIDTHDO.getFromh());
			 
		} else {
			writer.nullValue();
		}
	
		
	
		writer.name("toh"); 
		if (_COLHEADERWIDTHDO.getToh() != null) {
			
			writer.value(_COLHEADERWIDTHDO.getToh());
			 
		} else {
			writer.nullValue();
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
		com.CellDO.COLHEADERWIDTHDO _COLHEADERWIDTHDO = new com.CellDO.COLHEADERWIDTHDO();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.CellDO.COLHEADERWIDTHDO();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_COLHEADERWIDTHDO = (com.CellDO.COLHEADERWIDTHDO)unmarshal( jr,  _COLHEADERWIDTHDO);
     
             
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
		                       
        return _COLHEADERWIDTHDO;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws UnmarshalException {		
		
		com.CellDO.COLHEADERWIDTHDO _COLHEADERWIDTHDO = (com.CellDO.COLHEADERWIDTHDO) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.CellDO.COLHEADERWIDTHDO();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));
			jr = new JsonReader( reader );
			jr.beginObject();


					_COLHEADERWIDTHDO = (com.CellDO.COLHEADERWIDTHDO)unmarshal( jr,  _COLHEADERWIDTHDO);
         
		         
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
		                       
	    return _COLHEADERWIDTHDO;
	}
		
		
	public DataObject unmarshal(JsonReader reader, com.CellDO.COLHEADERWIDTHDO dto) throws IOException {		 

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
		 
		 dto.clearAllIsModified();
		 
       	 return dto;
	}
		 
	protected void setField(com.CellDO.COLHEADERWIDTHDO dto, JsonReader reader, String name) throws IOException {
		
		switch(name) {		
	
		case "xname" :
		{	
			if(reader.peek() != JsonToken.NULL) {
				dto.setXname( reader.nextString());
			} else {
				reader.nextNull();
            }
			break;
		}	
	
			
	
		case "xwidth" :
		{	
			if(reader.peek() != JsonToken.NULL) {
				dto.setXwidth( reader.nextInt());
			} else {
				reader.nextNull();
            }
			break;
		}	
	
			
	
		case "xpos" :
		{	
			if(reader.peek() != JsonToken.NULL) {
				dto.setXpos( reader.nextInt());
			} else {
				reader.nextNull();
            }
			break;
		}	
	
			
	
		case "fromh" :
		{	
			if(reader.peek() != JsonToken.NULL) {
				dto.setFromh( reader.nextString());
			} else {
				reader.nextNull();
            }
			break;
		}	
	
			
	
		case "toh" :
		{	
			if(reader.peek() != JsonToken.NULL) {
				dto.setToh( reader.nextString());
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

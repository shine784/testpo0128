	
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
* 화일명 : HCFINDALLDTOGETMsgJson.class
* 사용프로그램 : HCFINDALLDTOGET메세지Json
* 설명 :  
**************************************************************************************************************/
public class HCFINDALLDTOGETMsgJson extends Message {	
	public byte[] marshal(DataObject obj) throws MarshalException {
		com.CellDO.HCFINDALLDTOGET _HCFINDALLDTOGET = (com.CellDO.HCFINDALLDTOGET)obj;
		
		if(_HCFINDALLDTOGET == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _HCFINDALLDTOGET, jw);
			
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
	
	
	public void marshal(com.CellDO.HCFINDALLDTOGET _HCFINDALLDTOGET, JsonWriter writer )throws IOException {	
	
		writer.name("id"); 
		if (_HCFINDALLDTOGET.getId() != null) {
			
			writer.value(_HCFINDALLDTOGET.getId());
			 
		} else {
			writer.nullValue();
		}
	
		
	
		writer.name("childId"); 
		if (_HCFINDALLDTOGET.getChildId() != null) {
			
			writer.value(_HCFINDALLDTOGET.getChildId());
			 
		} else {
			writer.nullValue();
		}
	
		
	
		writer.name("nextId"); 
		if (_HCFINDALLDTOGET.getNextId() != null) {
			
			writer.value(_HCFINDALLDTOGET.getNextId());
			 
		} else {
			writer.nullValue();
		}
	
		
	
		writer.name("contentData"); 
		if (_HCFINDALLDTOGET.getContentData() != null) {
			
			writer.value(_HCFINDALLDTOGET.getContentData());
			 
		} else {
			writer.nullValue();
		}
	
		
	
		writer.name("contentType"); 
		if (_HCFINDALLDTOGET.getContentType() != null) {
			
			writer.value(_HCFINDALLDTOGET.getContentType());
			 
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
		com.CellDO.HCFINDALLDTOGET _HCFINDALLDTOGET = new com.CellDO.HCFINDALLDTOGET();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.CellDO.HCFINDALLDTOGET();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_HCFINDALLDTOGET = (com.CellDO.HCFINDALLDTOGET)unmarshal( jr,  _HCFINDALLDTOGET);
     
             
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
		                       
        return _HCFINDALLDTOGET;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws UnmarshalException {		
		
		com.CellDO.HCFINDALLDTOGET _HCFINDALLDTOGET = (com.CellDO.HCFINDALLDTOGET) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.CellDO.HCFINDALLDTOGET();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));
			jr = new JsonReader( reader );
			jr.beginObject();


					_HCFINDALLDTOGET = (com.CellDO.HCFINDALLDTOGET)unmarshal( jr,  _HCFINDALLDTOGET);
         
		         
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
		                       
	    return _HCFINDALLDTOGET;
	}
		
		
	public DataObject unmarshal(JsonReader reader, com.CellDO.HCFINDALLDTOGET dto) throws IOException {		 

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
		 
		 dto.clearAllIsModified();
		 
       	 return dto;
	}
		 
	protected void setField(com.CellDO.HCFINDALLDTOGET dto, JsonReader reader, String name) throws IOException {
		
		switch(name) {		
	
		case "id" :
		{	
			if(reader.peek() != JsonToken.NULL) {
				dto.setId( reader.nextString());
			} else {
				reader.nextNull();
            }
			break;
		}	
	
			
	
		case "childId" :
		{	
			if(reader.peek() != JsonToken.NULL) {
				dto.setChildId( reader.nextString());
			} else {
				reader.nextNull();
            }
			break;
		}	
	
			
	
		case "nextId" :
		{	
			if(reader.peek() != JsonToken.NULL) {
				dto.setNextId( reader.nextString());
			} else {
				reader.nextNull();
            }
			break;
		}	
	
			
	
		case "contentData" :
		{	
			if(reader.peek() != JsonToken.NULL) {
				dto.setContentData( reader.nextString());
			} else {
				reader.nextNull();
            }
			break;
		}	
	
			
	
		case "contentType" :
		{	
			if(reader.peek() != JsonToken.NULL) {
				dto.setContentType( reader.nextString());
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

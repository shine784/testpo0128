	
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
* 화일명 : COLSELECTDOMsgJson.class
* 사용프로그램 : COLSELECTDO메세지Json
* 설명 :  
**************************************************************************************************************/
public class COLSELECTDOMsgJson extends Message {	
	public byte[] marshal(DataObject obj) throws MarshalException {
		com.CellDO.COLSELECTDO _COLSELECTDO = (com.CellDO.COLSELECTDO)obj;
		
		if(_COLSELECTDO == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _COLSELECTDO, jw);
			
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
	
	
	public void marshal(com.CellDO.COLSELECTDO _COLSELECTDO, JsonWriter writer )throws IOException {	
	
		writer.name("cellkey"); 
		if (_COLSELECTDO.getCellkey() != null) {
			
			writer.value(_COLSELECTDO.getCellkey());
			 
		} else {
			writer.nullValue();
		}
	
		
	
		writer.name("stringdata"); 
		if (_COLSELECTDO.getStringdata() != null) {
			
			writer.value(_COLSELECTDO.getStringdata());
			 
		} else {
			writer.nullValue();
		}
	
		
		writer.name("doubledata"); 
	
		writer.value(_COLSELECTDO.getDoubledata());
		
	
		writer.name("formula"); 
		if (_COLSELECTDO.getFormula() != null) {
			
			writer.value(_COLSELECTDO.getFormula());
			 
		} else {
			writer.nullValue();
		}
	
		
	
		writer.name("style"); 
		if (_COLSELECTDO.getStyle() != null) {
			
			writer.value(_COLSELECTDO.getStyle());
			 
		} else {
			writer.nullValue();
		}
	
		
	
		writer.name("chain"); 
		if (_COLSELECTDO.getChain() != null) {
			
			writer.value(_COLSELECTDO.getChain());
			 
		} else {
			writer.nullValue();
		}
	
		
	
		writer.name("datatype"); 
		if (_COLSELECTDO.getDatatype() != null) {
			
			writer.value(_COLSELECTDO.getDatatype());
			 
		} else {
			writer.nullValue();
		}
	
		
		writer.name("ypos"); 
	
		writer.value(_COLSELECTDO.getYpos());
		
	
		writer.name("xname"); 
		if (_COLSELECTDO.getXname() != null) {
			
			writer.value(_COLSELECTDO.getXname());
			 
		} else {
			writer.nullValue();
		}
	
		
		writer.name("xpos"); 
	
		writer.value(_COLSELECTDO.getXpos());
								  					
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
		com.CellDO.COLSELECTDO _COLSELECTDO = new com.CellDO.COLSELECTDO();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.CellDO.COLSELECTDO();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_COLSELECTDO = (com.CellDO.COLSELECTDO)unmarshal( jr,  _COLSELECTDO);
     
             
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
		                       
        return _COLSELECTDO;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws UnmarshalException {		
		
		com.CellDO.COLSELECTDO _COLSELECTDO = (com.CellDO.COLSELECTDO) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.CellDO.COLSELECTDO();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));
			jr = new JsonReader( reader );
			jr.beginObject();


					_COLSELECTDO = (com.CellDO.COLSELECTDO)unmarshal( jr,  _COLSELECTDO);
         
		         
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
		                       
	    return _COLSELECTDO;
	}
		
		
	public DataObject unmarshal(JsonReader reader, com.CellDO.COLSELECTDO dto) throws IOException {		 

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
		 
		 dto.clearAllIsModified();
		 
       	 return dto;
	}
		 
	protected void setField(com.CellDO.COLSELECTDO dto, JsonReader reader, String name) throws IOException {
		
		switch(name) {		
	
		case "cellkey" :
		{	
			if(reader.peek() != JsonToken.NULL) {
				dto.setCellkey( reader.nextString());
			} else {
				reader.nextNull();
            }
			break;
		}	
	
			
	
		case "stringdata" :
		{	
			if(reader.peek() != JsonToken.NULL) {
				dto.setStringdata( reader.nextString());
			} else {
				reader.nextNull();
            }
			break;
		}	
	
			
	
		case "doubledata" :
		{	
			if(reader.peek() != JsonToken.NULL) {
				dto.setDoubledata( reader.nextInt());
			} else {
				reader.nextNull();
            }
			break;
		}	
	
			
	
		case "formula" :
		{	
			if(reader.peek() != JsonToken.NULL) {
				dto.setFormula( reader.nextString());
			} else {
				reader.nextNull();
            }
			break;
		}	
	
			
	
		case "style" :
		{	
			if(reader.peek() != JsonToken.NULL) {
				dto.setStyle( reader.nextString());
			} else {
				reader.nextNull();
            }
			break;
		}	
	
			
	
		case "chain" :
		{	
			if(reader.peek() != JsonToken.NULL) {
				dto.setChain( reader.nextString());
			} else {
				reader.nextNull();
            }
			break;
		}	
	
			
	
		case "datatype" :
		{	
			if(reader.peek() != JsonToken.NULL) {
				dto.setDatatype( reader.nextString());
			} else {
				reader.nextNull();
            }
			break;
		}	
	
			
	
		case "ypos" :
		{	
			if(reader.peek() != JsonToken.NULL) {
				dto.setYpos( reader.nextInt());
			} else {
				reader.nextNull();
            }
			break;
		}	
	
			
	
		case "xname" :
		{	
			if(reader.peek() != JsonToken.NULL) {
				dto.setXname( reader.nextString());
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

	
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



public class COLSELECTINPUTMsgJson extends Message {	
	public byte[] marshal(DataObject obj) throws MarshalException {
		com.CellDO.COLSELECTINPUT _COLSELECTINPUT = (com.CellDO.COLSELECTINPUT)obj;
		
		if(_COLSELECTINPUT == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _COLSELECTINPUT, jw);
			
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
	
	
	public void marshal(com.CellDO.COLSELECTINPUT _COLSELECTINPUT, JsonWriter writer )throws IOException {	
	
		writer.name("fromv"); 
		if (_COLSELECTINPUT.getFromv() != null) {
			
			writer.value(_COLSELECTINPUT.getFromv());
			 
		} else {
			writer.nullValue();
		}
	
		
	
		writer.name("fromh"); 
		if (_COLSELECTINPUT.getFromh() != null) {
			
			writer.value(_COLSELECTINPUT.getFromh());
			 
		} else {
			writer.nullValue();
		}
	
		
	
		writer.name("tov"); 
		if (_COLSELECTINPUT.getTov() != null) {
			
			writer.value(_COLSELECTINPUT.getTov());
			 
		} else {
			writer.nullValue();
		}
	
		
	
		writer.name("toh"); 
		if (_COLSELECTINPUT.getToh() != null) {
			
			writer.value(_COLSELECTINPUT.getToh());
			 
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
		com.CellDO.COLSELECTINPUT _COLSELECTINPUT = new com.CellDO.COLSELECTINPUT();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.CellDO.COLSELECTINPUT();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_COLSELECTINPUT = (com.CellDO.COLSELECTINPUT)unmarshal( jr,  _COLSELECTINPUT);
     
             
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
		                       
        return _COLSELECTINPUT;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws UnmarshalException {		
		
		com.CellDO.COLSELECTINPUT _COLSELECTINPUT = (com.CellDO.COLSELECTINPUT) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.CellDO.COLSELECTINPUT();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));
			jr = new JsonReader( reader );
			jr.beginObject();


					_COLSELECTINPUT = (com.CellDO.COLSELECTINPUT)unmarshal( jr,  _COLSELECTINPUT);
         
		         
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
		                       
	    return _COLSELECTINPUT;
	}
		
		
	public DataObject unmarshal(JsonReader reader, com.CellDO.COLSELECTINPUT dto) throws IOException {		 

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
		 
		 dto.clearAllIsModified();
		 
       	 return dto;
	}
		 
	protected void setField(com.CellDO.COLSELECTINPUT dto, JsonReader reader, String name) throws IOException {
		
		switch(name) {		
	
		case "fromv" :
		{	
			if(reader.peek() != JsonToken.NULL) {
				dto.setFromv( reader.nextString());
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
	
			
	
		case "tov" :
		{	
			if(reader.peek() != JsonToken.NULL) {
				dto.setTov( reader.nextString());
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

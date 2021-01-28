	
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



public class CELLINSERTDOMsgJson extends Message {	
	public byte[] marshal(DataObject obj) throws MarshalException {
		com.CellDO.CELLINSERTDO _CELLINSERTDO = (com.CellDO.CELLINSERTDO)obj;
		
		if(_CELLINSERTDO == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _CELLINSERTDO, jw);
			
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
	
	
	public void marshal(com.CellDO.CELLINSERTDO _CELLINSERTDO, JsonWriter writer )throws IOException {	
		writer.name("ypos"); 
	
		writer.value(_CELLINSERTDO.getYpos());
		
	
		writer.name("stringdata"); 
		if (_CELLINSERTDO.getStringdata() != null) {
			
			writer.value(_CELLINSERTDO.getStringdata());
			 
		} else {
			writer.nullValue();
		}
	
		
		writer.name("doubledata"); 
	
		writer.value(_CELLINSERTDO.getDoubledata());
		
	
		writer.name("formula"); 
		if (_CELLINSERTDO.getFormula() != null) {
			
			writer.value(_CELLINSERTDO.getFormula());
			 
		} else {
			writer.nullValue();
		}
	
		
	
		writer.name("style"); 
		if (_CELLINSERTDO.getStyle() != null) {
			
			writer.value(_CELLINSERTDO.getStyle());
			 
		} else {
			writer.nullValue();
		}
	
		
	
		writer.name("chain"); 
		if (_CELLINSERTDO.getChain() != null) {
			
			writer.value(_CELLINSERTDO.getChain());
			 
		} else {
			writer.nullValue();
		}
	
		
	
		writer.name("datatype"); 
		if (_CELLINSERTDO.getDatatype() != null) {
			
			writer.value(_CELLINSERTDO.getDatatype());
			 
		} else {
			writer.nullValue();
		}
	
		
	
		writer.name("cellkey"); 
		if (_CELLINSERTDO.getCellkey() != null) {
			
			writer.value(_CELLINSERTDO.getCellkey());
			 
		} else {
			writer.nullValue();
		}
	
		
		writer.name("xpos"); 
	
		writer.value(_CELLINSERTDO.getXpos());
								  					
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
		com.CellDO.CELLINSERTDO _CELLINSERTDO = new com.CellDO.CELLINSERTDO();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.CellDO.CELLINSERTDO();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_CELLINSERTDO = (com.CellDO.CELLINSERTDO)unmarshal( jr,  _CELLINSERTDO);
     
             
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
		                       
        return _CELLINSERTDO;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws UnmarshalException {		
		
		com.CellDO.CELLINSERTDO _CELLINSERTDO = (com.CellDO.CELLINSERTDO) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.CellDO.CELLINSERTDO();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));
			jr = new JsonReader( reader );
			jr.beginObject();


					_CELLINSERTDO = (com.CellDO.CELLINSERTDO)unmarshal( jr,  _CELLINSERTDO);
         
		         
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
		                       
	    return _CELLINSERTDO;
	}
		
		
	public DataObject unmarshal(JsonReader reader, com.CellDO.CELLINSERTDO dto) throws IOException {		 

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
		 
		 dto.clearAllIsModified();
		 
       	 return dto;
	}
		 
	protected void setField(com.CellDO.CELLINSERTDO dto, JsonReader reader, String name) throws IOException {
		
		switch(name) {		
	
		case "ypos" :
		{	
			if(reader.peek() != JsonToken.NULL) {
				dto.setYpos( reader.nextInt());
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
	
			
	
		case "cellkey" :
		{	
			if(reader.peek() != JsonToken.NULL) {
				dto.setCellkey( reader.nextString());
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

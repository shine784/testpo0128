	
package com.CellDO;

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



public class COLSELECTDOROWMsgJson extends COLSELECTDOLISTMsgJson {	
	public byte[] marshal(DataObject obj) throws MarshalException {
		com.CellDO.COLSELECTDOROW _COLSELECTDOROW = (com.CellDO.COLSELECTDOROW)obj;
		
		if(_COLSELECTDOROW == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _COLSELECTDOROW, jw);
			
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
	
	
	public void marshal(com.CellDO.COLSELECTDOROW _COLSELECTDOROW, JsonWriter writer )throws IOException {
		super.marshal(_COLSELECTDOROW, writer);
        int arraySize0 = _COLSELECTDOROW.sizeRow();
		writer.name("Row");
        if(_COLSELECTDOROW.getRow() == null) {
            writer.nullValue();
        } else {					    					
            com.CellDO.COLSELECTDOLISTMsgJson __Row = new com.CellDO.COLSELECTDOLISTMsgJson();
            writer.beginArray();					
            for(int i = 0; i < arraySize0; i++) {
                if(_COLSELECTDOROW.getRow(i) != null) {
	
                    writer.beginObject();
                    __Row.marshal((com.CellDO.COLSELECTDOLIST)_COLSELECTDOROW.getRow(i), writer);
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
		com.CellDO.COLSELECTDOROW _COLSELECTDOROW = new com.CellDO.COLSELECTDOROW();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.CellDO.COLSELECTDOROW();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_COLSELECTDOROW = (com.CellDO.COLSELECTDOROW)unmarshal( jr,  _COLSELECTDOROW);
     
             
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
		                       
        return _COLSELECTDOROW;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws UnmarshalException {		
		
		com.CellDO.COLSELECTDOROW _COLSELECTDOROW = (com.CellDO.COLSELECTDOROW) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.CellDO.COLSELECTDOROW();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));
			jr = new JsonReader( reader );
			jr.beginObject();


					_COLSELECTDOROW = (com.CellDO.COLSELECTDOROW)unmarshal( jr,  _COLSELECTDOROW);
         
		         
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
		                       
	    return _COLSELECTDOROW;
	}
		
		
	public DataObject unmarshal(JsonReader reader, com.CellDO.COLSELECTDOROW dto) throws IOException {		 

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
		 
		 dto.clearAllIsModified();
		 
       	 return dto;
	}
		 
	protected void setField(com.CellDO.COLSELECTDOROW dto, JsonReader reader, String name) throws IOException {
		
		switch(name) {		
		case "Row" :
		{
			if(reader.peek() != JsonToken.NULL) {
				reader.beginArray();
				com.CellDO.COLSELECTDOLISTMsgJson __Row = new com.CellDO.COLSELECTDOLISTMsgJson();
				while( reader.hasNext() ){	
					if(reader.peek() != JsonToken.NULL) {			
						com.CellDO.COLSELECTDOLIST ___COLSELECTDOLIST = new com.CellDO.COLSELECTDOLIST();	
                        reader.beginObject();
						dto.addRow((com.CellDO.COLSELECTDOLIST)__Row.unmarshal( reader, ___COLSELECTDOLIST ));
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
		super.setField(dto, reader, name);
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

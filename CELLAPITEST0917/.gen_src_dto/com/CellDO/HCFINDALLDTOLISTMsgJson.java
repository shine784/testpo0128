	
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



public class HCFINDALLDTOLISTMsgJson extends Message {	
	public byte[] marshal(DataObject obj) throws MarshalException {
		com.CellDO.HCFINDALLDTOLIST _HCFINDALLDTOLIST = (com.CellDO.HCFINDALLDTOLIST)obj;
		
		if(_HCFINDALLDTOLIST == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _HCFINDALLDTOLIST, jw);
			
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
	
	
	public void marshal(com.CellDO.HCFINDALLDTOLIST _HCFINDALLDTOLIST, JsonWriter writer )throws IOException {
        int arraySize0 = _HCFINDALLDTOLIST.sizeContent();
		writer.name("content");
        if(_HCFINDALLDTOLIST.getContent() == null) {
            writer.nullValue();
        } else {					    					
            com.CellDO.HCFINDALLDTOGETMsgJson __content = new com.CellDO.HCFINDALLDTOGETMsgJson();
            writer.beginArray();					
            for(int i = 0; i < arraySize0; i++) {
                if(_HCFINDALLDTOLIST.getContent(i) != null) {
	
                    writer.beginObject();
                    __content.marshal((com.CellDO.HCFINDALLDTOGET)_HCFINDALLDTOLIST.getContent(i), writer);
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
		com.CellDO.HCFINDALLDTOLIST _HCFINDALLDTOLIST = new com.CellDO.HCFINDALLDTOLIST();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.CellDO.HCFINDALLDTOLIST();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_HCFINDALLDTOLIST = (com.CellDO.HCFINDALLDTOLIST)unmarshal( jr,  _HCFINDALLDTOLIST);
     
             
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
		                       
        return _HCFINDALLDTOLIST;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws UnmarshalException {		
		
		com.CellDO.HCFINDALLDTOLIST _HCFINDALLDTOLIST = (com.CellDO.HCFINDALLDTOLIST) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.CellDO.HCFINDALLDTOLIST();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));
			jr = new JsonReader( reader );
			jr.beginObject();


					_HCFINDALLDTOLIST = (com.CellDO.HCFINDALLDTOLIST)unmarshal( jr,  _HCFINDALLDTOLIST);
         
		         
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
		                       
	    return _HCFINDALLDTOLIST;
	}
		
		
	public DataObject unmarshal(JsonReader reader, com.CellDO.HCFINDALLDTOLIST dto) throws IOException {		 

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
		 
		 dto.clearAllIsModified();
		 
       	 return dto;
	}
		 
	protected void setField(com.CellDO.HCFINDALLDTOLIST dto, JsonReader reader, String name) throws IOException {
		
		switch(name) {		
		case "content" :
		{
			if(reader.peek() != JsonToken.NULL) {
				reader.beginArray();
				com.CellDO.HCFINDALLDTOGETMsgJson __content = new com.CellDO.HCFINDALLDTOGETMsgJson();
				while( reader.hasNext() ){	
					if(reader.peek() != JsonToken.NULL) {			
						com.CellDO.HCFINDALLDTOGET ___HCFINDALLDTOGET = new com.CellDO.HCFINDALLDTOGET();	
                        reader.beginObject();
						dto.addContent((com.CellDO.HCFINDALLDTOGET)__content.unmarshal( reader, ___HCFINDALLDTOGET ));
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

package com.hmkcode;

import com.hmkcode.vo.Content;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Sending POST to GCM" );
        
        String apiKey = "AIzaSyC0WDMFC8LDctE83m-ROFcnJYANIg1FmgM";
        Content content = createContent();
        
        POST2GCM.post(apiKey, content);
    }
    
    public static Content createContent(){
		
		Content c = new Content();
		
		c.addRegId("dNAsgrhlqmE:APA91bGMpn2neCr3_6BEypAdpxUGqN_anbwCjxVl6FNmdGd8Fw3niqzQxAAACBsWcDaIxMK4qkd33MUmxatSlXx-YipQ3v_jCTxtgJJd8V2la3inWqOJRqz88ExX0cOVJwelG4x4WobG");
		c.createData("Test Title", "Test Message 233");
		
		return c;
	}
}

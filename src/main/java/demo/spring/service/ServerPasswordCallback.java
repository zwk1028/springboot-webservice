package demo.spring.service;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;

public class ServerPasswordCallback implements CallbackHandler {
	
	public void handle(Callback[] callbacks) throws IOException,
			UnsupportedCallbackException {
		WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
System.out.println("pc.getIdentifier()：  " + pc.getIdentifier());		 
        if (pc.getIdentifier().equals("luoshengsha")) {
            // set the password on the callback. This will be compared to the
            // password which was sent from the client.
            pc.setPassword("lss123");
        } else {
        	System.out.println("---------验证没有通过--------");
        }
	}

}

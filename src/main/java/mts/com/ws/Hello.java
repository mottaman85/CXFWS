package mts.com.ws;

import javax.jws.WebService;

@WebService
public interface Hello {
	public String  helloWorld(String text);
}

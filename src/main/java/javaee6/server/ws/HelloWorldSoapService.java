package javaee6.server.ws;

import javax.jws.WebService;


@WebService
public interface HelloWorldSoapService {

	String helloWorld(String text);
	
}

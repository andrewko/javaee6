package javaee6.server.ws.impl;

import javaee6.server.ws.HelloWorldSoapService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(serviceName = "HelloWorldSoapService", endpointInterface = "javaee6.server.ws.HelloWorldSoapService")
public class HelloWorldSoapServiceImpl implements HelloWorldSoapService {

	@Override
	@WebMethod(operationName = "helloWorld")
	public @WebResult(name = "greeting")
	String helloWorld(@WebParam(name = "text") String text) {
		return "Hello " + text;
	}

	public String nonWsHelloWorld(String text) {
		return "Hello " + text;
	}
}

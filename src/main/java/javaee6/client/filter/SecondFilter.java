package javaee6.client.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName = "secondFilter", urlPatterns = { "/*" })
public class SecondFilter implements Filter{

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
		System.out.println("entering filter 2");
		chain.doFilter(req, resp);
		System.out.println("leaving filter 2");
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		
	}

}

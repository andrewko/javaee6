package javaee6.client.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName = "firstFilter", urlPatterns = { "/*" })
public class FirstFilter implements Filter{

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
		System.out.println("entering filter 1");
		chain.doFilter(req, resp);
		System.out.println("leaving filter 1");
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		
	}

}

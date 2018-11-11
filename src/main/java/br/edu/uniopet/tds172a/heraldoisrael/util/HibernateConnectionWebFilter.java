package br.edu.uniopet.tds172a.heraldoisrael.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@WebFilter(urlPatterns = { "*.jsf" }) 
public class HibernateConnectionWebFilter implements Filter {
	
	private SessionFactory sessionFactory;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.sessionFactory = HibernateUtil.getSessionFactory(); 
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		Session session = null;

		Transaction transaction = null;

		// Data processing

		session = this.sessionFactory.getCurrentSession();
		
		try {

			transaction = session.beginTransaction();

			chain.doFilter(request, response);

			transaction.commit();

			if (session.isOpen()) {

				session.close();
			}

		} catch (Throwable e) {

			try {

				if (transaction.isActive()) {

					transaction.rollback();
				}

			} catch (Throwable t) {

				e.printStackTrace();
			}

			throw new ServletException(e);
		}

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}

package Register;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import Register.Signup;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;
import com.opensymphony.xwork2.ActionSupport;


public class Login extends ActionSupport
{

	private static final long serialVersionUID = 1L;
	private static SessionFactory factory; 
	@SessionTarget
	Session session;
	@TransactionTarget
	Transaction tx= null;
	private Signup user ;
	 public String s = null;
	
	 public Login()
	 {
		 super();
	 }
	 
	public String valid() 
	{
		 
		 System.out.println(user.getUname());
		 System.out.println(user.getPwd());
		 if (user.getUname().length() == 0) 
		 {
	            this.addFieldError("user.uname", "Name is required");
	     }
	     if (user.getPwd().length() == 0) 
	     {
	            this.addFieldError("user.pwd", "Password is required");
	     }
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		 Transaction t=session.beginTransaction();
		 String hql = "FROM Signup s  WHERE s.uname = :username AND s.pwd = :password";
		 Query query = session.createQuery(hql);
		 query.setParameter("username",user.getUname());
		 query.setParameter("password", user.getPwd());
		 List<Signup> results = query.list();
		 System.out.println(results);
        if (results.size() > 0)
        {
        	 t.commit();
             
             session.close();
            return SUCCESS;
        }
        t.commit();
        
        session.close();
        
        return ERROR;
        
     
	}
	 public Signup getUser()
	 {
		return user;
	 }

	 public void setUser(Signup user) 
	 {
		this.user = user;
	 }

}

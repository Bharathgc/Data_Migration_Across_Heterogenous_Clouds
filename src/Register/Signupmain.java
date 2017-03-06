package Register;

import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import Register.Signup;


import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;
import com.opensymphony.xwork2.ActionSupport;



public class Signupmain extends ActionSupport 
{
	private static final long serialVersionUID = 1L;
	@SessionTarget
	 Session session;
	 @TransactionTarget
	 Transaction tx= null;
	 private Signup user ;
	 final String from="datamigration55@gmail.com";//change accordingly  
	 final String pass="finalyearproject";  
	 private String  subject = "Datamigration Otp";
	 private String msg;
   	 private String to ;
   	 private int gotp;
	 public String execute()
	 {
		 try
		 {
			 Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
			 Transaction t=session.beginTransaction();
			 int i=(Integer)session.save(user);
			 System.out.println(user.getUname());
			 if(i!=0)
			 {
				 	int genotp;
					Random rand = new Random();
					genotp = rand.nextInt(100000);
					gotp = genotp;
					to = user.getEid();
					System.out.println(genotp);
					System.out.println(to);
					Properties props = new Properties();  //change accordingly  
					props.put("mail.smtp.auth", "true");  
					props.put("mail.smtp.starttls.enable", "true");
					props.put("mail.smtp.host", "smtp.gmail.com");
					props.put("mail.smtp.port", "587");
					msg = "Your Otp is " + genotp; 
					javax.mail.Session session1 = javax.mail.Session.getDefaultInstance(props,new javax.mail.Authenticator() {  
						  protected PasswordAuthentication getPasswordAuthentication() {  
						   return new PasswordAuthentication(from,pass);  
						   }  
						});  
					
					MimeMessage message = new MimeMessage(session1);  
					message.setFrom(new InternetAddress(from));  
					message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
					message.setSubject(subject);  
					message.setText(msg);  
					   
					 //3rd step)send message  
					 Transport.send(message);  
					  
					 System.out.println("Done");  
					 t.commit();
					 session.close();
					 return SUCCESS;
			 }
			 else
			 {
			 t.commit();
			 session.close();
			 return ERROR;
			 }
		 }
		 catch (HibernateException e)
		 {
	         if (tx!=null) 
	        	 tx.rollback();
	         
	         e.printStackTrace(); 
	         return ERROR;
	     }
		 catch (MessagingException e)
		 {  
			    throw new RuntimeException(e);  
		 }  

		 catch (Throwable ex) 
		 { 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         throw new ExceptionInInitializerError(ex); 
	     }
		 
		 finally
		 {
	         session.close(); 
	     }
	 }
	 
	 public String getresult(int recvotp)
	 {
		 System.out.println(recvotp);
		 System.out.println(gotp);
		 if(gotp == recvotp)
			 return SUCCESS;
		 
		 else
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


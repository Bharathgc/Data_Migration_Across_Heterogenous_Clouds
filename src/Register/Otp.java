/*package Register;

import java.util.Properties;  

import javax.mail.*;  
import javax.mail.internet.InternetAddress;  
import javax.mail.internet.MimeMessage;  
  
import java.util.Random;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;
import com.opensymphony.xwork2.ActionSupport;

public class Otp extends ActionSupport
{
	private static final long serialVersionUID = 1L;
	private static SessionFactory factory; 
	
	private Signup user ;
	private otpnum recvotp;
	
	
	public String check() 
	{
		int genotp;
		Random rand = new Random();
		genotp = rand.nextInt(100000);
		System.out.println(genotp);
		Properties props = new Properties();  //change accordingly  
		props.put("mail.smtp.auth", "true");  
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		msg = "Your Otp is" + genotp; 
		javax.mail.Session session = javax.mail.Session.getDefaultInstance(props,new javax.mail.Authenticator() {  
			  protected PasswordAuthentication getPasswordAuthentication() {  
			   return new PasswordAuthentication(dataemail,pass);  
			   }  
			});  
		
		try {  
			 MimeMessage message = new MimeMessage(session);  
			 message.setFrom(new InternetAddress(dataemail));  
			 message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
			 message.setSubject(subject);  
			 message.setText(msg);  
			   
			 //3rd step)send message  
			 Transport.send(message);  
			  
			 System.out.println("Done");  
			  
			 } catch (MessagingException e) {  
			    throw new RuntimeException(e);  
			 }  
			      
			}  
		
	}
}*/

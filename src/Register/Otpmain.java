package Register;
import com.opensymphony.xwork2.ActionSupport;

import Register.Otp;
import Register.Signupmain;
public class Otpmain extends ActionSupport
{
	
	private static final long serialVersionUID = 1L;
	private Otp recvotpobj;
	private int recvotp;
	private Signupmain valid_user;
	private String result;
	
	
	public String check()
	{
		System.out.println("this is check methofd");
		System.out.println(recvotpobj.getotpnum());
		recvotp = recvotpobj.getotpnum();
		
		result = valid_user.getresult(recvotp);
		return result;
	}
	
	public Otp getotpobj()
	{
		return recvotpobj;
	}
	
	public void setotpobj(Otp recvotpobj)
	{
		this.recvotpobj = recvotpobj;
	}
}

package Register;

public class Otp
{
	private int otp;
	
	public Otp()
	{
		
	}
	public Otp(int otp)
	{
		this.otp = otp;
	}
	public int getOtp()
	{
		return otp;
	}
	public void setOtp(int otp)
	{
		this.otp = otp;
	}
	public String execute()
	{
		if(Signupmain.gotp== otp)
		{
			System.out.println(otp);
			return "success";
		}
		else
			return "error";
	}
}

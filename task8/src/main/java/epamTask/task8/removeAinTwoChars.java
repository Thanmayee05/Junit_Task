package epamTask.task8;

public class removeAinTwoChars 
{
	public String remove(String str)
	{
		String res="";
		if(str.charAt(0)=='A' && str.charAt(1)=='A')
			res=res+str.substring(2);
		else if(str.charAt(0)=='A')
			res=res+str.substring(1);
		else if(str.charAt(1)=='A')
			res=res+str.charAt(0)+str.substring(2);
		else
			res=res+str;
		return res;		
	}

}

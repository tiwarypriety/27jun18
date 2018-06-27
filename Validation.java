package file;

public class Validation {
	static int 	p=0;
	int id[] = new int[4];
	
boolean	checkEmailFormat(String email)
{
	String endPattern = "@gmail.com";

    if(email == null)
    {
        return false;
    }    
    else if(email.endsWith(endPattern))
    {
    	 return true;
    }
return false;		
}
	
boolean	checkEmpId(int x)
{
	
	if(x!=0)
	{
		id[p] = x;
		p++;
	if(checkDuplicate(id,x))
		return false;
	else
		return true;
	}
	
	return false;
		
	}
boolean	checkAddress(String address)
{
	if(address.isEmpty()){
		return false;
	}
	
	return true;
		
	}
boolean	checkDuplicate(int d[],int x)
{
	int flag=0;

	for(int i=0;i<d.length;i++)
	{
				if(x==d[i])
		{
			flag++;
		}
	}
		if(flag==1)
		{
			return false;
		}
		else if(flag>1)
		{
			return true;
		}
		return false;
	}
}

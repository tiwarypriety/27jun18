package file;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main 
{

	public static void main(String[] args) throws Exception 
	{
		Validation v =new Validation();
		Employee e = new Employee();
			boolean email = false,address = false,id = false;
			BufferedReader br = new BufferedReader(new FileReader("d:/EmployeeData.txt"));
			String x;
			while((x = br.readLine())!=null)
			{
				String words[] = x.split("~",-1);											
			address = v.checkAddress(e.getAddress1());			
			email =	v.checkEmailFormat(e.getEmail());						
      		id = v.checkEmpId(e.id);
      		
				if(address&&email&&id)
				{
					PrintWriter out = new PrintWriter("d:/newEmployeeData.txt");
					String b[] = new String[20];
					 for(int i =0;i<words.length;i++)
					 {
						 b[i] = words[i];
					 }
				
					 for(int i = 0;i<words.length;i++)
					 {						 
						 out.write(b[i]);
						 out.write(" ");						
					 }
				
					out.flush();
				}
			}			
	}
}




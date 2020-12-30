package accessInstancesOfAClass;

import java.lang.reflect.Field;

public class FetchInstanceOfClass 
{
	public static void main(String[] args) 
    throws Exception 
	{
		Field[] field = DataMember.class.getDeclaredFields();
		for(Field f : field)
		{
			System.out.println(f.getName()+" "+f.getInt(f));
		}
		
		System.out.println("task complete");
	}

}

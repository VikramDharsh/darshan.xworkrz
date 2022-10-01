class Cricketers
{
	static  String[] allNames={null,null,null,null,null,null};
  static int position=0;
	static void names(String name)
	
	{
		if(name!=null&&name.length()>2)
		{
		allNames[position]=name;
	System.out.println("name is valid ");
	position++;
		}
		else 
		{
			System.out.println("name is invalid ");
		}
		
	}
	
	
	static  void displayDetails()
	{ 
	
	System.out.println("all names inside array");
	
		for(int index=0;index<allNames.length;index++)
		{
			String ref=allNames[index];
			System.out.println("players  name  :"+ref);		
			
		}
		
	}
	
	static boolean findName(String name)
	{
		System.out.println("finding player name in array");
		for(int index=0;index<allNames.length;index++)
		{
			if(name==allNames[index])
			{
				System.out.println("name is found &the name is "+name+"   index  :"+index);
				return true;
			}
		}
	return false;
	}
	static void updateName(String oldName,String newName)
	{
		if(oldName!=null&&newName!=null)
		{
			if(oldName.length()>2&&newName.length()>2)
			{
				for(int index=0;index<allNames.length;index++)
				{
					if(oldName==allNames[index])
					{
						String ref=allNames[index];
						System.out.println("old name :"+ref  +"  index"+index +"updateName   :"+newName+"at index :"+index);
						allNames[index]=newName;
					}
				}
				
			}
		}
	}

	static void updateName(String name,int index)
	{
		if(name!=null&&name.length()>2)
		{
			System.out.println( " updateName using index ");
		String ref=allNames[index];
		allNames[index]=name;
		System.out.println( "new name   :"+name);
		}
	}
	
	static void delete( String name)
	{
		if(name!=null&&name.length()>2)
		{
			for(int index=0;index<allNames.length;index++)
			{
				if(name==allNames[index])
				{
				String ref=allNames[index];
				allNames[index]=null;
				System.out.println( "deleted name   :"+name+" now name is"+allNames[index]);
		}
			}
		}
	}
	
	static void delete(int index)
	
	{
		if(allNames[index]!=null)
		{
		String ref=allNames[index];
		allNames[index]=null;
	}}
}
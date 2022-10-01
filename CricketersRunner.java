class CricketersRunner
{
	public static void main(String[] args)
	{
	 System.out.println("main entered ");
	 
	 
	 Cricketers.names("suhass");
	 Cricketers.names("chandu");
	  Cricketers.names("tarun");
	   Cricketers.names("basu");
	    Cricketers.names("sunil");
		 Cricketers.names("mani");
		 
		 
		  Cricketers.displayDetails();
		  
		 Cricketers.findName("chandu");
		 
		 
		  Cricketers.updateName("mani","arul");
		  
		   Cricketers.updateName("vikram",4);
		   
		   
		  Cricketers.delete("chandu");
		  
		  Cricketers.delete(4);
		  Cricketers.displayDetails();
		  
}
}
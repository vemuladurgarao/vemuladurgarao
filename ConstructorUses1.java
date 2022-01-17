package Projects;

public class ConstructorUses1 
{
	public int data;
	public double d;
  public static void main(String[] args) {
	
	  ConstructorUses1 c=new ConstructorUses1(23, 40.0);
	  System.out.println("parameterized constructor");  //parameterized constructor
	  System.out.println(c.data);
	  System.out.println(c.d);
	 
	  Constructor2 c1=new  Constructor2();
			  System.out.println("default constructor"); //defalut constructor
			  System.out.println(c1.data);
			  System.out.println(c1.name);
	 
			  
			  
	  
}
public ConstructorUses1(int data,double d) {
	
	this.data = data;
	this.d = d;
}
  
}
 





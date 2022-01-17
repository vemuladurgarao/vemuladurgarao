package Projects;
import java.lang.String;

public class MethodReturnTypes {

	public static void main(String[] args) {
		
		MethodReturnTypes m=new MethodReturnTypes();
		System.out.println(	m.data(23));
			System.out.println(m.doubleData(23.8));
			System.out.println(m.floatData(34.1f));
			System.out.println(m.stringData("durgarao"));
		
	}
	
	public int data(int d)
	{
		return d;
	}
	
	public double doubleData(double d1)
	{
		return d1;
	}
	
	public float floatData(float f)
	
	{
		return f;
	}
	
	public String stringData(String string)
	{
		return string;
	}
}

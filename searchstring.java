
package phase1assitedproject;
import java.util.*;

public class searchstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name search");
String s=sc.nextLine();
String array[]={"durgara0","teja","sai","prasanth"};
int flag=0,i;
for(i=0;i<6;i++)
{
	if(s==array[i])
	{
		flag=1;
		break;
	}
}
if(flag==1)
	System.out.println("The name"+s+" Exits");
	else
		System.out.println("The name "+s+" does not Exits");

}
	}
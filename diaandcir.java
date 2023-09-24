import java.util.*;
class circle
{
	int r;
	circle()
	{
		int diam=0;
		double circum=0;
	}
	int diam()
	{
		return 2*r;
	}
	double circum()
	{
		return 2*3.14*r;
	}
}
class diaandcir{
	public static void main(String args[]){
	
	int dia1,dia2;
	double cir1,cir2;	

	circle c1= new circle();
	circle c2= new circle();
	Scanner sc= new Scanner(System.in);
	
	System.out.print("Enter the first radius:");
	c1.r=sc.nextInt();
	System.out.print("Enter the second radius:");
	c2.r=sc.nextInt();
	
	dia1=c1.diam();
	cir1=c1.circum();
	dia2=c2.diam();
	cir2=c2.circum();

	System.out.println("The diameter of first diameter:"+dia1); 
	System.out.println("The diameter of second diameter:"+dia2); 
	System.out.println("The diameter of first circumance:"+cir1); 
	System.out.println("The diameter of second circumance:"+cir2);
	
	}
} 
	
import java.util.Scanner;
class Sweden extends ola
{
	int pricekm3=37;
	Scanner sc = new Scanner(System.in);
	Sweden(String name,int age,int km)
	{
		super(name,age,km);
		this.name=name;
		this.age=age;
		this.km=km; 
	}
	public void bill()
	{
		int pay=pricekm3*km;
		System.out.println("User you have to pay "+pay);
		int money =sc.nextInt();
		if(money>=pay)
		{
			System.out.println("Payment is successful");
			System.out.println("order is confirmed");
		}
		else
		{
			System.out.println("Order is not confirmed");
		}
	}
}
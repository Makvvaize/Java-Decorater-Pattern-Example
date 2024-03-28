
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Beverage coffee = new Espresso();
		System.out.println(coffee.getDescription() + " " + coffee.cost() + "$");
		
		Beverage coffee2 = new Decaf();
		coffee2 = new Milk(coffee2);
		coffee2 = new Whip(coffee2);
		System.out.println(coffee2.getDescription() + " " + coffee2.cost() + "$");
		
	}

}

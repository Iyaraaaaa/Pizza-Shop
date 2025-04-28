import java.util.Scanner;
public class pizza{

    public static void main (String[] args) {
	
	    int SmallCount =0;
		int MediumCount =0;
		int LargCount =0;

		int ThickCount = 0;
		int ThinCount = 0;
			
	int CN = 0;
	int customer_num = 1;
	while (CN < 1) {


		Scanner scanner = new Scanner (System.in);
	
	
	System.out.println( "									Welcome To The C# Pizza !								" );
	
	System.out.println(" \n");	
	System.out.println(" \n");	
	
	
	
				
	int Cnumber = 1;									
	int CustomerNumber = Cnumber++;
	
				
	System.out.println(" \n");			
	System.out.println(" 			Customer ID = "  + "PizzaCustomer_" + customer_num );	
	
	Cnumber++;
	
	
	
	
	System.out.println(" \n");							
	System.out.println(" \n");
	
	// Get The Type
	System.out.println("Select what type Do you want ");
	System.out.println(" \n	 1 for Delivery \n	"+" 2 for Take away" ) ;
	int  Method = scanner.nextInt();	

		switch(Method) {
				case 1:
					System.out.println("\n Your Selected Type Is :   Delivery");
					break;
				case 2:
					System.out.println("\n Your Selected Type Is :  Take Away");
					break;
				default:
					System.out.println("\n Invalid Number");	
				}

	

	
	// Get pizza size
	System.out.println(" \nPizza size  -:  Small	Medium	Larg");
	System.out.println("Enter Pizza Size -: \n		1 for Small \n	"+"	2 for Medium\n	"+"	3 for Larg	");
	int size = scanner.nextInt();				
	
		int Small = 990;
		int Medium = 1990;
		int Larg = 2500;
		int SizePrice = 0;	
		
	

		switch(size) {
			case 1:
					System.out.println("\n Your Pizza Size is Small ");
					SizePrice = Small;
					SmallCount = SmallCount++;
					SmallCount++;
					break;
			case 2:
					System.out.println("\n Your Pizza Size is Medium");
					SizePrice = Medium;
					MediumCount =  MediumCount++;
					MediumCount++;
					break;
			case 3:
					System.out.println("\n Your Pizza Size is Larg");
					SizePrice = Larg;
					LargCount =  LargCount++;
					LargCount++;
					break;
			default:
					System.out.println("\n Invalid Number");
					} 
					
			System.out.println(" \n");
			System.out.println(" \n");	
			
			
		
	// Get pizza base	
	System.out.println("\nPizza Base  -:  Thik	Thin");
	System.out.println("Enter Pizza Base :- \n		1 for Thik \n"+"		2 for Thin");
	int base= scanner.nextInt();
			
		int Thin = 120;
		int Thick = 100;
		int BasePrice = 0;
		
	
		
		switch(base) {
				case 1:
					System.out.println("\n Your Pizza Base is Thik");
					BasePrice = Thick;
					ThickCount = ThickCount++;
					ThickCount++;
					break;
				case 2:
					System.out.println("\n Your Pizza Size is Thin");
					BasePrice = Thin;
				    ThinCount = ThinCount++;
					ThinCount++;
					break;				
				default:
					System.out.println("\n Invalid Number");
				}
				
		
		
		System.out.println(" \n");
		System.out.println(" \n");							
		
	// Get pizza Tooping
    System.out.println(" \nPizza Tooping  -: Peperoni,Chiken,Button_Mushroom,Chimini_Mushroom,Spanich,Olives ");
	System.out.println("Enter your Three Favourite Pizza Tooping -:\n		1 for Peperoni \n"+"		2 for Chiken\n"+"		3 for Button Mushroom\n"+"		4 for Chimini Mushroom\n"+"		5 for Spanich\n"+"		6 for Olives");
	
							
		int ToppingPrice1 = 0;
        int ToppingPrice2 = 0;
        int ToppingPrice3 = 0;
		
		System.out.println(" \n");
		System.out.println(" \n");
		
		int topping_1 = scanner.nextInt();
        int topping_2 = scanner.nextInt();
        int topping_3 = scanner.nextInt();

		ToppingPrice1 = calculateToppingPrice(topping_1);
        ToppingPrice2 = calculateToppingPrice(topping_2);
        ToppingPrice3 = calculateToppingPrice(topping_3);
						
		System.out.println(" \n");	
		
		System.out.println("How many Piza Do You Want :- ");
		int Amount= scanner.nextInt();	

		System.out.println(" \n");
		System.out.println(" \n");	

		
		System.out.println("			Quntity OF Pizza = " + Amount  );	
       
		
		int ToppingPrice = (ToppingPrice1 + ToppingPrice2 + ToppingPrice3);
		
		
		//System.out.println(" 			Customer ID = "  + "PizzaCustomer_" + CustomerNumber );
		
		// (Calculate Price)
		System.out.println("\n			Your Topping 1 Price = " + "Rs " + ToppingPrice1 + "/=" );
		System.out.println("			Your Topping 2 Price = " + "Rs " + ToppingPrice2 + "/=" );
		System.out.println("			Your Topping 3 Price = " + "Rs " + ToppingPrice3 + "/=" );
		System.out.println("					Total Topping Price =  " +  "Rs " + ToppingPrice + "/=" );
		
		System.out.println(" \n");
		System.out.println(" \n");
		
		System.out.println("			Pizza Size = " + "Rs " + SizePrice + "/="  );
		System.out.println("			Pizza Base = " + "Rs " + BasePrice + "/="  );
		System.out.println("			Pizza Tooping = " + "Rs " + ToppingPrice + "/="  );
		

		// Confirm or change order
		System.out.println(" \n");
		System.out.println(" Conform Your Oder (Yes = 1 , No = 0):- ");
		int Conform = scanner.nextInt();
		
		customer_num += 1;
		
		// Print Prices
		int Total_Price = ( SizePrice + BasePrice + ToppingPrice  ) * Amount;
		
		switch(Conform) {
			case 0:
					System.out.println(" This Order Is Cancelled ");
					break;
			case 1:
					System.out.println("			Your Total Price = Rs " + Total_Price + "/="  );
					System.out.println(" \n 							Please Wait , Your Order Is Prossessing 			");
					System.out.println(" \n");
					System.out.println(" \n					_______________Thanks For Your Oder_______________				");
					break;	
						}
		
		System.out.println(" \n  			Thank for Comming C# PiZZa			 ");
		
		
		System.out.println(" \n");
		System.out.println(" \n");	


		System.out.println("(Next Customer =0), (View Sales Record =1)");
		int Final = scanner.nextInt();


        switch(Final) {
			case 0:
						System.out.println(" \n  			Next Customer Please	");
					break;
			case 1:
					
						System.out.println(" Sales Record ");

						System.out.println(" \n");
							
						System.out.println("			Total Small size pizza Amount =		" + (SmallCount * Amount)  );
						System.out.println("			Total Medium pizza Amount     =		" + (MediumCount * Amount) );
						System.out.println("			Total Larg pizza Amount       =		" + (LargCount * Amount)  );
					
							
						System.out.println(" \n");	
					
						System.out.println("			Total Thik Base pizza Amount =		" + (ThickCount * Amount) );
						System.out.println("			Total Thin size pizza Amount =		" + (ThinCount * Amount)  );

					/*	System.out.println("			Total Peperoni Topping Amount =		" + PeperoniCount + "/=");
						System.out.println("			Total Chicken Topping Amount =		" + ChickenCount + "/=");
						System.out.println("			Total Button_Mushroom Topping Amount =		" + Button_MushroomCount + "/=");
						System.out.println("			Total Chimini_Mushroom Topping Amount =		" + Chimini_MushroomCount + "/=");
						System.out.println("			Total Spanich Topping Amount =		" + SpanishCount + "/=");
						System.out.println("			Total Cheese Topping Amount =		" + CheeseCount + "/=");	 */
						
						CN++;
					break;	
						}
		
		
		System.out.println(" \n");
		System.out.println(" \n");

		System.out.println("============================================================================================================================================================");
		
		//scanner.close();
		
		System.out.println(" \n");	
		System.out.println(" \n");	
		
		System.out.println(" \n");
		System.out.println(" \n");
		System.out.println(" \n");
		
      
		
			}
			
		
	
			
    }
	
	

	// (To select one of many code block for Execution)
	
		int PeperoniCount =0;
		int ChickenCount =0;
		int Button_MushroomCount =0;
		int Chimini_MushroomCount =0;
		int SpanishCount =0;
		int CheeseCount =0;
		
    public static int calculateToppingPrice(int topping){
        switch (topping) {
            case 1:
                System.out.println("	Your Topping is Peperoni               ");
                return 200;
            case 2:
                System.out.println("   	Your Topping is Chicken                ");
                return 220;
            case 3:
                System.out.println("	Your Topping is Button Mushroom       ");
                return 140;
            case 4:
                System.out.println("	Your Topping is Chimini Mushroom      ");
                return 120;
            case 5:
                System.out.println("	Your Topping is Spanish             ");
                return 160;
			case 6:
                System.out.println("	Your Topping is Cheese				 ");
                return 160;
            default:
                System.out.println("	Invalid Topping Selection               ");
                return 0;
        }
    
	}

}			

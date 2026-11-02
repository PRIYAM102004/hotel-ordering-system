package hotel.com;
import java.util.*;


public class Hotel {
	static Scanner sc=new Scanner(System.in);
	  public static void main (String[]args) {
		  
		
		  char choice;
		  
		
		   do {
			
			   
			  System.out.println("1.Saravana Bhavan");
			  System.out.println("2.Anjappar");
			  System.out.println("3.A2B");
			  System.out.println("4.Aryaas");
			  System.out.println("5.Green Park");
			  System.out.println("6.Exit");
			  
			  System.out.println("Choose The Hotel:");
			   int userEnter=sc.nextInt();
			   
			   switch (userEnter){
			   case 1:
				  
			   {
				   int total=0;
			        System.out.println("Welcome To Saravana Bhavan");
			    do {    
			        System.out.println("Please select a dish:");
			        System.out.println("1.Masala Dosa- ₹200");
			        System.out.println("2.Vegetable Biryani- ₹150");
			        System.out.println("3.Curd Rice- ₹300");
			        System.out.println("4.Poori- ₹350");
			        
			        System.out.println("Choose Food:");
			        int Food = sc.nextInt();
			        
			        int price = 0;
			   switch(Food) {
			       
			   case 1:
				   price=200;
			       break;
				   
			   case 2:
				  price=150;
				   break;
			   case 3:
				   price=300;
				   break;
			   case 4:
				  price=350;
				   break;
			   default :
	           System.out.println("Invalid Food");
				   break;
				
			   }
			  
			   if (price >0) {
				   System.out.println("Enter Quantity:");
				   int quantity =sc.nextInt();
				  
				
				   
				   if(quantity >0) {
					   int amount =price *quantity;
					   total = total +amount;
					   System.out.println("Food Amount :"+amount);
				   }else {
					   System.out.println("Invalid Quantity");
				   }
				  
			   }
			   do {
				    System.out.println("Do you want to order more food? (Y/N)");
				    choice = sc.next().charAt(0);

				    if(choice != 'Y' && choice != 'y' && choice != 'N' && choice != 'n') {
				        System.out.println("Invalid Choice! Please enter Y or N");
				    }

				} while(choice != 'Y' && choice != 'y' && choice != 'N' && choice != 'n');
			 
			   
			 
			    } while(choice =='Y' || choice =='y');
			    
			    //GST calculation
			
			    if(total >0) {
			    double gst = total * 5 / 100.0;
			    double grandTotal = total + gst;

			    System.out.println("Food Total : ₹" + total);
			    System.out.println("GST (5%)  : ₹" + gst);
			    System.out.println("Grand Total: ₹" + grandTotal);
			    //payment option 
			    int payment=0;
			    do {
			    System.out.println("Select Payment Method");
			    System.out.println("1.cash");
			    System.out.println("2.UPI");
			    System.out.println("3.card");
			    
			    System.out.println("Enter payment Option");
			     payment=sc.nextInt();
			   
			    
			    
			    switch(payment) {
			    case 1:
			    	System.out.println("Payment Through cash");
			    	System.out.println("Payment Successfully");
			    	break;
			    	
			    case 2:
			    	System.out.println("Payment Through UPI");
			    	System.out.println("Payment Successfully");
			    	break;
			    	
			    case 3:
			    	System.out.println("Payment Through Card");
			    	System.out.println("Payment Successfully");
			    	break;
			    	
			    	default:
			    	System.out.println("Invalid Payment Option");
			    	break;
			    
			    }
			    
			    }while(payment <1 ||payment >3);
			   
			    }else {
			    	System.out.println("No Food Ordered");
			    }
			   break;
			   }
//			   case 2
			   
			   case 2:{
				   int total=0;
				   
		           System.out.println("Welcome 	To Anjappar");
		           
		           do {
		           System.out.println("Please select a dish:");
		           
		           System.out.println("1.Chicken 65 – ₹180");
			       System.out.println("2.Chicken Biryani – ₹250");
			       System.out.println("3.Fish Fry – ₹220");
			       System.out.println("4.Prawn Masala – ₹280");
			        
			  
			        System.out.println("Choose Food:");
			        int Food = sc.nextInt();
			        
			        int price = 0;
			   switch(Food) {
			       
			   case 1:
				   price=180;
			       break;
				   
			   case 2:
				  price=250;
				   break;
			   case 3:
				   price=220;
				   break;
			   case 4:
				  price=280;
				   break;
			   default :
	          System.out.println("Invalid Food");
				   break;
				
			   }
			  
			   if (price >0) {
				   System.out.println("Enter Quantity:");
				   int quantity =sc.nextInt();
				  
				  if(quantity>0) {
					  int amount =price*quantity;
					  total = total+amount;
					  System.out.println("Final Amount :"+amount);
				  }else {
					  System.out.println("Invalid Quantity");
				  }
				   
			   }
			   
			   do {
				    System.out.println("Do you want to order more food? (Y/N)");
				    choice = sc.next().charAt(0);

				    if(choice != 'Y' && choice != 'y' && choice != 'N' && choice != 'n') {
				        System.out.println("Invalid Choice! Please enter Y or N");
				    }

				} while(choice != 'Y' && choice != 'y' && choice != 'N' && choice != 'n');
		        
		           }while(choice =='Y' || choice =='y');
		           
//                gst calculation
		           
		           if(total >0) {
		           double gst = total * 5 / 100.0;
				    double grandTotal = total + gst;

				    System.out.println("Food Total : ₹" + total);
				    System.out.println("GST (5%)  : ₹" + gst);
				    System.out.println("Grand Total: ₹" + grandTotal);
				    
				   
				    
				    int payment =0;
				    //payment option 
				    do {
				    System.out.println("Select Payment Method");
				    System.out.println("1.cash");
				    System.out.println("2.UPI");
				    System.out.println("3.card");
				    
				    System.out.println("Enter payment Option");
				     payment=sc.nextInt();
				    
				    switch(payment) {
				    case 1:
				    	System.out.println("Payment Through cash");
				    	System.out.println("Payment Successfully");
				    	break;
				    	
				    case 2:
				    	System.out.println("Payment Through UPI");
				    	System.out.println("Payment Successfully");
				    	break;
				    	
				    case 3:
				    	System.out.println("Payment Through Card");
				    	System.out.println("Payment Successfully");
				    	break;
				    	
				    	default:
				    	System.out.println("Invalid Payment Option");
				    	break;
				    
				    }
		           
				    }while(payment <1 ||payment >3);
		           
		           }else {
                         System.out.println("No Food Ordered");
		           }
			        break;
			   }
		               
			   case 3 :
				  
			   {
				   int total=0;
		           System.out.println("Welcome To A2B");
		           
		           do {
		           System.out.println("Please select a dish:");
		           
		           System.out.println("1.Paneer Dosa – ₹160");
			        System.out.println("2.Medhu Vada – ₹70");
			        System.out.println("3.Ghee Pongal – ₹100");
			        System.out.println("4.Poori Masala – ₹110");
			        
			        System.out.println("Choose Food:");
			        int Food = sc.nextInt();
			        
			        int price = 0;
			   switch(Food) {
			       
			   case 1:
				   price=160;
			       break;
				   
			   case 2:
				  price=70;
				   break;
			   case 3:
				   price=100;
				   break;
			   case 4:
				  price=110;
				   break;
			   default :
	          System.out.println("Invalid Food");
				   break;
				
			   }
			  
			   if (price >0) {
				   System.out.println("Enter Quantity:");
				   int quantity =sc.nextInt();
				  
				   
					  if(quantity>0) {
						  int amount =price*quantity;
						  total = total+amount;
						  System.out.println("Final Amount :"+amount);
					  }else {
						  System.out.println("Invalid Quantity");
					  }
			   }
			   
			   do {
				    System.out.println("Do you want to order more food? (Y/N)");
				    choice = sc.next().charAt(0);

				    if(choice != 'Y' && choice != 'y' && choice != 'N' && choice != 'n') {
				        System.out.println("Invalid Choice! Please enter Y or N");
				    }

				} while(choice != 'Y' && choice != 'y' && choice != 'N' && choice != 'n');
			   
		           }while(choice =='Y' ||choice =='y');
		         
//		           gst calculation
		           
		           if(total >0) {
		   	    double gst = total * 5 / 100.0;
			    double grandTotal = total + gst;

			    System.out.println("Food Total : ₹" + total);
			    System.out.println("GST (5%)  : ₹" + gst);
			    System.out.println("Grand Total: ₹" + grandTotal);
		        
			    
			    int payment =0;
			    do {
				    //payment option 
				    System.out.println("Select Payment Method");
				    System.out.println("1.cash");
				    System.out.println("2.UPI");
				    System.out.println("3.card");
				    
				    System.out.println("Enter payment Option");
				     payment=sc.nextInt();
				    
				    switch(payment) {
				    case 1:
				    	System.out.println("Payment Through cash");
				    	System.out.println("Payment Successfully");
				    	break;
				    	
				    case 2:
				    	System.out.println("Payment Through UPI");
				    	System.out.println("Payment Successfully");
				    	break;
				    	
				    case 3:
				    	System.out.println("Payment Through Card");
				    	System.out.println("Payment Successfully");
				    	break;
				    	
				    	default:
				    	System.out.println("Invalid Payment Option");
				    	break;
				    
				    }
			    }while(payment <1 ||payment >3);  
			
		           }else {
		        	   System.out.println("No Food Ordered");
		           }
		           break;
			   }
			   case 4:  
				  
			   {
				   int total=0;
		           System.out.println("Welcome To Aryaas");
		           
		           do {
		           System.out.println("Please select a dish:");
		           
		           System.out.println("1.Veg Noodles – ₹200");
			        System.out.println("2.Veg Meals – ₹150");
			        System.out.println("3.Ghee Dosa – ₹300");
			        System.out.println("4.Paneer Fried Rice – ₹350");
			        
			        System.out.println("Choose Food:");
			        int Food = sc.nextInt();
			        
			        int price = 0;
			   switch(Food) {
			       
			   case 1:
				   price=200;
			       break;
				   
			   case 2:
				  price=150;
				   break;
			   case 3:
				   price=300;
				   break;
			   case 4:
				  price=350;
				   break;
			   default :
	          System.out.println("Invalid Food");
				   break;
				
			   }
			  
			   if (price >0) {
				   System.out.println("Enter Quantity:");
				   int quantity =sc.nextInt();
				  
				   
					  if(quantity>0) {
						  int amount =price*quantity;
						  total = total+amount;
						  System.out.println("Final Amount :"+amount);
					  }else {
						  System.out.println("Invalid Quantity");
					  }
			   }


			   do {
				    System.out.println("Do you want to order more food? (Y/N)");
				    choice = sc.next().charAt(0);

				    if(choice != 'Y' && choice != 'y' && choice != 'N' && choice != 'n') {
				        System.out.println("Invalid Choice! Please enter Y or N");
				    }

				} while(choice != 'Y' && choice != 'y' && choice != 'N' && choice != 'n');
			   
		           }
			   while(choice =='Y' ||choice=='y');
		    
		           
//		            gst calculation 
		           if(total >0) {
		   	    double gst = total * 5 / 100.0;
			    double grandTotal = total + gst;

			    System.out.println("Food Total : ₹" + total);
			    System.out.println("GST (5%)  : ₹" + gst);
			    System.out.println("Grand Total: ₹" + grandTotal);

			    
			    int payment =0;
			    do {
				    //payment option 
				    System.out.println("Select Payment Method");
				    System.out.println("1.cash");
				    System.out.println("2.UPI");
				    System.out.println("3.card");
				    
				    System.out.println("Enter payment Option");
				     payment=sc.nextInt();
				    
				    switch(payment) {
				    case 1:
				    	System.out.println("Payment Through cash");
				    	System.out.println("Payment Successfully");
				    	break;
				    	
				    case 2:
				    	System.out.println("Payment Through UPI");
				    	System.out.println("Payment Successfully");
				    	break;
				    	
				    case 3:
				    	System.out.println("Payment Through Card");
				    	System.out.println("Payment Successfully");
				    	break;
				    	
				    	default:
				    	System.out.println("Invalid Payment Option");
				    	break;
				    
				    }
		           

			    }while(payment <1 ||payment >3);
		           }
		           else {
		        	   System.out.println("No Food Ordered");
		           }
		           break;
			   }  
			   
//			   case 5
			   case 5: 
				   
			   {
				   int total=0;
		           System.out.println("Welcome To Green Park");
		           
		           do {
		           System.out.println("Please select a dish:");
		           
		           System.out.println("1.Chicken Fried Rice – ₹190");
			        System.out.println("2.Tandoori Chicken – ₹300");
			        System.out.println("3.Paneer Butter Masala – ₹160");
			        System.out.println("4.Mutton Biryani – ₹280");
			        
			        System.out.println("Choose Food:");
			        int Food = sc.nextInt();
			        
			        int price = 0;
			   switch(Food) {
			       
			   case 1:
				   price=190;
			       break;
				   
			   case 2:
				  price=300;
				   break;
			   case 3:
				   price=160;
				   break;
			   case 4:
				  price=280;
				   break;
			   default :
	          System.out.println("Invalid Food");
				   break;
				
			   }
			  
			   if (price >0) {
				   System.out.println("Enter Quantity:");
				   int quantity =sc.nextInt();
				  
				   
					  if(quantity>0) {
						  int amount =price*quantity;
						  total = total+amount;
						  System.out.println("Final Amount :"+amount);
					  }else {
						  System.out.println("Invalid Quantity");
					  }
			   }
			   
			
			   
			   do {
				    System.out.println("Do you want to order more food? (Y/N)");
				    choice = sc.next().charAt(0);

				    if(choice != 'Y' && choice != 'y' && choice != 'N' && choice != 'n') {
				        System.out.println("Invalid Choice! Please enter Y or N");
				    }

				} while(choice != 'Y' && choice != 'y' && choice != 'N' && choice != 'n');
			   
			   
		           }while(choice =='Y'||choice=='y');
		           
//		           gst calculation 
		           if(total >0) {
		   	    double gst = total * 5 / 100.0;
			    double grandTotal = total + gst;

			    System.out.println("Food Total : ₹" + total);
			    System.out.println("GST (5%)  : ₹" + gst);
			    System.out.println("Grand Total: ₹" + grandTotal);
			    
			    
			    int payment=0;
			    do {
				    //payment option 
				    System.out.println("Select Payment Method");
				    System.out.println("1.cash");
				    System.out.println("2.UPI");
				    System.out.println("3.card");
				    
				    System.out.println("Enter payment Option");
				     payment=sc.nextInt();
				    
				    switch(payment) {
				    case 1:
				    	System.out.println("Payment Through cash");
				    	System.out.println("Payment Successfully");
				    	break;
				    	
				    case 2:
				    	System.out.println("Payment Through UPI");
				    	System.out.println("Payment Successfully");
				    	break;
				    	
				    case 3:
				    	System.out.println("Payment Through Card");
				    	System.out.println("Payment Successfully");
				    	break;
				    	
				    	default:
				    	System.out.println("Invalid Payment Option");
				    	break;
				    
				    }
		           
			    }while(payment <1 || payment >3);
		           }else {
		        	   System.out.println("No Food Ordered");
		           }
		           break;
			   }
			   case 6:  
		           System.out.println("Thank You Visit Again");
		           return;       
		           
			   default:
				   System.out.println("Invalid");
				   break;
			   
			   }

			  }while (true);
		   
		      
		   }
	  
	
	}



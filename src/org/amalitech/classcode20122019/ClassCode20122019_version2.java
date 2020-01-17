package org.amalitech.classcode20122019;

import java.util.Scanner;

public class ClassCode20122019_version2 {
	
	static double userAccountBalance;
	
	static String special_search_activator ="0"; 
	
	public static void setUserAccountBalance(double currentUserAccountBalance) {
		userAccountBalance = currentUserAccountBalance;
			
}
		
public static  double getUserAccountBalance()
{
			
       return userAccountBalance;
			
}
		
public static String balanceStmnt(String currency_str) {
			String customerStmnt = "Your account balance is : " + currency_str + "";
			return customerStmnt;
						
}
		
		
		//overloading method tellAccountBalance 
public static void tellUserAccountBalance() {
		//	String customerStmnt = "Your account balance is : $ ";
			System.out.println(balanceStmnt("GHC") + getUserAccountBalance() );
			  
		}
		
public static void tellUserAccountBalance (double accountBal) {
			System.out.println(balanceStmnt("USD") + accountBal);
			
		}
		
public static void tellUserAccountBalance (String currency_str, double accountBal) {
			System.out.println(balanceStmnt (currency_str)+ accountBal);
			
		}
		


	
	static String [] listOfItemsInStore_arr = {
			"Milo",
			"Milk",
			"Gari",
			"Chips",
			"Sugar",
			"This Way",
			"Cowbell",
			"Nido",
			"Mosquito coil",
			"Corn Flakes",
			"Key Soap",
			"Neat fufu",
			"Neat Ab3nkwan",
			"Salted Fish"
	};
 
	static double [] price_of_items = {
			20.00,
			10.00,
			5.00,
			50.00,
			100.00,
			32.00,
			600.00,
			700.00,
			150.00,
			200.00,
			580.00,
			7.00,
			90.00,
			2.00
			
	};
			

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		
		
		double def_acc_bal_d = 580.00;
			setUserAccountBalance(def_acc_bal_d);
			tellUserAccountBalance("GHC ", getUserAccountBalance());
			
			System.out.println("The items currently available are ");
			
			for (int x=0; x<listOfItemsInStore_arr.length; x++) {
				
				System.out.println((x)+ " "+ listOfItemsInStore_arr[x]+ " " + 
						"Price is: GHC " + price_of_items[x]);					
			}
			
			
			System.out.println("Please select an item to buy or press " + special_search_activator + 
					" to cancel");
			String kybd = input.nextLine();
			String purchase_validity = "";
			int index_of_item = Integer.parseInt(kybd)-1;
			
			if (input_checker_validSelection(kybd)) {
				int index_of_items = Integer.parseInt(kybd)-1;
				
				
				
				if (price_of_items [index_of_item ]> userAccountBalance) {
					
					purchase_validity = "Please Topup";	
				}
				else {
					purchase_validity = "Balance is enough. You can buy your item";
				}
				
				
				System.out.println("You chose "+ listOfItemsInStore_arr[index_of_item ]+ 
					" and the price is GHC "+ price_of_items [index_of_item]
					+ " "+purchase_validity			
				
				);
			
			}else {
				if (special_search_activator.equals(kybd))
				
				System.out.println("Please enter the right number");
			}	
			
	}
	
	public static boolean input_checker_validSelection(String userInpt_str) {
		boolean validSel_bool = false;
			for(int x = 0; x<listOfItemsInStore_arr.length;
				x++){
					if(Integer.toString(x+1).equals(userInpt_str)) {
						validSel_bool = true;
						break;
					}
					else {
						validSel_bool = false; }
					
					//return validSel_bool ;
				
	}
			return validSel_bool;
			
	}
	
	}
	

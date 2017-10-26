import javax.swing.JOptionPane;

//import java.util.Scanner;

public class HexDecBin {

	static String messanger;
	//Scanner kbd = new Scanner(System.in);
	String name = "";
	String hex = "";
	String dec = "";
	String bin = "";
	static float num; //Int version of dec 
	
	
	public HexDecBin() {
		
		//System.out.println("Hexidecimal, Decimal and Binary conversion app");
		//System.out.println("Enter name:");
		//name = kbd.nextLine();
		//System.out.println("Nice to meet you, " + name + ", let's begin.");
		
	}
	
	private boolean floatCheck(String inp) {
		try {
			num = Float.parseFloat(inp);
			return true;
		} catch (Exception err) {
			messanger = ( "'" + inp + "' is an invalid entry: " + err);
			JOptionPane.showMessageDialog(null, messanger);
		}
		return false;
	}
	
	public void setBinDec() { 				/////////////////////////////////////////////////BASE: Binary
		bin = JOptionPane.showInputDialog("Enter binary number: ");
		
		if(floatCheck(bin) == true) {
			try  {
				num = Integer.parseInt(bin, 2);
				
				messanger = ("You have entered binary : " + bin);
				JOptionPane.showMessageDialog(null, messanger);
				messanger = ("Decimal value : " + num);
				JOptionPane.showMessageDialog(null, messanger);
			} catch(Exception err) {
				messanger = ("You have entered binary : " + bin);
				JOptionPane.showMessageDialog(null, messanger);
				messanger = (bin + " is not valid: " + err);
				JOptionPane.showMessageDialog(null, messanger);
			}
			
			
			
		}
	}
	
	public void setBinHex() {
		
		bin = JOptionPane.showInputDialog("Enter binary number: ");
		
		if(floatCheck(bin) == true) {
			try  {
				num = Integer.parseInt(bin, 2);
				
				messanger = ("You have entered binary : " + bin);
				JOptionPane.showMessageDialog(null, messanger);
				messanger = ("Hexadecimal value : " + Integer.toHexString((int)num));
				JOptionPane.showMessageDialog(null, messanger);
			} catch(Exception err) {
				messanger = ("You have entered binary : " + bin);
				JOptionPane.showMessageDialog(null, messanger);
				messanger = (bin + " is not valid: " + err);
				JOptionPane.showMessageDialog(null, messanger);
			
			}
		}
	}

	
	public void setDecBin() {				/////////////////////////////////////////////////BASE: Decimal
		
		dec = JOptionPane.showInputDialog("Enter decimal number: ");
		if(floatCheck(dec) == true) {
			try {
				//Holy crap
				num = Float.valueOf(dec);
				
				messanger = ("You have entered decimal : " + dec);
				JOptionPane.showMessageDialog(null, messanger);
				
			} catch(Exception err) {
				messanger = ("You have entered decimal: " + dec);
				JOptionPane.showMessageDialog(null, messanger);
			}
		}
		
	}
	
	public void setDecHex() {
		// TODO Auto-generated method stub
		
		dec = JOptionPane.showInputDialog("Enter decimal number: ");
		try {
			//Holy crap
			num = Float.valueOf(dec);
			
			messanger = ("You have entered decimal : " + dec);
			JOptionPane.showMessageDialog(null, messanger);
			messanger = ("Hexadecimal value : " + Integer.toHexString((int)num));
			JOptionPane.showMessageDialog(null, messanger);
			
		} catch(Exception err) {
			messanger = ("You have entered decimal: " + dec);
			JOptionPane.showMessageDialog(null, messanger);
		}
	}
	
	public void setHexDec() {				/////////////////////////////////////////////////BASE: Hexadecimal
		
		hex = JOptionPane.showInputDialog("Enter hex number: ");
	
		try {
			num = Integer.parseInt(hex, 16);
			messanger = ("You have entered hex : " + hex);
			JOptionPane.showMessageDialog(null, messanger);
			messanger = ("Decimal value : " + num + " " + "(remember 0-" + num+ " has " + (num+1) + " values");
			JOptionPane.showMessageDialog(null, messanger);
		} catch (Exception err) {
			messanger = ("You have entered hex : " + hex + ", and have triggered the following error: " + err);
			JOptionPane.showMessageDialog(null, messanger);
		}
		
	}
	
	public void setHexBin() {
		
		hex = JOptionPane.showInputDialog("Enter hex number: ");
		
		try {
			num = Integer.parseInt(hex, 16);
			messanger = ("You have entered hex : " + hex);
			JOptionPane.showMessageDialog(null, messanger);
		} catch (Exception err) {
			messanger = ("You have entered hex : " + hex + ", and have triggered the following error: " + err);
			JOptionPane.showMessageDialog(null, messanger);
		}
		
	}
	
	public void binConvert() {
		try {
			String binary = Integer.toBinaryString((int)num);
			/*
			System.out.println("Binary value - " + binary);
			System.out.println("number of bits - " + binary.length());
			System.out.println("number of whole nibbles (4 bits) - " + ((binary.length() - (binary.length() % 4)) / 4) + " with " + (binary.length() % 4)  + " left over");
			System.out.println("number of whole bytes (8 bits) - " +  ((binary.length() - (binary.length() % 8)) / 8) + " with " + (binary.length() % 8)  + " left over");
			*/
			
			
			messanger = ("Binary value : " + binary);
			JOptionPane.showMessageDialog(null, messanger);
			messanger = ("number of bits : " + binary.length());
			JOptionPane.showMessageDialog(null, messanger);
			messanger = ("number of whole nibbles (4 bits) : " + ((binary.length() - (binary.length() % 4)) / 4) + " with " + (binary.length() % 4)  + " left over");
			JOptionPane.showMessageDialog(null, messanger);
			messanger = ("number of whole bytes (8 bits) : " +  ((binary.length() - (binary.length() % 8)) / 8) + " with " + (binary.length() % 8)  + " left over");
			JOptionPane.showMessageDialog(null, messanger);
			
			
			
		} catch(Exception err) {
			messanger = ("Binary value could not be calculated for the following reason: " + err);
			JOptionPane.showMessageDialog(null, messanger);
		}
		
		
	}
	public boolean checkForContinue() { //This method is a pile of trash, but it's a functional pile of trash.

		String keepGoing = "y";
		String messanger = "";
		Boolean errorCheck = false;
		Boolean localKeepGoingCheck = true;
		
		while(errorCheck == false) {
			
			messanger = ("Would you like to continue? (y/n)");
			keepGoing = JOptionPane.showInputDialog(messanger);
			keepGoing = keepGoing.toLowerCase(); 
			
			if (keepGoing.equals("y") || keepGoing.equals("yes") || keepGoing.equals("true") || keepGoing.equals("continue")) {
				localKeepGoingCheck = true;
				errorCheck = true;
			} else if (keepGoing.equals("n") || keepGoing.equals("no") || keepGoing.equals("false") || keepGoing.equals("exit") || keepGoing.equals("")) {
				localKeepGoingCheck = false;
				errorCheck = true;
			} else {
				messanger = ("I'm sorry, '" + keepGoing + "' is not a valid answer.");
				JOptionPane.showMessageDialog(null, messanger);
				errorCheck = false;
			} //else
			
		} //while
		return localKeepGoingCheck;
	}



	
	
	
}

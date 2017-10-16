//import java.util.Scanner;

import javax.swing.JOptionPane;

public class BinPower {

	private String messanger;
	//Scanner inp = new Scanner(System.in);
	
	public BinPower() {
		//placeholder
	}
	
	public void setBinary() {
		
		
		String name = "False";
		double exp;
		double base;
		double ans;
		
		
		/*
		String is class. (capitalized)
		double & int is 'primitive' type. (lowercase)
		but Integer (capped) is Class. 
		int =/= Integer
		
		*/
		if (name != "False") {
			name = JOptionPane.showInputDialog("Please Enter Name:");
		
			messanger = ("Thank you for using my program, " + name + ", let's begin.");
			JOptionPane.showMessageDialog(null, messanger);
		}
		
		/*
		System.out.println("Enter base for exponent:");
		try {
			
			base = inp.nextDouble();
			System.out.println("You have entered " + (int) base);
			
		} catch(Exception err){
			System.out.println(err + " - value defaulted to 0.");
			base = 0;
		}
		*/
		try {
			base = Double.valueOf(JOptionPane.showInputDialog("Enter base for exponent:"));
		} catch(Exception err) {
			messanger = (err + " - value defaulted to 0");
			JOptionPane.showMessageDialog(null, messanger);
			base = 0;
		}
		
		try {
			exp = Double.valueOf(JOptionPane.showInputDialog("Enter exponent for " + (int) base + ":"));
		} catch(Exception err) {
			messanger = (err + " - value defaulted to 0");
			JOptionPane.showMessageDialog(null, messanger);
			exp = 0;
		}
		
		
		
		/*
		System.out.println("Enter exponent for " + (int) base + ":");
		try {
			
			exp = inp.nextDouble();
			System.out.println("You have entered " + (int) exp);
			
		} catch(Exception err){
			System.out.println(err + " - value defaulted to 0.");
			exp = 0;
		}
		*/
		
		// (String) Typecasting. really important.
		// Converts variables
		ans = Math.pow(base, exp);
		//System.out.println("Answer is " + (int) (ans + 0.5));
		if (ans >= 2147483647) {
			messanger = ("Answer is too high to calculate");
			JOptionPane.showMessageDialog(null, messanger);
		} else {
			messanger = ("Answer is " + (int) (ans + 0.5));
			JOptionPane.showMessageDialog(null, messanger);
		}
		
		if ((ans % 1) != 0) {
			//System.out.println("Exact answer is " + (ans));
			
			messanger = ("Exact answer is " + (ans));
			JOptionPane.showMessageDialog(null, messanger);
		}
		
		
	}
}

//example file change for git practice

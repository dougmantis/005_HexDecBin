import javax.swing.JOptionPane;

public class RunHere {

	public static void main(String[] args) {
		
		Object[] selections = {"Hex Base Converter", "Decimal Base Converter", "Binary Base Converter", "Exponential calculator", "None"};
		String selection = "None";
		
		//TODO: .setDefaultCloseOperation(EXIT_ON_CLOSE) 
		/**
		 * 1: JOP's (done)
		 * 2: Standalone Jar File (TODO)
		 * 3: Ask for name, repeat name with friendly 'hello' (TODO)
		 * 4: Ask 'what base are we starting with?' (semi-done)
		 * 5: Ask 'what base are we converting to? Hex Dec or Bin' (TODO: ask if current solution is ok)
		 * 6: Enter starting number (done)
		 * 7: Do conversion, display result (done)
		 * 8: Ask if they want to go again (done)
		**/
		
		do {
			selection = (String) JOptionPane.showInputDialog(null, "Make a selection:", "Calculation select", JOptionPane.PLAIN_MESSAGE, null, selections, selection);
			if (selection == "Exponential calculator") {
				BinPower binpower = new BinPower();
				binpower.setBinary();
			}
			
			if (selection == "Hex to Decimal Converter") {
				HexDecBin baseConverter = new HexDecBin();
				baseConverter.setHexDec();
				
			}
			
			if (selection == "Hex to Binary Converter") {
				HexDecBin baseConverter = new HexDecBin();
				baseConverter.setHexBin(); //TODO
				baseConverter.binConvert();
				
			}
			
			if (selection == "Decimal to Binary Converter") {
				HexDecBin baseConverter = new HexDecBin();
				baseConverter.setDecBin();
				baseConverter.binConvert();
			}
			
			if (selection == "Decimal to Hex Converter") {
				HexDecBin baseConverter = new HexDecBin();
				baseConverter.setDecHex();
			}
			
			if (selection == "Binary to Decimal Converter") {
				HexDecBin baseConverter = new HexDecBin();
				baseConverter.setBinDec();
			}
			
			if (selection == "Binary to Hex Converter") {
				HexDecBin baseConverter = new HexDecBin();
				baseConverter.setBinHex(); //TODO
			}
			
			//HexDecBin.varReset();
			
			if(selection != "None") {
				HexDecBin check = new HexDecBin();
				if(check.checkForContinue() == false) {
					selection = "None";
				}
			}
		} while (selection != "None");
	}
	
}
//	--=H_{-}7 
//	 /\


// example file change for git practice.

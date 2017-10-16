import javax.swing.JOptionPane;

public class RunHere {

	public static void main(String[] args) {
		
		Object[] selections = {"Hex Base Converter", "Decimal Base Converter", "Binary Base Converter", "Exponential calculator", "None"};
		String selection = "None";
		
		//TODO: .setDefaultCloseOperation(EXIT_ON_CLOSE)
		
		do {
			selection = (String) JOptionPane.showInputDialog(null, "Make a selection:", "Calculation select", JOptionPane.PLAIN_MESSAGE, null, selections, selection);
			if (selection == "Exponential calculator") {
				BinPower binpower = new BinPower();
				binpower.setBinary();
			}
			
			if (selection == "Hex Base Converter") {
				HexDecBin baseConverter = new HexDecBin();
				baseConverter.setHexNumber();
				baseConverter.binConvert();
			}
			
			if (selection == "Decimal Base Converter") {
				HexDecBin baseConverter = new HexDecBin();
				baseConverter.setDecNumber();
				baseConverter.binConvert();
			}
			
			if (selection == "Binary Base Converter") {
				HexDecBin baseConverter = new HexDecBin();
				baseConverter.setBinNumber();
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

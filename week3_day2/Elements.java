package week3.day2;

public class Elements{

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//TextField
		TextField textfieldOptions=new TextField();
		textfieldOptions.getText();
		textfieldOptions.click();
		textfieldOptions.setText("set textfield");
		

		//Button
		Button buttonOptions=new Button();
		buttonOptions.click();
		buttonOptions.setText("clicked button");
		buttonOptions.submit();


		//RadioButton
		RadioButton radiobuttonOptions = new RadioButton();		
		radiobuttonOptions.selectRadioButton();
		radiobuttonOptions.click();
		radiobuttonOptions.setText("clicked radiobutton");
		radiobuttonOptions.submit();

		//CheckBoxButton
		CheckBoxButton checkOptions = new CheckBoxButton();
		checkOptions.clickCheckButton();
		radiobuttonOptions.click();
		radiobuttonOptions.setText("clicked checkboxbutton");
		radiobuttonOptions.submit();

	}

}

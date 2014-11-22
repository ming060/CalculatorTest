package hello.world;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

//<android-sdk>/tools/android create uitest-project -n <name> -t 1 -p <path>
public class CalculatorTest extends UiAutomatorTestCase{
	
	//adb shell uiautomator runtest <JARS> -c <CLASSES> [options]
	//adb shell uiautomator runtest CalculatorProject.jar
	
	public void testAddFunction() throws UiObjectNotFoundException{
		getUiDevice().pressHome();
		UiObject appsButton = new UiObject(new UiSelector().description("Apps"));
		appsButton.click();

		// 98+45/5-1=
		UiObject nineButton = new UiObject(new UiSelector().resourceId("com.android.calculator2:id/digit9"));
		UiObject eightButton = new UiObject(new UiSelector().resourceId("com.android.calculator2:id/digit8"));
		UiObject plusButton = new UiObject(new UiSelector().resourceId("com.android.calculator2:id/plus"));
		UiObject fourButton = new UiObject(new UiSelector().resourceId("com.android.calculator2:id/digit4"));
		UiObject fiveButton = new UiObject(new UiSelector().resourceId("com.android.calculator2:id/digit5"));
		UiObject divideButton = new UiObject(new UiSelector().resourceId("com.android.calculator2:id/div"));
		UiObject minusButton = new UiObject(new UiSelector().resourceId("com.android.calculator2:id/minus"));
		UiObject oneButton = new UiObject(new UiSelector().resourceId("com.android.calculator2:id/digit1"));
		UiObject equalButton = new UiObject(new UiSelector().resourceId("com.android.calculator2:id/equal"));

		UiObject calculatorApp = new UiObject(new UiSelector().text("Calculator"));
		calculatorApp.clickAndWaitForNewWindow(3000);

		nineButton.click();
		eightButton.click();
		
		plusButton.click();
		
		fourButton.click();
		fiveButton.click();
		
		divideButton.click();
		
		fiveButton.click();
		
		minusButton.click();
		
		oneButton.click();
		
		equalButton.click();
		
		UiObject resultEditText = new UiObject(new UiSelector().className(android.widget.EditText.class));
		String result = resultEditText.getText();

		assertEquals("106", result);
	}
}

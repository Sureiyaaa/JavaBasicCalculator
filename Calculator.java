import java.util.Scanner;
import java.text.DecimalFormat;
import java.
public class Calculator {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    decimalFormat.setGroupingUsed(true);
    decimalFormat.setGroupingSize(3);

	double firstValue, secondValue, result;
	char operator;
	try {
	System.out.println("========Calculator========");
	System.out.println("Enter First Value: ");
	firstValue = scan.nextDouble();

	System.out.println("Enter Second Value: ");
	secondValue = scan.nextDouble();

	System.out.println("+ | Addition\n- | Subtraction\n* | Multiplication\n/ | Division");
	System.out.println("Select a Operator: ");
	operator = scan.next().charAt(0);
	switch(operator) {
	case '+':
		result = firstValue + secondValue;
		System.out.println("Statement: " + decimalFormat.format(firstValue) + " " + operator + " " + decimalFormat.format(secondValue) + "\nResult: " + decimalFormat.format(result));
	break;
	case '-':
		result = firstValue - secondValue;
		System.out.println("Statement: " + decimalFormat.format(firstValue) + " " + operator + " " + decimalFormat.format(secondValue) + "\nResult: " + decimalFormat.format(result));
	break;
	case '*':
		result = firstValue * secondValue;
		System.out.println("Statement: " + decimalFormat.format(firstValue) + " " + operator + " " + decimalFormat.format(secondValue) + "\nResult: " + decimalFormat.format(result));
	break;
	case '/':
		result = firstValue / secondValue;
		System.out.println("Statement: " + decimalFormat.format(firstValue) + " " + operator + " " + decimalFormat.format(secondValue) + "\nResult: " + decimalFormat.format(result));
	break;
	default:
		System.out.println("Please Select a valid operator.");
	break;
	}
	}catch(Exception err) {
		System.out.println(err.getMessage());
	}
	}

}

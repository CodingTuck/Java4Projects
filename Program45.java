package tucker4;


public class Program45 {
	//Mitchell Tucker SPC ID#2429488
	//This program calculates the total price of a VR headset and outputs the totals
	public static void main(String[] args) {
		
		String item = "VR Headset";
		String dept = "E";
		boolean taxable = true;
		double quantity = 2;
		double total = 399.99;
		double subTotal= quantity * total;
		double tax = .07;
		double salesTax = tax * subTotal;
		double amountDue = (subTotal * tax) + subTotal;
		
		System.out.printf("Purchase: %s, quantity %.0f @ %.2f", item, quantity, total);
		System.out.println();
		System.out.printf("Dept %s, taxable? %b", dept, taxable);
		System.out.println();
		System.out.printf("Subtotal $%.2f", subTotal);
		System.out.println();
		System.out.printf("7 %% sales tax is $%.2f", salesTax);
		System.out.println();
		System.out.printf("Total payable $%.2f", amountDue);
	
	}

}

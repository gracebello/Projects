import java.util.Scanner;

public class ClassCalc {
	public static void main(String [] args) {

//This program is to calculate the refund of my Fall 2019 semester at OU, while also factoring in potential overtime hours I can work at Crossroads.
     Scanner sc = new Scanner(System.in);
	System.out.println("This program is to calculate the refund of my Fall 2019 semester at OU, while also factoring in potential overtime hours I can work at Crossroads.");
    System.out.println("Please input the total cost of the Fall 19 semester.");
		double totalCostWithoutRoom = sc.nextDouble();
			double totalCost = totalCostWithoutRoom - 4464;
			System.out.println("The total cost is " + totalCostWithoutRoom);
			System.out.println("The total cost with the Room and Board work program is " + totalCost);
	System.out.println("Please input the extra hours to work per week,at a rate of 9.50$/hr.");
		double hoursWorked = sc.nextDouble();
			double extraMoney = hoursWorked * 16 * 9.50;
				System.out.println("The amount of extra money to be earned is " + extraMoney);
			double financialAid = 8869;
			double variableName = financialAid - totalCost;
			double totalIncome = extraMoney + variableName;
		System.out.println("The total income, over the spread of the Fall 19 semester, will be " + totalIncome);
					




 }

  }


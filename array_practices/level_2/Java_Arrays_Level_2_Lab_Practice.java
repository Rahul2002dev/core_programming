// package week1_Assignment5;
import java.util.*;

public class Java_Arrays_Level_2_Lab_Practice {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		
        // final int EMPLOYEES = 10;
        // double[] salary = new double[EMPLOYEES];
        // int[] yearsOfService = new int[EMPLOYEES];
        // double[] bonus = new double[EMPLOYEES];
        // double[] newSalary = new double[EMPLOYEES];

        // double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // for (int i = 0; i < EMPLOYEES; i++) {
        //     System.out.print("Enter salary for employee " + (i + 1) + ": ");
        //     double sal = scanner.nextDouble();
        //     System.out.print("Enter years of service for employee " + (i + 1) + ": ");
        //     int years = scanner.nextInt();

        //     if (sal <= 0 || years < 0) {
        //         System.out.println("Invalid input. Please enter valid values.");
        //         i--; 
        //         continue;
        //     }

        //     salary[i] = sal;
        //     yearsOfService[i] = years;
        // }

        // for (int i = 0; i < EMPLOYEES; i++) {
        //     bonus[i] = (yearsOfService[i] > 5) ? salary[i] * 0.05 : salary[i] * 0.02;
        //     newSalary[i] = salary[i] + bonus[i];

        //     totalBonus += bonus[i];
        //     totalOldSalary += salary[i];
        //     totalNewSalary += newSalary[i];
        // }

        // System.out.println("Total Bonus Payout: " + totalBonus);
        // System.out.println("Total Old Salary: " + totalOldSalary);
        // System.out.println("Total New Salary: " + totalNewSalary);
        
        
        
        
        
        
        
        // // Youngest and tallest
        // String[] names = {"Amar", "Akbar", "Anthony"};
        // int[] ages = new int[3];
        // double[] heights = new double[3];

        // for (int i = 0; i < 3; i++) {
        //     System.out.print("Enter age of " + names[i] + ": ");
        //     ages[i] = scanner.nextInt();
        //     System.out.print("Enter height of " + names[i] + " (in cm): ");
        //     heights[i] = scanner.nextDouble();
        // }

        // int youngestIndex = 0, tallestIndex = 0;

        // for (int i = 1; i < 3; i++) {
        //     if (ages[i] < ages[youngestIndex]) {
        //         youngestIndex = i;
        //     }
        //     if (heights[i] > heights[tallestIndex]) {
        //         tallestIndex = i;
        //     }
        // }

        // System.out.println("Youngest Friend: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        // System.out.println("Tallest Friend: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");
        
        
        
        
        
        
        
        
        
        // // First Largest and second largest
        // System.out.print("Enter a number: ");
        // int number = scanner.nextInt();

        // int[] digits = new int[10];
        // int index = 0;

        // while (number != 0 && index < 10) {
        //     digits[index++] = number % 10;
        //     number /= 10;
        // }

        // if (index == 0) {
        //     System.out.println("No digits entered.");
        //     return;
        // }

        // int largest = digits[0], secondLargest = -1;

        // for (int i = 1; i < index; i++) {
        //     if (digits[i] > largest) {
        //         secondLargest = largest;
        //         largest = digits[i];
        //     } else if (digits[i] > secondLargest && digits[i] != largest) {
        //         secondLargest = digits[i];
        //     }
        // }

        // System.out.println("Largest Digit: " + largest);
        // System.out.println("Second Largest Digit: " + (secondLargest == -1 ? "Not available" : secondLargest));
        
        
        
        
        
        
        
        
        
        // // First and second largest with with dynamic array
        // System.out.print("Enter a number: ");
        // int number7 = scanner.nextInt();

        // int maxDigit = 10;
        // int[] digits1 = new int[maxDigit];
        // int index2 = 0;

        // while (number7 != 0) {
        //     if (index2 == maxDigit) {
        //         maxDigit += 10;
        //         int[] temp = new int[maxDigit];
        //         System.arraycopy(digits1, 0, temp, 0, digits1.length);
        //         digits1 = temp;
        //     }
        //     digits1[index2++] = number7 % 10;
        //     number7 /= 10;
        // }

        // if (index2 == 0) {
        //     System.out.println("No digits entered.");
        //     return;
        // }

        // int largest1 = digits1[0], secondLargest1 = -1;

        // for (int i = 1; i < index2; i++) {
        //     if (digits1[i] > largest1) {
        //         secondLargest1 = largest1;
        //         largest1 = digits1[i];
        //     } else if (digits1[i] > secondLargest1 && digits1[i] != largest1) {
        //         secondLargest1 = digits1[i];
        //     }
        // }

        // System.out.println("Largest Digit: " + largest1);
        // System.out.println("Second Largest Digit: " + (secondLargest1 == -1 ? "Not available" : secondLargest1));
        
        
        
        
        
        
        
        
        
        
        // // Reverse a number
        // System.out.print("Enter a number: ");
        // int number8 = scanner.nextInt();
        // int temp = number8;
        // int count = 0;

        // while (temp != 0) {
        //     count++;
        //     temp /= 10;
        // }

        // int[] digits2 = new int[count];
        // temp = number8;
        // for (int i = 0; i < count; i++) {
        //     digits2[i] = temp % 10;
        //     temp /= 10;
        // }

        // System.out.print("Reversed Number: ");
        // for (int i = 0; i < count; i++) {
        //     System.out.print(digits2[i]);
        // }
        // System.out.println();

        
        
        
        
        
        
        // BMI Calculator
        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        double[] weight = new double[numPersons];
        double[] height = new double[numPersons];
        double[] bmi = new double[numPersons];
        String[] weightStatus = new String[numPersons];

        for (int i = 0; i < numPersons; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            weight[i] = scanner.nextDouble();
            System.out.print("Enter height (m) of person " + (i + 1) + ": ");
            height[i] = scanner.nextDouble();

           bmi[i]  = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi[i] >= 25 && bmi[i] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nBMI Report:");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("Person %d: Height = %.2f m, Weight = %.2f kg, BMI = %.2f, Status = %s\n",
                    (i + 1), height[i], weight[i], bmi[i], weightStatus[i]);
        }
        
        
        
        
        
        
        
    //     // BMI calculator 2D
    //     System.out.print("Enter the number of persons: ");
    //     int number1 = scanner.nextInt();

    //     double[][] personData = new double[number1][3]; // Stores weight, height, and BMI
    //     String[] weightStatus1 = new String[number1];

    //     for (int i = 0; i < number1; i++) {
    //         double weight1, height1;
            
    //         // Input validation for weight
    //         do {
    //             System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
    //             weight1 = scanner.nextDouble();
    //         } while (weight1 <= 0);

    //         // Input validation for height
    //         do {
    //             System.out.print("Enter height (m) of person " + (i + 1) + ": ");
    //             height1 = scanner.nextDouble();
    //         } while (height1 <= 0);

    //         double bmi1 = weight1 / (height1 * height1);
            
    //         personData[i][0] = weight1;
    //         personData[i][1] = height1;
    //         personData[i][2] = bmi1;

    //         if (bmi1 < 18.5) {
    //             weightStatus1[i] = "Underweight";
    //         } else if (bmi1 >= 18.5 && bmi1 < 24.9) {
    //             weightStatus1[i] = "Normal weight";
    //         } else if (bmi1 >= 25 && bmi1 < 29.9) {
    //             weightStatus1[i] = "Overweight";
    //         } else {
    //             weightStatus1[i] = "Obese";
    //         }
    //     }

    //     System.out.println("\nBMI Report:");
    //     for (int i = 0; i < number1; i++) {
    //         System.out.printf("Person %d: Weight = %.2f kg, Height = %.2f m, BMI = %.2f, Status = %s\n",
    //                 (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus1[i]);
    //     }
        
        
        
        
        
        
        
    //     // Student grade calculation
    //     System.out.print("Enter number of students: ");
    //     int numStudents = scanner.nextInt();
        
        
    //     int[] physics = new int[numStudents];
    //     int[] chemistry = new int[numStudents];
    //     int[] maths = new int[numStudents];
    //     double[] percentage = new double[numStudents];
    //     String[] grade = new String[numStudents];

    //     for (int i = 0; i < numStudents; i++) {
    //         int phy, chem, math;

    //         // Input validation for Physics
    //         do {
    //             System.out.print("Enter Physics marks for Student " + (i + 1) + ": ");
    //             phy = scanner.nextInt();
    //         } while (phy < 0);

    //         // Input validation for Chemistry
    //         do {
    //             System.out.print("Enter Chemistry marks for Student " + (i + 1) + ": ");
    //             chem = scanner.nextInt();
    //         } while (chem < 0);

    //         // Input validation for Math
    //         do {
    //             System.out.print("Enter Maths marks for Student " + (i + 1) + ": ");
    //             math = scanner.nextInt();
    //         } while (math < 0);

    //         physics[i] = phy;
    //         chemistry[i] = chem;
    //         maths[i] = math;

    //         percentage[i] = (phy + chem + math) / 3.0;

    //         if (percentage[i] >= 90) {
    //             grade[i] = "A";
    //         } else if (percentage[i] >= 80) {
    //             grade[i] = "B";
    //         } else if (percentage[i] >= 70) {
    //             grade[i] = "C";
    //         } else if (percentage[i] >= 60) {
    //             grade[i] = "D";
    //         } else {
    //             grade[i] = "F";
    //         }
    //     }

    //     System.out.println("\nStudent Report:");
    //     for (int i = 0; i < numStudents; i++) {
    //         System.out.printf("Student %d: Physics = %d, Chemistry = %d, Maths = %d, Percentage = %.2f%%, Grade = %s\n",
    //                 (i + 1), physics[i], chemistry[i], maths[i], percentage[i], grade[i]);
    //     }
        
        
        
        
        
        
        
        
        
    //     // Student grade calculation using 2D
        
    //     System.out.print("Enter number of students: ");
    //     int numStudents1 = scanner.nextInt();

    //     int[][] marks = new int[numStudents1][3]; // [Physics, Chemistry, Maths]
    //     double[] percentage1 = new double[numStudents1];
    //     String[] grade1 = new String[numStudents1];

    //     for (int i = 0; i < numStudents1; i++) {
    //         for (int j = 0; j < 3; j++) {
    //             String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                
    //             do {
    //                 System.out.print("Enter " + subject + " marks for Student " + (i + 1) + ": ");
    //                 marks[i][j] = scanner.nextInt();
    //             } while (marks[i][j] < 0);
    //         }

    //         percentage1[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

    //         if (percentage1[i] >= 90) {
    //             grade1[i] = "A";
    //         } else if (percentage1[i] >= 80) {
    //             grade1[i] = "B";
    //         } else if (percentage1[i] >= 70) {
    //             grade1[i] = "C";
    //         } else if (percentage1[i] >= 60) {
    //             grade1[i] = "D";
    //         } else {
    //             grade1[i] = "F";
    //         }
    //     }

    //     System.out.println("\nStudent Report:");
    //     for (int i = 0; i < numStudents1; i++) {
    //         System.out.printf("Student %d: Physics = %d, Chemistry = %d, Maths = %d, Percentage = %.2f%%, Grade = %s\n",
    //                 (i + 1), marks[i][0], marks[i][1], marks[i][2], percentage1[i], grade1[i]);
    //     }
        
        
        
        
        
        
        
        
        
        
        
    //     //	Digit frequency
    //     System.out.print("Enter a number: ");
    //     long number9 = scanner.nextLong();

    //     int[] frequency = new int[10];


    //     long temp1 = number9;
    //     while (temp1 > 0) {
    //         int digit = (int) (temp1 % 10); 
    //         frequency[digit]++; 
    //         temp1 /= 10; 
    //     }

    //     System.out.println("\nDigit Frequency:");
    //     for (int i = 0; i < 10; i++) {
    //         if (frequency[i] > 0) {
    //             System.out.println("Digit " + i + ": " + frequency[i] + " times");
    //         }
    //     }

        
        
 
    //     scanner.close();

	}

}

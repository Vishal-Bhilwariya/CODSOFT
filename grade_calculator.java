//  <<<<<<<<<<<<<<<<     TASK 2 - STUDENT  GRADE CALCULATOR    >>>>>>>>>>>>>>>>>
// Input: Take marks obtained (out of 100) in each subject.
// Calculate Total Marks: Sum up the marks obtained in all subjects.
// Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
// average percentage.
// Grade Calculation: Assign grades based on the average percentage achieved.
// Display Results: Show the total marks, average percentage, and the corresponding grade to the user.

/*
 * I thrilled to share that , I have completed my Task ( Student Grade Calculator using java) as JAVA DEVELOPMENT INTERN AT CodSoft.



#️⃣ TASK - STUDENT  GRADE CALCULATOR  

1)Input: Take marks obtained (out of 100) in each subject.

2) Calculate Total Marks: Sum up the marks obtained in all subjects.

3) Calculate Average Percentage: Divide the total marks by the total number of subjects to get the average percentage.

4)Grade Calculation: Assign grades based on the average percentage achieved.

5)Display Results: Show the total marks, average percentage, and the corresponding grade to the user.





#internship

#codsoft

#online

#java

#development


 */

import java.util.*;
public class grade_calculator{
    public static void printarr(int arr[]){
        System.out.print("SUBJECT MARKS(P,C,M,E,H) => ");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[]args){
        System.out.println("---------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        int ar[] = new int[5] ; 

        System.out.println("............................................");
        // input marks of each subject
        System.out.print("Enter physics marks : ");
        ar[0] = sc.nextInt();
        System.out.print("Enter chemistry marks : ");
        ar[1] = sc.nextInt();
        System.out.print("Enter mathematics marks : ");
        ar[2] = sc.nextInt();
        System.out.print("Enter english marks : ");
        ar[3] = sc.nextInt();
        System.out.print("Enter hindi marks : ");
        ar[4] = sc.nextInt();

        // adding all subject marks
        int sum = 0;
        for(int i=0;i<ar.length;i++){
            sum += ar[i];
        }

        // average percentage
        int avg_per = sum / 5 ;

        String Grade = "";
        // grade assigning
        if(avg_per >= 90){
            Grade = "O";
        }
        else if (avg_per>=80){
            Grade = "A+";
        }
        else if (avg_per>=70){
            Grade = "A";
        }
        else if (avg_per>=60){
            Grade = "B+";
        }
        else if (avg_per>=50){
            Grade = "B";
        }
        else if (avg_per>=40){
            Grade = "C";
        }
        else{
            Grade = "F";
        }
        System.out.println("............................................");

        System.out.println(" <<< FINAL RESULT >>> ");
        printarr(ar);
        System.out.println("\nTOTAL MARKS => "+sum);
        System.out.println("Average percentage => "+avg_per+"%");
        System.out.println("Grade => "+Grade);

        System.out.println("---------------------------------------------------------");
    }
}
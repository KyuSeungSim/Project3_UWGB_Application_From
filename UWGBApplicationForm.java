// Project 1
// KYU SEUNG SIM
// Dr. Elliot
// COMP SCI 256-0800
// JUN 19, 2020

import java.util.*; 

public class UWGBApplicationForm {

  public static String applySemester(int selectNumber) {

    String f2020 = "2020 Fall Semester";
    String s2021 = "2021 Spring Semester";
    String f2021 = "2021 Fall Semester";
    String error = "Invalid Input!";

    if(selectNumber == 1) {
      return f2020;
    } else if (selectNumber == 2) {
      return s2021;
    } else if (selectNumber == 3) {
      return f2021;
    }
      return error;
  }

  public static String addmission(int selectNumber) {

    String freshman = "Freshman";
    String transfer = "Transfer";
    String error = "Invalid Input!";

    if(selectNumber == 1) {
      return freshman;
    } else if (selectNumber == 2) {
      return transfer;
    } 
      return error;
  }

  public static String gradeLevel(int selectNumber) {

    String y1 = "Freshman";
    String y2 = "Sophomore";
    String y3 = "Junior";
    String y4 = "Senior";
    String error = "Invalid Input!";

    if(selectNumber == 1) {
      return y1;
    } else if (selectNumber == 2) {
      return y2;
    } else if (selectNumber == 3) {
      return y3;
    } else if (selectNumber == 4) {
      return y4;
    }
      return error;
  }


  public static void main(String[] args) {

    Scanner user_input_int = new Scanner(System.in);
    Scanner user_input_string = new Scanner(System.in);

    System.out.println("This is UW-Green Bay Application ");
    System.out.println();    

    System.out.println("1: 2020 Fall \n2: 2021 Spring \n3: 2021 Fall");
    System.out.print("Select Application Semester: ");
    int user_select_semester = user_input_int.nextInt();  
    System.out.println();  

    System.out.println("1: Freshman \n2: Transfer");
    System.out.print("Select Addmission Status: ");
    int user_select_addmission = user_input_int.nextInt();  
    System.out.println();  

    System.out.println("1: Freshman \n2: Sophomore \n3: Junior \n4: Senior");
    System.out.print("Select Grade Level: ");
    int user_select_grade = user_input_int.nextInt();  
    System.out.println();  

    System.out.println("EX) Sim");
    System.out.print("Enter Your Last Name: ");
    String user_last_name = user_input_string.nextLine();
    System.out.println();  

    System.out.println("EX) Sammy");
    System.out.print("Enter Your First Name: ");    
    String user_first_name = user_input_string.nextLine();
    System.out.println();  

    System.out.println("EX) Computer Science");
    System.out.print("Enter Your Major: ");
    String user_major = user_input_string.nextLine();
    System.out.println();  

    System.out.println("EX) 000-000-0000");
    System.out.print("Enter Your Phone Number: ");    
    String user_phone_number = user_input_string.nextLine();
    System.out.println();  

    System.out.println("EX) sammy1234@gmail.com");
    System.out.print("Enter Your Email: ");
    String user_email = user_input_string.nextLine();
    System.out.println();          


    System.out.println("\n\n\n\n");


    System.out.println("Please Double Check Before Submit");
    System.out.println();
    System.out.println("UW-Green Bay " + applySemester(user_select_semester) + " Semester Application");
    System.out.println("Addmission Status: " + addmission(user_select_addmission));
    System.out.println("Grade Level: " + gradeLevel(user_select_grade));
    System.out.println("Last Name: " + user_last_name);
    System.out.println("First Name: " + user_first_name);
    System.out.println("Major: " + user_major);
    System.out.println("Phone Number: " + user_phone_number);
    System.out.println("Email: " + user_email);            

  }
}

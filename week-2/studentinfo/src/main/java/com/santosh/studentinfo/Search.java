package com.santosh.studentinfo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This method is used for searching the student data.
 * @version 1.0 29 June 2018
 * @author santosh
 */

public class Search {
  /**
   * Creating an array of Students using Array List class. 
   */
  private static ArrayList<Student> students;
  
  /**
   * Creating a Scanner object to take input.
   */

  private static Scanner readInput;

  /**
     * Constructor.
     * @param data - Student details.
     */
  Search(final ArrayList<Student> data) {
    Search.students = data;
  }

  /**
     *SearchData method which is used to search
     *data based on given category.
     */
  public void searchData() {
    System.out.println("Please select your search category\n 1.StudentID\n2.First Name\n "
        + "3.Last Name \n 4.Department\n 5.Year of Study");
    int choice = readInput.nextInt();
    switch (choice) {
      case 1: Search.basedOnId();
              break;
      case 2: Search.basedOnFirstName();
              break;
      case 3: Search.basedOnLastName();
              break;
      case 4: Search.basedOnDepartment();
              break;
      case 5: Search.basedOnYear();
              break;
      default: System.out.println("Invalid choice");
    }
  }

  /**
     * Search data based on StudentID.
     */
  public static void basedOnId() {
    System.out.println("Please enter StudentID");
    int inputId = readInput.nextInt();

    for (Student student : students) {
      if (inputId == student.getId()) {
        System.out.println(student);
      }
    }
  }
  /**
     * Search based on First Name.
     */
  
  public static void basedOnFirstName() {
    System.out.println("Please enter First name");
    String inputName = readInput.next();

    for (Student student : students) {
      if (inputName.equalsIgnoreCase(student.getFirstName())) {
        System.out.println(student);
      }
    }
  }

  /**
     * Search data based on Last Name.
     */
  
  public static void basedOnLastName() {
    System.out.println("Please enter Last name");
    String inputName = readInput.next();

    for (Student student : students) {
      if (inputName.equalsIgnoreCase(student.getLastName())) {
        System.out.println(student);
      }
    }
  }
  /**
     * Search data based on Department.
     */
  
  public static void basedOnDepartment() {
    System.out.println("Please enter Department");
    String inputDept = readInput.next();

    for (Student student : students) {
      if (inputDept.equalsIgnoreCase(student.getDept())) {
        System.out.println(student);
      }
    }
  }

  /**
     * Search based on Year.
     */
  
  public static void basedOnYear() {
    System.out.println("Please enter Year");
    int inputYear = readInput.nextInt();

    for (Student student : students) {
      if (inputYear == student.getYear()) {
        System.out.println(student);
      }
    }
  }
}


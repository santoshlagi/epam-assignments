package com.santosh.studentinfo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Reading Data From CSV file.
 * @version 1.0 29 June 2018
 * @author santosh
 */
public class App {
  /**
  * Main Method.
  * @param args input
  */
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    /**
     * Creating a scanner object to read input.
     */
    final Scanner readInput = new Scanner(System.in);
    
    /**
     * Creating a string variable for reading input file path.
     */
    String inputFileName = readInput.nextLine(); 
    
    /**
     * Creating a array to read data from file.
     */
    
    ArrayList<Student> studentDetails = App.getData(inputFileName);
    System.out.println("Enter your options \n 1.Search \n 2.Sort");
    int option = readInput.nextInt();

    switch (option) {
      case 1: Search searchData = new Search(studentDetails);
                searchData.searchData();
                break;
      case 2: Sort sortData = new Sort(studentDetails);
                sortData.sortData();
                break;
      default: System.out.println("Invalid Choice");
    }
  }
  /**
   * Storing Students Data In ArrayList.
   * @param inputFileName taking file name as input
   * @return
   */
  
  private static ArrayList<Student> getData(final String inputFileName) {
    ArrayList<Student> studentsData = new ArrayList<>();
    FileReader readInputFile = null;
    try {
      readInputFile = new FileReader(inputFileName);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    BufferedReader readData = new BufferedReader(readInputFile);
    try {
      String line = readData.readLine();
      while (line != null) {
        String[] attributes = line.split(",");
        Student student = App.createStudent(attributes);
        studentsData.add(student);
        line = readData.readLine();
      }
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }
    return studentsData;
  }
  /**
   * Creating the list of students.
   * @param studentData list of student attributes
   * @return
   */
  
  private static Student createStudent(final String[] studentData) {

    int index = 0;
    int studentId = Integer.parseInt(studentData[index++]);
    String firstName = studentData[index++];
    String lastName = studentData[index++];
    String dept = studentData[index++];
    int yearOfStudy = Integer.parseInt(studentData[index++]);
    return new Student(studentId, firstName, lastName, dept, yearOfStudy);
  }

  
}

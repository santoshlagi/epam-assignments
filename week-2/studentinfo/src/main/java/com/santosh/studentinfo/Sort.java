package com.santosh.studentinfo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * This method is used for sorting the student data.
 * @version 1.0 29 June 2018
 * @author santosh
 */
public class Sort {
  /**
  * Creating an array of Students using Array List class. 
  */

  private static ArrayList<Student> students;
  
  /**
   * Creating a scanner object to take input.
   */
  
  private static Scanner readInput;

  /**
     * Constructor.
     * @param data Student details.
     */
  Sort(final ArrayList<Student> data) {
    Sort.students = data;
  }

  /**
     *SortData method is used to sort the students based on the given category.
     */
  public void sortData() {
    System.out.println("Please select your sort category\n 1.StudentID \n 2.First Name\n"
        + " 3.Last Name \n 4.Department \n 5.Year of Study");
    int choice = readInput.nextInt();
    switch (choice) {

      case 1: Sort.basedOnId();
                    break;
      case 2: Sort.basedOnFirstName();
                    break;
      case 3: Sort.basedOnLastName();
                    break;
      case 4: Sort.basedOnDepartment();
                    break;
      case 5: Sort.basedOnYear();
                    break;
      default: System.out.println("Invalid choice");
    }
  }

  /**
     * Sort based on StudentID.
     */
  public static void basedOnId() {
    System.out.println("Please Choose:");
    System.out.println(" 1.Ascending Order \n 2.Descending Order");
    int choice = readInput.nextInt();

    switch (choice) {
      case 1: Collections.sort(students, new Comparator<Object>() {
            public int compare(Student o1,Student o2) {
              return o1.getId() - o2.getId();
            }
      });
        for (Student student : students) {
          System.out.println(student);
        }
             break;
      case 2: Collections.sort(students, new Comparator<Object>() {
            public int compare(Student o1,Student o2) {
              return o2.getId() - o1.getId();
            }
      });
        for (Student student : students) {
          System.out.println(student);
        }
             break;
      default: System.out.println("Invalid choice");
    }

  }

  /**
     * Sort based on First Name.
     */
  public static void basedOnFirstName() {
    System.out.println("Please Choose:");
    System.out.println(" 1.Ascending Order \n 2.Descending Order");
    int choice = readInput.nextInt();

    switch (choice) {
      case 1: Collections.sort(students, new Comparator<Object>() {
            public int compare(Student o1,Student o2) {
              return o1.getFirstName().compareTo(o2.getFirstName());
        }
      });
        for (Student student : students) {
          System.out.println(student);
        }
              break;
      case 2: Collections.sort(students, new Comparator<Object>() {
            public int compare(Student o1,Student o2) {         
              return o2.getFirstName().compareTo(o1.getFirstName());
        }
      });
        for (Student student : students) {
          System.out.println(student);
        }
               break;

      default: System.out.println("Invalid choice");
    }


  }

  /**
     * Sort based on Last Name.
     */
  public static void basedOnLastName() {
    System.out.println("Please Choose:");
    System.out.println(" 1.Ascending Order \n 2.Descending Order");
    int choice = readInput.nextInt();

    switch (choice) {
      case 1: Collections.sort(students, new Comparator<Object>() {
            public int compare(Student o1,Student o2) {
              return o1.getLastName().compareTo(o2.getLastName());
        }
      });
        for (Student student : students) {
          System.out.println(student);
        }
              break;
      case 2: Collections.sort(students, new Comparator<Object>() {
            public int compare(Student o1,Student o2) {
              return o2.getLastName().compareTo(o1.getLastName());
        }
      });
        for (Student student : students) {
          System.out.println(student);
        }
              break;

      default: System.out.println("Invalid choice");
    }
  }
  /**
     * Sort based on Department.
     *
     */
  
  public static void basedOnDepartment() {
    System.out.println("Please Choose:");
    System.out.println(" 1.Ascending Order \n 2.Descending Order");
    int choice = readInput.nextInt();

    switch (choice) {
      case 1: Collections.sort(students, new Comparator<Object>() {
            public int compare(Student o1,Student o2) {
              return o1.getDept().compareTo(o2.getDept());
        }
      });
        for (Student student : students) {
          System.out.println(student);
        }
               break;
      case 2: Collections.sort(students, new Comparator<Object>() {
            public int compare(Student o1,Student o2) {
              return o2.getDept().compareTo(o1.getDept());
        }
        });
        for (Student student : students) {
          System.out.println(student);
        }
               break;

      default: System.out.println("Invalid choice");
    }
  }

  /**
     * Sort based on Year.
     */
  public static void basedOnYear() {
    System.out.println("Please Choose:");
    System.out.println(" 1.Ascending Order \n 2.Descending Order");
    int choice = readInput.nextInt();

    switch (choice) {
      case 1: Collections.sort(students, new Comparator<Object>() {
        public int compare(Student o1,Student o2) {
          return o1.getYear() - o2.getYear();
        }
        });
        for (Student student : students) {
          System.out.println(student);
        }
              break;
      case 2: Collections.sort(students, new Comparator<Object>() {
          public int compare(Student o1,Student o2) {
            return o2.getYear() - o1.getYear();
        }
        });
        for (Student student : students) {
          System.out.println(student);
        }
                    break;
      default: System.out.println("Invalid choice");
    }
  }
}



package com.santosh.studentinfo;

/**
 * Initializing variables using getter setter methods.
 * @version 1.0 29 June 2018
 * @author santosh
 */

public final class Student {
  /**
   * Creating a variable for student ID.
   */
  
  private int idOfStudent;
  
  /**
   * Creating a variable for student first name.
   */
  
  private String firstNameOfStudent;
  
  /**
   * Creating a variable for student last name.
   */
  
  private String lastNameOfStudent;
  
  /**
   * Creating a variable for student department .
   */
  
  private String deptOfStudent;
  
  /**
   * Creating a variable for student year of study.
   */
  
  private int yearOfStudent;
  


  /**
   * Student constructor.
   * @param id - id of Student
   * @param firstName - firstName of Student
   * @param lastName - lastName of Student
   * @param dept - department of Student
   * @param yearOfStudy - yearOfStudy of Student
   */
  Student(final int id, final String firstName, final String lastName, final String dept,
      final int yearOfStudy) {

    this.idOfStudent = id;
    this.firstNameOfStudent = firstName;
    this.lastNameOfStudent = lastName;
    this.deptOfStudent = dept;
    this.yearOfStudent = yearOfStudy;
  }


  /**
     * Gives the studentID.
     * @return id of Student
     */
  public Integer getId() {
    return idOfStudent;
  }

  /**
     * Gives the student First name.
     * @return firstName of Student
     */
  public String getFirstName() {
    return firstNameOfStudent;
  }

  /**
     * gives student last name.
     * @return lastName of Student
     */
  public String getLastName() {
    return lastNameOfStudent;
  }


  /**
     * gives department name.
     * @return department of Student
     */
  public String getDept() {
    return deptOfStudent;
  }

  /**
     * gives the year of study.
     * @return year of Student
     */
  public int getYear() {
    return yearOfStudent;
  }
}

package EITS;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *@author Brayden 2101560216
 *@purpose This is a class that displays a list of courses in the clientCourseListAdmin_GUI intended for Admins.
 *@version control 1.0
 *@date 10/06/2018
 */
public class CourseList {
    
  private int id;
  
  private int industries_id;

  private String code;
          
  private String title; 
  
  public CourseList(int ID, int industries_id, String code, String title){
      
      this.id = ID;
      this.industries_id = industries_id;
      this.code = code;
      this.title = title; 
  } 

    CourseList(String string, String string0, int aInt, String string1, int aInt0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
public int getID() {
    return id; 
 }

public int getIndustryID() {
    return industries_id; 
 }
  
public String getCode() {
    return code; 
  }
  
public String getTitle() {
    return title; 
  }
}

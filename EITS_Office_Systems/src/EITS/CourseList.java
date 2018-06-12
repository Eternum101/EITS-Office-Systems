package EITS;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brayden
 */
public class CourseList {
  private int id;
  
  private int industries_id;

  private String code, title;
  
  public CourseList(int ID, int industries_id, String code, String title){
      
      this.id = ID;
      this.industries_id = industries_id; 
      this.code = code;
      this.title = title; 
  } 
  
public int getID() {
    return id; 
 }

public void setID(int ID) {
    this.id = ID;
}

public int getIndustryID() {
    return industries_id; 
 }

public void setIndustryID(int industries_id) {
    this.industries_id = industries_id;
}
  
public String getCode() {
    return code; 
  }

public void setCode(String code) {
    this.code = code; 
}
  
public String getTitle() {
    return title; 
  }

public void setTitle() {
    this.title = title; 
}
}

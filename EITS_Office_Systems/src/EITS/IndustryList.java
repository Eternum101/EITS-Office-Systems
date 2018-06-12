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
public class IndustryList {
  private int ID; 

  private String industryDesc;

  public IndustryList(int ID, String industryDesc){
      
      this.ID = ID; 
      this.industryDesc = industryDesc; 
  } 
  
   public int getID() {
      return ID; 
 }
  
  public String getindustryDesc() {
      return industryDesc; 
  }
}

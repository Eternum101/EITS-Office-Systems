package EITS;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *@author Alex 7105395517
 *@purpose This is a class that displays a list of industries in the clientIndustryListAdmin_GUI intended for Admins.
 *@version control 1.0
 *@date 10/06/2018
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

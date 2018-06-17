package EITS;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *@author Jakob 2104990817, Brayden 2101560216,  Alex 7105395517
 *@purpose This shows a list of the users in the caseworker tab.
 *@version control 1.0
 *@date 10/06/2018
 */
public class CaseWorker_UserList {
  private int userID; 

  private String FirstName, LastName, Email;

  public CaseWorker_UserList(int userID, String fName, String lName, String email){
      
      this.userID = userID; 
      this.FirstName = fName;
      this.LastName = lName; 
      this.Email = email; 
  }

    CaseWorker_UserList(int aInt, String string, String string0, String string1, String string2, String string3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
  public int getuserID() {
      return userID; 
 }
  
  public String getFirstName() {
      return FirstName; 
  }
  
  public String getLastName() {
      return LastName; 
  }
  
  public String getEmail() {
      return Email; 
  }
  
}

package EITS;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *@author Jakob 2104990817, Brayden 2101560216,  Alex 7105395517
 *@purpose This is a class that displays a list of users in the clientData_GUI intended for Admins.
 *@version control 1.0
 *@date 10/06/2018
 */
public class UserList {
    
  private int userID; 

  private String FirstName, LastName, Email, Password;

  public UserList(int userID, String fName, String lName, String email, String password){
      
      this.userID = userID; 
      this.FirstName = fName;
      this.LastName = lName; 
      this.Email = email;
      this.Password = password; 
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
  
  public String getPassword() {
      return Password; 
  }
                    
}
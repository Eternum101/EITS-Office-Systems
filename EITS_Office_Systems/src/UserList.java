/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2101560216
 */
public class UserList {
    
  private int userID; 

  private String FirstName, LastName, Email;

  public UserList(int userID, String fName, String lName, String email){
      
      this.userID = userID; 
      this.FirstName = fName;
      this.LastName = lName; 
      this.Email = email;
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
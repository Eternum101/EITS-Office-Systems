/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EITS;

/**
 *
 * @author Brayden
 */
public class CaseworkerList {
    private int caseworkerID;
    private String FirstName;
    private String LastName;
    private String Email;
    private String Password;

    
public CaseworkerList (int caseworkerID, String fName, String lName, String email, String password) {
      this.caseworkerID = caseworkerID; 
      this.FirstName = fName;
      this.LastName = lName; 
      this.Email = email;
      this.Password = password; 
}
    /**
     * @return the caseworkerID
     */
    public int getCaseworkerID() {
        return caseworkerID;
    }

    /**
     * @param caseworkerID the caseworkerID to set
     */
    public void setCaseworkerID(int caseworkerID) {
        this.caseworkerID = caseworkerID;
    }

    /**
     * @return the FirstName
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * @param FirstName the FirstName to set
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * @return the LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @param LastName the LastName to set
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }
}

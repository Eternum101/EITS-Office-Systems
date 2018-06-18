/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EITS;

/**
 *@author Brayden 2101560216
 *@purpose This is a class that tracks the user across forms.
 *@version control 1.0
 *@date 10/06/2018
 */
public class User {
    int myUser;
    private int courseID;
    private String unitsID;
    private String FirstName;
    private String LastName;
    private String myEmail;
    private String myPassword;
    private String LoginDate; 

    /**
     * @return the myUser
     */
    public int getMyUser() {
        return myUser;
    }

    /**
     * @param myUser the myUser to set
     */
    public void setMyUser(int myUser) {
        this.myUser = myUser;
    }

    /**
     * @return the courseID
     */
    public int getCourseID() {
        return courseID;
    }

    /**
     * @param courseID the courseID to set
     */
    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    /**
     * @return the unitsID
     */
    public String getUnitsID() {
        return unitsID;
    }

    /**
     * @param unitsID the unitsID to set
     */
    public void setUnitsID(String unitsID) {
        this.unitsID = unitsID;
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
     * @return the myEmail
     */
    public String getMyEmail() {
        return myEmail;
    }

    /**
     * @param myEmail the myEmail to set
     */
    public void setMyEmail(String myEmail) {
        this.myEmail = myEmail;
    }

    /**
     * @return the myPassword
     */
    public String getMyPassword() {
        return myPassword;
    }

    /**
     * @param myPassword the myPassword to set
     */
    public void setMyPassword(String myPassword) {
        this.myPassword = myPassword;
    }

    /**
     * @return the LoginDate
     */
    public String getLoginDate() {
        return LoginDate;
    }

    /**
     * @param LoginDate the LoginDate to set
     */
    public void setLoginDate(String LoginDate) {
        this.LoginDate = LoginDate;
    }

    int getMyUser(String userID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

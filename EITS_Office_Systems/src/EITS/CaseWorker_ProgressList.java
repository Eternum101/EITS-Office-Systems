package EITS;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *@author Jakob 2104990817, Brayden 2101560216,  Alex 7105395517
 *@purpose This is a list of the progress for the caseworker tab.
 *@version control 1.0
 *@date 10/06/2018
 */
public class CaseWorker_ProgressList {
  private int userID; 

  private String FirstName, LastName, Title, Name, Results, Note;

  public CaseWorker_ProgressList(int userID, String fName, String lName, String title, String name, String results, String note){
      
      this.userID = userID; 
      this.FirstName = fName;
      this.LastName = lName; 
      this.Title = title; 
      this.Name = name;
      this.Results = results;
      this.Note = note;
  }

    /**
     * @return the userID
     */
    public int getUserID() {
        return userID;
    }

    /**
     * @return the unitsID
     */
    public String getName() {
        return Name;
    }

    /**
     * @return the FirstName
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * @return the LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @return the Title
     */
    public String getTitle() {
        return Title;
    }

    /**
     * @return the Results
     */
    public String getResults() {
        return Results;
    }
    /**
     * @return the Note
     */
    public String getNote() {
        return Note;
    }
    

}


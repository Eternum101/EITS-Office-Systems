package EITS;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2101560216
 */
public class CaseWorker_ProgressList {
  private int userID; 

  private String FirstName, LastName, Title, unitsID, Results, Note;

  public CaseWorker_ProgressList(int userID, String fName, String lName, String title, String units_id, String results, String note){
      
      this.userID = userID; 
      this.FirstName = fName;
      this.LastName = lName; 
      this.Title = title; 
      this.unitsID = units_id;
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
    public String getUnitsID() {
        return unitsID;
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


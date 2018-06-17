/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EITS;

/**
 *@author Jakob 2104990817, Brayden 2101560216,  Alex 7105395517
 *@purpose This is a class that displays a list of units in the clientUnitListAdmin_GUI intended for Admins.
 *@version control 1.0
 *@date 10/06/2018
 */
public class UnitList {
    
    private int id;
    private String name; 
    private String unitDesc;
    private int courses_id;
    
public UnitList(int ID, String name, String unitDesc, int courses_id) {
    
    this.id = ID;
    this.name = name;
    this.unitDesc = unitDesc; 
    this.courses_id = courses_id;
    
}

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the code
     */
    public String getName() {
        return name;
    }

    /**
     * @param code the code to set
     */
    public void setName(String code) {
        this.name = name;
    }

    /**
     * @return the unitDesc
     */
    public String getUnitDesc() {
        return unitDesc;
    }

    /**
     * @param unitDesc the unitDesc to set
     */
    public void setUnitDesc(String unitDesc) {
        this.unitDesc = unitDesc;
    }

    /**
     * @return the courses_id
     */
    public int getCourses_id() {
        return courses_id;
    }

    /**
     * @param courses_id the courses_id to set
     */
    public void setCourses_id(int courses_id) {
        this.courses_id = courses_id;
    }
}

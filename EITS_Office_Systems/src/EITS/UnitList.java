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
public class UnitList {
    
    private int id;
    private String code; 
    private String unitDesc;
    private int courses_id;
    
public UnitList(int ID, String code, String unitDesc, int courses_id) {
    
    this.id = ID;
    this.code = code;
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
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
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

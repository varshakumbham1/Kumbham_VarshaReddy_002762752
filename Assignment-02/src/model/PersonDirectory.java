package model;


import java.util.List;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author varshareddykumbham
 */
public class PersonDirectory {
    List<Person> listOfPersons;

    public PersonDirectory() {
    }

    public PersonDirectory(List<Person> listOfPersons) {
        this.listOfPersons = listOfPersons;
    }

    public List<Person> getListOfPersons() {
        return listOfPersons;
    }

    public void setListOfPersons(List<Person> listOfPersons) {
        this.listOfPersons = listOfPersons;
    }
}

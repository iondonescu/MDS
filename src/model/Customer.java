package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
* Model
*/
//This class represents Customer that can be serialized // to retrive data after the application is closed
public class Customer implements Serializable {
    //Private field
    private String name;
    private String phone;

    //Default constructor
    public Customer(){
        this.name = name;
        this.phone = phone;
    }

    //Parameterized constructor
    public Customer(String name,String phone){
        this.name = name;
        this.phone = phone;
    }
    //Getter and setter
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    //Validate method.Validates the fields of the class
    public Collection<String> validate(){
        List<String> unfilledFields = new ArrayList<String>();
        if(this.getName().equals("")){
            unfilledFields.add("Name");
        }
        if(this.getPhone().equals("")){
            unfilledFields.add("Phone");
        }
        return unfilledFields;
    }
    // This method is responsible for serializing the customer object
    public boolean save(){
        //Object persistence - save to a database
        return true;
    }

}

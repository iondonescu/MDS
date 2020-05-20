package controller;

/*
* Controller
 */

import model.Customer;
import view.CustomerForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerController {

    //Model
    private Customer model;

    //View
    private CustomerForm view;

    //Parameterized constructor
    public CustomerController(Customer model, CustomerForm view){
        this.model = model;
        this.view = view;
    }
    //This method is responsible to register the events from View
    public void registerControls(){
        saveControl();
    }

    //This method is invoked when the user clicks on save button
    public void saveControl(){
        //Action listener implementation
        view.getBtnSave().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //Receives the imputs from GUI and update the model
                model.setName(view.getTfName().getText());
                model.setPhone(view.getTfPhone().getText());

                //Checks whether all required fields are filled
                if(model.validate().isEmpty()){
                    //Persist the object
                    model.save();

                    //Update the GUI
                    JOptionPane.showMessageDialog(view,
                            "Customer "+ model.getName() +
                            " saved successfully!!!");

                    view.getTfName().setText("");
                    view.getTfPhone().setText("");
                }
                else{
                    //update the GUI
                    JOptionPane.showMessageDialog(view,
                            "Required fields must not be blank:\n" +
                                    ""+ model.validate(),"ATTENTION",
                            JOptionPane.WARNING_MESSAGE);
                }

            }
        });
    }
}

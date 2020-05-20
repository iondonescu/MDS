import controller.CustomerController;
import model.Customer;
import view.CustomerForm;

public class MainApp {
    public static void main(String[] args) {
        //Model
        Customer model = new Customer();

        //View
        CustomerForm view = new CustomerForm();

        //Controller
        CustomerController controller = new CustomerController(model,view);
        controller.registerControls();

        view.pack();
        view.setVisible(true);
    }
}

package Control;

import Data.Contact;
import Menu.*;
import Data.Method;
import java.util.ArrayList;

public class Control extends Menu<String> {
    static String[] menu = {"Add a contact", "Display all contact", "Delete a contact", "Exit"};
    protected Method mt = new Method();
    ArrayList<Contact> lc = new ArrayList<>();
    private Validation check = new Validation();
//------------------------------------------------------------------------------------------------------------------

    public Control() {
        super("Contact Manager SYS!!!", menu);
        lc.add(new Contact(1, "Iker Casillas", "Star", "Spain", "1234567890", "Iker", "Casillas"));
        lc.add(new Contact(2, "John Terry", "Star", "England", "1234567890", "John", "Terry"));
        lc.add(new Contact(3, "Raul Gonzalez", "Star", "Spain", "1234567890", "Raul", "Gonzalez"));
    }

    @Override
    public void execute(int n) {

        switch (n) {
            case 1 -> mt.createContact(lc);

            case 2 -> mt.printAllContact(lc);

            case 3 -> mt.deleteContactd(lc);

        }
    }

}

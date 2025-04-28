package Review_Exam_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactDirectory {
    private ArrayList<Contact> list;

    public ContactDirectory(){
        list = new ArrayList<Contact>();
    }

    void addContact(Contact c) {
        list.add(c);
    }

    public String lookUp(String name){
        for (Contact c : list){
            if (c.getName().equals(name)){
                return c.getPhoneNumber();
            }
        }
        return null;
    }

    void addFromFile(String filename) throws FileNotFoundException {
        File f = new File(filename);
        Scanner s = new Scanner(f);

        while (s.hasNextLine()) {
            String nextLine = s.nextLine();
            Scanner s2 = new Scanner(nextLine);
            String nextName = s2.next();
            String nextNumber = s2.next();
            nextName = nextName.substring(0, nextName.length() - 1); //removes comma

            if (lookUp(nextName) == null) {
                addContact(new Contact(nextName, nextNumber));
            }
            s2.close();
        }
        s.close();
    }
}

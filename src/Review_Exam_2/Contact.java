package Review_Exam_2;

public class Contact {
    private String name;
    private String phoneNumber;


    public Contact(String givenName, String givenPhoneNumber){
        name = givenName;
        phoneNumber = givenPhoneNumber;
    }

    /**
     * gets the name of the contact
     * @return the name
     */
    public String getName(){
        return name;
    }

    /**
     * gets the phone number of the contact
     * @return the phone number
     */
    public String getPhoneNumber(){
        return phoneNumber;
    }
}

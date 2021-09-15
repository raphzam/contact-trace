import java.util.ArrayList;
import java.util.List;

public class Patient {

    private String name;
    private String phoneNum;

    List<Symptom> symptomsList = new ArrayList<>();
    List<Contact> contactList = new ArrayList<>();

    public void addSymptom(String name, int daysExperienced) {
        symptomsList.add(new Symptom(name, daysExperienced));
    }

    public void addContact(String name, String phoneNum) {
        contactList.add(new Contact(name, phoneNum));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}

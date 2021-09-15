import java.util.ArrayList;
import java.util.List;

public class ContactTraceReport {

    List<Patient> patientList = new ArrayList<>();

    public void addPatient(Patient patient) {
        patientList.add(patient);
    }
}

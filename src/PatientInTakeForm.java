public class PatientInTakeForm {


    private Patient patient = new Patient();


    public void fillOutForm() {
        setName();
        setPhoneNumber();
        setSymptoms();
    }

    public Patient getPatient() {
        return patient;
    }

    private void setName() {
        patient.setName(Console.readLine("Patient name: "));
    }

    public void setPhoneNumber() {
        patient.setPhoneNum(Console.readLine("Phone number: "));
    }

    private void setSymptoms() {

    }


}

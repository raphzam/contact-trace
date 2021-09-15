public class Main {
    public static void main(String[] args) {
        Console.printPrompt("COVID CONTRACT TRACING REPORT APP");
        Console.printPrompt("Enter a newly infected patient's information: ");

        PatientInTakeForm form = new PatientInTakeForm();
        form.fillOutForm();
        ContactTraceReport report = new ContactTraceReport();
        report.addPatient(form.getPatient());
        ReportPrinter.print(report);

    }
}

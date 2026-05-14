import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ANALYSIS SYSTEM: UTERINE FIBROIDS PREDICTOR ===");
        System.out.println("Processing local patient anonymous cohorts...\n");

        // Create an array list of mock patient data to simulate a clinical cohort
        ArrayList<Patient> cohort = new ArrayList<>();
        cohort.add(new Patient("PT-002", 22, false, 1.8, false));
        cohort.add(new Patient("PT-005", 25, true, 2.3, true));
        cohort.add(new Patient("PT-004", 27, true, 1.6, false));
        cohort.add(new Patient("PT-001", 34, true, 4.2, true));
        cohort.add(new Patient("PT-006",39, false, 3.2, true));
        cohort.add(new Patient("PT-007", 42, true, 1.7, false));
        cohort.add(new Patient("PT-003", 45, false, 3.9, true));

        // Process each profile through the algorithmic engine
        for (Patient p : cohort) {
            double calculatedRisk = RiskEngine.calculateFibroidRisk(p);
            
            System.out.println("Patient Ref ID: " + p.getPatientId());
            System.out.println(" -> Age: " + p.getAge() + " | Family History: " + p.hasFamilyHistory());
            System.out.println(" -> Calculated Genetic/Biomarker Risk Index: " + String.format("%.2f", calculatedRisk) + "%");
            
            // Integrating psychology/counseling observation
            if (calculatedRisk > 50.0 && p.hasCompletedCounseling()) {
                System.out.println(" -> Note: Patient displays high somatic risk; holistic psychological support framework is active.");
            }
            System.out.println("______________________________END_____________________________");
        }
    }
}

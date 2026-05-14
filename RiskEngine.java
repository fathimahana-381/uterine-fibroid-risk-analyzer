public class RiskEngine {

    public static double calculateFibroidRisk(Patient patient) {
        double score = 0.0;
        double maxPossibleScore = 100.0;

        // 1. Age Factor (Risk increases during active reproductive years)
        if (patient.getAge() >= 30 && patient.getAge() <= 50) {
            score += 35.0; // Higher risk bracket
        } else if (patient.getAge() > 18 && patient.getAge() < 30) {
            score += 15.0;
        }

        // 2. Genetic Factor (Family history significantly increases predisposition)
        if (patient.hasFamilyHistory()) {
            score += 40.0;
        }

        // 3. Biomarker Factor (Estrogen dominance accelerates cell proliferation)
        if (patient.getEstrogenLevel() > 3.5) {
            score += 25.0;
        } else if (patient.getEstrogenLevel() >= 2.0) {
            score += 10.0;
        }

        // Return calculated percentage
        return (score / maxPossibleScore) * 100;
    }
}

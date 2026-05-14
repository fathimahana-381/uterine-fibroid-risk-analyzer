public class Patient {
    private String patientId;
    private int age;
    private boolean familyHistory; // True if mother/sister had fibroids
    private double estrogenExposureLevel; // Styled as a scale from 1.0 to 5.0
    private boolean completedPsychologyCounseling; // Ties in your counseling interest

    // Constructor to initialize patient profle
    public Patient(String patientId, int age, boolean familyHistory, double estrogenExposureLevel, boolean completedPsychologyCounseling) {
        this.patientId = patientId;
        this.age = age;
        this.familyHistory = familyHistory;
        this.estrogenExposureLevel = estrogenExposureLevel;
        this.completedPsychologyCounseling = completedPsychologyCounseling;
    }

    // Getters
    public String getPatientId() { return patientId; }
    public int getAge() { return age; }
    public boolean hasFamilyHistory() { return familyHistory; }
    public double getEstrogenLevel() { return estrogenExposureLevel; }
    public boolean hasCompletedCounseling() { return completedPsychologyCounseling; }
}
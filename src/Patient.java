import java.time.LocalDate;

public class Patient {
    private int id;
    private String name;
    private String symptom;
    private String diagnosis;
    private LocalDate date;
    private String hospital;

    public Patient(int id, String name, String symptom, String diagnosis, LocalDate date, String hospital) {
        this.id = id;
        this.name = name;
        this.symptom = symptom;
        this.diagnosis = diagnosis;
        this.date = date;
        this.hospital = hospital;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSymptom() {
        return symptom;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getHospital() {
        return hospital;
    }
}

package Examinations;

import java.time.LocalDate;

public class BPmeasurement extends examination {
    private int systolicPressure;
    private int diastolicPressure;

    private String term;

    public BPmeasurement(LocalDate examDate){
        super(examDate);
    }

    public void setTerm(String term){
        this.term = term;
    }

    public String getTerm(){
        return term;
    }

    public void setSystolicPressure(int systolicPressure){
        this.systolicPressure = systolicPressure;
    }

    public void setDiastolicPressure(int diastolicPressure){
        this.diastolicPressure = diastolicPressure;
    }

    public int getSystolicPressure(){
        return this.systolicPressure;
    }

    public int getDiastolicPressure(){
        return this.diastolicPressure;
    }

}

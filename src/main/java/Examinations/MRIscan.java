package Examinations;

import java.time.LocalDate;

public class MRIscan extends examination{
    private int MagneticFieldStrength;
    private String URL;
    public MRIscan(int magneticFieldStrength, LocalDate examDate){
        super(examDate);
        this.MagneticFieldStrength = magneticFieldStrength;
    }

    public void setURL(String URL){
        this.URL = URL;
    }
    public String getURL(){
        return URL;
    }

    public int getMagneticFieldStrength() {
        return MagneticFieldStrength;
    }
}

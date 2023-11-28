import Examinations.BPmeasurement;
import Examinations.MRIscan;
public class Patients {
    private String name;
    private String URL;
    private int age;
    private MRIscan mriScan;
    private BPmeasurement bpMeasurement;

    public Patients(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String displayAdministrator(){
        // Get a string displaying the appointment information for this patient
        // Surround with <html></html> tags so it can be displayed in a JLabel with <br> to make newlines
        // Note - if printing to the console instead, use \n instead of <br>
        String display=new String("<html>");
        display+="Patient: "+this.name+": MRI: "+mriScan.getMagneticFieldStrength() + " Tesla, " +
                mriScan.getExamDate().toString() + ": BP: " + bpMeasurement.getTerm() + ", " +
                bpMeasurement.getExamDate().toString() +"<br>";
        return display+"<br></html>";
    }


    public void addURL(String URL){
        this.URL = URL;
    }

    public void addMriScan(MRIscan mriScan){
        this.mriScan = mriScan;
    }

    public void addbpMeasurement(BPmeasurement bpMeasurement){
        this.bpMeasurement = bpMeasurement;
    }

    public MRIscan getMriScan(){
        return mriScan;
    }

    public BPmeasurement getBpMeasurement(){
        return bpMeasurement;
    }

    public String getURL(){
        return URL;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}

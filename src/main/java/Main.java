import Examinations.BPmeasurement;
import Examinations.MRIscan;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] arg){
        ArrayList<Patients> patients = new ArrayList<Patients>();


        Patients patient1 = new Patients("Daphne Von Oram", 62);
        patient1.addURL("https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg");
        patient1.addbpMeasurement(new BPmeasurement(LocalDate.of(2023, 9, 15)));
        patient1.getBpMeasurement().setTerm("ST");
        patient1.getBpMeasurement().setSystolicPressure(130);
        patient1.getBpMeasurement().setDiastolicPressure(70);
        patient1.addMriScan(new MRIscan(2, LocalDate.of(2023, 9, 14)));
        patient1.getMriScan().setURL("https://martinh.netfirms.com/BIOE60010/mri1.jpg");


        Patients patient2 = new Patients("Sebastian Compton", 31);
        patient2.addURL("https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg");
        patient2.addbpMeasurement(new BPmeasurement(LocalDate.of(2023, 11, 19)));
        patient2.getBpMeasurement().setTerm("VST");
        patient2.getBpMeasurement().setDiastolicPressure(80);
        patient2.getBpMeasurement().setSystolicPressure(150);
        patient2.addMriScan(new MRIscan(4, LocalDate.of(2023, 11, 19)));
        patient2.getMriScan().setURL("https://martinh.netfirms.com/BIOE60010/mri2.jpg");

        patients.add(patient1);
        patients.add(patient2);

        WindowDisplay display1 = new WindowDisplay();
        display1.display(patients);
    }
}
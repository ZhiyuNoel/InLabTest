import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class WindowDisplay {
    public JPanel displayForAdminitrator(ArrayList<Patients> patients){
        // Create a simple window to display the output
        JPanel displayPanel = new JPanel();
        // Create a label for each patient's text
        for (Patients pt:patients){
            JLabel displayLabel = new JLabel(pt.displayAdministrator());
            displayPanel.add(displayLabel);
        }
        return displayPanel;
    }

    public JPanel displayForDoctor(ArrayList<Patients> patients){
        JPanel displayPanel = new JPanel();
        displayPanel.setLayout(new FlowLayout(FlowLayout.LEADING,20,20));
        for(Patients pt: patients) {
            JLabel label1 = new JLabel();
            URL imageURL = null;
            try {
                imageURL = new URL(pt.getURL());
            } catch (MalformedURLException e) {
                System.out.println(e.getMessage());
            }
            assert imageURL != null;
            ImageIcon thisImageIcon = new ImageIcon(imageURL);
            label1.setIcon(thisImageIcon);

            JLabel label3 = new JLabel();
            URL imageURL2 = null;
            try {
                imageURL2 = new URL(pt.getMriScan().getURL());
            } catch (MalformedURLException e) {
                System.out.println(e.getMessage());
            }
            assert imageURL2 != null;
            ImageIcon thisImageIcon2 = new ImageIcon(imageURL2);
            label3.setIcon(thisImageIcon2);

            displayPanel.add(label1);
            displayPanel.add(new JLabel("<html> Name: "+pt.getName() + "<br>" + "Age: " + pt.getAge()+"</html>"));
            displayPanel.add(label3);
            displayPanel.add(new JLabel("<html> Blood pressure " + pt.getBpMeasurement().getSystolicPressure() +
                    " Over " + pt.getBpMeasurement().getDiastolicPressure()));
        }
        return displayPanel;
    }

    public void display(ArrayList<Patients> patients){
        JFrame frame = new JFrame("Administrator");
        frame.setSize(900,600);
        JButton doc_button = new JButton("Doctor");
        JButton adm_button = new JButton("Administrator");
        JPanel doctor = displayForDoctor(patients);
        frame.add(doctor);
        frame.setContentPane(doctor);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}

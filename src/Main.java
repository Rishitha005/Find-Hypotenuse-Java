import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        double z;
        double x = Double.parseDouble(JOptionPane.showInputDialog("Enter side x"));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Enter side y"));

        z=Math.sqrt((x*x)+(y*y));

        JOptionPane.showMessageDialog(null,z);
    }
}

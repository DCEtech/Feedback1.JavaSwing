import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FeedBack1 extends JFrame {
    boolean alternar = false;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JRadioButton IVATipo1RadioButton1;
    private JRadioButton IVATipo3RadioButton;
    private JRadioButton IVATipo2RadioButton;
    private JCheckBox CLEINTEHABITUALCheckBox;
    private JButton BOTÓNButton;
    private JComboBox comboBox1;
    private JLabel labNombre;
    private JLabel labDNI;
    private JLabel labDir;
    private JPanel main;

    public FeedBack1() {
        BOTÓNButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (alternar) {
                    textField1.setText("SIGO CAMBIANDO");
                    labNombre.setText("SIGO CAMBIANDO");
                } else {
                    textField1.setText("HE CAMBIADO");
                    labNombre.setText("HE CAMBIADO");
                }
                alternar = !alternar;
            }
        });


        textField3.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String texto = " HE CAMBIADO";

                labDir.setText(texto);
            }
        });
    }

    public static void main(String[] args) {
        FeedBack1 form = new FeedBack1();
        form.setContentPane(form.main);
        form.setSize(500, 500);
        form.setVisible(true);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Edpi {

	private static JPanel panel;
	
	public static void main(String[] args) {
		
		//Basic frame and panel stuff
		panel = new JPanel();
		JFrame frame = new JFrame("Edpi calculator");
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(panel);
		frame.setVisible(true);
		panel.setLayout(null);
		
		//
		
		//Stuff in the frame
		JComboBox combo = new JComboBox();
		
		
		JLabel title = new JLabel("Edpi calculator");
		title.setBounds(97, 10, 150, 20);
		panel.add(title);
		
		JLabel dpiLabel = new JLabel("DPI");
		dpiLabel.setBounds(70, 60, 110, 20);
		panel.add(dpiLabel);
		
		JTextField dpiField = new JTextField();
		dpiField.setBounds(100, 60, 108, 20);
		panel.add(dpiField);
		
		JLabel sensitivityLabel = new JLabel("Sensitivity");
		sensitivityLabel.setBounds(70, 110, 110, 20);
		panel.add(sensitivityLabel);
		
		JTextField sensitivityField = new JTextField();
		sensitivityField.setBounds(138, 110, 70, 20);
		panel.add(sensitivityField);
		
		JLabel edpiLabel = new JLabel("");
		edpiLabel.setBounds(93, 200, 500, 30);
		edpiLabel.setVisible(false);
		panel.add(edpiLabel);
		
		//
		
		//Button and actionListener
		JButton calculate = new JButton("Calculate");
		calculate.setBounds(95, 155, 100, 27);
		panel.add(calculate);
		calculate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String DPI;
				String sensitivity;
				
				
				DPI = dpiField.getText();
				int intDPI = Integer.parseInt(DPI);
				
				sensitivity = sensitivityField.getText();
				double intSensitivity = Double.parseDouble(sensitivity);
			
				int eDPI = (int) (intDPI*intSensitivity);
									
				
				edpiLabel.setVisible(true);
				edpiLabel.setText("Your EDPI is " + String.valueOf(eDPI));
				
				
			}
			
		});
		calculate.setFocusable(false);
		//
		
		
	}

}

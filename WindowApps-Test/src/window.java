import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class window {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window window = new window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 295, 126);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() == '1' || e.getKeyChar() == '2' || e.getKeyChar() == '3' ||
						e.getKeyChar() == '4' || e.getKeyChar() == '5' || e.getKeyChar() == '6' ||
						e.getKeyChar() == '7' || e.getKeyChar() == '8' || e.getKeyChar() == '9' || 
						e.getKeyChar() == '0'){
					e.setKeyChar(e.getKeyChar());
				} else {
					e.consume();
				}
			}
		});
		textField.setBounds(10, 20, 135, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCelsjusz = new JLabel("Celsjuszów");
		lblCelsjusz.setBounds(155, 23, 114, 14);
		frame.getContentPane().add(lblCelsjusz);
		
		final JLabel lblFahrenheit = new JLabel("Fahrenheit");
		lblFahrenheit.setBounds(155, 55, 114, 14);
		frame.getContentPane().add(lblFahrenheit);
		
		JButton btnConvert = new JButton("Konwertuj");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tempFahr = (int)((Double.parseDouble(textField.getText())) * 1.8 + 32);
				lblFahrenheit.setText(tempFahr + " Fahrenheitów");
			}
		});
		btnConvert.setBounds(10, 51, 135, 23);
		frame.getContentPane().add(btnConvert);
		

	}
}

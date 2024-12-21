package Frames;
import Main.OrderSys;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CompleteFrame extends JFrame {

	private JPanel contentPane;
	private AppController controller;
	
	public CompleteFrame(AppController controller) {
		
		this.controller = controller;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 811, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDoYouWant_1 = new JLabel("THANKS FOR ORDERING :)");
		lblDoYouWant_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoYouWant_1.setFont(new Font("Arial", Font.BOLD, 30));
		lblDoYouWant_1.setBounds(10, 10, 777, 76);
		contentPane.add(lblDoYouWant_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 96, 777, 302);
		contentPane.add(textArea);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(OrderSys.display());
				//setVisible(false);
			}
		});
		btnExit.setFont(new Font("Arial", Font.BOLD, 30));
		btnExit.setBackground(Color.LIGHT_GRAY);
		btnExit.setBounds(10, 408, 777, 76);
		contentPane.add(btnExit);
		
		
	}
}

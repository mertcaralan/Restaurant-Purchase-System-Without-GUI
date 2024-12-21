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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class BurgerFrame extends JFrame {

	private JPanel contentPane;
	private AppController controller;
	
	public void purchase(JButton choiceValue,int priceValue) {
		controller.showPurchaseFrame();
		OrderSys.addItem(choiceValue.getText(),priceValue);
	}
	
	public BurgerFrame(AppController controller) {
		this.controller = controller;
		
		setTitle("BURGER ORDER");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 811, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBurgerOrder = new JLabel("BURGER ORDER");
		lblBurgerOrder.setHorizontalAlignment(SwingConstants.CENTER);
		lblBurgerOrder.setBounds(10, 10, 466, 99);
		lblBurgerOrder.setFont(new Font("Arial", Font.BOLD, 30));
		contentPane.add(lblBurgerOrder);
		
		JButton btnHamburger = new JButton("HAMBURGER");
		btnHamburger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(btnHamburger, 250);
			}
		});
		btnHamburger.setBackground(new Color(192, 192, 192));
		btnHamburger.setBounds(10, 119, 466, 76);
		btnHamburger.setFont(new Font("Arial", Font.BOLD, 20));
		contentPane.add(btnHamburger);
		
		JButton btnCheeseburger = new JButton("CHEESEBURGER");
		btnCheeseburger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(btnCheeseburger, 270);
			}
		});
		btnCheeseburger.setBackground(new Color(192, 192, 192));
		btnCheeseburger.setFont(new Font("Arial", Font.BOLD, 20));
		btnCheeseburger.setBounds(10, 205, 466, 76);
		contentPane.add(btnCheeseburger);
		
		JButton btnFishburger = new JButton("FISHBURGER");
		btnFishburger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(btnFishburger, 300);
			}
		});
		btnFishburger.setBackground(new Color(192, 192, 192));
		btnFishburger.setFont(new Font("Arial", Font.BOLD, 20));
		btnFishburger.setBounds(10, 291, 466, 76);
		contentPane.add(btnFishburger);
		
		JButton btnChickenburger = new JButton("CHICKENBURGER");
		btnChickenburger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(btnChickenburger, 210);
			}
		});
		btnChickenburger.setBackground(new Color(192, 192, 192));
		btnChickenburger.setFont(new Font("Arial", Font.BOLD, 20));
		btnChickenburger.setBounds(10, 377, 466, 76);
		contentPane.add(btnChickenburger);
		
		JLabel lblPrces = new JLabel("PRICES");
		lblPrces.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces.setFont(new Font("Arial", Font.BOLD, 30));
		lblPrces.setBounds(486, 10, 301, 99);
		contentPane.add(lblPrces);
		
		JLabel lblTl = new JLabel("250 TL");
		lblTl.setHorizontalAlignment(SwingConstants.CENTER);
		lblTl.setFont(new Font("Arial", Font.BOLD, 30));
		lblTl.setBounds(486, 119, 301, 76);
		contentPane.add(lblTl);
		
		JLabel lblPrces_1_1 = new JLabel("270 TL");
		lblPrces_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces_1_1.setFont(new Font("Arial", Font.BOLD, 30));
		lblPrces_1_1.setBounds(486, 205, 301, 76);
		contentPane.add(lblPrces_1_1);
		
		JLabel lblPrces_1_2 = new JLabel("300 TL");
		lblPrces_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces_1_2.setFont(new Font("Arial", Font.BOLD, 30));
		lblPrces_1_2.setBounds(486, 291, 301, 76);
		contentPane.add(lblPrces_1_2);
		
		JLabel lblPrces_1_3 = new JLabel("210 TL");
		lblPrces_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces_1_3.setFont(new Font("Arial", Font.BOLD, 30));
		lblPrces_1_3.setBounds(486, 377, 301, 76);
		contentPane.add(lblPrces_1_3);
	}

}

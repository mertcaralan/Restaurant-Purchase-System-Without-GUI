package Frames;
import Main.OrderSys;
import Classes.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class SnackFrame extends JFrame {

	private JPanel contentPane;
	private AppController controller;

	
	public void purchase(JButton choiceValue,int priceValue) {
		controller.showPurchaseFrame();
		OrderSys.addItem(choiceValue.getText(),priceValue);
	}
	

	public SnackFrame(AppController controller) {
		this.controller = controller;
		
		setTitle("SNACK ORDER");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 811, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSnackOrder = new JLabel("SNACK ORDER");
		lblSnackOrder.setHorizontalAlignment(SwingConstants.CENTER);
		lblSnackOrder.setFont(new Font("Arial", Font.BOLD, 30));
		lblSnackOrder.setBounds(10, 10, 466, 99);
		contentPane.add(lblSnackOrder);
		
		JButton btnFrenchfries = new JButton("FRENCH FRIES");
		btnFrenchfries.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(btnFrenchfries, 50);
			}
		});
		btnFrenchfries.setFont(new Font("Arial", Font.BOLD, 20));
		btnFrenchfries.setBackground(Color.LIGHT_GRAY);
		btnFrenchfries.setBounds(10, 119, 466, 76);
		contentPane.add(btnFrenchfries);
		
		JButton btnNuggets = new JButton("NUGGETS");
		btnNuggets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(btnNuggets, 80);
			}
		});
		btnNuggets.setFont(new Font("Arial", Font.BOLD, 20));
		btnNuggets.setBackground(Color.LIGHT_GRAY);
		btnNuggets.setBounds(10, 205, 466, 76);
		contentPane.add(btnNuggets);
		
		JButton btnStrips = new JButton("STRIPS");
		btnStrips.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(btnStrips, 80);
			}
		});
		btnStrips.setFont(new Font("Arial", Font.BOLD, 20));
		btnStrips.setBackground(Color.LIGHT_GRAY);
		btnStrips.setBounds(10, 291, 466, 76);
		contentPane.add(btnStrips);
		
		JButton btnOnionrings = new JButton("ONION RING");
		btnOnionrings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(btnOnionrings, 75);
			}
		});
		btnOnionrings.setFont(new Font("Arial", Font.BOLD, 20));
		btnOnionrings.setBackground(Color.LIGHT_GRAY);
		btnOnionrings.setBounds(10, 377, 466, 76);
		contentPane.add(btnOnionrings);
		
		JLabel lblPrces = new JLabel("PRICES");
		lblPrces.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces.setFont(new Font("Arial", Font.BOLD, 30));
		lblPrces.setBounds(486, 10, 301, 99);
		contentPane.add(lblPrces);
		
		JLabel lblTl_1 = new JLabel("50 TL");
		lblTl_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTl_1.setFont(new Font("Arial", Font.BOLD, 30));
		lblTl_1.setBounds(486, 116, 301, 76);
		contentPane.add(lblTl_1);
		
		JLabel lblPrces_1_1 = new JLabel("80 TL");
		lblPrces_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces_1_1.setFont(new Font("Arial", Font.BOLD, 30));
		lblPrces_1_1.setBounds(486, 205, 301, 76);
		contentPane.add(lblPrces_1_1);
		
		JLabel lblPrces_1_2 = new JLabel("80 TL");
		lblPrces_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces_1_2.setFont(new Font("Arial", Font.BOLD, 30));
		lblPrces_1_2.setBounds(486, 291, 301, 76);
		contentPane.add(lblPrces_1_2);
		
		JLabel lblPrces_1_3 = new JLabel("75 TL");
		lblPrces_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces_1_3.setFont(new Font("Arial", Font.BOLD, 30));
		lblPrces_1_3.setBounds(486, 374, 301, 76);
		contentPane.add(lblPrces_1_3);
	}

}

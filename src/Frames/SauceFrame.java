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

public class SauceFrame extends JFrame {

	private JPanel contentPane;
	private AppController controller;

	
	public void purchase(JButton choiceValue,int priceValue) {
		controller.showPurchaseFrame();
		OrderSys.addItem(choiceValue.getText(),priceValue);
	}
	
	
	public SauceFrame(AppController controller) {
		this.controller = controller;
		
		setTitle("SAUCE ORDER");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 811, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSauceOrder = new JLabel("SAUCE ORDER");
		lblSauceOrder.setHorizontalAlignment(SwingConstants.CENTER);
		lblSauceOrder.setFont(new Font("Arial", Font.BOLD, 30));
		lblSauceOrder.setBounds(10, 10, 466, 99);
		contentPane.add(lblSauceOrder);
		
		JButton btnKetchup = new JButton("KETCHUP");
		btnKetchup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(btnKetchup, 5);
			}
		});
		btnKetchup.setFont(new Font("Arial", Font.BOLD, 20));
		btnKetchup.setBackground(Color.LIGHT_GRAY);
		btnKetchup.setBounds(10, 119, 466, 76);
		contentPane.add(btnKetchup);
		
		JButton btnBbq = new JButton("BBQ");
		btnBbq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(btnBbq, 7);
			}
		});
		btnBbq.setFont(new Font("Arial", Font.BOLD, 20));
		btnBbq.setBackground(Color.LIGHT_GRAY);
		btnBbq.setBounds(10, 205, 466, 76);
		contentPane.add(btnBbq);
		
		JButton btnMayonnaise = new JButton("MAYONNAISE");
		btnMayonnaise.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(btnMayonnaise, 5);
			}
		});
		btnMayonnaise.setFont(new Font("Arial", Font.BOLD, 20));
		btnMayonnaise.setBackground(Color.LIGHT_GRAY);
		btnMayonnaise.setBounds(10, 291, 466, 76);
		contentPane.add(btnMayonnaise);
		
		JButton btnMustard = new JButton("MUSTARD");
		btnMustard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(btnMustard, 7);
			}
		});
		btnMustard.setFont(new Font("Arial", Font.BOLD, 20));
		btnMustard.setBackground(Color.LIGHT_GRAY);
		btnMustard.setBounds(10, 377, 466, 76);
		contentPane.add(btnMustard);
		
		JLabel lblPrces = new JLabel("PRICES");
		lblPrces.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces.setFont(new Font("Arial", Font.BOLD, 30));
		lblPrces.setBounds(486, 10, 301, 99);
		contentPane.add(lblPrces);
		
		JLabel lblTl_1 = new JLabel("7 TL");
		lblTl_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTl_1.setFont(new Font("Arial", Font.BOLD, 30));
		lblTl_1.setBounds(486, 202, 301, 76);
		contentPane.add(lblTl_1);
		
		JLabel lblPrces_1_1 = new JLabel("5 TL");
		lblPrces_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces_1_1.setFont(new Font("Arial", Font.BOLD, 30));
		lblPrces_1_1.setBounds(486, 116, 301, 76);
		contentPane.add(lblPrces_1_1);
		
		JLabel lblPrces_1_2 = new JLabel("5 TL");
		lblPrces_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces_1_2.setFont(new Font("Arial", Font.BOLD, 30));
		lblPrces_1_2.setBounds(486, 288, 301, 76);
		contentPane.add(lblPrces_1_2);
		
		JLabel lblPrces_1_3 = new JLabel("7 TL");
		lblPrces_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces_1_3.setFont(new Font("Arial", Font.BOLD, 30));
		lblPrces_1_3.setBounds(486, 374, 301, 76);
		contentPane.add(lblPrces_1_3);
	}

}

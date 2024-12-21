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
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WrapFrame extends JFrame {

	private JPanel contentPane;
	private AppController controller;

	
	public void purchase(JButton choiceValue,int priceValue) {
		controller.showPurchaseFrame();
		OrderSys.addItem(choiceValue.getText(),priceValue);
	}
	

	public WrapFrame(AppController controller) {
		this.controller = controller;
		
		setTitle("WRAP ORDER");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 811, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWrapOrder = new JLabel("WRAP ORDER");
		lblWrapOrder.setHorizontalAlignment(SwingConstants.CENTER);
		lblWrapOrder.setBounds(10, 10, 466, 99);
		lblWrapOrder.setFont(new Font("Arial", Font.BOLD, 30));
		contentPane.add(lblWrapOrder);
		
		JButton btnVeganWrap = new JButton("VEGAN WRAP");
		btnVeganWrap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(btnVeganWrap, 170);
			}
		});
		btnVeganWrap.setBounds(10, 119, 466, 76);
		btnVeganWrap.setFont(new Font("Arial", Font.BOLD, 20));
		btnVeganWrap.setBackground(Color.LIGHT_GRAY);
		contentPane.add(btnVeganWrap);
		
		JButton btnChickenWrap = new JButton("CHICKEN WRAP");
		btnChickenWrap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(btnChickenWrap, 150);
			}
		});
		btnChickenWrap.setBounds(10, 205, 466, 76);
		btnChickenWrap.setFont(new Font("Arial", Font.BOLD, 20));
		btnChickenWrap.setBackground(Color.LIGHT_GRAY);
		contentPane.add(btnChickenWrap);
		
		JButton btnMeatWrap = new JButton("MEAT WRAP");
		btnMeatWrap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(btnMeatWrap, 200);
			}
		});
		btnMeatWrap.setBounds(10, 291, 466, 76);
		btnMeatWrap.setFont(new Font("Arial", Font.BOLD, 20));
		btnMeatWrap.setBackground(Color.LIGHT_GRAY);
		contentPane.add(btnMeatWrap);
		
		JButton btnCeasarWrap = new JButton("CEASAR WRAP");
		btnCeasarWrap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(btnCeasarWrap, 185);
			}
		});
		btnCeasarWrap.setBounds(10, 377, 466, 76);
		btnCeasarWrap.setFont(new Font("Arial", Font.BOLD, 20));
		btnCeasarWrap.setBackground(Color.LIGHT_GRAY);
		contentPane.add(btnCeasarWrap);
		
		JLabel lblPrces = new JLabel("PRICES");
		lblPrces.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces.setBounds(486, 33, 301, 99);
		lblPrces.setFont(new Font("Arial", Font.BOLD, 30));
		contentPane.add(lblPrces);
		
		JLabel lblTl_1 = new JLabel("170 TL");
		lblTl_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTl_1.setBounds(486, 202, 301, 76);
		lblTl_1.setFont(new Font("Arial", Font.BOLD, 30));
		contentPane.add(lblTl_1);
		
		JLabel lblPrces_1_1 = new JLabel("150 TL");
		lblPrces_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces_1_1.setBounds(486, 116, 301, 76);
		lblPrces_1_1.setFont(new Font("Arial", Font.BOLD, 30));
		contentPane.add(lblPrces_1_1);
		
		JLabel lblPrces_1_2 = new JLabel("200 TL");
		lblPrces_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces_1_2.setBounds(486, 288, 301, 76);
		lblPrces_1_2.setFont(new Font("Arial", Font.BOLD, 30));
		contentPane.add(lblPrces_1_2);
		
		JLabel lblPrces_1_3 = new JLabel("185 TL");
		lblPrces_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces_1_3.setBounds(486, 374, 301, 76);
		lblPrces_1_3.setFont(new Font("Arial", Font.BOLD, 30));
		contentPane.add(lblPrces_1_3);
	}

}

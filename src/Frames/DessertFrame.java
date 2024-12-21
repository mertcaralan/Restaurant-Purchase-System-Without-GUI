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

public class DessertFrame extends JFrame {

	private JPanel contentPane;
	private AppController controller;

	
	public void purchase(JButton choiceValue,int priceValue) {
		controller.showPurchaseFrame();
		OrderSys.addItem(choiceValue.getText(),priceValue);
	}
	
	
	public DessertFrame(AppController controller) {
		this.controller = controller;
		
		setTitle("DESSERT ORDER");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 811, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDessertOrder = new JLabel("DESSERT ORDER");
		lblDessertOrder.setHorizontalAlignment(SwingConstants.CENTER);
		lblDessertOrder.setFont(new Font("Arial", Font.BOLD, 30));
		lblDessertOrder.setBounds(10, 10, 466, 99);
		contentPane.add(lblDessertOrder);
		
		JButton btnIcecream = new JButton("ICE CREAM");
		btnIcecream.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(btnIcecream, 70);
			}
		});
		btnIcecream.setFont(new Font("Arial", Font.BOLD, 20));
		btnIcecream.setBackground(Color.LIGHT_GRAY);
		btnIcecream.setBounds(10, 119, 466, 76);
		contentPane.add(btnIcecream);
		
		JButton btnDubai = new JButton("DUBAI CHOCOLATE");
		btnDubai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(btnDubai, 450);
			}
		});
		btnDubai.setFont(new Font("Arial", Font.BOLD, 20));
		btnDubai.setBackground(Color.LIGHT_GRAY);
		btnDubai.setBounds(10, 205, 466, 76);
		contentPane.add(btnDubai);
		
		JButton btnDonut = new JButton("DONUT");
		btnDonut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(btnDonut, 120);
			}
		});
		btnDonut.setFont(new Font("Arial", Font.BOLD, 20));
		btnDonut.setBackground(Color.LIGHT_GRAY);
		btnDonut.setBounds(10, 291, 466, 76);
		contentPane.add(btnDonut);
		
		JButton btnBaklava = new JButton("BAKLAVA");
		btnBaklava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(btnBaklava, 240);
			}
		});
		btnBaklava.setFont(new Font("Arial", Font.BOLD, 20));
		btnBaklava.setBackground(Color.LIGHT_GRAY);
		btnBaklava.setBounds(10, 377, 466, 76);
		contentPane.add(btnBaklava);
		
		JLabel lblPrces = new JLabel("PRICES");
		lblPrces.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces.setFont(new Font("Arial", Font.BOLD, 30));
		lblPrces.setBounds(486, 10, 301, 99);
		contentPane.add(lblPrces);
		
		JLabel lblTl_1 = new JLabel("70 TL");
		lblTl_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTl_1.setFont(new Font("Arial", Font.BOLD, 30));
		lblTl_1.setBounds(496, 119, 301, 76);
		contentPane.add(lblTl_1);
		
		JLabel lblPrces_1_1 = new JLabel("450 TL");
		lblPrces_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces_1_1.setFont(new Font("Arial", Font.BOLD, 30));
		lblPrces_1_1.setBounds(486, 205, 301, 76);
		contentPane.add(lblPrces_1_1);
		
		JLabel lblPrces_1_2 = new JLabel("120 TL");
		lblPrces_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces_1_2.setFont(new Font("Arial", Font.BOLD, 30));
		lblPrces_1_2.setBounds(486, 291, 301, 76);
		contentPane.add(lblPrces_1_2);
		
		JLabel lblPrces_1_3 = new JLabel("240 TL");
		lblPrces_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces_1_3.setFont(new Font("Arial", Font.BOLD, 30));
		lblPrces_1_3.setBounds(486, 377, 301, 76);
		contentPane.add(lblPrces_1_3);
	}

}

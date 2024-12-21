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

public class HotDrinkFrame extends JFrame {

	private JPanel contentPane;
	private AppController controller;

	
	public void purchase(JButton choiceValue,int priceValue) {
		controller.showPurchaseFrame();
		OrderSys.addItem(choiceValue.getText(),priceValue);
	}
	

	public HotDrinkFrame(AppController controller) {
		this.controller = controller;
		
		setTitle("HOT DRINK ORDER");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 811, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHotDrnkOrder = new JLabel("HOT DRINK ORDER");
		lblHotDrnkOrder.setHorizontalAlignment(SwingConstants.CENTER);
		lblHotDrnkOrder.setFont(new Font("Arial", Font.BOLD, 30));
		lblHotDrnkOrder.setBounds(10, 10, 466, 99);
		contentPane.add(lblHotDrnkOrder);
		
		JButton btnTea = new JButton("TEA");
		btnTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(btnTea, 25);
			}
		});
		btnTea.setFont(new Font("Arial", Font.BOLD, 20));
		btnTea.setBackground(Color.LIGHT_GRAY);
		btnTea.setBounds(10, 119, 466, 76);
		contentPane.add(btnTea);
		
		JButton btnCoffee = new JButton("COFFEE");
		btnCoffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(btnCoffee, 80);
			}
		});
		btnCoffee.setFont(new Font("Arial", Font.BOLD, 20));
		btnCoffee.setBackground(Color.LIGHT_GRAY);
		btnCoffee.setBounds(10, 205, 466, 76);
		contentPane.add(btnCoffee);
		
		JButton btnHotChocolate = new JButton("HOT CHOCOLATE");
		btnHotChocolate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(btnHotChocolate, 75);
			}
		});
		btnHotChocolate.setFont(new Font("Arial", Font.BOLD, 20));
		btnHotChocolate.setBackground(Color.LIGHT_GRAY);
		btnHotChocolate.setBounds(10, 291, 466, 76);
		contentPane.add(btnHotChocolate);
		
		JButton btnSalep = new JButton("SALEP");
		btnSalep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(btnSalep, 100);
			}
		});
		btnSalep.setFont(new Font("Arial", Font.BOLD, 20));
		btnSalep.setBackground(Color.LIGHT_GRAY);
		btnSalep.setBounds(10, 377, 466, 76);
		contentPane.add(btnSalep);
		
		JLabel lblPrces = new JLabel("PRICES");
		lblPrces.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces.setFont(new Font("Arial", Font.BOLD, 30));
		lblPrces.setBounds(486, 10, 301, 99);
		contentPane.add(lblPrces);
		
		JLabel lblTl_1 = new JLabel("25 TL");
		lblTl_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTl_1.setFont(new Font("Arial", Font.BOLD, 30));
		lblTl_1.setBounds(486, 116, 301, 76);
		contentPane.add(lblTl_1);
		
		JLabel lblPrces_1_1 = new JLabel("80 TL");
		lblPrces_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces_1_1.setFont(new Font("Arial", Font.BOLD, 30));
		lblPrces_1_1.setBounds(486, 205, 301, 76);
		contentPane.add(lblPrces_1_1);
		
		JLabel lblPrces_1_2 = new JLabel("75 TL");
		lblPrces_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces_1_2.setFont(new Font("Arial", Font.BOLD, 30));
		lblPrces_1_2.setBounds(486, 288, 301, 76);
		contentPane.add(lblPrces_1_2);
		
		JLabel lblPrces_1_3 = new JLabel("100 TL");
		lblPrces_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces_1_3.setFont(new Font("Arial", Font.BOLD, 30));
		lblPrces_1_3.setBounds(486, 377, 301, 76);
		contentPane.add(lblPrces_1_3);
	}
}

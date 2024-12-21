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

public class ColdDrinkFrame extends JFrame {

	private JPanel contentPane;
	private AppController controller;

	public void purchase(JButton choiceValue,int priceValue) {
		controller.showPurchaseFrame();
		OrderSys.addItem(choiceValue.getText(),priceValue);
	}

	public ColdDrinkFrame(AppController controller) {
		this.controller = controller;
		
		setTitle("COLD DRINK ORDER");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 811, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblColdDrnkOrder = new JLabel("COLD DRINK ORDER");
		lblColdDrnkOrder.setHorizontalAlignment(SwingConstants.CENTER);
		lblColdDrnkOrder.setFont(new Font("Arial", Font.BOLD, 30));
		lblColdDrnkOrder.setBounds(10, 10, 466, 99);
		contentPane.add(lblColdDrnkOrder);
		
		JButton btnCola = new JButton("COCA COLA");
		btnCola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(btnCola, 40);
			}
		});
		btnCola.setFont(new Font("Arial", Font.BOLD, 20));
		btnCola.setBackground(Color.LIGHT_GRAY);
		btnCola.setBounds(10, 119, 466, 76);
		contentPane.add(btnCola);
		
		JButton btnFanta = new JButton("FANTA");
		btnFanta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(btnFanta, 40);
			}
		});
		btnFanta.setFont(new Font("Arial", Font.BOLD, 20));
		btnFanta.setBackground(Color.LIGHT_GRAY);
		btnFanta.setBounds(10, 205, 466, 76);
		contentPane.add(btnFanta);
		
		JButton btnSprite = new JButton("SPRITE");
		btnSprite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(btnSprite, 40);
			}
		});
		btnSprite.setFont(new Font("Arial", Font.BOLD, 20));
		btnSprite.setBackground(Color.LIGHT_GRAY);
		btnSprite.setBounds(10, 291, 466, 76);
		contentPane.add(btnSprite);
		
		JButton btnIcetea = new JButton("ICE TEA");
		btnIcetea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				purchase(btnIcetea, 40);
			}
		});
		btnIcetea.setFont(new Font("Arial", Font.BOLD, 20));
		btnIcetea.setBackground(Color.LIGHT_GRAY);
		btnIcetea.setBounds(10, 377, 466, 76);
		contentPane.add(btnIcetea);
		
		JLabel lblPrces = new JLabel("PRICES");
		lblPrces.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces.setFont(new Font("Arial", Font.BOLD, 30));
		lblPrces.setBounds(486, 10, 301, 99);
		contentPane.add(lblPrces);
		
		JLabel lblTl_1 = new JLabel("40 TL");
		lblTl_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTl_1.setFont(new Font("Arial", Font.BOLD, 30));
		lblTl_1.setBounds(486, 119, 301, 76);
		contentPane.add(lblTl_1);
		
		JLabel lblPrces_1_1 = new JLabel("40 TL");
		lblPrces_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces_1_1.setFont(new Font("Arial", Font.BOLD, 30));
		lblPrces_1_1.setBounds(486, 205, 301, 76);
		contentPane.add(lblPrces_1_1);
		
		JLabel lblPrces_1_2 = new JLabel("40 TL");
		lblPrces_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces_1_2.setFont(new Font("Arial", Font.BOLD, 30));
		lblPrces_1_2.setBounds(486, 291,301, 76);
		contentPane.add(lblPrces_1_2);
		
		JLabel lblPrces_1_3 = new JLabel("40 TL");
		lblPrces_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrces_1_3.setFont(new Font("Arial", Font.BOLD, 30));
		lblPrces_1_3.setBounds(486, 377, 301, 76);
		contentPane.add(lblPrces_1_3);
	}
}

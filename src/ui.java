import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ships.*;
import util.*;

public class ui extends JFrame {
	
	private JPanel contentPane;
	Main main;
	
	// water: rgb = 102, 204, 255
	// hit ship: rgb = 102, 255, 204

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui gui = new ui();
					gui.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public ui() {
		main = new Main();
		main.ships = new ArrayList<Ship>();
		main.table = new int[15][15];
		
		main.initTable();
		main.initShips();
		
		setResizable(false);
		setTitle("Battleship!");
		setForeground(new Color(255,192,203));
		setBackground(new Color(255,192,203));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(200, 100, 510, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255,192,203));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// LINE 1
		
		JButton b00 = new JButton();
		b00.setBackground(new Color(255,192,203));
		b00.setForeground(new Color(255,192,203));
		b00.setBounds(30, 100, 30, 30);
		b00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(main.hitShip(0, 0)) {
					b00.setBackground(new Color(102, 255, 204));
					b00.setEnabled(false);
				}
				else {
					b00.setBackground(new Color(102, 204, 255));
					b00.setEnabled(false);
				}
				
				main.removeDownedShips();
				
				if(main.ships.size() == 0) {
					// finish game
					JOptionPane.showMessageDialog(null, "YOU WON :D");
					dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
				}
			}
		});
		contentPane.add(b00);
		
		JButton b01 = new JButton();
		b01.setBackground(new Color(255,192,203));
		b01.setForeground(new Color(255,192,203));
		b01.setBounds(60, 100, 30, 30);
		b01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(main.hitShip(1, 0)) {
					b01.setBackground(new Color(102, 255, 204));
					b01.setEnabled(false);
				}
				else {
					b01.setBackground(new Color(102, 204, 255));
					b01.setEnabled(false);
				}
				
				main.removeDownedShips();
				
				if(main.ships.size() == 0) {
					// finish game
					JOptionPane.showMessageDialog(null, "YOU WON :D");
					dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
				}
				
			}
		});
		contentPane.add(b01);
		
		JButton b02 = new JButton();
		b02.setBackground(new Color(255,192,203));
		b02.setForeground(new Color(255,192,203));
		b02.setBounds(90, 100, 30, 30);
		b02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(main.hitShip(2, 0)) {
					b02.setBackground(new Color(102, 255, 204));
					b02.setEnabled(false);
				}
				else {
					b02.setBackground(new Color(102, 204, 255));
					b02.setEnabled(false);
				}
				
				main.removeDownedShips();
				
				if(main.ships.size() == 0) {
					// finish game
					JOptionPane.showMessageDialog(null, "YOU WON :D");
					dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
				}
				
			}
		});
		contentPane.add(b02);
		
		JButton b03 = new JButton();
		b03.setBackground(new Color(255,192,203));
		b03.setForeground(new Color(255,192,203));
		b03.setBounds(120, 100, 30, 30);
		b03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(main.hitShip(3, 0)) {
					b03.setBackground(new Color(102, 255, 204));
					b03.setEnabled(false);
				}
				else {
					b03.setBackground(new Color(102, 204, 255));
					b03.setEnabled(false);
				}
				

				main.removeDownedShips();
				
				if(main.ships.size() == 0) {
					// finish game
					JOptionPane.showMessageDialog(null, "YOU WON :D");
					dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
				}
				
			}
		});
		contentPane.add(b03);
		
		JButton b04 = new JButton();
		b04.setBackground(new Color(255,192,203));
		b04.setForeground(new Color(255,192,203));
		b04.setBounds(150, 100, 30, 30);
		b04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(main.hitShip(4, 0)) {
					b04.setBackground(new Color(102, 255, 204));
					b04.setEnabled(false);
				}
				else {
					b04.setBackground(new Color(102, 204, 255));
					b04.setEnabled(false);
				}
				

				main.removeDownedShips();
				
				if(main.ships.size() == 0) {
					// finish game
					JOptionPane.showMessageDialog(null, "YOU WON :D");
					dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
				}
			}
		});
		contentPane.add(b04);
		
		JButton b05 = new JButton();
		b05.setBackground(new Color(255,192,203));
		b05.setForeground(new Color(255,192,203));
		b05.setBounds(180, 100, 30, 30);
		b05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(main.hitShip(5, 0)) {
					b05.setBackground(new Color(102, 255, 204));
					b05.setEnabled(false);
				}
				else {
					b05.setBackground(new Color(102, 204, 255));
					b05.setEnabled(false);
				}
				

				main.removeDownedShips();
				
				if(main.ships.size() == 0) {
					// finish game
					JOptionPane.showMessageDialog(null, "YOU WON :D");
					dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
				}
				
			}
		});
		contentPane.add(b05);
		
		JButton b06 = new JButton();
		b06.setBackground(new Color(255,192,203));
		b06.setForeground(new Color(255,192,203));
		b06.setBounds(210, 100, 30, 30);
		b06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(main.hitShip(6, 0)) {
					b06.setBackground(new Color(102, 255, 204));
					b06.setEnabled(false);
				}
				else {
					b06.setBackground(new Color(102, 204, 255));
					b06.setEnabled(false);
				}
				

				main.removeDownedShips();
				
				if(main.ships.size() == 0) {
					// finish game
					JOptionPane.showMessageDialog(null, "YOU WON :D");
					dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
				}
				
			}
		});
		contentPane.add(b06);
		
		JButton b07 = new JButton();
		b07.setBackground(new Color(255,192,203));
		b07.setForeground(new Color(255,192,203));
		b07.setBounds(240, 100, 30, 30);
		b07.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(main.hitShip(7, 0)) {
					b07.setBackground(new Color(102, 255, 204));
					b07.setEnabled(false);
				}
				else {
					b07.setBackground(new Color(102, 204, 255));
					b07.setEnabled(false);
				}
				

				main.removeDownedShips();
				
				if(main.ships.size() == 0) {
					// finish game
					JOptionPane.showMessageDialog(null, "YOU WON :D");
					dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
				}
				
			}
		});
		contentPane.add(b07);
		
		JButton b08 = new JButton();
		b08.setBackground(new Color(255,192,203));
		b08.setForeground(new Color(255,192,203));
		b08.setBounds(270, 100, 30, 30);
		b08.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(main.hitShip(8, 0)) {
					b08.setBackground(new Color(102, 255, 204));
					b08.setEnabled(false);
				}
				else {
					b08.setBackground(new Color(102, 204, 255));
					b08.setEnabled(false);
				}
				

				main.removeDownedShips();
				
				if(main.ships.size() == 0) {
					// finish game
					JOptionPane.showMessageDialog(null, "YOU WON :D");
					dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
				}
			}
		});
		contentPane.add(b08);
		
		JButton b09 = new JButton();
		b09.setBackground(new Color(255,192,203));
		b09.setForeground(new Color(255,192,203));
		b09.setBounds(300, 100, 30, 30);
		b09.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(main.hitShip(9, 0)) {
					b09.setBackground(new Color(102, 255, 204));
					b09.setEnabled(false);
				}
				else {
					b09.setBackground(new Color(102, 204, 255));
					b09.setEnabled(false);
				}
				

				main.removeDownedShips();
				
				if(main.ships.size() == 0) {
					// finish game
					JOptionPane.showMessageDialog(null, "YOU WON :D");
					dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
				}
				
			}
		});
		contentPane.add(b09);
		
		JButton b010 = new JButton();
		b010.setBackground(new Color(255,192,203));
		b010.setForeground(new Color(255,192,203));
		b010.setBounds(330, 100, 30, 30);
		b010.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(main.hitShip(10, 0)) {
					b010.setBackground(new Color(102, 255, 204));
					b010.setEnabled(false);
				}
				else {
					b010.setBackground(new Color(102, 204, 255));
					b010.setEnabled(false);
				}
				

				main.removeDownedShips();
				
				if(main.ships.size() == 0) {
					// finish game
					JOptionPane.showMessageDialog(null, "YOU WON :D");
					dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
				}
				
			}
		});
		contentPane.add(b010);
		
		JButton b011 = new JButton();
		b011.setBackground(new Color(255,192,203));
		b011.setForeground(new Color(255,192,203));
		b011.setBounds(360, 100, 30, 30);
		b011.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(main.hitShip(11, 0)) {
					b011.setBackground(new Color(102, 255, 204));
					b011.setEnabled(false);
				}
				else {
					b011.setBackground(new Color(102, 204, 255));
					b011.setEnabled(false);
				}
				

				main.removeDownedShips();
				
				if(main.ships.size() == 0) {
					// finish game
					JOptionPane.showMessageDialog(null, "YOU WON :D");
					dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
				}
			}
		});
		contentPane.add(b011);
		
		JButton b012 = new JButton();
		b012.setBackground(new Color(255,192,203));
		b012.setForeground(new Color(255,192,203));
		b012.setBounds(390, 100, 30, 30);
		b012.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(main.hitShip(12, 0)) {
					b012.setBackground(new Color(102, 255, 204));
					b012.setEnabled(false);
				}
				else {
					b012.setBackground(new Color(102, 204, 255));
					b012.setEnabled(false);
				}
				

				main.removeDownedShips();
				
				if(main.ships.size() == 0) {
					// finish game
					JOptionPane.showMessageDialog(null, "YOU WON :D");
					dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
				}
				
			}
		});
		contentPane.add(b012);
		
		JButton b013 = new JButton();
		b013.setBackground(new Color(255,192,203));
		b013.setForeground(new Color(255,192,203));
		b013.setBounds(420, 100, 30, 30);
		b013.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(main.hitShip(13, 0)) {
					b013.setBackground(new Color(102, 255, 204));
					b013.setEnabled(false);
				}
				else {
					b013.setBackground(new Color(102, 204, 255));
					b013.setEnabled(false);
				}
				

				main.removeDownedShips();
				
				if(main.ships.size() == 0) {
					// finish game
					JOptionPane.showMessageDialog(null, "YOU WON :D");
					dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
				}
				
			}
		});
		contentPane.add(b013);
		
		JButton b014 = new JButton();
		b014.setBackground(new Color(255,192,203));
		b014.setForeground(new Color(255,192,203));
		b014.setBounds(450, 100, 30, 30);
		b014.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(main.hitShip(14, 0)) {
					b014.setBackground(new Color(102, 255, 204));
					b014.setEnabled(false);
				}
				else {
					b014.setBackground(new Color(102, 204, 255));
					b014.setEnabled(false);
				}
				

				main.removeDownedShips();
				
				if(main.ships.size() == 0) {
					// finish game
					JOptionPane.showMessageDialog(null, "YOU WON :D");
					dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
				}
				
			}
		});
		contentPane.add(b014);
		
		// LINE 2
		
		JButton b10 = new JButton();
		b10.setBackground(new Color(255,192,203));
		b10.setForeground(new Color(255,192,203));
		b10.setBounds(30, 130, 30, 30);
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(main.hitShip(0, 1)) {
					b10.setBackground(new Color(102, 255, 204));
					b10.setEnabled(false);
				}
				else {
					b10.setBackground(new Color(102, 204, 255));
					b10.setEnabled(false);
				}
				
				main.removeDownedShips();
				
				if(main.ships.size() == 0) {
					// finish game
					JOptionPane.showMessageDialog(null, "YOU WON :D");
					dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
				}
			}
		});
		contentPane.add(b10);
		
		JButton b11 = new JButton();
		b11.setBackground(new Color(255,192,203));
		b11.setForeground(new Color(255,192,203));
		b11.setBounds(60, 130, 30, 30);
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(main.hitShip(1, 1)) {
					b11.setBackground(new Color(102, 255, 204));
					b11.setEnabled(false);
				}
				else {
					b11.setBackground(new Color(102, 204, 255));
					b11.setEnabled(false);
				}
				
				main.removeDownedShips();
				
				if(main.ships.size() == 0) {
					// finish game
					JOptionPane.showMessageDialog(null, "YOU WON :D");
					dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
				}
				
			}
		});
		contentPane.add(b11);
		
		JButton b12 = new JButton();
		b12.setBackground(new Color(255,192,203));
		b12.setForeground(new Color(255,192,203));
		b12.setBounds(90, 130, 30, 30);
		b12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(main.hitShip(2, 1)) {
					b12.setBackground(new Color(102, 255, 204));
					b12.setEnabled(false);
				}
				else {
					b12.setBackground(new Color(102, 204, 255));
					b12.setEnabled(false);
				}
				
				main.removeDownedShips();
				
				if(main.ships.size() == 0) {
					// finish game
					JOptionPane.showMessageDialog(null, "YOU WON :D");
					dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
				}
				
			}
		});
		contentPane.add(b12);
		
		JButton b13 = new JButton();
		b13.setBackground(new Color(255,192,203));
		b13.setForeground(new Color(255,192,203));
		b13.setBounds(120, 130, 30, 30);
		b13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(main.hitShip(3, 1)) {
					b13.setBackground(new Color(102, 255, 204));
					b13.setEnabled(false);
				}
				else {
					b13.setBackground(new Color(102, 204, 255));
					b13.setEnabled(false);
				}

				main.removeDownedShips();
				
				if(main.ships.size() == 0) {
					// finish game
					JOptionPane.showMessageDialog(null, "YOU WON :D");
					dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
				}
				
			}
		});
		contentPane.add(b13);
		
		JButton b14 = new JButton();
		b14.setBackground(new Color(255,192,203));
		b14.setForeground(new Color(255,192,203));
		b14.setBounds(150, 130, 30, 30);
		b14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(main.hitShip(4, 0)) {
					b14.setBackground(new Color(102, 255, 204));
					b14.setEnabled(false);
				}
				else {
					b14.setBackground(new Color(102, 204, 255));
					b14.setEnabled(false);
				}
				

				main.removeDownedShips();
				
				if(main.ships.size() == 0) {
					// finish game
					JOptionPane.showMessageDialog(null, "YOU WON :D");
					dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
				}
			}
		});
		contentPane.add(b14);
		
		JButton b15 = new JButton();
		b15.setBackground(new Color(255,192,203));
		b15.setForeground(new Color(255,192,203));
		b15.setBounds(180, 130, 30, 30);
		b15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(main.hitShip(5, 1)) {
					b15.setBackground(new Color(102, 255, 204));
					b15.setEnabled(false);
				}
				else {
					b15.setBackground(new Color(102, 204, 255));
					b15.setEnabled(false);
				}
				

				main.removeDownedShips();
				
				if(main.ships.size() == 0) {
					// finish game
					JOptionPane.showMessageDialog(null, "YOU WON :D");
					dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
				}
				
			}
		});
		contentPane.add(b15);
		
		JButton b16 = new JButton();
		b16.setBackground(new Color(255,192,203));
		b16.setForeground(new Color(255,192,203));
		b16.setBounds(210, 130, 30, 30);
		b16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(main.hitShip(6, 1)) {
					b16.setBackground(new Color(102, 255, 204));
					b16.setEnabled(false);
				}
				else {
					b16.setBackground(new Color(102, 204, 255));
					b16.setEnabled(false);
				}
				

				main.removeDownedShips();
				
				if(main.ships.size() == 0) {
					// finish game
					JOptionPane.showMessageDialog(null, "YOU WON :D");
					dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
				}
				
			}
		});
		contentPane.add(b16);
		
		JButton b17 = new JButton();
		b17.setBackground(new Color(255,192,203));
		b17.setForeground(new Color(255,192,203));
		b17.setBounds(240, 130, 30, 30);
		b17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(main.hitShip(7, 1)) {
					b17.setBackground(new Color(102, 255, 204));
					b17.setEnabled(false);
				}
				else {
					b17.setBackground(new Color(102, 204, 255));
					b17.setEnabled(false);
				}
				

				main.removeDownedShips();
				
				if(main.ships.size() == 0) {
					// finish game
					JOptionPane.showMessageDialog(null, "YOU WON :D");
					dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
				}
				
			}
		});
		contentPane.add(b17);
		
		JButton b18 = new JButton();
		b18.setBackground(new Color(255,192,203));
		b18.setForeground(new Color(255,192,203));
		b18.setBounds(270, 130, 30, 30);
		b18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(main.hitShip(8, 1)) {
					b18.setBackground(new Color(102, 255, 204));
					b18.setEnabled(false);
				}
				else {
					b18.setBackground(new Color(102, 204, 255));
					b18.setEnabled(false);
				}
				

				main.removeDownedShips();
				
				if(main.ships.size() == 0) {
					// finish game
					JOptionPane.showMessageDialog(null, "YOU WON :D");
					dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
				}
			}
		});
		contentPane.add(b18);
		
		JButton b19 = new JButton();
		b19.setBackground(new Color(255,192,203));
		b19.setForeground(new Color(255,192,203));
		b19.setBounds(300, 130, 30, 30);
		b19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(main.hitShip(9, 1)) {
					b19.setBackground(new Color(102, 255, 204));
					b19.setEnabled(false);
				}
				else {
					b19.setBackground(new Color(102, 204, 255));
					b19.setEnabled(false);
				}
				

				main.removeDownedShips();
				
				if(main.ships.size() == 0) {
					// finish game
					JOptionPane.showMessageDialog(null, "YOU WON :D");
					dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
				}
				
			}
		});
		contentPane.add(b19);
		
		JButton b0110 = new JButton();
		b0110.setBackground(new Color(255,192,203));
		b0110.setForeground(new Color(255,192,203));
		b0110.setBounds(330, 130, 30, 30);
		b0110.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(main.hitShip(10, 1)) {
					b0110.setBackground(new Color(102, 255, 204));
					b0110.setEnabled(false);
				}
				else {
					b0110.setBackground(new Color(102, 204, 255));
					b0110.setEnabled(false);
				}
				

				main.removeDownedShips();
				
				if(main.ships.size() == 0) {
					// finish game
					JOptionPane.showMessageDialog(null, "YOU WON :D");
					dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
				}
				
			}
		});
		contentPane.add(b0110);
		
		JButton b0111 = new JButton();
		b0111.setBackground(new Color(255,192,203));
		b0111.setForeground(new Color(255,192,203));
		b0111.setBounds(360, 130, 30, 30);
		b0111.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(main.hitShip(11, 1)) {
					b0111.setBackground(new Color(102, 255, 204));
					b0111.setEnabled(false);
				}
				else {
					b0111.setBackground(new Color(102, 204, 255));
					b0111.setEnabled(false);
				}
				

				main.removeDownedShips();
				
				if(main.ships.size() == 0) {
					// finish game
					JOptionPane.showMessageDialog(null, "YOU WON :D");
					dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
				}
			}
		});
		contentPane.add(b0111);
		
		JButton b0112 = new JButton();
		b0112.setBackground(new Color(255,192,203));
		b0112.setForeground(new Color(255,192,203));
		b0112.setBounds(390, 130, 30, 30);
		b0112.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(main.hitShip(12, 1)) {
					b0112.setBackground(new Color(102, 255, 204));
					b0112.setEnabled(false);
				}
				else {
					b0112.setBackground(new Color(102, 204, 255));
					b0112.setEnabled(false);
				}
				

				main.removeDownedShips();
				
				if(main.ships.size() == 0) {
					// finish game
					JOptionPane.showMessageDialog(null, "YOU WON :D");
					dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
				}
				
			}
		});
		contentPane.add(b0112);
		
		JButton b0113 = new JButton();
		b0113.setBackground(new Color(255,192,203));
		b0113.setForeground(new Color(255,192,203));
		b0113.setBounds(420, 130, 30, 30);
		b0113.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(main.hitShip(13, 1)) {
					b0113.setBackground(new Color(102, 255, 204));
					b0113.setEnabled(false);
				}
				else {
					b0113.setBackground(new Color(102, 204, 255));
					b0113.setEnabled(false);
				}
				

				main.removeDownedShips();
				
				if(main.ships.size() == 0) {
					// finish game
					JOptionPane.showMessageDialog(null, "YOU WON :D");
					dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
				}
				
			}
		});
		contentPane.add(b0113);
		
		JButton b0114 = new JButton();
		b0114.setBackground(new Color(255,192,203));
		b0114.setForeground(new Color(255,192,203));
		b0114.setBounds(450, 130, 30, 30);
		b0114.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(main.hitShip(14, 1)) {
					b0114.setBackground(new Color(102, 255, 204));
					b0114.setEnabled(false);
				}
				else {
					b0114.setBackground(new Color(102, 204, 255));
					b0114.setEnabled(false);
				}
				

				main.removeDownedShips();
				
				if(main.ships.size() == 0) {
					// finish game
					JOptionPane.showMessageDialog(null, "YOU WON :D");
					dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
				}
				
			}
		});
		contentPane.add(b0114);
		
		
	}
}

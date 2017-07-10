import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import ships.*;
import util.*;

public class ui extends JFrame {
	
	private JPanel contentPane;
	Battleship battleship;
	
	int i, j;
	
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
		battleship = new Battleship();
		battleship.ships = new ArrayList<Ship>();
		battleship.table = new int[15][15];
		
		battleship.initTable();
		battleship.initShips();
		
		setResizable(false);
		setTitle("Battleship!");
		setForeground(new Color(255,192,203));
		setBackground(new Color(255,192,203));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(200, 100, 510, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255,192,203));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel bship = new JLabel("Battleship!");
		bship.setFont(new Font("Tahoma", Font.BOLD, 20));
		bship.setHorizontalAlignment(SwingConstants.CENTER);
		bship.setBounds(0, 5, 510, 70);
		contentPane.add(bship);
		
		
		for (i = 0; i < 15; i++) {
			for (j = 0; j < 15; j++) {
				JButton b = new JButton();
				b.setBackground(new Color(255,192,203));
				b.setForeground(new Color(255,192,203));
				b.setBounds(30+(j*30), 100+(i*30), 30, 30);
				
				final int I = i;
				final int J = j;
				
				b.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(battleship.hitShip(J, I)) {
							b.setBackground(new Color(102, 255, 204));
							b.setEnabled(false);
						}
						else {
							b.setBackground(new Color(102, 204, 255));
							b.setEnabled(false);
						}
						
						battleship.removeDownedShips();
						
						if(battleship.ships.size() == 0) {
							// finish game
							JOptionPane.showMessageDialog(null, "YOU WON :D");
							setVisible(false); dispose();
						}
					}
				});
				contentPane.add(b);
			}
		}
	}
}

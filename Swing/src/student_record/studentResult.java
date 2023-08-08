package student_record;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class studentResult {

	private JFrame frame;
	private JTextField name;
	private JTextField meng;
	private JTextField mtel;
	private JTextField mhin;
	private JTextField mmat;
	private JTextField msci;
	private JTextField msoc;
	private JTextField total;
	private JTextField percent;
	private JTextField grade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentResult window = new studentResult();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public studentResult() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Result");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel.setBounds(319, 24, 225, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(285, 92, 92, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		name = new JTextField();
		name.setBounds(402, 97, 209, 28);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Subject");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(146, 162, 92, 28);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Marks");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(315, 162, 92, 28);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Grade");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(485, 162, 92, 28);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("English");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_4.setBounds(146, 210, 92, 28);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Telugu");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_5.setBounds(146, 259, 92, 28);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Hindi");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_6.setBounds(146, 307, 92, 28);
		frame.getContentPane().add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Maths");
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_7.setBounds(146, 354, 92, 28);
		frame.getContentPane().add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("Science");
		lblNewLabel_1_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_8.setBounds(146, 392, 92, 28);
		frame.getContentPane().add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_9 = new JLabel("Social");
		lblNewLabel_1_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_9.setBounds(146, 438, 92, 28);
		frame.getContentPane().add(lblNewLabel_1_9);
		
		JLabel lblNewLabel_1_10 = new JLabel("Total :");
		lblNewLabel_1_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_10.setBounds(198, 498, 92, 28);
		frame.getContentPane().add(lblNewLabel_1_10);
		
		JLabel lblNewLabel_1_11 = new JLabel("Percentage :");
		lblNewLabel_1_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_11.setBounds(468, 498, 143, 28);
		frame.getContentPane().add(lblNewLabel_1_11);
		
		meng = new JTextField();
		meng.setHorizontalAlignment(SwingConstants.CENTER);
		meng.setColumns(10);
		meng.setBounds(297, 215, 92, 28);
		frame.getContentPane().add(meng);
		
		mtel = new JTextField();
		mtel.setHorizontalAlignment(SwingConstants.CENTER);
		mtel.setColumns(10);
		mtel.setBounds(297, 259, 92, 28);
		frame.getContentPane().add(mtel);
		
		mhin = new JTextField();
		mhin.setHorizontalAlignment(SwingConstants.CENTER);
		mhin.setColumns(10);
		mhin.setBounds(297, 307, 92, 28);
		frame.getContentPane().add(mhin);
		
		mmat = new JTextField();
		mmat.setHorizontalAlignment(SwingConstants.CENTER);
		mmat.setColumns(10);
		mmat.setBounds(297, 354, 92, 28);
		frame.getContentPane().add(mmat);
		
		msci = new JTextField();
		msci.setHorizontalAlignment(SwingConstants.CENTER);
		msci.setColumns(10);
		msci.setBounds(297, 392, 92, 28);
		frame.getContentPane().add(msci);
		
		msoc = new JTextField();
		msoc.setHorizontalAlignment(SwingConstants.CENTER);
		msoc.setColumns(10);
		msoc.setBounds(297, 438, 92, 28);
		frame.getContentPane().add(msoc);
		
		total = new JTextField();
		total.setHorizontalAlignment(SwingConstants.CENTER);
		total.setColumns(10);
		total.setBounds(315, 498, 92, 28);
		frame.getContentPane().add(total);
		
		percent = new JTextField();
		percent.setHorizontalAlignment(SwingConstants.CENTER);
		percent.setColumns(10);
		percent.setBounds(621, 498, 92, 28);
		frame.getContentPane().add(percent);
		
		grade = new JTextField();
		grade.setHorizontalAlignment(SwingConstants.CENTER);
		grade.setColumns(10);
		grade.setBounds(584, 167, 92, 28);
		frame.getContentPane().add(grade);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Name = name.getText();
			 
				try {
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database name","root","password");
					Statement stm = con.createStatement();
				PreparedStatement pst = con.prepareStatement("select Name,ENG,TEL,HIN,MAT,SCI,SOC,Total,percent,Grade from exam1 where Name=?");
				pst.setString(1, Name);
				ResultSet R = pst.executeQuery();
				
				if(R.next()==false) {
					 JOptionPane.showMessageDialog(null,"No Data Found....");
					    name.setText("");
						mtel.setText("");
						meng.setText("");
						mhin.setText("");
						mmat.setText("");
						msci.setText("");
						msoc.setText("");
						grade.setText("");
						total.setText("");
						percent.setText("");
				}
				else {
					mtel.setText(R.getString("TEL"));
					meng.setText(R.getString("ENG"));
					mhin.setText(R.getString("HIN"));
					mmat.setText(R.getString("MAT"));
					msci.setText(R.getString("SCI"));
					msoc.setText(R.getString("SOC"));
					
					
					grade.setText(R.getString("Grade"));
					
					total.setText(R.getString("Total"));
					percent.setText(R.getString("Percent")+"%");
					
				}
		
					stm.close();
					con.close();
				
				}catch (SQLException e1) {
					
					e1.printStackTrace();
				}
	
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(650, 92, 104, 33);
		frame.getContentPane().add(btnNewButton);
		
		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name.setText("");
				mtel.setText("");
				meng.setText("");
				mhin.setText("");
				mmat.setText("");
				msci.setText("");
				msoc.setText("");
				grade.setText("");
				total.setText("");
				percent.setText("");
				
				
			}
		});
		clear.setFont(new Font("Tahoma", Font.BOLD, 18));
		clear.setBounds(406, 556, 104, 33);
		frame.getContentPane().add(clear);
	}
}

package student_record;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;

import javax.sound.sampled.Line;
import javax.swing.BoxLayout;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.geom.Line2D;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class studentRecord {

	private JFrame frame;
	private JTextField name;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField rollno;
	private JTextField tel;
	private JTextField eng;
	private JTextField hin;
	private JTextField mat;
	private JTextField sci;
	private JTextField soc;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentRecord window = new studentRecord();
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
	public studentRecord() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1100, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		name = new JTextField();
		name.setBounds(190, 116, 241, 30);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		Line2D line = new Line2D.Float(200,100,100,200);
	
		
		
		
		JLabel lblNewLabel = new JLabel("STUDENT RECORD");
		lblNewLabel.setForeground(new Color(34, 139, 34));
		lblNewLabel.setBackground(new Color(34, 139, 34));
		lblNewLabel.setFont(new Font("Tunga", Font.BOLD, 35));
		lblNewLabel.setBounds(414, 32, 268, 42);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Name  :");
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 21));
		lblNewLabel_1.setBounds(63, 114, 103, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Roll No :");
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 21));
		lblNewLabel_2.setBounds(546, 116, 103, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		rollno = new JTextField();
		rollno.setColumns(10);
		rollno.setBounds(677, 116, 241, 30);
		frame.getContentPane().add(rollno);
		
		tel = new JTextField();
		tel.setHorizontalAlignment(SwingConstants.CENTER);
		tel.setColumns(10);
		tel.setBounds(498, 210, 111, 30);
		frame.getContentPane().add(tel);
		
		eng = new JTextField();
		eng.setHorizontalAlignment(SwingConstants.CENTER);
		eng.setColumns(10);
		eng.setBounds(498, 267, 111, 30);
		frame.getContentPane().add(eng);
		
		hin = new JTextField();
		hin.setHorizontalAlignment(SwingConstants.CENTER);
		hin.setColumns(10);
		hin.setBounds(498, 317, 111, 30);
		frame.getContentPane().add(hin);
		
		mat = new JTextField();
		mat.setHorizontalAlignment(SwingConstants.CENTER);
		mat.setColumns(10);
		mat.setBounds(498, 367, 111, 30);
		frame.getContentPane().add(mat);
		
		sci = new JTextField();
		sci.setHorizontalAlignment(SwingConstants.CENTER);
		sci.setColumns(10);
		sci.setBounds(498, 419, 111, 30);
		frame.getContentPane().add(sci);
		
		soc = new JTextField();
		soc.setHorizontalAlignment(SwingConstants.CENTER);
		soc.setColumns(10);
		soc.setBounds(498, 469, 111, 30);
		frame.getContentPane().add(soc);
		
		lblNewLabel_3 = new JLabel("TEL    :");
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 21));
		lblNewLabel_3.setBounds(357, 208, 103, 22);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("ENG   :");
		lblNewLabel_4.setFont(new Font("Verdana", Font.BOLD, 21));
		lblNewLabel_4.setBounds(357, 265, 103, 22);
		frame.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("HIN   :");
		lblNewLabel_5.setFont(new Font("Verdana", Font.BOLD, 21));
		lblNewLabel_5.setBounds(357, 315, 103, 22);
		frame.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("MAT   :");
		lblNewLabel_6.setFont(new Font("Verdana", Font.BOLD, 21));
		lblNewLabel_6.setBounds(357, 365, 103, 22);
		frame.getContentPane().add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("SCI    :");
		lblNewLabel_7.setFont(new Font("Verdana", Font.BOLD, 21));
		lblNewLabel_7.setBounds(357, 417, 103, 22);
		frame.getContentPane().add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("SOC   :");
		lblNewLabel_8.setFont(new Font("Verdana", Font.BOLD, 21));
		lblNewLabel_8.setBounds(357, 467, 103, 22);
		frame.getContentPane().add(lblNewLabel_8);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Name = name.getText();
				String Rollno = rollno.getText();
				int Eng = Integer.parseInt(eng.getText());
				int Tel = Integer.parseInt(tel.getText());
				int Hin = Integer.parseInt(hin.getText());
				int Mat = Integer.parseInt(mat.getText());
				int Sci = Integer.parseInt(sci.getText());
				int Soc = Integer.parseInt(soc.getText());
				
				
				System.out.println(Eng);
				System.out.println(Tel);
				System.out.println(Hin);
				System.out.println(Mat);

				char status=0,grade = 0;

				
				float total = Eng+Tel+Hin+Mat+Sci+Soc;
				float percent = (total/600)*100;
				int english = Eng;
				int telugu = Tel;
				int hindi = Hin;
				int maths = Mat;
				int science = Sci;
				int social = Soc;
				
				
				if(telugu<35) {
					status = 'F';
				}
				else if(english<35) {
					status = 'F';
				}
				else if(hindi<35) {
					status = 'F';
				}
				else if(maths<35) {
					status = 'F';
				}
				else if(science<35) {
					status = 'F';
				}
				else if(social<35) {
					status = 'F';
				}
				else {
					status = 'P';
				}
				
				
				if(status=='P') {
				if( percent >=90) {
					 grade = 'A';				
				}
				else if(percent <=90 & percent>=80) {
					 grade = 'B';
				}
				else if(percent <=80 & percent>=70) {
					 grade = 'C';
				}
				else if(percent <=70 & percent>=60) {
					 grade = 'D';
				}
				else if(percent <=60 & percent>=40) {
					 grade = 'E';
				}
				}
				else {
					grade = 'F';
				}
				
			
			
				
				
				try {
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database name","root","password");
					Statement stm = con.createStatement();
					String sql = "insert into exam1 values ('"+Rollno+"','"+Name+"','"+Eng+"','"+Tel+"','"+Hin+"','"+Mat+"','"+Sci+"','"+Soc+"','"+total+"',"
							+ "'"+percent+"','"+status+"','"+grade+"')";
				    stm.executeUpdate(sql);
				    JOptionPane.showMessageDialog(null,"Data Added Successfully...");
					stm.close();
					con.close();
					
				    name.setText(" ");
					rollno.setText("");
					eng.setText("");
					tel.setText("");
					hin.setText("");
					mat.setText("");
					sci.setText("");
				    soc.setText("");
				    
				
				}catch (SQLException e1) {
					
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 19));
		btnNewButton.setBounds(426, 533, 132, 49);
		frame.getContentPane().add(btnNewButton);
	}
}

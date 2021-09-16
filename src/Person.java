import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Formatter;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;

public class Person {
	private JFrame frame;
	private JButton Staff;
	private JButton Students;
	private JList Staffs;
	private JButton ManagementStaff;
	
	public Person() {
		
	frame=new JFrame("Select Option");
	frame.setLayout(new BorderLayout() );
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container pane=frame.getContentPane();
	pane.setBackground(new Color(102,0,153));
	frame.setSize(500, 300);
	frame.setVisible(true);
	frame.setLayout(new FlowLayout());
	
	//Staff
	//String work[]= {"Staff","Management Staff"};
	//Staffs=new JList(work);
	//Staffs.setVisible(true);
	//Staffs.setVisibleRowCount(2);
	//Staffs.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	//frame.add(new JScrollPane(Staffs));
	
	Staff=new JButton("Staff");
	ManagementStaff=new JButton("Management Staff");
	frame.add(ManagementStaff);
	frame.add(Staff);
	
	Students=new JButton("Students");
	frame.add(Students,BorderLayout.NORTH);
	
	Events e=new Events();
	Staff.addActionListener(e);
	ManagementStaff.addActionListener(e);
	Students.addActionListener(e);
}
	public class Events implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==Staff) {
				new Staff();
				
			}
			else if (e.getSource()==Students){
				new Student();
				frame.dispose();
			}
			else if (e.getSource()==ManagementStaff) {
				new ManagementStaff();
				frame.dispose();
			}
			
		}
		
	}

		}
		
	
	

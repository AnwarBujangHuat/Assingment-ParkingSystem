import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

import javax.swing.*;

public class Student {
	
	private JFrame frame;
	private JTextField name;
	private JTextField id;
	private JButton Save;
	private JList Block;
	private JButton Vehicles;
	private JLabel names;
	private JLabel ids;
	private Formatter x;
	private JLabel Parkings;
	private static String Summery;
	private Scanner sc;
	
	public Student() {
		
		//create Frame
		
		frame=new JFrame("Students");	
		frame.setLayout(new FlowLayout());
		frame.setSize(300, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container paneContainer=frame.getContentPane();
		paneContainer.setBackground(new Color(197,179,88));
		
		
		name=new JTextField(23);
		id=new JTextField(15);
		Save=new JButton("Save Records");
		Vehicles=new JButton("Vehicle");
		names=new JLabel("Name :");
		ids=new JLabel("ID :");
		Parkings=new JLabel("Parking");
		
		//creating JList
		String Blocks[]= {"Block A","Block B","Block C"};
		Block=new JList(Blocks);
		Block.setVisibleRowCount(3);
		Block.setVisible(true);
		Block.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		
		frame.add(names);
		frame.add(name);
		frame.add(ids);
		frame.add(id);
		frame.add(Parkings);
		frame.add(new JScrollPane(Block));
		frame.add(Vehicles);
		//frame.add(Save);
		
		Saving Saves=new Saving();
		Vehicles.addActionListener(Saves);
		
	}
	
	private class Saving implements ActionListener{
		
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==Vehicles) {
				String SaveNames="";
				String Saveid="";
				String s = (String) Block.getSelectedValue();
				
				SaveNames=name.getText().trim();
				Saveid=id.getText().trim();
				
				Summery = ("Names :"+ SaveNames+"     "+ "Identification : "+Saveid+"    "+"Parking Block :"+s);
				String Data=Student.Summery;
				
				//create a file
				try{
					//sc=new Scanner(new File("D:\\NOTES SEM 2\\Reka Bentuk Aturcara\\Assingment\\ParkingFile"+SaveNames));
					x=new Formatter(SaveNames);
					x.format("%s",Data);
					x.close();
					frame.dispose();
				}
				catch(Exception exception) {
					System.out.println("error");
				}
				
				new Vehicle(
						SaveNames);
			}
			
			
			
			
		}
		
		
		
		
		
	
	

	}
}
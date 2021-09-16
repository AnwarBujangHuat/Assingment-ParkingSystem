import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
public class Vehicle {

	
	private String SaveNames;
	private JFrame frame;
	private JButton Noplate;
	private JList NoOfCar;
	private JLabel Noofcar;
	private JLabel max;
	
	
	
public Vehicle(String SaveNames) {
	this.SaveNames=SaveNames;
	frame=new JFrame("Vehicle");
	frame.setVisible(true);
	frame.setLayout(new FlowLayout());
	Container pane=frame.getContentPane();
	pane.setBackground(new Color(197,179,88));
	frame.setSize(300, 400);
	
	//set content
	Noplate=new JButton("Insert Plate No");
	Noofcar=new JLabel("No of Car");
	String number[]= {"1","2","3","4","5","6","7","8","9","10"};
	NoOfCar=new JList(number);
	NoOfCar.setVisibleRowCount(10);
	NoOfCar.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	
	max=new JLabel("                            Maximum no of car is 10                                 ");
	
	frame.add(max);
	frame.add(Noofcar);
	frame.add(NoOfCar);
	frame.add(Noplate);
	
	The Action=new The();
	Noplate.addActionListener(Action);
	
	}
public class The implements ActionListener{

	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Noplate) {
			String NoOfCarSave="";
			
			NoOfCarSave=(String) NoOfCar.getSelectedValue();
			
			int Car=Integer.parseInt(NoOfCarSave);
			
			new PlateNo(Car,SaveNames);
			frame.dispose();
		}
		
	}
	
}
}

import javax.swing.*;
import javax.swing.plaf.basic.BasicTreeUI.SelectionModelPropertyChangeHandler;

import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
public class PlateNo {
	
	private JFrame frame;
	private JTextField plateno;
	private JLabel Plateno;
	private JTextField Platenos;
	private JButton Enter;
	private Scanner sc;
	private String SaveNames;
	private Formatter x;
	private int car;
	private JTextField[] no;
	private JList[]List;
	

	
	public PlateNo(int car,String SaveNames) {
		this.no=new JTextField[car];
		this.car=car;
		this.SaveNames=SaveNames;
		frame=new JFrame("Plate NO");
		Container pane=frame.getContentPane();
		frame.setLayout(new FlowLayout());
		pane.setBackground(new Color(197,179,88));
		frame.setSize(300, 550);
		frame.setVisible(true);
		Enter=new JButton("Enter");
		String Vehicle[]= {"Car","Motorcycle"};
		this.List=new JList[car];
		JLabel[]No=new JLabel[car];
		Events e=new Events();
		Enter.addActionListener(e);
		
		
		
		if(car==1) {
		No[0]=new JLabel("Plate No 1 :");
		no[0]=new JTextField(10);
		List[0] = new JList(Vehicle);
		List[0].setVisibleRowCount(2);
		List[0].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		frame.add(new JScrollPane(List[0]));
		frame.add(No[0]);
		frame.add(no[0]);
		frame.add(Enter);
		
		}
		else if(car==2) {
			No[0]=new JLabel("Plate No 1 :");
			no[0]=new JTextField(10);
			No[1]=new JLabel("Plate No 2 :");
			no[1]=new JTextField(10);
			List[0] = new JList(Vehicle);
			List[0].setVisibleRowCount(2);
			List[0].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[0]));
			frame.add(No[0]);
			frame.add(no[0]);
			List[1] = new JList(Vehicle);
			List[1].setVisibleRowCount(2);
			List[1].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[1]));
			frame.add(No[1]);
			frame.add(no[1]);
			frame.add(Enter);
		}
		else if(car==3) {
			No[0]=new JLabel("Plate No 1 :");
			no[0]=new JTextField(10);
			No[1]=new JLabel("Plate No 2 :");
			no[1]=new JTextField(10);
			No[2]=new JLabel("Plate No 3 :");
			no[2]=new JTextField(10);
			List[0] = new JList(Vehicle);
			List[0].setVisibleRowCount(2);
			List[0].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[0]));
			frame.add(No[0]);
			frame.add(no[0]);
			List[1] = new JList(Vehicle);
			List[1].setVisibleRowCount(2);
			List[1].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[1]));
			frame.add(No[1]);
			frame.add(no[1]);
			List[2]= new JList(Vehicle);
			List[2].setVisibleRowCount(2);
			List[2].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[2]));
			frame.add(No[2]);
			frame.add(no[2]);
			frame.add(Enter);
		}
		else if(car==4) {
			No[0]=new JLabel("Plate No 1 :");
			no[0]=new JTextField(10);
			No[1]=new JLabel("Plate No 2 :");
			no[1]=new JTextField(10);
			No[2]=new JLabel("Plate No 3 :");
			no[2]=new JTextField(10);
			No[3]=new JLabel("Plate No 4 :");
			no[3]=new JTextField(10);
			List[0] = new JList(Vehicle);
			List[0].setVisibleRowCount(2);
			List[0].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[0]));
			frame.add(No[0]);
			frame.add(no[0]);
			List[1] = new JList(Vehicle);
			List[1].setVisibleRowCount(2);
			List[1].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[1]));
			frame.add(No[1]);
			frame.add(no[1]);
			List[2]= new JList(Vehicle);
			List[2].setVisibleRowCount(2);
			List[2].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[2]));
			frame.add(No[2]);
			frame.add(no[2]);
			List[3] = new JList(Vehicle);
			List[3].setVisibleRowCount(2);
			List[3].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[3]));
			frame.add(No[3]);
			frame.add(no[3]);
			frame.add(Enter);
		}
		else if(car==5) {
			No[0]=new JLabel("Plate No 1 :");
			no[0]=new JTextField(10);
			No[1]=new JLabel("Plate No 2 :");
			no[1]=new JTextField(10);
			No[2]=new JLabel("Plate No 3 :");
			no[2]=new JTextField(10);
			No[3]=new JLabel("Plate No 4 :");
			no[3]=new JTextField(10);
			No[4]=new JLabel("Plate No 5 :");
			no[4]=new JTextField(10);
			List[0] = new JList(Vehicle);
			List[0].setVisibleRowCount(2);
			List[0].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[0]));
			frame.add(No[0]);
			frame.add(no[0]);
			List[1] = new JList(Vehicle);
			List[1].setVisibleRowCount(2);
			List[1].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[1]));
			frame.add(No[1]);
			frame.add(no[1]);
			List[2]= new JList(Vehicle);
			List[2].setVisibleRowCount(2);
			List[2].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[2]));
			frame.add(No[2]);
			frame.add(no[2]);
			List[3] = new JList(Vehicle);
			List[3].setVisibleRowCount(2);
			List[3].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[3]));
			frame.add(No[3]);
			frame.add(no[3]);
			List[4] = new JList(Vehicle);
			List[4].setVisibleRowCount(2);
			List[4].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[4]));
			frame.add(No[4]);
			frame.add(no[4]);
			frame.add(Enter);
			
		
			
			
			
		}
		else if(car==6) {
			No[0]=new JLabel("Plate No 1 :");
			no[0]=new JTextField(10);
			No[1]=new JLabel("Plate No 2 :");
			no[1]=new JTextField(10);
			No[2]=new JLabel("Plate No 3 :");
			no[2]=new JTextField(10);
			No[3]=new JLabel("Plate No 4 :");
			no[3]=new JTextField(10);
			No[4]=new JLabel("Plate No 5 :");
			no[4]=new JTextField(10);
			No[5]=new JLabel("Plate No 6 :");
			no[5]=new JTextField(10);
			List[0] = new JList(Vehicle);
			List[0].setVisibleRowCount(2);
			List[0].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[0]));
			frame.add(No[0]);
			frame.add(no[0]);
			List[1] = new JList(Vehicle);
			List[1].setVisibleRowCount(2);
			List[1].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[1]));
			frame.add(No[1]);
			frame.add(no[1]);
			List[2]= new JList(Vehicle);
			List[2].setVisibleRowCount(2);
			List[2].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[2]));
			frame.add(No[2]);
			frame.add(no[2]);
			List[3] = new JList(Vehicle);
			List[3].setVisibleRowCount(2);
			List[3].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[3]));
			frame.add(No[3]);
			frame.add(no[3]);
			List[4] = new JList(Vehicle);
			List[4].setVisibleRowCount(2);
			List[4].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[4]));
			frame.add(No[4]);
			frame.add(no[4]);
			List[5] = new JList(Vehicle);
			List[5].setVisibleRowCount(2);
			List[5].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[5]));
			frame.add(No[5]);
			frame.add(no[5]);
			frame.add(Enter);
			
		
			
			
		}
		else if(car==7) {
			No[0]=new JLabel("Plate No 1 :");
			no[0]=new JTextField(10);
			No[1]=new JLabel("Plate No 2 :");
			no[1]=new JTextField(10);
			No[2]=new JLabel("Plate No 3 :");
			no[2]=new JTextField(10);
			No[3]=new JLabel("Plate No 4 :");
			no[3]=new JTextField(10);
			No[4]=new JLabel("Plate No 5 :");
			no[4]=new JTextField(10);
			No[5]=new JLabel("Plate No 6 :");
			no[5]=new JTextField(10);
			No[6]=new JLabel("Plate No 7 :");
			no[6]=new JTextField(10);
			List[0] = new JList(Vehicle);
			List[0].setVisibleRowCount(2);
			List[0].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[0]));
			frame.add(No[0]);
			frame.add(no[0]);
			List[1] = new JList(Vehicle);
			List[1].setVisibleRowCount(2);
			List[1].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[1]));
			frame.add(No[1]);
			frame.add(no[1]);
			List[2]= new JList(Vehicle);
			List[2].setVisibleRowCount(2);
			List[2].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[2]));
			frame.add(No[2]);
			frame.add(no[2]);
			List[3] = new JList(Vehicle);
			List[3].setVisibleRowCount(2);
			List[3].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[3]));
			frame.add(No[3]);
			frame.add(no[3]);
			List[4] = new JList(Vehicle);
			List[4].setVisibleRowCount(2);
			List[4].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[4]));
			frame.add(No[4]);
			frame.add(no[4]);
			List[5] = new JList(Vehicle);
			List[5].setVisibleRowCount(2);
			List[5].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[5]));
			frame.add(No[5]);
			frame.add(no[5]);
			 List[6] = new JList(Vehicle);
			List[6].setVisibleRowCount(2);
			List[6].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[6]));
			frame.add(No[6]);
			frame.add(no[6]);
			frame.add(Enter);
			
			
			
			
			
		}
		else if(car==8) {
			No[0]=new JLabel("Plate No 1 :");
			no[0]=new JTextField(10);
			No[1]=new JLabel("Plate No 2 :");
			no[1]=new JTextField(10);
			No[2]=new JLabel("Plate No 3 :");
			no[2]=new JTextField(10);
			No[3]=new JLabel("Plate No 4 :");
			no[3]=new JTextField(10);
			No[4]=new JLabel("Plate No 5 :");
			no[4]=new JTextField(10);
			No[5]=new JLabel("Plate No 6 :");
			no[5]=new JTextField(10);
			No[6]=new JLabel("Plate No 7 :");
			no[6]=new JTextField(10);
			No[7]=new JLabel("Plate No 8 :");
			no[7]=new JTextField(10);
			List[0] = new JList(Vehicle);
			List[0].setVisibleRowCount(2);
			List[0].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[0]));
			frame.add(No[0]);
			frame.add(no[0]);
			List[1] = new JList(Vehicle);
			List[1].setVisibleRowCount(2);
			List[1].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[1]));
			frame.add(No[1]);
			frame.add(no[1]);
			List[2]= new JList(Vehicle);
			List[2].setVisibleRowCount(2);
			List[2].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[2]));
			frame.add(No[2]);
			frame.add(no[2]);
			List[3] = new JList(Vehicle);
			List[3].setVisibleRowCount(2);
			List[3].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[3]));
			frame.add(No[3]);
			frame.add(no[3]);
			List[4] = new JList(Vehicle);
			List[4].setVisibleRowCount(2);
			List[4].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[4]));
			frame.add(No[4]);
			frame.add(no[4]);
			List[5] = new JList(Vehicle);
			List[5].setVisibleRowCount(2);
			List[5].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[5]));
			frame.add(No[5]);
			frame.add(no[5]);
			 List[6] = new JList(Vehicle);
			List[6].setVisibleRowCount(2);
			List[6].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[6]));
			frame.add(No[6]);
			frame.add(no[6]);
			List[7] = new JList(Vehicle);
			List[7].setVisibleRowCount(2);
			List[7].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[7]));
			frame.add(No[7]);
			frame.add(no[7]);
			frame.add(Enter);
			
			
		
		}
		else if(car==9) {
			
			No[0]=new JLabel("Plate No 1 :");
			no[0]=new JTextField(10);
			No[1]=new JLabel("Plate No 2 :");
			no[1]=new JTextField(10);
			No[2]=new JLabel("Plate No 3 :");
			no[2]=new JTextField(10);
			No[3]=new JLabel("Plate No 4 :");
			no[3]=new JTextField(10);
			No[4]=new JLabel("Plate No 5 :");
			no[4]=new JTextField(10);
			No[5]=new JLabel("Plate No 6 :");
			no[5]=new JTextField(10);
			No[6]=new JLabel("Plate No 7 :");
			no[6]=new JTextField(10);
			No[7]=new JLabel("Plate No 8 :");
			no[7]=new JTextField(10);
			No[8]=new JLabel("Plate No 9 :");
			no[8]=new JTextField(10);
			List[0] = new JList(Vehicle);
			List[0].setVisibleRowCount(2);
			List[0].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[0]));
			frame.add(No[0]);
			frame.add(no[0]);
			List[1] = new JList(Vehicle);
			List[1].setVisibleRowCount(2);
			List[1].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[1]));
			frame.add(No[1]);
			frame.add(no[1]);
			List[2]= new JList(Vehicle);
			List[2].setVisibleRowCount(2);
			List[2].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[2]));
			frame.add(No[2]);
			frame.add(no[2]);
			List[3] = new JList(Vehicle);
			List[3].setVisibleRowCount(2);
			List[3].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[3]));
			frame.add(No[3]);
			frame.add(no[3]);
			List[4] = new JList(Vehicle);
			List[4].setVisibleRowCount(2);
			List[4].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[4]));
			frame.add(No[4]);
			frame.add(no[4]);
			List[5] = new JList(Vehicle);
			List[5].setVisibleRowCount(2);
			List[5].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[5]));
			frame.add(No[5]);
			frame.add(no[5]);
			 List[6] = new JList(Vehicle);
			List[6].setVisibleRowCount(2);
			List[6].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[6]));
			frame.add(No[6]);
			frame.add(no[6]);
			List[7] = new JList(Vehicle);
			List[7].setVisibleRowCount(2);
			List[7].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[7]));
			frame.add(No[7]);
			frame.add(no[7]);
			 List[8] = new JList(Vehicle);
			List[8].setVisibleRowCount(2);
			List[8].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[8]));
			frame.add(No[8]);
			frame.add(no[8]);
			frame.add(Enter);
	}
		else if(car==10) {
			
			No[0]=new JLabel("Plate No 1 :");
			no[0]=new JTextField(10);
			No[1]=new JLabel("Plate No 2 :");
			no[1]=new JTextField(10);
			No[2]=new JLabel("Plate No 3 :");
			no[2]=new JTextField(10);
			No[3]=new JLabel("Plate No 4 :");
			no[3]=new JTextField(10);
			No[4]=new JLabel("Plate No 5 :");
			no[4]=new JTextField(10);
			No[5]=new JLabel("Plate No 6 :");
			no[5]=new JTextField(10);
			No[6]=new JLabel("Plate No 7 :");
			no[6]=new JTextField(10);
			No[7]=new JLabel("Plate No 8 :");
			no[7]=new JTextField(10);
			No[8]=new JLabel("Plate No 9 :");
			no[8]=new JTextField(10);
			No[9]=new JLabel("Plate No 10 :");
			no[9]=new JTextField(10);
			
			
			List[0] = new JList(Vehicle);
			List[0].setVisibleRowCount(2);
			List[0].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[0]));
			frame.add(No[0]);
			frame.add(no[0]);
			List[1] = new JList(Vehicle);
			List[1].setVisibleRowCount(2);
			List[1].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[1]));
			frame.add(No[1]);
			frame.add(no[1]);
			List[2]= new JList(Vehicle);
			List[2].setVisibleRowCount(2);
			List[2].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[2]));
			frame.add(No[2]);
			frame.add(no[2]);
			List[3] = new JList(Vehicle);
			List[3].setVisibleRowCount(2);
			List[3].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[3]));
			frame.add(No[3]);
			frame.add(no[3]);
			List[4] = new JList(Vehicle);
			List[4].setVisibleRowCount(2);
			List[4].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[4]));
			frame.add(No[4]);
			frame.add(no[4]);
			List[5] = new JList(Vehicle);
			List[5].setVisibleRowCount(2);
			List[5].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[5]));
			frame.add(No[5]);
			frame.add(no[5]);
			 List[6] = new JList(Vehicle);
			List[6].setVisibleRowCount(2);
			List[6].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[6]));
			frame.add(No[6]);
			frame.add(no[6]);
			List[7] = new JList(Vehicle);
			List[7].setVisibleRowCount(2);
			List[7].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[7]));
			frame.add(No[7]);
			frame.add(no[7]);
			 List[8] = new JList(Vehicle);
			List[8].setVisibleRowCount(2);
			List[8].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[8]));
			frame.add(No[8]);
			frame.add(no[8]);
			List[9] = new JList(Vehicle);
			List[9].setVisibleRowCount(2);
			List[9].setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			frame.add(new JScrollPane(List[9]));
			frame.add(No[9]);
			frame.add(no[9]);
			frame.add(Enter);
		
		}
		else if (car>10) {
			JOptionPane.showMessageDialog(null, "No More Than 10 Vehicle");
			frame.dispose();
			
		}
		
		}
		public class Events implements ActionListener{
//pick up where we left now u can add data in file
			
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==Enter) {
					try {
						FileWriter fw=new FileWriter(SaveNames,true);
						BufferedWriter Buff=new BufferedWriter(fw);
						
						String[]Summery=new String[car];
						String[] Plate=new String[10];
						String[] V=new String[10];
						
						
						if(car==10) {
								
							V[0]=(String) List[0].getSelectedValue();
							Plate[0]=no[0].getText().trim();
							Summery[0]=("Vehicle Type : "+ V[0]+"   Plate Number : "+Plate[0]);
							Buff.newLine();
							Buff.write(Summery[0]);
							V[1]=(String)List[1].getSelectedValue();
							Plate[1]=no[1].getText().trim();
							Summery[1]=("Vehicle Type : "+ V[1]+"   Plate Number : "+Plate[1]);
							Buff.newLine();
							Buff.write(Summery[1]);
							V[2]=(String) List[2].getSelectedValue();
							Plate[2]=no[2].getText().trim();
							Summery[2]=("Vehicle Type : "+ V[2]+"   Plate Number : "+Plate[2]);
							Buff.newLine();
							Buff.write(Summery[2]);
							V[3]=(String)List[3].getSelectedValue();
							Plate[3]=no[3].getText().trim();
							Summery[3]=("Vehicle Type : "+ V[3]+"   Plate Number : "+Plate[3]);
							Buff.newLine();
							Buff.write(Summery[3]);
							V[4]=(String) List[4].getSelectedValue();
							Plate[4]=no[4].getText().trim();
							Summery[4]=("Vehicle Type : "+ V[4]+"   Plate Number : "+Plate[4]);
							Buff.newLine();
							Buff.write(Summery[4]);
							V[5]=(String)List[5].getSelectedValue();
							Plate[5]=no[5].getText().trim();
							Summery[5]=("Vehicle Type : "+ V[5]+"   Plate Number : "+Plate[5]);
							Buff.newLine();
							Buff.write(Summery[5]);
							V[6]=(String) List[6].getSelectedValue();
							Plate[6]=no[6].getText().trim();
							Summery[6]=("Vehicle Type : "+ V[6]+"   Plate Number : "+Plate[6]);
							Buff.newLine();
							Buff.write(Summery[6]);
							V[7]=(String)List[7].getSelectedValue();
							Plate[7]=no[7].getText().trim();
							Summery[7]=("Vehicle Type : "+ V[7]+"   Plate Number : "+Plate[7]);
							Buff.newLine();
							Buff.write(Summery[7]);
							V[8]=(String) List[8].getSelectedValue();
							Plate[8]=no[8].getText().trim();
							Summery[8]=("Vehicle Type : "+ V[8]+"   Plate Number : "+Plate[8]);
							Buff.newLine();
							Buff.write(Summery[8]);
							V[9]=(String)List[9].getSelectedValue();
							Plate[9]=no[9].getText().trim();
							Summery[9]=("Vehicle Type : "+ V[9]+"   Plate Number : "+Plate[9]);
							Buff.newLine();
							Buff.write(Summery[9]);
							
						Buff.close();
						
						
						
						}
						else if(car==9) {
							V[0]=(String) List[0].getSelectedValue();
							Plate[0]=no[0].getText().trim();
							Summery[0]=("Vehicle Type : "+ V[0]+"   Plate Number : "+Plate[0]);
							Buff.newLine();
							Buff.write(Summery[0]);
							V[1]=(String)List[1].getSelectedValue();
							Plate[1]=no[1].getText().trim();
							Summery[1]=("Vehicle Type : "+ V[1]+"   Plate Number : "+Plate[1]);
							Buff.newLine();
							Buff.write(Summery[1]);
							V[2]=(String) List[2].getSelectedValue();
							Plate[2]=no[2].getText().trim();
							Summery[2]=("Vehicle Type : "+ V[2]+"   Plate Number : "+Plate[2]);
							Buff.newLine();
							Buff.write(Summery[2]);
							V[3]=(String)List[3].getSelectedValue();
							Plate[3]=no[3].getText().trim();
							Summery[3]=("Vehicle Type : "+ V[3]+"   Plate Number : "+Plate[3]);
							Buff.newLine();
							Buff.write(Summery[3]);
							V[4]=(String) List[4].getSelectedValue();
							Plate[4]=no[4].getText().trim();
							Summery[4]=("Vehicle Type : "+ V[4]+"   Plate Number : "+Plate[4]);
							Buff.newLine();
							Buff.write(Summery[4]);
							V[5]=(String)List[5].getSelectedValue();
							Plate[5]=no[5].getText().trim();
							Summery[5]=("Vehicle Type : "+ V[5]+"   Plate Number : "+Plate[5]);
							Buff.newLine();
							Buff.write(Summery[5]);
							V[6]=(String) List[6].getSelectedValue();
							Plate[6]=no[6].getText().trim();
							Summery[6]=("Vehicle Type : "+ V[6]+"   Plate Number : "+Plate[6]);
							Buff.newLine();
							Buff.write(Summery[6]);
							V[7]=(String)List[7].getSelectedValue();
							Plate[7]=no[7].getText().trim();
							Summery[7]=("Vehicle Type : "+ V[7]+"   Plate Number : "+Plate[7]);
							Buff.newLine();
							Buff.write(Summery[7]);
							V[8]=(String) List[8].getSelectedValue();
							Plate[8]=no[8].getText().trim();
							Summery[8]=("Vehicle Type : "+ V[8]+"   Plate Number : "+Plate[8]);
							Buff.newLine();
							Buff.write(Summery[8]);
							
							Buff.close();	
						}
						else if(car==8) {
							V[0]=(String) List[0].getSelectedValue();
							Plate[0]=no[0].getText().trim();
							Summery[0]=("Vehicle Type : "+ V[0]+"   Plate Number : "+Plate[0]);
							Buff.newLine();
							Buff.write(Summery[0]);
							V[1]=(String)List[1].getSelectedValue();
							Plate[1]=no[1].getText().trim();
							Summery[1]=("Vehicle Type : "+ V[1]+"   Plate Number : "+Plate[1]);
							Buff.newLine();
							Buff.write(Summery[1]);
							V[2]=(String) List[2].getSelectedValue();
							Plate[2]=no[2].getText().trim();
							Summery[2]=("Vehicle Type : "+ V[2]+"   Plate Number : "+Plate[2]);
							Buff.newLine();
							Buff.write(Summery[2]);
							V[3]=(String)List[3].getSelectedValue();
							Plate[3]=no[3].getText().trim();
							Summery[3]=("Vehicle Type : "+ V[3]+"   Plate Number : "+Plate[3]);
							Buff.newLine();
							Buff.write(Summery[3]);
							V[4]=(String) List[4].getSelectedValue();
							Plate[4]=no[4].getText().trim();
							Summery[4]=("Vehicle Type : "+ V[4]+"   Plate Number : "+Plate[4]);
							Buff.newLine();
							Buff.write(Summery[4]);
							V[5]=(String)List[5].getSelectedValue();
							Plate[5]=no[5].getText().trim();
							Summery[5]=("Vehicle Type : "+ V[5]+"   Plate Number : "+Plate[5]);
							Buff.newLine();
							Buff.write(Summery[5]);
							V[6]=(String) List[6].getSelectedValue();
							Plate[6]=no[6].getText().trim();
							Summery[6]=("Vehicle Type : "+ V[6]+"   Plate Number : "+Plate[6]);
							Buff.newLine();
							Buff.write(Summery[6]);
							V[7]=(String)List[7].getSelectedValue();
							Plate[7]=no[7].getText().trim();
							Summery[7]=("Vehicle Type : "+ V[7]+"   Plate Number : "+Plate[7]);
							Buff.newLine();
							Buff.write(Summery[7]);
							
							Buff.close();	
						}
						else if(car==7) {
							V[0]=(String) List[0].getSelectedValue();
							Plate[0]=no[0].getText().trim();
							Summery[0]=("Vehicle Type : "+ V[0]+"   Plate Number : "+Plate[0]);
							Buff.newLine();
							Buff.write(Summery[0]);
							V[1]=(String)List[1].getSelectedValue();
							Plate[1]=no[1].getText().trim();
							Summery[1]=("Vehicle Type : "+ V[1]+"   Plate Number : "+Plate[1]);
							Buff.newLine();
							Buff.write(Summery[1]);
							V[2]=(String) List[2].getSelectedValue();
							Plate[2]=no[2].getText().trim();
							Summery[2]=("Vehicle Type : "+ V[2]+"   Plate Number : "+Plate[2]);
							Buff.newLine();
							Buff.write(Summery[2]);
							V[3]=(String)List[3].getSelectedValue();
							Plate[3]=no[3].getText().trim();
							Summery[3]=("Vehicle Type : "+ V[3]+"   Plate Number : "+Plate[3]);
							Buff.newLine();
							Buff.write(Summery[3]);
							V[4]=(String) List[4].getSelectedValue();
							Plate[4]=no[4].getText().trim();
							Summery[4]=("Vehicle Type : "+ V[4]+"   Plate Number : "+Plate[4]);
							Buff.newLine();
							Buff.write(Summery[4]);
							V[5]=(String)List[5].getSelectedValue();
							Plate[5]=no[5].getText().trim();
							Summery[5]=("Vehicle Type : "+ V[5]+"   Plate Number : "+Plate[5]);
							Buff.newLine();
							Buff.write(Summery[5]);
							V[6]=(String) List[6].getSelectedValue();
							Plate[6]=no[6].getText().trim();
							Summery[6]=("Vehicle Type : "+ V[6]+"   Plate Number : "+Plate[6]);
							Buff.newLine();
							Buff.write(Summery[6]);
							Buff.close();
						}
						else if(car==6) {
							V[0]=(String) List[0].getSelectedValue();
							Plate[0]=no[0].getText().trim();
							Summery[0]=("Vehicle Type : "+ V[0]+"   Plate Number : "+Plate[0]);
							Buff.newLine();
							Buff.write(Summery[0]);
							V[1]=(String)List[1].getSelectedValue();
							Plate[1]=no[1].getText().trim();
							Summery[1]=("Vehicle Type : "+ V[1]+"   Plate Number : "+Plate[1]);
							Buff.newLine();
							Buff.write(Summery[1]);
							V[2]=(String) List[2].getSelectedValue();
							Plate[2]=no[2].getText().trim();
							Summery[2]=("Vehicle Type : "+ V[2]+"   Plate Number : "+Plate[2]);
							Buff.newLine();
							Buff.write(Summery[2]);
							V[3]=(String)List[3].getSelectedValue();
							Plate[3]=no[3].getText().trim();
							Summery[3]=("Vehicle Type : "+ V[3]+"   Plate Number : "+Plate[3]);
							Buff.newLine();
							Buff.write(Summery[3]);
							V[4]=(String) List[4].getSelectedValue();
							Plate[4]=no[4].getText().trim();
							Summery[4]=("Vehicle Type : "+ V[4]+"   Plate Number : "+Plate[4]);
							Buff.newLine();
							Buff.write(Summery[4]);
							V[5]=(String)List[5].getSelectedValue();
							Plate[5]=no[5].getText().trim();
							Summery[5]=("Vehicle Type : "+ V[5]+"   Plate Number : "+Plate[5]);
							Buff.newLine();
							Buff.write(Summery[5]);
							Buff.close();
						}
						else if(car==5) {
							V[0]=(String) List[0].getSelectedValue();
							Plate[0]=no[0].getText().trim();
							Summery[0]=("Vehicle Type : "+ V[0]+"   Plate Number : "+Plate[0]);
							Buff.newLine();
							Buff.write(Summery[0]);
							V[1]=(String)List[1].getSelectedValue();
							Plate[1]=no[1].getText().trim();
							Summery[1]=("Vehicle Type : "+ V[1]+"   Plate Number : "+Plate[1]);
							Buff.newLine();
							Buff.write(Summery[1]);
							V[2]=(String) List[2].getSelectedValue();
							Plate[2]=no[2].getText().trim();
							Summery[2]=("Vehicle Type : "+ V[2]+"   Plate Number : "+Plate[2]);
							Buff.newLine();
							Buff.write(Summery[2]);
							V[3]=(String)List[3].getSelectedValue();
							Plate[3]=no[3].getText().trim();
							Summery[3]=("Vehicle Type : "+ V[3]+"   Plate Number : "+Plate[3]);
							Buff.newLine();
							Buff.write(Summery[3]);
							V[4]=(String) List[4].getSelectedValue();
							Plate[4]=no[4].getText().trim();
							Summery[4]=("Vehicle Type : "+ V[4]+"   Plate Number : "+Plate[4]);
							Buff.newLine();
							Buff.write(Summery[4]);
							Buff.close();
						}
						else if(car==4) {
							V[0]=(String) List[0].getSelectedValue();
							Plate[0]=no[0].getText().trim();
							Summery[0]=("Vehicle Type : "+ V[0]+"   Plate Number : "+Plate[0]);
							Buff.newLine();
							Buff.write(Summery[0]);
							V[1]=(String)List[1].getSelectedValue();
							Plate[1]=no[1].getText().trim();
							Summery[1]=("Vehicle Type : "+ V[1]+"   Plate Number : "+Plate[1]);
							Buff.newLine();
							Buff.write(Summery[1]);
							V[2]=(String) List[2].getSelectedValue();
							Plate[2]=no[2].getText().trim();
							Summery[2]=("Vehicle Type : "+ V[2]+"   Plate Number : "+Plate[2]);
							Buff.newLine();
							Buff.write(Summery[2]);
							V[3]=(String)List[3].getSelectedValue();
							Plate[3]=no[3].getText().trim();
							Summery[3]=("Vehicle Type : "+ V[3]+"   Plate Number : "+Plate[3]);
							Buff.newLine();
							Buff.write(Summery[3]);
							Buff.close();
						}
						else if(car==3) {
							V[0]=(String) List[0].getSelectedValue();
							Plate[0]=no[0].getText().trim();
							Summery[0]=("Vehicle Type : "+ V[0]+"   Plate Number : "+Plate[0]);
							Buff.newLine();
							Buff.write(Summery[0]);
							V[1]=(String)List[1].getSelectedValue();
							Plate[1]=no[1].getText().trim();
							Summery[1]=("Vehicle Type : "+ V[1]+"   Plate Number : "+Plate[1]);
							Buff.newLine();
							Buff.write(Summery[1]);
							V[2]=(String) List[2].getSelectedValue();
							Plate[2]=no[2].getText().trim();
							Summery[2]=("Vehicle Type : "+ V[2]+"   Plate Number : "+Plate[2]);
							Buff.newLine();
							Buff.write(Summery[2]);
							Buff.close();
						}
						else if(car==2){
							V[0]=(String) List[0].getSelectedValue();
							Plate[0]=no[0].getText().trim();
							Summery[0]=("Vehicle Type : "+ V[0]+"   Plate Number : "+Plate[0]);
							Buff.newLine();
							Buff.write(Summery[0]);
							V[1]=(String)List[1].getSelectedValue();
							Plate[1]=no[1].getText().trim();
							Summery[1]=("Vehicle Type : "+ V[1]+"   Plate Number : "+Plate[1]);
							Buff.newLine();
							Buff.write(Summery[1]);
							
							Buff.close();
						}
						else if(car==1) {
							V[0]=(String) List[0].getSelectedValue();
							Plate[0]=no[0].getText().trim();
							Summery[0]=("Vehicle Type : "+ V[0]+"   Plate Number : "+Plate[0]);
							Buff.newLine();
							Buff.write(Summery[0]);
							Buff.close();
						
						}
						frame.dispose();
						
					
					} catch (Exception excep) {
						System.out.println("Error");
					}
				}
	

	
}
}}
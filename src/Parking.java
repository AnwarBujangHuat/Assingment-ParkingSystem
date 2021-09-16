import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;


public class Parking extends JFrame {
	
	private JButton seerecords;
	private JButton newuser;
	private JLabel label;
	
	public Parking() {
	JFrame Main=new JFrame("Main Menu");
	Main.setLayout(new FlowLayout());
	Main.setSize(500,300);
	Main.setLayout(new FlowLayout());
	Main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container Pane=Main.getContentPane();
	Pane.setBackground(new Color(197,179,88));
	Main.setVisible(true);
	
		JLabel label=new JLabel();
		label.setVisible(true);
		//setFont
		Font f=new Font("ITALIC", Font.PLAIN, 16);
	
		//Set up Buttons
		//1.to create new user or to login to old files
		
		JButton newuser=new JButton("New User");
		newuser.setSize(400, 400);
		newuser.setFont(f);
		Main.add(newuser);
		
	
		JButton seerecords=new JButton("See Records");
		seerecords.setFont(f);
		Main.add(seerecords);
	
		newuser.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				//JFileChooser J = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory()); 
				//J.setDialogTitle("Home");
				//J.showOpenDialog(null); 
			
				
				// creating another frame when button is click
				new Person();
				Main.dispose();
				
				
			}
			});


		
	
	
	}
	
}
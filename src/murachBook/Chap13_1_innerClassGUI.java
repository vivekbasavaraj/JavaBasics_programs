package murachBook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Chap13_1_innerClassGUI extends JFrame {

	public Chap13_1_innerClassGUI(){
		
		//code that sets up the frame
		this.setTitle("Test Frame");
		this.setSize(400, 100);
		this.setLocationByPlatform(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel=new JPanel();
		this.add(panel);
		
		//code that creates the button and adds the listener
		JButton b1=new JButton("Test Button");
		ActionListener listener=new ClickListener();
		
		//method-2
		/*ActionListener listener=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("The Button was clicked!");
			}
		};*/
		
		//method-3
		/*
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("The Button was clicked!");
			}
		});*/
		b1.addActionListener(listener);
		
		//code that display the button
		panel.add(b1);
		this.setVisible(true);
	}
		//the inner class that implements the listener 
		class ClickListener implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e){
				System.out.println("The Button was clicked!");
		}
	}
	
	
}

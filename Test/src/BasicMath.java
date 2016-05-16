import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextField;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class BasicMath {

	private JFrame frame;
	private double answer = 0.0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BasicMath window = new BasicMath();
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
	public BasicMath() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	    
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		TextField left = new TextField();
		left.setBounds(64, 75, 73, 38);
		frame.getContentPane().add(left);
		
		TextField right = new TextField();
		right.setBounds(249, 75, 73, 38);
		frame.getContentPane().add(right);
		
		TextField answerField = new TextField();
		answerField.setEditable(false);
		answerField.setBounds(167, 198, 79, 22);
		frame.getContentPane().add(answerField);
		
	/************************ADD*************************************/	
		Button add = new Button("add");
		add.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				double leftSide = Double.parseDouble(left.getText());
				double rightSide = Double.parseDouble(right.getText());
				 answer = leftSide + rightSide;
				 answerField.setText(Double.toString(answer));
			}
			
		});
		add.setBounds(13, 136, 70, 22);
		frame.getContentPane().add(add);
	/**************************SUBTRACT**********************************/	
		Button subtract = new Button("subtract");
		subtract.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				double leftSide = Double.parseDouble(left.getText());
				double rightSide = Double.parseDouble(right.getText());
				 answer = leftSide - rightSide;
				 answerField.setText(Double.toString(answer));
			}
			
			
		});
		subtract.setBounds(108, 136, 70, 22);
		frame.getContentPane().add(subtract);
	/*************************MULTIPLY*********************************/	
		Button multiply = new Button("multiply");
		multiply.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				double leftSide = Double.parseDouble(left.getText());
				double rightSide = Double.parseDouble(right.getText());
				 answer = leftSide * rightSide;
				 answerField.setText(Double.toString(answer));
			}
			
			
		});
		multiply.setBounds(201, 136, 70, 22);
		frame.getContentPane().add(multiply);
	/*************************DIVIDE********************************/
		Button divide = new Button("divide");
		divide.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				double leftSide = Double.parseDouble(left.getText());
				double rightSide = Double.parseDouble(right.getText());
				 answer = leftSide / rightSide;
				 answerField.setText(Double.toString(answer));
			}
			
			
		});
		divide.setBounds(306, 136, 70, 22);
		frame.getContentPane().add(divide);
		/*******************************************************/
		Label LHS = new Label("Left Side");
		LHS.setBounds(64, 47, 62, 22);
		frame.getContentPane().add(LHS);
		
		Label RHS = new Label("Right Side");
		RHS.setBounds(249, 47, 62, 22);
		frame.getContentPane().add(RHS);
		
		JLabel lblBasicCalculator = new JLabel("Basic Calculator");
		lblBasicCalculator.setBounds(165, 11, 106, 14);
		frame.getContentPane().add(lblBasicCalculator);
		

	}
}

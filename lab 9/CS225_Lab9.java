import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class CS225_Lab9 extends JFrame {



	private JButton Add;
	private JButton Subtract;
	private JButton Multiply;
	private JButton Divide;
	private JButton Solve;
	private double TEMP;
	private double SolveTEMP;
	private JTextField Result;

	Boolean addBool = false ;
	Boolean subBool = false ;
	Boolean divBool = false ;
	Boolean mulBool = false ;
	JTextField firstNumber;
	JTextField secondNumber;
	JTextField answer;
	JLabel Numberone;
	JLabel Numbertwo;
	JLabel Answer;

	public static void main(String[] args) {

		try{
			CS225_Lab9 calc = new CS225_Lab9();
			//   calc.pack();
			//  calc.setLocationRelativeTo(null);
			// calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//  calc.setVisible(true);
			// calc.setEditable(false);
		}
		catch(Exception z)
		{
			System.out.println("please enter a number");
		}
	}

	public CS225_Lab9() {

		//JPanel p1 = new JPanel();
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		this.setTitle("Sean Billideau's Calculator");
		Numberone = new JLabel("operand 1");
		firstNumber = new JTextField(20);
		Numbertwo = new JLabel("operand 2");
		secondNumber = new JTextField(20);
		Answer = new JLabel("Answer");
		Answer.setEnabled(false);
		answer = new JTextField(20);

		Add = new JButton("+");
		Subtract = new JButton("-");
		Multiply = new JButton("*");
		Divide = new JButton("/");

		c.add(Numberone);
		c.add(firstNumber);
		c.add(Numbertwo);
		c.add(secondNumber);
		c.add(Add);
		c.add(Subtract);
		c.add(Multiply);
		c.add(Divide);
		c.add(Answer);
		c.add(answer);


		MyHandler m = new MyHandler();
		Add.addActionListener(m);
		Subtract.addActionListener(m);
		Multiply.addActionListener(m);
		Divide.addActionListener(m);
		setSize(1200,150);
		setVisible(true);
	} 




	private class MyHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==Add){
				double operandOne = 0;
				double operandTwo = 0;
				double equals = 0;
				String ans;
				try
				{
					operandOne = Double.parseDouble(firstNumber.getText());
					operandTwo = Double.parseDouble(secondNumber.getText());				
					Answer.setText(operandOne + "+" + operandTwo + "=");
					
					equals = operandOne + operandTwo;
					ans = " " + equals;
					answer.setText(ans);
					if(equals  < 0)
					{
						answer.setForeground(Color.RED);
					}
					else
					{
						answer.setForeground(Color.BLACK);
					}
				}
				catch(IllegalArgumentException a)
				{
					JOptionPane.showMessageDialog(null, "Invalid operand, must be a number", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
			}
			if(e.getSource()==Subtract){
				double operandOne = 0;
				double operandTwo = 0;
				double equals = 0;
				String ans;
				try
				{
					
					operandOne = Double.parseDouble(firstNumber.getText());
					operandTwo = Double.parseDouble(secondNumber.getText());
					Answer.setText(operandOne + "-" + operandTwo + "=");
					equals = operandOne - operandTwo;
					ans = " " + equals;
					answer.setText(ans);
					if(equals  < 0)
					{
						answer.setForeground(Color.RED);
					}
					else
					{
						answer.setForeground(Color.BLACK);
					}
				}
				catch(IllegalArgumentException a)
				{
					JOptionPane.showMessageDialog(null, "Invalid operand, must be a number", "ERROR", JOptionPane.ERROR_MESSAGE);
				}

			}
			if(e.getSource()==Divide){
				double operandOne = 0;
				double operandTwo = 0;
				double equals = 0;
				String ans;
				try
				{
					operandOne = Double.parseDouble(firstNumber.getText());
					operandTwo = Double.parseDouble(secondNumber.getText());
					Answer.setText(operandOne + "/" + operandTwo + "=");
					equals = operandOne / operandTwo;
					ans = " " + equals;
					answer.setText(ans);
					if(equals  < 0)
					{
						answer.setForeground(Color.RED);
					}
					else
					{
						answer.setForeground(Color.BLACK);
					}
				}
				catch(IllegalArgumentException a)
				{
					JOptionPane.showMessageDialog(null, "Invalid operand, must be a number", "ERROR", JOptionPane.ERROR_MESSAGE);

				}
			}

			if(e.getSource()==Multiply){
				double operandOne = 0;
				double operandTwo = 0;
				double equals = 0;
				String ans;
				try
				{
					operandOne = Double.parseDouble(firstNumber.getText());
					operandTwo = Double.parseDouble(secondNumber.getText());
					Answer.setText(operandOne + "*" + operandTwo + "=");
					equals = operandOne * operandTwo;
					ans = " " + equals;
					answer.setText(ans);	
					if(equals  < 0)
					{
						answer.setForeground(Color.RED);
					}
					else
					{
						answer.setForeground(Color.BLACK);
					}
						
						
				}
				catch(IllegalArgumentException a)
				{
					JOptionPane.showMessageDialog(null, "Invalid operand, must be a number", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
			}

		}

		

		private void setEditable(boolean b) {



		}
	}
}


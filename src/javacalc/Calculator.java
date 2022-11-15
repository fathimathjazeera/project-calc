


	package javacalc;


	import java.awt.Color;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.SwingConstants;

	public class Calculator implements ActionListener {
		boolean isoperatorClicked=false;

		JFrame jf;
		String oldValue;
		float result=0;
		int operator=0;
		
		
		JLabel displayLabel;
		JButton sevenButton;
		JButton eightButton;
		JButton nineButton;
		JButton fourButton;
		JButton fiveButton;
		JButton sixButton;
		JButton oneButton;
		JButton twoButton;
		JButton threeButton;
		JButton dotButton;
		JButton zeroButton;
		JButton equalButton;
		JButton divButton;
		JButton subButton;
		JButton multiButton;
		JButton addButton;
		JButton clearButton;


		public Calculator() {
			
			jf = new JFrame("Calculator"); //Jframe Object Created
			jf.setLayout(null);
			jf.setSize(450,700); // set width and height
			jf.setLocation(80,30); //set location of the application (x,y)
			
			//Label 
			
			displayLabel = new JLabel();
			displayLabel.setBounds(30, 40, 370, 60);
			displayLabel.setBackground(Color.black); //setting label background color
			displayLabel.setOpaque(true);
			displayLabel.setHorizontalAlignment(SwingConstants.RIGHT); //setting text alignment to right
			displayLabel.setForeground(Color.WHITE);
			displayLabel.setFont(displayLabel.getFont().deriveFont(40f)); //set font size
			jf.add(displayLabel);

			
			//Button
			
			
			   
			sevenButton = new JButton("7"); //button number
			 sevenButton.setBackground(Color.BLACK);
			 sevenButton.setForeground(Color.WHITE);
			 sevenButton.setFocusPainted(false);
			sevenButton.setBounds(30,130,80,80); //button size
			sevenButton.addActionListener(this);
			sevenButton.setFont(sevenButton.getFont().deriveFont(40f)); //set font size
			jf.add(sevenButton);  //add to Jframe
			
			
		
			eightButton = new JButton("8");
			eightButton.setBackground(Color.BLACK);
			 eightButton.setForeground(Color.WHITE);
			 eightButton.setFocusPainted(false);
			eightButton.setBounds(125,130,80,80);
			eightButton.addActionListener(this);
			eightButton.setFont(eightButton.getFont().deriveFont(40f));
			jf.add(eightButton);
			
			nineButton = new JButton("9");
			nineButton.setBackground(Color.BLACK);
			nineButton.setForeground(Color.WHITE);
			 nineButton.setFocusPainted(false);
			nineButton.setBounds(220,130,80,80);
			nineButton.addActionListener(this);
			nineButton.setFont(nineButton.getFont().deriveFont(40f));
			jf.add(nineButton);
			
			fourButton = new JButton("4"); 
			fourButton.setBackground(Color.BLACK);
			 fourButton.setForeground(Color.WHITE);
			 fourButton.setFocusPainted(false);
			fourButton.setBounds(30,230,80,80); 
			fourButton.addActionListener(this);
			fourButton.setFont(fourButton.getFont().deriveFont(40f));
			jf.add(fourButton);  
			
		    fiveButton = new JButton("5");
		    fiveButton.setBackground(Color.BLACK);
		    fiveButton.setForeground(Color.WHITE);
		    fiveButton.setFocusPainted(false);
			fiveButton.setBounds(125,230,80,80);
			fiveButton.addActionListener(this);
			fiveButton.setFont(fiveButton.getFont().deriveFont(40f));
			jf.add(fiveButton);
			
			sixButton = new JButton("6");
			 sixButton.setBackground(Color.BLACK);
			 sixButton.setForeground(Color.WHITE);
			 sixButton.setFocusPainted(false);
			sixButton.setBounds(220,230,80,80);
			sixButton.addActionListener(this);
			sixButton.setFont(sixButton.getFont().deriveFont(40f));
			jf.add(sixButton);
		
			oneButton = new JButton("1"); 
			oneButton.setBackground(Color.BLACK);
			 oneButton.setForeground(Color.WHITE);
			 oneButton.setFocusPainted(false);
			oneButton.setBounds(30,330,80,80); 
			oneButton.addActionListener(this);
			oneButton.setFont(oneButton.getFont().deriveFont(40f));
			jf.add(oneButton);  
			
			twoButton = new JButton("2");
			twoButton.setBackground(Color.BLACK);
			 twoButton.setForeground(Color.WHITE);
			 twoButton.setFocusPainted(false);
			twoButton.setBounds(125,330,80,80);
			twoButton.addActionListener(this);
			twoButton.setFont(twoButton.getFont().deriveFont(40f));
			jf.add(twoButton);
			
			
			
			threeButton = new JButton("3");
			 threeButton.setBackground(Color.BLACK);
			 threeButton.setForeground(Color.WHITE);
			 threeButton.setFocusPainted(false);
			threeButton.setBounds(220,330,80,80);
			threeButton.addActionListener(this);
			threeButton.setFont(threeButton.getFont().deriveFont(40f));
			jf.add(threeButton);
			
			
			
			dotButton = new JButton("."); 
			dotButton.setBackground(Color.BLACK);
			 dotButton.setForeground(Color.WHITE);
			 dotButton.setFocusPainted(false);
			dotButton.setBounds(220,430,80,80); 
			dotButton.addActionListener(this);
			dotButton.setFont(dotButton.getFont().deriveFont(40f));
			jf.add(dotButton);  
			

			zeroButton = new JButton("0");
			zeroButton.setBackground(Color.BLACK);
			zeroButton.setForeground(Color.WHITE);
			 zeroButton.setFocusPainted(false);
			zeroButton.setBounds(30,430,175,80);
			zeroButton.addActionListener(this);
			zeroButton.setFont(zeroButton.getFont().deriveFont(40f));
			jf.add(zeroButton);
			
			
			equalButton = new JButton("=");
			equalButton.setBackground(Color.BLACK);
			equalButton.setForeground(Color.ORANGE);
			 equalButton.setFocusPainted(false);
			equalButton.setBounds(220,530,180,80);
			equalButton.addActionListener(this);
			equalButton.setFont(equalButton.getFont().deriveFont(40f));
			jf.add(equalButton);
			
			
			
			
			
			
			//arithmetic operations
			
			divButton = new JButton("/");
			 divButton.setBackground(Color.BLACK);
			 divButton.setForeground(Color.ORANGE);
			 divButton.setFocusPainted(false);
			divButton.setBounds(320,130,80,80);
			divButton.addActionListener(this);
			divButton.setFont(divButton.getFont().deriveFont(40f));
			jf.add(divButton);
			
			multiButton = new JButton("x");
			 multiButton.setBackground(Color.BLACK);
			 multiButton.setForeground(Color.ORANGE);
			 multiButton.setFocusPainted(false);
			multiButton.setBounds(320,230,80,80);
			multiButton.addActionListener(this);
			multiButton.setFont(multiButton.getFont().deriveFont(40f));
			jf.add(multiButton);
			
			subButton = new JButton("-");
			 subButton.setBackground(Color.BLACK);
			 subButton.setForeground(Color.ORANGE);
			 subButton.setFocusPainted(false);
			subButton.setBounds(320,330,80,80);
			subButton.addActionListener(this);
			subButton.setFont(subButton.getFont().deriveFont(40f));
			jf.add(subButton);
			
			addButton = new JButton("+");
			addButton.setBackground(Color.BLACK);
			addButton.setForeground(Color.ORANGE);
		  addButton.setFocusPainted(false);
			addButton.setBounds(320,430,80,80);
			addButton.addActionListener(this);
			addButton.setFont(addButton.getFont().deriveFont(40f));
			jf.add(addButton);
			
			
			clearButton = new JButton("Clear");
			clearButton.setBackground(Color.BLACK);
			 clearButton.setForeground(Color.ORANGE);
			 clearButton.setFocusPainted(false);
			clearButton.setBounds(30,530,175,80);
			clearButton.addActionListener(this);
			clearButton.setFont(clearButton.getFont().deriveFont(20f));
			jf.add(clearButton);
			
			jf.setVisible(true);
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //automatic exit from
			
		
		} 
		
		public static void  main(String[] args) {
			new Calculator();
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == sevenButton ) {
				if(isoperatorClicked) {
					displayLabel.setText("7");
					isoperatorClicked=false;
				}
				else {
					displayLabel.setText(displayLabel.getText()+"7");
				}
			}
			else if(e.getSource() == eightButton) {
				if(isoperatorClicked) {
					displayLabel.setText("8");
					isoperatorClicked=false;
				}
				else {
					displayLabel.setText(displayLabel.getText()+"8");
				}
			}
			else if(e.getSource() == nineButton) {
				if(isoperatorClicked) {
					displayLabel.setText("9");
					isoperatorClicked=false;
				}
				else {
					displayLabel.setText(displayLabel.getText()+"9");
				}
			}
			else if(e.getSource() == fourButton) {
				if(isoperatorClicked) {
					displayLabel.setText("4");
					isoperatorClicked=false;
				}
				else {
					displayLabel.setText(displayLabel.getText()+"4");
				}
			}
			else if(e.getSource() == fiveButton) {
				if(isoperatorClicked) {
					displayLabel.setText("5");
					isoperatorClicked=false;
				}
				else {
					displayLabel.setText(displayLabel.getText()+"5");
				}
			}
			else if(e.getSource() == sixButton) {
				if(isoperatorClicked) {
					displayLabel.setText("6");
					isoperatorClicked=false;
				}
				else {
					displayLabel.setText(displayLabel.getText()+"6");
				}
			}
			else if(e.getSource() == oneButton) {
				if(isoperatorClicked) {
					displayLabel.setText("1");
					isoperatorClicked=false;
				}
				else {
					displayLabel.setText(displayLabel.getText()+"1");
				}
			}
			else if(e.getSource() == twoButton) {
				if(isoperatorClicked) {
					displayLabel.setText("2");
					isoperatorClicked=false;
				}
				else {
					displayLabel.setText(displayLabel.getText()+"2");
				}
			}
			else if(e.getSource() == threeButton) {
				if(isoperatorClicked) {
					displayLabel.setText("3");
					isoperatorClicked=false;
				}
				else {
					displayLabel.setText(displayLabel.getText()+"3");
				}
			}
			else if(e.getSource() == zeroButton) {
				if(isoperatorClicked) {
					displayLabel.setText("0");
					isoperatorClicked=false;
				}
				else {
					displayLabel.setText(displayLabel.getText()+"0");
				}
			}
			else if(e.getSource() == dotButton) {
				displayLabel.setText(displayLabel.getText()+".");
			}
			else if(e.getSource() == divButton) {
				operator=1;
				isoperatorClicked=true;
				oldValue=displayLabel.getText();
				displayLabel.setText("/");

			}
			else if(e.getSource() == multiButton) {
				operator=2;
				isoperatorClicked=true;
				oldValue=displayLabel.getText();
				displayLabel.setText("*");
			}
			else if(e.getSource() == subButton) {
				operator=3;
				isoperatorClicked=true;
				oldValue=displayLabel.getText();
				displayLabel.setText("-");
			}
			else if(e.getSource() == addButton) {
				operator=4;
				isoperatorClicked=true;
				oldValue=displayLabel.getText();
				displayLabel.setText("+");
			} 
			else if(e.getSource() == clearButton) {
				displayLabel.setText(" ");
			}
			else if (e.getSource() == equalButton) {
	            String newValue = displayLabel.getText();
	            float oldvalueF = Float.parseFloat(oldValue);
	            float newValueF = Float.parseFloat(newValue);
	            if (operator == 1) {
	                result = oldvalueF/newValueF;
	            }else if(operator == 2) {
	                result=oldvalueF*newValueF;
	            }else if(operator == 3) {
	                result=oldvalueF-newValueF;
	            }else if(operator == 4) {
	                result=oldvalueF+newValueF;
	            }
	            displayLabel.setText(result +" ");
	    }

	}

	}



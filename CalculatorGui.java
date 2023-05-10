/*
 * Kaciopey Ikounga Moulolo
 * COMP 167
 * Mrs.Siddula
 * 05/05/2023
 */


/*
 * This project is a functional scientific calculator gui
 */


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorGui implements ActionListener{
	
	//variables for buttons 
	private JFrame calculatorFrame;
	private JPanel controlPanel;
	private JTextField in;
	private JTextField out;
	private JButton one;
	private JButton two;
	private JButton three;
	private JButton four;
	private JButton five;
	private JButton six;
	private JButton seven;
	private JButton eight;
	private JButton nine;
	private JButton zero;
	private JButton add;
	private JButton sub;
	private JButton mult;
	private JButton div;
	private JButton percent;
	private JButton equal;
	private JButton powerx2;
	private JButton powerx3;
	private JButton mod;
	private JButton FirstDataManup;
	private JButton SecDataManup;
	private JButton dec;
	private JButton approx;
	private JButton log;
	private JButton ln;
	private JButton bin;
	private JButton abs;
	private JButton sin;
	private JButton cos;
	private JButton tan;
	private JButton asin;
	private JButton acos;
	private JButton atan;
	private JButton sinh;
	private JButton cosh;
	private JButton tanh;
	private JButton clear;
	private JButton exit;
	
	
	//This method sets all the parameters for the Gui such as buttons,placements, title,actionListeners
	public CalculatorGui() {
		//title
		calculatorFrame = new JFrame("CI-Calculator");
		calculatorFrame.setSize(350, 445);
		calculatorFrame.getContentPane().setBackground(Color.MAGENTA);
		calculatorFrame.setResizable(true);
		controlPanel = new JPanel();
		controlPanel.setBackground(Color.MAGENTA);
		controlPanel.setLayout(null);
		
		//where the text will appear when user clicks a button
		in = new JTextField();
		in.setSize(335, 20);
		in.setBackground(Color.PINK);
		controlPanel.add(in);
		
		//where the result will show
		out = new JTextField();
		out.setSize(335,50);
		out.setLocation(0, 20);
		out.setBackground(Color.PINK);
		controlPanel.add(out);
		
		// the clear button
		clear = new JButton("C");//sets the text to c
		clear.setSize(60, 35);
		clear.setLocation(260, 75);
		clear.addActionListener(new ActionListener() {
			//When user click on it the textfields will be blank
			public void actionPerformed(ActionEvent e) {
				in.setText("");
				out.setText("");
			}
		});
		controlPanel.add(clear);
		
		
		seven = new JButton("7");//sets the text for button to 7
		seven.setSize(49, 35);
		seven.setLocation(8, 109);
		seven.addActionListener(new ActionListener() {
			//When number 7 is clicked it appears in the textfield
			public void actionPerformed(ActionEvent e) {
				in.setText(in.getText() + "7");
			}
		});
		controlPanel.add(seven);
		
		eight = new JButton("8");//sets the text for button to 8
		eight.setSize(49, 35);
		eight.setLocation(55, 109);
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				in.setText(in.getText() + "8");
			}
		});
		controlPanel.add(eight);
		
		nine = new JButton("9");//sets the text for button to 9
		nine.setSize(49, 35);
		nine.setLocation(103, 109);
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				in.setText(in.getText() + "9");
			}
		});
		controlPanel.add(nine);
		
		mult = new JButton("x");
		mult.setSize(49, 35);
		mult.setLocation(151, 109);
		mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				in.setText(in.getText() + "x");
			}
		});
		controlPanel.add(mult);
		
		div = new JButton("/");
		div.setSize(50, 35);
		div.setLocation(198, 109);
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				in.setText(in.getText() + "/");
			}
		});
		controlPanel.add(div);
		
		powerx2 = new JButton("x^2");
		powerx2.setSize(60, 35);
		powerx2.setLocation(260, 109);
		powerx2.addActionListener(this);
		controlPanel.add(powerx2);
		
		four = new JButton("4");
		four.setSize(49, 35);
		four.setLocation(8, 143);
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				in.setText(in.getText() + "4");
			}
		});
		controlPanel.add(four);
		
		five = new JButton("5");
		five.setSize(49, 35);
		five.setLocation(55, 143);
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				in.setText(in.getText() + "5");
			}
		});
		controlPanel.add(five);
		
		six = new JButton("6");
		six.setSize(49, 35);
		six.setLocation(103, 143);
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				in.setText(in.getText() + "6");
			}
		});
		controlPanel.add(six);
		
		add = new JButton("+");
		add.setSize(49, 35);
		add.setLocation(151, 143);
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				in.setText(in.getText() + "+");
			}
		});
		controlPanel.add(add);
		
		sub = new JButton("-");
		sub.setSize(50, 35);
		sub.setLocation(198, 143);
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				in.setText(in.getText() + "-");
			}
		});
		controlPanel.add(sub);
		
		powerx3 = new JButton("x^3");
		powerx3.setSize(60, 35);
		powerx3.setLocation(260, 143);
		powerx3.addActionListener(this);
		controlPanel.add(powerx3);
		
		one = new JButton("1");
		one.setSize(49, 35);
		one.setLocation(8, 177);
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				in.setText(in.getText() + "1");
			}
		});
		controlPanel.add(one);
		
		two = new JButton("2");
		two.setSize(49, 35);
		two.setLocation(55, 177);
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				in.setText(in.getText() + "2");
			}
		});
		controlPanel.add(two);
		
		three = new JButton("3");
		three.setSize(49, 35);
		three.setLocation(103, 177);
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				in.setText(in.getText() + "3");
			}
		});
		controlPanel.add(three);
		
		equal = new JButton("=");
		equal.setSize(98, 35);
		equal.setLocation(151, 177);
		equal.addActionListener(this);
		controlPanel.add(equal);
		
		mod = new JButton("Mod");
		mod.setSize(60, 35);
		mod.setLocation(260, 177);
		mod.addActionListener(this);
		mod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				in.setText(in.getText() + "%");
			}
		});
		controlPanel.add(mod);
		
		zero = new JButton("0");
		zero.setSize(49, 35);
		zero.setLocation(8, 211);
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				in.setText(in.getText()+ "0");
			}
		});
		controlPanel.add(zero);
		
		dec = new JButton(".");
		dec.setSize(49, 35);
		dec.setLocation(55, 211);
		dec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				in.setText(in.getText() + ".");
			}
		});
		controlPanel.add(dec);
		
		approx = new JButton("+-");
		approx.setSize(49, 35);
		approx.setLocation(103, 211);
		approx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				in.setText(in.getText() + "+-");
			}
		});
		controlPanel.add(approx);
		
		FirstDataManup = new JButton("1/n");
		FirstDataManup.setSize(60, 35);
		FirstDataManup.setLocation(151, 211);
		FirstDataManup.addActionListener(this);
		controlPanel.add(FirstDataManup);
		
		percent = new JButton("%");
		percent.setSize(49, 35);
		percent.setLocation(200, 211);
		percent.addActionListener(this);
		percent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				in.setText(in.getText() + "/100");
			}
		});
		controlPanel.add(percent);
		
		SecDataManup = new JButton("sqrt");
		SecDataManup.setSize(60, 35);
		SecDataManup.setLocation(260, 211);
		SecDataManup.addActionListener(this);
		controlPanel.add(SecDataManup);
		
		sin = new JButton("sin");
		sin.setSize(65, 40);
		sin.setLocation(8, 260);
		sin.addActionListener(this);
		controlPanel.add(sin);
		
		cos = new JButton("cos");
		cos.setSize(65, 40);
		cos.setLocation(69, 260);
		cos.addActionListener(this);
		controlPanel.add(cos);
		
		tan = new JButton("tan");
		tan.setSize(65, 40);
		tan.setLocation(128, 260);
		tan.addActionListener(this);
		controlPanel.add(tan);
		
		log = new JButton("log");
		log.setSize(65, 40);
		log.setLocation(193, 260);
		log.addActionListener(this);
		controlPanel.add(log);
		
		ln = new JButton("ln");
		ln.setSize(65, 40);
		ln.setLocation(256, 260);
		ln.addActionListener(this);
		controlPanel.add(ln);
		
		asin = new JButton("asin");
		asin.setSize(65, 40);
		asin.setLocation(8, 298);
		asin.addActionListener(this);
		controlPanel.add(asin);
		
		acos = new JButton("acos");
		acos.setSize(65, 40);
		acos.setLocation(69, 299);
		acos.addActionListener(this);
		controlPanel.add(acos);
		
		atan = new JButton("atan");
		atan.setSize(60, 40);
		atan.setLocation(134, 298);
		atan.addActionListener(this);
		controlPanel.add(atan);
		
		bin = new JButton("10^n");
		bin.setSize(65, 40);
		bin.setLocation(193, 298);
		bin.addActionListener(this);
		controlPanel.add(bin);
		
		abs = new JButton("abs");
		abs.setSize(65, 40);
		abs.setLocation(255, 298);
		abs.addActionListener(this);
		controlPanel.add(abs);
		
		sinh = new JButton("sinh");
		sinh.setSize(65, 40);
		sinh.setLocation(8, 337);
		sinh.addActionListener(this);
		controlPanel.add(sinh);
		
		cosh = new JButton("cosh");
		cosh.setSize(65,40 );
		cosh.setLocation(70,337);
		cosh.addActionListener(this);
		controlPanel.add(cosh);
		
		tanh = new JButton("tanh");
		tanh.setSize(65, 40);
		tanh.setLocation(130, 337);
		tanh.addActionListener(this);
		controlPanel.add(tanh);
		
		exit = new JButton("EXIT");
		exit.setSize(127, 40);
		exit.setLocation(194, 337);
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		controlPanel.add(exit);
		
		
		
		calculatorFrame.add(controlPanel);
		calculatorFrame.setVisible(true);
	}
	//(186, 328)
	
		
		

@Override
//This method contains what the program does when the user clicks a button
public void actionPerformed(ActionEvent e) {
	Font f = new Font("SansSerif", Font.BOLD, 50);
	
	float result = 0;	
		
	//this if statement is for basic operations
		if(e.getSource() == equal) {
			String op = in.getText();
			//sets the variables to the correct text
			int addIndex = op.indexOf("+");
			int subIndex = op.indexOf("-");
			int multIndex = op.indexOf("x");
			int modIndex = op.indexOf("Mod");
			int divIndex = op.indexOf("/");
			int perIndex = op.indexOf("%");
			
			if(addIndex > 0) {
				float a = Float.parseFloat(in.getText().substring(0,addIndex));
				float b = Float.parseFloat(in.getText().substring((int) (addIndex + 1)));
				result = a + b;
			}
			else if(subIndex > 0) {
				float c = Float.parseFloat(in.getText().substring(0,addIndex));
				float d = Float.parseFloat(in.getText().substring((int) (subIndex + 1)));
				result = c - d;
			}
			else if(multIndex > 0) {
				float g = Float.parseFloat(in.getText().substring(0,multIndex));
				float h = Float.parseFloat(in.getText().substring(multIndex + 1));
				
				result = g * h;
				
			}
			else if(modIndex > 0) {
				float m = Float.parseFloat(in.getText().substring(0,modIndex));
				float n = Integer.parseInt(in.getText().substring(modIndex + 1));
				
				result =  m % n;
				
			}
			else if(divIndex > 0) {
				float x = Float.parseFloat(in.getText().substring(0,divIndex));
				float y = Float.parseFloat(in.getText().substring(divIndex + 1));
				
				result = x / y;
				
			}
			else if(perIndex > 0) {
				float a = Float.parseFloat(in.getText().substring(0,perIndex));
				float b = 100;
				
				result = a / b;
			}
			
		}
		//This part is for the most complex operations
		else if(e.getSource() == sin) {
			double k = Double.parseDouble(in.getText());
			
			
				
				result =  (float) Math.sin(k);//used the sin method to calculate sin
				in.setText("sin("+ k +")");
				
		}
		else if(e.getSource() == cos) {
			double l = Double.parseDouble(in.getText());
			
				result =  (float) Math.cos(l);//used the sin method to calculate cos
				in.setText("cos("+ l +")");
				
			
		}
		
		else if(e.getSource() == tan) {
			double m = Double.parseDouble(in.getText());
			
			result =  (float) Math.tan(m);//used the sin method to calculate tan
			in.setText("tan("+ m +")");
			
		}
		else if(e.getSource() == asin) {
			double n = Double.parseDouble(in.getText());
			
			result =  (float) Math.asin(n);//used the sin method to calculate asin
			in.setText("asin("+ n +")");
			
		}
		else if(e.getSource() == acos) {
			double o = Double.parseDouble(in.getText());//used the sin method to calculate acos
			
			result =  (float) Math.acos(o);
			in.setText("acos("+ o +")");
			
		}
		else if(e.getSource() == atan) {
			double p = Double.parseDouble(in.getText());
			
			result =  (float) Math.atan(p);//used the sin method to calculate atan
			in.setText("atan("+  p +")");
		}
		else if(e.getSource() == sinh) {
			double g = Double.parseDouble(in.getText());
			
			result =  (float) Math.sinh(g);//used the sin method to calculate sinh
			in.setText("sinh("+ g +")");
			
		}
		else if(e.getSource() == cosh) {
			double h = Double.parseDouble(in.getText());
			
			result =  (float) Math.cosh(h);//used the sin method to calculate cosh
			in.setText("cosh("+ h +")");
		}
		else if(e.getSource() == tanh) {
			double i = Double.parseDouble(in.getText());
			
			result =  (float) Math.tanh(i);//used the sin method to calculate tanh
			in.setText("tanh("+ i +")");
		}
		else if(e.getSource() == log) { 
			double j = Double.parseDouble(in.getText());
			
			result =  (float) Math.log10(j);
			in.setText("log("+ j +")");//calculates log base 10
		}
		else if(e.getSource() == ln) {
			double k = Double.parseDouble(in.getText());
			
			result =  (float) Math.log(k);//calculates ln
			in.setText("ln("+ k +")");
		}
		else if(e.getSource() == abs) {
			int ab = Integer.parseInt(in.getText());
			
			result = (int) Math.abs(ab);//calculates absolute value
			in.setText("abs|"+ ab +"|");
			
		}
		else if(e.getSource() == FirstDataManup) {
			int ac = Integer.parseInt(in.getText());
			
			result = 1/ac;
			in.setText("1/"+ ac +"");
		}
		else if(e.getSource() == SecDataManup) {
			double bc = Double.parseDouble(in.getText());
			
			result = (float) Math.sqrt(bc);//calculates square roots
			in.setText("sqrt("+ bc +")");
		}
		else if(e.getSource() == bin) {
			double cb = Double.parseDouble(in.getText());
			
			result =  (float) Math.pow(10, cb);
			in.setText("10^"+ cb +"");
		}
		else if(e.getSource() == powerx3) {
			double c = Double.parseDouble(in.getText());
			
			result =  (float) Math.pow(c, 3);
			in.setText( c +"^"+ "3 ");
		}
		else if(e.getSource() == powerx2) {
			double d = Double.parseDouble(in.getText());
			
			result =  (float) Math.pow(d, 2);
			in.setText( d +"^"+ "2");
			
		}
		out.setText("                                                                  "+result);
		out.setFont(f);
	
	}
	public static void main(String[] args) {
		CalculatorGui calc = new CalculatorGui();
	}




	public void actionPerformed1(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

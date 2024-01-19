package Calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	
	boolean isOperatorClicked=false;
	String oldValue,operator;
	float result;
	
	
	JLabel displaylabel;
	JLabel jlabel;
	JRadioButton on;
	JRadioButton off;
	JButton clearbutton;
	JButton deletebutton;
	JButton divisionbutton;
	JButton sevenbutton;
	JButton eightbutton;
	JButton ninebutton;
	JButton minusbutton;
	JButton fourbutton;
	JButton fivebutton;
	JButton sixbutton;
	JButton multiplicationbutton;
	JButton onebutton;
	JButton twobutton;
	JButton threebutton;
	JButton plusbutton;
	JButton zerobutton;
	JButton dotbutton;
	JButton equalbutton;
	
	
	public Calculator()
	{
		JFrame jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(450, 680);
		jf.setLocation(380, 90);
		jf.getContentPane(). setBackground(Color.black);
		
		
		jlabel=new JLabel();
		jlabel.setBounds(30, 10, 380, 30);
		jlabel.setForeground(Color.white);
		jlabel.setBackground(Color.black);
		 jlabel.setFont(new Font("Arial", Font.BOLD, 20));
		jlabel.setHorizontalAlignment(SwingConstants.RIGHT);
		jlabel.setOpaque(true);
		jf.add(jlabel);
	    
		
		
		
		displaylabel=new JLabel();
		displaylabel.setBounds(30, 50, 380, 60);
		displaylabel.setBackground(Color.white);
		displaylabel.setOpaque(true);
		 displaylabel.setFont(new Font("Arial", Font.BOLD, 20));
		displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displaylabel.setForeground(Color.black);
	    jf.add(displaylabel);
	    
	    ButtonGroup buttongroup=new ButtonGroup();
	    on=new JRadioButton("ON");
	    
	    on.setBounds(30, 120, 60, 40);
	   
	    on.setFont(new Font("Arial", Font.BOLD, 14));
	    on.setForeground(Color.white);
	    on.setBackground(Color.black);
	    on.setSelected(true);
	    on.setFocusable(false);
	    on.addActionListener(this);
	    jf.add(on);
	    buttongroup.add(on);
	    
	    off=new JRadioButton("OFF");
	    off.setBounds(30, 145, 60, 40);
	    off.setFont(new Font("Arial", Font.BOLD, 14));
	    off.setForeground(Color.white);
	    off.setBackground(Color.black);
	    off.setFocusable(false);
	    off.setSelected(false);
	    
	    off.addActionListener(this);
	    jf.add(off);
	    buttongroup.add(off);
	    
	    
	   
	    
	    
	     clearbutton=new JButton("C");
	    clearbutton.setBounds(130, 120, 80, 80);
	    clearbutton.setFont(new Font("Arial", Font.BOLD, 20));
	    clearbutton.addActionListener(this);
	    jf.add(clearbutton);
	    
	     deletebutton=new JButton("DEL");
	    deletebutton.setBounds(230, 120, 80, 80);
	    deletebutton.setFont(new Font("Arial", Font.BOLD, 20));
	    deletebutton.addActionListener(this);
	    jf.add(deletebutton);
	    
	    divisionbutton=new JButton("/");
	    divisionbutton.setBounds(330, 120, 80, 80);
	    divisionbutton.setFont(new Font("Arial", Font.BOLD, 20));
	    divisionbutton.addActionListener(this);
	    jf.add(divisionbutton);
	    
	     sevenbutton=new JButton("7");
	    sevenbutton.setBounds(30, 220, 80, 80);
	    sevenbutton.setFont(new Font("Arial", Font.BOLD, 20));
	    sevenbutton.addActionListener(this);
	    jf.add(sevenbutton);
	    
	    
	     eightbutton=new JButton("8");
	    eightbutton.setBounds(130, 220, 80, 80);
	    eightbutton.setFont(new Font("Arial", Font.BOLD, 20));
	    eightbutton.addActionListener(this);
	    jf.add(eightbutton);
	    
	    ninebutton=new JButton("9");
	    ninebutton.setBounds(230, 220, 80, 80);
	    ninebutton.setFont(new Font("Arial", Font.BOLD, 20));
	    ninebutton.addActionListener(this);
	    jf.add(ninebutton);
	    
	     minusbutton=new JButton("-");
	    minusbutton.setBounds(330, 220, 80, 80);
	    minusbutton.setFont(new Font("Arial", Font.BOLD, 20));
	    minusbutton.addActionListener(this);
	    jf.add(minusbutton);
	    
	    
	     fourbutton=new JButton("4");
	    fourbutton.setBounds(30, 320, 80, 80);
	    fourbutton.setFont(new Font("Arial", Font.BOLD, 20));
	    fourbutton.addActionListener(this);
	    jf.add(fourbutton);
	    
	    
	     fivebutton=new JButton("5");
	    fivebutton.setBounds(130, 320, 80, 80);
	    fivebutton.setFont(new Font("Arial", Font.BOLD, 20));
	    fivebutton.addActionListener(this);
	    jf.add(fivebutton);
	    
	    sixbutton=new JButton("6");
	    sixbutton.setBounds(230, 320, 80, 80);
	    sixbutton.setFont(new Font("Arial", Font.BOLD, 20));
	    sixbutton.addActionListener(this);
	    jf.add(sixbutton);
	    
	    multiplicationbutton=new JButton("x");
	    multiplicationbutton.setBounds(330, 320, 80, 80);
	    multiplicationbutton.setFont(new Font("Arial", Font.BOLD, 20));
	    multiplicationbutton.addActionListener(this);
	    jf.add(multiplicationbutton);
	    
	     onebutton=new JButton("1");
	    onebutton.setBounds(30, 420, 80, 80);
	    onebutton.setFont(new Font("Arial", Font.BOLD, 20));
	    onebutton.addActionListener(this);
	    jf.add(onebutton);
	    
	    
	    twobutton=new JButton("2");
	    twobutton.setBounds(130, 420, 80, 80);
	    twobutton.setFont(new Font("Arial", Font.BOLD, 20));
	    twobutton.addActionListener(this);
	    jf.add(twobutton);
	    
	     threebutton=new JButton("3");
	    threebutton.setBounds(230, 420, 80, 80);
	    threebutton.setFont(new Font("Arial", Font.BOLD, 20));
	    threebutton.addActionListener(this);
	    jf.add(threebutton);
	    
	    plusbutton=new JButton("+");
	    plusbutton.setBounds(330, 420, 80, 80);
	    plusbutton.setFont(new Font("Arial", Font.BOLD, 20));
	    plusbutton.addActionListener(this);
	    jf.add(plusbutton);
	    
	     zerobutton=new JButton("0");
	    zerobutton.setBounds(30, 520, 180, 80);
	    zerobutton.setFont(new Font("Arial", Font.BOLD, 20));
	    zerobutton.addActionListener(this);
	    jf.add(zerobutton);
	    
	    
	    
	     dotbutton=new JButton(".");
	    dotbutton.setBounds(230, 520, 80, 80);
	    dotbutton.setFont(new Font("Arial", Font.BOLD, 20));
	    dotbutton.addActionListener(this);
	    jf.add(dotbutton);
	    
	     equalbutton=new JButton("=");
	    equalbutton.setBounds(330, 520, 80, 80);
	    equalbutton.setFont(new Font("Arial", Font.BOLD, 20));
	    equalbutton.addActionListener(this);
	    jf.add(equalbutton);
	    
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}
	public void enable()
	{
		on.setEnabled(false);
		off.setEnabled(true);
		onebutton.setEnabled(true);
		twobutton.setEnabled(true);
		threebutton.setEnabled(true);
		fourbutton.setEnabled(true);
		fivebutton.setEnabled(true);
		sixbutton.setEnabled(true);
		sevenbutton.setEnabled(true);
		eightbutton.setEnabled(true);
		ninebutton.setEnabled(true);
		zerobutton.setEnabled(true);
		plusbutton.setEnabled(true);
		minusbutton.setEnabled(true);
		multiplicationbutton.setEnabled(true);
		divisionbutton.setEnabled(true);
		equalbutton.setEnabled(true);
		dotbutton.setEnabled(true);
		clearbutton.setEnabled(true);
		deletebutton.setEnabled(true);
		
		
		
	}
	public void disable()
	{
		on.setEnabled(true);
		off.setEnabled(false);
		onebutton.setEnabled(false);
		twobutton.setEnabled(false);
		threebutton.setEnabled(false);
		fourbutton.setEnabled(false);
		fivebutton.setEnabled(false);
		sixbutton.setEnabled(false);
		sevenbutton.setEnabled(false);
		eightbutton.setEnabled(false);
		ninebutton.setEnabled(false);
		zerobutton.setEnabled(false);
		plusbutton.setEnabled(false);
		minusbutton.setEnabled(false);
		multiplicationbutton.setEnabled(false);
		divisionbutton.setEnabled(false);
		equalbutton.setEnabled(false);
		dotbutton.setEnabled(false);
		clearbutton.setEnabled(false);
		deletebutton.setEnabled(false);
		
		
		
	}
	
	public static void main(String[] args) {
		new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenbutton)
		{
			if(isOperatorClicked)
			{
				displaylabel.setText("7");
				isOperatorClicked=false;
			}
		else
		displaylabel.setText(displaylabel.getText()+"7");
		}
		else if(e.getSource()==eightbutton)
		{
			if(isOperatorClicked)
			{
				displaylabel.setText("8");
				isOperatorClicked=false;
			}
		else
		displaylabel.setText(displaylabel.getText()+"8");
		}
		else if(e.getSource()==ninebutton)
		{
			if(isOperatorClicked)
			{
				displaylabel.setText("9");
				isOperatorClicked=false;
			}
		else
		displaylabel.setText(displaylabel.getText()+"9");
		}else if(e.getSource()==fourbutton)
		{
			if(isOperatorClicked)
			{
				displaylabel.setText("4");
				isOperatorClicked=false;
			}
		else
		displaylabel.setText(displaylabel.getText()+"4");
		}else if(e.getSource()==fivebutton)
		{
			if(isOperatorClicked)
			{
				displaylabel.setText("5");
				isOperatorClicked=false;
			}
		else
		displaylabel.setText(displaylabel.getText()+"5");
		}else if(e.getSource()==sixbutton)
		{
			if(isOperatorClicked)
			{
				displaylabel.setText("6");
				isOperatorClicked=false;
			}
		else
		displaylabel.setText(displaylabel.getText()+"6");
		}else if(e.getSource()==onebutton)
		{
			if(isOperatorClicked)
			{
				displaylabel.setText("1");
				isOperatorClicked=false;
			}
		else
		displaylabel.setText(displaylabel.getText()+"1");
		}else if(e.getSource()==twobutton)
		{
			if(isOperatorClicked)
			{
				displaylabel.setText("2");
				isOperatorClicked=false;
			}
		else
		displaylabel.setText(displaylabel.getText()+"2");
		}else if(e.getSource()==threebutton)
		{
			if(isOperatorClicked)
			{
				displaylabel.setText("3");
				isOperatorClicked=false;
			}
		else
		displaylabel.setText(displaylabel.getText()+"3");
		}else if(e.getSource()==zerobutton)
		{
			if(isOperatorClicked)
			{
				displaylabel.setText("0");
				isOperatorClicked=false;
			}
		else
		displaylabel.setText(displaylabel.getText()+"0");
		}else if(e.getSource()==clearbutton)
		{
		displaylabel.setText(" ");
		}else if(e.getSource()==dotbutton)
		{
			if(isOperatorClicked)
			{
				displaylabel.setText(".");
				isOperatorClicked=false;
			}
		else
		displaylabel.setText(displaylabel.getText()+".");
		}else if(e.getSource()==plusbutton)
		{
		   isOperatorClicked=true;
		   operator="+";
		   oldValue=displaylabel.getText();
		   jlabel.setText(oldValue+"+");
		   displaylabel.setText("");
		}else if(e.getSource()==minusbutton)
		{
			isOperatorClicked=true;
			 operator="-";
			   oldValue=displaylabel.getText();
			   jlabel.setText(oldValue+"-");
			   displaylabel.setText("");
		}else if(e.getSource()==multiplicationbutton)
		{
			isOperatorClicked=true;
			 operator="*";
			   oldValue=displaylabel.getText();
			   jlabel.setText(oldValue+"x");
			   displaylabel.setText("");
		}else if(e.getSource()==divisionbutton)
		{
			isOperatorClicked=true;
			 operator="/";
			   oldValue=displaylabel.getText();
			   jlabel.setText(oldValue+"/");
			   displaylabel.setText("");
		}else if(e.getSource()==deletebutton)
		{
		  String string=displaylabel.getText();
		  displaylabel.setText(" ");
		  for(int i=0; i<string.length()-1; i++)
		  {
			  displaylabel.setText(displaylabel.getText()+string.charAt(i));
		  }
		}else if(e.getSource()==equalbutton)
		{
		   String newValue=displaylabel.getText();
		   float newValueF=Float.parseFloat(newValue);
		   float oldValueF=Float.parseFloat(oldValue);
		   
		   switch(operator)
		   {
		   case "+":
			   result=oldValueF + newValueF;
			   break;
		   case "-":
			   result=oldValueF - newValueF;
			   break;
		   case "*":
			   result=oldValueF * newValueF;
			   break;
		   case "/":
			   result=oldValueF / newValueF;
			   break;
			   
		   }
		   displaylabel.setText(String.valueOf(result));
		   oldValue=String.valueOf(result);
		   jlabel.setText(" ");
		   
		}else if(e.getSource()==on)
		{
			enable();
		}else if(e.getSource()==off)
		{
			disable();
		}
		
		
	}

}

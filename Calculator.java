
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
 
 
class Calculator extends JFrame implements ActionListener
{
private JFrame f;
private JTextField t;
private JButton btndel,btnac,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btndiv,btnmul,btnsub,btnadd,btndec,btneq;
static double a=0,b=0,result=0;
static int operator=0;

Calculator(){

calculation();

}

public void calculation(){
f= new JFrame("Calculator");

t= new JTextField(10);
t.setBounds(40,40,330,50);
   t.setBackground(Color.CYAN);
f.add(t);

btn7= new JButton("7");
btn7.setBounds(40,100,70,40);
btn7.addActionListener(this);
f.add(btn7);

btn8= new JButton("8");
btn8.setBounds(130,100,70,40);
btn8.addActionListener(this);
f.add(btn8);

btn9= new JButton("9");
btn9.setBounds(220,100,70,40);
btn9.addActionListener(this);
f.add(btn9);

btndiv= new JButton("/");
btndiv.setBounds(310,100,60,40);
btndiv.setBackground(Color.GREEN);
btndiv.addActionListener(this);
f.add(btndiv);

btn4= new JButton("4");
btn4.setBounds(40,170,70,40);
btn4.addActionListener(this);
f.add(btn4);

btn5= new JButton("5");
btn5.setBounds(130,170,70,40);
btn5.addActionListener(this);
f.add(btn5);

btn6= new JButton("6");
btn6.setBounds(220,170,70,40);
btn6.addActionListener(this);
f.add(btn6);

btnmul= new JButton("*");
btnmul.setBounds(310,170,60,40);
btnmul.setBackground(Color.GREEN);
btnmul.addActionListener(this);
f.add(btnmul);

btn1= new JButton("1");
btn1.setBounds(40,240,70,40);
btn1.addActionListener(this);
f.add(btn1);

btn2= new JButton("2");
btn2.setBounds(130,240,70,40);
btn2.addActionListener(this);
f.add(btn2);

btn3= new JButton("3");
btn3.setBounds(220,240,70,40);
btn3.addActionListener(this);
f.add(btn3);

btnsub= new JButton("-");
btnsub.setBounds(310,240,60,40);
btnsub.setBackground(Color.GREEN);
btnsub.addActionListener(this);
f.add(btnsub);


btndec= new JButton(".");
btndec.setBounds(40,310,70,40);
btndec.addActionListener(this);
f.add(btndec);

btn0= new JButton("0");
btn0.setBounds(130,310,70,40);
btn0.addActionListener(this);
f.add(btn0);

btneq= new JButton("=");
btneq.setBounds(220,310,70,40);
btneq.addActionListener(this);
f.add(btneq);

btnadd= new JButton("+");
btnadd.setBounds(310,310,60,40);
btnadd.setBackground(Color.GREEN);
btnadd.addActionListener(this);
f.add(btnadd);

btndel= new JButton("DEL");
btndel.setBounds(100,380,100,40);
btndel.setBackground(Color.RED);
btndel.addActionListener(this);
f.add(btndel);

btnac= new JButton("AC");
btnac.setBounds(230,380,100,40);
btnac.setBackground(Color.WHITE);
btnac.addActionListener(this);
f.add(btnac);


f.setLayout(null);
f.setBackground(Color.BLUE);
f.setVisible(true);
f.setBounds(50,50,400,500);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setResizable(false);
}
 
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==btn1)
t.setText(t.getText().concat("1"));

if(e.getSource()==btn2)
t.setText(t.getText().concat("2"));

if(e.getSource()==btn3)
t.setText(t.getText().concat("3"));

if(e.getSource()==btn4)
t.setText(t.getText().concat("4"));

if(e.getSource()==btn5)
t.setText(t.getText().concat("5"));

if(e.getSource()==btn6)
t.setText(t.getText().concat("6"));

if(e.getSource()==btn7)
t.setText(t.getText().concat("7"));

if(e.getSource()==btn8)
t.setText(t.getText().concat("8"));

if(e.getSource()==btn9)
t.setText(t.getText().concat("9"));

if(e.getSource()==btn0)
t.setText(t.getText().concat("0"));

if(e.getSource()==btndec)
t.setText(t.getText().concat("."));

if(e.getSource()==btnadd)
{
a=Double.parseDouble(t.getText());
operator=1;
t.setText("");
}

if(e.getSource()==btnsub)
{
a=Double.parseDouble(t.getText());
operator=2;
t.setText("");
}

if(e.getSource()==btnmul)
{
a=Double.parseDouble(t.getText());
operator=3;
t.setText("");
}

if(e.getSource()==btndiv)
{
a=Double.parseDouble(t.getText());
operator=4;
t.setText("");
}
 
if(e.getSource()==btneq)
{
b=Double.parseDouble(t.getText());

switch(operator)
{
case 1: result=a+b;
break;

case 2: result=a-b;
break;

case 3: result=a*b;
break;

case 4: result=a/b;
break;

default: result=0;
}
t.setText(""+result);
}
if(e.getSource()==btnac)
t.setText("");

if(e.getSource()==btndel)
{
String s=t.getText();
t.setText("");
for(int i=0;i<s.length()-1;i++)
t.setText(t.getText()+s.charAt(i));
}
}
 }


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener
{
		JLabel l1,l2,l3;
		JPasswordField pf;
		JTextField tf;
		JButton b1,b2; 
		JPanel p;
		
	public Project(){
			tool();
		}
	public void tool()
	{
		this.setTitle(" Managment ");
		this.setSize(1200,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();
		p.setSize(new Dimension(450,280));
		p.setBackground(Color.black);
		p.setLayout(null);
		
		l1 = new JLabel("Student Managment System Log In Page");
		l1.setFont(new Font("Serif",Font.BOLD,30));
		l1.setForeground(Color.white);
		l1.setBounds(300,50,550,40);
		p.add(l1);
		
		l2 = new JLabel("User Name ");
		l2.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
		l2.setForeground(Color.red);
		l2.setBounds(100,100,150,20);
		p.add(l2);
		
		l3 = new JLabel("Password");
		l3.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
		l3.setForeground(Color.red);
		l3.setBounds(100,150,150,20);
		p.add(l3);
		
		tf = new JTextField();
		tf.setBounds(220,100,100,25);
		p.add(tf);

	    pf = new JPasswordField();
		pf.setBounds(220,150,100,25);
		p.add(pf);
		
		b1 = new JButton("Log in ");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.white);
		b1.setBackground(Color.red);
		b1.setBounds(180,220,100,25);
		b1.addActionListener(this);
		p.add(b1);
		
		b2 = new JButton("Exit");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setForeground(Color.white);
		b2.setBackground(Color.red);
		b2.setBounds(330,320,100,30);
		b2.addActionListener(this);
		p.add(b2);	

	    
	
		
        this.add(p);		
	}

		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{
			 String name = tf.getText();
			String password = pf.getText();
			if(name.equals("admin")&&password.equals("password")){
			Project2 P2 = new Project2();
				P2.setVisible(true);
			}
			else
			{
				JOptionPane.showMessageDialog(this,"Incorrect User Name And Password");
			}
			}
			else if(ae.getSource()==b2)
			{
	            System.exit(0);
			}
		}
		


}
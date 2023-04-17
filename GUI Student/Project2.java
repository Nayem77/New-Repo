import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
public class Project2 extends JFrame implements ActionListener 
{
		private JLabel l1,l2,l3,l4,l5;
		private JTextField tf1,tf2,tf3,tf4;
		private JButton b1,b2,b3,b4,b5,b6; 
		private JPanel p;
		private JTable t;
		private DefaultTableModel dtm;
		private JScrollPane sp;
		private String [] columns={"Student Id","Student Name","Depertment Name","C.G.P.A"};
		private String [] rows=new String[4];
		
		public Project2(){
			tool();
		}
	public void tool(){
		this.setTitle(" Managment ");
		this.setSize(1200,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();
		p.setSize(new Dimension(1200,800));
		p.setBackground(Color.black);
		p.setLayout(null);
		
		l1 = new JLabel("Student Managment System");
		l1.setFont(new Font("Serif",Font.BOLD,30));
		l1.setForeground(Color.white);
		l1.setBounds(300,50,500,40);
		p.add(l1);
		
		l2 = new JLabel("Student Id ");
		l2.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
		l2.setForeground(Color.red);
		l2.setBounds(100,100,140,20);
		p.add(l2);
		
		tf1 = new JTextField();
		tf1.setBounds(300,100,200,25);
		p.add(tf1);
		
		b1 = new JButton("Add Student Information");
		b1.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
		b1.setForeground(Color.red);
		b1.setBounds(540,100,250,20);
		b1.addActionListener(this);
		p.add(b1);
		
		l3 = new JLabel("Student Name ");
		l3.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
		l3.setForeground(Color.red);
		l3.setBounds(100,150,140,20);
		
		p.add(l3);
		
		tf2 = new JTextField();
		tf2.setBounds(300,150,200,25);
		p.add(tf2);
		
		b2 = new JButton("Teacher");
		b2.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
		b2.setForeground(Color.red);
		b2.setBounds(540,150,100,20);
		b2.addActionListener(this);
		p.add(b2);
		
		l4 = new JLabel("Student Depertment Name ");
		l4.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
		l4.setForeground(Color.red);
		l4.setBounds(100,200,500,20);
		p.add(l4);
		
		tf3 = new JTextField();
		tf3.setBounds(300,200,200,25);
		p.add(tf3);
		
		b3 = new JButton("Student");
		b3.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
		b3.setForeground(Color.red);
		b3.setBounds(540,200,100,20);
		b3.addActionListener(this);
		p.add(b3);
		
		l5 = new JLabel("Student C.G.P.A ");
		l5.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
		l5.setForeground(Color.red);
		l5.setBounds(100,250,500,20);
		
		p.add(l5);
		
		tf4 = new JTextField();
		tf4.setBounds(300,250,200,25);
		p.add(tf4);
	
		
		b4 = new JButton("Delete Student Information");
		b4.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
		b4.setForeground(Color.red);
		b4.setBounds(540,250,250,20);
		b4.addActionListener(this);
		p.add(b4);
		
		b5 = new JButton("Back");
		b5.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
		b5.setForeground(Color.red);
		b5.setBounds(540,300,100,30);
		b5.addActionListener(this);
		p.add(b5);
		
		b6 = new JButton("Exit");
		b6.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
		b6.setForeground(Color.red);
		b6.setBounds(700,300,100,30);
		b6.addActionListener(this);
		p.add(b6);
		
		/*b7 = new JButton("Admin");
		b7.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
		b7.setForeground(Color.red);
		b7.setBounds(100,250,80,20);
		//b7.addActionListener(this);
		p1.add(b7);
		
		b8 = new JButton("Exit");
		b8.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
		b8.setForeground(Color.red);
		b8.setBounds(700,280,80,20);
		//b8.addActionListener(this);
		p1.add(b8);*/
		
		
		
		
	

				
		
		
        this.add(p);
      t=new JTable();
      dtm=new DefaultTableModel();
     dtm.setColumnIdentifiers(columns);	 
     t.setModel(dtm);
     t.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
     t.setSelectionBackground(Color.green);
     t.setBackground(Color.white);
      t.setRowHeight(30);
	 sp=new JScrollPane(t);
	 sp.setBounds(100,350,740,265);
	 p.add(sp);
	  
	  t.addMouseListener(new MouseAdapter(){
		  public void mouseClicked(MouseEvent me)
		  {
			int num=t.getSelectedRow();
            String id=dtm.getValueAt(num,0).toString();
            String name=dtm.getValueAt(num,1).toString();
            String depertmentname=dtm.getValueAt(num,2).toString();
            String cgpa=dtm.getValueAt(num,3).toString();
            	tf1.setText(id);
			tf2.setText(name);
			tf3.setText(depertmentname);
			tf4.setText(cgpa);		
		  }
	  });
	   
	}
   public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			rows[0]=tf1.getText();
			rows[1]=tf2.getText();
			rows[2]=tf3.getText();
			rows[3]=tf4.getText();
			dtm.addRow(rows);
			

		}
		else if(ae.getSource()==b2)
		{
			int num=t.getSelectedRow();
			String id=tf1.getText();
            String name=tf2.getText();
            String depertmentname=tf3.getText();
            String cgpa=tf4.getText();
			
			dtm.setValueAt(id,num,0);
			dtm.setValueAt(name,num,1);
			dtm.setValueAt(depertmentname,num,2);
			dtm.setValueAt(cgpa,num,3);
			
		}
		else if(ae.getSource()==b3)
		{
			tf1.setText(" ");
			tf2.setText(" ");
			tf3.setText(" ");
			tf4.setText(" ");
		}
		else if(ae.getSource()==b4)
		{
			int num=t.getSelectedRow();
			if(num>=0)
			{
				dtm.removeRow(num);
			}
			else
			{
				JOptionPane.showMessageDialog(null,"No selected Row");
			}
		}
		else if(ae.getSource()==b5)
			{
	            Project P1 = new Project();
				
				P1.setVisible(true);
			}
		else if(ae.getSource()==b6)
			{
	            System.exit(0);
			}
	}
	//public static void main(String[] args)
	//{
	//	Project2 P=new Project2();
	//	P.show();
		
	//}
	
}


















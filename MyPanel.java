import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

public class MyPanel extends JPanel implements ActionListener
{
    public JButton btnCane;
    public JButton btnGatto;
    public JButton btnCavallo;
    public JButton btnDelfino;
    public JButton btnElefante;
    public JButton btnReset; 
    public JLabel lblVuota;
    public ImageIcon gatto;
    public ImageIcon cane;
    public ImageIcon cavallo;
    public ImageIcon delfino;
    public ImageIcon elefante;
    public ImageIcon reset;
    public Image ca;
              
    public MyPanel() 
    {
        btnCane=new JButton("CANE");
        btnGatto=new JButton("GATTO");
        btnCavallo=new JButton("CAVALLO");
        btnDelfino=new JButton("DELFINO");
        btnElefante=new JButton("ELEFANTE");
        btnReset=new JButton("RESET");
        lblVuota=new JLabel("  ");
        
        Dimension dim= new Dimension(100,30);
        
        btnCane.setMinimumSize(dim);
        btnGatto.setMinimumSize(dim);
        btnCavallo.setMinimumSize(dim);
        btnDelfino.setMinimumSize(dim);
        btnElefante.setMinimumSize(dim);
        btnReset.setMinimumSize(dim);
        
        gatto=new ImageIcon("gatto.jpg");
        cane=new ImageIcon("cane.jpg");
        cavallo=new ImageIcon("cavallo.jpg");
        delfino=new ImageIcon("delfino.jpg");
        elefante=new ImageIcon("elefante.jpg");
        reset=new ImageIcon("verde.jpg");
        
        Border border=LineBorder.createBlackLineBorder();
        GroupLayout layout = new GroupLayout(this);
               
        //GridLayout layout=new GridLayout(10, 1);
        setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        GroupLayout.ParallelGroup hGroup = layout.createParallelGroup();
        hGroup.addGroup(layout.createParallelGroup().addComponent(lblVuota));
        hGroup.addGroup(layout.createParallelGroup().addComponent(btnCane));
        hGroup.addGroup(layout.createParallelGroup().addComponent(btnGatto));
        hGroup.addGroup(layout.createParallelGroup().addComponent(btnCavallo));
        hGroup.addGroup(layout.createParallelGroup().addComponent(btnDelfino));
        hGroup.addGroup(layout.createParallelGroup().addComponent(btnElefante));
        hGroup.addGroup(layout.createParallelGroup().addComponent(btnReset));
        layout.setHorizontalGroup(hGroup);  
        
        GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();                
        vGroup.addGroup(layout.createParallelGroup().addComponent(lblVuota));
        vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(btnCane));
        vGroup.addGroup(layout.createParallelGroup().addComponent(btnGatto));
        vGroup.addGroup(layout.createParallelGroup().addComponent(btnCavallo));
        vGroup.addGroup(layout.createParallelGroup().addComponent(btnDelfino));
        vGroup.addGroup(layout.createParallelGroup().addComponent(btnElefante));
        vGroup.addGroup(layout.createParallelGroup().addComponent(btnReset));
        layout.setVerticalGroup(vGroup);

        btnCane.setBorder(border);
        btnGatto.setBorder(border);
        btnCavallo.setBorder(border);
        btnDelfino.setBorder(border);
        btnElefante.setBorder(border);
        btnReset.setBorder(border);
        
        this.add(btnCane);
        this.add(btnGatto);
        this.add(btnCavallo);
        this.add(btnDelfino);
        this.add(btnElefante);
        this.add(btnReset);
               
        btnCane.addActionListener(this);
        btnGatto.addActionListener(this);
        btnCavallo.addActionListener(this);
        btnDelfino.addActionListener(this);
        btnElefante.addActionListener(this);
        btnReset.addActionListener(this);
    } 
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(ca, 200, 35, null);
    }
    
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource()==btnCane)
        {
          ca=cane.getImage();
          setBackground(Color.cyan);
        }
        if (e.getSource()==btnGatto)
        {
           ca=gatto.getImage();
           setBackground(Color.red);
        }
        if (e.getSource()==btnCavallo)
        {
            ca=cavallo.getImage();
            setBackground(Color.blue);
        }
        if (e.getSource()==btnDelfino)
        {
            ca=delfino.getImage();
            setBackground(Color.yellow);
        }
        if (e.getSource()==btnElefante)
        {
           ca=elefante.getImage();
           setBackground(Color.gray);
        }
        if (e.getSource()==btnReset)
        {
            ca=reset.getImage();
            setBackground(Color.green);
        }
    }

}

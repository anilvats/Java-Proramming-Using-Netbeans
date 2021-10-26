/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaawt;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


/**
 * // Demonstrate Labels ad Button 
 *
 * @author ANIL VATS
 */
/*
<applet code="LabelDemo" width=300 height=200>
</applet>
*/
public class LabelButtonDemo extends Applet implements ActionListener,ItemListener {
       String msg = "Inital Value ";
       String msg1 = "";
       
       Button yes, no, maybe;
       TextField txtfUser,txtfPass;
       
       Checkbox window,android,solaris,linux;
       
       
       public void init() {
       
       Label one = new Label("Username",Label.LEFT);
       TextField txtfUser = new TextField("Enter the userName");
       
       Label two = new Label("Password", Label.LEFT);
       TextField txtfPass = new TextField("Enter The password");
       
       txtfUser = new TextField(12);
       txtfPass = new TextField(8);
       txtfPass.setEchoChar('*');
       
       window = new Checkbox("Windoq",null,true);
       android = new Checkbox("android");
       solaris = new Checkbox("solaris");
       linux= new Checkbox("linux"); 
       
       yes = new Button("Yes");
        no = new Button("No");
        maybe = new Button("Undecided");
        
        add(one);
        add(txtfUser);
        add(two);
        add(txtfPass);
                
         
        add(yes);
        add(no);
        add(maybe);
               
        add(window);
        add(android);
        add(solaris);
        add(linux);
        
        yes.addActionListener(this);
        no.addActionListener(this);
        maybe.addActionListener(this);
        txtfUser.addActionListener(this);
        txtfPass.addActionListener(this);
            
        window.addItemListener(this);
        android.addItemListener(this);
        solaris.addItemListener(this);
        linux.addItemListener(this);
        
        //txtfUser.addActionListener(this);
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
      }
     public void actionPerformed(ActionEvent ae) {
     String str = ae.getActionCommand();
     if(str.equals("Yes")) {
     msg = "You pressed Yes.";
        }
     else if(str.equals("No")) {
     msg = "You pressed No.";
      }
     else {
     msg = "You pressed Undecided.";
       }
      //repaint();
       }
     
     public void itemStateChanged(ItemEvent ie) {
      repaint();
     }
     
     public void paint(Graphics g) {
     g.drawString(msg, 16, 150);
     msg = "Current state: ";
g.drawString(msg1, 16, 200);
msg1 = " Windows: " + window.getState();
g.drawString(msg1, 16, 220);
msg1 = " Android: " + android.getState();
g.drawString(msg1, 16, 240);
msg1 = " Solaris: " + solaris.getState();
g.drawString(msg1, 16, 260);
msg1 = " linux : " + linux.getState();
g.drawString(msg1, 16, 280);
     //g.drawString("UserName: " + txtfUser.getText(), 6, 60);
     //g.drawString("Password: " + txtfPass.getText(), 6, 100);
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();

        label1.setText("label1");

        setBackground(java.awt.Color.white);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        setForeground(java.awt.Color.black);
        setName("Txt &Btn DEMO PROGRAM"); // NOI18N
        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}

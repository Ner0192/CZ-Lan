
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Chater.java
 *
 * Created on 09-May-2017, 16:27:02
 */

class recthread extends Thread
{
DatagramSocket ds,ds1;
DatagramPacket dp,dp1;
InetAddress adr;
cross_zero cz;
byte [] arr,array;


public recthread(cross_zero obj)
    {
    cz=obj;
    try{
        ds=new DatagramSocket(1235);
        ds1=new DatagramSocket(1236);
    }
    catch(Exception ex){JOptionPane.showMessageDialog(null, ex.getMessage());}
    }

public void run()
    {
    while(true)
    {
       try{
        arr=new byte[255];
        array=new byte[255];
        dp=new DatagramPacket(arr,arr.length);
        dp1=new DatagramPacket(array,array.length);
        ds.receive(dp);
        ds1.receive(dp1);
        arr=dp.getData();
        array=dp1.getData();
        String data=new String(arr),s;
        data=data.trim();
        cz.datab=data;
        cz.button=Integer.parseInt(s=new String(array).trim());
        if(cz.w==0){if(cz.button==1&&(cz.l1.getText()!="X"||cz.l1.getText()!="O"))
        {
            cz.l1.setText(cz.datab);
            cz.i++;
        }
 else   if(cz.button==2&&(cz.l2.getText()!="X"||cz.l2.getText()!="O"))
        {
            cz.l2.setText(cz.datab);
            cz.i++;
        }
 else   if(cz.button==3&&(cz.l3.getText()!="X"||cz.l3.getText()!="O"))
        {
            cz.l3.setText(cz.datab);
            cz.i++;
        }
 else   if(cz.button==4&&(cz.l4.getText()!="X"||cz.l4.getText()!="O"))
        {
            cz.l4.setText(cz.datab);
            cz.i++;
        }
 else   if(cz.button==5&&(cz.l5.getText()!="X"||cz.l5.getText()!="O"))
        {
            cz.l5.setText(cz.datab);
            cz.i++;
        }
 else   if(cz.button==6&&(cz.l6.getText()!="X"||cz.l6.getText()!="O"))
        {
            cz.l6.setText(cz.datab);
            cz.i++;
        }
 else   if(cz.button==7&&(cz.l7.getText()!="X"||cz.l7.getText()!="O"))
        {
            cz.l7.setText(cz.datab);
            cz.i++;
        }
 else   if(cz.button==8&&(cz.l8.getText()!="X"||cz.l8.getText()!="O"))
        {
            cz.l8.setText(cz.datab);
            cz.i++;
        }
 else   if(cz.button==9&&(cz.l9.getText()!="X"||cz.l9.getText()!="O"))
        {
            cz.l9.setText(cz.datab);
            cz.i++;
        }
        cz.judge();}
       }
    catch(Exception ex){JOptionPane.showMessageDialog(null, ex.getMessage());}
    }
    }
    }



/**
 *
 * @author Raj Kumar Teotia
 */
public class cross_zero extends javax.swing.JFrame {
int i=0,w=0;
DatagramSocket ds,ds1;
DatagramPacket dp,dp1;
InetAddress adr;
recthread rt;
String nn;
int button;
byte [] arr,array;
String datab;


    /** Creates new form Chater */
public void judge()
	{
		if(l1.getText()=="X"&&l2.getText()=="X"&&l3.getText()=="X")
		{
			JOptionPane.showMessageDialog(null, "Player "+nn+" Wins!");
			w=1;
		}
		else
		if(l3.getText()=="X"&&l6.getText()=="X"&&l9.getText()=="X")
		{
			JOptionPane.showMessageDialog(null, "Player "+nn+" Wins!");
			w=1;
		}
		else
		if(l9.getText()=="X"&&l8.getText()=="X"&&l7.getText()=="X")
		{
			JOptionPane.showMessageDialog(null, "Player "+nn+" Wins!");
			w=1;
		}
		else
		if(l7.getText()=="X"&&l4.getText()=="X"&&l1.getText()=="X")
		{
			JOptionPane.showMessageDialog(null, "Player "+nn+" Wins!");
			w=1;
		}
		else
		if(l1.getText()=="X"&&l5.getText()=="X"&&l9.getText()=="X")
		{
			JOptionPane.showMessageDialog(null, "Player "+nn+" Wins!");
			w=1;
		}
		else
		if(l3.getText()=="X"&&l5.getText()=="X"&&l7.getText()=="X")
		{
			JOptionPane.showMessageDialog(null, "Player "+nn+" Wins!");
			w=1;
		}
		else
		if(l2.getText()=="X"&&l5.getText()=="X"&&l8.getText()=="X")
		{
			JOptionPane.showMessageDialog(null, "Player "+nn+" Wins!");
			w=1;
		}
		else
		if(l4.getText()=="X"&&l5.getText()=="X"&&l6.getText()=="X")
		{
			JOptionPane.showMessageDialog(null, "Player "+nn+" Wins!");
			w=1;
		}
		if(l1.getText()=="O"&&l2.getText()=="O"&&l3.getText()=="O")
		{
			JOptionPane.showMessageDialog(null, "Player 2 Wins!");
			w=1;
		}
		else
		if(l3.getText()=="O"&&l6.getText()=="O"&&l9.getText()=="O")
		{
			JOptionPane.showMessageDialog(null, "Player 2 Wins!");
			w=1;
		}
		else
		if(l9.getText()=="O"&&l8.getText()=="O"&&l7.getText()=="O")
		{
			JOptionPane.showMessageDialog(null, "Player 2 Wins!");
			w=1;
		}
		else
		if(l7.getText()=="O"&&l4.getText()=="O"&&l1.getText()=="O")
		{
			JOptionPane.showMessageDialog(null, "Player 2 Wins!");
			w=1;
		}
		else
		if(l1.getText()=="O"&&l5.getText()=="O"&&l9.getText()=="O")
		{
			JOptionPane.showMessageDialog(null, "Player 2 Wins!");
			w=1;
		}
		else
		if(l3.getText()=="O"&&l5.getText()=="O"&&l7.getText()=="O")
		{
			JOptionPane.showMessageDialog(null, "Player 2 Wins!");
			w=1;
		}
		else
		if(l2.getText()=="O"&&l5.getText()=="O"&&l8.getText()=="O")
		{
			JOptionPane.showMessageDialog(null, "Player 2 Wins!");
			w=1;
		}
		else
		if(l4.getText()=="O"&&l5.getText()=="O"&&l6.getText()=="O")
		{
			JOptionPane.showMessageDialog(null, "Player 2 Wins!");
			w=1;
		}
		else
		if((l1.getText()=="X"||l1.getText()=="O")&&(l2.getText()=="X"||l2.getText()=="O")&&(l3.getText()=="X"||l3.getText()=="O")&&
		   (l4.getText()=="X"||l4.getText()=="O")&&(l5.getText()=="X"||l5.getText()=="O")&&(l6.getText()=="X"||l6.getText()=="O")&&
		   (l7.getText()=="X"||l7.getText()=="O")&&(l8.getText()=="X"||l8.getText()=="O")&&(l9.getText()=="X"||l9.getText()=="O")&&
		    w==0)
		   {
			   JOptionPane.showMessageDialog(null,"Match Draw!");
		   }
	}
    public cross_zero() {
        initComponents();


        try{
        ds=new DatagramSocket(1234);
        ds1=new DatagramSocket(1233);
        rt=new recthread(this);
        rt.start();

    }
    catch(Exception ex){JOptionPane.showMessageDialog(null, ex.getMessage());}
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        l1 = new javax.swing.JButton();
        l4 = new javax.swing.JButton();
        l3 = new javax.swing.JButton();
        l2 = new javax.swing.JButton();
        l5 = new javax.swing.JButton();
        l8 = new javax.swing.JButton();
        l7 = new javax.swing.JButton();
        l6 = new javax.swing.JButton();
        l9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton2.setText("Connect");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("I.P. Addrs");

        jLabel2.setText("Nick Name");

        l1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l1ActionPerformed(evt);
            }
        });

        l4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l4ActionPerformed(evt);
            }
        });

        l3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l3ActionPerformed(evt);
            }
        });

        l2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l2ActionPerformed(evt);
            }
        });

        l5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l5ActionPerformed(evt);
            }
        });

        l8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l8ActionPerformed(evt);
            }
        });

        l7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l7ActionPerformed(evt);
            }
        });

        l6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l6ActionPerformed(evt);
            }
        });

        l9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l8, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l9, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
       adr=InetAddress.getByName(jTextField3.getText());
    }
    catch(Exception ex){JOptionPane.showMessageDialog(null, ex.getMessage());}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        nn=jTextField4.getText().trim();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void l3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l3ActionPerformed
        // TODO add your handling code here:
        String s="3";
        if(w==0)
	    {
		if((l3.getText()!="X"&&l3.getText()!="O"))
		{
		  if(evt.getSource()==l3&&i%2==0)
		  {
		     l3.setText("X");i++;
		  }
		  else
		  if(evt.getSource()==l3)
		  {
		   	 l3.setText("O");i++;
		  }
		}
		  try
		  {
		       array=l3.getText().trim().getBytes();
		       arr=s.getBytes();
		       dp=new DatagramPacket(array,array.length,adr,1235);
                       dp1=new DatagramPacket(arr,arr.length,adr,1236);
		       ds.send(dp);
                       ds1.send(dp1);
	      }
		  catch (IOException ex)
		  {
               JOptionPane.showMessageDialog(null, ex.getMessage());
          }
            }
        judge();
    }//GEN-LAST:event_l3ActionPerformed

    private void l1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l1ActionPerformed
        // TODO add your handling code here:
        String s="1";
        if(w==0)
	    {
		if((l1.getText()!="X"&&l1.getText()!="O"))
		{
		  if(evt.getSource()==l1&&i%2==0)
		  {
		     l1.setText("X");i++;
		  }
		  else
		  if(evt.getSource()==l1)
		  {
		   	 l1.setText("O");i++;
		  }
		  try
		  {
		       array=l1.getText().trim().getBytes();
                       arr=s.getBytes();
		       dp=new DatagramPacket(array,array.length,adr,1235);
                       dp1=new DatagramPacket(arr,arr.length,adr,1236);
		       ds.send(dp);
                       ds1.send(dp1);
	      }
		  catch (IOException ex)
		  {
               JOptionPane.showMessageDialog(null, ex.getMessage());
          }
		}
            }
        judge();
    }//GEN-LAST:event_l1ActionPerformed

    private void l2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l2ActionPerformed
        // TODO add your handling code here:
        String s="2";
        if(w==0)
	    {
		if((l2.getText()!="X"&&l2.getText()!="O"))
		{
		  if(evt.getSource()==l2&&i%2==0)
		  {
		     l2.setText("X");i++;
		  }
		  else
		  if(evt.getSource()==l2)
		  {
		   	 l2.setText("O");i++;
		  }
		}
		  try
		  {
		       array=l2.getText().trim().getBytes();
                       arr=s.getBytes();
		       dp=new DatagramPacket(array,array.length,adr,1235);
                       dp1=new DatagramPacket(arr,arr.length,adr,1236);
		       ds.send(dp);
                       ds1.send(dp1);
	      }
		  catch (IOException ex)
		  {
               JOptionPane.showMessageDialog(null, ex.getMessage());
          }
          }
        judge();
    }//GEN-LAST:event_l2ActionPerformed

    private void l4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l4ActionPerformed
        // TODO add your handling code here:
        String s="4";
        if(w==0)
	    {
		if((l4.getText()!="X"&&l4.getText()!="O"))
		{
		  if(evt.getSource()==l4&&i%2==0)
		  {
		     l4.setText("X");i++;
		  }
		  else
		  if(evt.getSource()==l4)
		  {
		   	 l4.setText("O");i++;
		  }
		}
		  try
		  {
		       array=l4.getText().trim().getBytes();
		       arr=s.getBytes();
		       dp=new DatagramPacket(array,array.length,adr,1235);
                       dp1=new DatagramPacket(arr,arr.length,adr,1236);
		       ds.send(dp);
                       ds1.send(dp1);
	      }
		  catch (IOException ex)
		  {
               JOptionPane.showMessageDialog(null, ex.getMessage());
          }
          }
        judge();
    }//GEN-LAST:event_l4ActionPerformed

    private void l5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l5ActionPerformed
        // TODO add your handling code here:
        String s="5";
        if(w==0)
	    {
		if((l5.getText()!="X"&&l5.getText()!="O"))
		{
		  if(evt.getSource()==l5&&i%2==0)
		  {
		     l5.setText("X");i++;
		  }
		  else
		  if(evt.getSource()==l5)
		  {
		   	 l5.setText("O");i++;
		  }
		}
		  try
		  {
		       array=l5.getText().trim().getBytes();
		       arr=s.getBytes();
		       dp=new DatagramPacket(array,array.length,adr,1235);
                       dp1=new DatagramPacket(arr,arr.length,adr,1236);
		       ds.send(dp);
                       ds1.send(dp1);
	          }
		  catch (IOException ex)
		  {
                     JOptionPane.showMessageDialog(null, ex.getMessage());
                  }
            }
        judge();
    }//GEN-LAST:event_l5ActionPerformed

    private void l6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l6ActionPerformed
        // TODO add your handling code here:
        String s="6";
        if(w==0)
	    {
		if((l6.getText()!="X"&&l6.getText()!="O"))
		{
		  if(evt.getSource()==l6&&i%2==0)
		  {
		     l6.setText("X");i++;
		  }
		  else
		  if(evt.getSource()==l6)
		  {
		   	 l6.setText("O");i++;
		  }
		}
		  try
		  {
		       array=l6.getText().trim().getBytes();
		       arr=s.getBytes();
		       dp=new DatagramPacket(array,array.length,adr,1235);
                       dp1=new DatagramPacket(arr,arr.length,adr,1236);
		       ds.send(dp);
                       ds1.send(dp1);
	      }
		  catch (IOException ex)
		  {
               JOptionPane.showMessageDialog(null, ex.getMessage());
          }
          }
        judge();
    }//GEN-LAST:event_l6ActionPerformed

    private void l7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l7ActionPerformed
        // TODO add your handling code here:
        String s="7";
        if(w==0)
	    {
		if((l7.getText()!="X"&&l7.getText()!="O"))
		{
		  if(evt.getSource()==l7&&i%2==0)
		  {
		     l7.setText("X");i++;
		  }
		  else
		  if(evt.getSource()==l7)
		  {
		   	 l7.setText("O");i++;
		  }
		}
		  try
		  {
		       array=l7.getText().trim().getBytes();
		       arr=s.getBytes();
		       dp=new DatagramPacket(array,array.length,adr,1235);
                       dp1=new DatagramPacket(arr,arr.length,adr,1236);
		       ds.send(dp);
                       ds1.send(dp1);
	      }
		  catch (IOException ex)
		  {
               JOptionPane.showMessageDialog(null, ex.getMessage());
          }
          }
        judge();
    }//GEN-LAST:event_l7ActionPerformed

    private void l8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l8ActionPerformed
        // TODO add your handling code here:
        String s="8";
        if(w==0)
	    {
		if((l8.getText()!="X"&&l8.getText()!="O"))
		{
		  if(evt.getSource()==l8&&i%2==0)
		  {
		     l8.setText("X");i++;
		  }
		  else
		  if(evt.getSource()==l8)
		  {
		   	 l8.setText("O");i++;
		  }
		}
		  try
		  {
		       array=l8.getText().trim().getBytes();
		       arr=s.getBytes();
		       dp=new DatagramPacket(array,array.length,adr,1235);
                       dp1=new DatagramPacket(arr,arr.length,adr,1236);
		       ds.send(dp);
                       ds1.send(dp1);
	      }
		  catch (IOException ex)
		  {
               JOptionPane.showMessageDialog(null, ex.getMessage());
          }
          }
        judge();
    }//GEN-LAST:event_l8ActionPerformed

    private void l9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l9ActionPerformed
        // TODO add your handling code here:
        String s="9";
        if(w==0)
	    {
		if((l9.getText()!="X"&&l9.getText()!="O"))
		{
		  if(evt.getSource()==l9&&i%2==0)
		  {
		     l9.setText("X");i++;
		  }
		  else
		  if(evt.getSource()==l9)
		  {
		   	 l9.setText("O");i++;
		  }
		}
		  try
		  {
		       array=l9.getText().trim().getBytes();
		       arr=s.getBytes();
		       dp=new DatagramPacket(array,array.length,adr,1235);
                       dp1=new DatagramPacket(arr,arr.length,adr,1236);
		       ds.send(dp);
                       ds1.send(dp1);
	      }
		  catch (IOException ex)
		  {
               JOptionPane.showMessageDialog(null, ex.getMessage());
          }
          }
        judge();
    }//GEN-LAST:event_l9ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cross_zero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JTextField jTextField3;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JButton l1;
    public javax.swing.JButton l2;
    public javax.swing.JButton l3;
    public javax.swing.JButton l4;
    public javax.swing.JButton l5;
    public javax.swing.JButton l6;
    public javax.swing.JButton l7;
    public javax.swing.JButton l8;
    public javax.swing.JButton l9;
    // End of variables declaration//GEN-END:variables

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */                                                                             
package sd;

import java.awt.Toolkit;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;

/**
 *
 * @author Adnan & Arman
 */
public class mainExtension extends javax.swing.JFrame {

    /**
     * Creates new form mainExtension
     */
    //mouse drag
    int mouseX;
    int mouseY;
    
    public mainExtension() {
        initComponents();
        
        //icon image
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconMini.png")));
        
        //clockWork();
        new Thread(){
            public void run(){
            while(true){
            reusablePanel re = new reusablePanel();    
            Clock.setText(re.clockrun());
            day.setText (re.dayName());
            }
        }
        }.start();
        
        // icon set
        ImageIcon messenger = new ImageIcon(getClass().getResource("messengerIcon.png")); 
        messenger_.setIcon(messenger);
        
        ImageIcon music = new ImageIcon(getClass().getResource("musicIcon.png")); 
        music_.setIcon(music);
        
        ImageIcon notePad = new ImageIcon(getClass().getResource("textIcon.png")); 
        notePad_.setIcon(notePad);
        
        ImageIcon toDoList = new ImageIcon(getClass().getResource("todoIcon.png")); 
        toDo_.setIcon(toDoList);
        
        ImageIcon log = new ImageIcon(getClass().getResource("logout.png")); 
        logout_.setIcon(log);
        
        ImageIcon note = new ImageIcon(getClass().getResource("note.png")); 
        note_.setIcon(note);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        shutDown_ = new javax.swing.JLabel();
        restart_ = new javax.swing.JLabel();
        cancel_ = new javax.swing.JLabel();
        minimize_ = new javax.swing.JLabel();
        day = new javax.swing.JLabel();
        Clock = new javax.swing.JLabel();
        dp_ = new javax.swing.JLabel();
        messenger_ = new javax.swing.JLabel();
        music_ = new javax.swing.JLabel();
        notePad_ = new javax.swing.JLabel();
        toDo_ = new javax.swing.JLabel();
        quit_ = new javax.swing.JLabel();
        logout_ = new javax.swing.JLabel();
        note_ = new javax.swing.JLabel();
        drag_ = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("mainLayout");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        shutDown_.setToolTipText("Shut Down");
        shutDown_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        shutDown_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                shutDown_MouseReleased(evt);
            }
        });
        getContentPane().add(shutDown_, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 3, 21, 20));

        restart_.setToolTipText("Restart");
        restart_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        restart_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restart_MouseClicked(evt);
            }
        });
        getContentPane().add(restart_, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 3, 21, 20));

        cancel_.setToolTipText("Cancel Command");
        cancel_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancel_MouseClicked(evt);
            }
        });
        getContentPane().add(cancel_, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 4, 20, 20));

        minimize_.setToolTipText("minimize");
        minimize_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimize_MouseClicked(evt);
            }
        });
        getContentPane().add(minimize_, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 4, 20, 20));

        day.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        day.setForeground(new java.awt.Color(255, 255, 255));
        day.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(day, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 400, 120, 30));

        Clock.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Clock.setForeground(new java.awt.Color(255, 255, 255));
        Clock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Clock, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 116, 30));
        getContentPane().add(dp_, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 71, 96, 96));

        messenger_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        messenger_.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                messenger_MouseMoved(evt);
            }
        });
        getContentPane().add(messenger_, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 285, 76, 76));

        music_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        music_.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                music_MouseMoved(evt);
            }
        });
        music_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                music_MouseClicked(evt);
            }
        });
        getContentPane().add(music_, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 285, 76, 76));

        notePad_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        notePad_.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                notePad_MouseMoved(evt);
            }
        });
        notePad_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notePad_MouseClicked(evt);
            }
        });
        getContentPane().add(notePad_, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 195, 76, 76));

        toDo_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        toDo_.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                toDo_MouseMoved(evt);
            }
        });
        toDo_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toDo_MouseClicked(evt);
            }
        });
        getContentPane().add(toDo_, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 195, 76, 76));

        quit_.setToolTipText("quit");
        quit_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quit_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                quit_MouseReleased(evt);
            }
        });
        getContentPane().add(quit_, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 5, 21, 21));

        logout_.setForeground(new java.awt.Color(255, 255, 255));
        logout_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sd/logout.png"))); // NOI18N
        logout_.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                logout_MouseMoved(evt);
            }
        });
        logout_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout_MouseClicked(evt);
            }
        });
        getContentPane().add(logout_, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, 60, 13));

        note_.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                note_MouseMoved(evt);
            }
        });
        getContentPane().add(note_, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 100, 100));

        drag_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sd/bgGen.png"))); // NOI18N
        drag_.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                drag_MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                drag_MouseMoved(evt);
            }
        });
        drag_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                drag_MousePressed(evt);
            }
        });
        getContentPane().add(drag_, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 483));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void quit_MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quit_MouseReleased
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_quit_MouseReleased

    private void drag_MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drag_MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-mouseX, y-mouseY);
    }//GEN-LAST:event_drag_MouseDragged

    private void drag_MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drag_MousePressed
        // TODO add your handling code here:
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_drag_MousePressed

    private void shutDown_MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shutDown_MouseReleased
        // TODO add your handling code here:
        reusablePanel pm = new reusablePanel();
        pm.shutPC();
    }//GEN-LAST:event_shutDown_MouseReleased

    private void minimize_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_MouseClicked
        
    }//GEN-LAST:event_minimize_MouseClicked

    private void notePad_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notePad_MouseClicked
            textEditor txt = new textEditor();
            txt.setVisible(true);
    }//GEN-LAST:event_notePad_MouseClicked

    private void notePad_MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notePad_MouseMoved
        ImageIcon notePad = new ImageIcon(getClass().getResource("thresholdT.png")); 
        notePad_.setIcon(notePad);
    }//GEN-LAST:event_notePad_MouseMoved

    private void toDo_MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toDo_MouseMoved
        ImageIcon toDoList = new ImageIcon(getClass().getResource("thresholdTo.png")); 
        toDo_.setIcon(toDoList);
    }//GEN-LAST:event_toDo_MouseMoved

    private void messenger_MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_messenger_MouseMoved
        ImageIcon messenger = new ImageIcon(getClass().getResource("thresholdMs.png")); 
        messenger_.setIcon(messenger);
    }//GEN-LAST:event_messenger_MouseMoved

    private void music_MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_music_MouseMoved
        ImageIcon music = new ImageIcon(getClass().getResource("thresholdM.png")); 
        music_.setIcon(music);
    }//GEN-LAST:event_music_MouseMoved

    private void drag_MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drag_MouseMoved
        // icon set
        ImageIcon messenger = new ImageIcon(getClass().getResource("messengerIcon.png")); 
        messenger_.setIcon(messenger);
        
        ImageIcon music = new ImageIcon(getClass().getResource("musicIcon.png")); 
        music_.setIcon(music);
        
        ImageIcon notePad = new ImageIcon(getClass().getResource("textIcon.png")); 
        notePad_.setIcon(notePad);
        
        ImageIcon toDoList = new ImageIcon(getClass().getResource("todoIcon.png")); 
        toDo_.setIcon(toDoList);
        
        ImageIcon log = new ImageIcon(getClass().getResource("logout.png")); 
        logout_.setIcon(log);
        
        ImageIcon note = new ImageIcon(getClass().getResource("note.png")); 
        note_.setIcon(note);
    }//GEN-LAST:event_drag_MouseMoved

    private void restart_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restart_MouseClicked
        reusablePanel pm = new reusablePanel();
        pm.restartPC();
    }//GEN-LAST:event_restart_MouseClicked

    private void cancel_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel_MouseClicked
        reusablePanel pm = new reusablePanel();
        pm.cancelShutRes();
    }//GEN-LAST:event_cancel_MouseClicked

    private void toDo_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toDo_MouseClicked
        int x = this.getX();
        int y = this.getY();
        toDo td = new toDo(x-333,y-58);
        td.setVisible(true);
    }//GEN-LAST:event_toDo_MouseClicked

    private void logout_MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_MouseMoved
        ImageIcon log = new ImageIcon(getClass().getResource("logoutT.png")); 
        logout_.setIcon(log);
    }//GEN-LAST:event_logout_MouseMoved

    private void music_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_music_MouseClicked
        int x = this.getX();
        int y = this.getY();
        musicPlayer msc= new musicPlayer(x-333,y);
        msc.setVisible(true);
    }//GEN-LAST:event_music_MouseClicked

    private void logout_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_MouseClicked
        this.dispose();
        login log = new login();
        log.setVisible(true);
    }//GEN-LAST:event_logout_MouseClicked

    private void note_MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_note_MouseMoved
        ImageIcon note = new ImageIcon(getClass().getResource("notet.png")); 
        note_.setIcon(note);
    }//GEN-LAST:event_note_MouseMoved

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainExtension.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainExtension.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainExtension.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainExtension.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainExtension().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Clock;
    private javax.swing.JLabel cancel_;
    private javax.swing.JLabel day;
    private javax.swing.JLabel dp_;
    private javax.swing.JLabel drag_;
    private javax.swing.JLabel logout_;
    private javax.swing.JLabel messenger_;
    private javax.swing.JLabel minimize_;
    private javax.swing.JLabel music_;
    private javax.swing.JLabel notePad_;
    private javax.swing.JLabel note_;
    private javax.swing.JLabel quit_;
    private javax.swing.JLabel restart_;
    private javax.swing.JLabel shutDown_;
    private javax.swing.JLabel toDo_;
    // End of variables declaration//GEN-END:variables
}

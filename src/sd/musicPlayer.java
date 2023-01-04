/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd;

import jaco.mp3.player.MP3Player;
import java.io.File;
import java.nio.file.Paths;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Line;
import javax.sound.sampled.Mixer;

/**
 *
 * @author Adnan & Arman
 */
public class musicPlayer extends javax.swing.JFrame {

    /**
     * Creates new form musicPlayer
     */
    // mouse drag
    int mouseX;
    int mouseY;
    
    //player
    MP3Player player;
    File songFile ;
    String curDirectory = "home.user";
    String currentPath;
    boolean repeat = false;
    
    MP3Player mm3 = new MP3Player();
    
    public void volumeUpControl(double valueConvert){
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        for (Mixer.Info mixerInfo : mixers){
            Mixer mixer  = AudioSystem.getMixer(mixerInfo);
            Line.Info[] lineInf = mixer.getTargetLineInfo();
            for(Line.Info lineInfo : lineInf){
                Line line = null;
                boolean opened = true;
                try {
                    line = mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    if(!opened){
                        line.open();
                    
                    }
                    
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    float currentVol = volControl.getValue();
                    Double volToCut = valueConvert;
                    
                    float chngCalc = (float)((float) currentVol+(double)volToCut);
                    volControl.setValue(chngCalc);
                    
                
                }catch(Exception e){
                    System.out.println(e);
                }finally {
                    if (line!=null && !opened){
                        line.close();
                    }
                
                
                }
            }
        
        }
    }
    
    
    
    public void volumeControl(double valueConvert){
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        for (Mixer.Info mixerInfo : mixers){
            Mixer mixer  = AudioSystem.getMixer(mixerInfo);
            Line.Info[] lineInf = mixer.getTargetLineInfo();
            for(Line.Info lineInfo : lineInf){
                Line line = null;
                boolean opened = true;
                try {
                    line = mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    if(!opened){
                        line.open();
                    
                    }
                    
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    float currentVol = volControl.getValue();
                    Double volToCut = valueConvert;
                    
                    float chngCalc = (float)((double)volToCut);
                    volControl.setValue(chngCalc);
                    
                
                }catch(Exception e){
                    System.out.println(e);
                }finally {
                    if (line!=null && !opened){
                        line.close();
                    }
                
                
                }
            }
        
        }
    }
    
    
    
    
    public void volumeDownControl(double valueConvert){
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        for (Mixer.Info mixerInfo : mixers){
            Mixer mixer  = AudioSystem.getMixer(mixerInfo);
            Line.Info[] lineInf = mixer.getTargetLineInfo();
            for(Line.Info lineInfo : lineInf){
                Line line = null;
                boolean opened = true;
                try {
                    line = mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    if(!opened){
                        line.open();
                    
                    }
                    
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    float currentVol = volControl.getValue();
                    Double volToCut = valueConvert;
                    
                    float chngCalc = (float)((float) currentVol-(double)volToCut);
                    volControl.setValue(chngCalc);
                    
                
                }catch(Exception e){
                    System.out.println(e);
                }finally {
                    if (line!=null && !opened){
                        line.close();
                    }
                
                
                }
            }
        
        }
    }
    
    
    
    
    
    public musicPlayer() {
        initComponents();
       songFile = new File ("C:\\Users\\Adnan & Arman\\Downloads\\Alone Again Naturally Gilbert O`Sullivan Lyrics.mp3");
       String fileName = songFile.getName();
       name_.setText(fileName);
       player = mm3;
       player.addToPlayList(songFile);
       //current path and image path in string
       currentPath = Paths.get(".").toAbsolutePath().normalize().toString();
       
    
    }
    
        public musicPlayer(int xx,int yy) {
        initComponents();
        this.setLocation(xx, yy);
       songFile = new File ("C:\\Users\\Adnan & Arman\\Downloads\\Alone Again Naturally Gilbert O`Sullivan Lyrics.mp3");
       String fileName = songFile.getName();
       name_.setText(fileName);
       player = mm3;
       player.addToPlayList(songFile);
       //current path and image path in string
       currentPath = Paths.get(".").toAbsolutePath().normalize().toString();
       
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit_ = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        volDown_ = new javax.swing.JLabel();
        volUp_ = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name_ = new javax.swing.JLabel();
        drag_ = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_MouseClicked(evt);
            }
        });
        getContentPane().add(exit_, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 0, 40, 40));

        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 354, 52, 50));

        volDown_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volDown_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volDown_MouseClicked(evt);
            }
        });
        getContentPane().add(volDown_, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 363, 34, 34));

        volUp_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volUp_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volUp_MouseClicked(evt);
            }
        });
        getContentPane().add(volUp_, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 363, 34, 34));

        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 368, 21, 21));

        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 368, 21, 21));

        name_.setForeground(new java.awt.Color(255, 255, 255));
        name_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(name_, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 320, 230, 18));

        drag_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sd/musicPlayer.png"))); // NOI18N
        drag_.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                drag_MouseDragged(evt);
            }
        });
        drag_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                drag_MousePressed(evt);
            }
        });
        getContentPane().add(drag_, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 259, 432));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exit_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_MouseClicked
        player.stop();
        this.dispose();
    }//GEN-LAST:event_exit_MouseClicked
    boolean playPause = false;
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        playPause = !playPause;
        if(playPause==true)
        player.play();
        else player.pause();
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        player.stop();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        if(repeat == false){
            repeat=true;
            player.setRepeat(repeat);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void volDown_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volDown_MouseClicked
        volumeDownControl(.1);
    }//GEN-LAST:event_volDown_MouseClicked

    private void volUp_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volUp_MouseClicked
        volumeUpControl(.1);
    }//GEN-LAST:event_volUp_MouseClicked

    private void drag_MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drag_MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_drag_MousePressed

    private void drag_MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drag_MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-mouseX, y-mouseY);
    }//GEN-LAST:event_drag_MouseDragged

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(musicPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(musicPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(musicPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(musicPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new musicPlayer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel drag_;
    private javax.swing.JLabel exit_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel name_;
    private javax.swing.JLabel volDown_;
    private javax.swing.JLabel volUp_;
    // End of variables declaration//GEN-END:variables
}

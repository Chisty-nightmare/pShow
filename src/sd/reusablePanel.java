/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adnan & Arman
 */
public class reusablePanel{// implements clockWork{

                public String clockrun(){
                    String time;
                    GregorianCalendar cal = new GregorianCalendar();
                    int hour = cal.get(Calendar.HOUR);
                    int min = cal.get(Calendar.MINUTE) ;
                    int sec = cal.get(Calendar.SECOND);
                    int am_pm = cal.get(Calendar.AM_PM);
                    String ap="";
                    
                    if (am_pm==1)   {ap = "PM";}
                    else {ap = "AM";}
                    
                    time = hour+":"+min+":"+sec+" "+ap;
                    return time;
                }
                
                String dName;
                public String dayName(){
                    
                    GregorianCalendar cal = new GregorianCalendar();
                    int day = cal.get(Calendar.DAY_OF_WEEK);
                    switch(day) {
                            case 1:
                            dName = "SUNDAY";
                            break;
                            case 2:
                            dName = "MONDAY";
                            break;
                            case 3:
                            dName = "TUESDAY";
                            break;
                            case 4:
                            dName = "WEDNESDAY";
                            break;
                            case 5:
                            dName = "THURSDAY";
                            break;
                            case 6:
                            dName = "FRIDAY";
                            break;
                            case 7:
                            dName = "SATURDAY";
                            break;
                    }
                    return dName;
                }
                    
                
                
                
                
                void shutPC(){
                    Runtime runtime = Runtime.getRuntime();
                    try{
                        Process proc = runtime.exec("shutdown -s -t 120");
                    }
                    catch(Exception e){
                        javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }
                
                void restartPC(){
                    Runtime runtime = Runtime.getRuntime();
                    try{
                        Process proc = runtime.exec("shutdown -r -t 120");
                    }
                    catch(Exception e){
                        javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }
                
                void cancelShutRes(){
                    Runtime runtime = Runtime.getRuntime();
                    try{
                        Process proc = runtime.exec("shutdown -a");
                    }
                    catch(Exception e){
                        javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }

    
    }

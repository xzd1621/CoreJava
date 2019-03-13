package chapter6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class InnerClassTest {
    public static void main(String[] args)
    {
        TalkingClock talkingClock=new TalkingClock(1000,true);
        talkingClock.start();
        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }
}

class TalkingClock
{
    private int internal;
    private boolean beep;

    public TalkingClock(int internal,boolean beep)
    {
        this.internal=internal;
        this.beep=beep;
    }
    public void start()
    {
        ActionListener listener=new TimePrinter();
        Timer t=new Timer(internal,listener);
        t.start();
    }

    private class TimePrinter implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("At the tone,the time is "+new Date());
            if(beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}

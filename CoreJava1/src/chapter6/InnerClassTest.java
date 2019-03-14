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

    /**
     * 使用lambda表达式实现
     *
     */
//    public void start(int internal,boolean beep)
//    {
//        Timer t=new Timer(internal,e ->
//        {
//            System.out.println("At the tone,the time is "+new Date());
//            if(beep)Toolkit.getDefaultToolkit().beep();
//        });
//        t.start();
//    }

    /**
     * 使用匿名内部类实现
     */
//    public void start(int internal,boolean beep)
//    {
//        ActionListener listener=new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("At the tone,the time is "+new Date());
//                if(beep) Toolkit.getDefaultToolkit().beep();
//            }
//        };
//        Timer t=new Timer(internal,listener);
//        t.start();
//    }


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

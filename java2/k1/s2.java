package k1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class s2 {
    public static void main(String[] args) {
        window w= new window();
    }
    
}


class window extends JFrame implements ActionListener{
    Tanchuang tan;
    String s= "我是弹窗";
    window(){
        setTitle("初始标题");
        JButton b1=new JButton("点击获取弹窗");
        initwindow();
        add(b1);
        tan=new Tanchuang(this,s);
        b1.addActionListener(this);
    }
    public void initwindow(){
        setLayout(new FlowLayout());
        setVisible(true);
        setBounds(200,200,250,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        tan.setVisible(true);
        String str = tan.gettitle();//如果不设为有模式的对话框下面的两句会直接执行
        setTitle(str);
    }
}

class Tanchuang extends JDialog implements ActionListener{
    JTextField t1;
    JLabel l1;
    JButton b2;
    String title;
    Tanchuang(JFrame f,String str1){
        super(f,str1);
        setLayout(new FlowLayout());
        setBounds(250,250,300,300);
        setModal(true);
        init();
    }
    public void init(){
        t1= new JTextField(25);
        l1= new JLabel("请在输入框中输入你的新标题：");
        b2 = new JButton("确定");
        add(l1);
        add(t1);
        add(b2);
        b2.addActionListener(this);
        t1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        String str2= t1.getText();
        title=str2;
        setVisible(false);
        t1.setText("");
    }
    public String gettitle(){
        return title;
    }
}


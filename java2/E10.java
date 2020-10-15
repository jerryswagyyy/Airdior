

import java.awt.*;
import javax.swing.*;

class Mywin extends JFrame{
    Mywin(){
        setTitle("注册界面");
        Container con=getContentPane();
        con.setBackground(Color.white);
        setBounds(200,200, 500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init1();
        init2();
        init3();
        init4();
        init5();
        setLayout(null);
        }
    public void init1(){
        JLabel name= new JLabel("用户名");
        JLabel password= new JLabel("密码");
        JLabel checkpassword =new JLabel("确认密码");
        JTextField t1= new JTextField();
        JTextField t2= new JTextField();
        JTextField t3= new JTextField();
        name.setBounds(20, 5, 100, 20);
        password.setBounds(20,30,100,20);
        checkpassword.setBounds(20,55, 100, 20);
        t1.setBounds(130,5,160,20);
        t2.setBounds(130,30,160,20);
        t3.setBounds(130,55,160,20);
        add(name);
        add(password);
        add(checkpassword);
        add(t1);
        add(t2);
        add(t3);
    }
    public void init2(){
        JLabel sex= new JLabel("性别");
        JLabel hobby=new JLabel("爱好");
        sex.setBounds(20, 80, 100, 20);
        hobby.setBounds(20,105,100,20);
        JRadioButton man= new JRadioButton("男");
        JRadioButton woman= new JRadioButton("女");
        JRadioButton b1=new JRadioButton("唱歌");
        JRadioButton b2=new JRadioButton("跳舞");
        JRadioButton b3=new JRadioButton("篮球");
        JRadioButton b4=new JRadioButton("游戏");
        man.setBounds(100,80,60,20);
        woman.setBounds(160,80,60,20);
        b1.setBounds(100,105,60,20);
        b2.setBounds(160,105,60,20);
        b3.setBounds(220,105,60,20);
        b4.setBounds(280,105,60,20);
        add(sex);add(hobby);add(man);add(woman);add(b1);add(b2);add(b3);add(b4);
    }
    public void init3(){
        JLabel country= new JLabel("国籍");
        country.setBounds(20,130,100,20);
        JComboBox<String> j1=new JComboBox<String>();
        j1.addItem("中国");
        j1.addItem("韩国");
        j1.addItem("日本");
        j1.setBounds(90,130,100,20);
        add(country);add(j1);
    }
    public void init4(){
        JLabel selfcheck= new JLabel("自我评价");
        selfcheck.setBounds(20,155,100,20);
        JTextArea text= new JTextArea();
        JScrollPane scrollPane=new JScrollPane(text);
        scrollPane.setBounds(100,155,200,100);
        add(selfcheck);add(scrollPane);
    }
    public void init5(){
        JButton b5=new JButton("获取验证码");
        JLabel code =new JLabel("验证码");
        b5.setBounds(200,260,100,20);
        JTextField text1= new JTextField();
        text1.setBounds(100,260,100,20);
        code.setBounds(20,260,100,20);
        add(b5);add(code);add(text1);
        JButton b6 =new JButton("提交");
        JButton b7= new JButton("验证");
        b6.setBounds(30, 280, 60, 20);
        b7.setBounds(100, 280, 60, 20);
        b6.setBackground(Color.CYAN);
        b7.setBackground(Color.CYAN);
        add(b6);add(b7);
    }
}



public class E10{
    public static void main(String[] args) {
        Mywin mywin=new Mywin();
    }
}
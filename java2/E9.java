

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class Window  extends JFrame{
    Window(){
        setTitle("100���ڼӷ�����");
        Container a= getContentPane();
        a.setBackground(Color.white);
        setBounds(150,150,500,500);
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void init(){
        JButton b1=new JButton("��ȡ��Ŀ");
        JButton b2=new JButton("ȷ�ϴ�");
        JButton b3=new JButton("������Ŀ");
        JButton b4=new JButton("�쿴��");
        Listen listen=new Listen();
        b1.addActionListener(listen);
        b2.addActionListener(listen);
        b3.addActionListener(listen);
        b4.addActionListener(listen);
        JTextArea t1=new JTextArea();
        JTextField t2=new JTextField(20);
        listen.setJtext1(t1);
        listen.setJtext2(t2);
        Box boxh= Box.createHorizontalBox();
        Box box1= Box.createVerticalBox();
        Box box2= Box.createVerticalBox();
        Box box3= Box.createVerticalBox();
        setLayout(new FlowLayout());
        box1.add(b1);
        box1.add(b2);
        box2.add(t1);
        box2.add(t2);
        box3.add(b3);
        box3.add(b4);
        boxh.add(box1);
        boxh.add(box2);
        boxh.add(box3);
        add(boxh);
    }
}

class Listen implements ActionListener{
    JTextArea t1;
    JTextField t2;
    int n1;
    int n2;
    int input;
    int result;
    public void setJtext1(JTextArea t1){
        this.t1=t1;
    }
    public void setJtext2(JTextField t2){
        this.t2=t2;
    }
    public void actionPerformed(ActionEvent e){
        String str = e.getActionCommand();
        if(str.equals("��ȡ��Ŀ")){
            n1=(int)(Math.random()*100);
            n2=(int)(Math.random()*100);
            t1.append(n1+"+"+n2);
        }
        if(str.equals("ȷ�ϴ�")){
            try{
                input= Integer.parseInt(t2.getText());
            }
            catch(Exception exp){}
            result= n1+n2;
            if(input==result){
                JOptionPane.showMessageDialog(t1,"����ȷ","��Ϣ�Ի���",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null,"�𰸴���", "��Ϣ�Ի���",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if(str.equals("������Ŀ")){
            t1.setText("");
            t2.setText("");
        }
        if(str.equals("�쿴��")){
            result = n1 + n2;
			JOptionPane.showMessageDialog(null,"��Ϊ:"+result, "��Ϣ�Ի���",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}






public class E9 {
    public static void main(String args[]){
        Window Window=new Window();
    }
}
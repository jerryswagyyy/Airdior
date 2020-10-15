

import java.util.*;

@SuppressWarnings("unchecked")

class Book implements Comparable{
    String bname;
    double bprice;
    public void setbook(String bname,double bprice){
        this.bname=bname;
        this.bprice=bprice;
    }
    public int compareTo(Object object){
        Book b1=(Book)object;
        int k=0;
        k=(int)(b1.bprice-this.bprice);
        return k;
    }
}



public class E13 {
    public static void main(String[] args) {
        LinkedList<Book> list = new LinkedList<Book>();
        String [] bookName = {"Java2SE", "JavaEE", "JavaWeb", "���ݽṹ", "C++�������", "Java2ME", "����ϵͳ"};
        double [] bookPrice = {29, 21, 22, 29, 34, 32, 29};
        Book []a=new Book[bookName.length];
        for(int i=0;i<bookName.length;i++){
            a[i]=new Book();
            a[i].setbook(bookName[i], bookPrice[i]);
            list.add(a[i]);
        }
        Collections.sort(list);
        Iterator<Book> it = list.iterator();
        while(it.hasNext()){
            Book b=it.next();
            System.out.println(b.bname+"  "+b.bprice);
        }
        Book b1= new Book();
        b1.setbook("JavaScript", 29);
        int m;
        while((m=Collections.binarySearch(list, b1,null))>=0){   //����ֵmΪ��i���ڵ��iֵ��ʹ�ö��ֲ��ҷ�
            System.out.println(m);
            Book newb= list.get(m);
            System.out.println("�Ȿ"+newb.bname+"��"+b1.bname+"�۸�һ��Ϊ"+b1.bprice);
            list.remove(newb);
        }
    }
}
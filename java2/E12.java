

class Target1 implements Runnable{
    int sum2;//总的结果
    synchronized public void Calculate(int star,int end){
        int sum1=0;//每一个线程结果
        for(int i=star;i<=end;i++){
            sum1=sum1+i;
        }
        sum2=sum2+sum1;
        System.out.println("该线程"+Thread.currentThread().getName()+"的结果为"+sum1);
    }

    public void run(){
        String str=Thread.currentThread().getName();
        int m= Integer.parseInt(str);
        Calculate(m*10-9, m*10);
        
    }
}

class Target2 extends Thread{
    int sum1;
    synchronized public void Calculate(int star,int end){
        for(int i=star;i<=end;i++){
            sum1=sum1+i;
        }
        System.out.println("该线程"+Thread.currentThread().getName()+"的结果为"+sum1);
    }
    public void run(){
        String str =Thread.currentThread().getName();
        int m=Integer.parseInt(str);
        Calculate(m*10-9, m*10);
    }
}

class E12 {
    public static void main(String args[]){
        Target1 tt= new Target1();
        for(int i=1;i<=10;i++){
            try{
                Thread t= new Thread(tt);
                t.setName(""+i);
                t.start();
                t.join();
            }
            catch(Exception e){}
        }
        System.out.println("总结果为"+tt.sum2);
    }
}

class E121 {
    public static void main(String[] args){
        int sum2=0;
        Target2 tt[] =new Target2[10];
        for(int i=0;i<10;i++){
            try{
                tt[i]=new Target2();
                tt[i].setName(""+(i+1));
                tt[i].start();
                //sum2=sum2+tt[i].sum1;
                tt[i].join();
                sum2=sum2+tt[i].sum1;
            }
            catch(Exception e){}
        }
        System.out.println("总结果为"+sum2);
    }
}
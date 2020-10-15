

import java.io.*;

class Reverse {
    Reverse(){
        final File f1= new File("a.text");
        File f2= new File("b.text");
        if(!f2.exists()){
            try{
                f2.createNewFile();
                f2= new File("b.text");
            }
            catch(final Exception e){
                System.out.println("出错了");
            }
        }
        try{
            final FileReader fr = new FileReader(f1);
            final FileWriter fw = new FileWriter(f2,true);
            final BufferedReader fr2= new BufferedReader(fr);
            final BufferedWriter fw2= new BufferedWriter(fw);
            String str=null;
            int row=0;
            final String a[]=new String[100];
            while((str=fr2.readLine())!=null){
                final char []b=str.toCharArray();
                final char []c=new char[str.length()];
                for(int i=0;i<str.length();i++){
                    c[str.length()-1-i]=b[i];
                }
                a[row]=String.valueOf(c);
                //System.out.println(row);
                row++;
                System.out.println(row);
            }
            //System.out.println(row);
            //fw2.newLine();
            for(int i=row-1;i>=0;i--){
                fw2.write(a[i]);
                fw2.newLine();
            }
            fw2.close();
            fw.close();
            fr2.close();
            fr.close();
        }
        catch(final Exception e){
            System.out.println("出错了"+e);
        }
    }
}



public class E11 {
    public static void main(final String[] args){
        final Reverse reverse= new Reverse();
    }
}
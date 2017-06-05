import java.io.*;
interface iStringSet {
    void add(String s);
    boolean contains(String s);
}

class StringSet{
    private String a[];
    private int p;
    StringSet(int n){
        a = new String[n];
    }
    void add(String s){
        int i=0;
        while(a[i]!=null)i++;
        a[i]=s;
        
    }
    boolean contains(String s){
        int x=0;
        for(int i;i<a.length;i++){
        if(a[i] == null)
        break;
        if((a[i].equals(s)))
        x++;
        }
        return (boolean)(x==1);
        }

}

public class Sample1{
    public static void main(String[] args)throws IOException{
        BufferedRedaer br = new BufferedRedaer(new InputStreamRedaer(System.in));
        StringSet a = new StringSet(10);

        a.add("A");
        a.add("B");
        a.add("O");
        a.add("AB");
        
        System.out.println("血液型を入力してください");
        String s = br.readLine();
        if(a.contains(s)==true)System.out.println("正しい血液型です");
        else System.out.println("正しい血液型を入力してください．");
       
    }
}
package trans;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class trans{
	  
	  public static void main(String args[])throws Exception{
		  //�����µ��ļ���
			 File f = new File("d:\\new.txt");
			 
			 Writer out = null;
			 out = new FileWriter(f);
			 
			 try{
				 f.createNewFile();
			 }catch(IOException e){
				 e.printStackTrace();
			 }	
			 
			 
		String first = " ��� @ϲ���� @��Һ�ma :";
		int i= 0,m = 0,n = 0,p = 0;
		ArrayList list = new ArrayList();
	
		/*���������м����û�
		 char ch = first.charAt(p);
		while( p != first.length() - 1 && ch != ':')
		{   
			if( ch == '@')
			{
				++n;
				System.out.print(n);	
			}
			 ch = first.charAt(++p);
		 }
		*/
		char c = first.charAt(i);
		String str[] = new String[100];
		String string = new String();
		while( i != first.length() - 1 && c != ':')
		{
			list.add(c);    
			if( c == '@')
			{
				
					for(int j=0;j<list.size()-1;++j)
				 {
					
					 //System.out.print(list.get(j)); // ���ÿ���ַ�
					 str[j] = list.get(j).toString();
					 n=j;
					// System.out.print(n); //���Լ�����
					 
				 }
					for(int x=0;x<n;++x)
			 {				
				// System.out.print(str[x]); // ���ÿ���ַ�
				 string += str[x];
			
			 }
				//System.out.print(string); // ����ַ���
				 list.removeAll(list);
				 string += " "+"ת��"+" " ;
				
			}
			 c = first.charAt(++i);
		 }
		 for(int j=0;j<list.size();++j)
		 {
			//System.out.print(list.get(j)); // ���ÿ���ַ�
			 str[j] = list.get(j).toString();
			 //System.out.print(str[j]); // ���ÿ���ַ�
			 n=j;
			 //System.out.print(n); //���Լ�����
			 
		 }	
		 
		 for(int x=0;x<n;++x)
		 {
			 			
			 //System.out.print(str[x]); // ���ÿ���ַ�
			 string += str[x] ;
		 }
		System.out.print(string);

	
		out.write(string);
		out.close();
	  }
}

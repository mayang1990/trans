package trans;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class trans{
	
	
	  public static void main(String args[]) throws IOException{
		  	
	           //���ļ��а��ж�ȡ����
	            StringBuffer sb= new StringBuffer("");
	            String first = new String();
	           //��ȡold�е�����
	            FileReader reader = new FileReader("D://old.txt");
	            BufferedReader br = new BufferedReader(reader);
	           
	            String str1 = null;
	           
	            while((str1 = br.readLine()) != null) {
	            	sb.append(str1+"/n");	                 
	                System.out.println(str1);	
	                first = sb.toString();
	                System.out.println(first);
	                sb.setLength(0);
	                //�����µ��ļ�new
	   			 File f = new File("d:\\new.txt");
	   			 	
	   			 Writer out = null;
	   			 out = new FileWriter(f,true);
	   			
	   			 try{
	   				 f.createNewFile();
	   			 }catch(IOException e){
	   				 e.printStackTrace();
	   			 }	
	   			 	 
	   		//String first = "��� @ϲ���� @��Һ�ma:��������ܺã�";
	   		int i= 0,m = 0,n = 0,p = 0;
	   		ArrayList list = new ArrayList();
	   	
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
	   					
	   					 System.out.print(list.get(j)); // ���ÿ���ַ�
	   					 str[j] = list.get(j).toString();
	   					 n=j;
	   					// System.out.print(n); //���Լ�����
	   					 
	   				 }
	   					for(int x=0;x<n;++x)
	   			 {				
	   				 //System.out.print(str[x]); // ���ÿ���ַ�
	   				 string += str[x];
	   			
	   			 }
	   				System.out.println(string); // ����ַ���
	   				out.write(string);
	   				out.write("\r\n");
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
	   		 
	   		 for(int x=0;x<=n;++x)
	   		 {
	   			 			
	   			 System.out.print(str[x]); // �������
	   			 string += str[x] ;
	   		 }
	   		System.out.println(string);	
	   		out.write(string);
	   		out.write("\r\n");
	   		out.flush();
	   		out.close();
	   	  }
	            br.close();
	            reader.close();       
	      }		
}

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
		  	
	           //从文件中按行读取数据
	            StringBuffer sb= new StringBuffer("");
	            String first = new String();
	           //读取old中的内容
	            FileReader reader = new FileReader("D://old.txt");
	            BufferedReader br = new BufferedReader(reader);
	           
	            String str1 = null;
	           
	            while((str1 = br.readLine()) != null) {
	            	sb.append(str1+"/n");	                 
	                System.out.println(str1);	
	                first = sb.toString();
	                System.out.println(first);
	                sb.setLength(0);
	                //创建新的文件new
	   			 File f = new File("d:\\new.txt");
	   			 	
	   			 Writer out = null;
	   			 out = new FileWriter(f,true);
	   			
	   			 try{
	   				 f.createNewFile();
	   			 }catch(IOException e){
	   				 e.printStackTrace();
	   			 }	
	   			 	 
	   		//String first = "你好 @喜欢你 @大家好ma:今天心情很好！";
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
	   					
	   					 System.out.print(list.get(j)); // 输出每个字符
	   					 str[j] = list.get(j).toString();
	   					 n=j;
	   					// System.out.print(n); //测试几个数
	   					 
	   				 }
	   					for(int x=0;x<n;++x)
	   			 {				
	   				 //System.out.print(str[x]); // 输出每个字符
	   				 string += str[x];
	   			
	   			 }
	   				System.out.println(string); // 输出字符串
	   				out.write(string);
	   				out.write("\r\n");
	   				list.removeAll(list);
	   				string += " "+"转发"+" " ;
	   				
	   			}
	   			 c = first.charAt(++i);
	   			
	   		 }
	   	
	   		 for(int j=0;j<list.size();++j)
	   		 {
	   			//System.out.print(list.get(j)); // 输出每个字符
	   			str[j] = list.get(j).toString();
	   			//System.out.print(str[j]); // 输出每个字符
	   			n=j;
	   			//System.out.print(n); //测试几个数
	   			 
	   		 }	
	   		 
	   		 for(int x=0;x<=n;++x)
	   		 {
	   			 			
	   			 System.out.print(str[x]); // 输出名字
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

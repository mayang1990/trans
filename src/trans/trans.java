package trans;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class trans{
	  
	  public static void main(String args[])throws Exception{
		  //创建新的文件夹
			 File f = new File("d:\\new.txt");
			 
			 Writer out = null;
			 out = new FileWriter(f);
			 
			 try{
				 f.createNewFile();
			 }catch(IOException e){
				 e.printStackTrace();
			 }	
			 
			 
		String first = " 你好 @喜欢你 @大家好ma :";
		int i= 0,m = 0,n = 0,p = 0;
		ArrayList list = new ArrayList();
	
		/*计算里面有几个用户
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
					
					 //System.out.print(list.get(j)); // 输出每个字符
					 str[j] = list.get(j).toString();
					 n=j;
					// System.out.print(n); //测试几个数
					 
				 }
					for(int x=0;x<n;++x)
			 {				
				// System.out.print(str[x]); // 输出每个字符
				 string += str[x];
			
			 }
				//System.out.print(string); // 输出字符串
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
		 
		 for(int x=0;x<n;++x)
		 {
			 			
			 //System.out.print(str[x]); // 输出每个字符
			 string += str[x] ;
		 }
		System.out.print(string);

	
		out.write(string);
		out.close();
	  }
}

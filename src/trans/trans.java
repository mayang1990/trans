package trans;

import java.util.ArrayList;

public class trans{
	  
	  public static void main(String args[]){
		String first = " 你好 @喜欢你 @大家好 :";
		int i= 0,m = 0;
		ArrayList list = new ArrayList();
		char c = first.charAt(i);
		while( i != first.length() - 1 && c != ':')
		{
			list.add(c);
			if( c == '@')
			{
				for(int j=0;j<list.size()-1;++j)
				 {
					 System.out.print(list.get(j));
				 
				}
				 list.removeAll(list);
				 System.out.print(" 转发 ");
				
			}
			 c = first.charAt(++i);
		 }
		 for(int j=0;j<list.size();++j)
		 {
			 System.out.print(list.get(j));
		 }
		}	
	 
	  }

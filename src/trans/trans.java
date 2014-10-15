package trans;

public class trans{
	  
	  public static void main(String args[]){
		String first = " @你好 @喜欢你 @大家好";
		int i= 0;
		char c = first.charAt(i);
		while( i != first.length() - 1 )
		{
			if( c == '@')
			{
				 System.out.println("hello");
				 int j = i;
				 System.out.println(j);
			}
			 c = first.charAt(++i);
		}
		
	   
	  }
	}

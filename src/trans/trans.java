package trans;

public class trans{
	  
	  public static void main(String args[]){
		String first = " @��� @ϲ���� @��Һ�";
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

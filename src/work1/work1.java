package work1;

public class work1 {

	
	public static void main (String[]args){
		
		
	
		int l;
        l = 9;   //菱形长度
        
        
        for(int m = 1; m <=(l+1)/2; m++)//正序输出上半部分
        {
            for(int b = 1; b <=(l+1)/2-m ; b++)//输出空格
            {
                System.out.print(" ");
            }
           
            	for ( int j = 0; j < m; j++ ) //递增输出
        	    {
        	        System.out.print ((char) ( 'A' + j ));
        	    }
        	    for ( int j = m; j > 1; j-- )//递减输出
        	    {
        	        System.out.print ((char) ( 'A' -2 + j ));
        	    }    
                
            
            System.out.println(); 
        }
        
        
        for(int d =(l+1)/2-1;d >= 1; d --)   //倒序输出菱形下半部分
        {
            for(int b = 1; b <= (l+1)/2-d; b++)//输出空格
            {
                System.out.print(" ");
            }
           
            	for ( int j = 0; j < d; j++ ) //递增输出
        	    {
        	        System.out.print ((char) ( 'A' + j ));
        	    }
        	    for ( int j = d; j > 1; j-- )//递减输出
        	    {
        	        System.out.print ((char) ( 'A' -2 + j ));
        	    }      
            
            System.out.println();
        }
	

	
}
}
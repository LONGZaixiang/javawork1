package work1;

public class work1 {

	
	public static void main (String[]args){
		
		
	
		int l;
        l = 9;   //���γ���
        
        
        for(int m = 1; m <=(l+1)/2; m++)//��������ϰ벿��
        {
            for(int b = 1; b <=(l+1)/2-m ; b++)//����ո�
            {
                System.out.print(" ");
            }
           
            	for ( int j = 0; j < m; j++ ) //�������
        	    {
        	        System.out.print ((char) ( 'A' + j ));
        	    }
        	    for ( int j = m; j > 1; j-- )//�ݼ����
        	    {
        	        System.out.print ((char) ( 'A' -2 + j ));
        	    }    
                
            
            System.out.println(); 
        }
        
        
        for(int d =(l+1)/2-1;d >= 1; d --)   //������������°벿��
        {
            for(int b = 1; b <= (l+1)/2-d; b++)//����ո�
            {
                System.out.print(" ");
            }
           
            	for ( int j = 0; j < d; j++ ) //�������
        	    {
        	        System.out.print ((char) ( 'A' + j ));
        	    }
        	    for ( int j = d; j > 1; j-- )//�ݼ����
        	    {
        	        System.out.print ((char) ( 'A' -2 + j ));
        	    }      
            
            System.out.println();
        }
	

	
}
}
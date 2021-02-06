
public class zohointerview {

	public static void main(String []args){
     //Input to change
	 int n=5;
     try{
        
        for(int i=n;i>0;i--)
        {
            for(int j=n;j>i;j--){
                System.out.print(j);
            }
            for(int j=i;j>0;j--){
                System.out.print(i);
            }
            System.out.println();
        }
        
	    }catch(Exception ex){
	        System.out.println("Exception is ::"+ex.getMessage());
	    }
  }
}

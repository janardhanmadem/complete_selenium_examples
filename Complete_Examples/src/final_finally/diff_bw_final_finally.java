package final_finally;

public class diff_bw_final_finally {
	public static void main(String args[]){
		final int s=100;
		//s=101;//we cannot change the value of s bz it is declared as final
		try{
			//establish connection
			//fire query
			//get the results
			//close connection
			//return
			System.out.println(s);
		}catch(Exception e){
			System.out.println("error"+e.getMessage());
			e.printStackTrace();
		}
		finally{
			System.out.println("In finally close the connection");
			//close the connection if connection established
		}
	}

}
//finally block is executed even though try and catch block executed or not

package samplenetworking;

public class Client 
{
	public static void main(String args[])
	{
		try
		{
            String serverAddress="127.0.0.1";
            int serverPort=33333;
			NetworkUtil nc=new NetworkUtil(serverAddress,serverPort);
			new ReadThread(nc,"Client");
			new WriteThread(nc,"Client");		
		}catch(Exception e)
		{
			System.out.println (e);
		}
		ClientFrame f1=new  ClientFrame();
                f1.setVisible(true);
	}

}


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package samplenetworking;
public class ReadThread implements Runnable
{
	private Thread thr;
	private NetworkUtil nc;
        String s;
	

	public ReadThread(NetworkUtil nc,String s) 
	{
		this.nc = nc;
		this.thr = new Thread(this);
		thr.start();
                this.s=s;
	}
	
	public void run() 
	{
		try
		{
			while(true)
			{
                            
                            String t=nc.read().toString();
				if(!t.equals("")) 
                                    
                                    if(s.equals("Server")){
                                        ServerFrame.ServerTextArea.append("\n"+t);
                                    System.out.println(t);
                                    }
                                    if(s.equals("Client")){
                                        ClientFrame.ClientTextArea.append("\n"+t);
                                    System.out.println(t);
                                    
                                    }
                            
                            
                            
                            
                            
                            
                            
                            /*
				String t=nc.read().toString();
				if(!t.equals("")) System.out.println(t);
				*/
			}
		}catch(Exception e)
		{
			System.out.println (e);                        
		}			
                nc.closeConnection();
		
	}
}




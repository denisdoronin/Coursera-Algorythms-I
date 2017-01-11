
public class Network 
{
	private int connections[];
	public Network(int size)
	{
		connections = new int[size];
		for(int i=0; i<connections.length; i++)
		{
			connections[i] = i;
		}
	}
	
	public boolean connected(int p, int q)
	{
	    return (connections[p] == connections[q]);	
	}
	
	public void union(int p, int q)
	{
		if(!connected(p,q))
		{
			int pid = connections[p];
			int qid = connections[q];
		
			for(int i=0; i<connections.length; i++)
			{
				if(connections[i] == pid)
					connections[i] = qid;
			}
		}
	}
	
	//debug staff
	public void print()
	{
		System.out.print("nodes:       ");
		for(int i=0; i<connections.length; i++)
		{
			System.out.format("%02d ", i);
		}
		
		System.out.print("\nconnections: ");
		for(int i=0; i<connections.length; i++)
		{
			System.out.format("%02d ", connections[i]);
		}
		System.out.println();
	}
	
}


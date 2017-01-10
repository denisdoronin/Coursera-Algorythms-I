
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
		int pid = connections[p];
		int qid = connections[q];
		
		for(int i=0; i<connections.length; i++)
		{
			if(connections[i] == qid)
				connections[i] = pid;
		}
	}
}


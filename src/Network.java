
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
	    return (root(p) == root(q));	
	}
	
	public void union(int p, int q)
	{
		if(!connected(p,q))
		{
			connections[root(p)] = connections[root(q)];		
		}
	}
	
	private int root(int i)
	{
		while(i != connections[i])
		{
			i = connections[i];
		}
		
		return i;
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


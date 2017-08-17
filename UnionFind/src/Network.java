
public class Network 
{
	private int connections[];
	private int weights[];
	public Network(int size)
	{
		connections = new int[size];
		weights = new int[size];
		for(int i=0; i<connections.length; i++)
		{
			connections[i] = i;
			weights[i] = 1;
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
			int p_root, q_root;
			p_root = root(p);
			q_root = root(q);
			
			if(weights[p_root] > weights[q_root])
			{
				connections[q_root] = connections[p_root];
				weights[p_root] += weights[q_root];
			}			
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


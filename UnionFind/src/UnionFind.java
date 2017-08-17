
public class UnionFind 
{
	public static void main(String[] args)
	{
		System.out.println("Union Find started");
		
		Network uf = new Network(10);
		
		uf.union(1, 5);
		uf.print();
		
		uf.union(3, 1);
		uf.print();
		
		System.out.println("Union Find ended");
	}

}

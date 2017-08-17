public class RandomizedQueue<Item> implements Iterable<Item> 
{
	Item[] q;
	int current;
	
   public RandomizedQueue()                 // construct an empty randomized queue
   {
	   current = -1;
	   q = null;
   }
   public boolean isEmpty()                 // is the queue empty?
   {
	   return(current == -1);
   }
   public int size()                        // return the number of items on the queue
   {
	   return (current+1);
   }
   public void enqueue(Item item)           // add the item
   {
	   if(q == null)
	   {
		   q = new Item[1];
	   }
   }
   public Item dequeue()                    // remove and return a random item
   {}
   public Item sample()                     // return (but do not remove) a random item
   {}
   public Iterator<Item> iterator()         // return an independent iterator over items in random order
   {}
   public static void main(String[] args)   // unit testing (optional)
   {}
}
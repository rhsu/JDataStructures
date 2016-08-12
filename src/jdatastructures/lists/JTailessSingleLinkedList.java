package jdatastructures.lists;

/**
 *
 * @author robert
 * @param <T>
 */
public class JTailessSingleLinkedList<T>
{
	private JNode<T> head;
	
	public JNode<T> getHead() { return head; }
	
	public int getSize() 
	{ 
		JNode<T> pointer = head;
		int size = 0;
		
		while (pointer != null)
		{
			size += 1;
			pointer = pointer.getNextNode();
		}
		
		return size;
	}
	
	public void addNode (T value)
	{
		//1. create the new node.
		JNode<T> newNode = new JNode<>(value);
		
		// 2. find where the end of the list is
		if (this.head == null)
			this.head = newNode;
		
		else 
		{
			JNode<T> pointer = head;
			JNode<T> placeToInsert = null;
			while (pointer != null)
			{
				placeToInsert = pointer;
				pointer = pointer.getNextNode();
			}
			
			placeToInsert.setNextNode(newNode);
		}
	}
	
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		
		JNode<T> pointer = head;
		
		while (pointer != null)
		{
			builder.append(pointer.getValue()).append(" ");
			pointer = pointer.getNextNode();
		}
		
		return builder.toString();
	}
	
	public void removeAll()
	{
		this.head = null;
	}
	
	public void removeFirst()
	{
		if (head == null)
			return;
		
		this.head = head.getNextNode();
	}
	
	public void removeLast()
	{
		
	
	}
	
	public boolean removeFirstValueOf(T t)
	{	
		boolean isSuccessful = false;
		return isSuccessful;
	}
	
	public boolean removeAllValuesOf(T t)
	{
		return false;
	}
	
	public JTailessSingleLinkedList()
	{
		this.head = null;
	}
}

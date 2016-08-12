package jdatastructures.lists;

/**
 *
 * @author robert
 * @param <T>
 */
public class JTailessSingleLinkedList<T>
{
	private JNode<T> head;
	private int size;
	
	public JNode<T> getHead() { return head; }
	
	public void setHead(JNode<T> head)
	{	
		this.head = head;
	}
	
	public int getSize() { return size; }
	
	public void addNode (T value)
	{
		//1. create the new node.
		JNode<T> newNode = new JNode<>(value, null);
		
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
		
		//3. increment size;
		size += 1;
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
	
	public JTailessSingleLinkedList()
	{
		this.head = null;
		this.size = 0;
	}
}

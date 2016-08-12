package jdatastructures.lists;

/**
 *
 * @author robert
 * @param <T>
 */
public class JNode<T>
{
	private final T value;
	private JNode nextNode;
	
	public T getValue() { return value; }
	
	public JNode getNextNode() { return nextNode; }
	
	public void setNextNode(JNode nextNode)
	{
		this.nextNode = nextNode;
	}
	
	public JNode(T value, JNode nextNode)
	{
		this.value = value;
		this.nextNode = nextNode;
	}
	
	public JNode(T value)
	{
		this.value = value;
		this.nextNode = null;
	}
}

package jdatastructures.lists;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class JTailessSingleLinkedListTest 
{
	private JTailessSingleLinkedList<Integer> objectUnderTest;
	
	@Before
	public void setUp() 
	{
		objectUnderTest = new JTailessSingleLinkedList<>();
	}
	
	@Test
	public void GetHead_testEmptyList() 
	{	
		Assert.assertNull(objectUnderTest.getHead());
	}
	
	@Test
	public void GetSize_testEmptyList()
	{
		Assert.assertEquals(0, objectUnderTest.getSize());
	}
	
	@Test
	public void AddNode_testAddingNode()
	{
		objectUnderTest.addNode(1);
		
		JNode<Integer> head = objectUnderTest.getHead();
		if (head == null)
			fail("head should not be null");
		
		Assert.assertEquals(1, (int)head.getValue());
	}
	
	@Test
	public void GetSize_testAddingTwoNodes()
	{
		objectUnderTest.addNode(1);
		objectUnderTest.addNode(2);
		
		Assert.assertEquals(2, objectUnderTest.getSize());
	}
	
	@Test
	public void GetSize_testAddingNode()
	{
		objectUnderTest.addNode(1);
		
		Assert.assertEquals(1, objectUnderTest.getSize());
	}
	
	@Test
	public void GetSize_testRemoveAllOnEmptyList()
	{
		objectUnderTest.removeAll();
		
		Assert.assertEquals(0, (int)objectUnderTest.getSize());
	}
	
	@Test
	public void GetSize_testRemoveAllOnNotEmptyList()
	{
		objectUnderTest.addNode(1);
		objectUnderTest.addNode(2);
		
		objectUnderTest.removeAll();
		Assert.assertEquals(0, (int)objectUnderTest.getSize());
	}
	
	@Test
	public void GetHead_testRemoveAll()
	{
		objectUnderTest.removeAll();
		
		Assert.assertNull(objectUnderTest.getHead());
	}
	
	@Test
	public void RemoveFirst_TestFirstIsRemoved()
	{
			
}
}
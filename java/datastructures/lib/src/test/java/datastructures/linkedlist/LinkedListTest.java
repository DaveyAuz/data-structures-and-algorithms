package datastructures.linkedlist;

import LinkedListNode;
import org.junit.jupiter.api.Test;

public class LinkedListTest
{
  @Test void testAMethod()
    {
      // TODO: test zipLists
      LinkedListNode<Integer> list1=new LinkedListNode<Integer>(new int[]]{1,3,2});
      LinkedListNode<Integer> list2=new LinkedListNode<Integer>(new int[]{5,9,4});
      LinkedListNode expected=LinkedListNode.of(new int[]{1,5,3,9,2,4});
      LinkedListNode actual=zipLists(list1,list2);
      assertEquals(expected,actual);

      // TODO: test case 2: list 1 is longer than list2
      list1=new LinkedListNode<Integer>(new int[]{1,3,2,4});
      list2=new LinkedListNode<Integer>(new int[]{5,9,4});
      expected=LinkedListNode.of(new int[]{1,5,3,9,2,4});
      actual=zipLists(list1,list2);
      assertEquals(expected,actual);


      // TODO: test case 3: list 2 is longer than list1
      list1=new LinkedListNode<Integer>(new int[]{1,3});
      list2=new LinkedListNode<Integer>(new int[]{5,9,4,7});
      expected=LinkedListNode.of(new int[]{1,5,3,9,4,7});
      actual=zipLists(list1,list2);
      assertEquals(expected,actual);

      //test case 4: list 1 and list 2 are empty
      list1=null
      list2=LinkedListNode.of(new int[]{5,9,4});
      expected=LinkedListNode.of(new int[]{5,9,4});
      actual=zipLists(list1,list2);
      assertEquals(expected,actual);

      //test case 5: list 2 is empty
      list1=LinkedListNode.of(new int[]{1,3});
      list2=null;
      expected=LinkedListNode.of(new int[]{1,3});
      actual=zipLists(list1,list2);
      assertEquals(expected,actual);
    }
}

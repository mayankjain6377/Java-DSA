package java14_LinkedList;


 public class java4_RemoveSortedLL {

//*******  1.Remove Element from a Linked List *********
  /**
   * Definition for singly-linked list.
   * public class ListNode {
   * int val;
   * ListNode next;
   * ListNode() {}
   * ListNode(int val) { this.val = val; }
   * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   * }
   */
//  class Solution {
//   public ListNode deleteDuplicates(ListNode temp) {
//    if (temp == null) {
//     return temp;
//    }
//    ListNode head = temp;
//
//    while (temp.next != null) {
//     if (temp.val == temp.next.val) {
//      temp.next = temp.next.next;
//
//     } else {
//      temp = temp.next;
//     }
//    }
//    // tail=temp;
//    // tail.next=null;
//    return head;
//   }
//  }


//  ***** 2. Merge Two Sorted Lists using Recursion
//  class Solution {
//   public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//    if(list1!=null && list2!=null){
//     if(list1.val<list2.val){
//      list1.next=mergeTwoLists(list1.next,list2);
//      return list1;
//
//     }
//     else{
//      list2.next=mergeTwoLists(list1,list2.next);
//      return list2;
//     }
//
//    }
//    if(list1==null){
//     return list2;
//
//    }
//    return list1;
//   }
//  }


  /******** 3. Middle of the LinkedList
  * class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int count=0;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null ){
            slow=slow.next;
              fast=fast.next.next;
        }
        return slow;
    }
}


   /* leetcode#141 detect the cycle in a linkedList
   public class Solution {
   public boolean hasCycle(ListNode head) {
   ListNode slow=head;
   ListNode fast=head;

   while(fast!=null&&fast.next!=null){
   slow=slow.next;
   fast=fast.next.next;
   if(slow==fast){
   return true;
   }
   }
   return false;
   }
   }
   */


  /********Leetcode #142 returning the Node from where the cycle begins
  public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return fast;
            }
        }
        return null;
    }
}
  * */





public static void main(String[] args) {

}
}
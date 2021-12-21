/*
Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.

 

Example 1:


Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10
Example 2:

Input: head = [0]
Output: 0
 

Constraints:

The Linked List is not empty.
Number of nodes will not exceed 30.
Each node's value is either 0 or 1.

*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        int size = listSize(head);
        int tracker=size-1;
        int res=0;
        ListNode curr=head;
        while(curr!=null && tracker>=0)
        {
            if(curr.val==1)
            {
                res+=power(tracker);
            }
            curr=curr.next;
            tracker--; 
        }
        return res;
    }
    int listSize(ListNode head)
    {
        ListNode temp=head;
        int num=0;
        while(temp!=null)
        {
            num++;
            temp=temp.next;
        }
        return num;
    }
    int power(int n)
    {
        int res=1;
        for(int i=0;i<n;i++)
        {
            res*=2;
        }
        return res;
    }
}
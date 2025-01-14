//T(N) = O(N)
//S(N) = O(1)

public class Solution {
    public int getLength(ListNode head)
    {
        ListNode Head=head;
        int c=0;
        while(Head!=null)
        {
            c+=1;
            Head=Head.next;
        }
        return c;
    }
    public ListNode checkIntersection(ListNode h1, ListNode h2,int l1,int l2)
    {
        ListNode t1=h1;
        ListNode t2=h2;
        int temp=l1-l2;
        while(temp!=0)
        {
            t1=t1.next;
            temp--;
        }
        while(t1!=null&&t2!=null)
        {
            if(t1==t2)
                return t1;
            t1=t1.next;
            t2=t2.next;
        }
        return null;
        
        
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1=getLength(headA);
        int l2=getLength(headB);
        if(l1>l2)
        {
            return checkIntersection(headA,headB,l1,l2);
        }
        return checkIntersection(headB,headA,l2,l1);
        
        
    }
}
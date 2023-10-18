class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode next=null;
        ListNode prev=null;
        ListNode cur=head;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
}
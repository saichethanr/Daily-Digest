package linkedlist;


 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class remove_duplicated_from_list {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        ListNode d = new ListNode(0,head);
        ListNode prev = d;
        if(head==null ||head.next==null){
            return head;
        }

        while(head!=null){
            if(head.next!=null && head.next.val==head.val){
                while(head.next!=null && head.next.val==head.val){
                    head=head.next;
                }
                prev.next=head.next;
            }
            else{
              prev=prev.next;
            }
            
            head=head.next;
        }
        return d.next;
    }
}

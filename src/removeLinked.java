public class removeLinked {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head;
        }else{
            while(head!=null && head.val==val){
                head=head.next;
            }
            if(head!=null){
                ListNode temp=head,temp1=head;
                while(temp1!=null){
                    if(temp1.val==val){
                        temp.next=temp1.next;
                    }else{
                        temp=temp1;
                    }
                    temp1=temp1.next;
                }
            }
        }
        return head;
    }
}

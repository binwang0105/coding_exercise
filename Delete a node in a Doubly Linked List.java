void deleteNode(Node head_ref, Node del) {
 
        /* base case */
        if (head == null || del == null) {
            return;
        }
 
        /* If node to be deleted is head node */
        if (head == del) {
            head = del.next;
        }
 
        /* Change next only if node to be deleted is NOT the last node */
        if (del.next != null) {
            del.next.prev = del.prev;
        }
 
        /* Change prev only if node to be deleted is NOT the first node */
        if (del.prev != null) {
            del.prev.next = del.next;
        }
 
        /* Finally, free the memory occupied by del*/
        return;
    }
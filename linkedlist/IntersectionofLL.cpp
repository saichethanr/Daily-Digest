/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        ListNode *tempA = headA;
        ListNode *tempB = headB;
        if(!headA || !headB){
            return NULL;
        }                
        
       while (tempA != tempB) {
            // Move tempA to the next node, or switch to headB when it reaches the end
            tempA = tempA ? tempA->next : headB;
            // Move tempB to the next node, or switch to headA when it reaches the end
            tempB = tempB ? tempB->next : headA;
        }
        
        return tempA;
    }
};
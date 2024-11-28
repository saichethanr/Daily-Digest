// BRUTE force
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
    bool hasCycle(ListNode *head) {
        unordered_map<ListNode*,int> visited;
        ListNode *temp = head;
        
        while(temp!=NULL){
            if(visited.find(temp)!=visited.end()){
                return true;
            }visited[temp]=1;
            temp=temp->next;
            
        }
        return false;
    }
};

// OPTIMAL :
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
    bool hasCycle(ListNode *head) {
        ListNode *fast = head;
        ListNode *slow = head;

        while(fast!=NULL && fast->next!=NULL){
            slow=slow->next;
            fast=fast->next->next;
            if(slow == fast){
                return true;
            }
            
        }
        return false;
    }
};
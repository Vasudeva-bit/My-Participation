// Complete the has_cycle function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode* next;
 * };
 *
 */
bool has_cycle(SinglyLinkedListNode* head) {
    vector<SinglyLinkedListNode*> store;
    while(head != NULL) {
        if(find(store.begin(), store.end(), head) != store.end())
            return true;
        store.push_back(head);
        head = head->next;
    }
    return false;
}
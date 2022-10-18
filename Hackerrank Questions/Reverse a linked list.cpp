/*
 * Complete the 'reverse' function below.
 *
 * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
 * The function accepts INTEGER_SINGLY_LINKED_LIST llist as parameter.
 */


class SinglyLinkedListNode {
    public:
    int data;
    SinglyLinkedListNode* next;
};

SinglyLinkedListNode* reverse(SinglyLinkedListNode* llist) {
    if(llist == NULL)
        return NULL;
    SinglyLinkedListNode* help = llist;
    SinglyLinkedListNode* store = NULL;
    SinglyLinkedListNode* tmp = NULL;
    while(help != NULL) {
        tmp = help->next;
        help->next = store;
        store = help;
        help = tmp;
    }
    return store;
}
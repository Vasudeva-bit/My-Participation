#include <iostream>
using namespace std;
class Node
{
public:
    char data;
    Node *next;
};
Node *head = NULL;
int pp = 0;
void push_back(char newElement)
{
    Node *newNode = new Node();
    newNode->data = newElement;
    newNode->next = NULL;
    if (head == NULL)
    {
        head = newNode;
    }
    else
    {
        Node *temp = head;
        while (temp->next != NULL)
            temp = temp->next;
        temp->next = newNode;
    }
}

void display()
{
    Node *temp = head;
    if (temp != NULL)
    {
        while (temp != NULL)
        {
            cout << temp->data << " ";
            temp = temp->next;
        }
        cout << endl;
    }
}

bool isVowel(char c)
{
    bool isv = (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    return isv;
}

void insertV(char x)
{
    Node *ptr = new Node();
    Node *temp = new Node();
    ptr = head;
    temp->data = x;
    temp->next = NULL;
    if (!isVowel(ptr->data))
    {
        temp->next = ptr;
        head = temp;
        return;
    }
    while (ptr->next != NULL)
    {
        if ((!isVowel(ptr->data)) && (!isVowel((ptr->next)->data)))
        {
            temp->next = ptr->next;
            ptr->next = temp;
            return;
        }
        ptr = ptr->next;
    }
    if (!isVowel(ptr->data))
    {
        ptr->next = temp;
        return;
    }
    pp = 1;
    cout << "Can't be inserted";
    return;
}
void insertC(char x)
{
    Node *temp = new Node();
    int cc = 0;
    temp->data = x;
    temp->next = NULL;
    Node *temp2 = new Node();
    temp2->data = -1;
    temp2->next = head;
    if (isVowel(head->data))
    {
        temp->next = head;
        head = temp;
        return;
    }
    while (temp2->next != NULL)
    {
        if (isVowel((temp2->next)->data))
        {
            if (cc <= 1)
            {
                temp->next = temp2->next;
                temp2->next = temp;
                return;
            }
            else
            {
                cc = 0;
            }
        }
        else
        {
            cc++;
        }
        temp2 = temp2->next;
    }
    if (isVowel(temp2->data))
    {
        temp2->next = temp;
        return;
    }
    pp = 1;
    cout << "Can't be inserted";
    return;
}
int main()
{
    int i = 0;
    cin >> i;
    while (i--)
    {
        char x;
        cin >> x;
        push_back(x);
    }
    char b;
    cin >> b;
    if (isVowel(b))
        insertV(b);
    else
        insertC(b);
    if (pp == 0)
        display();
    return 0;
}
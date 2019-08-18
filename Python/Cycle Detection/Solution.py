#author SANKALP SAXENA  



# Complete the has_cycle function below.

#
# For your reference:
#
# SinglyLinkedListNode:
#     int data
#     SinglyLinkedListNode next
#
#
def has_cycle(head):
    s = set()
    temp = head
    while True:
        if temp.next == None:
            return False

        if temp.next not in s:
            s.add(temp.next)
        else:
            return True
        temp = temp.next


    return False



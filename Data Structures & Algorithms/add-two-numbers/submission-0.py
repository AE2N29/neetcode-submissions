# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        n1 = 0
        x1 = 1
        n2 = 0
        x2= 1
        while l1:
            n1 += l1.val * x1
            x1 = x1 * 10
            l1 = l1.next
        while l2:
            n2 += l2.val * x2
            x2 = x2 * 10
            l2 = l2.next
        sum = n1 + n2
        head = ListNode()
        actual = head
        while sum >= 10:
            actual.val = sum % 10
            sum = sum // 10 
            actual.next = ListNode()
            actual = actual.next
        if sum > 0:
            actual.val= sum
        return head




        
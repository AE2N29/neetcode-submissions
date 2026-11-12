# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        index = head
        if index :
          index = head.next
        s = {head}
        r = False
        if head :
            while index and r == False:
                if index in s:
                    r = True
                else:
                    s.add(index)
                    index = index.next
            return r
        else:
         return r

        
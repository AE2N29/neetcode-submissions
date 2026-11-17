# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        if root:
            if root.left is None and root.right is None:
                return 1 
            a = 0
            b = 0
            if root.left:
                a = self.maxDepth(root.left) + 1
            if root.right :
                b = self.maxDepth(root.right) + 1
            return max(a,b)
        else:
            return 0

        


class Tree:
    def __init__(self, root_node: Node):
        self.root = root_node

class Node:
    def __init__(self, value, right=None, left=None):
        self.right = right
        self.left = left
        self.value = value


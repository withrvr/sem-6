# https://www.enjoyalgorithms.com/blog/level-order-traversal-of-binary-tree
# example from here ... see the visulization

hm = {
    1: [2,6],
    2: [3,4],
    6: [7,9],
    4: [5],
    7: [8],
}

que = [1, ]
goal = 7

def recursion():
    def helper():
        if len(que) == 0:
            return
        
        left = que.pop(0)
        print(left, end=" ")
        
        if left == goal:
            print("----- found -----")
            return
        
        arr = hm.get(left)
        if arr != None:
            for val in arr:
                que.append(val)
            
        helper()
    
    helper()
    

def iterate():
    while len(que) > 0:
        left = que.pop(0)        
        print(left, end=" ")
        
        if left == goal:
            print("----- found -----")
            break
        
        arr = hm.get(left)
        if arr != None:
            for val in arr:
                que.append(val)
    

# ------------- main main -------------

print("goal        :", goal)
print("correct ans : 1 2 6 3 4 7 9 5 8\n")
print("my      ans :", end=" ")
recursion()
# iterate()


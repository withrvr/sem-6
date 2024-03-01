# Uniform-Cost Search (UCS) Algorithm
import heapq

def uniform_cost_search(tree, cost, goal, start):
    answer = [float('inf')] * len(goal)
    queue = [(0, start)]
    visited = {}
    count = 0

    while queue:
        cost_so_far, current_node = heapq.heappop(queue)
        cost_so_far *= -1

        if current_node in goal:
            index = goal.index(current_node)
            if answer[index] == float('inf'):
                count += 1
            answer[index] = cost_so_far
            heapq.heappop(queue)  # Remove duplicate entry
            if count == len(goal):
                return answer

        if current_node not in visited:
            for neighbor in tree[current_node]:
                new_cost = cost[(current_node, neighbor)]
                heapq.heappush(queue, ((cost_so_far + new_cost) * -1, neighbor))

            visited[current_node] = 1

    return answer

# Example usage
tree = [[] for _ in range(7)]
tree[0] = [1, 3]
tree[3] = [1, 6, 4]
tree[1] = [6]
tree[4] = [2, 5]
tree[2] = [1]
tree[5] = [2, 6]
tree[6] = [4]

cost = {
    (0, 1): 2,
    (0, 3): 5,
    (1, 6): 1,
    (3, 1): 5,
    (3, 6): 6,
    (3, 4): 2,
    (2, 1): 4,
    (4, 2): 4,
    (4, 5): 3,
    (5, 2): 6,
    (5, 6): 3,
    (6, 4): 7
}

goal = [6]
start_node = 0
result = uniform_cost_search(tree, cost, goal, start_node)
print("Minimum cost from S to G is =", result[0])

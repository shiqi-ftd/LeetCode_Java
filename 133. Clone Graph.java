/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) {
            return null;
        }
        HashMap<UndirectedGraphNode, UndirectedGraphNode> visit = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        return bfs(visit, node);
    }
    private UndirectedGraphNode bfs(HashMap<UndirectedGraphNode, UndirectedGraphNode> visit, UndirectedGraphNode node) {
        if (visit.containsKey(node)) {
            return visit.get(node);
        }
        UndirectedGraphNode clone = new UndirectedGraphNode(node.label);
        visit.put(node, clone);
        for (UndirectedGraphNode adject : node.neighbors) {
            clone.neighbors.add(bfs(visit, adject));
        }
        return clone;
    }
}
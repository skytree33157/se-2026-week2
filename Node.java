import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Node {
    public String label;
    public Node parent;
    public List<Node> children;

    public Node(String label) {
        this.label = label;
        this.children = new ArrayList<>();
    }

    public void addChild(Node child) {
        this.children.add(child);
    }

    // bfs 추가
    public List<String> bfs() {
        List<String> visited = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(this);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            visited.add(current.label);
            queue.addAll(current.children);
        }

        return visited;

    public boolean hasChild() { // Check if the node has any children and return true if it does, false otherwise
        return this.children != null && !this.children.isEmpty();
    }

    public void dfs() {
        System.out.println(this.label);
        if (!this.hasChild()) return;
        for (Node child : this.children) if (child != null) child.dfs();
    public int height(){
        if(children.isEmpty()){
            return 0;
        }
        int maxHeight=0;
        for(Node child: children){
            int childHeight=child.height();
            if(childHeight>maxHeight){
                maxHeight=childHeight;
            }
        }
        return maxHeight+1;
    }
}

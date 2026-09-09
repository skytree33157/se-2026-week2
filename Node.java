import java.util.ArrayList;
import java.util.List;

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


    public boolean hasChild() { // Check if the node has any children and return true if it does, false otherwise
        return this.children != null && !this.children.isEmpty();
    }

    public void dfs() {
        System.out.println(this.label);
        if (!this.hasChild()) return;
        for (Node child : this.children) if (child != null) child.dfs();
    }
}

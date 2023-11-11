package raf.dsw.classzcraft.app.apstrakcija;

import java.util.ArrayList;
import java.util.List;

public class ClassyNodeComposite extends ClassyNode{

    List<ClassyNode> children;

    public ClassyNodeComposite(String ime, ClassyNode parent) {
        super(ime, parent);
        this.children=new ArrayList<>();
    }

    public ClassyNodeComposite(String ime, ClassyNode parent, List<ClassyNode> children) {
        super(ime, parent);
        this.children = children;
    }

    public void addChild(ClassyNode child)
    {
        children.add(child);
    }
    public void removeChild(ClassyNode child)
    {
        if(children.contains(child))
        {
            children.remove(child);
        }
    }

    public List<ClassyNode> getChildren() {
        return children;
    }

    public ClassyNode getChildByName(String name) {
        for (ClassyNode child: this.getChildren()) {
            if (name.equals(child.getIme())) {
                return child;
            }
        }
        return null;
    }
}

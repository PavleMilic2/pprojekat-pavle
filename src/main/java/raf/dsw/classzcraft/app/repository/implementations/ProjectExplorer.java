package raf.dsw.classzcraft.app.repository.implementations;

import raf.dsw.classzcraft.app.apstrakcija.ClassyNode;
import raf.dsw.classzcraft.app.apstrakcija.ClassyNodeComposite;

public class ProjectExplorer extends ClassyNodeComposite {

    public ProjectExplorer(String name) {
        super(name, null);
    }

    @Override
    public void addChild(ClassyNode child) {
        if (child != null &&  child instanceof Project){
            Project project = (Project) child;
            if (!this.getChildren().contains(project)){
                this.getChildren().add(project);
            }
        }
    }

}

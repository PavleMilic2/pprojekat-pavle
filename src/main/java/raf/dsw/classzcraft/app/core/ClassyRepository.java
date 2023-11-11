package raf.dsw.classzcraft.app.core;

import raf.dsw.classzcraft.app.apstrakcija.ClassyNode;
import raf.dsw.classzcraft.app.apstrakcija.ClassyNodeComposite;
import raf.dsw.classzcraft.app.repository.implementations.ProjectExplorer;

public interface ClassyRepository {

    ProjectExplorer getProjectExplorer();
    void addChild(ClassyNodeComposite parent, ClassyNode child);

}

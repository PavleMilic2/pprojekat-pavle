package raf.dsw.classzcraft.app.repository;

import raf.dsw.classzcraft.app.apstrakcija.ClassyNode;
import raf.dsw.classzcraft.app.apstrakcija.ClassyNodeComposite;
import raf.dsw.classzcraft.app.core.ClassyRepository;
import raf.dsw.classzcraft.app.repository.implementations.ProjectExplorer;

public class ClassyRepositoryimplements implements ClassyRepository {

    private ProjectExplorer projectExplorer;

    public ClassyRepositoryimplements() {
        projectExplorer = new ProjectExplorer("Project Explorer");
    }

    @Override
    public ProjectExplorer getProjectExplorer() {
        return projectExplorer;
    }

    @Override
    public void addChild(ClassyNodeComposite parent, ClassyNode child) {
        //TODO: implement add Child method
    }

}

package raf.dsw.classzcraft.app.apstrakcija;

import raf.dsw.classzcraft.app.observer.ISubscriber;

import java.util.ArrayList;
import java.util.List;

public abstract class ClassyNode {

    private String ime;
    private ClassyNode parent;

    private List<ISubscriber> subscribers= new ArrayList<>();

    public ClassyNode(String ime, ClassyNode parent)
    {
        this.ime=ime;
        this.parent=parent;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public ClassyNode getParent() {
        return parent;
    }

    public void setParent(ClassyNode parent) {
        this.parent = parent;
    }

    public void addSubscriber(ISubscriber sub) {

        subscribers.add(sub);

    }

    public void removeSubscriber(ISubscriber sub) {

        for(ISubscriber subscriber: subscribers){
            if(subscriber.equals(sub)){
                subscribers.remove(subscriber);
                return;
            }
        }
    }
}

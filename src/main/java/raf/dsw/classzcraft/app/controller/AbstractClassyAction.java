package raf.dsw.classzcraft.app.controller;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public abstract class  AbstractClassyAction extends AbstractAction{
    //nasledjuje da bi mogli da imamo setValue i actionPerformed kasnije

    public AbstractClassyAction(){

    }
    //ovde je da se ne bi stalno copy pasete-ovao
public Icon loadIcon(String name){ //funkcija za ucitavanje icone iz resursa
    Icon icon = null;
    URL ImageURL = getClass().getResource(name);
    if(ImageURL != null)
    {
        Image img = new ImageIcon(ImageURL).getImage();
        Image newImg = img.getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        icon = new ImageIcon(newImg);
    }
    else
    {
        System.err.println("Resorce not found " + name);
    }
        return icon;
}
public ImageIcon loadPicture(String name,int width, int height){//funkcija za ucitavanje slike iz resursa
ImageIcon picture=null;
URL ImageURL =getClass().getResource(name);
    if(ImageURL != null)
    {
        Image img = new ImageIcon(ImageURL).getImage();
        Image newImg = img.getScaledInstance(width,height, Image.SCALE_DEFAULT);
        picture = new ImageIcon(newImg);
    }
    else
    {
        System.err.println("Resorce not found" + name);
    }
    return picture;
}
}

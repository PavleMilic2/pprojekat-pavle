package raf.dsw.classzcraft.app.controller;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.net.URL;

public class ExitAction extends AbstractClassyAction {

    public ExitAction(){


        //accelerator key je shortcut

        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F4, ActionEvent.ALT_MASK));
        putValue(SMALL_ICON, loadIcon("/slike/exit-icon-png-close-0.png"));//od parenta
        putValue(NAME, "Exit");//ime akcije koje se vidi
        putValue(SHORT_DESCRIPTION, "Exit");//kada se stavi mis preko
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }//to je samo pocetak
}
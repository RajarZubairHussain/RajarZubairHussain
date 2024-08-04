import java.awt.*;
import java.awt.event.*;


public class mainProject implements ActionListener {
    Frame win = new Frame();
    MenuBar bar = new MenuBar();

    Menu fMenu = new Menu("File");
    Menu eMenu = new Menu("Edit");
    Menu help = new Menu("help");

    MenuItem openItem = new MenuItem("Open");
    MenuItem newItem = new MenuItem("New");
    MenuItem save = new MenuItem("Save");
    MenuItem print = new MenuItem("Print");
    MenuItem exit = new MenuItem("Exit");

    MenuItem cut = new MenuItem("Cut");
    MenuItem copy = new MenuItem("Copy");
    MenuItem paste = new MenuItem("Paste");

    MenuItem aboutus = new MenuItem("About Us");
    MenuItem helpItem = new MenuItem("Help");
    MenuItem aboutco = new MenuItem("About Co");


    mainProject(){
    
        
        win.setBounds(400,0,1000,800);
        win.setLayout(null);
        

        win.setMenuBar(bar);
        bar.add(eMenu);
        bar.add(fMenu);
        bar.add(help);

        fMenu.add(openItem);
        fMenu.add(newItem);
        fMenu.add(save);
        fMenu.add(print);
        fMenu.add(exit);

        eMenu.add(cut);
        eMenu.add(copy);
        eMenu.add(paste);

        help.add(aboutus);
        help.add(helpItem);
        help.add(aboutco);

        win.setVisible(true);


        openItem.addActionListener(this);
        newItem.addActionListener(this); 
        save.addActionListener(this);
        print.addActionListener(this);
        exit.addActionListener(this);
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        aboutus.addActionListener(this);
        aboutco.addActionListener(this);
        helpItem.addActionListener(this);

        



    }

    public void actionPerformed(ActionEvent e){
        Object ob = e.getSource();
        if (ob==openItem) {
            win.setBackground(Color.BLACK);
        }
        if (ob==newItem) {
            win.setBackground(Color.BLUE);
        }
        if (ob==save) {
            win.setBackground(Color.DARK_GRAY);

        }
        if (ob==aboutus) {
            win.setBackground(Color.GREEN);
        }
        if (ob==cut) {
            win.setBackground(Color.ORANGE);
        }
    }
    public static void main(String[] args) {
        mainProject ob = new mainProject();
    }

}

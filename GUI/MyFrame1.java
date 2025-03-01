import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Notepad extends Frame implements ActionListener{
    Menu fileMenu;
    MenuBar menubar;
    MenuItem newItem, saveItem, openItem, closeItem;

    TextArea textArea;

    FileDialog fileDialog;

    Notepad(){
        setVisible(true);
        setSize(600,600);        

        menubar = new MenuBar();

        newItem = new MenuItem("New");
        saveItem = new MenuItem("Save");
        openItem = new MenuItem("Open");
        closeItem = new MenuItem("Close");

        newItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);

        fileMenu = new Menu("File");
        fileMenu.add(newItem);
        fileMenu.add(saveItem);
        fileMenu.add(openItem);
        fileMenu.add(closeItem);

        menubar.add(fileMenu);

        setMenuBar(menubar);
        textArea = new TextArea();
        add(textArea);

        fileDialog = new FileDialog(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("Open")){
            fileDialog.show();
            System.out.println(fileDialog.getFile());
            try{
                FileInputStream fis = new FileInputStream(fileDialog.getFile());
                byte[] data = fis.readAllBytes();
                String str = new String(data);
                textArea.setText(str);

            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getActionCommand().equals("New")){
            textArea.setText("");
        }else if(ae.getActionCommand().equals("Save")){
            FileDialog saveDialog = new FileDialog(this, "Save", FileDialog.SAVE);        
            saveDialog.show();
            try{
                FileOutputStream fos = new FileOutputStream(saveDialog.getFile());
                String str = textArea.getText();
                fos.write(str.getBytes());
                fos.close();
            }catch(Exception e){
                e.printStackTrace();
            }
            
            
        }
        

        
        
        
    }
}

class MyFrame1{
    public static void main(String[] arg){
         new Notepad();
        
    }
}
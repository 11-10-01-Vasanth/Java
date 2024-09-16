import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Win extends Frame implements ActionListener
{
    Button login;
    Label l1,l2;
    Win()
    {
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(800, 600);
        add(l1 = new Label("Username"));
        add(new TextField(20));
        add(l2 = new Label("Password"));
        add(new TextField(20));
        add(login = new Button("Login"));
        login.addActionListener(this);
    }

    public void actionPerformed(ActionEvent a)
    {
        if(a.getActionCommand().equals("Login"))
        {
            System.out.println(a.getActionCommand() + " Successfully");
            Win w = new Win();
            w.reset();
            // new Win().reset();
        }
    }

    public void reset()
    {
        l1.setText("");
        l2.setText("");
    }
}


public class DemoGui 
{
    public static void main(String[] args) 
    {
         Win win = new Win();
    }
}
   

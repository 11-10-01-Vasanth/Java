import java.awt.*;

class Mywin extends Frame{
    Mywin()
    {
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(200,200);
        add(new Label("Username"));
        add(new TextField(20));
        add(new Label("Password"));
        add(new TextField(20));
        add(new Button("Login"));
    }
}
public class Login 
{
    Mywin mywin = new Mywin();
}

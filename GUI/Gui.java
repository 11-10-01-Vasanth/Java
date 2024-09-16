import java.awt.*;

class MyWindow extends Frame
{
    Button b1;
    MyWindow()
    {
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(200,200);
        b1 = new Button("Click");
        add(b1, BorderLayout.EAST);
    }
}
public class Gui 
{
    public static void main(String[] args)
    {
        MyWindow mw = new MyWindow();
    }
}   

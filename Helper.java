import java.awt.*;
import java.awt.event.*;
class A extends Frame
{
  public A()
{
 Helper h1=new Helper();
  addKeyListener(h1;
  setSize(300,300);
  setVisible(true);
 }
public static void main(String[]args)
{
new A();
}
}
class Helper extends KeyAdapter
{
 public void keyTyped(KeyEvent e)
{
char char1=e.getKeyChar();
System.out.println("YOu typed"+char1+"character from keyboard");
}
}
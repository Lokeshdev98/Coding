import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class A extends JFrame {
    public void init() {
        JLabel l1 = new JLabel();
        JLabel l2 = new JLabel();
        setLayout(new GridLayout());
        add(l1);
        add(l2);
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                l1.setText("Mouse clicked");
            }

            @Override
            public void mousepressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExcited(MouseEvent e) {
            }
        });
        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                l2.setText("Mouse Dragged");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }
        });
        setTitle("ex5");
        setSize(300, 400);
        setVisible(true);
    }
}

class Ex10 {
    public static void main(String[] args) {
        A a = new A();
        a.init();
    }
}
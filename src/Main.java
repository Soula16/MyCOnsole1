import javax.swing.*;

public class main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        JFrame f = new JFrame("Swing Paint Demo");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mypanel myPanel = new mypanel();
        myPanel.repaint();
        myPanel.setSymbols("1,2,3");
        f.add(myPanel);
        f.pack();
        f.setVisible(true);
    }
}

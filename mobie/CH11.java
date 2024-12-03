import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CH11 implements ActionListener {
    JFrame window = new JFrame( "studenr points" );
    Container c;
    JTextField textField[] = new JTextField[3];
    JLabel label[] = new JLabel[3];
    Font newFont = new Font("courier new", Font.BOLD,16);
    int data [][] = new int[20][3];
     String strLable[] = {"mis scores ","final scores ","home scores" };
     JTextField studentNo;
     JButton btnOk , btnAll;
}
public CH11(){
    window = new JFrame( "studenr points" );
    c = window.getContentPane();
    studentNo = new JTextField(10);
    btnOk = new JButton ( "OK" );
    btnOk.addActionListener(this);
    btnAll = new JButton ( "All" );
    btnAll.addActionListener(this);
    c.add(new JLabel());
    c.add(studentNo);
    c.add(btnOk);
    c.add(btnAll);

    for(int n= 0; n < label.length; n++) {
        label[n] = new JLabel(strLable[n]);
        label[n].setFont(newFont);
        textField[n] = new JTextField(10);
        textField[n].setEditable(false);
        textField[n].setFont(newFont);
        c.add(label[n]);
        c.add(textField[n]);
        window.setSize(450 ,240);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        getData(data);
    }

}
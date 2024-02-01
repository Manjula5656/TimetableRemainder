
        import javax.swing.*;
        import java.awt.*;
        import java.sql.DatabaseMetaData;


        public class gui {
    JFrame frame  = new JFrame();
    JPanel panel = new JPanel();
    JTextField UserIDField = new JTextField();
    JButton button = new JButton("Click me");
    public gui (){
        UserIDField.setBounds(80,20,200,50);
        panel.setLayout(new FlowLayout());
        button.setBounds(120,100,90,30);
        button.addActionListener(this);
        frame.add(button);
        frame.add(UserIDField);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActiveEvent e){
        String text;
        if(e.getSource() == button){
            text = UserIDField.getText();
            try{
                new Database(text);
            }catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
    }

}


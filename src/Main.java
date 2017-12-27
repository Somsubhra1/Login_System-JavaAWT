import java.awt.*;
import java.awt.event.*;

public class Main implements ActionListener {
    Frame f=new Frame("Login");
    Label user,mail,display,pass,credits;
    TextField username,email,password;
    Button signup,login;
    Checkbox cb;
    MenuBar mb;
    Menu m;
    MenuItem mi;
    Main() {

        f.setSize(400,350);
        f.setLayout(null);
        f.setBackground(Color.orange);

        mb=new MenuBar();
        m=new Menu("Menu");
        mi=new MenuItem("Close");
        m.add(mi);
        mb.add(m);
        f.setMenuBar(mb);
        mi.addActionListener(this);

        user=new Label("Username:");
        user.setBounds(20,50,70,40);
        f.add(user);

        username=new TextField();
        username.setBounds(100,60,150,20);
        f.add(username);

        mail=new Label("Email:");
        mail.setBounds(20,90,60,40);
        f.add(mail);

        email=new TextField();
        email.setBounds(100,100,150,20);
        f.add(email);

        pass=new Label("Password:");
        pass.setBounds(20,130,60,40);
        f.add(pass);

        password=new TextField();
        password.setBounds(100, 140, 150, 20);
        password.setEchoChar('*');
        f.add(password);

        cb=new Checkbox("Remember me",true);
        cb.setBounds(20, 170, 100, 40);
        f.add(cb);

        signup=new Button("Sign Up");
        signup.setBounds(20,215,60,30);
        f.add(signup);

        login=new Button("Login");
        login.setBounds(130,215,60,30);
        f.add(login);

        credits=new Label("© Made by Somsubhra");
        credits.setAlignment(0);
        credits.setBounds(10, 320, 150, 30);
        f.add(credits);

        f.setVisible(true);

        signup.addActionListener(this);
        login.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String a=username.getText();
        String b=email.getText();
        String c=password.getText();
        display=new Label();
        if(e.getSource()==signup) {
            display.setText("Sign Up successful with username "+a+" and Email "+b);
        }
        else if(e.getSource()==login) {
            if(a.equals("username") && b.equals("email@email.com") && c.equals("password")) {
                display.setText("Login Successful");
            }
            else {
                display.setText("Username/Email/Password Incorrect");
            }
        }
        else {
            System.exit(0);
        }
        display.setBounds(20,230,400,100);
        username.setEditable(false);
        email.setEditable(false);
        password.setEditable(false);
        f.add(display);
    }
    public static void main(String[] args) {
        new Main();
    }
}

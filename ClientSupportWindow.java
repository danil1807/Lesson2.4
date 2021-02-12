import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientSupportWindow extends JFrame {
    package private ClientSupportWindow () {
        setTitle("New dialog");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(50, 100, 400, 400);
        setVisible(true);

        JTextArea chatList = new JTextArea();
        add(chatList, BorderLayout.CENTER);
        chatList.setEditable(false);

        JPanel bottom = new JPanel();
        bottom.setLayout(new BorderLayout());
        add(bottom, BorderLayout.SOUTH);

        JTextField yourMessage = new JTextField("Type here...");
        bottom.add(yourMessage, BorderLayout.CENTER);
        yourMessage.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            chatList.append("You: " + yourMessage.getText() + "\n");
            yourMessage.setText("");
            }
        });

        JButton send = new JButton("Send");
        bottom.add(send, BorderLayout.EAST);
        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chatList.append("You: " + yourMessage.getText() + "\n");
                yourMessage.setText("");
            }
        });
    }
}



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;


public class Main extends JFrame {

	private Container c; 
	 private JButton sub;
	 private JButton signup;
	 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame. It is the first frame to be visible after launch of application
	 */
	public Main()  throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(50, 10, 1014, 597);
        setResizable(false);
        
        
    	setLayout(new BorderLayout());
    	setContentPane(new JLabel(new ImageIcon("C:\\\\Users\\\\joshi_f9n026d\\\\Downloads\\\\pexels-miguel-á-padriñán-255379.jpg")));
    	setLayout(new FlowLayout());
    	
    	c = getContentPane(); 
        c.setLayout(null);
        
        
        JLabel lblNewLabel = new JLabel("Resume Builder");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 46));
        lblNewLabel.setBounds(353, 13, 473, 93);
        c.add(lblNewLabel);
        
       
		
		sub = new JButton("Login"); 
        sub.setFont(new Font("Verdana", Font.PLAIN, 15)); 
        sub.setBounds(245, 392, 162, 73);
        c.add(sub); 
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserLogin lp = new UserLogin();
				lp.setVisible(true);
			}
		});
		
		signup = new JButton("Signup"); 
        signup.setFont(new Font("Verdana", Font.PLAIN, 15));  
        signup.setBounds(595, 392, 162, 73); 
        c.add(signup); 
		signup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserRegistration sp = new UserRegistration();
				sp.setVisible(true);
			}
		});
		
		
	}
}

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.*;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;


class SwingExample 
    extends JFrame 
    implements ActionListener { 
  
    // Components of the Form 
    private Container c; 
    private JLabel title; 
    private JLabel name; 
    private JTextField tname; 
    private JLabel mno; 
    private JTextField tmno; 
    private JLabel gender; 
    private JRadioButton male; 
    private JRadioButton female; 
    private ButtonGroup gengp; 
    private JLabel dob; 
    private JComboBox date; 
    private JComboBox month; 
    private JComboBox year; 
    private JLabel add; 
    private JTextArea tadd; 
    private JButton sub; 
    private JButton reset; 
    private JLabel res; 
     private JLabel Qualifications;
    private JTextField tqualification1;
    private JTextField tqualification2;
    private JTextField tqualification3;
    private JTextField tqualification4;
    private JLabel Experience;
    private JTextArea texper;
    private JLabel Hobbies;
    private JTextArea thobbies;
    private JLabel email;
    private JTextField temail;
    private JLabel careerobj;
    private JTextArea tcareerobj;
    private JLabel nationality;
    private JTextField tnationality;
    private JLabel training;
    private JTextArea ttraining;
    private JLabel linkedin;
    private JTextField tlinkedin;
    private JTextField tqualification31;
    private JTextField tqualification11;
    
    
    private String dates[] 
        = { "1", "2", "3", "4", "5", 
            "6", "7", "8", "9", "10", 
            "11", "12", "13", "14", "15", 
            "16", "17", "18", "19", "20", 
            "21", "22", "23", "24", "25", 
            "26", "27", "28", "29", "30", 
            "31" }; 
    private String months[] 
        = { "Jan", "feb", "Mar", "Apr", 
            "May", "Jun", "July", "Aug", 
            "Sup", "Oct", "Nov", "Dec" }; 
    private String years[] 
        = {"1980", "1981", "1982", "1983", 
            "1984", "1985", "1986", "1987", "1988", 
            "1989","1990", "1991", "1992", "1993", 
            "1994", "1995", "1996", "1997", "1998", 
            "1999", "2000", "2001", "2002", 
            "2003", "2004", "2005", "2006", 
            "2007", "2008", "2009", "2010", 
            "2011", "2012", "2013", "2014", 
            "2015", "2016", "2017", "2018", 
            "2019" }; 
  
    // constructor, to initialize the components and takes three arguments to display in default
    // with default values. 
    public SwingExample(String named, String phoned, String emaild) 
    { 
        setTitle("Resume Form"); 
        setBounds(10, 0, 1300, 730);
        getContentPane().setBackground(Color.gray);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
        
        setLayout(new BorderLayout());
    	setContentPane(new JLabel(new ImageIcon("C:\\Users\\joshi_f9n026d\\Downloads\\pexels-miguel-á-padriñán-255379.jpg")));
    	setLayout(new FlowLayout());
    	
        c = getContentPane(); 
        c.setLayout(null); 
  
        
        
        title = new JLabel("Resume"); 
        title.setFont(new Font("Verdana", Font.PLAIN, 30));
        title.setForeground (Color.BLACK);
        title.setSize(300, 30); 
        title.setLocation(475, 30); 
        c.add(title); 
        
        
        name = new JLabel("Name :"); 
        name.setFont(new Font("Verdana", Font.PLAIN, 20)); 
        name.setSize(100, 30); 
        name.setLocation(100, 100); 
        c.add(name); 
  
        tname = new JTextField(named); 
        tname.setFont(new Font("Verdana", Font.PLAIN, 15)); 
        tname.setSize(200, 30); 
        tname.setLocation(250, 100); 
        c.add(tname); 
  
        mno = new JLabel("Phone no:"); 
        mno.setFont(new Font("Verdana", Font.PLAIN, 20)); 
        mno.setSize(110, 30); 
        mno.setLocation(100, 150); 
        c.add(mno); 
  
        tmno = new JTextField(phoned); 
        tmno.setFont(new Font("Verdana", Font.PLAIN, 15)); 
        tmno.setSize(200, 30); 
        tmno.setLocation(250, 150); 
        c.add(tmno); 
  
        gender = new JLabel("Gender :"); 
        gender.setFont(new Font("Arial", Font.PLAIN, 20)); 
        gender.setSize(100, 30); 
        gender.setLocation(100, 200); 
        c.add(gender); 
  
        male = new JRadioButton("Male"); 
        male.setFont(new Font("Verdana", Font.PLAIN, 15)); 
        male.setSelected(true); 
        male.setSize(75, 30); 
        male.setLocation(250, 200); 
        c.add(male); 
  
        female = new JRadioButton("Female"); 
        female.setFont(new Font("Verdana", Font.PLAIN, 15)); 
        female.setSelected(false); 
        female.setSize(80, 30); 
        female.setLocation(325, 200); 
        c.add(female); 
  
        gengp = new ButtonGroup(); 
        gengp.add(male); 
        gengp.add(female); 
  
        dob = new JLabel("DOB :"); 
        dob.setFont(new Font("Verdana", Font.PLAIN, 20)); 
        dob.setSize(100, 30); 
        dob.setLocation(100, 250); 
        c.add(dob); 
  
        date = new JComboBox(dates); 
        date.setFont(new Font("Verdana", Font.PLAIN, 15)); 
        date.setSize(50, 30); 
        date.setLocation(250, 250); 
        c.add(date); 
  
        month = new JComboBox(months); 
        month.setFont(new Font("Verdana", Font.PLAIN, 15)); 
        month.setSize(60, 30); 
        month.setLocation(300, 250); 
        c.add(month); 
  
        year = new JComboBox(years); 
        year.setFont(new Font("Verdana", Font.PLAIN, 15)); 
        year.setSize(70, 30); 
        year.setLocation(360, 250); 
        c.add(year); 
        
        
        nationality = new JLabel("Nationality :"); 
        nationality.setFont(new Font("Verdana", Font.PLAIN, 20)); 
        nationality.setSize(180, 30); 
        nationality.setLocation(100, 300); 
        c.add(nationality); 
  
        tnationality = new JTextField(); 
        tnationality.setFont(new Font("Verdana", Font.PLAIN, 15)); 
        tnationality.setSize(200, 30); 
        tnationality.setLocation(250, 300); 
        c.add(tnationality); 
        
        add = new JLabel("Address :"); 
        add.setFont(new Font("Verdana", Font.PLAIN, 20)); 
        add.setSize(100, 30); 
        add.setLocation(100, 350); 
        c.add(add); 
  
        tadd = new JTextArea(); 
        tadd.setFont(new Font("Verdana", Font.PLAIN, 15)); 
        tadd.setSize(200, 75); 
        tadd.setLocation(250, 350); 
        tadd.setLineWrap(true); 
        Border border = BorderFactory.createLineBorder(Color.gray);
        tadd.setBorder(BorderFactory.createCompoundBorder(border, 
              BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        c.add(tadd); 
        
        
        email = new JLabel("Email :"); 
        email.setFont(new Font("Verdana", Font.PLAIN, 20)); 
        email.setSize(150, 30); 
        email.setLocation(100, 450); 
        c.add(email); 
  
        temail = new JTextField(emaild); 
        temail.setFont(new Font("Verdana", Font.PLAIN, 15)); 
        temail.setSize(200, 30); 
        temail.setLocation(250, 450); 
        c.add(temail); 
        
        
        linkedin = new JLabel("Linkedin ID :"); 
        linkedin.setFont(new Font("Verdana", Font.PLAIN, 20)); 
        linkedin.setSize(150, 30); 
        linkedin.setLocation(100, 500); 
        c.add(linkedin); 
  
        tlinkedin = new JTextField(); 
        tlinkedin.setFont(new Font("Verdana", Font.PLAIN, 15)); 
        tlinkedin.setSize(200, 30); 
        tlinkedin.setLocation(250, 500); 
        c.add(tlinkedin); 
        
        
        Qualifications = new JLabel("Education :"); 
        Qualifications.setFont(new Font("Verdana", Font.PLAIN, 20)); 
        Qualifications.setSize(150, 30); 
        Qualifications.setLocation(100, 550); 
        c.add(Qualifications); 
  
        tqualification1 = new JTextField("degree/diploma..."); 
        tqualification1.setFont(new Font("Verdana", Font.PLAIN, 15)); 
        tqualification1.setSize(100, 30); 
        tqualification1.setLocation(250, 550); 
        c.add(tqualification1); 
        tqualification11 = new JTextField("year"); 
        tqualification11.setFont(new Font("Verdana", Font.PLAIN, 15)); 
        tqualification11.setSize(100, 30); 
        tqualification11.setLocation(350, 550); 
        c.add(tqualification11); 
        tqualification2 = new JTextField("University name..."); 
        tqualification2.setFont(new Font("Verdana", Font.PLAIN, 15)); 
        tqualification2.setSize(250, 30); 
        tqualification2.setLocation(450, 550); 
        c.add(tqualification2); 
        tqualification3 = new JTextField("class 12 education..."); 
        tqualification3.setFont(new Font("Verdana", Font.PLAIN, 15)); 
        tqualification3.setSize(100, 30); 
        tqualification3.setLocation(250, 600); 
        c.add(tqualification3); 
        tqualification31 = new JTextField("year..."); 
        tqualification31.setFont(new Font("Verdana", Font.PLAIN, 15)); 
        tqualification31.setSize(100, 30); 
        tqualification31.setLocation(350, 600); 
        c.add(tqualification31); 
        tqualification4 = new JTextField("school name..."); 
        tqualification4.setFont(new Font("Verdana", Font.PLAIN, 15)); 
        tqualification4.setSize(250, 30); 
        tqualification4.setLocation(450, 600); 
        c.add(tqualification4);
        
        
        careerobj = new JLabel("Career Objective :"); 
        careerobj.setFont(new Font("Verdana", Font.PLAIN, 20)); 
        careerobj.setSize(200, 30); 
        careerobj.setLocation(650, 100); 
        c.add(careerobj); 
  
        tcareerobj = new JTextArea(""); 
        tcareerobj.setFont(new Font("Verdana", Font.PLAIN, 15)); 
        tcareerobj.setSize(290, 100); 
        tcareerobj.setLocation(880, 100); 
        tcareerobj.setLineWrap(true); 
      
        tcareerobj.setBorder(BorderFactory.createCompoundBorder(border, 
              BorderFactory.createEmptyBorder(7, 7, 7, 7)));
        c.add(tcareerobj); 
        
        
        Experience = new JLabel("Experience :"); 
        Experience.setFont(new Font("Verdana", Font.PLAIN, 20)); 
        Experience.setSize(150, 30); 
        Experience.setLocation(700, 230); 
        c.add(Experience); 
  
        texper = new JTextArea("write in bulleted points.."); 
        texper.setFont(new Font("Verdana", Font.PLAIN, 15)); 
        texper.setSize(290, 160); 
        texper.setLocation(880, 230); 
        texper.setLineWrap(true); 
      
        texper.setBorder(BorderFactory.createCompoundBorder(border, 
              BorderFactory.createEmptyBorder(7, 7, 7, 7)));
        c.add(texper); 
        
        
        Hobbies = new JLabel("Skills :"); 
        Hobbies.setFont(new Font("Verdana", Font.PLAIN, 20)); 
        Hobbies.setSize(100, 30); 
        Hobbies.setLocation(750, 420); 
        c.add(Hobbies); 
  
        thobbies = new JTextArea(); 
        thobbies.setFont(new Font("Verdana", Font.PLAIN, 15)); 
        thobbies.setSize(290, 100); 
        thobbies.setLocation(880, 420); 
        thobbies.setLineWrap(true); 
      
        thobbies.setBorder(BorderFactory.createCompoundBorder(border, 
              BorderFactory.createEmptyBorder(7, 7, 7, 7)));
        c.add(thobbies); 
        
        training = new JLabel("Training :"); 
        training.setFont(new Font("Verdana", Font.PLAIN, 20)); 
        training.setSize(100, 30); 
        training.setLocation(730, 540); 
        c.add(training); 
  
        ttraining = new JTextArea("Training/Certification"); 
        ttraining.setFont(new Font("Verdana", Font.PLAIN, 15)); 
        ttraining.setSize(290, 100); 
        ttraining.setLocation(880, 540); 
        ttraining.setLineWrap(true); 
      
        ttraining.setBorder(BorderFactory.createCompoundBorder(border, 
              BorderFactory.createEmptyBorder(7, 7, 7, 7)));
        c.add(ttraining); 
  
        sub = new JButton("Submit"); 
        sub.setFont(new Font("Verdana", Font.PLAIN, 15)); 
        sub.setSize(100, 30); 
        sub.setLocation(970, 650); 
        sub.addActionListener(this); 
        c.add(sub); 
  
        reset = new JButton("Reset"); 
        reset.setFont(new Font("Verdana", Font.PLAIN, 15)); 
        reset.setSize(100, 30); 
        reset.setLocation(1130, 650); 
        reset.addActionListener(this); 
        c.add(reset); 
  
      
        res = new JLabel(""); 
        res.setFont(new Font("Verdana", Font.PLAIN, 20)); 
        res.setSize(500, 25); 
        res.setLocation(100, 650); 
        c.add(res); 
  
      
  
        setVisible(true); 
        
    } 
  
    // method actionPerformed() 
    // to get the action performed 
    // by the user and act accordingly 
    public void actionPerformed(ActionEvent e) 
    { 
        if (e.getSource() == sub) { 
 
                String data1; 
                String data 
                    = "Personal Information :-\n\n"+"Name : "
                      + tname.getText() + "\n"
                      + "Mobile : "
                      + tmno.getText() + "\n"; 
                if (male.isSelected()) 
                    data1 = "Gender : Male"
                            + "\n"; 
                else
                    data1 = "Gender : Female"
                            + "\n"; 
                String data2 
                    = "DOB : "
                      + (String)date.getSelectedItem() 
                      + "/" + (String)month.getSelectedItem() 
                      + "/" + (String)year.getSelectedItem() 
                      + "\n"+"Nationality : "+tnationality.getText()+"\n"; 
  
                String data3 = "Address : " + tadd.getText() + "\n" + "Email : " + temail.getText()+ "\n" + "Linkedin ID :" + tlinkedin.getText()+"\n\n\n"; 
                String data4 = "Education :-\n\n1. "+tqualification11.getText()+"\n"+ tqualification1.getText() + " , " +tqualification2.getText() + "\n2. " + tqualification31.getText()+"\n"+ tqualification3.getText()+" , "+ tqualification4.getText()+"\n\n\n";
                String data5 = "Experience :-\n\n"+texper.getText()+"\n\n\n";
                String data6 = "Skills:-\n\n"+ thobbies.getText();
                String obj = tcareerobj.getText();
                String train = "Training/Certification :-\n\n "+ttraining.getText()+"\n\n\n";
                res.setText("Resume Build Successfully.."); 
          
              try {

                  OutputStream file = new FileOutputStream(new File(tname.getText()+"resume.pdf"));
    	          Document document = new Document();
    	          PdfWriter.getInstance(document, file);
    			     
    			    
    			 //Inserting List in PDF
    				      List list=new List(true,30);
    			          list.add(new ListItem(data+data1+data2+data3+"\n"));
    				      list.add(new ListItem(data4+"\n"));
    				      list.add(new ListItem(data5+"\n"));
    				      list.add(new ListItem(train+"\n"));
    				      list.add(new ListItem(data6));
    				      
    				      Paragraph preface = new Paragraph("RESUME"); 
    				      preface.setAlignment(Element.ALIGN_CENTER);

    			 //Now Insert Every Thing Into PDF Document
    		         document.open();//PDF document opened........			      

    					document.add(Chunk.NEWLINE);  
    	                document.add(preface);
    					document.add(Chunk.NEWLINE);   
    					document.add(Chunk.NEWLINE);
    					
    					document.add(new Paragraph(obj));
    					document.add(Chunk.NEWLINE);
    					document.add(Chunk.NEWLINE);
    					document.add(list);            

    		            document.close();

    			        file.close();

                System.out.println("Pdf created successfully..");
                JOptionPane.showMessageDialog(rootPane,"Success");

            } catch (Exception e1) {
                e1.printStackTrace();
                JOptionPane.showMessageDialog(rootPane,"error");
            }
        }
    
  
        else if (e.getSource() == reset) { 
            String def = "";
            temail.setText(def);
            tname.setText(def); 
            tadd.setText(def); 
            tmno.setText(def); 
            res.setText(def); 
            date.setSelectedIndex(0); 
            month.setSelectedIndex(0); 
            year.setSelectedIndex(0); 
            tqualification1.setText(def);
            tqualification2.setText(def);
            tqualification3.setText(def);
            tqualification4.setText(def);
            texper.setText(def);
            thobbies.setText(def);
            tcareerobj.setText(def);
            ttraining.setText(def);
            tnationality.setText(def);
            tlinkedin.setText(def);
            tqualification11.setText(def);
            tqualification31.setText(def);
            
        } 
    }
    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingExample frame = new SwingExample("fullname","phone number","email");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
    
} 
  

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package chat;

import static chat.chat_client.dis;
import static chat.chat_client.dout;
import static chat.chat_client.msg_area;
import static chat.chat_client.s;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

/**
 *
 * @author Manish
 */
public class ChatBot extends javax.swing.JFrame {

    /**
     * Creates new form ChatBot
     */
    public ChatBot() {
        initComponents();
        this.setLocationRelativeTo(null);
         this.getContentPane().setBackground(Color.orange);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        bot1 = new javax.swing.JTextArea();

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Send");
        jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton1MouseMoved(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("ChatBot");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("      X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        bot1.setColumns(20);
        bot1.setRows(5);
        jScrollPane4.setViewportView(bot1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(205, 205, 205))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        
       
        
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        String gtext = jTextField1.getText();
        jTextArea1.append("                                                                                      You: " + gtext + "\n\n");
        jTextField1.setText("");
        //jTextArea1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
      


       
        
        if(gtext.contains("Hi"))
        {
            bot("Hello How you doing.... 👋");
            
        }
        else if(gtext.contains("Hello"))
        {
            bot("Welcome... Good to see you ");
            
        }
        else if(gtext.contains("hi"))
        {
            bot("Hi please ask your questions");
            
        }
        else if(gtext.contains("hello"))
        {
            bot("Its a pleasure to meet you");
            
        }
        
        else if(gtext.contains("KCET"))
        {
            bot("\nMaterials required to fill K C E T form are:\n\n"
                    + "First: " + "your Adhaar card\n\n" + "Second: " + "Your Caste Certificate\n\n"
            + "Third: " + "Your Income Certificate\n\n" + "Fourth: " + "Your 10th Marks card\n\n" + "Fifth: " + "Your Photo      \nscanned image of your thumb impression     \nscanned image of your signature     \nand your parents signature");
        }
        
        else if(gtext.contains("How to fill KCET form"))
        {
            bot("\nMaterials required to fill K C E T form are:\n\n"
                    + "First: " + "your Adhaar card\n\n" + "Second: " + "Your Caste Certificate\n\n"
            + "Third: " + "Your Income Certificate\n\n" + "Fourth: " + "Your 10th Marks card\n\n" + "Fifth: " + "Your Photo      \nscanned image of your thumb impression     \nscanned image of your signature     \nand your parents signature");
        }
        else if(gtext.contains("What are needed to fill KCET form"))
        {
            bot("\nMaterials required to fill K C E T form are:\n\n"
                    + "First: " + "your Adhaar card\n\n" + "Second: " + "Your Caste Certificate\n\n"
            + "Third: " + "Your Income Certificate\n\n" + "Fourth: " + "Your 10th Marks card\n\n" + "Fifth: " + "Your Photo      \nscanned image of your thumb impression     \nscanned image of your signature     \nand your parents signature");
        }
        else if(gtext.contains("Tell me about kcet"))
        {
            bot("Karnataka Common Entrance Test, also known as K C E T, \nis a state-level entrance exam conducted by \nKarnatakaa Examination Authority (K E A). \nThis entrance exam is organised to provide \neeligible candidates admission to \ndifferent undergraduate courses in Karnatakaa.");
            bot("Do you want further details about K C E T ?");
        }
//         else if(gtext.contains("Yes"))
//        {
//            bot("\nMaterials required to fill K C E T form are:\n\n"
//                    + "First: " + "your Adhaar card\n\n" + "Second: " + "Your Caste Certificate\n\n"
//            + "Third: " + "Your Income Certificate\n\n" + "Fourth: " + "Your 10th Marks card\n\n" + "Fifth: " + "Your Photo"+ "\n"+     "scanned image of your thumb impression" + "\n" +  "scanned image of your signature" +     "\n" + "and your parents signature");
//        }
         else if(gtext.contains("Thank you")|| gtext.contains("No"))
         {
             bot("Please see through our Student Assistant for your further help");
         }
       
        
         else if(gtext.contains("Yes"))
                {
                    bot(" Following are some topics I can help you with :\n" + "\n"+ "\t Eligibility Criteria\n"
                          + "\n"  +"\t K C E T form important dates\n"+"\n" +"\t How to fill the form\n"+"\n" +"\t Details required for K C E T form filling\n"
                    +"\n" +"\t Documents required for the form\n"+"\n" +"\t Document specification\n");
                    
                }
                else if(gtext.equalsIgnoreCase("what is kcet")) {
                    bot("  Karnataka Common Entrance Test commonly known as KCET is regulated by Karnataka Examination Authority (KEA). "
                            + "It is conducted for admission to professional courses like Engineering Technology, Bachelor of Pharmacy (BPharma), "
                            + "Diploma in Pharmacy (DPharma), Agriculture courses (Farm Science) and Veterinary courses. Candidates who"
                            + " desire to take admission to Medical or Dental or Ayurveda or Unani or Homoeopathy courses must qualify"
                            + " National Eligibility cum Entrance Test (NEET) exam whereas candidates seeking admission to Architecture "
                            + "course through KCET 2021 must have qualified JEE Main Paper-2 or NATA to participate in KCET counselling.");
                }
                
                else if(gtext.contains("date")&&gtext.contains("kcet")){
                    bot("  Here are some important dates to keep in mind:\n"
                    +"  Application form release date \t\t 2nd week of June 2022\n"
                    +" Last date to submit the form \t\t 2nd week of July 2022\n"
                    +" Last date to pay the application fee \t 2nd week of July 2022\n"
                    +" Application correction \t\t 1st week of August 2022\n"
                    +" Hall ticket release date \t\t 2nd week of August 2022\n"
                    +" KCET new exam date \t\t 4th week of August 2022\n"
                    +" Answer Key release date \t\t 1st week of September 2022\n"
                    +" Result declaration date \t\t 2nd week of September 2022\n\n"
                    +"  For more details or change in dates visit their website - http://kea.kar.nic.in/");
                    
                }
                else if(gtext.contains("how") && gtext.contains("fill") && gtext.contains("form")){
                    bot("  The first step of applying for the test is KCET registration followed by filling the application form,"
                     + " payment of fee, uploading documents, and submission of the application form. After submitting the KCET 2022 "
                     + "online application form, the printout has to be attested by the Principal of their school or any Gazetted "
                     + "Officer. Candidates will need the attested KCET registration form during the counselling session.");
                   
                }
        else if(gtext.contains("What is Eligibility criteria")){
                   bot("\n1. Second P U C passed or waiting for result in 2022\n" +
                 "2. Compulsory subjects in second P U C are -\n" +
                        "    English, Physics, Maths");
                   
                }
                 else if(gtext.contains("documents") && gtext.contains("required")){
                    bot(" Applicants are advised to keep some documents ready before"
                    + " filling the KCET 2022 application form. The below documents are required for KCET Application 2022:\n"
                    + "  1. Valid mobile number and email ID\n"
                    +" 2. Debit card/Credit card/Net banking details\n"
                    +" 3. Details of Aadhaar card\n"
                    +" 4. Scanned images of signature, photograph, and left-hand thumb impression as per specifications by the authority.\n"
                    +"  5. Scanned images of the left thumb impression/ signature of the applicant’s parent.\n"
                    +" 6. Education documents (10th and 12th class mark sheets)");
                         
                }
               else if(gtext.contains("document")&&(gtext.contains("specifications")||gtext.contains("size"))){
                 bot("Photo (colour photo with white background) - 5-40 KB\n" +
                 "Signature (blue/black ink) - 5-40 KB\n" +
                 "Left thumb impression of student and parent or guardian - 5-40 KB");
 
               } 
               else if(gtext.contains("details")&& gtext.contains("to be filled"))
                {
                    bot("        Personal Details\n"
                    +"        1.	Nationality\n" +
                    "        2.	Mother Tongue\n" +
                    "        3.	Religion\n" +
                    "        4.	Annual Income of the Family (in Rs.)\n" +
                    "        5.	Reservation Category\n" +
                    "        6.	Caste Name\n" +
                    "        7.	Caste/Category/Income Certificate Number (if applicable)\n" +
                    "        8.	Caste List of OBC/SC/ST Category (if applicable)\n" +
                    "        9.	Select eligibility clause code\n" +
                    "        10.	Exam Centres (in order of preference)\n" +
                    "        11.	Details of Qualifying Exam like\n" +
                    "        o	University/Board Name,\n" +
                    "        o	School Name (if Karnataka CBSE/CISCE),\n" +
                    "        o	Whether the candidate is appearing for Karnataka 2nd PUC Annual Examination 2018 (Science)\n" +
                    "        o	PUC Student Number (if applicable)\n" +
                    "        12.	Year of Passing (if applicable)\n" +
                    "        13.	Eligibility to Claim Reservation.\n" +
                    "        14.	Total Number of years of study that the candidates has completed studying in Karnataka (From 1st to 12th standard)\n" +
                    "        15.	Whether the candidate has studied in Rural Area of Karnataka from 1st to 10th standard.\n" +
                    "        16.	Whether the candidate has studied in Kannada Medium from 1st to 10th standard.\n" +
                    "        Contact Details \n" +
                    "        1.	Address\n" +
                    "        2.	Name of District\n" +
                    "        3.	State\n" +
                    "        4.	Pin Code\n" +
                    "        5.	Taluk\n" +
                    "        6.	Phone Number\n" +
                    "        7.	Has the candidate studied 10th standard in Karnataka or not?\n" +
                    "        8.	State from where the candidate has appeared for 12th standard examination\n" +
                    "        9.	District where the applicant appeared for Class 12 exam (if Karnataka)\n" +
                    "        10.	Native State\n" +
                    "        11.	Native District (if Karnataka)\n" +
                    "        12.	Whether the applicant is the son or daughter of a migrant from Jammu & Kashmir\n" +
                    "        13.	Whether the candidate is claiming for reservation\n" +
                    "        Previous KCET details(if applicable)\n" +
                    "        1.	Whether the candidate has previously appeared for the KCET exam\n" +
                    "        2.	Year of Appearing\n" +
                    "        3.	KCET Application Number\n" +
                    "        4.	Whether the candidate has obtained any seat through KCET and taken admission to college\n" +
                    "        Educational details\n" +
                    "        1.	Name of the school/college that the candidate has attended\n" +
                    "        2.	Year of Passing\n" +
                    "        3.	Classes that the candidate has studied in that particular School\n" +
                    "        4.	Year-wise duration of the candidate’s study.\n\n");
                }
//               else if((!gtext.contains("Hi")||!gtext.contains("Hello")||!gtext.contains("hi")||!gtext.contains("hello"))
//                       ||(!gtext.contains("kcet")||!gtext.contains("KCET"))
//                       ||(!gtext.contains("date")&&!gtext.contains("kcet"))
//                       ||(!gtext.contains("how") && !gtext.contains("fill") && !gtext.contains("form"))
//                       ||(!gtext.contains("eligibility") || !gtext.contains("criteria"))
//                       ||(!gtext.contains("documents") && !gtext.contains("required"))
//                       ||(!gtext.contains("document")&&(!gtext.contains("specifications")||!gtext.contains("size")))
//                       ||(!gtext.contains("details")&& !gtext.contains("to be filled")))
//                   bot("  I am unable to understand your question. Please refer to the topics mentioned in the start.\n" +
//                            "  If you have any other queries apart from the topics mentioned, let us know through the Ask any queries section");
//                
   
    
               else
        {
            int rand = (int) (Math.random() * 3 + 1);
            if(rand == 1)
            {
            bot("I am not able to understand you");
            }
            else if(rand == 2)
            {
                bot("Please come again");
            }
             else if(rand == 3)
            {
                bot("Can you please specify the point once again");
            }
        }
    }
    
    private void bot(String string)
    {
        jTextArea1.append("Bot: " + string + "\n\n");
        jTextArea1.setFont(new Font("Serif", Font.ITALIC, 16));
        
        jTextArea2.append(string);
        
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        this.setVisible(false);
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseMoved
       
          Voice voice;
        
        VoiceManager vm = VoiceManager.getInstance();
        
        voice = vm.getVoice("kevin16");
        voice.setRate(150);//Setting the rate of the voice
        voice.setPitch(100);//Setting the Pitch of the voice
        voice.setVolume(1);
       
       // SpeakText(vm);
        
        voice.allocate();
        
        voice.speak(jTextArea2.getText());
        
        //Setting the volume of the voice
        //// Calling speak() method
         jTextArea2.setText("");
        
    }//GEN-LAST:event_jButton1MouseMoved

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChatBot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatBot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatBot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatBot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatBot().setVisible(true);
            }
        });
        
            
        try
        {
            String msgin="";
            s = new Socket("127.0.0.1",1200);
            dis = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());
            
            while(!msgin.equals("exit"))
            {
                msgin = dis.readUTF();
                msg_area.setText(msg_area.getText()+"\n Server :" + msgin);
            }
        }
        
        catch(Exception e)
        {
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea bot1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void SpeakText(VoiceManager vm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
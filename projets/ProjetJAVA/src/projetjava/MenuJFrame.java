/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import projetjava.donateur;
import java.awt.Color;
import projetjava.Requestframe;

/**
 *
 * @author Admin
 */
public class MenuJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MenuJFrame
     */
    public MenuJFrame() {
        setResizable(false);
        setLocation(350,20);
        this.setTitle("Menu");
        initComponents();
    }
    
    public MenuJFrame(String right) {
        setResizable(false);
        setLocation(350,60);
        this.setTitle("Menu");
        initComponents();
        if(right.equals("User")){
            members.setVisible(false);
            users.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        users = new javax.swing.JLabel();
        members = new javax.swing.JLabel();
        donators = new javax.swing.JLabel();
        receivers = new javax.swing.JLabel();
        articles = new javax.swing.JLabel();
        request = new javax.swing.JLabel();
        deposit = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        statistics = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(670, 600));
        setPreferredSize(new java.awt.Dimension(400, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        users.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        users.setForeground(new java.awt.Color(255, 255, 255));
        users.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        users.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetjava/user_icon-icons.png"))); // NOI18N
        users.setText("USERS");
        users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usersMouseExited(evt);
            }
        });
        jPanel1.add(users, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 110, -1));

        members.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        members.setForeground(new java.awt.Color(255, 255, 255));
        members.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        members.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetjava/3592853-align-employee-general-human-human-list-list-member_107786.png"))); // NOI18N
        members.setText("MEMBERS");
        members.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                membersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                membersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                membersMouseExited(evt);
            }
        });
        jPanel1.add(members, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 150, -1));

        donators.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        donators.setForeground(new java.awt.Color(255, 255, 255));
        donators.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        donators.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetjava/iconfinder-7-avatar-2754582_120519.png"))); // NOI18N
        donators.setText("DONATORS");
        donators.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                donatorsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                donatorsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                donatorsMouseExited(evt);
            }
        });
        jPanel1.add(donators, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 150, -1));

        receivers.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        receivers.setForeground(new java.awt.Color(255, 255, 255));
        receivers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        receivers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetjava/users_icon-icons.com_57999.png"))); // NOI18N
        receivers.setText("RECEIVERS");
        receivers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                receiversMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                receiversMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                receiversMouseExited(evt);
            }
        });
        jPanel1.add(receivers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 150, 30));

        articles.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        articles.setForeground(new java.awt.Color(255, 255, 255));
        articles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        articles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetjava/business_table_order_report_history_2332.png"))); // NOI18N
        articles.setText("ARTICLES");
        articles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                articlesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                articlesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                articlesMouseExited(evt);
            }
        });
        jPanel1.add(articles, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 140, -1));

        request.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        request.setForeground(new java.awt.Color(255, 255, 255));
        request.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        request.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetjava/diagram-61_24456.png"))); // NOI18N
        request.setText("REQUEST");
        request.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requestMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                requestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                requestMouseExited(evt);
            }
        });
        jPanel1.add(request, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 130, -1));

        deposit.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        deposit.setForeground(new java.awt.Color(255, 255, 255));
        deposit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deposit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetjava/iconfinder-7-avatar-2754582_120519.png"))); // NOI18N
        deposit.setText("DEPOSIT-SALE");
        deposit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depositMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                depositMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                depositMouseExited(evt);
            }
        });
        jPanel1.add(deposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 180, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetjava/worldmap_78386.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 180, 130));

        statistics.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        statistics.setForeground(new java.awt.Color(255, 255, 255));
        statistics.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statistics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetjava/6_icon-icons.com_68891.png"))); // NOI18N
        statistics.setText("STATISTICS");
        statistics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statisticsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                statisticsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                statisticsMouseExited(evt);
            }
        });
        jPanel1.add(statistics, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 160, -1));

        logout.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetjava/systemshutdown_103390.png"))); // NOI18N
        logout.setText("LOG OUT");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 140, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetjava/f093cd70b800d01d14a4922eb0022e21.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 580));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetjava/ddb2b9a2092613846482830a0f6f1030--concrete-houses-minimalism.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 420, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, -1, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        // TODO add your handling code here:
        logout.setForeground(Color.WHITE);
    }//GEN-LAST:event_logoutMouseExited

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        // TODO add your handling code here:
        logout.setForeground(Color.PINK);
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        dispose();
        new LoginJFrame().setVisible(true);
    }//GEN-LAST:event_logoutMouseClicked

    private void statisticsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statisticsMouseExited
        // TODO add your handling code here:
        statistics.setForeground(Color.WHITE);
    }//GEN-LAST:event_statisticsMouseExited

    private void statisticsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statisticsMouseEntered
        // TODO add your handling code here:
        statistics.setForeground(Color.PINK);
    }//GEN-LAST:event_statisticsMouseEntered

    private void statisticsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statisticsMouseClicked
        // TODO add your handling code here:
        dispose();
        new Statistic().setVisible(true);
    }//GEN-LAST:event_statisticsMouseClicked

    private void depositMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositMouseExited
        // TODO add your handling code here:
        deposit.setForeground(Color.WHITE);
    }//GEN-LAST:event_depositMouseExited

    private void depositMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositMouseEntered
        // TODO add your handling code here:
        deposit.setForeground(Color.PINK);
    }//GEN-LAST:event_depositMouseEntered

    private void depositMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositMouseClicked
        // TODO add your handling code here:
        new Deposit().setVisible(true);
        dispose();
    }//GEN-LAST:event_depositMouseClicked

    private void requestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestMouseExited
        // TODO add your handling code here:
        request.setForeground(Color.WHITE);
    }//GEN-LAST:event_requestMouseExited

    private void requestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestMouseEntered
        // TODO add your handling code here:
        request.setForeground(Color.PINK);
    }//GEN-LAST:event_requestMouseEntered

    private void articlesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_articlesMouseExited
        // TODO add your handling code here:
        articles.setForeground(Color.WHITE);
    }//GEN-LAST:event_articlesMouseExited

    private void articlesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_articlesMouseEntered
        // TODO add your handling code here:
        articles.setForeground(Color.PINK);
    }//GEN-LAST:event_articlesMouseEntered

    private void receiversMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receiversMouseExited
        // TODO add your handling code here:
        receivers.setForeground(Color.WHITE);
    }//GEN-LAST:event_receiversMouseExited

    private void receiversMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receiversMouseEntered
        // TODO add your handling code here:
        receivers.setForeground(Color.PINK);
    }//GEN-LAST:event_receiversMouseEntered

    private void donatorsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donatorsMouseExited
        // TODO add your handling code here:
        donators.setForeground(Color.WHITE);
    }//GEN-LAST:event_donatorsMouseExited

    private void donatorsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donatorsMouseEntered
        // TODO add your handling code here:
        donators.setForeground(Color.PINK);
    }//GEN-LAST:event_donatorsMouseEntered

    private void donatorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donatorsMouseClicked
        // TODO add your handling code here:
        dispose();
        new donateur().setVisible(true);
    }//GEN-LAST:event_donatorsMouseClicked

    private void membersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_membersMouseExited
        // TODO add your handling code here:
        members.setForeground(Color.WHITE);
    }//GEN-LAST:event_membersMouseExited

    private void membersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_membersMouseEntered
        // TODO add your handling code here:
        members.setForeground(Color.PINK);
    }//GEN-LAST:event_membersMouseEntered

    private void membersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_membersMouseClicked
        // TODO add your handling code here:
        new Members().setVisible(true);
        dispose();
    }//GEN-LAST:event_membersMouseClicked

    private void usersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseExited
        // TODO add your handling code here:
        users.setForeground(Color.WHITE);
    }//GEN-LAST:event_usersMouseExited

    private void usersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseEntered
        // TODO add your handling code here:
        users.setForeground(Color.PINK);
    }//GEN-LAST:event_usersMouseEntered

    private void usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseClicked
        new UsersJFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_usersMouseClicked

    private void articlesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_articlesMouseClicked
        // TODO add your handling code here:
        new Article().setVisible(true);
        dispose();
    }//GEN-LAST:event_articlesMouseClicked

    private void receiversMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receiversMouseClicked
        // TODO add your handling code here:
        new Receivers().setVisible(true);
        dispose();
    }//GEN-LAST:event_receiversMouseClicked

    private void requestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestMouseClicked
        // TODO add your handling code here:
        new Requestframe().setVisible(true);
        dispose();
    }//GEN-LAST:event_requestMouseClicked

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
            java.util.logging.Logger.getLogger(MenuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel articles;
    private javax.swing.JLabel deposit;
    private javax.swing.JLabel donators;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel members;
    private javax.swing.JLabel receivers;
    private javax.swing.JLabel request;
    private javax.swing.JLabel statistics;
    private javax.swing.JLabel users;
    // End of variables declaration//GEN-END:variables
}
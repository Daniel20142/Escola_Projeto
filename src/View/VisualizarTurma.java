package View;

import Model.DAO.AlunoDAO;
import Model.bean.Aluno;
import Model.bean.Turma;
import Model.bean.Usuario;
import java.util.List;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class VisualizarTurma extends javax.swing.JFrame {
    
    public Turma t ;
    public Usuario u ;
    private List<Aluno> listAluno = null;
    /**
     * Creates new form VisualizarTurma
     * @param t
     * @param u
     */
    public VisualizarTurma(Turma t, Usuario u) {   
        initComponents();
        this.t = t;
        this.u = u;
        loadAlunosJTable();
        jLabelSelAno.setText("Ano: "+this.t.getAno());
        jLabelSelDisciplina.setText("Disciplina: "+this.t.getDisc_nome());
        jLabelSelTurma.setText("Série: "+this.t.getSerie());
        jLabelSelTurno.setText("Turno: "+this.t.getTurno());
        jLabelSelSala.setText("Sala: "+this.t.getSala());
        jLabelSelProfessor.setText("Professor(a): "+this.u.getNome());
    }
    
    public VisualizarTurma() {        
        initComponents();                       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelSelTurma = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlunos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabelSelTurno = new javax.swing.JLabel();
        jLabelSelSala = new javax.swing.JLabel();
        jLabelSelAno = new javax.swing.JLabel();
        jLabelSelDisciplina = new javax.swing.JLabel();
        jCadastrarNotaBtn = new javax.swing.JButton();
        jLabelSelProfessor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabelSelTurma.setText("Turma");

        jTableAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº Chamada", "Nome Completo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAlunos.setColumnSelectionAllowed(true);
        jTableAlunos.setIntercellSpacing(new java.awt.Dimension(2, 2));
        jTableAlunos.setRowHeight(20);
        jTableAlunos.setRowMargin(2);
        jTableAlunos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTableAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAlunos);
        jTableAlunos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTableAlunos.getColumnModel().getColumnCount() > 0) {
            jTableAlunos.getColumnModel().getColumn(0).setMinWidth(100);
            jTableAlunos.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTableAlunos.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Clique duas vezes sobre um aluno para visualizar as informações referentes ao mesmo");

        jLabelSelTurno.setText("Turno");

        jLabelSelSala.setText("Sala");

        jLabelSelAno.setText("Ano");

        jLabelSelDisciplina.setText("Disciplina");

        jCadastrarNotaBtn.setText("Cadastrar Nota");
        jCadastrarNotaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarNotaBtnActionPerformed(evt);
            }
        });

        jLabelSelProfessor.setText("Professor(a)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelSelTurno)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelSelTurma)
                                .addGap(107, 107, 107)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelSelSala)
                                    .addComponent(jLabelSelAno))
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelSelProfessor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jCadastrarNotaBtn))
                                    .addComponent(jLabelSelDisciplina))))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSelTurma)
                    .addComponent(jLabelSelSala)
                    .addComponent(jLabelSelDisciplina))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSelTurno)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelSelAno, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCadastrarNotaBtn)
                        .addComponent(jLabelSelProfessor)))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCadastrarNotaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarNotaBtnActionPerformed
        int selIndex = jTableAlunos.getSelectedRow();        
        if(selIndex>=0){
            Notas nt = new Notas(listAluno.get(selIndex),u,t);
            nt.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"Selecione um aluno para cadastra uma nota");
        }
    }//GEN-LAST:event_jCadastrarNotaBtnActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void jTableAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlunosMouseClicked
        if (evt.getClickCount() > 1) {
            int selIndex = jTableAlunos.getSelectedRow();
            if(selIndex>=0){
                CadastroAlunos ca = new CadastroAlunos(u,listAluno.get(selIndex));
                ca.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null,"Selecione um aluno para Ver informações");
            }
        }
    }//GEN-LAST:event_jTableAlunosMouseClicked

    
    private void loadAlunosJTable(){
        DefaultTableModel model = (DefaultTableModel) jTableAlunos.getModel();
        AlunoDAO alunoDAO = new AlunoDAO();
        int cont = 0;
        listAluno = alunoDAO.listAlunos(t);
        
        for(Aluno a: listAluno){
            ++cont;
            model.addRow(new Object[]{
                cont,
                a.getNome()
            });
        }    
    }
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VisualizarTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizarTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizarTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizarTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarTurma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCadastrarNotaBtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelSelAno;
    private javax.swing.JLabel jLabelSelDisciplina;
    private javax.swing.JLabel jLabelSelProfessor;
    private javax.swing.JLabel jLabelSelSala;
    private javax.swing.JLabel jLabelSelTurma;
    private javax.swing.JLabel jLabelSelTurno;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAlunos;
    // End of variables declaration//GEN-END:variables
}

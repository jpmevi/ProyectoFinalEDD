/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import CargaDatos.Lexer;
import CargaDatos.Parser;
import Estructuras.ArbolAVL;
import Estructuras.ArbolB.LlaveEntero;
import Estructuras.ListaCircular;
import Estructuras.ListaSimple;
import Main.Main;
import static Main.Main.*;

import Objetos.*;
import java.io.File;
import java.io.FileReader;
import java.io.StringReader;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author meza4
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        setVisible(true);
        pack();
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
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        tipo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, 34));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Usac_logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 18, -1, -1));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Usuario:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 204));
        jButton2.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Usuarios");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 160, 40));

        jButton7.setBackground(new java.awt.Color(255, 255, 204));
        jButton7.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 0));
        jButton7.setText("Estudiantes");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.setFocusPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 160, 40));

        jButton8.setBackground(new java.awt.Color(255, 255, 204));
        jButton8.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 0));
        jButton8.setText("Edificios y Salones");
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.setFocusPainted(false);
        jButton8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 190, 40));

        jButton9.setBackground(new java.awt.Color(255, 255, 204));
        jButton9.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 0));
        jButton9.setText("Cursos");
        jButton9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.setFocusPainted(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 190, 40));

        jButton10.setBackground(new java.awt.Color(255, 255, 204));
        jButton10.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 0, 0));
        jButton10.setText("Asignacion");
        jButton10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.setFocusPainted(false);
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 160, 40));

        jButton11.setBackground(new java.awt.Color(255, 255, 204));
        jButton11.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 0, 0));
        jButton11.setText("Catedraticos");
        jButton11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton11.setFocusPainted(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 190, 40));

        jButton12.setBackground(new java.awt.Color(255, 255, 204));
        jButton12.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 0, 0));
        jButton12.setText("Carga de Datos");
        jButton12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton12.setFocusPainted(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 160, 40));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 27)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Asignacion de cursos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 39, -1, -1));

        user.setFont(new java.awt.Font("Consolas", 1, 17)); // NOI18N
        user.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 251, 21));

        jButton13.setBackground(new java.awt.Color(255, 255, 204));
        jButton13.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        jButton13.setForeground(new java.awt.Color(0, 0, 0));
        jButton13.setText("Horarios");
        jButton13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton13.setFocusPainted(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 190, 40));

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Id:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        id.setFont(new java.awt.Font("Consolas", 1, 17)); // NOI18N
        id.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 251, 21));

        tipo.setFont(new java.awt.Font("Consolas", 1, 17)); // NOI18N
        tipo.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 251, 21));

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Tipo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        user.setText(Main.usuarioActual.getNombre());
        tipo.setText(Main.usuarioActual.getTipo());
        id.setText(String.valueOf(Main.usuarioActual.getId()));
    }//GEN-LAST:event_formComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new CrudUsuarios();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        new CrudEdificios();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        new CrudCursos();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        new CrudCatedraticos();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new CrudEstudiantes();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        new CrudHorario();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.txt", "txt");

        fc.setFileFilter(filtro);
        int seleccion = fc.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fichero = fc.getSelectedFile();
            try {
                FileReader fr = new FileReader(fichero);
                String cadena = "";
                int valor = fr.read();
                while (valor != -1) {
                    cadena += (char) valor;
                    valor = fr.read();
                }

                Parser s = new Parser(new Lexer(new StringReader(cadena)));
                s.parse();
                ArrayList<Estudiante> estudiantesList = s.getEstudiantesList();
                ArrayList<Usuario> usuarioList = s.getUsuarios();
                ArrayList<Edificio> edificiosList = s.getEdificios();
                ArrayList<Salon> salonesList = s.getSalones();
                ArrayList<Catedratico> catedraticosList = s.getCatedratico();
                ArrayList<Curso> cursosList = s.getCursos();
                ArrayList<Horario> horariosList = s.getHorarios();
                ArrayList<Asignacion> asignacionesList = s.getAsignaciones();

                for (int i = 0; i < estudiantesList.size(); i++) {
                    estudiantes.add(estudiantesList.get(i));
                }
                for (int i = 0; i < usuarioList.size(); i++) {
                    if (usuarioList.get(i).getTipo().equals("ESTUDIANTE")) {
                        Estudiante estu = estudiantes.get(usuarioList.get(i).getId());
                        if (estu != null) {
                            listaUsuarios.add(usuarioList.get(i));
                        }
                    } else {
                        listaUsuarios.add(usuarioList.get(i));
                    }
                }
                for (int i = 0; i < edificiosList.size(); i++) {
                    listaEdificios.add(edificiosList.get(i));
                }
                for (int i = 0; i < salonesList.size(); i++) {
                    ListaCircular.Nodo nodo = listaEdificios.buscarNombre(salonesList.get(i).getEdificio());
                    Edificio edif = (Edificio) nodo.getData();
                    ListaSimple salones = edif.getSalones();
                    salones.add(new Salon(salonesList.get(i).getId(), salonesList.get(i).getEstudiantes()));
                }
                for (int i = 0; i < catedraticosList.size(); i++) {
                    catedraticos.insertar(catedraticosList.get(i).getId(), catedraticosList.get(i));
                }
                for (int i = 0; i < cursosList.size(); i++) {
                    listaCursos.add(cursosList.get(i));
                }
                for (int i = 0; i < horariosList.size(); i++) {
                    ListaCircular.Nodo nodo = listaEdificios.buscarNombre(horariosList.get(i).getNombreEdificio());
                    Edificio edif = (Edificio) nodo.getData();
                    ListaSimple salones = edif.getSalones();
                    ListaSimple.Nodo nodosalon = salones.getNode(String.valueOf(horariosList.get(i).getCodigoSalon()));
                    ListaCircular.Nodo nodocurso = listaCursos.buscarId(Integer.valueOf(horariosList.get(i).getCodigoCurso()));
                    ArbolAVL.NodoAVL nodoCatedratico = catedraticos.buscar(String.valueOf(horariosList.get(i).getCodigoCatedratico()));
                    Salon salon = (Salon) nodosalon.getData();
                    Curso curso = (Curso) nodocurso.getData();
                    Catedratico catedratico = (Catedratico) nodoCatedratico.getInfo();
                    Horario horario = new Horario(Integer.valueOf(horariosList.get(i).getCodigo()), horariosList.get(i).getRangoHora(), horariosList.get(i).getDia(), curso, edif, salon, catedratico);
                    horarios.insert(new LlaveEntero(horario.getCodigo()), horario);
                }
                for (int i = 0; i < asignacionesList.size(); i++) {
                    Estudiante estu = estudiantes.get(Integer.valueOf(asignacionesList.get(i).getCodigoEstudiante()));
                    Horario hora=(Horario)horarios.search(new LlaveEntero(Integer.valueOf(asignacionesList.get(i).getCodigoHorario())));
                    if (listaAsignaciones.obtenerAsignacionesSalon(hora.getSalon().getId(), hora.getEdificio().getNombre()) < hora.getSalon().getEstudiantes()) {
                        Asignacion asig = new Asignacion(estu, hora, asignacionesList.get(i).getZona(), asignacionesList.get(i).getNotaFinal());
                        listaAsignaciones.add(asig);
                    }

                }
                JOptionPane.showMessageDialog(null, "Datos cargados con exito");

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton12ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tipo;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}

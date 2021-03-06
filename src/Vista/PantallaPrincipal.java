/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Utilities.Files;
import static Utilities.Files.readFile;
import Utilities.Matrix;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import test.AStar;
import test.BabMatrix;

/**
 *
 * @author Esteban Segura Benavides
 * 
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    // Import ImageIcon     
    ImageIcon pared = new ImageIcon("src/images/pared.png");
    ImageIcon no_pared = new ImageIcon("src/images/no_pared.png");
    ImageIcon pared_solucion = new ImageIcon("src/images/pared_solucion.png");
    ImageIcon no_pared_solucion = new ImageIcon("src/images/no_pared_solucion.png");
    ImageIcon bola_roja = new ImageIcon("src/images/bola_roja.png");
    ImageIcon bola_naranja = new ImageIcon("src/images/bola_naranja.png");
    ImageIcon bola_azul = new ImageIcon("src/images/bola_azul.png");
    ImageIcon bola_amarilla = new ImageIcon("src/images/bola_amarilla.png");
    ImageIcon bola_roja_solucion = new ImageIcon("src/images/bola_roja_solucion.png");
    ImageIcon bola_naranja_solucion = new ImageIcon("src/images/bola_naranja_solucion.png");
    ImageIcon bola_azul_solucion = new ImageIcon("src/images/bola_azul_solucion.png");
    ImageIcon bola_amarilla_solucion = new ImageIcon("src/images/bola_amarilla_solucion.png");
    ImageIcon flecha_izquierda = new ImageIcon("src/images/izquierda.png");
    ImageIcon flecha_izquierda_solucion = new ImageIcon("src/images/izquierda_solucion.png");
    ImageIcon flecha_derecha = new ImageIcon("src/images/derecha.png");
    ImageIcon flecha_derecha_solucion = new ImageIcon("src/images/derecha_solucion.png");
    ImageIcon flecha_arriba = new ImageIcon("src/images/arriba.png");
    ImageIcon flecha_abajo = new ImageIcon("src/images/abajo.png");
    ImageIcon solucion = new ImageIcon("src/images/solution.png");
    ImageIcon download = new ImageIcon("src/images/download2.png");
    ImageIcon upload = new ImageIcon("src/images/upload2.png");
    ImageIcon restartA = new ImageIcon("src/images/restartA.png");
    ImageIcon restartB = new ImageIcon("src/images/restartB.png");
    
    String[][] InMatriz = Matrix.createBabylonMatrix();
    String[][] OutMatriz = Matrix.createBabylonMatrix();
    
    
    //***************************************************************
    List<List<String>> SolutionMatriz = new  ArrayList<List<String>>();
    
    List<List<List<String>>> solucion_completa = new  ArrayList<List<List<String>>>();
    
    int posicion_solucion = 0;
    //***************************************************************
    int spacePosition;
   
    public PantallaPrincipal() {
        initComponents();
       
        jPanelSuperior.setBackground(new Color(0,161,255));
        //jPanelSuperior.setLayout(null);
                
        refreshMatrix();
        refreshMatrixB();
        
        JSeparator verticalSeparator = new JSeparator(JSeparator.VERTICAL);
        verticalSeparator.setBounds(420,59,200,395);
        
        JSeparator horizontalSeparator = new JSeparator(JSeparator.HORIZONTAL);
        horizontalSeparator.setBounds(0, 454, 1240, 1);
        
        JSeparator horizontalSeparator2 = new JSeparator(JSeparator.HORIZONTAL);
        horizontalSeparator2.setBounds(0, 59, 1240, 1);
        
        jPanel1.add(verticalSeparator,BorderLayout.LINE_START);
        jPanel1.add(horizontalSeparator,BorderLayout.LINE_START);
        jPanel1.add(horizontalSeparator2,BorderLayout.LINE_START);
        
        final JScrollPane scroll = new JScrollPane(jPanel1);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(scroll, BorderLayout.CENTER);
        
        jPanel1.add(jPanelSuperior);
        jPanel1.add(jPanelInferior);
        btnGenerarSolucion.setIcon(solucion);
        btnCargarA.setIcon(upload);
        btnCargarB.setIcon(upload);
        btnDescargarA.setIcon(download);
        btnDescargarB.setIcon(download);
        btnDownload.setIcon(download);
        btnRestartA.setIcon(restartA);
        btnRestartB.setIcon(restartB);
        
        
    }
    
    public void actionPerformed(ActionEvent e) {
        int action = Integer.parseInt(e.getActionCommand());

        switch(action) {
        case 1:
                //doSomething
                break;
        case 2: 
                // doSomething;
                break;
        }
    }
    
    public int findSpace(String[][] pMatriz)
    {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if(pMatriz[i][j].equals("0"))
                {
                    return j;
                    
                }
            }
            
        }
        return 0;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jFileChooser2 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        lblA12 = new javax.swing.JLabel();
        lblA11 = new javax.swing.JLabel();
        lblA14 = new javax.swing.JLabel();
        lblA13 = new javax.swing.JLabel();
        lblA21 = new javax.swing.JLabel();
        lblA22 = new javax.swing.JLabel();
        lblA23 = new javax.swing.JLabel();
        lblA24 = new javax.swing.JLabel();
        lblA34 = new javax.swing.JLabel();
        lblA33 = new javax.swing.JLabel();
        lblA32 = new javax.swing.JLabel();
        lblA31 = new javax.swing.JLabel();
        lblA44 = new javax.swing.JLabel();
        lblA43 = new javax.swing.JLabel();
        lblA42 = new javax.swing.JLabel();
        lblA41 = new javax.swing.JLabel();
        lblA51 = new javax.swing.JLabel();
        lblA52 = new javax.swing.JLabel();
        lblA53 = new javax.swing.JLabel();
        lblA54 = new javax.swing.JLabel();
        btnAL1 = new javax.swing.JButton();
        btnAL2 = new javax.swing.JButton();
        btnAL3 = new javax.swing.JButton();
        btnAL4 = new javax.swing.JButton();
        btnAL5 = new javax.swing.JButton();
        btnAR1 = new javax.swing.JButton();
        btnAR2 = new javax.swing.JButton();
        btnAR3 = new javax.swing.JButton();
        btnAR4 = new javax.swing.JButton();
        btnAR5 = new javax.swing.JButton();
        btnAU1 = new javax.swing.JButton();
        btnAU2 = new javax.swing.JButton();
        btnAU3 = new javax.swing.JButton();
        btnAU4 = new javax.swing.JButton();
        btnAD1 = new javax.swing.JButton();
        btnAD2 = new javax.swing.JButton();
        btnAD3 = new javax.swing.JButton();
        btnAD4 = new javax.swing.JButton();
        lblB11 = new javax.swing.JLabel();
        lblB12 = new javax.swing.JLabel();
        lblB14 = new javax.swing.JLabel();
        lblB13 = new javax.swing.JLabel();
        lblB21 = new javax.swing.JLabel();
        lblB22 = new javax.swing.JLabel();
        lblB23 = new javax.swing.JLabel();
        lblB24 = new javax.swing.JLabel();
        lblB34 = new javax.swing.JLabel();
        lblB33 = new javax.swing.JLabel();
        lblB32 = new javax.swing.JLabel();
        lblB31 = new javax.swing.JLabel();
        lblB44 = new javax.swing.JLabel();
        lblB43 = new javax.swing.JLabel();
        lblB42 = new javax.swing.JLabel();
        lblB41 = new javax.swing.JLabel();
        lblB51 = new javax.swing.JLabel();
        lblB52 = new javax.swing.JLabel();
        lblB53 = new javax.swing.JLabel();
        lblB54 = new javax.swing.JLabel();
        btnBL1 = new javax.swing.JButton();
        btnBL2 = new javax.swing.JButton();
        btnBL3 = new javax.swing.JButton();
        btnBL4 = new javax.swing.JButton();
        btnBL5 = new javax.swing.JButton();
        btnBR1 = new javax.swing.JButton();
        btnBR2 = new javax.swing.JButton();
        btnBR3 = new javax.swing.JButton();
        btnBR4 = new javax.swing.JButton();
        btnBR5 = new javax.swing.JButton();
        btnBU1 = new javax.swing.JButton();
        btnBU2 = new javax.swing.JButton();
        btnBU3 = new javax.swing.JButton();
        btnBU4 = new javax.swing.JButton();
        btnBD1 = new javax.swing.JButton();
        btnBD2 = new javax.swing.JButton();
        btnBD3 = new javax.swing.JButton();
        btnBD4 = new javax.swing.JButton();
        lblC11 = new javax.swing.JLabel();
        lblC12 = new javax.swing.JLabel();
        lblC13 = new javax.swing.JLabel();
        lblC14 = new javax.swing.JLabel();
        lblC24 = new javax.swing.JLabel();
        lblC23 = new javax.swing.JLabel();
        lblC22 = new javax.swing.JLabel();
        lblC21 = new javax.swing.JLabel();
        lblC31 = new javax.swing.JLabel();
        lblC32 = new javax.swing.JLabel();
        lblC33 = new javax.swing.JLabel();
        lblC34 = new javax.swing.JLabel();
        lblC44 = new javax.swing.JLabel();
        lblC43 = new javax.swing.JLabel();
        lblC42 = new javax.swing.JLabel();
        lblC41 = new javax.swing.JLabel();
        lblC51 = new javax.swing.JLabel();
        lblC52 = new javax.swing.JLabel();
        lblC53 = new javax.swing.JLabel();
        lblC54 = new javax.swing.JLabel();
        btnCL1 = new javax.swing.JButton();
        btnCR1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanelInferior = new javax.swing.JPanel();
        btnDownload = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanelSuperior = new javax.swing.JPanel();
        btnGenerarSolucion = new javax.swing.JButton();
        btnCargarA = new javax.swing.JButton();
        btnDescargarA = new javax.swing.JButton();
        btnCargarB = new javax.swing.JButton();
        btnDescargarB = new javax.swing.JButton();
        btnRestartA = new javax.swing.JButton();
        btnRestartB = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jFileChooser2.setDialogTitle("Descargar Archivo ...");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAL1ActionPerformed(evt);
            }
        });

        btnAL2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAL2ActionPerformed(evt);
            }
        });

        btnAL3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAL3ActionPerformed(evt);
            }
        });

        btnAL4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAL4ActionPerformed(evt);
            }
        });

        btnAL5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAL5ActionPerformed(evt);
            }
        });

        btnAR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAR1ActionPerformed(evt);
            }
        });

        btnAR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAR2ActionPerformed(evt);
            }
        });

        btnAR3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAR3ActionPerformed(evt);
            }
        });

        btnAR4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAR4ActionPerformed(evt);
            }
        });

        btnAR5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAR5ActionPerformed(evt);
            }
        });

        btnAU1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAU1ActionPerformed(evt);
            }
        });

        btnAU2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAU2ActionPerformed(evt);
            }
        });

        btnAU3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAU3ActionPerformed(evt);
            }
        });

        btnAU4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAU4ActionPerformed(evt);
            }
        });

        btnAD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAD1ActionPerformed(evt);
            }
        });

        btnAD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAD2ActionPerformed(evt);
            }
        });

        btnAD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAD3ActionPerformed(evt);
            }
        });

        btnAD4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAD4ActionPerformed(evt);
            }
        });

        btnBL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBL1ActionPerformed(evt);
            }
        });

        btnBL2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBL2ActionPerformed(evt);
            }
        });

        btnBL3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBL3ActionPerformed(evt);
            }
        });

        btnBL4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBL4ActionPerformed(evt);
            }
        });

        btnBL5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBL5ActionPerformed(evt);
            }
        });

        btnBR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBR1ActionPerformed(evt);
            }
        });

        btnBR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBR2ActionPerformed(evt);
            }
        });

        btnBR3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBR3ActionPerformed(evt);
            }
        });

        btnBR4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBR4ActionPerformed(evt);
            }
        });

        btnBR5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBR5ActionPerformed(evt);
            }
        });

        btnBU1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBU1ActionPerformed(evt);
            }
        });

        btnBU2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBU2ActionPerformed(evt);
            }
        });

        btnBU3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBU3ActionPerformed(evt);
            }
        });

        btnBU4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBU4ActionPerformed(evt);
            }
        });

        btnBD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBD1ActionPerformed(evt);
            }
        });

        btnBD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBD2ActionPerformed(evt);
            }
        });

        btnBD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBD3ActionPerformed(evt);
            }
        });

        btnBD4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBD4ActionPerformed(evt);
            }
        });

        btnCL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCL1ActionPerformed(evt);
            }
        });

        btnCR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCR1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Utopia", 0, 18)); // NOI18N
        jLabel1.setText("Configuración Inicial:");

        jPanelInferior.setBackground(new java.awt.Color(0, 161, 255));
        jPanelInferior.setPreferredSize(new java.awt.Dimension(687, 59));

        btnDownload.setToolTipText("Descargar archivo con la solución");
        btnDownload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownloadActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Utopia", 0, 24)); // NOI18N
        jLabel2.setText("Solución:");

        jLabel4.setFont(new java.awt.Font("Utopia", 0, 24)); // NOI18N
        jLabel4.setText("Solución:");

        javax.swing.GroupLayout jPanelInferiorLayout = new javax.swing.GroupLayout(jPanelInferior);
        jPanelInferior.setLayout(jPanelInferiorLayout);
        jPanelInferiorLayout.setHorizontalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInferiorLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 623, Short.MAX_VALUE)
                .addComponent(btnDownload, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        jPanelInferiorLayout.setVerticalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInferiorLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDownload, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Utopia", 0, 18)); // NOI18N
        jLabel3.setText("Configuración Final:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addComponent(btnAU1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnAU2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnAU3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnAU4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnAL1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAL2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAL3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAL4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAL5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblA21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblA22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblA23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblA24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblA11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblA12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblA13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblA14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblA31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(lblA42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(lblA43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(lblA44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(lblA32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(lblA33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(lblA34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnAR1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAR2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAR3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAR4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblA51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblA41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnAD1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(lblA52, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblA53, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblA54, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnAR5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(btnAD2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(14, 14, 14)
                                            .addComponent(btnAD3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnAD4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(153, 153, 153)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(196, 196, 196))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBL1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBL2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBL3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBL4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBL5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblB21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblB22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblB23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblB24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblB11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblB12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblB13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblB14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblB31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblB32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblB33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblB34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnBR1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnBR2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnBR3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblB41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblB51, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblB42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblB43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblB44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnBR4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblB52, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblB53, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblB54, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnBR5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnBD1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBD2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(24, 24, 24)
                                    .addComponent(btnBD3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBD4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBU1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBU2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnBU3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBU4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelInferior, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(btnCL1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblC51, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(lblC52, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblC53, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblC54, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblC11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblC12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblC13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(lblC14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblC41, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblC42, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblC43, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblC44, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblC21, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblC22, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblC23, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblC24, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblC31, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblC32, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblC33, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblC34, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addComponent(btnCR1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAU2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAU1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAU3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAU4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAR5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(lblA12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(lblA11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(lblA14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(lblA13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addComponent(btnAL1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(btnAR1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(lblA22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(lblA21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(lblA24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(lblA23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(btnAL2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addComponent(btnAR2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblA32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblA31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblA34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblA33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnAR3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(btnAL3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblA42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblA41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblA44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblA43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnAR4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btnAL4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblA52, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblA51, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblA54, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblA53, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAL5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAD1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAD2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAD3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAD4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBU1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBU2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBU3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBU4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBR5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(btnBL1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(lblB12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(lblB11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(lblB14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(lblB13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addComponent(btnBR1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(lblB22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(lblB21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(lblB24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(lblB23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(btnBL2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addComponent(btnBR2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblB32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblB31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblB34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblB33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnBR3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(btnBL3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblB42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblB41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblB44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblB43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnBR4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btnBL4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblB52, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblB51, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblB54, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblB53, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBL5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBD1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBD2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBD3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBD4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addComponent(jPanelInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblC12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblC11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblC14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblC13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCL1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCR1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblC22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblC21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblC24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblC23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblC32, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblC31, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblC34, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblC33, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblC42, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblC41, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblC44, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblC43, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblC52, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblC51, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblC54, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblC53, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        btnGenerarSolucion.setToolTipText("Generar Solución");
        btnGenerarSolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarSolucionActionPerformed(evt);
            }
        });

        btnCargarA.setToolTipText("Cargar Archivo");
        btnCargarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarAActionPerformed(evt);
            }
        });

        btnDescargarA.setToolTipText("Descargar Archivo Matriz de Entrada");
        btnDescargarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescargarAActionPerformed(evt);
            }
        });

        btnCargarB.setToolTipText("Cargar Archivo");
        btnCargarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarBActionPerformed(evt);
            }
        });

        btnDescargarB.setToolTipText("Descargar archivo Matriz Salida");
        btnDescargarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescargarBActionPerformed(evt);
            }
        });

        btnRestartA.setToolTipText("Reiniciar Configuracion");
        btnRestartA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartAActionPerformed(evt);
            }
        });

        btnRestartB.setToolTipText("Reiniciar Configuracion");
        btnRestartB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSuperiorLayout = new javax.swing.GroupLayout(jPanelSuperior);
        jPanelSuperior.setLayout(jPanelSuperiorLayout);
        jPanelSuperiorLayout.setHorizontalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRestartA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(btnCargarA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnDescargarA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addComponent(btnGenerarSolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152)
                .addComponent(btnCargarB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnDescargarB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(btnRestartB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanelSuperiorLayout.setVerticalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRestartB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnRestartA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCargarB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDescargarB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnCargarA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDescargarA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnGenerarSolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Ayuda");

        jMenuItem1.setText("Intrucciones");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCR1ActionPerformed

       posicion_solucion++;
        //posicion_solucion++;
        if(posicion_solucion<solucion_completa.size())
        {
            SolutionMatriz = solucion_completa.get(posicion_solucion);
            refreshMatrixSolution();
        }
        else
        {
            posicion_solucion--;
        }        
    }//GEN-LAST:event_btnCR1ActionPerformed

    private void btnCL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCL1ActionPerformed
       
        posicion_solucion--;
        if(posicion_solucion>=0)
        {
            SolutionMatriz = solucion_completa.get(posicion_solucion);
            refreshMatrixSolution();
        }
        else
        {
            posicion_solucion++;
        }     
    }//GEN-LAST:event_btnCL1ActionPerformed

    private void btnDescargarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescargarBActionPerformed
        int returnVal = jFileChooser2.showOpenDialog(this);
        if (returnVal == jFileChooser2.APPROVE_OPTION) {
            File vFile = jFileChooser2.getSelectedFile();
            Files.downloadFile(vFile, OutMatriz);
            JOptionPane.showMessageDialog(null, "Se ha descargo el archivo:" + vFile.getName() , "Se ha completado" , JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnDescargarBActionPerformed

    private void btnBD4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBD4ActionPerformed
        moverAbajo(3,OutMatriz,2);
        
    }//GEN-LAST:event_btnBD4ActionPerformed

    private void btnBD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBD3ActionPerformed
        moverAbajo(2,OutMatriz,2);
        
    }//GEN-LAST:event_btnBD3ActionPerformed

    private void btnBD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBD2ActionPerformed
        moverAbajo(1,OutMatriz,2);
        
    }//GEN-LAST:event_btnBD2ActionPerformed

    private void btnBD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBD1ActionPerformed
        moverAbajo(0,OutMatriz,2);
        
    }//GEN-LAST:event_btnBD1ActionPerformed

    private void btnBU4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBU4ActionPerformed
        moverArriba(3,OutMatriz,2);
        
    }//GEN-LAST:event_btnBU4ActionPerformed

    private void btnBU3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBU3ActionPerformed
        moverArriba(2,OutMatriz,2);
        
    }//GEN-LAST:event_btnBU3ActionPerformed

    private void btnBU2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBU2ActionPerformed
        moverArriba(1,OutMatriz,2);
        
    }//GEN-LAST:event_btnBU2ActionPerformed

    private void btnBU1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBU1ActionPerformed
        // TODO add your handling code here:
        moverArriba(0,OutMatriz,2);
        
    }//GEN-LAST:event_btnBU1ActionPerformed

    private void btnBR5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBR5ActionPerformed
        moverDerecha(4,OutMatriz,2);
        
    }//GEN-LAST:event_btnBR5ActionPerformed

    private void btnBR4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBR4ActionPerformed
        moverDerecha(3,OutMatriz,2);
        
    }//GEN-LAST:event_btnBR4ActionPerformed

    private void btnBR3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBR3ActionPerformed
        moverDerecha(2,OutMatriz,2);
        
    }//GEN-LAST:event_btnBR3ActionPerformed

    private void btnBR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBR2ActionPerformed
        moverDerecha(1,OutMatriz,2);
        
    }//GEN-LAST:event_btnBR2ActionPerformed

    private void btnBR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBR1ActionPerformed
        moverDerecha(0,OutMatriz,2);
        
    }//GEN-LAST:event_btnBR1ActionPerformed

    private void btnBL5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBL5ActionPerformed
        moverIzquierda(4,OutMatriz,2);
        
    }//GEN-LAST:event_btnBL5ActionPerformed

    private void btnBL4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBL4ActionPerformed
        moverIzquierda(3,OutMatriz,2);
        
    }//GEN-LAST:event_btnBL4ActionPerformed

    private void btnBL3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBL3ActionPerformed
        moverIzquierda(2,OutMatriz,2);
        
    }//GEN-LAST:event_btnBL3ActionPerformed

    private void btnBL2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBL2ActionPerformed
        moverIzquierda(1,OutMatriz,2);
        
    }//GEN-LAST:event_btnBL2ActionPerformed

    private void btnBL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBL1ActionPerformed
        // TODO add your handling code here:
        moverIzquierda(0,OutMatriz,2);
        
    }//GEN-LAST:event_btnBL1ActionPerformed

    private void btnCargarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarBActionPerformed
        int returnVal = jFileChooser1.showOpenDialog(this);
        if (returnVal == jFileChooser1.APPROVE_OPTION) {
            File vFile = jFileChooser1.getSelectedFile();
            String[][] vBabylonMatrix = Matrix.createBabylonMatrix();
            String errores = (readFile(vFile));
            if (readFile(vFile).equals("")) {vBabylonMatrix = Matrix.createBabylonMatrix(vFile);}
            else
            {
                JOptionPane.showMessageDialog(null, errores , "Error en el archivo", JOptionPane.ERROR_MESSAGE);
            }
            OutMatriz = vBabylonMatrix;
            refreshMatrixB();
        }
    }//GEN-LAST:event_btnCargarBActionPerformed

    private void btnGenerarSolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarSolucionActionPerformed
        List<List<String>> so =  Matrix.getList(InMatriz);
        List<List<String>> de = Matrix.getList(OutMatriz);
        
        BabMatrix bo = new BabMatrix(so);
        BabMatrix bd = new BabMatrix(de);
                
        AStar aStar1 = new AStar();
        
        solucion_completa.clear();
        posicion_solucion = 0;
        System.out.println("Pensando en solución...");
        List <BabMatrix> paths = aStar1.astar(bo,bd);
       
       // solucion_completa = Matrix.getArray(paths);
        
        for (int i = 0; i < paths.size(); i++) {
            solucion_completa.add(paths.get(i).getMatrix());
        }
        SolutionMatriz=solucion_completa.get(0);

        refreshMatrixSolution();
    }//GEN-LAST:event_btnGenerarSolucionActionPerformed

    private void btnDescargarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescargarAActionPerformed
        int returnVal = jFileChooser2.showOpenDialog(this);
        if (returnVal == jFileChooser2.APPROVE_OPTION) {
            File vFile = jFileChooser2.getSelectedFile();
            Files.downloadFile(vFile, InMatriz);
            JOptionPane.showMessageDialog(null, "Se ha descargo el archivo:" + vFile.getName() , "Se ha completado" , JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnDescargarAActionPerformed

    private void btnDownloadActionPerformed(java.awt.event.ActionEvent evt) {                                              
        int returnVal = jFileChooser2.showOpenDialog(this);
        if (returnVal == jFileChooser2.APPROVE_OPTION) {
            File vFile = jFileChooser2.getSelectedFile();
            Files.downloadFile(vFile, solucion_completa);
            JOptionPane.showMessageDialog(null, "Se ha descargo el archivo:" + vFile.getName() , "Se ha completado" , JOptionPane.INFORMATION_MESSAGE);
        }
    }    
    
    private void btnAD4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAD4ActionPerformed
        moverAbajo(3,InMatriz,1);
        
    }//GEN-LAST:event_btnAD4ActionPerformed

    private void btnAD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAD3ActionPerformed
        // TODO add your handling code here:
        moverAbajo(2,InMatriz,1);
        
    }//GEN-LAST:event_btnAD3ActionPerformed

    private void btnAD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAD2ActionPerformed
        // TODO add your handling code here:
        moverAbajo(1,InMatriz,1);
        
    }//GEN-LAST:event_btnAD2ActionPerformed

    private void btnAD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAD1ActionPerformed
        // TODO add your handling code here:
        moverAbajo(0,InMatriz,1);
        
    }//GEN-LAST:event_btnAD1ActionPerformed

    private void btnAU4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAU4ActionPerformed
        // TODO add your handling code here:
        moverArriba(3,InMatriz,1);
        
    }//GEN-LAST:event_btnAU4ActionPerformed

    private void btnAU3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAU3ActionPerformed
        // TODO add your handling code here:
        moverArriba(2,InMatriz,1);
        
    }//GEN-LAST:event_btnAU3ActionPerformed

    private void btnAU2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAU2ActionPerformed
        // TODO add your handling code here:
        moverArriba(1,InMatriz,1);
        
    }//GEN-LAST:event_btnAU2ActionPerformed

    private void btnAU1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAU1ActionPerformed
        // TODO add your handling code here:
        moverArriba(0,InMatriz,1);
        
    }//GEN-LAST:event_btnAU1ActionPerformed

    private void btnAR5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAR5ActionPerformed
        // TODO add your handling code here:
        moverDerecha(4,InMatriz,1);
        
    }//GEN-LAST:event_btnAR5ActionPerformed

    private void btnAR4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAR4ActionPerformed
        // TODO add your handling code here:
        moverDerecha(3,InMatriz,1);
        
    }//GEN-LAST:event_btnAR4ActionPerformed

    private void btnAR3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAR3ActionPerformed
        // TODO add your handling code here:
        moverDerecha(2,InMatriz,1);
        
    }//GEN-LAST:event_btnAR3ActionPerformed

    private void btnAR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAR2ActionPerformed
        // TODO add your handling code here:
        moverDerecha(1,InMatriz,1);
        
    }//GEN-LAST:event_btnAR2ActionPerformed

    private void btnAR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAR1ActionPerformed
        // TODO add your handling code here:
        moverDerecha(0,InMatriz,1);
        
    }//GEN-LAST:event_btnAR1ActionPerformed

    private void btnAL5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAL5ActionPerformed
        moverIzquierda(4,InMatriz,1);
        
    }//GEN-LAST:event_btnAL5ActionPerformed

    private void btnAL4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAL4ActionPerformed
        // TODO add your handling code here:
        moverIzquierda(3,InMatriz,1);
        
    }//GEN-LAST:event_btnAL4ActionPerformed

    private void btnAL3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAL3ActionPerformed
        // TODO add your handling code here:
        moverIzquierda(2,InMatriz,1);
        
    }//GEN-LAST:event_btnAL3ActionPerformed

    private void btnAL2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAL2ActionPerformed
        // TODO add your handling code here:
        moverIzquierda(1,InMatriz,1);
        
    }//GEN-LAST:event_btnAL2ActionPerformed

    private void btnAL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAL1ActionPerformed
        // TODO add your handling code here:
        moverIzquierda(0,InMatriz,1);
    }//GEN-LAST:event_btnAL1ActionPerformed

    private void btnCargarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarAActionPerformed
        int returnVal = jFileChooser1.showOpenDialog(this);
        if (returnVal == jFileChooser1.APPROVE_OPTION) {
            File vFile = jFileChooser1.getSelectedFile();
            String[][] vBabylonMatrix = Matrix.createBabylonMatrix();
            String errores = (readFile(vFile));
            if (readFile(vFile).equals("")) {vBabylonMatrix = Matrix.createBabylonMatrix(vFile);}
            else
            {
                JOptionPane.showMessageDialog(null, errores , "Error en el archivo", JOptionPane.ERROR_MESSAGE);
            }
            InMatriz = vBabylonMatrix;
            refreshMatrix();
        }
    }//GEN-LAST:event_btnCargarAActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        frmInstrucciones instrucciones = new frmInstrucciones();
        instrucciones.setVisible(true);
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnRestartAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartAActionPerformed
        InMatriz = Matrix.createBabylonMatrix();
        refreshMatrix();
    }//GEN-LAST:event_btnRestartAActionPerformed

    private void btnRestartBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartBActionPerformed
        OutMatriz = Matrix.createBabylonMatrix();
        refreshMatrixB();
    }//GEN-LAST:event_btnRestartBActionPerformed

    public void imprimir_resultadoA()
    {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(InMatriz[i][j]);
            }
            System.out.print("\n");        
        }
        System.out.print("\n");
    }
    
    public void imprimir_resultadoB()
    {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(OutMatriz[i][j]);
            }
            System.out.print("\n");        
        }
        System.out.print("\n");
    }
    
    public void moverDerecha(int pPos, String [][] pMatrix, int pTypeM)
    {
        String espacio1 = pMatrix[pPos][0];
        String espacio2 = pMatrix[pPos][1];
        String espacio3 = pMatrix[pPos][2];
        String espacio4 = pMatrix[pPos][3];
        
        pMatrix[pPos][0] = espacio4;
        pMatrix[pPos][1] = espacio1;
        pMatrix[pPos][2] = espacio2;
        pMatrix[pPos][3] = espacio3;
        
        if (pTypeM == 1) 
        {
            actualizar_interfazA(pPos,1);
        }
         else if(pTypeM == 2)
        {
            actualizar_interfazB(pPos,1);
        }
    }
    
    public void moverIzquierda(int pPos, String [][] pMatrix, int pTypeM)
    {
        String espacio1 = pMatrix[pPos][0];
        String espacio2 = pMatrix[pPos][1];
        String espacio3 = pMatrix[pPos][2];
        String espacio4 = pMatrix[pPos][3];
        
        pMatrix[pPos][0] = espacio2;
        pMatrix[pPos][1] = espacio3;
        pMatrix[pPos][2] = espacio4;
        pMatrix[pPos][3] = espacio1;
        
        if (pTypeM == 1) 
        {
            actualizar_interfazA(pPos,1);
        }
        else if(pTypeM == 2)
        {
            actualizar_interfazB(pPos,1);
        }
    }
    
    public void moverArriba(int pPos, String [][] pMatrix, int pTypeM)
    {
        if(pMatrix[0][pPos].equals("0"))
        {
            String espacio = pMatrix[0][pPos];
            String elemento1 = pMatrix[1][pPos];
            String elemento2 = pMatrix[2][pPos];
            String elemento3 = pMatrix[3][pPos];
            String elemento4 = pMatrix[4][pPos];

            pMatrix[0][pPos] = elemento1;
            pMatrix[1][pPos] = espacio;
            pMatrix[2][pPos] = elemento2;
            pMatrix[3][pPos] = elemento3;
            pMatrix[4][pPos] = elemento4;      
        }
        else if(pMatrix[1][pPos].equals("0"))
        {
            
            String elemento1 = pMatrix[0][pPos];
            String espacio = pMatrix[1][pPos];
            String elemento2 = pMatrix[2][pPos];
            String elemento3 = pMatrix[3][pPos];
            String elemento4 = pMatrix[4][pPos];

            pMatrix[0][pPos] = elemento1;
            pMatrix[1][pPos] = elemento2;
            pMatrix[2][pPos] = espacio;
            pMatrix[3][pPos] = elemento3;
            pMatrix[4][pPos] = elemento4;
        }
        else if(pMatrix[2][pPos].equals("0"))
        {
            String elemento1 = pMatrix[0][pPos];
            String elemento2 = pMatrix[1][pPos];
            String espacio = pMatrix[2][pPos];
            String elemento3 = pMatrix[3][pPos];
            String elemento4 = pMatrix[4][pPos];

            pMatrix[0][pPos] = elemento1;
            pMatrix[1][pPos] = elemento2;
            pMatrix[2][pPos] = elemento3;
            pMatrix[3][pPos] = espacio;
            pMatrix[4][pPos] = elemento4;   
        }
        else if(pMatrix[3][pPos].equals("0"))
        {
            String elemento1 = pMatrix[0][pPos];
            String elemento2 = pMatrix[1][pPos];
            String elemento3 = pMatrix[2][pPos];
            String espacio = pMatrix[3][pPos];
            String elemento4 = pMatrix[4][pPos];

            pMatrix[0][pPos] = elemento1;
            pMatrix[1][pPos] = elemento2;
            pMatrix[2][pPos] = elemento3;
            pMatrix[3][pPos] = elemento4;
            pMatrix[4][pPos] = espacio;
        }
        if (pTypeM == 1) 
        {
            actualizar_interfazA(pPos,2);
        }
         else if(pTypeM == 2)
        {
            actualizar_interfazB(pPos,2);
        }
        
        
    }
    
    public void moverAbajo(int pPos, String [][] pMatrix, int pTypeM)
    {
       if(pMatrix[1][pPos].equals("0")&&!pMatrix[0][pPos].equals("*"))
        {
            String elemento1 = pMatrix[0][pPos];
            String espacio = pMatrix[1][pPos];            
            String elemento2 = pMatrix[2][pPos];
            String elemento3 = pMatrix[3][pPos];
            String elemento4 = pMatrix[4][pPos];

            pMatrix[0][pPos] = espacio;
            pMatrix[1][pPos] = elemento1;
            pMatrix[2][pPos] = elemento2;
            pMatrix[3][pPos] = elemento3;
            pMatrix[4][pPos] = elemento4;
        }
        else if(pMatrix[2][pPos].equals("0"))
        {            
            String elemento1 = pMatrix[0][pPos];
            String elemento2 = pMatrix[1][pPos];
            String espacio = pMatrix[2][pPos];
            String elemento3 = pMatrix[3][pPos];
            String elemento4 = pMatrix[4][pPos];

            pMatrix[0][pPos] = elemento1;
            pMatrix[1][pPos] = espacio;
            pMatrix[2][pPos] = elemento2;
            pMatrix[3][pPos] = elemento3;
            pMatrix[4][pPos] = elemento4;
        }
        
        else if(pMatrix[3][pPos].equals("0"))
        {
            String elemento1 = pMatrix[0][pPos];
            String elemento2 = pMatrix[1][pPos];
            String elemento3 = pMatrix[2][pPos];
            String espacio = pMatrix[3][pPos];
            String elemento4 = pMatrix[4][pPos];
            
            pMatrix[0][pPos] = elemento1;
            pMatrix[1][pPos] = elemento2;
            pMatrix[2][pPos] = espacio;
            pMatrix[3][pPos] = elemento3;
            pMatrix[4][pPos] = elemento4;
        }
       
       else if(pMatrix[4][pPos].equals("0"))
        {
            String elemento1 = pMatrix[0][pPos];
            String elemento2 = pMatrix[1][pPos];
            String elemento3 = pMatrix[2][pPos];
            String elemento4 = pMatrix[3][pPos];
            String espacio = pMatrix[4][pPos];
           
            pMatrix[0][pPos] = elemento1;
            pMatrix[1][pPos] = elemento2; 
            pMatrix[2][pPos] = elemento3;
            pMatrix[3][pPos] = espacio;
            pMatrix[4][pPos] = elemento4;
        }
       
       if (pTypeM == 1) 
        {
            actualizar_interfazA(pPos,2);
        }
        else if(pTypeM == 2)
        {
            actualizar_interfazB(pPos,2);
        }
    }
    
    public void actualizar_interfazA(int pPos,int pDireccion)
    {
        
        spacePosition = findSpace(InMatriz);
        if(pDireccion==1)
        {   
            //For: check the row according position
            for(int i = 0; i<4;i++)
            {
                //Position i in the row
                switch(i)
                {
                    case 0:
                        switch(InMatriz[pPos][0])
                        {
                            case "0":
                                seleccionar_imagen_columna_1A(pPos, no_pared);
                                spacePosition=0;
                                break;
                            case "*":
                                seleccionar_imagen_columna_1A(pPos, pared);
                                break;
                            case "1":
                                seleccionar_imagen_columna_1A(pPos, bola_roja);
                                break;
                            case "2":
                                seleccionar_imagen_columna_1A(pPos, bola_naranja);
                                break;
                            case "3":
                                seleccionar_imagen_columna_1A(pPos, bola_azul);
                                break;
                            case "4":
                                seleccionar_imagen_columna_1A(pPos, bola_amarilla);
                                break;
                        }
                        break;

                        case 1:
                            switch(InMatriz[pPos][1])
                            {
                                case "0":
                                    seleccionar_imagen_columna_2A(pPos, no_pared);
                                    spacePosition=1;
                                    break;
                                case "*":
                                    seleccionar_imagen_columna_2A(pPos, pared);
                                    break;
                                case "1":
                                    seleccionar_imagen_columna_2A(pPos, bola_roja);
                                    break;
                                case "2":
                                    seleccionar_imagen_columna_2A(pPos, bola_naranja);
                                    break;
                                case "3":
                                    seleccionar_imagen_columna_2A(pPos, bola_azul);
                                    break;
                                case "4":
                                    seleccionar_imagen_columna_2A(pPos, bola_amarilla);
                                    break;
                            }

                        break;

                        case 2:
                            switch(InMatriz[pPos][2])
                            {
                                 case "0":
                                    seleccionar_imagen_columna_3A(pPos, no_pared);
                                    spacePosition=2;
                                    break;
                                case "*":
                                    seleccionar_imagen_columna_3A(pPos, pared);
                                    break;
                                case "1":
                                    seleccionar_imagen_columna_3A(pPos, bola_roja);
                                    break;
                                case "2":
                                    seleccionar_imagen_columna_3A(pPos, bola_naranja);
                                    break;
                                case "3":
                                    seleccionar_imagen_columna_3A(pPos, bola_azul);
                                    break;
                                case "4":
                                    seleccionar_imagen_columna_3A(pPos, bola_amarilla);
                                    break;
                            }

                        break;

                        case 3:
                            switch(InMatriz[pPos][3])
                            {
                                 case "0":
                                    seleccionar_imagen_columna_4A(pPos, no_pared);
                                    spacePosition=3;
                                    break;
                                case "*":
                                    seleccionar_imagen_columna_4A(pPos, pared);
                                    break;
                                case "1":
                                    seleccionar_imagen_columna_4A(pPos, bola_roja);
                                    break;
                                case "2":
                                    seleccionar_imagen_columna_4A(pPos, bola_naranja);
                                    break;
                                case "3":
                                    seleccionar_imagen_columna_4A(pPos, bola_azul);
                                    break;
                                case "4":
                                    seleccionar_imagen_columna_4A(pPos, bola_amarilla);
                                    break;
                            }

                        break;   
                }
            }

             //Check the space position
            switch(spacePosition)
            {
                case 0:
                    btnAU1.setEnabled(true);
                    btnAU2.setEnabled(false);
                    btnAU3.setEnabled(false);
                    btnAU4.setEnabled(false);
                    btnAD1.setEnabled(true);
                    btnAD2.setEnabled(false);
                    btnAD3.setEnabled(false);
                    btnAD4.setEnabled(false);
                    break;
                case 1:
                    btnAU2.setEnabled(true);
                    btnAU1.setEnabled(false);
                    btnAU3.setEnabled(false);
                    btnAU4.setEnabled(false);
                    btnAD2.setEnabled(true);
                    btnAD1.setEnabled(false);
                    btnAD3.setEnabled(false);
                    btnAD4.setEnabled(false);
                    break;
                case 2:
                    btnAU3.setEnabled(true);
                    btnAU1.setEnabled(false);
                    btnAU2.setEnabled(false);
                    btnAU4.setEnabled(false);
                    btnAD3.setEnabled(true);
                    btnAD1.setEnabled(false);
                    btnAD2.setEnabled(false);
                    btnAD4.setEnabled(false);
                    break;
                case 3:
                    btnAU4.setEnabled(true);
                    btnAU1.setEnabled(false);
                    btnAU2.setEnabled(false);
                    btnAU3.setEnabled(false);
                    btnAD4.setEnabled(true);
                    btnAD1.setEnabled(false);
                    btnAD2.setEnabled(false);
                    btnAD3.setEnabled(false);
                    break;

            }
        }
        else if(pDireccion==2)
        {
            //For: check the row according position
            for(int i = 0; i<5;i++)
            {
                //Position i in the row
                switch(i)
                {
                    case 0:
                        switch(InMatriz[0][pPos])
                        {
                            case "0":
                                seleccionar_imagen_fila_1A(pPos, no_pared);
                                break;
                            case "*":
                                seleccionar_imagen_fila_1A(pPos, pared);
                                break;
                            case "1":
                                seleccionar_imagen_fila_1A(pPos, bola_roja);
                                break;
                            case "2":
                                seleccionar_imagen_fila_1A(pPos, bola_naranja);
                                break;
                            case "3":
                                seleccionar_imagen_fila_1A(pPos, bola_azul);
                                break;
                            case "4":
                                seleccionar_imagen_fila_1A(pPos, bola_amarilla);
                                break;
                        }

                        break;

                        case 1:
                                                
                                switch(InMatriz[1][pPos])
                                {
                                    case "0":
                                        seleccionar_imagen_fila_2A(pPos, no_pared);
                                        break;
                                    case "*":
                                        seleccionar_imagen_fila_2A(pPos, pared);
                                        break;
                                    case "1":
                                        seleccionar_imagen_fila_2A(pPos, bola_roja);
                                        break;
                                    case "2":
                                        seleccionar_imagen_fila_2A(pPos, bola_naranja);
                                        break;
                                    case "3":
                                        seleccionar_imagen_fila_2A(pPos, bola_azul);
                                        break;
                                    case "4":
                                        seleccionar_imagen_fila_2A(pPos, bola_amarilla);
                                        break;
                            }

                        break;

                        case 2:
                            switch(InMatriz[2][pPos])
                            {
                                 case "0":
                                    seleccionar_imagen_fila_3A(pPos, no_pared);
                                    break;
                                case "*":
                                    seleccionar_imagen_fila_3A(pPos, pared);
                                    break;
                                case "1":
                                    seleccionar_imagen_fila_3A(pPos, bola_roja);
                                    break;
                                case "2":
                                    seleccionar_imagen_fila_3A(pPos, bola_naranja);
                                    break;
                                case "3":
                                    seleccionar_imagen_fila_3A(pPos, bola_azul);
                                    break;
                                case "4":
                                    seleccionar_imagen_fila_3A(pPos, bola_amarilla);
                                    break;
                            }

                        break;

                        case 3:
                            switch(InMatriz[3][pPos])
                            {
                                 case "0":
                                    seleccionar_imagen_fila_4A(pPos, no_pared);
                                    
                                    break;
                                case "*":
                                    seleccionar_imagen_fila_4A(pPos, pared);
                                    break;
                                case "1":
                                    seleccionar_imagen_fila_4A(pPos, bola_roja);
                                    break;
                                case "2":
                                    seleccionar_imagen_fila_4A(pPos, bola_naranja);
                                    break;
                                case "3":
                                    seleccionar_imagen_fila_4A(pPos, bola_azul);
                                    break;
                                case "4":
                                    seleccionar_imagen_fila_4A(pPos, bola_amarilla);
                                    break;
                            }       
                        case 4:
                            switch(InMatriz[4][pPos])
                            {
                                 case "0":
                                    seleccionar_imagen_fila_5A(pPos, no_pared);
                                    break;
                                case "*":
                                    seleccionar_imagen_fila_5A(pPos, pared);
                                    break;
                                case "1":
                                    seleccionar_imagen_fila_5A(pPos, bola_roja);
                                    break;
                                case "2":
                                    seleccionar_imagen_fila_5A(pPos, bola_naranja);
                                    break;
                                case "3":
                                    seleccionar_imagen_fila_5A(pPos, bola_azul);
                                    break;
                                case "4":
                                    seleccionar_imagen_fila_5A(pPos, bola_amarilla);
                                    break;
                            }                            
                        break;
                
                }
                //Check the space position
            switch(spacePosition)
            {
                case 0:
                    btnAU1.setEnabled(true);
                    btnAU2.setEnabled(false);
                    btnAU3.setEnabled(false);
                    btnAU4.setEnabled(false);
                    break;
                case 1:
                    btnAU2.setEnabled(true);
                    btnAU1.setEnabled(false);
                    btnAU3.setEnabled(false);
                    btnAU4.setEnabled(false);
                    break;
                case 2:
                    btnAU3.setEnabled(true);
                    btnAU1.setEnabled(false);
                    btnAU2.setEnabled(false);
                    btnAU4.setEnabled(false);
                    break;
                case 3:
                    btnAU4.setEnabled(true);
                    btnAU1.setEnabled(false);
                    btnAU2.setEnabled(false);
                    btnAU3.setEnabled(false);
                    break;

                }
            }
        }
    }
    
    public void seleccionar_imagen_columna_1A(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblA11.setIcon(image);
                break;
            case 1:
                lblA21.setIcon(image);
                break;
            case 2:
                lblA31.setIcon(image);
                break;
            case 3:
                lblA41.setIcon(image);
                break;
            case 4:
                lblA51.setIcon(image);
                break;
        }
    }
    
    
    public void seleccionar_imagen_fila_1A(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblA11.setIcon(image);
                break;
            case 1:
                lblA12.setIcon(image);
                break;
            case 2:
                lblA13.setIcon(image);
                break;
            case 3:
                lblA14.setIcon(image);
                break;   
            
        }
    }
    
    public void seleccionar_imagen_columna_2A(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblA12.setIcon(image);
                break;
            case 1:
                lblA22.setIcon(image);
                break;
            case 2:
                lblA32.setIcon(image);
                break;
            case 3:
                lblA42.setIcon(image);
                break;
            case 4:
                lblA52.setIcon(image);
                break;
        }
    }
    
    public void seleccionar_imagen_fila_2A(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblA21.setIcon(image);
                break;
            case 1:
                lblA22.setIcon(image);
                break;
            case 2:
                lblA23.setIcon(image);
                break;
            case 3:
                lblA24.setIcon(image);
                break; 
            
        }
    }
    
    public void seleccionar_imagen_columna_3A(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblA13.setIcon(image);
                break;
            case 1:
                lblA23.setIcon(image);
                break;
            case 2:
                lblA33.setIcon(image);
                break;
            case 3:
                lblA43.setIcon(image);
                break;
            case 4:
                lblA53.setIcon(image);
                break;
        }
    }
    
    public void seleccionar_imagen_fila_3A(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblA31.setIcon(image);
                break;
            case 1:
                lblA32.setIcon(image);
                break;
            case 2:
                lblA33.setIcon(image);
                break;
            case 3:
                lblA34.setIcon(image);
                break;
            
        }
    }
    
    public void seleccionar_imagen_columna_4A(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblA14.setIcon(image);
                break;
            case 1:
                lblA24.setIcon(image);
                break;
            case 2:
                lblA34.setIcon(image);
                break;
            case 3:
                lblA44.setIcon(image);
                break;
            case 4:
                lblA54.setIcon(image);
                break;
        }
    }
    
    public void seleccionar_imagen_fila_4A(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblA41.setIcon(image);
                break;
            case 1:
                lblA42.setIcon(image);
                break;
            case 2:
                lblA43.setIcon(image);
                break;
            case 3:
                lblA44.setIcon(image);
                break;
        }
    }
    
    public void seleccionar_imagen_fila_5A(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblA51.setIcon(image);
                break;
            case 1:
                lblA52.setIcon(image);
                break;
            case 2:
                lblA53.setIcon(image);
                break;
            case 3:
                lblA54.setIcon(image);
                break;
        }
    }
    
    //Matrix B
    public void actualizar_interfazB(int pPos,int pDireccion)
    {
        
        spacePosition = findSpace(OutMatriz);
        if(pDireccion==1)
        {   
            //For: check the row according position
            for(int i = 0; i<4;i++)
            {
                //Position i in the row
                switch(i)
                {
                    case 0:
                        switch(OutMatriz[pPos][0])
                        {
                            case "0":
                                seleccionar_imagen_columna_1B(pPos, no_pared);
                                spacePosition=0;
                                break;
                            case "*":
                                seleccionar_imagen_columna_1B(pPos, pared);
                                break;
                            case "1":
                                seleccionar_imagen_columna_1B(pPos, bola_roja);
                                break;
                            case "2":
                                seleccionar_imagen_columna_1B(pPos, bola_naranja);
                                break;
                            case "3":
                                seleccionar_imagen_columna_1B(pPos, bola_azul);
                                break;
                            case "4":
                                seleccionar_imagen_columna_1B(pPos, bola_amarilla);
                                break;
                        }
                        break;

                        case 1:
                            switch(OutMatriz[pPos][1])
                            {
                                case "0":
                                    seleccionar_imagen_columna_2B(pPos, no_pared);
                                    spacePosition=1;
                                    break;
                                case "*":
                                    seleccionar_imagen_columna_2B(pPos, pared);
                                    break;
                                case "1":
                                    seleccionar_imagen_columna_2B(pPos, bola_roja);
                                    break;
                                case "2":
                                    seleccionar_imagen_columna_2B(pPos, bola_naranja);
                                    break;
                                case "3":
                                    seleccionar_imagen_columna_2B(pPos, bola_azul);
                                    break;
                                case "4":
                                    seleccionar_imagen_columna_2B(pPos, bola_amarilla);
                                    break;
                            }

                        break;

                        case 2:
                            switch(OutMatriz[pPos][2])
                            {
                                 case "0":
                                    seleccionar_imagen_columna_3B(pPos, no_pared);
                                    spacePosition=2;
                                    break;
                                case "*":
                                    seleccionar_imagen_columna_3B(pPos, pared);
                                    break;
                                case "1":
                                    seleccionar_imagen_columna_3B(pPos, bola_roja);
                                    break;
                                case "2":
                                    seleccionar_imagen_columna_3B(pPos, bola_naranja);
                                    break;
                                case "3":
                                    seleccionar_imagen_columna_3B(pPos, bola_azul);
                                    break;
                                case "4":
                                    seleccionar_imagen_columna_3B(pPos, bola_amarilla);
                                    break;
                            }

                        break;

                        case 3:
                            switch(OutMatriz[pPos][3])
                            {
                                 case "0":
                                    seleccionar_imagen_columna_4B(pPos, no_pared);
                                    spacePosition=3;
                                    break;
                                case "*":
                                    seleccionar_imagen_columna_4B(pPos, pared);
                                    break;
                                case "1":
                                    seleccionar_imagen_columna_4B(pPos, bola_roja);
                                    break;
                                case "2":
                                    seleccionar_imagen_columna_4B(pPos, bola_naranja);
                                    break;
                                case "3":
                                    seleccionar_imagen_columna_4B(pPos, bola_azul);
                                    break;
                                case "4":
                                    seleccionar_imagen_columna_4B(pPos, bola_amarilla);
                                    break;
                            }

                        break;   
                }
            }

             //Check the space position
            switch(spacePosition)
            {
                case 0:
                    btnBU1.setEnabled(true);
                    btnBU2.setEnabled(false);
                    btnBU3.setEnabled(false);
                    btnBU4.setEnabled(false);
                    btnBD1.setEnabled(true);
                    btnBD2.setEnabled(false);
                    btnBD3.setEnabled(false);
                    btnBD4.setEnabled(false);
                    break;
                case 1:
                    btnBU2.setEnabled(true);
                    btnBU1.setEnabled(false);
                    btnBU3.setEnabled(false);
                    btnBU4.setEnabled(false);
                    btnBD2.setEnabled(true);
                    btnBD1.setEnabled(false);
                    btnBD3.setEnabled(false);
                    btnBD4.setEnabled(false);
                    break;
                case 2:
                    btnBU3.setEnabled(true);
                    btnBU1.setEnabled(false);
                    btnBU2.setEnabled(false);
                    btnBU4.setEnabled(false);
                    btnBD3.setEnabled(true);
                    btnBD1.setEnabled(false);
                    btnBD2.setEnabled(false);
                    btnBD4.setEnabled(false);
                    break;
                case 3:
                    btnBU4.setEnabled(true);
                    btnBU1.setEnabled(false);
                    btnBU2.setEnabled(false);
                    btnBU3.setEnabled(false);
                    btnBD4.setEnabled(true);
                    btnBD1.setEnabled(false);
                    btnBD2.setEnabled(false);
                    btnBD3.setEnabled(false);
                    break;

            }
        }
        else if(pDireccion==2)
        {
            //For: check the row according position
            for(int i = 0; i<5;i++)
            {
                //Position i in the row
                switch(i)
                {
                    case 0:
                        switch(OutMatriz[0][pPos])
                        {
                            case "0":
                                seleccionar_imagen_fila_1B(pPos, no_pared);
                                break;
                            case "*":
                                seleccionar_imagen_fila_1B(pPos, pared);
                                break;
                            case "1":
                                seleccionar_imagen_fila_1B(pPos, bola_roja);
                                break;
                            case "2":
                                seleccionar_imagen_fila_1B(pPos, bola_naranja);
                                break;
                            case "3":
                                seleccionar_imagen_fila_1B(pPos, bola_azul);
                                break;
                            case "4":
                                seleccionar_imagen_fila_1B(pPos, bola_amarilla);
                                break;
                        }

                        break;

                        case 1:
                                                
                                switch(OutMatriz[1][pPos])
                                {
                                    case "0":
                                        seleccionar_imagen_fila_2B(pPos, no_pared);
                                        break;
                                    case "*":
                                        seleccionar_imagen_fila_2B(pPos, pared);
                                        break;
                                    case "1":
                                        seleccionar_imagen_fila_2B(pPos, bola_roja);
                                        break;
                                    case "2":
                                        seleccionar_imagen_fila_2B(pPos, bola_naranja);
                                        break;
                                    case "3":
                                        seleccionar_imagen_fila_2B(pPos, bola_azul);
                                        break;
                                    case "4":
                                        seleccionar_imagen_fila_2B(pPos, bola_amarilla);
                                        break;
                            }

                        break;

                        case 2:
                            switch(OutMatriz[2][pPos])
                            {
                                 case "0":
                                    seleccionar_imagen_fila_3B(pPos, no_pared);
                                    break;
                                case "*":
                                    seleccionar_imagen_fila_3B(pPos, pared);
                                    break;
                                case "1":
                                    seleccionar_imagen_fila_3B(pPos, bola_roja);
                                    break;
                                case "2":
                                    seleccionar_imagen_fila_3B(pPos, bola_naranja);
                                    break;
                                case "3":
                                    seleccionar_imagen_fila_3B(pPos, bola_azul);
                                    break;
                                case "4":
                                    seleccionar_imagen_fila_3B(pPos, bola_amarilla);
                                    break;
                            }

                        break;

                        case 3:
                            switch(OutMatriz[3][pPos])
                            {
                                 case "0":
                                    seleccionar_imagen_fila_4B(pPos, no_pared);
                                    
                                    break;
                                case "*":
                                    seleccionar_imagen_fila_4B(pPos, pared);
                                    break;
                                case "1":
                                    seleccionar_imagen_fila_4B(pPos, bola_roja);
                                    break;
                                case "2":
                                    seleccionar_imagen_fila_4B(pPos, bola_naranja);
                                    break;
                                case "3":
                                    seleccionar_imagen_fila_4B(pPos, bola_azul);
                                    break;
                                case "4":
                                    seleccionar_imagen_fila_4B(pPos, bola_amarilla);
                                    break;
                            }       
                        case 4:
                            switch(OutMatriz[4][pPos])
                            {
                                 case "0":
                                    seleccionar_imagen_fila_5B(pPos, no_pared);
                                    break;
                                case "*":
                                    seleccionar_imagen_fila_5B(pPos, pared);
                                    break;
                                case "1":
                                    seleccionar_imagen_fila_5B(pPos, bola_roja);
                                    break;
                                case "2":
                                    seleccionar_imagen_fila_5B(pPos, bola_naranja);
                                    break;
                                case "3":
                                    seleccionar_imagen_fila_5B(pPos, bola_azul);
                                    break;
                                case "4":
                                    seleccionar_imagen_fila_5B(pPos, bola_amarilla);
                                    break;
                            }                            
                        break;
                
                }
                //Check the space position
            switch(spacePosition)
            {
                case 0:
                    btnBU1.setEnabled(true);
                    btnBU2.setEnabled(false);
                    btnBU3.setEnabled(false);
                    btnBU4.setEnabled(false);
                    break;
                case 1:
                    btnBU2.setEnabled(true);
                    btnBU1.setEnabled(false);
                    btnBU3.setEnabled(false);
                    btnBU4.setEnabled(false);
                    break;
                case 2:
                    btnBU3.setEnabled(true);
                    btnBU1.setEnabled(false);
                    btnBU2.setEnabled(false);
                    btnBU4.setEnabled(false);
                    break;
                case 3:
                    btnBU4.setEnabled(true);
                    btnBU1.setEnabled(false);
                    btnBU2.setEnabled(false);
                    btnBU3.setEnabled(false);
                    break;

                }
            }
        }
    }
    //***********************************************************************
    
    public void seleccionar_imagen_columna_1B(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblB11.setIcon(image);
                break;
            case 1:
                lblB21.setIcon(image);
                break;
            case 2:
                lblB31.setIcon(image);
                break;
            case 3:
                lblB41.setIcon(image);
                break;
            case 4:
                lblB51.setIcon(image);
                break;
        }
    }
    
    
    public void seleccionar_imagen_fila_1B(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblB11.setIcon(image);
                break;
            case 1:
                lblB12.setIcon(image);
                break;
            case 2:
                lblB13.setIcon(image);
                break;
            case 3:
                lblB14.setIcon(image);
                break;   
            
        }
    }
    
    public void seleccionar_imagen_columna_2B(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblB12.setIcon(image);
                break;
            case 1:
                lblB22.setIcon(image);
                break;
            case 2:
                lblB32.setIcon(image);
                break;
            case 3:
                lblB42.setIcon(image);
                break;
            case 4:
                lblB52.setIcon(image);
                break;
        }
    }
    
    public void seleccionar_imagen_fila_2B(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblB21.setIcon(image);
                break;
            case 1:
                lblB22.setIcon(image);
                break;
            case 2:
                lblB23.setIcon(image);
                break;
            case 3:
                lblB24.setIcon(image);
                break; 
            
        }
    }
    
    public void seleccionar_imagen_columna_3B(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblB13.setIcon(image);
                break;
            case 1:
                lblB23.setIcon(image);
                break;
            case 2:
                lblB33.setIcon(image);
                break;
            case 3:
                lblB43.setIcon(image);
                break;
            case 4:
                lblB53.setIcon(image);
                break;
        }
    }
    
    public void seleccionar_imagen_fila_3B(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblB31.setIcon(image);
                break;
            case 1:
                lblB32.setIcon(image);
                break;
            case 2:
                lblB33.setIcon(image);
                break;
            case 3:
                lblB34.setIcon(image);
                break;
            
        }
    }
    
    public void seleccionar_imagen_columna_4B(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblB14.setIcon(image);
                break;
            case 1:
                lblB24.setIcon(image);
                break;
            case 2:
                lblB34.setIcon(image);
                break;
            case 3:
                lblB44.setIcon(image);
                break;
            case 4:
                lblB54.setIcon(image);
                break;
        }
    }
    
    public void seleccionar_imagen_fila_4B(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblB41.setIcon(image);
                break;
            case 1:
                lblB42.setIcon(image);
                break;
            case 2:
                lblB43.setIcon(image);
                break;
            case 3:
                lblB44.setIcon(image);
                break;
        }
    }
    
    public void seleccionar_imagen_fila_5B(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblB51.setIcon(image);
                break;
            case 1:
                lblB52.setIcon(image);
                break;
            case 2:
                lblB53.setIcon(image);
                break;
            case 3:
                lblB54.setIcon(image);
                break;
        }
    }
    //***********************************************************************
     ////////////////////////////Matrix 2
    
    
    public void refreshMatrixB(int pPos,int pDireccion)
    {
        spacePosition = findSpace(OutMatriz);
        if(pDireccion==1)
        {   
            //For: check the row according position
            for(int i = 0; i<4;i++)
            {
                //Position i in the row
                switch(i)
                {
                    case 0:
                        switch(OutMatriz[pPos][0])
                        {
                            case "0":
                                selectImgColumn1(pPos, no_pared);
                                spacePosition=0;
                                break;
                            case "*":
                                selectImgColumn1(pPos, pared);
                                break;
                            case "1":
                                selectImgColumn1(pPos, bola_roja);
                                break;
                            case "2":
                                selectImgColumn1(pPos, bola_naranja);
                                break;
                            case "3":
                                selectImgColumn1(pPos, bola_azul);
                                break;
                            case "4":
                                selectImgColumn1(pPos, bola_amarilla);
                                break;
                        }
                        break;

                        case 1:
                            switch(OutMatriz[pPos][1])
                            {
                                case "0":
                                    selectImgColumn2(pPos, no_pared);
                                    spacePosition=1;
                                    break;
                                case "*":
                                    selectImgColumn2(pPos, pared);
                                    break;
                                case "1":
                                    selectImgColumn2(pPos, bola_roja);
                                    break;
                                case "2":
                                    selectImgColumn2(pPos, bola_naranja);
                                    break;
                                case "3":
                                    selectImgColumn2(pPos, bola_azul);
                                    break;
                                case "4":
                                    selectImgColumn2(pPos, bola_amarilla);
                                    break;
                            }

                        break;

                        case 2:
                            switch(OutMatriz[pPos][2])
                            {
                                 case "0":
                                    selectImgColumn3(pPos, no_pared);
                                    spacePosition=2;
                                    break;
                                case "*":
                                    selectImgColumn3(pPos, pared);
                                    break;
                                case "1":
                                    selectImgColumn3(pPos, bola_roja);
                                    break;
                                case "2":
                                    selectImgColumn3(pPos, bola_naranja);
                                    break;
                                case "3":
                                    selectImgColumn3(pPos, bola_azul);
                                    break;
                                case "4":
                                    selectImgColumn3(pPos, bola_amarilla);
                                    break;
                            }

                        break;

                        case 3:
                            switch(OutMatriz[pPos][3])
                            {
                                 case "0":
                                    selectImgColumn4(pPos, no_pared);
                                    spacePosition=3;
                                    break;
                                case "*":
                                    selectImgColumn4(pPos, pared);
                                    break;
                                case "1":
                                    selectImgColumn4(pPos, bola_roja);
                                    break;
                                case "2":
                                    selectImgColumn4(pPos, bola_naranja);
                                    break;
                                case "3":
                                    selectImgColumn4(pPos, bola_azul);
                                    break;
                                case "4":
                                    selectImgColumn4(pPos, bola_amarilla);
                                    break;
                            }

                        break;   
                }
            }

            //Check the space position
            switch(spacePosition)
            {
                case 0:
                    btnBU1.setEnabled(true);
                    btnBU2.setEnabled(false);
                    btnBU3.setEnabled(false);
                    btnBU4.setEnabled(false);
                    btnBD1.setEnabled(true);
                    btnBD2.setEnabled(false);
                    btnBD3.setEnabled(false);
                    btnBD4.setEnabled(false);
                    break;
                case 1:
                    btnBU2.setEnabled(true);
                    btnBU1.setEnabled(false);
                    btnBU3.setEnabled(false);
                    btnBU4.setEnabled(false);
                    btnBD2.setEnabled(true);
                    btnBD1.setEnabled(false);
                    btnBD3.setEnabled(false);
                    btnBD4.setEnabled(false);
                    break;
                case 2:
                    btnBU3.setEnabled(true);
                    btnBU1.setEnabled(false);
                    btnBU2.setEnabled(false);
                    btnBU4.setEnabled(false);
                    btnBD3.setEnabled(true);
                    btnBD1.setEnabled(false);
                    btnBD2.setEnabled(false);
                    btnBD4.setEnabled(false);
                    break;
                case 3:
                    btnBU4.setEnabled(true);
                    btnBU1.setEnabled(false);
                    btnBU2.setEnabled(false);
                    btnBU3.setEnabled(false);
                    btnBD4.setEnabled(true);
                    btnBD1.setEnabled(false);
                    btnBD2.setEnabled(false);
                    btnBD3.setEnabled(false);
                    break;

            }
        }
        else if(pDireccion==2)
        {
            //For: check the row according position
            for(int i = 0; i<5;i++)
            {
                //Position i in the row
                switch(i)
                {
                    case 0:
                        switch(OutMatriz[0][pPos])
                        {
                            case "0":
                                selectImgRow1(pPos, no_pared);
                                break;
                            case "*":
                                selectImgRow1(pPos, pared);
                                break;
                            case "1":
                                selectImgRow1(pPos, bola_roja);
                                break;
                            case "2":
                                selectImgRow1(pPos, bola_naranja);
                                break;
                            case "3":
                                selectImgRow1(pPos, bola_azul);
                                break;
                            case "4":
                                selectImgRow1(pPos, bola_amarilla);
                                break;
                        }

                        break;

                        case 1:
                                                
                                switch(OutMatriz[1][pPos])
                                {
                                    case "0":
                                        selectImgRow2(pPos, no_pared);
                                        break;
                                    case "*":
                                        selectImgRow2(pPos, pared);
                                        break;
                                    case "1":
                                        selectImgRow2(pPos, bola_roja);
                                        break;
                                    case "2":
                                        selectImgRow2(pPos, bola_naranja);
                                        break;
                                    case "3":
                                        selectImgRow2(pPos, bola_azul);
                                        break;
                                    case "4":
                                        selectImgRow2(pPos, bola_amarilla);
                                        break;
                            }

                        break;

                        case 2:
                            switch(OutMatriz[2][pPos])
                            {
                                 case "0":
                                    selectImgRow3(pPos, no_pared);
                                    break;
                                case "*":
                                    selectImgRow3(pPos, pared);
                                    break;
                                case "1":
                                    selectImgRow3(pPos, bola_roja);
                                    break;
                                case "2":
                                    selectImgRow3(pPos, bola_naranja);
                                    break;
                                case "3":
                                    selectImgRow3(pPos, bola_azul);
                                    break;
                                case "4":
                                    selectImgRow3(pPos, bola_amarilla);
                                    break;
                            }

                        break;

                        case 3:
                            switch(OutMatriz[3][pPos])
                            {
                                 case "0":
                                    selectImgRow4(pPos, no_pared);
                                    
                                    break;
                                case "*":
                                    selectImgRow4(pPos, pared);
                                    break;
                                case "1":
                                    selectImgRow4(pPos, bola_roja);
                                    break;
                                case "2":
                                    selectImgRow4(pPos, bola_naranja);
                                    break;
                                case "3":
                                    selectImgRow4(pPos, bola_azul);
                                    break;
                                case "4":
                                    selectImgRow4(pPos, bola_amarilla);
                                    break;
                            }       
                        case 4:
                            switch(OutMatriz[4][pPos])
                            {
                                 case "0":
                                    selectImgRow5(pPos, no_pared);
                                    break;
                                case "*":
                                    selectImgRow5(pPos, pared);
                                    break;
                                case "1":
                                    selectImgRow5(pPos, bola_roja);
                                    break;
                                case "2":
                                    selectImgRow5(pPos, bola_naranja);
                                    break;
                                case "3":
                                    selectImgRow5(pPos, bola_azul);
                                    break;
                                case "4":
                                    selectImgRow5(pPos, bola_amarilla);
                                    break;
                            }                            
                        break;
                }
                //Check the space position
            switch(spacePosition)
            {
                case 0:
                    btnBU1.setEnabled(true);
                    btnBU2.setEnabled(false);
                    btnBU3.setEnabled(false);
                    btnBU4.setEnabled(false);
                    break;
                case 1:
                    btnBU2.setEnabled(true);
                    btnBU1.setEnabled(false);
                    btnBU3.setEnabled(false);
                    btnBU4.setEnabled(false);
                    break;
                case 2:
                    btnBU3.setEnabled(true);
                    btnBU1.setEnabled(false);
                    btnBU2.setEnabled(false);
                    btnBU4.setEnabled(false);
                    break;
                case 3:
                    btnBU4.setEnabled(true);
                    btnBU1.setEnabled(false);
                    btnBU2.setEnabled(false);
                    btnBU3.setEnabled(false);
                    break;

                }
            }
        }
    }
    
    public void refreshMatrixSolution(int pPos,int pDireccion)
    {
        //spacePosition = findSpace(SolutionMatriz);
        if(pDireccion==1)
        {   
            //For: check the row according position
            for(int i = 0; i<4;i++)
            {
                //Position i in the row
                switch(i)
                {
                    case 0:
                        switch(SolutionMatriz.get(pPos).get(0))
                        {
                            case "0":
                                selectImgColumn1Solution(pPos, no_pared_solucion);
                                spacePosition=0;
                                break;
                            case "*":
                                selectImgColumn1Solution(pPos, pared_solucion);
                                break;
                            case "1":
                                selectImgColumn1Solution(pPos, bola_roja_solucion);
                                break;
                            case "2":
                                selectImgColumn1Solution(pPos, bola_naranja_solucion);
                                break;
                            case "3":
                                selectImgColumn1Solution(pPos, bola_azul_solucion);
                                break;
                            case "4":
                                selectImgColumn1Solution(pPos, bola_amarilla_solucion);
                                break;
                        }
                        break;

                        case 1:
                            switch(SolutionMatriz.get(pPos).get(1))
                            {
                                case "0":
                                    selectImgColumn2Solution(pPos, no_pared_solucion);
                                    spacePosition=1;
                                    break;
                                case "*":
                                    selectImgColumn2Solution(pPos, pared_solucion);
                                    break;
                                case "1":
                                    selectImgColumn2Solution(pPos, bola_roja_solucion);
                                    break;
                                case "2":
                                    selectImgColumn2Solution(pPos, bola_naranja_solucion);
                                    break;
                                case "3":
                                    selectImgColumn2Solution(pPos, bola_azul_solucion);
                                    break;
                                case "4":
                                    selectImgColumn2Solution(pPos, bola_amarilla_solucion);
                                    break;
                            }

                        break;

                        case 2:
                            switch(SolutionMatriz.get(pPos).get(2))
                            {
                                 case "0":
                                    selectImgColumn3Solution(pPos, no_pared_solucion);
                                    spacePosition=2;
                                    break;
                                case "*":
                                    selectImgColumn3Solution(pPos, pared_solucion);
                                    break;
                                case "1":
                                    selectImgColumn3Solution(pPos, bola_roja_solucion);
                                    break;
                                case "2":
                                    selectImgColumn3Solution(pPos, bola_naranja_solucion);
                                    break;
                                case "3":
                                    selectImgColumn3Solution(pPos, bola_azul_solucion);
                                    break;
                                case "4":
                                    selectImgColumn3Solution(pPos, bola_amarilla_solucion);
                                    break;
                            }

                        break;

                        case 3:
                            switch(SolutionMatriz.get(pPos).get(3))
                            {
                                 case "0":
                                    selectImgColumn4Solution(pPos, no_pared_solucion);
                                    spacePosition=3;
                                    break;
                                case "*":
                                    selectImgColumn4Solution(pPos, pared_solucion);
                                    break;
                                case "1":
                                    selectImgColumn4Solution(pPos, bola_roja_solucion);
                                    break;
                                case "2":
                                    selectImgColumn4Solution(pPos, bola_naranja_solucion);
                                    break;
                                case "3":
                                    selectImgColumn4Solution(pPos, bola_azul_solucion);
                                    break;
                                case "4":
                                    selectImgColumn4Solution(pPos, bola_amarilla_solucion);
                                    break;
                            }

                        break;   
                }
            }
        }
        else if(pDireccion==2)
        {
            //For: check the row according position
            for(int i = 0; i<5;i++)
            {
                //Position i in the row
                switch(i)
                {
                    case 0:
                        switch(SolutionMatriz.get(0).get(pPos))
                        {
                            case "0":
                                selectImgRow1Solution(pPos, no_pared_solucion);
                                break;
                            case "*":
                                selectImgRow1Solution(pPos, pared_solucion);
                                break;
                            case "1":
                                selectImgRow1Solution(pPos, bola_roja_solucion);
                                break;
                            case "2":
                                selectImgRow1Solution(pPos, bola_naranja_solucion);
                                break;
                            case "3":
                                selectImgRow1Solution(pPos, bola_azul_solucion);
                                break;
                            case "4":
                                selectImgRow1Solution(pPos, bola_amarilla_solucion);
                                break;
                        }

                        break;

                        case 1:
                                                
                                switch(SolutionMatriz.get(1).get(pPos))
                                {
                                    case "0":
                                        selectImgRow2Solution(pPos, no_pared_solucion);
                                        break;
                                    case "*":
                                        selectImgRow2Solution(pPos, pared_solucion);
                                        break;
                                    case "1":
                                        selectImgRow2Solution(pPos, bola_roja_solucion);
                                        break;
                                    case "2":
                                        selectImgRow2Solution(pPos, bola_naranja_solucion);
                                        break;
                                    case "3":
                                        selectImgRow2Solution(pPos, bola_azul_solucion);
                                        break;
                                    case "4":
                                        selectImgRow2Solution(pPos, bola_amarilla_solucion);
                                        break;
                            }

                        break;

                        case 2:
                            switch(SolutionMatriz.get(2).get(pPos))
                            {
                                 case "0":
                                    selectImgRow3Solution(pPos, no_pared_solucion);
                                    break;
                                case "*":
                                    selectImgRow3Solution(pPos, pared_solucion);
                                    break;
                                case "1":
                                    selectImgRow3Solution(pPos, bola_roja_solucion);
                                    break;
                                case "2":
                                    selectImgRow3Solution(pPos, bola_naranja_solucion);
                                    break;
                                case "3":
                                    selectImgRow3Solution(pPos, bola_azul_solucion);
                                    break;
                                case "4":
                                    selectImgRow3Solution(pPos, bola_amarilla_solucion);
                                    break;
                            }

                        break;

                        case 3:
                            switch(SolutionMatriz.get(3).get(pPos))
                            {
                                 case "0":
                                    selectImgRow4Solution(pPos, no_pared_solucion);
                                    
                                    break;
                                case "*":
                                    selectImgRow4Solution(pPos, pared_solucion);
                                    break;
                                case "1":
                                    selectImgRow4Solution(pPos, bola_roja_solucion);
                                    break;
                                case "2":
                                    selectImgRow4Solution(pPos, bola_naranja_solucion);
                                    break;
                                case "3":
                                    selectImgRow4Solution(pPos, bola_azul_solucion);
                                    break;
                                case "4":
                                    selectImgRow4Solution(pPos, bola_amarilla_solucion);
                                    break;
                            }       
                        case 4:
                            switch(SolutionMatriz.get(4).get(pPos))
                            {
                                 case "0":
                                    selectImgRow5Solution(pPos, no_pared_solucion);
                                    break;
                                case "*":
                                    selectImgRow5Solution(pPos, pared_solucion);
                                    break;
                                case "1":
                                    selectImgRow5Solution(pPos, bola_roja_solucion);
                                    break;
                                case "2":
                                    selectImgRow5Solution(pPos, bola_naranja_solucion);
                                    break;
                                case "3":
                                    selectImgRow5Solution(pPos, bola_azul_solucion);
                                    break;
                                case "4":
                                    selectImgRow5Solution(pPos, bola_amarilla_solucion);
                                    break;
                            }                            
                        break;
                }
                //Check the space position
            }
        }
    }
    public void selectImgColumn1(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblB11.setIcon(image);
                break;
            case 1:
                lblB21.setIcon(image);
                break;
            case 2:
                lblB31.setIcon(image);
                break;
            case 3:
                lblB41.setIcon(image);
                break;
            case 4:
                lblB51.setIcon(image);
                break;
        }
    }
    
    public void selectImgRow1(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblB11.setIcon(image);
                break;
            case 1:
                lblB12.setIcon(image);
                break;
            case 2:
                lblB13.setIcon(image);
                break;
            case 3:
                lblB14.setIcon(image);
                break;   
        }
    }
    
    public void selectImgColumn2(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblB12.setIcon(image);
                break;
            case 1:
                lblB22.setIcon(image);
                break;
            case 2:
                lblB32.setIcon(image);
                break;
            case 3:
                lblB42.setIcon(image);
                break;
            case 4:
                lblB52.setIcon(image);
                break;
        }
    }
    
    public void selectImgRow2(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblB21.setIcon(image);
                break;
            case 1:
                lblB22.setIcon(image);
                break;
            case 2:
                lblB23.setIcon(image);
                break;
            case 3:
                lblB24.setIcon(image);
                break; 
        }
    }
    
    public void selectImgColumn3(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblB13.setIcon(image);
                break;
            case 1:
                lblB23.setIcon(image);
                break;
            case 2:
                lblB33.setIcon(image);
                break;
            case 3:
                lblB43.setIcon(image);
                break;
            case 4:
                lblB53.setIcon(image);
                break;
        }
    }
    
    public void selectImgRow3(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblB31.setIcon(image);
                break;
            case 1:
                lblB32.setIcon(image);
                break;
            case 2:
                lblB33.setIcon(image);
                break;
            case 3:
                lblB34.setIcon(image);
                break;
            
        }
    }
    
    public void selectImgColumn4(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblB14.setIcon(image);
                break;
            case 1:
                lblB24.setIcon(image);
                break;
            case 2:
                lblB34.setIcon(image);
                break;
            case 3:
                lblB44.setIcon(image);
                break;
            case 4:
                lblB54.setIcon(image);
                break;
        }
    }
    
    public void selectImgRow4(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblB41.setIcon(image);
                break;
            case 1:
                lblB42.setIcon(image);
                break;
            case 2:
                lblB43.setIcon(image);
                break;
            case 3:
                lblB44.setIcon(image);
                break;
        }
    }
    
    public void selectImgRow5(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblB51.setIcon(image);
                break;
            case 1:
                lblB52.setIcon(image);
                break;
            case 2:
                lblB53.setIcon(image);
                break;
            case 3:
                lblB54.setIcon(image);
                break;
        }
    }
    
    //******************************************************************************
    public void selectImgColumn1Solution(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblC11.setIcon(image);
                break;
            case 1:
                lblC21.setIcon(image);
                break;
            case 2:
                lblC31.setIcon(image);
                break;
            case 3:
                lblC41.setIcon(image);
                break;
            case 4:
                lblC51.setIcon(image);
                break;
        }
    }
    
    public void selectImgRow1Solution(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblC11.setIcon(image);
                break;
            case 1:
                lblC12.setIcon(image);
                break;
            case 2:
                lblC13.setIcon(image);
                break;
            case 3:
                lblC14.setIcon(image);
                break;   
        }
    }
    
    public void selectImgColumn2Solution(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblC12.setIcon(image);
                break;
            case 1:
                lblC22.setIcon(image);
                break;
            case 2:
                lblC32.setIcon(image);
                break;
            case 3:
                lblC42.setIcon(image);
                break;
            case 4:
                lblC52.setIcon(image);
                break;
        }
    }
    
    public void selectImgRow2Solution(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblC21.setIcon(image);
                break;
            case 1:
                lblC22.setIcon(image);
                break;
            case 2:
                lblC23.setIcon(image);
                break;
            case 3:
                lblC24.setIcon(image);
                break; 
        }
    }
    
    public void selectImgColumn3Solution(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblC13.setIcon(image);
                break;
            case 1:
                lblC23.setIcon(image);
                break;
            case 2:
                lblC33.setIcon(image);
                break;
            case 3:
                lblC43.setIcon(image);
                break;
            case 4:
                lblC53.setIcon(image);
                break;
        }
    }
    
    public void selectImgRow3Solution(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblC31.setIcon(image);
                break;
            case 1:
                lblC32.setIcon(image);
                break;
            case 2:
                lblC33.setIcon(image);
                break;
            case 3:
                lblC34.setIcon(image);
                break;
            
        }
    }
    
    public void selectImgColumn4Solution(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblC14.setIcon(image);
                break;
            case 1:
                lblC24.setIcon(image);
                break;
            case 2:
                lblC34.setIcon(image);
                break;
            case 3:
                lblC44.setIcon(image);
                break;
            case 4:
                lblC54.setIcon(image);
                break;
        }
    }
    
    public void selectImgRow4Solution(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblC41.setIcon(image);
                break;
            case 1:
                lblC42.setIcon(image);
                break;
            case 2:
                lblC43.setIcon(image);
                break;
            case 3:
                lblC44.setIcon(image);
                break;
        }
    }
    
    public void selectImgRow5Solution(int pPos,ImageIcon image)
    {
        switch(pPos)
        {
            case 0:
                lblC51.setIcon(image);
                break;
            case 1:
                lblC52.setIcon(image);
                break;
            case 2:
                lblC53.setIcon(image);
                break;
            case 3:
                lblC54.setIcon(image);
                break;
        }
    }
    //******************************************************************************
    
    public void refreshMatrix()
    {
        btnAL1.setIcon(flecha_izquierda);
        btnAL1.setFocusable(false);
        btnAL2.setIcon(flecha_izquierda);
        btnAL2.setFocusable(false);
        btnAL3.setIcon(flecha_izquierda);
        btnAL3.setFocusable(false);
        btnAL4.setIcon(flecha_izquierda);
        btnAL4.setFocusable(false);
        btnAL5.setIcon(flecha_izquierda);
        btnAL5.setFocusable(false);
        
        btnAR1.setIcon(flecha_derecha);
        btnAR1.setFocusable(false);
        btnAR2.setIcon(flecha_derecha);
        btnAR2.setFocusable(false);
        btnAR3.setIcon(flecha_derecha);
        btnAR3.setFocusable(false);
        btnAR4.setIcon(flecha_derecha);
        btnAR4.setFocusable(false);
        btnAR5.setIcon(flecha_derecha);
        btnAR5.setFocusable(false);
        
        btnAU1.setIcon(flecha_arriba);
        btnAU1.setFocusable(false);
        btnAU2.setIcon(flecha_arriba);
        btnAU2.setFocusable(false);
        btnAU3.setIcon(flecha_arriba);
        btnAU3.setFocusable(false);
        btnAU4.setIcon(flecha_arriba);
        btnAU4.setFocusable(false);
        
        
        btnAD1.setIcon(flecha_abajo);
        btnAD1.setFocusable(false);
        btnAD2.setIcon(flecha_abajo);
        btnAD2.setFocusable(false);
        btnAD3.setIcon(flecha_abajo);
        btnAD3.setFocusable(false);
        btnAD4.setIcon(flecha_abajo);
        btnAD4.setFocusable(false);
        
        actualizar_interfazA(0, 1);
        actualizar_interfazA(1, 1);
        actualizar_interfazA(2, 1);
        actualizar_interfazA(3, 1);
        actualizar_interfazA(4, 1);
    }
    
    public void refreshMatrixB()
    {
        btnBL1.setIcon(flecha_izquierda);
        btnBL1.setFocusable(false);
        btnBL2.setIcon(flecha_izquierda);
        btnBL2.setFocusable(false);
        btnBL3.setIcon(flecha_izquierda);
        btnBL3.setFocusable(false);
        btnBL4.setIcon(flecha_izquierda);
        btnBL4.setFocusable(false);
        btnBL5.setIcon(flecha_izquierda);
        btnBL5.setFocusable(false);
        
        btnBR1.setIcon(flecha_derecha);
        btnBR1.setFocusable(false);
        btnBR2.setIcon(flecha_derecha);
        btnBR2.setFocusable(false);
        btnBR3.setIcon(flecha_derecha);
        btnBR3.setFocusable(false);
        btnBR4.setIcon(flecha_derecha);
        btnBR4.setFocusable(false);
        btnBR5.setIcon(flecha_derecha);
        btnBR5.setFocusable(false);
       
        btnBU1.setIcon(flecha_arriba);
        btnBU1.setFocusable(false);
        btnBU2.setIcon(flecha_arriba);
        btnBU2.setFocusable(false);
        btnBU3.setIcon(flecha_arriba);
        btnBU3.setFocusable(false);
        btnBU4.setIcon(flecha_arriba);
        btnBU4.setFocusable(false);
        
        
        btnBD1.setIcon(flecha_abajo);
        btnBD1.setFocusable(false);
        btnBD2.setIcon(flecha_abajo);
        btnBD2.setFocusable(false);
        btnBD3.setIcon(flecha_abajo);
        btnBD3.setFocusable(false);
        btnBD4.setIcon(flecha_abajo);
        btnBD4.setFocusable(false);
        
        refreshMatrixB(0, 1);
        refreshMatrixB(1, 1);
        refreshMatrixB(2, 1);
        refreshMatrixB(3, 1);
        refreshMatrixB(4, 1);
    }
    
    public void refreshMatrixSolution()
    {
        btnCL1.setIcon(flecha_derecha_solucion);
        btnCR1.setIcon(flecha_izquierda_solucion);
        
        
        refreshMatrixSolution(0, 1);
        refreshMatrixSolution(1, 1);
        refreshMatrixSolution(2, 1);
        refreshMatrixSolution(3, 1);
        refreshMatrixSolution(4, 1);
        
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAD1;
    private javax.swing.JButton btnAD2;
    private javax.swing.JButton btnAD3;
    private javax.swing.JButton btnAD4;
    private javax.swing.JButton btnAL1;
    private javax.swing.JButton btnAL2;
    private javax.swing.JButton btnAL3;
    private javax.swing.JButton btnAL4;
    private javax.swing.JButton btnAL5;
    private javax.swing.JButton btnAR1;
    private javax.swing.JButton btnAR2;
    private javax.swing.JButton btnAR3;
    private javax.swing.JButton btnAR4;
    private javax.swing.JButton btnAR5;
    private javax.swing.JButton btnAU1;
    private javax.swing.JButton btnAU2;
    private javax.swing.JButton btnAU3;
    private javax.swing.JButton btnAU4;
    private javax.swing.JButton btnBD1;
    private javax.swing.JButton btnBD2;
    private javax.swing.JButton btnBD3;
    private javax.swing.JButton btnBD4;
    private javax.swing.JButton btnBL1;
    private javax.swing.JButton btnBL2;
    private javax.swing.JButton btnBL3;
    private javax.swing.JButton btnBL4;
    private javax.swing.JButton btnBL5;
    private javax.swing.JButton btnBR1;
    private javax.swing.JButton btnBR2;
    private javax.swing.JButton btnBR3;
    private javax.swing.JButton btnBR4;
    private javax.swing.JButton btnBR5;
    private javax.swing.JButton btnBU1;
    private javax.swing.JButton btnBU2;
    private javax.swing.JButton btnBU3;
    private javax.swing.JButton btnBU4;
    private javax.swing.JButton btnCL1;
    private javax.swing.JButton btnCR1;
    private javax.swing.JButton btnCargarA;
    private javax.swing.JButton btnCargarB;
    private javax.swing.JButton btnDescargarA;
    private javax.swing.JButton btnDescargarB;
    private javax.swing.JButton btnDownload;
    private javax.swing.JButton btnGenerarSolucion;
    private javax.swing.JButton btnRestartA;
    private javax.swing.JButton btnRestartB;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JLabel lblA11;
    private javax.swing.JLabel lblA12;
    private javax.swing.JLabel lblA13;
    private javax.swing.JLabel lblA14;
    private javax.swing.JLabel lblA21;
    private javax.swing.JLabel lblA22;
    private javax.swing.JLabel lblA23;
    private javax.swing.JLabel lblA24;
    private javax.swing.JLabel lblA31;
    private javax.swing.JLabel lblA32;
    private javax.swing.JLabel lblA33;
    private javax.swing.JLabel lblA34;
    private javax.swing.JLabel lblA41;
    private javax.swing.JLabel lblA42;
    private javax.swing.JLabel lblA43;
    private javax.swing.JLabel lblA44;
    private javax.swing.JLabel lblA51;
    private javax.swing.JLabel lblA52;
    private javax.swing.JLabel lblA53;
    private javax.swing.JLabel lblA54;
    private javax.swing.JLabel lblB11;
    private javax.swing.JLabel lblB12;
    private javax.swing.JLabel lblB13;
    private javax.swing.JLabel lblB14;
    private javax.swing.JLabel lblB21;
    private javax.swing.JLabel lblB22;
    private javax.swing.JLabel lblB23;
    private javax.swing.JLabel lblB24;
    private javax.swing.JLabel lblB31;
    private javax.swing.JLabel lblB32;
    private javax.swing.JLabel lblB33;
    private javax.swing.JLabel lblB34;
    private javax.swing.JLabel lblB41;
    private javax.swing.JLabel lblB42;
    private javax.swing.JLabel lblB43;
    private javax.swing.JLabel lblB44;
    private javax.swing.JLabel lblB51;
    private javax.swing.JLabel lblB52;
    private javax.swing.JLabel lblB53;
    private javax.swing.JLabel lblB54;
    private javax.swing.JLabel lblC11;
    private javax.swing.JLabel lblC12;
    private javax.swing.JLabel lblC13;
    private javax.swing.JLabel lblC14;
    private javax.swing.JLabel lblC21;
    private javax.swing.JLabel lblC22;
    private javax.swing.JLabel lblC23;
    private javax.swing.JLabel lblC24;
    private javax.swing.JLabel lblC31;
    private javax.swing.JLabel lblC32;
    private javax.swing.JLabel lblC33;
    private javax.swing.JLabel lblC34;
    private javax.swing.JLabel lblC41;
    private javax.swing.JLabel lblC42;
    private javax.swing.JLabel lblC43;
    private javax.swing.JLabel lblC44;
    private javax.swing.JLabel lblC51;
    private javax.swing.JLabel lblC52;
    private javax.swing.JLabel lblC53;
    private javax.swing.JLabel lblC54;
    // End of variables declaration//GEN-END:variables
}

package proyecto_ghost;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.RowSorter.SortKey;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class GhostGameFrame extends javax.swing.JFrame implements ActionListener {

    private char turnoJugador = 'A';
    private String tablero[][];
    private String posicionAntigua = null, posicionNueva = null, posicionActual, enemy, dificultad = "normal", modo = "aleatorio", posColocar = "";
    private int Fichasb1 = 0, Fichasb2 = 0, Fichasm1 = 0, Fichasm2 = 0, cont = 0;
    private boolean victoria = false, colocadas = false;

    public GhostGameFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        tablero_panel.hide();
        MiPerfil_panel.hide();
        Reportes_Panel.hide();
        Ranking_panel.hide();
        cofig_panel.hide();
        agregarAcciones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dificultad_rbg = new javax.swing.ButtonGroup();
        modalidad_rbg = new javax.swing.ButtonGroup();
        tablero_panel = new javax.swing.JPanel();
        pos66 = new javax.swing.JButton();
        pos65 = new javax.swing.JButton();
        pos64 = new javax.swing.JButton();
        pos63 = new javax.swing.JButton();
        pos62 = new javax.swing.JButton();
        pos61 = new javax.swing.JButton();
        pos56 = new javax.swing.JButton();
        pos55 = new javax.swing.JButton();
        pos54 = new javax.swing.JButton();
        pos53 = new javax.swing.JButton();
        pos52 = new javax.swing.JButton();
        pos51 = new javax.swing.JButton();
        pos41 = new javax.swing.JButton();
        pos42 = new javax.swing.JButton();
        pos43 = new javax.swing.JButton();
        pos44 = new javax.swing.JButton();
        pos45 = new javax.swing.JButton();
        pos46 = new javax.swing.JButton();
        pos36 = new javax.swing.JButton();
        pos35 = new javax.swing.JButton();
        pos34 = new javax.swing.JButton();
        pos33 = new javax.swing.JButton();
        pos32 = new javax.swing.JButton();
        pos31 = new javax.swing.JButton();
        pos21 = new javax.swing.JButton();
        pos22 = new javax.swing.JButton();
        pos23 = new javax.swing.JButton();
        pos24 = new javax.swing.JButton();
        pos25 = new javax.swing.JButton();
        pos26 = new javax.swing.JButton();
        pos16 = new javax.swing.JButton();
        pos15 = new javax.swing.JButton();
        pos14 = new javax.swing.JButton();
        pos13 = new javax.swing.JButton();
        pos11 = new javax.swing.JButton();
        pos12 = new javax.swing.JButton();
        surrender_bt = new javax.swing.JButton();
        lbl_fantasmas2 = new javax.swing.JLabel();
        lbl_fantasmas1 = new javax.swing.JLabel();
        lbl_b2 = new javax.swing.JLabel();
        lbl_m2 = new javax.swing.JLabel();
        lbl_b1 = new javax.swing.JLabel();
        lbl_m1 = new javax.swing.JLabel();
        lbl_turno = new javax.swing.JLabel();
        jugador_turno = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menu_panel = new javax.swing.JPanel();
        jugar_bt = new javax.swing.JButton();
        reportes_bt = new javax.swing.JButton();
        perfil_bt = new javax.swing.JButton();
        salir_bt = new javax.swing.JButton();
        config_bt = new javax.swing.JButton();
        Title_lbl = new javax.swing.JLabel();
        Fondo1_lbl = new javax.swing.JLabel();
        MiPerfil_panel = new javax.swing.JPanel();
        Titulo_lbl = new javax.swing.JLabel();
        verdatos_bt = new javax.swing.JButton();
        cambiarpas_bt = new javax.swing.JButton();
        eliminar_bt = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        fondomp_lbl = new javax.swing.JLabel();
        Ranking_panel = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_players = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        Reportes_Panel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cofig_panel = new javax.swing.JPanel();
        dificult_rb1 = new javax.swing.JRadioButton();
        dificult_rb2 = new javax.swing.JRadioButton();
        dificult_rb3 = new javax.swing.JRadioButton();
        modalidad_1 = new javax.swing.JRadioButton();
        modalidad_2 = new javax.swing.JRadioButton();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        tablero_panel.setBackground(new java.awt.Color(51, 51, 51));
        tablero_panel.setPreferredSize(new java.awt.Dimension(800, 900));
        tablero_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pos66.setContentAreaFilled(false);
        tablero_panel.add(pos66, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 640, 100, 100));

        pos65.setContentAreaFilled(false);
        tablero_panel.add(pos65, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 650, 90, 90));

        pos64.setContentAreaFilled(false);
        tablero_panel.add(pos64, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 640, 100, 100));

        pos63.setContentAreaFilled(false);
        tablero_panel.add(pos63, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 650, 100, 90));

        pos62.setContentAreaFilled(false);
        tablero_panel.add(pos62, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 640, 110, 100));

        pos61.setContentAreaFilled(false);
        tablero_panel.add(pos61, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 650, 100, 90));

        pos56.setContentAreaFilled(false);
        tablero_panel.add(pos56, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 550, 90, 90));

        pos55.setContentAreaFilled(false);
        tablero_panel.add(pos55, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 540, 110, 100));

        pos54.setContentAreaFilled(false);
        tablero_panel.add(pos54, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, 90, 90));

        pos53.setContentAreaFilled(false);
        tablero_panel.add(pos53, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, 100, 100));

        pos52.setContentAreaFilled(false);
        tablero_panel.add(pos52, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, 100, 90));

        pos51.setContentAreaFilled(false);
        tablero_panel.add(pos51, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 100, 100));

        pos41.setContentAreaFilled(false);
        tablero_panel.add(pos41, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 100, 90));

        pos42.setContentAreaFilled(false);
        tablero_panel.add(pos42, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 110, 100));

        pos43.setContentAreaFilled(false);
        tablero_panel.add(pos43, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 100, 90));

        pos44.setContentAreaFilled(false);
        tablero_panel.add(pos44, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 100, 100));

        pos45.setContentAreaFilled(false);
        tablero_panel.add(pos45, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 90, 90));

        pos46.setContentAreaFilled(false);
        tablero_panel.add(pos46, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 450, 90, 90));

        pos36.setContentAreaFilled(false);
        tablero_panel.add(pos36, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 90, 90));

        pos35.setContentAreaFilled(false);
        tablero_panel.add(pos35, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 110, 100));

        pos34.setContentAreaFilled(false);
        tablero_panel.add(pos34, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 90, 90));

        pos33.setContentAreaFilled(false);
        tablero_panel.add(pos33, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 100, 100));

        pos32.setContentAreaFilled(false);
        tablero_panel.add(pos32, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 100, 100));

        pos31.setContentAreaFilled(false);
        tablero_panel.add(pos31, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 100, 100));

        pos21.setContentAreaFilled(false);
        tablero_panel.add(pos21, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 90, 90));

        pos22.setContentAreaFilled(false);
        tablero_panel.add(pos22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 120, 100));

        pos23.setContentAreaFilled(false);
        tablero_panel.add(pos23, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 90, 100));

        pos24.setContentAreaFilled(false);
        tablero_panel.add(pos24, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 110, 100));

        pos25.setContentAreaFilled(false);
        tablero_panel.add(pos25, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 90, 100));

        pos26.setContentAreaFilled(false);
        tablero_panel.add(pos26, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 100, 100));

        pos16.setContentAreaFilled(false);
        tablero_panel.add(pos16, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 90, 90));

        pos15.setContentAreaFilled(false);
        tablero_panel.add(pos15, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 100, 90));

        pos14.setContentAreaFilled(false);
        tablero_panel.add(pos14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 90, 90));

        pos13.setContentAreaFilled(false);
        tablero_panel.add(pos13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 100, 90));

        pos11.setContentAreaFilled(false);
        tablero_panel.add(pos11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 110, 90));

        pos12.setContentAreaFilled(false);
        tablero_panel.add(pos12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 100, 90));

        surrender_bt.setText("Rendirse");
        surrender_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surrender_btActionPerformed(evt);
            }
        });
        tablero_panel.add(surrender_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 760, -1, -1));

        lbl_fantasmas2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        lbl_fantasmas2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_fantasmas2.setText("Fantasmas J2");
        tablero_panel.add(lbl_fantasmas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, -1, -1));

        lbl_fantasmas1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        lbl_fantasmas1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_fantasmas1.setText("Fantasmas J1");
        tablero_panel.add(lbl_fantasmas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 150, -1));

        lbl_b2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 16)); // NOI18N
        lbl_b2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_b2.setText("Fantasmas Buenos: ");
        tablero_panel.add(lbl_b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, -1, -1));

        lbl_m2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 16)); // NOI18N
        lbl_m2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_m2.setText("Fantasmas Malos: ");
        tablero_panel.add(lbl_m2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, -1, -1));

        lbl_b1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 16)); // NOI18N
        lbl_b1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_b1.setText("Fantasmas Buenos: ");
        tablero_panel.add(lbl_b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        lbl_m1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 16)); // NOI18N
        lbl_m1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_m1.setText("Fantasmas Malos: ");
        tablero_panel.add(lbl_m1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        lbl_turno.setFont(new java.awt.Font("Tempus Sans ITC", 2, 24)); // NOI18N
        lbl_turno.setForeground(new java.awt.Color(255, 255, 255));
        lbl_turno.setText("Turno");
        tablero_panel.add(lbl_turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        jugador_turno.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        jugador_turno.setForeground(new java.awt.Color(255, 255, 255));
        jugador_turno.setText("Jugador 1");
        tablero_panel.add(jugador_turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 110, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tablero.jpg"))); // NOI18N
        tablero_panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 600, 580));

        menu_panel.setBackground(new java.awt.Color(51, 51, 51));
        menu_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jugar_bt.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        jugar_bt.setText("Jugar Ghosts");
        jugar_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugar_btActionPerformed(evt);
            }
        });
        menu_panel.add(jugar_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 240, 50));

        reportes_bt.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        reportes_bt.setText("Reportes");
        reportes_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportes_btActionPerformed(evt);
            }
        });
        menu_panel.add(reportes_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 240, 50));

        perfil_bt.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        perfil_bt.setText("Mi Perfil");
        perfil_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfil_btActionPerformed(evt);
            }
        });
        menu_panel.add(perfil_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 240, 50));

        salir_bt.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        salir_bt.setText("Cerrar Sesion");
        salir_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir_btActionPerformed(evt);
            }
        });
        menu_panel.add(salir_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 240, 50));

        config_bt.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        config_bt.setText("Configuracion");
        config_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                config_btActionPerformed(evt);
            }
        });
        menu_panel.add(config_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 240, 50));

        Title_lbl.setFont(new java.awt.Font("Algerian", 3, 82)); // NOI18N
        Title_lbl.setForeground(new java.awt.Color(153, 255, 0));
        Title_lbl.setText("Menu Principal");
        menu_panel.add(Title_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 680, -1));

        Fondo1_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoGhosts.jpg"))); // NOI18N
        menu_panel.add(Fondo1_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        MiPerfil_panel.setBackground(new java.awt.Color(51, 51, 51));
        MiPerfil_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo_lbl.setFont(new java.awt.Font("Algerian", 3, 72)); // NOI18N
        Titulo_lbl.setForeground(new java.awt.Color(153, 255, 0));
        Titulo_lbl.setText("Mi Perfil");
        MiPerfil_panel.add(Titulo_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 360, -1));

        verdatos_bt.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        verdatos_bt.setText("Ver Mis Datos");
        verdatos_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verdatos_btActionPerformed(evt);
            }
        });
        MiPerfil_panel.add(verdatos_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 180, 40));

        cambiarpas_bt.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        cambiarpas_bt.setText("Cambiar Contraseña");
        cambiarpas_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarpas_btActionPerformed(evt);
            }
        });
        MiPerfil_panel.add(cambiarpas_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 180, 40));

        eliminar_bt.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        eliminar_bt.setText("Eliminar Cuenta");
        eliminar_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_btActionPerformed(evt);
            }
        });
        MiPerfil_panel.add(eliminar_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 180, 40));

        jButton3.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        MiPerfil_panel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        fondomp_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoGhosts.jpg"))); // NOI18N
        MiPerfil_panel.add(fondomp_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 510));

        Ranking_panel.setBackground(new java.awt.Color(51, 51, 51));
        Ranking_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        jButton5.setText("Regresar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        Ranking_panel.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, -1, -1));

        jLabel6.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 255, 0));
        jLabel6.setText("Ranking Jugadores");
        Ranking_panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        Tabla_players.setAutoCreateRowSorter(true);
        Tabla_players.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        Tabla_players.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Usuario", "Puntos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_players.setSelectionBackground(new java.awt.Color(0, 0, 0));
        Tabla_players.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(Tabla_players);
        if (Tabla_players.getColumnModel().getColumnCount() > 0) {
            Tabla_players.getColumnModel().getColumn(0).setResizable(false);
            Tabla_players.getColumnModel().getColumn(0).setPreferredWidth(10);
            Tabla_players.getColumnModel().getColumn(1).setResizable(false);
        }

        Ranking_panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 420, 430));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoGhosts.jpg"))); // NOI18N
        Ranking_panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 560, 620));

        Reportes_Panel.setBackground(new java.awt.Color(51, 51, 51));
        Reportes_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Algerian", 3, 12)); // NOI18N
        jButton1.setText("Ranking de Jugadores");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Reportes_Panel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 190, 50));

        jButton2.setFont(new java.awt.Font("Algerian", 3, 12)); // NOI18N
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Reportes_Panel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 100, 30));

        jButton4.setFont(new java.awt.Font("Algerian", 3, 12)); // NOI18N
        jButton4.setText("Ver ultimos 10 juegos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Reportes_Panel.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 190, 50));

        jLabel4.setFont(new java.awt.Font("Algerian", 3, 72)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 0));
        jLabel4.setText("Reportes");
        Reportes_Panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoGhosts.jpg"))); // NOI18N
        Reportes_Panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 390));

        cofig_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dificult_rb1.setBackground(new java.awt.Color(0, 0, 0));
        dificultad_rbg.add(dificult_rb1);
        dificult_rb1.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        dificult_rb1.setForeground(new java.awt.Color(153, 255, 0));
        dificult_rb1.setText("expert");
        dificult_rb1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dificult_rb1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cofig_panel.add(dificult_rb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 110, -1));

        dificult_rb2.setBackground(new java.awt.Color(0, 0, 0));
        dificultad_rbg.add(dificult_rb2);
        dificult_rb2.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        dificult_rb2.setForeground(new java.awt.Color(153, 255, 0));
        dificult_rb2.setText("genius");
        dificult_rb2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dificult_rb2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cofig_panel.add(dificult_rb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 110, -1));

        dificult_rb3.setBackground(new java.awt.Color(0, 0, 0));
        dificultad_rbg.add(dificult_rb3);
        dificult_rb3.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        dificult_rb3.setForeground(new java.awt.Color(153, 255, 0));
        dificult_rb3.setSelected(true);
        dificult_rb3.setText("normal");
        dificult_rb3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dificult_rb3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cofig_panel.add(dificult_rb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 110, -1));

        modalidad_1.setBackground(new java.awt.Color(0, 0, 0));
        modalidad_rbg.add(modalidad_1);
        modalidad_1.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        modalidad_1.setForeground(new java.awt.Color(153, 255, 0));
        modalidad_1.setSelected(true);
        modalidad_1.setText("aleatorio");
        modalidad_1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cofig_panel.add(modalidad_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 100, -1));

        modalidad_2.setBackground(new java.awt.Color(0, 0, 0));
        modalidad_rbg.add(modalidad_2);
        modalidad_2.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        modalidad_2.setForeground(new java.awt.Color(153, 255, 0));
        modalidad_2.setText("manual");
        modalidad_2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cofig_panel.add(modalidad_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 100, -1));

        jButton6.setText("Aceptar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        cofig_panel.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, -1, -1));

        jLabel9.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 255, 0));
        jLabel9.setText("Modalidad de Juego");
        cofig_panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 270, 30));

        jLabel10.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 255, 0));
        jLabel10.setText("Dificultad");
        cofig_panel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 150, 30));

        jLabel8.setFont(new java.awt.Font("Algerian", 3, 72)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 255, 0));
        jLabel8.setText("Configuracion");
        cofig_panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoGhosts.jpg"))); // NOI18N
        cofig_panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tablero_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(menu_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(MiPerfil_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Reportes_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Ranking_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(cofig_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tablero_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(menu_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(MiPerfil_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Reportes_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Ranking_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(cofig_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void perfil_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfil_btActionPerformed
        MiPerfil_panel.show();
        menu_panel.hide();
    }//GEN-LAST:event_perfil_btActionPerformed

    private void salir_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir_btActionPerformed
        main mn = new main();
        this.setVisible(false);
        mn.setVisible(true);
    }//GEN-LAST:event_salir_btActionPerformed

    private void jugar_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugar_btActionPerformed
        vaciarTablero();
        enemy = JOptionPane.showInputDialog(this, "Ingrese el nombre del rival: ");
        if (User.buscarUser(enemy) != null) {
            menu_panel.hide();
            tablero_panel.show();
            if (modo.equals("aleatorio")) {
                generarTablero();
            } else {
                tablero = new String[6][6];
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
                        tablero[i][j] = "";
                    }
                }
                Fichasb1 = 0;
                Fichasm1 = 0;
                Fichasb2 = 0;
                Fichasm2 = 0;
            }
            cont = 0;
            victoria = false;
            colocadas = false;
            turnoJugador = 'A';
        } else {
            JOptionPane.showMessageDialog(this, "No existe un jugador con este nombre!");
        }
    }//GEN-LAST:event_jugar_btActionPerformed

    private void cambiarpas_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarpas_btActionPerformed
        User.buscarUser(main.actualUser.getUser()).setPass(JOptionPane.showInputDialog(this, "Ingrese la nueva contraseña"));
        JOptionPane.showMessageDialog(this, "Se ha actualizado la contraseña");
    }//GEN-LAST:event_cambiarpas_btActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        menu_panel.show();
        MiPerfil_panel.hide();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void verdatos_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verdatos_btActionPerformed
        JOptionPane.showMessageDialog(this, "Usuario: " + main.actualUser.getUser() + "\nPassword: "
                + main.actualUser.getPass() + "\nPuntaje: " + main.actualUser.getPuntos());
    }//GEN-LAST:event_verdatos_btActionPerformed

    private void eliminar_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_btActionPerformed
        JOptionPane.showMessageDialog(this, "Se ha eliminado la cuenta!");
        User.eraseUser(main.actualUser);
        this.setVisible(false);
        main mn = new main();
        mn.setVisible(true);
    }//GEN-LAST:event_eliminar_btActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Reportes_Panel.hide();
        menu_panel.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Ranking_panel.show();
        Reportes_Panel.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String reportes = "";
        int cont = 1;
        if (main.actualUser.getLogs().size() >= 10) {
            for (int i = main.actualUser.getLogs().size() - 1; i > 0; i--) {
                if (cont <= 10) {
                    reportes += ("\nJuego #" + cont + " " + main.actualUser.getLogs().get(i));
                }
                cont++;
            }
        } else {
            for (int i = main.actualUser.getLogs().size() - 1; i >= 0; i--) {
                reportes += ("\nJuego #" + cont + " " + main.actualUser.getLogs().get(i));
                cont++;
            }
        }

        JOptionPane.showMessageDialog(this, reportes);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void generarTable() {
        DefaultTableModel rankingUsers = new DefaultTableModel();
        String[] cabecera = {"Posicion", "Usuario", "Puntos"};
        rankingUsers.setColumnIdentifiers(cabecera);
        Tabla_players.setModel(rankingUsers);
        Object[] datos = new Object[rankingUsers.getColumnCount()];
        int i = 1;
        for (User usr : User.users) {
            datos[0] = i;
            datos[1] = usr.getUser();
            datos[2] = usr.getPuntos();
            i++;
            rankingUsers.addRow(datos);
        }
        Tabla_players.setModel(rankingUsers);
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(rankingUsers);
        List<SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new SortKey(0, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);
    }

    private void reportes_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportes_btActionPerformed
        Reportes_Panel.show();
        menu_panel.hide();
        generarTable();
    }//GEN-LAST:event_reportes_btActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Ranking_panel.hide();
        menu_panel.show();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void config_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_config_btActionPerformed
        cofig_panel.show();
        menu_panel.hide();
    }//GEN-LAST:event_config_btActionPerformed

    private void surrender_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surrender_btActionPerformed
        victoria = true;
        String resp = JOptionPane.showInputDialog(this, "Esta seguro que desea rendirse(si,no)?").toLowerCase();
        if (resp.equals("si")) {
            if (turnoJugador == 'B') {
                JOptionPane.showMessageDialog(this, enemy + " se ha rendido\n" + main.actualUser.getUser() + " ha ganado!");
                User.addLog(main.actualUser.getUser(), enemy + " se ha rendido\n" + main.actualUser.getUser() + " ha ganado!");
                User.addLog(enemy, enemy + " se ha rendido\n" + main.actualUser.getUser() + " ha ganado!");
                main.actualUser.addPuntos();
            } else {
                JOptionPane.showMessageDialog(this, main.actualUser.getUser() + " se ha rendido\n" + enemy + " ha ganado!");
                User.addLog(main.actualUser.getUser(), main.actualUser.getUser() + " se ha rendido\n" + enemy + " ha ganado!");
                User.addLog(enemy, main.actualUser.getUser() + " se ha rendido\n" + enemy + " ha ganado!");
                User.buscarUser(enemy).addPuntos();
            }
            tablero_panel.hide();
            menu_panel.show();
        } else {
            JOptionPane.showMessageDialog(this, "La partida continuara!!");
        }

    }//GEN-LAST:event_surrender_btActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        cofig_panel.hide();
        menu_panel.show();
        if (dificult_rb3.isSelected()) {
            dificultad = "normal";
        } else if (dificult_rb1.isSelected()) {
            dificultad = "expert";
        } else if (dificult_rb2.isSelected()) {
            dificultad = "genius";
        }
        if (modalidad_1.isSelected()) {
            modo = "aleatorio";
        } else {
            modo = "manual";
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void vaciarTablero() {
        String posicionVacia = "";
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                posicionVacia = i + "" + j;
                if (boton(posicionVacia).getIcon() != null) {
                    boton(posicionVacia).setIcon(null);
                }
            }
        }
    }

    public void actionPerformed(java.awt.event.ActionEvent ae) {
        int x = -1, y = -1;
        if (modo.equals("aleatorio")) {
            colocadas = true;
        }
        if (colocadas == false) {
            posColocar = getBotonStr(ae.getSource());
            y = Integer.parseInt(Character.toString(posColocar.charAt(0)));
            x = Integer.parseInt(Character.toString(posColocar.charAt(1)));
            if (turnoJugador == 'A') {
                if ((cont == 7 && dificultad.equals("normal")) || (cont == 3 && dificultad.equals("expert"))
                        || (cont == 1 && dificultad.equals("genius"))) {
                    turnoJugador = 'B';
                }
                if ((x >= 1 && x <= 4) && (y == 0 || y == 1)) {
                    if (dificultad.equals("normal") && (Fichasb1) < 4) {
                        Fichasb1++;
                        cont++;
                        tablero[y][x] = "B1";
                    } else if (dificultad.equals("normal") && (Fichasm1) < 4) {
                        Fichasm1++;
                        cont++;
                        tablero[y][x] = "M1";
                    } else if (dificultad.equals("expert") && (Fichasb1) < 2) {
                        Fichasb1++;
                        cont++;
                        tablero[y][x] = "B1";
                    } else if (dificultad.equals("expert") && (Fichasm1) < 2) {
                        Fichasm1++;
                        cont++;
                        tablero[y][x] = "M1";
                    } else if (dificultad.equals("genius") && (Fichasb1) < 1) {
                        Fichasb1++;
                        cont++;
                        tablero[y][x] = "B1";
                    } else if (dificultad.equals("genius") && (Fichasm1) < 1) {
                        Fichasm1++;
                        cont++;
                        tablero[y][x] = "M1";
                    }
                    boton(posColocar).setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blanco.png")));
                }
            } else {
                if ((cont == 15 && dificultad.equals("normal")) || (cont == 7 && dificultad.equals("expert"))
                        || (cont == 3 && dificultad.equals("genius"))) {
                    turnoJugador = 'A';
                    colocadas = true;
                }
                if (x >= 1 && x <= 4 && y == 4 || y == 5) {
                    if (dificultad.equals("normal") && (Fichasb2) < 4) {
                        Fichasb2++;
                        cont++;
                        tablero[y][x] = "B2";
                    } else if (dificultad.equals("normal") && (Fichasm2) < 4) {
                        Fichasm2++;
                        cont++;
                        tablero[y][x] = "M2";
                    } else if (dificultad.equals("expert") && (Fichasb2) < 2) {
                        Fichasb2++;
                        cont++;
                        tablero[y][x] = "B2";
                    } else if (dificultad.equals("expert") && (Fichasm2) < 2) {
                        Fichasm2++;
                        cont++;
                        tablero[y][x] = "M2";
                    } else if (dificultad.equals("genius") && (Fichasb2) < 1) {
                        Fichasb2++;
                        cont++;
                        tablero[y][x] = "B2";
                    } else if (dificultad.equals("genius") && (Fichasm2) < 1) {
                        Fichasm2++;
                        cont++;
                        tablero[y][x] = "M2";
                    }
                    boton(posColocar).setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/negro.png")));
                }
            }
        }
        if (victoria == false && colocadas == true) {
            if (turnoJugador == 'A') {
                posicionActual = getBotonStr(ae.getSource());
                x = Integer.parseInt(Character.toString(posicionActual.charAt(0)));
                y = Integer.parseInt(Character.toString(posicionActual.charAt(1)));
                if (tablero[x][y].equals("B1") || tablero[x][y].equals("M1")) {
                    posicionAntigua = posicionActual;
                } else if (posicionAntigua != null) {
                    posicionNueva = posicionActual;
                    if (movimientoPosible(posicionAntigua, posicionNueva, 'A')) {
                        int oldx = Integer.parseInt(Character.toString(posicionAntigua.charAt(0)));
                        int oldy = Integer.parseInt(Character.toString(posicionAntigua.charAt(1)));

                        if (tablero[x][y].equals("B2")) {
                            Fichasb2--;
                            JOptionPane.showMessageDialog(this, "Jugador 1 se ha comido\nun fantasma bueno del jugador 2");
                        } else if (tablero[x][y].equals("M2")) {
                            Fichasm2--;
                            JOptionPane.showMessageDialog(this, "Jugador 1 se ha comido\nun fantasma malo del jugador 2");
                        }
                        if (tablero[oldx][oldy].equals("B1")) {
                            tablero[x][y] = "B1";
                        } else if (tablero[oldx][oldy].equals("M1")) {
                            tablero[x][y] = "M1";
                        }
                        tablero[oldx][oldy] = "";
                        boton(posicionAntigua).setIcon(null);
                        boton(posicionNueva).setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blanco.png")));
                        turnoJugador = 'B';
                        jugador_turno.setText("Jugador 2");
                        posicionAntigua = null;
                    } else {
                        posicionNueva = null;
                    }
                }
            } else if (turnoJugador == 'B') {
                posicionActual = getBotonStr(ae.getSource());
                x = Integer.parseInt(Character.toString(posicionActual.charAt(0)));
                y = Integer.parseInt(Character.toString(posicionActual.charAt(1)));
                System.out.println(posicionActual);
                if (tablero[x][y].equals("B2") || tablero[x][y].equals("M2")) {
                    posicionAntigua = posicionActual;
                } else if (posicionAntigua != null) {
                    posicionNueva = posicionActual;
                    if (movimientoPosible(posicionAntigua, posicionNueva, 'B')) {
                        int oldx = Integer.parseInt(Character.toString(posicionAntigua.charAt(0)));
                        int oldy = Integer.parseInt(Character.toString(posicionAntigua.charAt(1)));
                        tablero[oldx][oldy] = "";
                        if (tablero[x][y].equals("B1")) {
                            Fichasb1--;
                            JOptionPane.showMessageDialog(this, "Jugador 2 se ha comido\nun fantasma bueno del jugador 1");
                        } else if (tablero[x][y].equals("M1")) {
                            Fichasm1--;
                            JOptionPane.showMessageDialog(this, "Jugador 2 se ha comido\nun fantasma malo del jugador 1");
                        }
                        tablero[x][y] = "B2";
                        boton(posicionAntigua).setIcon(null);
                        boton(posicionNueva).setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/negro.png")));
                        turnoJugador = 'A';
                        jugador_turno.setText("Jugador 1");
                        posicionAntigua = null;
                    } else {
                        posicionNueva = null;
                    }
                }
            }
            if (Fichasb2 == 0) {
                JOptionPane.showMessageDialog(this, main.actualUser.getUser() + " triunfo sobre " + enemy + " porque\ncapturó todos sus fantasmas buenos!");
                User.addLog(main.actualUser.getUser(), main.actualUser.getUser() + " triunfo sobre " + enemy + " porque\ncapturó todos sus fantasmas buenos!");
                User.addLog(enemy, main.actualUser.getUser() + " triunfo sobre " + enemy + " porque\ncapturó todos sus fantasmas buenos!");
            } else if (Fichasm2 == 0) {
                JOptionPane.showMessageDialog(this, main.actualUser.getUser() + " triunfo sobre " + enemy + " porque\ncapturó todos sus fantasmas malos!");
                User.addLog(main.actualUser.getUser(), main.actualUser.getUser() + " triunfo sobre " + enemy + " porque\ncapturó todos sus fantasmas malos!");
                User.addLog(enemy, main.actualUser.getUser() + " triunfo sobre " + enemy + " porque\ncapturó todos sus fantasmas malos!");
            } else if (Fichasb1 == 0) {
                JOptionPane.showMessageDialog(this, enemy + " triunfo sobre " + main.actualUser.getUser() + " porque\ncapturó todos sus fantasmas buenos!");
                User.addLog(main.actualUser.getUser(), enemy + " triunfo sobre " + main.actualUser.getUser() + " porque\ncapturó todos sus fantasmas buenos!");
                User.addLog(enemy, enemy + " triunfo sobre " + main.actualUser.getUser() + " porque\ncapturó todos sus fantasmas buenos!");
            } else if (Fichasm1 == 0) {
                JOptionPane.showMessageDialog(this, enemy + " triunfo sobre " + main.actualUser.getUser() + " porque\ncapturó todos sus fantasmas malos!");
                User.addLog(main.actualUser.getUser(), enemy + " triunfo sobre " + main.actualUser.getUser() + " porque\ncapturó todos sus fantasmas malos!");
                User.addLog(enemy, enemy + " triunfo sobre " + main.actualUser.getUser() + " porque\ncapturó todos sus fantasmas malos!");
            } else if (tablero[x][y].equals("B1") && posicionNueva != null && (posicionNueva.equals("50") || posicionNueva.equals("55"))) {
                JOptionPane.showMessageDialog(this, "Un fantansma bueno\nde " + main.actualUser.getUser() + " ha salido\npor el castillo");
                User.addLog(main.actualUser.getUser(), "Un fantansma bueno\nde " + main.actualUser.getUser() + " ha salido\npor el castillo");
                User.addLog(enemy, "Un fantansma bueno\ndel Jugador 1 ha salido\npor el castillo");
            } else if (tablero[x][y].equals("B2") && posicionNueva != null && (posicionNueva.equals("00") || posicionNueva.equals("05"))) {
                JOptionPane.showMessageDialog(this, "Un fantansma bueno\ndel Jugador 2 ha salido\npor el castillo");
                User.addLog(main.actualUser.getUser(), "Un fantansma bueno\nde " + enemy + " ha salido\npor el castillo");
                User.addLog(enemy, "Un fantansma bueno\nde " + enemy + " ha salido\npor el castillo");
            }
            lbl_b1.setText("Fantasmas Buenos: " + Fichasb1);
            lbl_b2.setText("Fantasmas Buenos: " + Fichasb2);
            lbl_m1.setText("Fantasmas Malos: " + Fichasm1);
            lbl_m2.setText("Fantasmas Malos: " + Fichasm2);
            if ((Fichasb1 == 0 || Fichasm1 == 0) || (tablero[x][y].equals("B2") && posicionNueva != null && (posicionNueva.equals("00") || posicionNueva.equals("05")))) {
                User.buscarUser(enemy).addPuntos();
            } else if ((Fichasb2 == 0 || Fichasm2 == 0) || ((tablero[x][y].equals("B1") && posicionNueva != null && (posicionNueva.equals("50") || posicionNueva.equals("55"))))) {
                main.actualUser.addPuntos();
            }
            victoria = (Fichasb1 == 0 || Fichasm1 == 0) ? true : (Fichasb2 == 0 || Fichasm2 == 0) ? true : (tablero[x][y].equals("B1") && posicionNueva != null && (posicionNueva.equals("50")
                    || posicionNueva.equals("55"))) ? true : (tablero[x][y].equals("B2") && posicionNueva != null && (posicionNueva.equals("00") || posicionNueva.equals("05"))) ? true : false;
            if (victoria == true) {
                tablero_panel.hide();
                menu_panel.show();
            }
        }
    }

    private boolean movimientoPosible(String old, String nuevo, char turno) {
        int oldx = Integer.parseInt(Character.toString(old.charAt(0)));
        int oldy = Integer.parseInt(Character.toString(old.charAt(1)));
        int newx = Integer.parseInt(Character.toString(nuevo.charAt(0)));
        int newy = Integer.parseInt(Character.toString(nuevo.charAt(1)));
        if ((oldx + 1) == newx && oldy == newy && turno == 'A') {
            return true;
        } else if (oldx == newx && (oldy + 1) == newy && turno == 'A') {
            return true;
        } else if ((oldx - 1) == newx && oldy == newy && turno == 'B') {
            return true;
        } else if (oldx == newx && (oldy - 1) == newy && turno == 'B') {
            return true;
        }
        return false;
    }

    private void generarTablero() {
        Random rnd = new Random();
        int valuernd = rnd.nextInt(1);
        tablero = new String[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                tablero[i][j] = "";
            }
        }
        if (dificultad.equals("normal")) {
            for (int i = 0; i < 2; i++) {
                for (int j = 1; j < 5; j++) {
                    if (valuernd == 0) {
                        tablero[i][j] = "B1";
                    } else if (valuernd == 1) {
                        tablero[i][j] = "M1";
                    }
                    boton(i + "" + j).setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blanco.png")));
                }
            }
            for (int i = 4; i < 6; i++) {
                for (int j = 1; j < 5; j++) {
                    if (valuernd == 0) {
                        tablero[i][j] = "B2";
                    } else if (valuernd == 1) {
                        tablero[i][j] = "M2";
                    }
                    boton(i + "" + j).setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/negro.png")));
                }
            }
            Fichasb1 = 4;
            Fichasb2 = 4;
            Fichasm1 = 4;
            Fichasm2 = 4;
        } else if (dificultad.equals("expert")) {
            for (int j = 1; j < 5; j++) {
                if (valuernd == 0) {
                    tablero[0][j] = "B1";
                } else if (valuernd == 1) {
                    tablero[0][j] = "M1";
                }
                boton(0 + "" + j).setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blanco.png")));
            }
            for (int i = 1; i < 5; i++) {
                if (valuernd == 0) {
                    tablero[5][i] = "B2";
                } else if (valuernd == 1) {
                    tablero[5][i] = "M2";
                }
                boton(5 + "" + i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/negro.png")));
            }
            Fichasb1 = 2;
            Fichasb2 = 2;
            Fichasm1 = 2;
            Fichasm2 = 2;
        } else if (dificultad.equals("genius")) {
            tablero[0][2] = "B1";
            tablero[0][3] = "M1";
            tablero[5][2] = "B2";
            tablero[5][3] = "M2";
            Fichasb1 = 1;
            Fichasm1 = 1;
            Fichasb2 = 1;
            Fichasm2 = 1;
            boton(0 + "" + 2).setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blanco.png")));
            boton(0 + "" + 3).setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blanco.png")));
            boton(5 + "" + 2).setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/negro.png")));
            boton(5 + "" + 3).setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/negro.png")));
        }
        lbl_b1.setText("Fantasmas Buenos: " + Fichasb1);
        lbl_b2.setText("Fantasmas Buenos: " + Fichasb2);
        lbl_m1.setText("Fantasmas Malos: " + Fichasm1);
        lbl_m2.setText("Fantasmas Malos: " + Fichasm2);
    }

    private void agregarAcciones() {
        pos11.addActionListener(this);
        pos12.addActionListener(this);
        pos13.addActionListener(this);
        pos14.addActionListener(this);
        pos15.addActionListener(this);
        pos16.addActionListener(this);
        pos21.addActionListener(this);
        pos22.addActionListener(this);
        pos23.addActionListener(this);
        pos24.addActionListener(this);
        pos25.addActionListener(this);
        pos26.addActionListener(this);
        pos31.addActionListener(this);
        pos32.addActionListener(this);
        pos33.addActionListener(this);
        pos34.addActionListener(this);
        pos35.addActionListener(this);
        pos36.addActionListener(this);
        pos41.addActionListener(this);
        pos42.addActionListener(this);
        pos43.addActionListener(this);
        pos44.addActionListener(this);
        pos45.addActionListener(this);
        pos46.addActionListener(this);
        pos51.addActionListener(this);
        pos52.addActionListener(this);
        pos53.addActionListener(this);
        pos54.addActionListener(this);
        pos55.addActionListener(this);
        pos56.addActionListener(this);
        pos61.addActionListener(this);
        pos62.addActionListener(this);
        pos63.addActionListener(this);
        pos64.addActionListener(this);
        pos65.addActionListener(this);
        pos66.addActionListener(this);
    }

    private String getBotonStr(Object boton) {
        if (boton == pos11) {
            return "00";
        } else if (boton == pos12) {
            return "01";
        } else if (boton == pos13) {
            return "02";
        } else if (boton == pos14) {
            return "03";
        } else if (boton == pos15) {
            return "04";
        } else if (boton == pos16) {
            return "05";
        } else if (boton == pos21) {
            return "10";
        } else if (boton == pos22) {
            return "11";
        } else if (boton == pos23) {
            return "12";
        } else if (boton == pos24) {
            return "13";
        } else if (boton == pos25) {
            return "14";
        } else if (boton == pos26) {
            return "15";
        } else if (boton == pos31) {
            return "20";
        } else if (boton == pos32) {
            return "21";
        } else if (boton == pos33) {
            return "22";
        } else if (boton == pos34) {
            return "23";
        } else if (boton == pos35) {
            return "24";
        } else if (boton == pos36) {
            return "25";
        } else if (boton == pos41) {
            return "30";
        } else if (boton == pos42) {
            return "31";
        } else if (boton == pos43) {
            return "32";
        } else if (boton == pos44) {
            return "33";
        } else if (boton == pos45) {
            return "34";
        } else if (boton == pos46) {
            return "35";
        } else if (boton == pos51) {
            return "40";
        } else if (boton == pos52) {
            return "41";
        } else if (boton == pos53) {
            return "42";
        } else if (boton == pos54) {
            return "43";
        } else if (boton == pos55) {
            return "44";
        } else if (boton == pos56) {
            return "45";
        } else if (boton == pos61) {
            return "50";
        } else if (boton == pos62) {
            return "51";
        } else if (boton == pos63) {
            return "52";
        } else if (boton == pos64) {
            return "53";
        } else if (boton == pos65) {
            return "54";
        } else if (boton == pos66) {
            return "55";
        }
        return "";
    }

    private JButton boton(String posicion) {
        switch (posicion) {
            case "00":
                return pos11;
            case "01":
                return pos12;
            case "02":
                return pos13;
            case "03":
                return pos14;
            case "04":
                return pos15;
            case "05":
                return pos16;
            case "10":
                return pos21;
            case "11":
                return pos22;
            case "12":
                return pos23;
            case "13":
                return pos24;
            case "14":
                return pos25;
            case "15":
                return pos26;
            case "20":
                return pos31;
            case "21":
                return pos32;
            case "22":
                return pos33;
            case "23":
                return pos34;
            case "24":
                return pos35;
            case "25":
                return pos36;
            case "30":
                return pos41;
            case "31":
                return pos42;
            case "32":
                return pos43;
            case "33":
                return pos44;
            case "34":
                return pos45;
            case "35":
                return pos46;
            case "40":
                return pos51;
            case "41":
                return pos52;
            case "42":
                return pos53;
            case "43":
                return pos54;
            case "44":
                return pos55;
            case "45":
                return pos56;
            case "50":
                return pos61;
            case "51":
                return pos62;
            case "52":
                return pos63;
            case "53":
                return pos64;
            case "54":
                return pos65;
            case "55":
                return pos66;
            default:
                break;
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo1_lbl;
    private javax.swing.JPanel MiPerfil_panel;
    private javax.swing.JPanel Ranking_panel;
    private javax.swing.JPanel Reportes_Panel;
    private javax.swing.JTable Tabla_players;
    private javax.swing.JLabel Title_lbl;
    private javax.swing.JLabel Titulo_lbl;
    private javax.swing.JButton cambiarpas_bt;
    private javax.swing.JPanel cofig_panel;
    private javax.swing.JButton config_bt;
    private javax.swing.JRadioButton dificult_rb1;
    private javax.swing.JRadioButton dificult_rb2;
    private javax.swing.JRadioButton dificult_rb3;
    private javax.swing.ButtonGroup dificultad_rbg;
    private javax.swing.JButton eliminar_bt;
    private javax.swing.JLabel fondomp_lbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jugador_turno;
    private javax.swing.JButton jugar_bt;
    private javax.swing.JLabel lbl_b1;
    private javax.swing.JLabel lbl_b2;
    private javax.swing.JLabel lbl_fantasmas1;
    private javax.swing.JLabel lbl_fantasmas2;
    private javax.swing.JLabel lbl_m1;
    private javax.swing.JLabel lbl_m2;
    private javax.swing.JLabel lbl_turno;
    private javax.swing.JPanel menu_panel;
    private javax.swing.JRadioButton modalidad_1;
    private javax.swing.JRadioButton modalidad_2;
    private javax.swing.ButtonGroup modalidad_rbg;
    private javax.swing.JButton perfil_bt;
    private javax.swing.JButton pos11;
    private javax.swing.JButton pos12;
    private javax.swing.JButton pos13;
    private javax.swing.JButton pos14;
    private javax.swing.JButton pos15;
    private javax.swing.JButton pos16;
    private javax.swing.JButton pos21;
    private javax.swing.JButton pos22;
    private javax.swing.JButton pos23;
    private javax.swing.JButton pos24;
    private javax.swing.JButton pos25;
    private javax.swing.JButton pos26;
    private javax.swing.JButton pos31;
    private javax.swing.JButton pos32;
    private javax.swing.JButton pos33;
    private javax.swing.JButton pos34;
    private javax.swing.JButton pos35;
    private javax.swing.JButton pos36;
    private javax.swing.JButton pos41;
    private javax.swing.JButton pos42;
    private javax.swing.JButton pos43;
    private javax.swing.JButton pos44;
    private javax.swing.JButton pos45;
    private javax.swing.JButton pos46;
    private javax.swing.JButton pos51;
    private javax.swing.JButton pos52;
    private javax.swing.JButton pos53;
    private javax.swing.JButton pos54;
    private javax.swing.JButton pos55;
    private javax.swing.JButton pos56;
    private javax.swing.JButton pos61;
    private javax.swing.JButton pos62;
    private javax.swing.JButton pos63;
    private javax.swing.JButton pos64;
    private javax.swing.JButton pos65;
    private javax.swing.JButton pos66;
    private javax.swing.JButton reportes_bt;
    private javax.swing.JButton salir_bt;
    private javax.swing.JButton surrender_bt;
    private javax.swing.JPanel tablero_panel;
    private javax.swing.JButton verdatos_bt;
    // End of variables declaration//GEN-END:variables
}

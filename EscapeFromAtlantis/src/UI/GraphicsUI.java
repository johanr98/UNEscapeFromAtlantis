/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Data.Animal;
import Data.Boat;
import Data.Player;
import Data.Tile;
import Logic.GameMaster;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author johans
 */
public class GraphicsUI extends javax.swing.JFrame implements ActionListener {

    String separador = System.getProperty("file.separator");
    private GameMaster gameMaster;
    private Menu menu;

    /**
     * Creates new form GraphicsUI
     */
    public GraphicsUI() {
        initComponents();
        this.gameMaster = new GameMaster(this);
    }

    public void initializePlayer() {

    }

    public void menu() {

    }

    public void printString(String something) {
        System.out.println(something);
    }

    //Metodos de seleccion de elementos del tablero
    public void selectAnimal() {

    }

    public void selectTile() {

    }

    public void selectBoat() {

    }

    private void initComponentsMountain() {

        jLabel8.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick8(me);
            }
        });

        jLabel7.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick7(me);
            }
        });

        jLabel10.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick10(me);
            }
        });

        jLabel4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick4(me);
            }
        });

        jLabel6.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick6(me);
            }
        });

        jLabel5.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick5(me);
            }
        });

        jLabel14.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick14(me);
            }
        });

        jLabel12.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick12(me);
            }
        });

        jLabel13.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick13(me);
            }
        });

        jLabel11.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick11(me);
            }
        });

        jLabel22.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick22(me);
            }
        });

        jLabel21.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick21(me);
            }
        });

        jLabel20.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick20(me);
            }
        });

        jLabel19.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick19(me);
            }
        });

        jLabel18.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick18(me);
            }
        });

        jLabel15.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick15(me);
            }
        });

    }

    private void initComponentsForest() {
        jLabel41.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick41(me);
            }
        });

        jLabel38.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick38(me);
            }
        });

        jLabel17.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick17(me);
            }
        });

        jLabel24.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick24(me);
            }
        });

        jLabel36.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick36(me);
            }
        });

        jLabel40.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick40(me);
            }
        });

        jLabel35.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick35(me);
            }
        });

        jLabel39.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick39(me);
            }
        });

        jLabel33.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick33(me);
            }
        });

        jLabel26.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick26(me);
            }
        });

        jLabel32.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick32(me);
            }
        });

        jLabel27.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick27(me);
            }
        });

        jLabel31.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick31(me);
            }
        });

        jLabel30.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick30(me);
            }
        });

        jLabel29.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick29(me);
            }
        });

        jLabel28.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick28(me);
            }
        });

    }

    private void initComponentsSand() {

        jLabel34.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick34(me);
            }
        });

        jLabel79.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick79(me);
            }
        });

        jLabel85.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick85(me);
            }
        });

        jLabel80.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick80(me);
            }
        });

        jLabel86.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick86(me);
            }
        });

        jLabel81.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick81(me);
            }
        });

        jLabel78.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick78(me);
            }
        });

        jLabel16.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick16(me);
            }
        });

        jLabel23.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick23(me);
            }
        });

        jLabel84.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick84(me);
            }
        });

        jLabel88.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick88(me);
            }
        });

        jLabel82.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick82(me);
            }
        });

        jLabel89.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick89(me);
            }
        });

        jLabel83.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick83(me);
            }
        });

        jLabel25.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick25(me);
            }
        });

        jLabel87.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mouseClick87(me);
            }
        });

    }

    private void mouseClick8(MouseEvent me) {

    }

    private void mouseClick7(MouseEvent me) {

    }

    private void mouseClick10(MouseEvent me) {

    }

    private void mouseClick4(MouseEvent me) {

    }

    private void mouseClick6(MouseEvent me) {

    }

    private void mouseClick5(MouseEvent me) {

    }

    private void mouseClick14(MouseEvent me) {

    }

    private void mouseClick12(MouseEvent me) {

    }

    private void mouseClick13(MouseEvent me) {

    }

    private void mouseClick11(MouseEvent me) {

    }

    private void mouseClick22(MouseEvent me) {

    }

    private void mouseClick21(MouseEvent me) {

    }

    private void mouseClick20(MouseEvent me) {

    }

    private void mouseClick19(MouseEvent me) {

    }

    private void mouseClick18(MouseEvent me) {

    }

    private void mouseClick15(MouseEvent me) {

    }

    // Metodos Tiles de bosque
    private void mouseClick41(MouseEvent me) {

    }

    private void mouseClick38(MouseEvent me) {

    }

    private void mouseClick17(MouseEvent me) {

    }

    private void mouseClick24(MouseEvent me) {

    }

    private void mouseClick36(MouseEvent me) {

    }

    private void mouseClick40(MouseEvent me) {

    }

    private void mouseClick35(MouseEvent me) {

    }

    private void mouseClick39(MouseEvent me) {

    }

    private void mouseClick33(MouseEvent me) {

    }

    private void mouseClick26(MouseEvent me) {

    }

    private void mouseClick32(MouseEvent me) {

    }

    private void mouseClick27(MouseEvent me) {

    }

    private void mouseClick31(MouseEvent me) {

    }

    private void mouseClick30(MouseEvent me) {

    }

    private void mouseClick29(MouseEvent me) {

    }

    private void mouseClick28(MouseEvent me) {

    }

    // Metodos Tiles de Arena
    private void mouseClick34(MouseEvent me) {

    }

    private void mouseClick79(MouseEvent me) {

    }

    private void mouseClick85(MouseEvent me) {

    }

    private void mouseClick80(MouseEvent me) {

    }

    private void mouseClick86(MouseEvent me) {

    }

    private void mouseClick81(MouseEvent me) {

    }

    private void mouseClick78(MouseEvent me) {

    }

    private void mouseClick16(MouseEvent me) {

    }

    private void mouseClick23(MouseEvent me) {

    }

    private void mouseClick84(MouseEvent me) {

    }

    private void mouseClick88(MouseEvent me) {

    }

    private void mouseClick82(MouseEvent me) {

    }

    private void mouseClick89(MouseEvent me) {

    }

    private void mouseClick83(MouseEvent me) {

    }

    private void mouseClick25(MouseEvent me) {

    }

    private void mouseClick87(MouseEvent me) {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(0, 0, 1280, 720));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("-"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mountain tile.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 275, 50, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sea serpent.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 50, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mountain tile.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 322, 50, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mountain tile.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 321, 50, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mountain tile.png"))); // NOI18N
        jLabel7.setText("jLabel5");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 238, 50, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mountain tile.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 280, 50, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 280, 50, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mountain tile.png"))); // NOI18N
        jLabel10.setText("jLabel2");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 239, 50, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mountain tile.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 238, 50, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mountain tile.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 197, 50, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mountain tile.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 196, 50, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mountain tile.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 197, 50, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mountain tile.png"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 239, 50, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sand tile.png"))); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 281, 50, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forest tile.png"))); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 155, 50, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mountain tile.png"))); // NOI18N
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 322, 50, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mountain tile.png"))); // NOI18N
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 364, 50, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mountain tile.png"))); // NOI18N
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 364, 50, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mountain tile.png"))); // NOI18N
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 364, 50, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mountain tile.png"))); // NOI18N
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 322, 50, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sand tile.png"))); // NOI18N
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 50, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forest tile.png"))); // NOI18N
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 155, 50, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sand tile.png"))); // NOI18N
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 363, 50, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forest tile.png"))); // NOI18N
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 323, 50, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forest tile.png"))); // NOI18N
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 364, 50, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forest tile.png"))); // NOI18N
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 405, 50, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forest tile.png"))); // NOI18N
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 405, 50, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forest tile.png"))); // NOI18N
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 405, 50, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forest tile.png"))); // NOI18N
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 406, 50, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forest tile.png"))); // NOI18N
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 364, 50, -1));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forest tile.png"))); // NOI18N
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 323, 50, -1));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sand tile.png"))); // NOI18N
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 155, 50, -1));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forest tile.png"))); // NOI18N
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 240, 50, -1));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forest tile.png"))); // NOI18N
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 198, 50, -1));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finishtile.png"))); // NOI18N
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(747, 531, 50, -1));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forest tile.png"))); // NOI18N
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 156, 50, -1));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forest tile.png"))); // NOI18N
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 239, 50, -1));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forest tile.png"))); // NOI18N
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 196, 50, -1));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/forest tile.png"))); // NOI18N
        jPanel2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 156, 50, -1));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finishtile.png"))); // NOI18N
        jPanel2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 30, 50, -1));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finishtile.png"))); // NOI18N
        jPanel2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 71, 50, -1));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finishtile.png"))); // NOI18N
        jPanel2.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 113, 50, -1));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finishtile.png"))); // NOI18N
        jPanel2.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(743, 29, 50, -1));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finishtile.png"))); // NOI18N
        jPanel2.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(769, 70, 50, -1));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finishtile.png"))); // NOI18N
        jPanel2.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(792, 112, 50, -1));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finishtile.png"))); // NOI18N
        jPanel2.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 448, 50, -1));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finishtile.png"))); // NOI18N
        jPanel2.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 489, 50, -1));

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finishtile.png"))); // NOI18N
        jPanel2.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 531, 50, -1));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 530, 50, -1));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finishtile.png"))); // NOI18N
        jPanel2.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(771, 489, 50, -1));

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finishtile.png"))); // NOI18N
        jPanel2.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 448, 50, -1));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(719, 72, 50, -1));

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 530, 50, -1));

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 530, 50, -1));

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 530, 50, -1));

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 530, 50, -1));

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 530, 50, -1));

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 531, 50, -1));

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(769, 237, 50, -1));

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 73, 50, -1));

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 73, 50, -1));

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 73, 50, -1));

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 72, 50, -1));

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 72, 50, -1));

        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 72, 50, -1));

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 72, 50, -1));

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(671, 71, 50, -1));

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 72, 50, -1));

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 114, 50, -1));

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 115, 50, -1));

        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 114, 50, -1));

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 114, 50, -1));

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 114, 50, -1));

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 114, 50, -1));

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 112, 50, -1));

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sand tile.png"))); // NOI18N
        jPanel2.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 282, 50, -1));

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sand tile.png"))); // NOI18N
        jPanel2.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 198, 50, -1));

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sand tile.png"))); // NOI18N
        jPanel2.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 241, 50, -1));

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sand tile.png"))); // NOI18N
        jPanel2.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 282, 50, -1));

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sand tile.png"))); // NOI18N
        jPanel2.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 324, 50, -1));

        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sand tile.png"))); // NOI18N
        jPanel2.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 365, 50, -1));

        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sand tile.png"))); // NOI18N
        jPanel2.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 280, 50, -1));

        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sand tile.png"))); // NOI18N
        jPanel2.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 197, 50, -1));

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sand tile.png"))); // NOI18N
        jPanel2.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 238, 50, -1));

        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sand tile.png"))); // NOI18N
        jPanel2.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 406, 50, -1));

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sand tile.png"))); // NOI18N
        jPanel2.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 279, 50, -1));

        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sand tile.png"))); // NOI18N
        jPanel2.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 321, 50, -1));

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 112, 50, -1));

        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 112, 50, -1));

        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 113, 50, -1));

        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(744, 113, 50, -1));

        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 157, 50, -1));

        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 156, 50, -1));

        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 156, 50, -1));

        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 154, 50, -1));

        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(719, 155, 50, -1));

        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 199, 50, -1));

        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 198, 50, -1));

        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 196, 50, -1));

        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(744, 196, 50, -1));

        jLabel103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 278, 50, -1));

        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 241, 50, -1));

        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(721, 237, 50, -1));

        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 241, 50, -1));

        jLabel108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 283, 50, -1));

        jLabel107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(769, 320, 50, -1));

        jLabel110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 324, 50, -1));

        jLabel109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 404, 50, -1));

        jLabel111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 320, 50, -1));

        jLabel112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 324, 50, -1));

        jLabel113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 366, 50, -1));

        jLabel114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 365, 50, -1));

        jLabel115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 362, 50, -1));

        jLabel116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 361, 50, -1));

        jLabel118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 407, 50, -1));

        jLabel119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 405, 50, -1));

        jLabel117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 449, 50, -1));

        jLabel120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 404, 50, -1));

        jLabel121.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 31, 50, -1));

        jLabel122.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 31, 50, -1));

        jLabel123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 30, 50, -1));

        jLabel124.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 30, 50, -1));

        jLabel125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 30, 50, -1));

        jLabel126.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 50, -1));

        jLabel127.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 30, 50, -1));

        jLabel128.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 31, 50, -1));

        jLabel129.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 31, 50, -1));

        jLabel130.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 30, 50, -1));

        jLabel131.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 30, 50, -1));

        jLabel132.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 30, 50, -1));

        jLabel133.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 50, -1));

        jLabel134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 30, 50, -1));

        jLabel135.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 407, 50, -1));

        jLabel136.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 449, 50, -1));

        jLabel137.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Water tile.png"))); // NOI18N
        jPanel2.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 449, 50, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mapa de fondo.png"))); // NOI18N
        jLabel1.setLabelFor(jPanel2);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 22, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1044, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jButton4.setText("Menu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1601, 1601, 1601))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(GraphicsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraphicsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraphicsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraphicsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        GraphicsUI x = new GraphicsUI();
    }

    // Inicio Metodos de uso en la clase Effect
    public void pintarEfecto() {

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

    public void endScreen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void drawWhale() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void drawShark() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void drawBoat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Comunicacion.ServicioTransmision;
import Dominio.Baraja;
import Dominio.Carta;
import java.util.Collections;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.ImageIcon;

/**
 *
 * @author alexd
 */
public class Tablero extends javax.swing.JFrame {
    ServicioTransmision s;
    Baraja mano;
    Baraja mesa;
    Baraja mazo;

    /**
     * Creates new form Tablero
     */
    public Tablero(ServicioTransmision s) {
        this.s=s;
        initComponents();
        mano = new Baraja();
        mesa = new Baraja();
        mazo = new Baraja();
        mazo.llenarMazo();
        mazo.barajear();
        obtenerPrimeraCarta();
        obtenerCartasPropias();
        mostrarTodo();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AreaJugador = new javax.swing.JPanel();
        Mano = new javax.swing.JScrollPane();
        PanelMano = new javax.swing.JPanel();
        carta1 = new javax.swing.JLabel();
        carta2 = new javax.swing.JLabel();
        carta3 = new javax.swing.JLabel();
        carta4 = new javax.swing.JLabel();
        carta5 = new javax.swing.JLabel();
        carta6 = new javax.swing.JLabel();
        carta7 = new javax.swing.JLabel();
        carta8 = new javax.swing.JLabel();
        carta9 = new javax.swing.JLabel();
        carta10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cartaActual = new javax.swing.JLabel();
        cartaMazo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));

        Mano.setMaximumSize(new java.awt.Dimension(900, 32767));
        Mano.setPreferredSize(new java.awt.Dimension(900, 100));

        PanelMano.setMaximumSize(new java.awt.Dimension(32767, 210));
        PanelMano.setPreferredSize(new java.awt.Dimension(900, 210));

        carta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        carta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Cartas/B0.png"))); // NOI18N

        carta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        carta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Cartas/RT.png"))); // NOI18N

        carta3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        carta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Cartas/GR.png"))); // NOI18N

        carta4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        carta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Cartas/YB.png"))); // NOI18N

        carta5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        carta5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Cartas/Y6.png"))); // NOI18N
        carta5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carta5MouseClicked(evt);
            }
        });

        carta6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        carta6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Cartas/+4.png"))); // NOI18N

        carta7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        carta7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Cartas/+4.png"))); // NOI18N

        carta8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        carta8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Cartas/YB.png"))); // NOI18N

        carta9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        carta9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Cartas/YB.png"))); // NOI18N

        carta10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        carta10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Cartas/Back.png"))); // NOI18N

        javax.swing.GroupLayout PanelManoLayout = new javax.swing.GroupLayout(PanelMano);
        PanelMano.setLayout(PanelManoLayout);
        PanelManoLayout.setHorizontalGroup(
            PanelManoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelManoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(carta1)
                .addGap(6, 6, 6)
                .addComponent(carta2)
                .addGap(6, 6, 6)
                .addComponent(carta3)
                .addGap(6, 6, 6)
                .addComponent(carta4)
                .addGap(6, 6, 6)
                .addComponent(carta5)
                .addGap(6, 6, 6)
                .addComponent(carta6)
                .addGap(6, 6, 6)
                .addComponent(carta7)
                .addGap(6, 6, 6)
                .addComponent(carta8)
                .addGap(6, 6, 6)
                .addComponent(carta9)
                .addGap(6, 6, 6)
                .addComponent(carta10))
        );
        PanelManoLayout.setVerticalGroup(
            PanelManoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelManoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(PanelManoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carta1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta7, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta8, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta9, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta10, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Mano.setViewportView(PanelMano);

        jButton1.setText("Obtener Carta");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AreaJugadorLayout = new javax.swing.GroupLayout(AreaJugador);
        AreaJugador.setLayout(AreaJugadorLayout);
        AreaJugadorLayout.setHorizontalGroup(
            AreaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AreaJugadorLayout.createSequentialGroup()
                .addComponent(Mano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        AreaJugadorLayout.setVerticalGroup(
            AreaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AreaJugadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AreaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AreaJugadorLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Mano, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)))
        );

        cartaActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cartaActual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Cartas/B0.png"))); // NOI18N

        cartaMazo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cartaMazo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Cartas/Back.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(525, 525, 525)
                .addComponent(cartaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cartaMazo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(484, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AreaJugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(194, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cartaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cartaMazo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addComponent(AreaJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carta5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_carta5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mano.añadirCarta(mazo.obtenerCarta());
        mostrarTodo();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AreaJugador;
    private javax.swing.JScrollPane Mano;
    private javax.swing.JPanel PanelMano;
    private javax.swing.JLabel carta1;
    private javax.swing.JLabel carta10;
    private javax.swing.JLabel carta2;
    private javax.swing.JLabel carta3;
    private javax.swing.JLabel carta4;
    private javax.swing.JLabel carta5;
    private javax.swing.JLabel carta6;
    private javax.swing.JLabel carta7;
    private javax.swing.JLabel carta8;
    private javax.swing.JLabel carta9;
    private javax.swing.JLabel cartaActual;
    private javax.swing.JLabel cartaMazo;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables

    public void obtenerPrimeraCarta(){
        mesa.añadirCarta(mazo.obtenerCarta());
    }
    
    public void obtenerCartasPropias(){
        for(int i=0; i<7;i++)
            mano.añadirCarta(mazo.obtenerCarta());
    }
    
    public void mostrarMano(){
        PanelMano.removeAll();
        PanelMano.setPreferredSize(new java.awt.Dimension((126*mano.getCartas().size()+10), 210));

        javax.swing.GroupLayout PanelManoLayout = new javax.swing.GroupLayout(PanelMano);
        PanelMano.setLayout(PanelManoLayout);
        SequentialGroup sg = PanelManoLayout.createSequentialGroup();
        sg.addGap(10,10,10);
        ParallelGroup pg = PanelManoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING);
        for (Carta c: mano.getCartas()){
            javax.swing.JLabel nuevaCarta = new javax.swing.JLabel();
            nuevaCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImagen())));
            nuevaCarta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesa.getCartas().add(c);
                mano.eliminarCarta(c.getCodigo());
                mostrarTodo();
            }
            });
            sg.addComponent(nuevaCarta);
            sg.addGap(6, 6, 6);
            pg.addComponent(nuevaCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE);
            
        }
       
        PanelManoLayout.setHorizontalGroup(
            PanelManoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sg)
        );
        PanelManoLayout.setVerticalGroup(
            PanelManoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelManoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pg))
        );
        
    }
    
    public void mostrarMesa(){
       cartaActual.setIcon(new javax.swing.ImageIcon(getClass().getResource(mesa.getCartas().get(mesa.getCartas().size()-1).getImagen()))); 
    }
    
    public void mostrarTodo(){
        mostrarMano();
        mostrarMesa();
        pack();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Comunicacion.ServicioTransmision;
import Dominio.Baraja;
import Dominio.Carta;
import Dominio.CartaSimple;
import Dominio.Turno;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.Collections;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author alexd
 * Descripcion: Tablero principal del juego donde todo ocurre
 */
public class Tablero extends javax.swing.JFrame {
    ServicioTransmision s;
    Baraja mano; // Cartas del jugador 
    Baraja mesa; // Cartas en la mesa
    Baraja mazo; // Cartas en el mazo
    Baraja jugador2; // Cartas que tiene el jugador 2 (Amarillo)
    Baraja jugador3; // Cartas que tiene el jugador 3 (Verde)
    Baraja jugador4; // Cartas que tiene el jugador 4 (Rojo)
    int sentido; //Sentido del juego 0:en reloj, 1:en contrareloj 
    String colorNuevo; //Cuando se juega un +4 o un cambia color aqui se almacena el nuevo colot
    String jugadorSiguiente;
    String jugadorAnterior;
    Turno turno; //Permite determinar si es el turno del jugador y ejecutar la espera por los demas jugadores
    String codigoJugador; // Contiene el codigo del jugador actual

    /**
     * Creates new form Tablero
     */
    public Tablero(ServicioTransmision s, Boolean jugadorInicial) {
        this.s=s;
        initComponents();
        Mano.getViewport().setBackground(new Color(33,150,243));
        PanelMensaje.setVisible(false);
        mano = new Baraja();
        mesa = new Baraja();
        mazo = new Baraja();
        mazo.llenarMazo();
        mazo.barajear();
        colorNuevo= "Rojo"; //Temporal
        obtenerCartasPropias();// Temporal
        turno = new Turno(this);
        if(jugadorInicial){
            new Thread(new MensajeUI(PanelMensaje,"Se ha iniciado la partida",4)).start();
            obtenerPrimeraCarta(); // Temporal
            turno.setPuedeJugar(true);
            codigoJugador="00";
            jugadorSiguiente="01";
            s.IniciarPartida();
            new Thread(turno).start();
        }
        else{
            new Thread(new MensajeUI(PanelMensaje,"Te haz unido a la partida",4)).start();
            codigoJugador="01";
            new Thread(turno).start();
        }
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

        jPanel1 = new javax.swing.JPanel();
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
        colorRojo = new javax.swing.JLabel();
        colorAzul = new javax.swing.JLabel();
        colorAmarillo = new javax.swing.JLabel();
        colorVerde = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cartaMazo = new javax.swing.JLabel();
        cartaActual = new javax.swing.JLabel();
        cartasJugador3 = new javax.swing.JLabel();
        cartasJugador2 = new javax.swing.JLabel();
        cartasJugador4 = new javax.swing.JLabel();
        numeroJugador3 = new javax.swing.JLabel();
        numeroJugador2 = new javax.swing.JLabel();
        numeroJugador4 = new javax.swing.JLabel();
        PanelMensaje = new javax.swing.JPanel();
        mensaje = new javax.swing.JLabel();
        fondoMensaje = new javax.swing.JLabel();
        iconoSentido = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);

        AreaJugador.setOpaque(false);

        Mano.setMaximumSize(new java.awt.Dimension(900, 32767));
        Mano.setOpaque(false);
        Mano.setPreferredSize(new java.awt.Dimension(900, 100));

        PanelMano.setMaximumSize(new java.awt.Dimension(32767, 210));
        PanelMano.setOpaque(false);
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
                .addContainerGap()
                .addGroup(PanelManoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carta4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta7, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta8, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta9, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta10, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        Mano.setViewportView(PanelMano);

        colorRojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/CCRojo.png"))); // NOI18N

        colorAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/CCAzul2.png"))); // NOI18N

        colorAmarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/CCAmarillo2.png"))); // NOI18N

        colorVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/CCVerde2.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Iconos/ic_block_white_24dp_1x.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AreaJugadorLayout = new javax.swing.GroupLayout(AreaJugador);
        AreaJugador.setLayout(AreaJugadorLayout);
        AreaJugadorLayout.setHorizontalGroup(
            AreaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AreaJugadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AreaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AreaJugadorLayout.createSequentialGroup()
                        .addComponent(colorRojo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(colorAzul))
                    .addGroup(AreaJugadorLayout.createSequentialGroup()
                        .addComponent(colorAmarillo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(colorVerde)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(Mano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(8, 8, 8))
        );
        AreaJugadorLayout.setVerticalGroup(
            AreaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AreaJugadorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AreaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(colorAzul)
                    .addComponent(colorRojo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AreaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(colorAmarillo)
                    .addComponent(colorVerde))
                .addContainerGap())
            .addGroup(AreaJugadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AreaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AreaJugadorLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Mano, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)))
        );

        cartaMazo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cartaMazo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Cartas/Back.png"))); // NOI18N
        cartaMazo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartaMazoMouseClicked(evt);
            }
        });

        cartaActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        cartasJugador3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Cartas7.png"))); // NOI18N

        cartasJugador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Cartas7.png"))); // NOI18N

        cartasJugador4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Cartas7.png"))); // NOI18N

        numeroJugador3.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        numeroJugador3.setForeground(new java.awt.Color(255, 255, 255));
        numeroJugador3.setText("7");

        numeroJugador2.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        numeroJugador2.setForeground(new java.awt.Color(255, 255, 255));
        numeroJugador2.setText("7");

        numeroJugador4.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        numeroJugador4.setForeground(new java.awt.Color(255, 255, 255));
        numeroJugador4.setText("7");

        PanelMensaje.setPreferredSize(new java.awt.Dimension(307, 46));
        PanelMensaje.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mensaje.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        mensaje.setForeground(new java.awt.Color(255, 255, 255));
        mensaje.setText("Tu turno!");
        PanelMensaje.add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 8, -1, -1));
        mensaje.getAccessibleContext().setAccessibleName("Esperando turno");

        fondoMensaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/FondoMensaje.png"))); // NOI18N
        fondoMensaje.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        PanelMensaje.add(fondoMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        iconoSentido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Iconos/SentidoReloj.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cartasJugador2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(numeroJugador2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cartasJugador3)
                        .addGap(38, 38, 38)
                        .addComponent(numeroJugador3)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cartaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cartaMazo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addComponent(cartasJugador4)
                                .addGap(39, 39, 39)
                                .addComponent(numeroJugador4)
                                .addGap(80, 80, 80))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PanelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(iconoSentido)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(AreaJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cartasJugador3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(numeroJugador3)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(cartasJugador2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroJugador2)
                                .addGap(59, 59, 59))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cartasJugador4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PanelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131)))
                .addComponent(AreaJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(numeroJugador4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cartaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cartaMazo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addComponent(iconoSentido)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 720));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Fondo.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void carta5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_carta5MouseClicked

    private void cartaMazoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartaMazoMouseClicked
        if(turno.puedeJugar()){
            mano.añadirCarta(mazo.obtenerCarta());
            esperarTurno();
            mostrarTodo();
        }
        else{
            new Thread(new MensajeUI(PanelMensaje,"Aun no es tu turno",4)).start();
        }
    }//GEN-LAST:event_cartaMazoMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if(turno.puedeJugar()){
            if(sentido==0){
                s.pasarTurno(codigoJugador,jugadorSiguiente, "0");
            }
            else{
                s.pasarTurno(codigoJugador,jugadorAnterior, "1");
            }
            esperarTurno();
            mostrarTodo();
            new Thread(new MensajeUI(PanelMensaje,"Pasaste",4)).start();
        }
        else{
            new Thread(new MensajeUI(PanelMensaje,"Aun no es tu turno",4)).start();
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AreaJugador;
    private javax.swing.JLabel Fondo;
    private javax.swing.JScrollPane Mano;
    private javax.swing.JPanel PanelMano;
    private javax.swing.JPanel PanelMensaje;
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
    private javax.swing.JLabel cartasJugador2;
    private javax.swing.JLabel cartasJugador3;
    private javax.swing.JLabel cartasJugador4;
    private javax.swing.JLabel colorAmarillo;
    private javax.swing.JLabel colorAzul;
    private javax.swing.JLabel colorRojo;
    private javax.swing.JLabel colorVerde;
    private javax.swing.JLabel fondoMensaje;
    private javax.swing.JLabel iconoSentido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mensaje;
    private javax.swing.JLabel numeroJugador2;
    private javax.swing.JLabel numeroJugador3;
    private javax.swing.JLabel numeroJugador4;
    // End of variables declaration//GEN-END:variables
    
    // Obtiene la primera carta del mazo(debe comprobar que sea valida)
    public void obtenerPrimeraCarta(){
        boolean listo = false;
        while(!listo){
            Carta c = mazo.obtenerCarta();
            if(c instanceof CartaSimple){
                mesa.añadirCarta(c);
                listo=true;
            }
            else{
                mazo.añadirCarta(c);
                mazo.barajear();
            } 
        }
    }
    
    // Obtiene las 7 cartas del juagdor y las envia(PENDIENTE)
    public void obtenerCartasPropias(){
        for(int i=0; i<7;i++)
            mano.añadirCarta(mazo.obtenerCarta());
    }
    
    public void esperarTurno(){
        new Thread(turno).start();
    }
    
    // Muestra todas las cartas en la mano del jugador
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
                if(turno.puedeJugar()){
                    if(sentido==0){
                        c.jugar(s,codigoJugador,jugadorSiguiente,"0");
                    }
                    else{
                        c.jugar(s,codigoJugador,jugadorAnterior,"1");
                    }
                    mesa.getCartas().add(c);
                    mano.eliminarCarta(c.getCodigo());
                    esperarTurno();
                    mostrarTodo();
                }
                else{
                    new Thread(new MensajeUI(PanelMensaje,"Aun no es tu turno",4)).start();
                }
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
    
    // Muestra el color actual en la paleta inferior
    public void mostrarColor(){
        colorRojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/CCRojo2.png")));
        colorAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/CCAzul2.png")));
        colorVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/CCVerde2.png")));
        colorAmarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/CCAmarillo2.png")));
        if(mesa.getCartas().size()>0){
            Carta c = mesa.getCartas().get(mesa.getCartas().size()-1);
            c.mostrarColor(colorRojo, colorAzul, colorVerde, colorAmarillo,colorNuevo);
            }
        }
    
    // Muestra el sentido actual
    public void mostrarSentido(){
        if(sentido==0){
            iconoSentido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Iconos/SentidoReloj.png")));
        }
        else{
            iconoSentido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/Iconos/SentidoContraReloj.png")));
        }
    }
    // Muestra la ultima carta en la mesa
    public void mostrarMesa(){
        if(mesa.getCartas().size()>0){
            Carta c = mesa.getCartas().get(mesa.getCartas().size()-1);
            if(c!=null){
                cartaActual.setVisible(true);
                cartaActual.setIcon(new javax.swing.ImageIcon(getClass().getResource(c.getImagen())));
            }
       }
        else{
            cartaActual.setIcon(null);
        }
       
        
    }
    
    //Actualiza la interfaz con todos los cambios
    public void mostrarTodo(){
        mostrarMano();
        mostrarMesa();
        mostrarColor();
        mostrarSentido();
        pack();
    }

    public ServicioTransmision getS() {
        return s;
    }

    public void setS(ServicioTransmision s) {
        this.s = s;
    }

    public Baraja getMano() {
        return mano;
    }

    public void setMano(Baraja mano) {
        this.mano = mano;
    }

    public Baraja getMesa() {
        return mesa;
    }

    public void setMesa(Baraja mesa) {
        this.mesa = mesa;
    }

    public Baraja getMazo() {
        return mazo;
    }

    public void setMazo(Baraja mazo) {
        this.mazo = mazo;
    }

    public int getSentido() {
        return sentido;
    }

    public void setSentido(int sentido) {
        this.sentido = sentido;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Baraja getJugador2() {
        return jugador2;
    }

    public void setJugador2(Baraja jugador2) {
        this.jugador2 = jugador2;
    }

    public Baraja getJugador3() {
        return jugador3;
    }

    public void setJugador3(Baraja jugador3) {
        this.jugador3 = jugador3;
    }

    public Baraja getJugador4() {
        return jugador4;
    }

    public void setJugador4(Baraja jugador4) {
        this.jugador4 = jugador4;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public String getCodigoJugador() {
        return codigoJugador;
    }

    public void setCodigoJugador(String codigoJugador) {
        this.codigoJugador = codigoJugador;
    }

    public String getColorNuevo() {
        return colorNuevo;
    }

    public void setColorNuevo(String colorNuevo) {
        this.colorNuevo = colorNuevo;
    }

    public String getJugadorSiguiente() {
        return jugadorSiguiente;
    }

    public void setJugadorSiguiente(String jugadorSiguiente) {
        this.jugadorSiguiente = jugadorSiguiente;
    }

    public String getJugadorAnterior() {
        return jugadorAnterior;
    }

    public void setJugadorAnterior(String jugadorAnterior) {
        this.jugadorAnterior = jugadorAnterior;
    }
    
    
    
    
}

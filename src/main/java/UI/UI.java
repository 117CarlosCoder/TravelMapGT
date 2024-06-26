/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import ArbolB.ArbolB;
import Calculo.Calculo;
import Grafo.Grafo;
import Grafo.NodoGrafo;
import java.awt.event.ItemEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import Cargardatos.CargarDatos;
import java.awt.Image;
import java.awt.event.MouseEvent;
/**
 *
 * @author carlosl
 */
public class UI extends javax.swing.JFrame {

    private List<Grafo> lista;
    private static List<Grafo> listaRecortada;
    /**
     * Creates new form UI
     */
    public UI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTabbedPane1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTabbedPane1ComponentAdded(evt);
            }
        });

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jLabel7);

        jTabbedPane1.addTab("Grafos", jScrollPane1);

        jScrollPane2.setViewportView(jLabel5);

        jTabbedPane1.addTab("Arbol", jScrollPane2);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Recorrido");

        jLabel2.setText("Destino");

        jLabel3.setText("Origen");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"A pie", "En auto"}));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jButton2.setText("Cargar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Listado de grafos");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        jComboBox4.setEnabled(false);
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jButton3.setText("Siguiente");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jMenu1.setText("Archivo");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Arbrir Archivo Datos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setText("Abrir Archivo Tafico");
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
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, 111, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));            
        jComboBox4.setEnabled(true);
        jButton3.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

  
    
    private void jTabbedPane1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTabbedPane1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1ComponentAdded

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
     
      
        
       
       
    }//GEN-LAST:event_formWindowActivated

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        String selectedValue = (String) jComboBox3.getSelectedItem();
        System.out.println("Valor seleccionado: " + selectedValue);
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        String selectedValue = (String) jComboBox2.getSelectedItem();
        System.out.println("Valor seleccionado: " + selectedValue);
        
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        String selectedValue = (String) jComboBox1.getSelectedItem();
        System.out.println("Valor seleccionado: " + selectedValue);
        enlistarDestinos(selectedValue);
        List<Grafo> grafos =  new ArrayList<>();
        for (Grafo grafo : lista) {
            if (grafo.getValor().equals(selectedValue)) {
                graficarNodos(grafos, grafo);
                Graficar.Graficar.generarGraficosListado(grafos);
               
            }
        }
        
        listaRecortada =  new ArrayList<Grafo>(grafos);
        
        


    }//GEN-LAST:event_jComboBox1ActionPerformed

    public void graficarNodos(List<Grafo> grafos,Grafo grafo){
        for (NodoGrafo nodo : grafo.getNodos()) {
            for (Grafo grafox : lista) {
                if (nodo.getDestino().equals(grafox.getValor()) || nodo.getOrigen().equals(grafox.getValor()) ) {
                    if(!grafos.contains(grafox)){
                        System.out.println("Grafo agregado " + grafox.getValor());
                        grafos.add(grafox);
                    }
                    
                }
            }
        }
        
        
        List<Grafo> gradoCopia =new ArrayList<>(grafos);
        gradoCopia.remove(0);
        for (Grafo grafo1 : gradoCopia) {
            for (NodoGrafo nodo : grafo1.getNodos()) {
              for (Grafo grafox : lista) {
                    if (nodo.getDestino().equals(grafox.getValor()) || nodo.getOrigen().equals(grafox.getValor())) {
                        if(!grafos.contains(grafox)){
                            System.out.println("Grafo agregado " + grafox.getValor());
                            grafos.add(grafox);
                        }
                    }
              }
            }
        }
        
        for(Grafo grafop:grafos){
            System.out.println("grafos" + grafop.getValor());
        }
    }
    
    public void enlistarDestinos(String selectedValue ){
        boolean agregar = true;
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        List<Grafo> grafos =  new ArrayList<>();
        for (Grafo grafo : lista) {
            if (grafo.getValor().equals(selectedValue)) {
                 graficarNodos(grafos, grafo);
                 for (Grafo grafo1 : grafos) {
                    for (NodoGrafo nodo : grafo1.getNodos()) {
                    if (nodo.getNodo() == null || nodo.getNodo().getNodos().isEmpty()) {
                        for (int i = 0; i < jComboBox2.getItemCount(); i++) {
                            agregar = !nodo.getDestino().equals(jComboBox2.getItemAt(i));
                            if (!agregar) {
                                i= jComboBox2.getItemCount();
                            }
                        }
                       
                        if (agregar) {
                            jComboBox2.addItem(nodo.getDestino()); 
                        }
                          
                    }else if (nodo.getNodo() !=null) {
                        for (int i = 0; i < jComboBox2.getItemCount(); i++) {
                            agregar = !nodo.getDestino().equals(jComboBox2.getItemAt(i));
                            if (!agregar) {
                                i= jComboBox2.getItemCount();
                            }
                        }
                       
                        if (agregar) {
                            jComboBox2.addItem(nodo.getDestino()); 
                        }
                        siguienteNodo(nodo);
                    }
                }
                }
                
            }
        }
    }
    
    public void siguienteNodo(NodoGrafo nodo){
        boolean agregar = true;
          
        if (nodo.getNodo() != null) {
            for (NodoGrafo nodoGrafo : nodo.getNodo().getNodos()) {
                System.out.println("Nodo siguente : " + nodoGrafo.getNodo());
                System.out.println("Nodo Actual Origen : " + nodoGrafo.getOrigen());
                System.out.println("Nodo Actual Destino : " + nodoGrafo.getDestino());
                System.out.println("Tamanio de listado  : " + jComboBox2.getItemCount());
                for (int i = 0; i < jComboBox2.getItemCount(); i++) {
                    agregar = nodoGrafo.getDestino().equals(jComboBox2.getItemAt(i));
                    if (agregar) {
                        i= jComboBox2.getItemCount();
                    }
                    
                }
                       
                System.out.println(agregar);
                if (!agregar) {
                    jComboBox2.addItem(nodoGrafo.getDestino()); 
                    }
                if (nodoGrafo.getNodo() != null) {
                    siguienteNodo(nodoGrafo);
                }
            }
        }
       
    }
    
    public NodoGrafo nodoFinal(NodoGrafo nodo){
          
        System.out.println("nodografo : " + nodo.getNodo().getNodos() );
        if (nodo.getNodo().getNodos() != null) {
            for (NodoGrafo nodoGrafo : nodo.getNodo().getNodos()) {
                System.out.println("Nodo : " + nodoGrafo.getNodo());
                
                if (nodoGrafo.getNodo() == null) {
                    return nodoGrafo;
        
                }
            }
        }
        
        return null;
    }
    
     public static List<NodoGrafo> enlistar(List<List<NodoGrafo>> listadoDeGrafos, Grafo grafo, String origen, String destino) {        
            List<NodoGrafo> nodoGrafos = new ArrayList<>();
            boolean valor ;
         if (grafo != null) {
            for (NodoGrafo nodoGrafo : grafo.getNodos()) {
                valor = true;
                
                System.out.println("Listado origen " + nodoGrafo.getOrigen());
                System.out.println("Listado destino " + nodoGrafo.getDestino());

                System.out.println("Destino Buscado : "+destino);
                System.out.println("Origen : "+origen);
                System.out.println("Destino : "+ destino);
                
                if(nodoGrafo.getNodo() == null || nodoGrafo.getNodo().getNodos().isEmpty()){
                    for (NodoGrafo nodoGrafo1 : nodoGrafos) {
                            System.out.println("0>>>>>>>>>>>>Noodos grafo : " + nodoGrafo1);
                        }
                    if (nodoGrafo.getOrigen().equals(origen) && nodoGrafo.getDestino().equals(destino)) {
                        if (!nodoGrafos.contains(nodoGrafo)) {
                            valor = false;
                           
                        }
                        if (valor) {
                             nodoGrafos.add(nodoGrafo);
                        }
                        if(!listadoDeGrafos.contains(nodoGrafos)){
                            listadoDeGrafos.add(nodoGrafos);
                        }
                        for (NodoGrafo nodoGrafo1 : nodoGrafos) {
                            System.out.println("+++++++++++++++Noodos grafo : " + nodoGrafo1);
                        }for (List<NodoGrafo> nodoGrafo1 : listadoDeGrafos) {
                            System.out.println("1>>>>>>>>>>>>>>>Noodos grafo : " + nodoGrafo1);
                        }
                        
                    }
                    else if(nodoGrafo.getDestino().equals(destino)){
                        for (List<NodoGrafo> nodoGrafo1 : listadoDeGrafos) {
                            System.out.println("2>>>>>>>>>>>>>>>Noodos grafo : " + nodoGrafo1);
                        }
                        for (NodoGrafo nodoGrafo1 : nodoGrafos) {
                            System.out.println("01>>>>>>>>>>>>Noodos grafo : " + nodoGrafo1);
                        }
                    }
                    else if(!nodoGrafo.getDestino().equals(destino) && nodoGrafo.getOrigen().equals(origen)){
                        for (NodoGrafo nodoGrafo1 : nodoGrafos) {
                            System.out.println("****************sNoodos grafo : " + nodoGrafo1);
                        }
                        
                    }
                    else{
                        listadoDeGrafos.remove(nodoGrafos);
                        nodoGrafos.remove(nodoGrafos.size()-1);
                        for (List<NodoGrafo> nodoGrafo1 : listadoDeGrafos) {
                            System.out.println("3>>>>>>>>>>>>>>>Noodos grafo : " + nodoGrafo1);
                        }
                        for (NodoGrafo nodoGrafo1 : nodoGrafos) {
                            System.out.println("02>>>>>>>>>>>>Noodos grafo : " + nodoGrafo1);
                        }
                    }
                }
                /*else if((!nodoGrafo.getNodo().getNodos().isEmpty()) && nodoGrafo.getOrigen().equals(origen) && nodoGrafo.getNodo() != null && nodoGrafo.getDestino().equals(destino)){
                    nodoGrafos.add(nodoGrafo);
                    listadoDeGrafos.add(nodoGrafos);
                    for (List<NodoGrafo> nodoGrafo1 : listadoDeGrafos) {
                            System.out.println("add>>>>>>>>>>>>>>>Noodos grafo : " + nodoGrafo1);
                    }
                    for (NodoGrafo nodoGrafo1 : nodoGrafos) {
                            System.out.println("03>>>>>>>>>>>>Noodos grafo : " + nodoGrafo1);
                        }

                    return;
                }
                else if(nodoGrafo.getOrigen().equals(origen)){
                    nodoGrafos.add(nodoGrafo);
                    for (List<NodoGrafo> nodoGrafo1 : listadoDeGrafos) {
                            System.out.println("4>>>>>>>>>>>>>>>Noodos grafo : " + nodoGrafo1);
                    }
                    for (NodoGrafo nodoGrafo1 : nodoGrafos) {
                            System.out.println("04>>>>>>>>>>>>Noodos grafo : " + nodoGrafo1);
                        }
                    enlistar(listadoDeGrafos, nodoGrafos, nodoGrafo.getNodo(), origen,destino);
                    
                }
                else if(nodoGrafo.getNodo() != null){
                    for (List<NodoGrafo> nodoGrafo1 : listadoDeGrafos) {
                            System.out.println("5>>>>>>>>>>>>>>>Noodos grafo : " + nodoGrafo1);
                        }
                    enlistar(listadoDeGrafos, nodoGrafos, nodoGrafo.getNodo(), origen,destino);
                    
                    
                }else{
                    for (List<NodoGrafo> nodoGrafo1 : listadoDeGrafos) {
                            System.out.println("6>>>>>>>>>>>>>>>Noodos grafo : " + nodoGrafo1);
                        }
                    enlistar(listadoDeGrafos, nodoGrafos, nodoGrafo.getNodo(), origen,destino);
                    
                } */
            }
            for (NodoGrafo nodoGrafo : grafo.getNodos()) {
            System.out.println("lista recortada" + listaRecortada.size());
            for (int i = 0; i < listaRecortada.size(); i++) {
                    for (NodoGrafo nodo : listaRecortada.get(i).getNodos() ) {
                        valor = true;
                        if(nodo.getDestino().equals(listaRecortada.get(i).getValor()) && !nodo.getDestino().equals(listaRecortada.get(0).getValor()) ){
                             if (!nodoGrafos.contains(nodoGrafo)) {
                                valor = false;
                           
                                }
                                if (valor) {
                                     nodoGrafos.add(nodoGrafo);
                                }
                            if (!nodo.getOrigen().equals(listaRecortada.get(0).getValor())) {
                                almacenaRuta(nodoGrafos);
                            }
                        }
                        else if(!nodo.getOrigen().equals(listaRecortada.get(i).getValor()) && nodo.getDestino().equals(listaRecortada.get(0).getValor())){
                          if (!nodoGrafos.contains(nodo)) {
                            nodoGrafos.add(nodo);
                           }
                       }
                    }
                    listadoDeGrafos.add(nodoGrafos);

            }


            for (NodoGrafo nodo : nodoGrafos) {
                        System.out.println(nodo.toString());
                   }


           }
            return nodoGrafos;
        }
        
        return null;
    }
    
     public static void almacenaRuta(List<NodoGrafo> nodoGrafos){
           boolean valor;
         for (Grafo grafo : listaRecortada) {
             for (NodoGrafo nodo : grafo.getNodos()) {
               valor = true;
                 if(nodo.getDestino().equals(grafo.getValor()) && !nodo.getDestino().equals(listaRecortada.get(0).getValor())){
                          if (!nodoGrafos.contains(nodo)) {
                                valor = false;
                           
                                }
                                if (valor) {
                                     nodoGrafos.add(nodo);
                                }
                         if (!nodo.getOrigen().equals(listaRecortada.get(0).getValor())) {
                             almacenaRuta(nodoGrafos);
                         }
                     }
                 else if(!nodo.getOrigen().equals(grafo.getValor()) && nodo.getDestino().equals(listaRecortada.get(0).getValor())){
                     if (!nodoGrafos.contains(nodo)) {
                         nodoGrafos.add(nodo);
                     }
                        
                    }
             }
         }
     }
     
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        System.out.println("Seleccionando Boton carga");
        String selectedValue2= (String) jComboBox2.getSelectedItem();
        String selectedValue1 = (String) jComboBox1.getSelectedItem();
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        //ArbolB arbolB = new ArbolB(0, new ArrayList<>() );
        for (Grafo grafo : lista) {
            if (grafo.getValor().equals(selectedValue1)) {
                double total = 0;
                List<List<NodoGrafo>> listadoGrafos = new ArrayList<>();
                List<NodoGrafo> nodoGrafos = new ArrayList<>();
                nodoGrafos.clear();
                nodoGrafos =new ArrayList<>(enlistar(listadoGrafos, grafo, selectedValue1 ,selectedValue2));
               
                for (NodoGrafo grafos : nodoGrafos) {
                    total = Calculo.calcularRapidezCaminando(grafos.getDistancia(), grafos.getTiempo_aproximado_a_pie());
//                    total = Calculo.calcularRapidezVehiculo(grafos.getDistancia(), grafos.getTiempo_promedio_vehiculo(), grafos.getProbabilidad_trafico());               
            //         arbolB.setNodoRaizValor(grafos);
                }
                
                   System.out.println("Lista total ");
                for (List<NodoGrafo> listadoGrafo : listadoGrafos) {
                    System.out.println("Nodografo " + listadoGrafo);
                    for (NodoGrafo nodoGrafo : listadoGrafo) {
                        System.out.println(nodoGrafo.toString());
                    }
                }
                System.out.println("Lista total ");
                for (NodoGrafo listadoGrafo : nodoGrafos) {
                     System.out.println(listadoGrafo.toString());
                      jComboBox4.addItem(listadoGrafo.getDestino());
                }
               
               
               // arbolB.setId(total);
                int t = 3;
                ArbolB arbolB = new ArbolB(t);
                int i = 0;
                for (List<NodoGrafo> nocoGrafo : listadoGrafos) {
                    arbolB.insertar(i,nocoGrafo);
                    i++;
                }
                arbolB.showBTree();
            }
        }
        
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            ImageIcon icon = new ImageIcon("src/main/java/Graficar/graficaGenerada.png");
            icon.getImage().flush();
            jLabel7.setIcon(icon);
        }
        
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            lista = CargarDatos.leerCSVDatos(selectedFile);
        }
         jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        for (Grafo grafo : lista) {
            jComboBox1.addItem(grafo.getValor());
            for(NodoGrafo nodo : grafo.getNodos()){
                jComboBox1.addItem(nodo.getDestino());
            }
            
         }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            CargarDatos.leerCSVTrafico(selectedFile);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
         if (evt.getButton() == MouseEvent.BUTTON1) {
            zoomIn();
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {
            zoomOut();
        }
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
            File archivo = new File("src/main/java/Graficar/graficaGenerada.png");
            archivo.delete();
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       File archivo = new File("src/main/java/Graficar/graficaGenerada.png");
            archivo.delete();
    }//GEN-LAST:event_formWindowClosing

    
private void zoomIn() {
    ImageIcon icon = new ImageIcon("src/main/java/Graficar/graficaGenerada.png");
    Image image = icon.getImage();
    
    double scaleFactor = 1.1;
    
    int newWidth = (int) (image.getWidth(null) * scaleFactor);
    int newHeight = (int) (image.getHeight(null) * scaleFactor);
    
    Image zoomedInImage = image.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
    
    ImageIcon zoomedInIcon = new ImageIcon(zoomedInImage);
    
    jLabel7.setIcon(zoomedInIcon);
}

private void zoomOut() {
    ImageIcon icon = (ImageIcon) jLabel7.getIcon();
    Image image = icon.getImage();
    
    double scaleFactor = 0.9;
    
    int newWidth = (int) (image.getWidth(null) * scaleFactor);
    int newHeight = (int) (image.getHeight(null) * scaleFactor);
    
    Image zoomedOutImage = image.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
    
    ImageIcon zoomedOutIcon = new ImageIcon(zoomedOutImage);
    
    jLabel7.setIcon(zoomedOutIcon);
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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}

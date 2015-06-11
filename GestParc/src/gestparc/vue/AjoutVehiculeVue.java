/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestparc.vue;

import gestparc.controleur.Controleur;
import gestparc.modele.enums.Categorie;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author vpivet
 */
public class AjoutVehiculeVue extends javax.swing.JFrame {
    private Controleur ctrl;
    /**
     * Creates new form AjoutVehiculeVue
     */
    public AjoutVehiculeVue(Controleur ctrl) {
        this.ctrl = ctrl;
        initComponents();
        initUI();
        this.setVisible(true);
    }
    
    public void initUI()
    {
        jCbTypeVehicule.setModel(new DefaultComboBoxModel(new String[]{"Intervention", "Service", "Transport employés", "Transport passagers"}));
        hideForIntervention();
        jCbCategorie.setModel(new DefaultComboBoxModel(new Categorie[]{Categorie.VOITURE, Categorie.UTILITAIRE}));
        jCbJourArrVehicule.setModel(new DefaultComboBoxModel(new String[]{"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"}));
        jCbJourDebAff.setModel(new DefaultComboBoxModel(new String[]{"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"}));
        jCbDateJourFinAff.setModel(new DefaultComboBoxModel(new String[]{"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"}));
        jCbDateMoisFinAff.setModel(new DefaultComboBoxModel(new String[]{"01","02","03","04","05","06","07","08","09","10","11","12"}));
        jCbMoisDebAff.setModel(new DefaultComboBoxModel(new String[]{"01","02","03","04","05","06","07","08","09","10","11","12"}));
        jCbMoisArrVehicule.setModel(new DefaultComboBoxModel(new String[]{"01","02","03","04","05","06","07","08","09","10","11","12"}));
        jCbAnneeArrVehicule.setModel(new DefaultComboBoxModel(new String[]{"2015","2016","2017","2018"}));
        jCbAnneeDebAff.setModel(new DefaultComboBoxModel(new String[]{"2015","2016","2017","2018"}));
        jCbAnneeFinAff.setModel(new DefaultComboBoxModel(new String[]{"2015","2016","2017","2018"}));
    }
    
    public void resetEnabled()
    {
        jCbAnneeDebAff.setEnabled(false);
        jCbAnneeFinAff.setEnabled(false);
        jCbDateJourFinAff.setEnabled(false);
        jCbDateMoisFinAff.setEnabled(false);
        jCbJourDebAff.setEnabled(false);
        jCbMoisDebAff.setEnabled(false);
        jAffectation.setEnabled(false);
        jNomResponsable.setEnabled(false);
        jNomDepot.setEnabled(false);
        jNomService.setEnabled(false);
        jNomSite.setEnabled(false);
    }
    
    public void hideCheckAction()
    {
        if(jAffectation.isSelected())
        {
            jCbAnneeDebAff.setEnabled(true);
            jCbAnneeFinAff.setEnabled(true);
            jCbDateJourFinAff.setEnabled(true);
            jCbDateMoisFinAff.setEnabled(true);
            jCbJourDebAff.setEnabled(true);
            jCbMoisDebAff.setEnabled(true);
            jAffectation.setEnabled(true);
            jNomResponsable.setEnabled(true);
        }else{
            resetEnabled();
            jAffectation.setEnabled(true);
        }
    }
    
    public void hideForIntervention()
    {
        resetEnabled();
        jNomService.setEnabled(true);
    }
    
    public void hideForService()
    {
        resetEnabled();
        jCbAnneeDebAff.setEnabled(true);
        jCbAnneeFinAff.setEnabled(true);
        jCbDateJourFinAff.setEnabled(true);
        jCbDateMoisFinAff.setEnabled(true);
        jCbJourDebAff.setEnabled(true);
        jCbMoisDebAff.setEnabled(true);
        jAffectation.setEnabled(true);
        jNomResponsable.setEnabled(true);
        hideCheckAction();
    }
    
    public void hideForTransportEmploye()
    {
        resetEnabled();
        jNomSite.setEnabled(true);
    }
    
    public void hideForTransportPassager()
    {
        resetEnabled();
        jNomDepot.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jImmatriculation = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCbTypeVehicule = new javax.swing.JComboBox();
        jCbCategorie = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jNomResponsable = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jAffectation = new javax.swing.JCheckBox();
        jCbMoisDebAff = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jCbJourDebAff = new javax.swing.JComboBox();
        jCbAnneeDebAff = new javax.swing.JComboBox();
        jCbAnneeFinAff = new javax.swing.JComboBox();
        jCbDateMoisFinAff = new javax.swing.JComboBox();
        jCbDateJourFinAff = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCbJourArrVehicule = new javax.swing.JComboBox();
        jCbMoisArrVehicule = new javax.swing.JComboBox();
        jCbAnneeArrVehicule = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jNomSite = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jNomDepot = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jNomService = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jValider = new javax.swing.JButton();
        jAnnuler = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Ajouter un nouveau véhicule :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Immatriculation du vehicule");

        jLabel6.setText("Type de vehicule");

        jLabel7.setText("Categorie");

        jCbTypeVehicule.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCbTypeVehicule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbTypeVehiculeActionPerformed(evt);
            }
        });

        jCbCategorie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCbCategorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbCategorieActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Vehicule de service");

        jLabel10.setText("Nom du responsable :");

        jAffectation.setSelected(true);
        jAffectation.setText("Est affecté");
        jAffectation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAffectationActionPerformed(evt);
            }
        });

        jCbMoisDebAff.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCbMoisDebAff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbMoisDebAffActionPerformed(evt);
            }
        });

        jLabel11.setText("Date début affectation");

        jCbJourDebAff.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jCbAnneeDebAff.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jCbAnneeFinAff.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jCbDateMoisFinAff.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jCbDateJourFinAff.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel12.setText("Date fin affectation");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jAffectation))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jNomResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 298, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCbJourDebAff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCbMoisDebAff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCbAnneeDebAff, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCbDateJourFinAff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCbDateMoisFinAff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCbAnneeFinAff, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jAffectation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jNomResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCbJourDebAff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCbMoisDebAff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCbAnneeDebAff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCbDateJourFinAff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCbDateMoisFinAff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCbAnneeFinAff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setText("Date d'arrivée du vehicule");

        jCbJourArrVehicule.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jCbMoisArrVehicule.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jCbAnneeArrVehicule.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel15.setText("Nom du site :");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Vehicule de transport employé");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addContainerGap(308, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                            .addComponent(jNomSite, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addComponent(jLabel16)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(jNomSite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel17.setText("Nom du dépot :");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Vehicule de transport passagé");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel18)
                            .addContainerGap(608, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                            .addComponent(jNomDepot, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addComponent(jLabel18)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(jNomDepot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel13.setText("Nom du service :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Vehicule d'intervention");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addContainerGap(354, Short.MAX_VALUE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jNomService, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addComponent(jLabel14)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(jNomService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jValider.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jValider.setText("Valider");
        jValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jValiderActionPerformed(evt);
            }
        });

        jAnnuler.setText("Annuler");
        jAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAnnulerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jImmatriculation)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCbJourArrVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCbMoisArrVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCbAnneeArrVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jCbTypeVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jCbCategorie, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jValider)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jAnnuler)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jImmatriculation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCbTypeVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCbCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCbJourArrVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCbMoisArrVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCbAnneeArrVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jValider)
                    .addComponent(jAnnuler))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCbCategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbCategorieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbCategorieActionPerformed

    private void jAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAnnulerActionPerformed
        this.dispose();
    }//GEN-LAST:event_jAnnulerActionPerformed

    private void jCbMoisDebAffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbMoisDebAffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbMoisDebAffActionPerformed

    private void jCbTypeVehiculeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbTypeVehiculeActionPerformed
        switch((String) jCbTypeVehicule.getSelectedItem())
        {
            case "Intervention":
                hideForIntervention();
                jCbCategorie.setModel(new DefaultComboBoxModel(new Categorie[]{Categorie.VOITURE, Categorie.UTILITAIRE}));
                break;
            case "Service":
                hideForService();
                jCbCategorie.setModel(new DefaultComboBoxModel(new Categorie[]{Categorie.VOITURE, Categorie.UTILITAIRE}));
                break;
            case "Transport employés":
                hideForTransportEmploye();
                jCbCategorie.setModel(new DefaultComboBoxModel(new Categorie[]{Categorie.VOITURE, Categorie.CAMIONNETTE, Categorie.BUS}));
                break;
            case "Transport passagers":
                hideForTransportPassager();
                jCbCategorie.setModel(new DefaultComboBoxModel(new Categorie[]{Categorie.CAMIONNETTE, Categorie.BUS}));
                break;
        }
    }//GEN-LAST:event_jCbTypeVehiculeActionPerformed

    private void jAffectationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAffectationActionPerformed
        hideCheckAction();
    }//GEN-LAST:event_jAffectationActionPerformed

    private void jValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jValiderActionPerformed
        switch((String) jCbTypeVehicule.getSelectedItem())
        {
            case "Intervention":
                ctrl.ajouterVehiculeIntervention(jImmatriculation.getText(),(Categorie) jCbCategorie.getSelectedItem(),(String) jCbJourArrVehicule.getSelectedItem(),(String) jCbMoisArrVehicule.getSelectedItem(),(String) jCbAnneeArrVehicule.getSelectedItem(), jNomService.getText());
                break;
            case "Service":
                if(jAffectation.isSelected())
                    ctrl.ajouterVehiculeService(jImmatriculation.getText(),(Categorie) jCbCategorie.getSelectedItem(),(String) jCbJourArrVehicule.getSelectedItem(),(String) jCbMoisArrVehicule.getSelectedItem(),(String) jCbAnneeArrVehicule.getSelectedItem(),
                            (String) jCbJourDebAff.getSelectedItem(),(String) jCbMoisDebAff.getSelectedItem(),(String) jCbAnneeDebAff.getSelectedItem(),
                            (String) jCbDateJourFinAff.getSelectedItem(),(String) jCbDateMoisFinAff.getSelectedItem(),(String) jCbAnneeFinAff.getSelectedItem(), jNomResponsable.getText());
                else
                    ctrl.ajouterVehiculeService(jImmatriculation.getText(), (Categorie) jCbCategorie.getSelectedItem(), (String) jCbJourArrVehicule.getSelectedItem(),(String) jCbMoisArrVehicule.getSelectedItem(),(String) jCbAnneeArrVehicule.getSelectedItem());
                break;
            case "Transport employés":
                ctrl.ajouterVehiculeTransportEmploye(jImmatriculation.getText(),(Categorie) jCbCategorie.getSelectedItem(),(String) jCbJourArrVehicule.getSelectedItem(),(String) jCbMoisArrVehicule.getSelectedItem(),(String) jCbAnneeArrVehicule.getSelectedItem(), jNomSite.getText());
                break;
            case "Transport passagers":
                ctrl.ajouterVehiculeTransportPassager(jImmatriculation.getText(),(Categorie) jCbCategorie.getSelectedItem(),(String) jCbJourArrVehicule.getSelectedItem(),(String) jCbMoisArrVehicule.getSelectedItem(),(String) jCbAnneeArrVehicule.getSelectedItem(), jNomDepot.getText());
                break;
        }
        this.dispose();
    }//GEN-LAST:event_jValiderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jAffectation;
    private javax.swing.JButton jAnnuler;
    private javax.swing.JComboBox jCbAnneeArrVehicule;
    private javax.swing.JComboBox jCbAnneeDebAff;
    private javax.swing.JComboBox jCbAnneeFinAff;
    private javax.swing.JComboBox jCbCategorie;
    private javax.swing.JComboBox jCbDateJourFinAff;
    private javax.swing.JComboBox jCbDateMoisFinAff;
    private javax.swing.JComboBox jCbJourArrVehicule;
    private javax.swing.JComboBox jCbJourDebAff;
    private javax.swing.JComboBox jCbMoisArrVehicule;
    private javax.swing.JComboBox jCbMoisDebAff;
    private javax.swing.JComboBox jCbTypeVehicule;
    private javax.swing.JTextField jImmatriculation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jNomDepot;
    private javax.swing.JTextField jNomResponsable;
    private javax.swing.JTextField jNomService;
    private javax.swing.JTextField jNomSite;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jValider;
    // End of variables declaration//GEN-END:variables

    public void afficherErreur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

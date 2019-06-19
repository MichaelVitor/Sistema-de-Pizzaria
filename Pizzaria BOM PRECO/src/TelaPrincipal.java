
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author btd
 */
public class TelaPrincipal extends javax.swing.JFrame {

    public ArrayList<Mesa> mesas;
    public ArrayList<Pedido> pedidos;
    public ArrayList<Produto> produtos;
    public DefaultListModel<Mesa> modeloMesa;
    public DefaultListModel<Pedido> modeloPedido;
    public DefaultListModel<Produto> modeloProduto;
    
    
    
    public TelaPrincipal() {
        initComponents();
        
        mesas = new ArrayList();
        pedidos = new ArrayList();
        produtos = new ArrayList();
        
        //Inicializa 10 Mesas
        for(int i=0; i<10; i++){
            Mesa novaMesa = new Mesa();
        
        DefaultListModel<Mesa> mesas;
        mesas = (DefaultListModel<Mesa>)lstMesas.getModel();        
        mesas.addElement(novaMesa);
        }
        
        //Inicializa Produtos
        Produto p = new Produto("Pizza Americana G",26.0);                      
        //adiciona a JList de produtos
        DefaultListModel<Produto> dlmProdutos;
        dlmProdutos = (DefaultListModel<Produto>)lstProdutos.getModel();
        dlmProdutos.addElement(p);
        
        Produto pp = new Produto("Pizza Americana M",20.0);                      
        //adiciona a JList de produtos
        dlmProdutos = (DefaultListModel<Produto>)lstProdutos.getModel();
        dlmProdutos.addElement(pp);
        
        
        
        Produto p1 = new Produto("Pizza de Atum",25.50);
        dlmProdutos = (DefaultListModel<Produto>)lstProdutos.getModel();
        dlmProdutos.addElement(p1);
                
        Produto p2 = new Produto("Pizza de Bacon",27.50);
        dlmProdutos = (DefaultListModel<Produto>)lstProdutos.getModel();
        dlmProdutos.addElement(p2);
        
        
        Produto p3 = new Produto("Pizza de Calabresa",25.0);
        dlmProdutos = (DefaultListModel<Produto>)lstProdutos.getModel();
        dlmProdutos.addElement(p3);
        
        
        Produto p4 = new Produto("Pizza de Catupiry",25.50);
        dlmProdutos = (DefaultListModel<Produto>)lstProdutos.getModel();
        dlmProdutos.addElement(p4);
        
        
        Produto p5 = new Produto("Pizza de Frango",25.0);
        dlmProdutos = (DefaultListModel<Produto>)lstProdutos.getModel();
        dlmProdutos.addElement(p5);
        
        
        Produto p6 = new Produto("Pizza de Lombo",26.0);
        dlmProdutos = (DefaultListModel<Produto>)lstProdutos.getModel();
        dlmProdutos.addElement(p6);
        
        
        Produto p7 = new Produto("Pizza de Mussarela",25.50);
        dlmProdutos = (DefaultListModel<Produto>)lstProdutos.getModel();
        dlmProdutos.addElement(p7);
        
        
        Produto p8 = new Produto("Pizza Paulista",27.0);
        dlmProdutos = (DefaultListModel<Produto>)lstProdutos.getModel();
        dlmProdutos.addElement(p8);
        
        
        Produto p9 = new Produto("Pizza Portuguesa",25.0);
        dlmProdutos = (DefaultListModel<Produto>)lstProdutos.getModel();
        dlmProdutos.addElement(p9);
        
        
        Produto p10 = new Produto("Coca Cola 2L",5.50);
        dlmProdutos = (DefaultListModel<Produto>)lstbenidas.getModel();
        dlmProdutos.addElement(p10);
        
        
        Produto p11 = new Produto("Coca Cola 500mL",3.0);
        dlmProdutos = (DefaultListModel<Produto>)lstbenidas.getModel();
        dlmProdutos.addElement(p11);
        
        
        Produto p12 = new Produto("Agua Mineral 300mL",2.0);
        dlmProdutos = (DefaultListModel<Produto>)lstbenidas.getModel();
        dlmProdutos.addElement(p12);
        
        
        Produto p13 = new Produto("Brahma",4.0);
        dlmProdutos = (DefaultListModel<Produto>)lstbenidas.getModel();
        dlmProdutos.addElement(p13);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblMesas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstMesas = new javax.swing.JList();
        btnAbreMesa1 = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAddb2 = new javax.swing.JButton();
        btnAddb6 = new javax.swing.JButton();
        btnFechaComanda = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        lblDescricaoMesa = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstDescricaoMesa = new javax.swing.JList();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtHorarioEntrada = new javax.swing.JTextField();
        btnAbreMesa = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        lblProdutos = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstProdutos = new javax.swing.JList();
        lblQtde = new javax.swing.JLabel();
        spnQtdeDeItens = new javax.swing.JSpinner();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstbenidas = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblQtde1 = new javax.swing.JLabel();
        spnQtdeDeItens1 = new javax.swing.JSpinner();
        btnAddb1 = new javax.swing.JButton();
        btnAddb3 = new javax.swing.JButton();
        btnAddb4 = new javax.swing.JButton();
        btnAdicionaMesaB = new javax.swing.JButton();
        btnAdicionaMesaP = new javax.swing.JButton();
        btnAddb = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menOpcoes = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        CadCliente = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        registrarEntrega = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menAjuda = new javax.swing.JMenu();
        mitemInstrucoes = new javax.swing.JMenuItem();
        mitemSobre = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(135, 0, 6));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMesas.setFont(new java.awt.Font("Open Sans Semibold", 0, 30)); // NOI18N
        lblMesas.setForeground(new java.awt.Color(255, 255, 255));
        lblMesas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMesas.setText("MESAS");
        lblMesas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(lblMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 367, -1));

        lstMesas.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lstMesas.setForeground(new java.awt.Color(51, 51, 51));
        lstMesas.setModel(new DefaultListModel<Mesa>());
        lstMesas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstMesas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstMesasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstMesas);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 340, 300));

        btnAbreMesa1.setBackground(new java.awt.Color(192, 57, 42));
        btnAbreMesa1.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        btnAbreMesa1.setForeground(new java.awt.Color(255, 255, 255));
        btnAbreMesa1.setText("Abrir Mesa");
        btnAbreMesa1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAbreMesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HandlerBtnAbreMesa(evt);
            }
        });
        jPanel2.add(btnAbreMesa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 150, 30));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("- VEJA A DESCRIÇÃO AO LADO.");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 220, 20));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("- SELECIONE UMA MESA PARA ABRI-LA");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 220, 20));

        btnAddb2.setBackground(new java.awt.Color(192, 57, 42));
        btnAddb2.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        btnAddb2.setForeground(new java.awt.Color(255, 255, 255));
        btnAddb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/remover.png"))); // NOI18N
        btnAddb2.setText("Remover Mesa");
        btnAddb2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddb2HandlerAdicionaPedido(evt);
            }
        });
        jPanel2.add(btnAddb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 150, 30));

        btnAddb6.setBackground(new java.awt.Color(192, 57, 42));
        btnAddb6.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        btnAddb6.setForeground(new java.awt.Color(255, 255, 255));
        btnAddb6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mais.png"))); // NOI18N
        btnAddb6.setText("Add Mesa");
        btnAddb6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddb6HandlerAdicionaPedido(evt);
            }
        });
        jPanel2.add(btnAddb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 150, 30));

        btnFechaComanda.setBackground(new java.awt.Color(192, 57, 42));
        btnFechaComanda.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        btnFechaComanda.setForeground(new java.awt.Color(255, 255, 255));
        btnFechaComanda.setText("Fechar Mesa");
        btnFechaComanda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFechaComanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HandlerFechaComanda(evt);
            }
        });
        jPanel2.add(btnFechaComanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 150, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 658));

        jPanel3.setBackground(new java.awt.Color(135, 0, 6));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel3.setLayout(null);

        lblDescricaoMesa.setFont(new java.awt.Font("Open Sans Semibold", 0, 30)); // NOI18N
        lblDescricaoMesa.setForeground(new java.awt.Color(255, 255, 255));
        lblDescricaoMesa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescricaoMesa.setText("DESCRIÇÃO DA MESA");
        jPanel3.add(lblDescricaoMesa);
        lblDescricaoMesa.setBounds(40, 20, 371, 43);

        lstDescricaoMesa.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lstDescricaoMesa.setModel(new DefaultListModel<Pedido>());
        lstDescricaoMesa.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(lstDescricaoMesa);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(20, 160, 406, 300);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel1.setText("Horário de Entrada:");

        txtHorarioEntrada.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        txtHorarioEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorarioEntradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtHorarioEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHorarioEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel5);
        jPanel5.setBounds(20, 90, 406, 49);

        btnAbreMesa.setBackground(new java.awt.Color(192, 57, 42));
        btnAbreMesa.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        btnAbreMesa.setForeground(new java.awt.Color(255, 255, 255));
        btnAbreMesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        btnAbreMesa.setText("Cancelar Item");
        btnAbreMesa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAbreMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HandlerBtnCancelaPedido(evt);
            }
        });
        jPanel3.add(btnAbreMesa);
        btnAbreMesa.setBounds(140, 480, 170, 30);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 0, 453, 658));

        jPanel4.setBackground(new java.awt.Color(136, 0, 6));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel4.setLayout(null);

        lblProdutos.setFont(new java.awt.Font("Open Sans Semibold", 0, 30)); // NOI18N
        lblProdutos.setForeground(new java.awt.Color(255, 255, 255));
        lblProdutos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProdutos.setText("PRODUTOS");
        jPanel4.add(lblProdutos);
        lblProdutos.setBounds(11, 19, 384, 40);

        lstProdutos.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lstProdutos.setModel(new DefaultListModel<Produto>());
        lstProdutos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(lstProdutos);

        jPanel4.add(jScrollPane3);
        jScrollPane3.setBounds(20, 350, 374, 150);

        lblQtde.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        lblQtde.setForeground(new java.awt.Color(255, 255, 255));
        lblQtde.setText("Qtde");
        jPanel4.add(lblQtde);
        lblQtde.setBounds(30, 520, 42, 21);

        spnQtdeDeItens.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        spnQtdeDeItens.setValue(1);
        jPanel4.add(spnQtdeDeItens);
        spnQtdeDeItens.setBounds(80, 510, 70, 38);

        lstbenidas.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lstbenidas.setModel(new DefaultListModel<Produto>());
        lstbenidas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(lstbenidas);

        jPanel4.add(jScrollPane4);
        jScrollPane4.setBounds(20, 90, 374, 130);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BEBIDAS");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(20, 70, 60, 14);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PIZZAS");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(20, 330, 50, 14);

        lblQtde1.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        lblQtde1.setForeground(new java.awt.Color(255, 255, 255));
        lblQtde1.setText("Qtde");
        jPanel4.add(lblQtde1);
        lblQtde1.setBounds(40, 240, 42, 21);

        spnQtdeDeItens1.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        spnQtdeDeItens1.setValue(1);
        jPanel4.add(spnQtdeDeItens1);
        spnQtdeDeItens1.setBounds(90, 230, 70, 38);

        btnAddb1.setBackground(new java.awt.Color(192, 57, 42));
        btnAddb1.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        btnAddb1.setForeground(new java.awt.Color(255, 255, 255));
        btnAddb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/remover.png"))); // NOI18N
        btnAddb1.setText("Remover Bebida");
        btnAddb1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddb1HandlerAdicionaPedido(evt);
            }
        });
        jPanel4.add(btnAddb1);
        btnAddb1.setBounds(240, 280, 150, 30);

        btnAddb3.setBackground(new java.awt.Color(192, 57, 42));
        btnAddb3.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        btnAddb3.setForeground(new java.awt.Color(255, 255, 255));
        btnAddb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mais.png"))); // NOI18N
        btnAddb3.setText("Add Pizza");
        btnAddb3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddb3HandlerAdicionaPedido(evt);
            }
        });
        jPanel4.add(btnAddb3);
        btnAddb3.setBounds(250, 520, 140, 30);

        btnAddb4.setBackground(new java.awt.Color(192, 57, 42));
        btnAddb4.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        btnAddb4.setForeground(new java.awt.Color(255, 255, 255));
        btnAddb4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/remover.png"))); // NOI18N
        btnAddb4.setText("Remover Pizza");
        btnAddb4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddb4HandlerAdicionaPedido(evt);
            }
        });
        jPanel4.add(btnAddb4);
        btnAddb4.setBounds(250, 560, 140, 30);

        btnAdicionaMesaB.setBackground(new java.awt.Color(192, 57, 42));
        btnAdicionaMesaB.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        btnAdicionaMesaB.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionaMesaB.setText("Adicionar Item à Mesa");
        btnAdicionaMesaB.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdicionaMesaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionaMesaBHandlerAdicionaPedido(evt);
            }
        });
        jPanel4.add(btnAdicionaMesaB);
        btnAdicionaMesaB.setBounds(30, 280, 180, 30);

        btnAdicionaMesaP.setBackground(new java.awt.Color(192, 57, 42));
        btnAdicionaMesaP.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        btnAdicionaMesaP.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionaMesaP.setText("Adicionar Item à Mesa");
        btnAdicionaMesaP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdicionaMesaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HandlerAdicionaPedido(evt);
            }
        });
        jPanel4.add(btnAdicionaMesaP);
        btnAdicionaMesaP.setBounds(30, 560, 180, 30);

        btnAddb.setBackground(new java.awt.Color(192, 57, 42));
        btnAddb.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        btnAddb.setForeground(new java.awt.Color(255, 255, 255));
        btnAddb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mais.png"))); // NOI18N
        btnAddb.setText("Add Bebida");
        btnAddb.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddbHandlerAdicionaPedido(evt);
            }
        });
        jPanel4.add(btnAddb);
        btnAddb.setBounds(240, 240, 150, 30);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(842, 0, 440, 658));

        menOpcoes.setText("Cadastrar");
        menOpcoes.add(jSeparator1);

        CadCliente.setText("Cadastrar Cliente");
        CadCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadClienteMouseClicked(evt);
            }
        });
        CadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadClienteActionPerformed(evt);
            }
        });
        menOpcoes.add(CadCliente);

        jMenuBar1.add(menOpcoes);

        jMenu3.setText("Remover");

        jMenuItem6.setText("Remover Cliente");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        registrarEntrega.setText("Delivery");
        registrarEntrega.setToolTipText("");
        registrarEntrega.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarEntregaMouseClicked(evt);
            }
        });
        registrarEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarEntregaActionPerformed(evt);
            }
        });
        jMenuBar1.add(registrarEntrega);

        jMenu5.setText("Consultar");

        jMenuItem10.setText("Historico do Cliente");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);

        jMenuItem9.setText("Historico de Entregas");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuBar1.add(jMenu5);

        jMenu4.setText("Finalizar Entregas");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        menAjuda.setText("Ajuda");

        mitemInstrucoes.setText("Instruções");
        mitemInstrucoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HandlerMItemInstrucoes(evt);
            }
        });
        menAjuda.add(mitemInstrucoes);

        mitemSobre.setText("Sobre");
        mitemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HandlerMItemSobre(evt);
            }
        });
        menAjuda.add(mitemSobre);

        jMenuBar1.add(menAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1285, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HandlerMItemSobre(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HandlerMItemSobre
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);
        sobre.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        sobre.setLocationRelativeTo(null);
    }//GEN-LAST:event_HandlerMItemSobre

    private void HandlerMItemInstrucoes(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HandlerMItemInstrucoes
        JOptionPane.showMessageDialog(null, 
                "Função em Implementação!","Instruções",
                JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_HandlerMItemInstrucoes

    
           
    
    private void registrarEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarEntregaActionPerformed
        
    }//GEN-LAST:event_registrarEntregaActionPerformed

    private void registrarEntregaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarEntregaMouseClicked
        registrarEntrega entrega = new registrarEntrega();
        entrega.setVisible(true);
        entrega.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        entrega.setResizable(false);
    }//GEN-LAST:event_registrarEntregaMouseClicked

    private void HandlerBtnCancelaPedido(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HandlerBtnCancelaPedido
        DefaultListModel<Pedido> listaDePedidos;
        listaDePedidos = (DefaultListModel<Pedido>) lstDescricaoMesa.getModel();

        //verifica se o pedido tem mais de 1 item
        int qtdeDisponivel = listaDePedidos.getElementAt(
            lstDescricaoMesa.getSelectedIndex()).getQtdeDoProduto();

        if(qtdeDisponivel > 1){   //Verifica se tem mais de 1 item para remover
            int numItensRemover;   //quantidade que será removida
            numItensRemover = Integer.parseInt(
                JOptionPane.showInputDialog("Quantidade a ser cancelada"));

            //verifica se não foi passado número superior a qtde já pedida
            if(numItensRemover>qtdeDisponivel){
                JOptionPane.showMessageDialog(
                    null, "Quantidade Para Cancelamento é Superior ao Pedido",
                    "Erro no Cancelamento de Pedido", JOptionPane.ERROR_MESSAGE);
            }
            else{
                if(numItensRemover == qtdeDisponivel){//verifica se vai zerar
                    listaDePedidos.remove(lstDescricaoMesa.getSelectedIndex());
                }
                else{
                    listaDePedidos.getElementAt(
                        lstDescricaoMesa.getSelectedIndex()).cancelarItem(numItensRemover);
                    lstDescricaoMesa.setModel(listaDePedidos);  //atualiza
                }
            }
        }
        else{
            listaDePedidos.remove(lstDescricaoMesa.getSelectedIndex());
        }

    }//GEN-LAST:event_HandlerBtnCancelaPedido

    private void txtHorarioEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorarioEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorarioEntradaActionPerformed

    private void HandlerFechaComanda(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HandlerFechaComanda
        Mesa mesa = (Mesa) lstMesas.getSelectedValue();

        mesa.fecharComanda();

        txtHorarioEntrada.setText("");

    }//GEN-LAST:event_HandlerFechaComanda

    private void HandlerBtnAbreMesa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HandlerBtnAbreMesa
        int index = lstMesas.getSelectedIndex();
        
        JOptionPane.showMessageDialog(null, " Mesa aberta "+(index+1));
        
        DefaultListModel<Mesa> listaDeMesas;
        listaDeMesas = (DefaultListModel<Mesa>)lstMesas.getModel();

        listaDeMesas.getElementAt(index).abrirMesa();
        txtHorarioEntrada.setText((String)listaDeMesas.getElementAt(index).getHorarioEntrada());
    }//GEN-LAST:event_HandlerBtnAbreMesa

    private void lstMesasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstMesasValueChanged
        int index = lstMesas.getSelectedIndex();

        DefaultListModel<Mesa> listaDeMesas;
        listaDeMesas = (DefaultListModel<Mesa>)lstMesas.getModel();

        txtHorarioEntrada.setText((String)listaDeMesas.getElementAt(index).getHorarioEntrada());
        lstDescricaoMesa.setModel(listaDeMesas.getElementAt(index).getDlmPedidos());
    }//GEN-LAST:event_lstMesasValueChanged

    private void HandlerAdicionaPedido(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HandlerAdicionaPedido
        int index = lstProdutos.getSelectedIndex();
        
        //String Tam = JOptionPane.showInputDialog("Tamanho: \r\n1 - Grande\r\n2 - Média\r\n3 - Pequena");
        
        //if(Tam.equals("1")){
        if((Integer)spnQtdeDeItens.getValue()>0){
            Pedido pedido = new Pedido((Produto) lstProdutos.getModel().getElementAt(index),
                (Integer)spnQtdeDeItens.getValue());

            //adiciona ao array list da mesa
            Mesa mesaAtual = new Mesa(1);   //Não acrescentar nova mesa
            mesaAtual = (Mesa) lstMesas.getSelectedValue();

            //Verifica se a Mesa Atual ainda não foi aberta
            if(!mesaAtual.isOcupacaoMesa()){
                mesaAtual.abrirMesa();
            }

            mesaAtual.acrescentarPedido(pedido);
            
            //Atualiza o DefaultListModel da Mesa Atual
            lstDescricaoMesa.setModel(mesaAtual.getDlmPedidos());
            txtHorarioEntrada.setText(mesaAtual.getHorarioEntrada());
        }
        else{
            JOptionPane.showMessageDialog(null,
                "Quantidade do pedido deve ser maior do que 1",
                "Erro no Pedido",
                JOptionPane.ERROR_MESSAGE);
        }
        //}else{
        //    JOptionPane.showMessageDialog(null, "No momento temos apenas pizza G");
        //}
    }//GEN-LAST:event_HandlerAdicionaPedido

    private void btnAddbHandlerAdicionaPedido(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddbHandlerAdicionaPedido
        TelaAddBebida tAddProduto = new TelaAddBebida();    
        tAddProduto.setVisible(true);  
    }//GEN-LAST:event_btnAddbHandlerAdicionaPedido

    private void btnAdicionaMesaBHandlerAdicionaPedido(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionaMesaBHandlerAdicionaPedido
         int index = lstbenidas.getSelectedIndex();

        if((Integer)spnQtdeDeItens1.getValue()>0){
            Pedido pedido = new Pedido((Produto) lstbenidas.getModel().getElementAt(index),
                (Integer)spnQtdeDeItens1.getValue());

            //adiciona ao array list da mesa
            Mesa mesaAtual = new Mesa(1);   //Não acrescentar nova mesa
            mesaAtual = (Mesa) lstMesas.getSelectedValue();

            //Verifica se a Mesa Atual ainda não foi aberta
            if(!mesaAtual.isOcupacaoMesa()){
                mesaAtual.abrirMesa();
            }

            mesaAtual.acrescentarPedido(pedido);
            
            JOptionPane.showMessageDialog(null,"Item adicionado: "+pedido );

            //Atualiza o DefaultListModel da Mesa Atual
            lstDescricaoMesa.setModel(mesaAtual.getDlmPedidos());
            txtHorarioEntrada.setText(mesaAtual.getHorarioEntrada());
        }
        else{
            JOptionPane.showMessageDialog(null,
                "Quantidade do pedido deve ser maior do que 1",
                "Erro no Pedido",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAdicionaMesaBHandlerAdicionaPedido

    private void btnAddb1HandlerAdicionaPedido(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddb1HandlerAdicionaPedido
        DefaultListModel<Produto> listaDeProdutos;
        listaDeProdutos = (DefaultListModel<Produto>) lstbenidas.getModel();
        listaDeProdutos.remove(lstbenidas.getSelectedIndex());
    }//GEN-LAST:event_btnAddb1HandlerAdicionaPedido

    private void btnAddb2HandlerAdicionaPedido(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddb2HandlerAdicionaPedido
       DefaultListModel<Mesa> listaMesas;
        listaMesas = (DefaultListModel<Mesa>) lstMesas.getModel();
        listaMesas.remove(listaMesas.getSize()-1);
    }//GEN-LAST:event_btnAddb2HandlerAdicionaPedido

    private void btnAddb3HandlerAdicionaPedido(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddb3HandlerAdicionaPedido
        TelaAddProduto tAddProduto = new TelaAddProduto();    
        tAddProduto.setVisible(true);
    }//GEN-LAST:event_btnAddb3HandlerAdicionaPedido

    private void btnAddb4HandlerAdicionaPedido(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddb4HandlerAdicionaPedido
        DefaultListModel<Produto> listaDeProdutos;
        listaDeProdutos = (DefaultListModel<Produto>) lstProdutos.getModel();
        listaDeProdutos.remove(lstProdutos.getSelectedIndex());
    }//GEN-LAST:event_btnAddb4HandlerAdicionaPedido

    private void btnAddb6HandlerAdicionaPedido(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddb6HandlerAdicionaPedido
        Mesa novaMesa = new Mesa();
        
        DefaultListModel<Mesa> mesas;
        mesas = (DefaultListModel<Mesa>)lstMesas.getModel();
        
        mesas.addElement(novaMesa);
    }//GEN-LAST:event_btnAddb6HandlerAdicionaPedido

    private void CadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadClienteActionPerformed
        cadastrarCliente novo = new cadastrarCliente();
        novo.setVisible(true);
        novo.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        novo.setResizable(false);
    }//GEN-LAST:event_CadClienteActionPerformed

    private void CadClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadClienteMouseClicked
        
    }//GEN-LAST:event_CadClienteMouseClicked

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        deletraCliente novo = new deletraCliente();
        novo.setVisible(true);
        novo.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        novo.setResizable(false);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
       consultarEntregas novov= new consultarEntregas();
        novov.setVisible(true);
        novov.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        novov.setResizable(false);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        historicoEntregas novov= new historicoEntregas();
        novov.setVisible(true);
        novov.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        novov.setResizable(false);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        historicoCliente novov= new historicoCliente();
        novov.setVisible(true);
        novov.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        novov.setResizable(false);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadCliente;
    private javax.swing.JToggleButton btnAbreMesa;
    private javax.swing.JToggleButton btnAbreMesa1;
    private javax.swing.JButton btnAddb;
    private javax.swing.JButton btnAddb1;
    private javax.swing.JButton btnAddb2;
    private javax.swing.JButton btnAddb3;
    private javax.swing.JButton btnAddb4;
    private javax.swing.JButton btnAddb6;
    private javax.swing.JButton btnAdicionaMesaB;
    private javax.swing.JButton btnAdicionaMesaP;
    private javax.swing.JToggleButton btnFechaComanda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblDescricaoMesa;
    private javax.swing.JLabel lblMesas;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JLabel lblQtde;
    private javax.swing.JLabel lblQtde1;
    private javax.swing.JList lstDescricaoMesa;
    private javax.swing.JList lstMesas;
    private javax.swing.JList lstProdutos;
    private javax.swing.JList lstbenidas;
    private javax.swing.JMenu menAjuda;
    private javax.swing.JMenu menOpcoes;
    private javax.swing.JMenuItem mitemInstrucoes;
    private javax.swing.JMenuItem mitemSobre;
    private javax.swing.JMenu registrarEntrega;
    private javax.swing.JSpinner spnQtdeDeItens;
    private javax.swing.JSpinner spnQtdeDeItens1;
    private javax.swing.JTextField txtHorarioEntrada;
    // End of variables declaration//GEN-END:variables
 private class TelaAddProduto extends JFrame{
        
        private JLabel lblNomeProduto;
        private JLabel lblValorProduto;
        private JTextField txtNomeProduto;
        private JTextField txtValorProduto;
        private JLabel lblcat;
        private JTextField txtNomecat;
        private JButton btnLimpar;
        private JButton btnAdicionar;

        public TelaAddProduto() {
            super("Adicionar Produto");
            //alinhamento à direita
            setLayout(new FlowLayout(FlowLayout.TRAILING,5,15));
            setVisible(false);
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            setSize(315, 150); 
            setResizable(false);
            setLocationRelativeTo(null);
            
            
            lblNomeProduto = new JLabel("Nome do Produto");
            lblValorProduto = new JLabel("Valor(R$)");
            txtNomeProduto = new JTextField(15);
            txtValorProduto = new JTextField(15);
            btnLimpar = new JButton("Limpar");
            btnAdicionar = new JButton("Adicionar");
            
            add(lblNomeProduto);
            add(txtNomeProduto);
            add(lblValorProduto);
            add(txtValorProduto);
            add(btnLimpar);
            add(btnAdicionar);
            
            BtnLimparHandler btnLimparHandler = new BtnLimparHandler();
            btnLimpar.addActionListener(btnLimparHandler);
            
            BtnAdicionarHandler btnAdicionarHandler = new BtnAdicionarHandler();
            btnAdicionar.addActionListener(btnAdicionarHandler);
        }
        
        private class BtnLimparHandler implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                txtNomeProduto.setText("");
                txtValorProduto.setText("");
            }
            
        }
        
         
        private class BtnAdicionarHandler implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                
                if("".equals(txtNomeProduto.getText())){
                    JOptionPane.showMessageDialog(null,
                            "O nome do produto não pode estar vázio",
                                "Erro",JOptionPane.ERROR_MESSAGE);               
                }
                else{                                       
                    
                    try {
                        //verifica se valor da caixa de texto é um número
                        double valor = Double.parseDouble(
                                txtValorProduto.getText());
                        //cria produto que será adicionado
                        Produto p = new Produto(
                            txtNomeProduto.getText(),
                            valor);                        
                        
                        //adiciona a JList de produtos
                        DefaultListModel<Produto> produtos;
                        produtos = (DefaultListModel<Produto>)lstProdutos.getModel();
                        produtos.addElement(p);

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null,"Valor inválido!",
                                "Erro",JOptionPane.ERROR_MESSAGE);
                    }                  
                    

                    txtNomeProduto.setText("");
                    txtValorProduto.setText("");
    
                  
                }
            }
            
        }
    }
 
 
 private class TelaAddBebida extends JFrame{
        
        private JLabel lblNomeProduto;
        private JLabel lblValorProduto;
        private JTextField txtNomeProduto;
        private JTextField txtValorProduto;
        private JLabel lblcat;
        private JTextField txtNomecat;
        private JButton btnLimpar;
        private JButton btnAdicionar;

        public TelaAddBebida() {
            super("Adicionar Bebida");
            //alinhamento à direita
            setLayout(new FlowLayout(FlowLayout.TRAILING,5,15));
            setVisible(false);
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            setSize(315, 150); 
            setResizable(false);
            setLocationRelativeTo(null);
            
            
            lblNomeProduto = new JLabel("Nome da Bebida");
            lblValorProduto = new JLabel("Valor(R$)");
            txtNomeProduto = new JTextField(15);
            txtValorProduto = new JTextField(15);
            btnLimpar = new JButton("Limpar");
            btnAdicionar = new JButton("Adicionar");
            
            add(lblNomeProduto);
            add(txtNomeProduto);
            add(lblValorProduto);
            add(txtValorProduto);
            add(btnLimpar);
            add(btnAdicionar);
            
            BtnLimparHandler btnLimparHandler = new BtnLimparHandler();
            btnLimpar.addActionListener(btnLimparHandler);
            
            BtnAdicionarHandler btnAdicionarHandler = new BtnAdicionarHandler();
            btnAdicionar.addActionListener(btnAdicionarHandler);
        }
        
        private class BtnLimparHandler implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                txtNomeProduto.setText("");
                txtValorProduto.setText("");
            }
            
        }
        
         
        private class BtnAdicionarHandler implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                
                if("".equals(txtNomeProduto.getText())){
                    JOptionPane.showMessageDialog(null,
                            "O nome do produto não pode estar vázio",
                                "Erro",JOptionPane.ERROR_MESSAGE);               
                }
                else{                                       
                    
                    try {
                        //verifica se valor da caixa de texto é um número
                        double valor = Double.parseDouble(
                                txtValorProduto.getText());
                        //cria produto que será adicionado
                        Produto p = new Produto(
                            txtNomeProduto.getText(),
                            valor);                        
                        
                        //adiciona a JList de produtos
                        DefaultListModel<Produto> produtos;
                        produtos = (DefaultListModel<Produto>)lstbenidas.getModel();
                        produtos.addElement(p);

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null,"Valor inválido!",
                                "Erro",JOptionPane.ERROR_MESSAGE);
                    }                  
                    

                    txtNomeProduto.setText("");
                    txtValorProduto.setText("");
    
                  
                }
            }
            
        }
    }
        
        
   
}

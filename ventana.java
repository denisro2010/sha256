/*     */ package sha256;
/*     */ 
/*     */ import java.awt.BorderLayout;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import java.awt.Toolkit;
/*     */ import java.awt.datatransfer.Clipboard;
/*     */ import java.awt.datatransfer.StringSelection;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JSeparator;
/*     */ import javax.swing.JTextArea;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.border.EmptyBorder;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ventana
/*     */   extends JFrame
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   private JPanel contentPane;
/*     */   private JPanel panel;
/*     */   private JButton btnAceptar;
/*     */   private JButton btnCancelar;
/*     */   private JPanel panel_1;
/*     */   private JLabel lblPorFavorIntroduce;
/*     */   private JPanel panel_2;
/*     */   private JSeparator separator;
/*     */   private JPanel panel_3;
/*     */   private JLabel lblNewLabel;
/*     */   private JSeparator separator_1;
/*     */   private JSeparator separator_2;
/*     */   private static String entrada;
/*     */   private JTextField textField;
/*     */   private JButton btnCerrar;
/*     */   private JTextArea lblNewLabel_1;
/*     */   private JLabel lblSalida;
/*     */   private JButton btnCopiarSalida;
/*     */   private JSeparator separator_3;
/*     */   private JSeparator separator_4;
/*     */   private JSeparator separator_5;
/*     */   private JSeparator separator_6;
/*     */   private JSeparator separator_7;
/*     */   private JSeparator separator_8;
/*     */   private JSeparator separator_9;
/*     */   private JTextField textField_1;
/*     */   private JLabel lblNewLabel_2;
/*     */   private String sal;
/*     */   
/*     */   public static String getEntrada()
/*     */   {
/*  65 */     return entrada;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/*  72 */     EventQueue.invokeLater(new Runnable() {
/*     */       public void run() {
/*     */         try {
/*  75 */           ventana frame = new ventana();
/*  76 */           frame.setVisible(true);
/*     */         } catch (Exception e) {
/*  78 */           e.printStackTrace();
/*     */         }
/*     */       }
/*     */     });
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public ventana()
/*     */   {
/*  88 */     setResizable(false);
/*  89 */     setTitle("Sha512 - Denis Ionut Stefanescu");
/*  90 */     initialize();
/*  91 */     centrar();
/*     */   }
/*     */   
/*     */   private void initialize() {
/*  95 */     setDefaultCloseOperation(3);
/*  96 */     setBounds(100, 100, 1200, 300);
/*  97 */     this.contentPane = new JPanel();
/*  98 */     this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
/*  99 */     setContentPane(this.contentPane);
/* 100 */     this.contentPane.setLayout(new BorderLayout(0, 0));
/* 101 */     this.contentPane.add(getPanel(), "South");
/* 102 */     this.contentPane.add(getPanel_1_1(), "North");
/* 103 */     this.contentPane.add(getPanel_2(), "Center");
/*     */   }
/*     */   
/*     */   private JPanel getPanel() {
/* 107 */     if (this.panel == null) {
/* 108 */       this.panel = new JPanel();
/* 109 */       this.panel.add(getBtnAceptar());
/* 110 */       this.panel.add(getBtnCerrar());
/*     */     }
/* 112 */     return this.panel;
/*     */   }
/*     */   
/*     */   private JButton getBtnAceptar() {
/* 116 */     if (this.btnAceptar == null) {
/* 117 */       this.btnAceptar = new JButton("Cifrar");
/* 118 */       this.btnAceptar.addActionListener(new ActionListener() {
/*     */         public void actionPerformed(ActionEvent e) {
/* 120 */           ventana.entrada = ventana.this.textField.getText();
/* 121 */           ventana.this.sal = ventana.this.textField_1.getText();
/* 122 */           String salida = "";
/*     */           try {
/* 124 */             salida = sha256.get_SHA_512_SecurePassword(ventana.entrada, ventana.this.sal);
/*     */           }
/*     */           catch (Exception e1) {
/* 127 */             e1.printStackTrace();
/*     */           }
/* 129 */           ventana.this.lblNewLabel_1.setText(salida);
/*     */         }
/*     */       });
/*     */     }
/*     */     
/* 134 */     return this.btnAceptar;
/*     */   }
/*     */   
/*     */   private JPanel getPanel_1_1()
/*     */   {
/* 139 */     if (this.panel_1 == null) {
/* 140 */       this.panel_1 = new JPanel();
/* 141 */       this.panel_1.add(getLblPorFavorIntroduce());
/*     */     }
/* 143 */     return this.panel_1;
/*     */   }
/*     */   
/*     */   private JLabel getLblPorFavorIntroduce() {
/* 147 */     if (this.lblPorFavorIntroduce == null) {
/* 148 */       this.lblPorFavorIntroduce = new JLabel("Por favor, introduce el texto que deseas cifrar/descifrar");
/*     */     }
/* 150 */     return this.lblPorFavorIntroduce;
/*     */   }
/*     */   
/*     */   private JPanel getPanel_2() {
/* 154 */     if (this.panel_2 == null) {
/* 155 */       this.panel_2 = new JPanel();
/* 156 */       this.panel_2.setLayout(new BorderLayout(0, 0));
/* 157 */       this.panel_2.add(getSeparator(), "North");
/* 158 */       this.panel_2.add(getPanel_3(), "Center");
/*     */     }
/* 160 */     return this.panel_2;
/*     */   }
/*     */   
/*     */   private JSeparator getSeparator() {
/* 164 */     if (this.separator == null) {
/* 165 */       this.separator = new JSeparator();
/*     */     }
/* 167 */     return this.separator;
/*     */   }
/*     */   
/*     */   private JPanel getPanel_3() {
/* 171 */     if (this.panel_3 == null) {
/* 172 */       this.panel_3 = new JPanel();
/* 173 */       GridBagLayout gbl_panel_3 = new GridBagLayout();
/* 174 */       gbl_panel_3.columnWidths = new int[] { 126, 48, 116 };
/* 175 */       gbl_panel_3.rowHeights = new int[] { 22 };
/* 176 */       gbl_panel_3.columnWeights = new double[] { 0.0D, 1.0D, 0.0D, Double.MIN_VALUE };
/* 177 */       gbl_panel_3.rowWeights = new double[] { 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, Double.MIN_VALUE };
/* 178 */       this.panel_3.setLayout(gbl_panel_3);
/* 179 */       GridBagConstraints gbc_separator_2 = new GridBagConstraints();
/* 180 */       gbc_separator_2.insets = new Insets(0, 0, 5, 5);
/* 181 */       gbc_separator_2.gridx = 1;
/* 182 */       gbc_separator_2.gridy = 0;
/* 183 */       this.panel_3.add(getSeparator_2(), gbc_separator_2);
/* 184 */       GridBagConstraints gbc_separator_1 = new GridBagConstraints();
/* 185 */       gbc_separator_1.insets = new Insets(0, 0, 5, 5);
/* 186 */       gbc_separator_1.gridx = 1;
/* 187 */       gbc_separator_1.gridy = 1;
/* 188 */       this.panel_3.add(getSeparator_1(), gbc_separator_1);
/* 189 */       GridBagConstraints gbc_passwordField = new GridBagConstraints();
/* 190 */       gbc_passwordField.insets = new Insets(0, 0, 5, 0);
/* 191 */       gbc_passwordField.fill = 2;
/* 192 */       gbc_passwordField.gridx = 2;
/* 193 */       gbc_passwordField.gridy = 3;
/* 194 */       GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
/* 195 */       gbc_lblNewLabel.anchor = 13;
/* 196 */       gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
/* 197 */       gbc_lblNewLabel.gridx = 0;
/* 198 */       gbc_lblNewLabel.gridy = 2;
/* 199 */       this.panel_3.add(getLblNewLabel(), gbc_lblNewLabel);
/* 200 */       GridBagConstraints gbc_textField = new GridBagConstraints();
/* 201 */       gbc_textField.fill = 2;
/* 202 */       gbc_textField.insets = new Insets(0, 0, 5, 5);
/* 203 */       gbc_textField.gridx = 1;
/* 204 */       gbc_textField.gridy = 2;
/* 205 */       this.panel_3.add(getTextField_2(), gbc_textField);
/* 206 */       GridBagConstraints gbc_separator_6 = new GridBagConstraints();
/* 207 */       gbc_separator_6.insets = new Insets(0, 0, 5, 0);
/* 208 */       gbc_separator_6.gridx = 2;
/* 209 */       gbc_separator_6.gridy = 3;
/* 210 */       this.panel_3.add(getSeparator_6(), gbc_separator_6);
/* 211 */       GridBagConstraints gbc_separator_5 = new GridBagConstraints();
/* 212 */       gbc_separator_5.insets = new Insets(0, 0, 5, 0);
/* 213 */       gbc_separator_5.gridx = 2;
/* 214 */       gbc_separator_5.gridy = 4;
/* 215 */       this.panel_3.add(getSeparator_5(), gbc_separator_5);
/* 216 */       GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
/* 217 */       gbc_lblNewLabel_2.anchor = 13;
/* 218 */       gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
/* 219 */       gbc_lblNewLabel_2.gridx = 0;
/* 220 */       gbc_lblNewLabel_2.gridy = 5;
/* 221 */       this.panel_3.add(getLblNewLabel_2(), gbc_lblNewLabel_2);
/* 222 */       GridBagConstraints gbc_textField_1 = new GridBagConstraints();
/* 223 */       gbc_textField_1.fill = 2;
/* 224 */       gbc_textField_1.insets = new Insets(0, 0, 5, 5);
/* 225 */       gbc_textField_1.gridx = 1;
/* 226 */       gbc_textField_1.gridy = 5;
/* 227 */       this.panel_3.add(getTextField_1(), gbc_textField_1);
/* 228 */       GridBagConstraints gbc_separator_4 = new GridBagConstraints();
/* 229 */       gbc_separator_4.insets = new Insets(0, 0, 5, 0);
/* 230 */       gbc_separator_4.gridx = 2;
/* 231 */       gbc_separator_4.gridy = 6;
/* 232 */       this.panel_3.add(getSeparator_4(), gbc_separator_4);
/* 233 */       GridBagConstraints gbc_lblSalida = new GridBagConstraints();
/* 234 */       gbc_lblSalida.insets = new Insets(0, 0, 5, 5);
/* 235 */       gbc_lblSalida.gridx = 0;
/* 236 */       gbc_lblSalida.gridy = 7;
/* 237 */       this.panel_3.add(getLblSalida(), gbc_lblSalida);
/* 238 */       GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
/* 239 */       gbc_lblNewLabel_1.anchor = 17;
/* 240 */       gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
/* 241 */       gbc_lblNewLabel_1.gridx = 1;
/* 242 */       gbc_lblNewLabel_1.gridy = 7;
/* 243 */       this.panel_3.add(getLblNewLabel_1(), gbc_lblNewLabel_1);
/* 244 */       GridBagConstraints gbc_separator_9 = new GridBagConstraints();
/* 245 */       gbc_separator_9.insets = new Insets(0, 0, 5, 0);
/* 246 */       gbc_separator_9.gridx = 2;
/* 247 */       gbc_separator_9.gridy = 8;
/* 248 */       this.panel_3.add(getSeparator_9(), gbc_separator_9);
/* 249 */       GridBagConstraints gbc_separator_3 = new GridBagConstraints();
/* 250 */       gbc_separator_3.insets = new Insets(0, 0, 5, 0);
/* 251 */       gbc_separator_3.gridx = 2;
/* 252 */       gbc_separator_3.gridy = 9;
/* 253 */       this.panel_3.add(getSeparator_3(), gbc_separator_3);
/* 254 */       GridBagConstraints gbc_separator_7 = new GridBagConstraints();
/* 255 */       gbc_separator_7.insets = new Insets(0, 0, 5, 0);
/* 256 */       gbc_separator_7.gridx = 2;
/* 257 */       gbc_separator_7.gridy = 10;
/* 258 */       this.panel_3.add(getSeparator_7(), gbc_separator_7);
/* 259 */       GridBagConstraints gbc_separator_8 = new GridBagConstraints();
/* 260 */       gbc_separator_8.insets = new Insets(0, 0, 5, 0);
/* 261 */       gbc_separator_8.gridx = 2;
/* 262 */       gbc_separator_8.gridy = 11;
/* 263 */       this.panel_3.add(getSeparator_8(), gbc_separator_8);
/* 264 */       GridBagConstraints gbc_btnCopiarSalida = new GridBagConstraints();
/* 265 */       gbc_btnCopiarSalida.insets = new Insets(0, 0, 0, 5);
/* 266 */       gbc_btnCopiarSalida.gridx = 1;
/* 267 */       gbc_btnCopiarSalida.gridy = 12;
/* 268 */       this.panel_3.add(getBtnCopiarSalida(), gbc_btnCopiarSalida);
/*     */     }
/* 270 */     return this.panel_3;
/*     */   }
/*     */   
/*     */   private JLabel getLblNewLabel() {
/* 274 */     if (this.lblNewLabel == null) {
/* 275 */       this.lblNewLabel = new JLabel("Texto:");
/*     */     }
/* 277 */     return this.lblNewLabel;
/*     */   }
/*     */   
/*     */   private JSeparator getSeparator_1() {
/* 281 */     if (this.separator_1 == null) {
/* 282 */       this.separator_1 = new JSeparator();
/*     */     }
/* 284 */     return this.separator_1;
/*     */   }
/*     */   
/*     */   private JSeparator getSeparator_2() {
/* 288 */     if (this.separator_2 == null) {
/* 289 */       this.separator_2 = new JSeparator();
/*     */     }
/* 291 */     return this.separator_2;
/*     */   }
/*     */   
/*     */   public void centrar()
/*     */   {
/* 296 */     Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
/* 297 */     Dimension windowSize = getSize();
/* 298 */     if (windowSize.height > screenSize.height) {
/* 299 */       windowSize.height = screenSize.height;
/*     */     }
/*     */     
/* 302 */     if (windowSize.width > screenSize.width) {
/* 303 */       windowSize.width = screenSize.width;
/*     */     }
/* 305 */     setLocation((screenSize.width - windowSize.width) / 2, (screenSize.height - windowSize.height) / 2);
/*     */   }
/*     */   
/*     */   private JTextField getTextField_2() {
/* 309 */     if (this.textField == null) {
/* 310 */       this.textField = new JTextField();
/* 311 */       this.textField.setColumns(5);
/* 312 */       this.textField.addActionListener(new ActionListener() {
/*     */         public void actionPerformed(ActionEvent e) {
/* 314 */           ventana.entrada = ventana.this.textField.getText();
/*     */         }
/*     */       });
/*     */     }
/* 318 */     return this.textField;
/*     */   }
/*     */   
/* 321 */   private JButton getBtnCerrar() { if (this.btnCerrar == null) {
/* 322 */       this.btnCerrar = new JButton("Cerrar");
/* 323 */       this.btnCerrar.addActionListener(new ActionListener() {
/*     */         public void actionPerformed(ActionEvent e) {
/* 325 */           ventana.this.dispose();
/*     */         }
/*     */       });
/*     */     }
/*     */     
/* 330 */     return this.btnCerrar;
/*     */   }
/*     */   
/* 333 */   private JTextArea getLblNewLabel_1() { if (this.lblNewLabel_1 == null) {
/* 334 */       this.lblNewLabel_1 = new JTextArea(" ");
/*     */     }
/* 336 */     return this.lblNewLabel_1;
/*     */   }
/*     */   
/* 339 */   private JLabel getLblSalida() { if (this.lblSalida == null) {
/* 340 */       this.lblSalida = new JLabel(" Salida: ");
/*     */     }
/* 342 */     return this.lblSalida;
/*     */   }
/*     */   
/* 345 */   private JButton getBtnCopiarSalida() { if (this.btnCopiarSalida == null) {
/* 346 */       this.btnCopiarSalida = new JButton("Copiar salida");
/* 347 */       this.btnCopiarSalida.addActionListener(new ActionListener()
/*     */       {
/*     */         public void actionPerformed(ActionEvent e) {
/* 350 */           String salida = ventana.this.lblNewLabel_1.getText();
/* 351 */           Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
/* 352 */           StringSelection data = new StringSelection(salida);
/* 353 */           clipboard.setContents(data, data);
/*     */         }
/*     */       });
/*     */     }
/* 357 */     return this.btnCopiarSalida;
/*     */   }
/*     */   
/* 360 */   private JSeparator getSeparator_3() { if (this.separator_3 == null) {
/* 361 */       this.separator_3 = new JSeparator();
/*     */     }
/* 363 */     return this.separator_3;
/*     */   }
/*     */   
/* 366 */   private JSeparator getSeparator_4() { if (this.separator_4 == null) {
/* 367 */       this.separator_4 = new JSeparator();
/*     */     }
/* 369 */     return this.separator_4;
/*     */   }
/*     */   
/* 372 */   private JSeparator getSeparator_5() { if (this.separator_5 == null) {
/* 373 */       this.separator_5 = new JSeparator();
/*     */     }
/* 375 */     return this.separator_5;
/*     */   }
/*     */   
/* 378 */   private JSeparator getSeparator_6() { if (this.separator_6 == null) {
/* 379 */       this.separator_6 = new JSeparator();
/*     */     }
/* 381 */     return this.separator_6;
/*     */   }
/*     */   
/* 384 */   private JSeparator getSeparator_7() { if (this.separator_7 == null) {
/* 385 */       this.separator_7 = new JSeparator();
/*     */     }
/* 387 */     return this.separator_7;
/*     */   }
/*     */   
/* 390 */   private JSeparator getSeparator_8() { if (this.separator_8 == null) {
/* 391 */       this.separator_8 = new JSeparator();
/*     */     }
/* 393 */     return this.separator_8;
/*     */   }
/*     */   
/* 396 */   private JSeparator getSeparator_9() { if (this.separator_9 == null) {
/* 397 */       this.separator_9 = new JSeparator();
/*     */     }
/* 399 */     return this.separator_9;
/*     */   }
/*     */   
/* 402 */   private JTextField getTextField_1() { if (this.textField_1 == null) {
/* 403 */       this.textField_1 = new JTextField();
/* 404 */       this.textField_1.setColumns(10);
/*     */     }
/* 406 */     return this.textField_1;
/*     */   }
/*     */   
/* 409 */   private JLabel getLblNewLabel_2() { if (this.lblNewLabel_2 == null) {
/* 410 */       this.lblNewLabel_2 = new JLabel("Añadir sal:");
/*     */     }
/* 412 */     return this.lblNewLabel_2;
/*     */   }
/*     */ }


/* Location:              C:\Users\denis\Desktop\Sha256.jar!\sha256\ventana.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */
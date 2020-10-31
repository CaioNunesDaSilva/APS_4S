package view;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

import controller.Classificador;
import controller.LeitorDeArquivo;
import model.Imagem;
import model.enums.TipoClassificacao;
import model.exceptions.NullAttributeException;

public class Main extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;

	public Main() {
		initComponents();
		setLocationRelativeTo(null);
	}

	private void initComponents() {

		jPanel4 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		lblBubble = new javax.swing.JLabel();
		lblSelecion = new javax.swing.JLabel();
		lblQuick = new javax.swing.JLabel();
		lblInsertion = new javax.swing.JLabel();
		txtBubble = new javax.swing.JTextField();
		txtSelection = new javax.swing.JTextField();
		txtInsertion = new javax.swing.JTextField();
		txtQuick = new javax.swing.JTextField();
		btnSair = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		lblCaminho = new javax.swing.JLabel();
		txtCaminho = new javax.swing.JTextField();
		btnCarregar = new javax.swing.JButton();
		jTextField1 = new javax.swing.JTextField();
		jPanel1 = new javax.swing.JPanel();
		rbData = new javax.swing.JRadioButton();
		rbSatelite = new javax.swing.JRadioButton();
		rbEstado = new javax.swing.JRadioButton();
		rbMunicipio = new javax.swing.JRadioButton();
		rbLatitude = new javax.swing.JRadioButton();
		rbLongitude = new javax.swing.JRadioButton();
		rbChuva = new javax.swing.JRadioButton();
		rbPreciptacao = new javax.swing.JRadioButton();
		rbFogo = new javax.swing.JRadioButton();
		btnClassificar = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		jPanel4.setBackground(new java.awt.Color(255, 255, 255));
		jPanel4.setForeground(new java.awt.Color(255, 255, 255));

		jPanel2.setBackground(new java.awt.Color(204, 255, 204));
		jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));

		lblBubble.setText("Bubble");

		lblSelecion.setText("Selection");

		lblQuick.setText("Quick");

		lblInsertion.setText("Insertion");

		txtBubble.setEditable(false);

		txtSelection.setEditable(false);

		txtInsertion.setEditable(false);

		txtQuick.setEditable(false);

		btnSair.setText("Fechar");
		btnSair.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSairActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
										jPanel2Layout.createSequentialGroup().addComponent(lblInsertion)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(txtInsertion, javax.swing.GroupLayout.PREFERRED_SIZE, 106,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
										jPanel2Layout.createSequentialGroup().addComponent(lblBubble).addGap(43, 43, 43)
												.addComponent(txtBubble, javax.swing.GroupLayout.PREFERRED_SIZE, 106,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(26, 26, 26)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(lblSelecion).addComponent(lblQuick))
						.addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(txtQuick, javax.swing.GroupLayout.PREFERRED_SIZE, 106,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 106,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel2Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnSair).addGap(23, 23, 23)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(3, 3, 3)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblBubble)
								.addComponent(txtBubble, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtSelection, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSelecion))
						.addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtInsertion, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lblInsertion)
								.addComponent(txtQuick, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lblQuick))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnSair).addContainerGap()));

		jPanel3.setBackground(new java.awt.Color(204, 255, 204));
		jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Arquivo",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 0, 14))); // NOI18N

		lblCaminho.setText("Caminho do arquivo");

		btnCarregar.setText("Carregar");
		btnCarregar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnCarregarActionPerformed(evt);
			}
		});

		jTextField1.setEditable(false);

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(lblCaminho)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										jPanel3Layout.createSequentialGroup()
												.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 173,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(btnCarregar))
								.addComponent(txtCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, 348,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(60, Short.MAX_VALUE)));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblCaminho)
								.addComponent(txtCaminho, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 13, Short.MAX_VALUE)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btnCarregar).addComponent(jTextField1,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)));

		jPanel1.setBackground(new java.awt.Color(204, 255, 204));
		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));

		rbData.setText("Data");

		rbSatelite.setText("Satélite");

		rbEstado.setText("Estado");

		rbMunicipio.setText("Município");

		rbLatitude.setText("Latitude");

		rbLongitude.setText("Longitude");

		rbChuva.setText("Dias sem chuva");

		rbPreciptacao.setText("Preciptação");

		rbFogo.setText("Risco de fogo");

		ButtonGroup campos = new ButtonGroup();
		campos.add(rbChuva);
		campos.add(rbData);
		campos.add(rbEstado);
		campos.add(rbFogo);
		campos.add(rbLatitude);
		campos.add(rbLongitude);
		campos.add(rbPreciptacao);

		btnClassificar.setText("Classificar");
		btnClassificar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnClassificarActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(28, 28, 28)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(rbEstado).addComponent(rbSatelite).addComponent(rbData))
						.addGap(46, 46, 46)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(rbLongitude).addComponent(rbLatitude).addComponent(rbMunicipio))
						.addGap(65, 65, 65)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(rbPreciptacao)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnClassificar).addGap(24, 24, 24))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(rbFogo).addComponent(rbChuva))
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(26, 26, 26).addComponent(rbLatitude)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(rbLongitude))
						.addComponent(rbMunicipio)
						.addGroup(jPanel1Layout.createSequentialGroup().addComponent(rbChuva)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(rbPreciptacao).addComponent(btnClassificar))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(rbFogo))
						.addGroup(jPanel1Layout.createSequentialGroup().addComponent(rbData)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(rbSatelite)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(rbEstado)))
						.addContainerGap(24, Short.MAX_VALUE)));

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE));
		jPanel4Layout
				.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
								.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}

	private void btnCarregarActionPerformed(java.awt.event.ActionEvent evt) {
		if (LeitorDeArquivo.setEndereco(txtCaminho.getText())) {
			jTextField1.setText("Arquivo Encontrado");
		} else {
			jTextField1.setText("Arquivo n�o Encontrado");
		}
	}

	private void btnClassificarActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			ArrayList<Imagem> imagems = LeitorDeArquivo.readImagems();

			if (rbData.isSelected()) {
				txtBubble.setText("" + Classificador.sortData(imagems, TipoClassificacao.BUBBLE_SORT));
				txtSelection.setText("" + Classificador.sortData(imagems, TipoClassificacao.SELECTION_SORT));
				txtInsertion.setText("" + Classificador.sortData(imagems, TipoClassificacao.INSERTION_SORT));
				txtQuick.setText("" + Classificador.sortData(imagems, TipoClassificacao.QUICK_SORT));
			} else if (rbSatelite.isSelected()) {
				txtBubble.setText("" + Classificador.sortSatelite(imagems, TipoClassificacao.BUBBLE_SORT));
				txtSelection.setText("" + Classificador.sortSatelite(imagems, TipoClassificacao.SELECTION_SORT));
				txtInsertion.setText("" + Classificador.sortSatelite(imagems, TipoClassificacao.INSERTION_SORT));
				txtQuick.setText("" + Classificador.sortSatelite(imagems, TipoClassificacao.QUICK_SORT));
			} else if (rbEstado.isSelected()) {
				txtBubble.setText("" + Classificador.sortEstado(imagems, TipoClassificacao.BUBBLE_SORT));
				txtSelection.setText("" + Classificador.sortEstado(imagems, TipoClassificacao.SELECTION_SORT));
				txtInsertion.setText("" + Classificador.sortEstado(imagems, TipoClassificacao.INSERTION_SORT));
				txtQuick.setText("" + Classificador.sortEstado(imagems, TipoClassificacao.QUICK_SORT));
			} else if (rbMunicipio.isSelected()) {
				txtBubble.setText("" + Classificador.sortMunicipio(imagems, TipoClassificacao.BUBBLE_SORT));
				txtSelection.setText("" + Classificador.sortMunicipio(imagems, TipoClassificacao.SELECTION_SORT));
				txtInsertion.setText("" + Classificador.sortMunicipio(imagems, TipoClassificacao.INSERTION_SORT));
				txtQuick.setText("" + Classificador.sortMunicipio(imagems, TipoClassificacao.QUICK_SORT));
			} else if (rbLatitude.isSelected()) {
				txtBubble.setText("" + Classificador.sortLatitude(imagems, TipoClassificacao.BUBBLE_SORT));
				txtSelection.setText("" + Classificador.sortLatitude(imagems, TipoClassificacao.SELECTION_SORT));
				txtInsertion.setText("" + Classificador.sortLatitude(imagems, TipoClassificacao.INSERTION_SORT));
				txtQuick.setText("" + Classificador.sortLatitude(imagems, TipoClassificacao.QUICK_SORT));
			} else if (rbLongitude.isSelected()) {
				txtBubble.setText("" + Classificador.sortLongitude(imagems, TipoClassificacao.BUBBLE_SORT));
				txtSelection.setText("" + Classificador.sortLongitude(imagems, TipoClassificacao.SELECTION_SORT));
				txtInsertion.setText("" + Classificador.sortLongitude(imagems, TipoClassificacao.INSERTION_SORT));
				txtQuick.setText("" + Classificador.sortLongitude(imagems, TipoClassificacao.QUICK_SORT));
			} else if (rbChuva.isSelected()) {
				txtBubble.setText("" + Classificador.sortDiasSemChuva(imagems, TipoClassificacao.BUBBLE_SORT));
				txtSelection.setText("" + Classificador.sortDiasSemChuva(imagems, TipoClassificacao.SELECTION_SORT));
				txtInsertion.setText("" + Classificador.sortDiasSemChuva(imagems, TipoClassificacao.INSERTION_SORT));
				txtQuick.setText("" + Classificador.sortDiasSemChuva(imagems, TipoClassificacao.QUICK_SORT));
			} else if (rbPreciptacao.isSelected()) {
				txtBubble.setText("" + Classificador.sortPrecipitacao(imagems, TipoClassificacao.BUBBLE_SORT));
				txtSelection.setText("" + Classificador.sortPrecipitacao(imagems, TipoClassificacao.SELECTION_SORT));
				txtInsertion.setText("" + Classificador.sortPrecipitacao(imagems, TipoClassificacao.INSERTION_SORT));
				txtQuick.setText("" + Classificador.sortPrecipitacao(imagems, TipoClassificacao.QUICK_SORT));
			} else if (rbFogo.isSelected()) {
				txtBubble.setText("" + Classificador.sortRiscoFogo(imagems, TipoClassificacao.BUBBLE_SORT));
				txtSelection.setText("" + Classificador.sortRiscoFogo(imagems, TipoClassificacao.SELECTION_SORT));
				txtInsertion.setText("" + Classificador.sortRiscoFogo(imagems, TipoClassificacao.INSERTION_SORT));
				txtQuick.setText("" + Classificador.sortRiscoFogo(imagems, TipoClassificacao.QUICK_SORT));
			} else {
				JOptionPane.showMessageDialog(this, "Selecione um campo");
			}

		} catch (FileNotFoundException e) {
			// TODO tratamento de erro
			e.printStackTrace();
		} catch (NullPointerException e) {
			// TODO tratamento de erro
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO tratamento de erro
			e.printStackTrace();
		} catch (NullAttributeException e) {
			// TODO tratamento de erro
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO tratamento de erro
			e.printStackTrace();
		} catch (StackOverflowError e) {
			// TODO tratamento de erro
			e.printStackTrace();
		}
	}

	private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
		System.exit(0);
	}

	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Windows".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace(); // TODO tratamento de erro
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Main().setVisible(true);
			}
		});
	}

	private javax.swing.JButton btnCarregar;
	private javax.swing.JButton btnClassificar;
	private javax.swing.JButton btnSair;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JLabel lblBubble;
	private javax.swing.JLabel lblCaminho;
	private javax.swing.JLabel lblInsertion;
	private javax.swing.JLabel lblQuick;
	private javax.swing.JLabel lblSelecion;
	private javax.swing.JRadioButton rbChuva;
	private javax.swing.JRadioButton rbData;
	private javax.swing.JRadioButton rbEstado;
	private javax.swing.JRadioButton rbFogo;
	private javax.swing.JRadioButton rbLatitude;
	private javax.swing.JRadioButton rbLongitude;
	private javax.swing.JRadioButton rbPreciptacao;
	private javax.swing.JRadioButton rbMunicipio;
	private javax.swing.JRadioButton rbSatelite;
	private javax.swing.JTextField txtBubble;
	private javax.swing.JTextField txtCaminho;
	private javax.swing.JTextField txtInsertion;
	private javax.swing.JTextField txtQuick;
	private javax.swing.JTextField txtSelection;
}

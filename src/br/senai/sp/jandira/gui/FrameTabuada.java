package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import br.senai.sp.jandira.model.Tabuada;

public class FrameTabuada {

	public String titulo;
	public int altura;
	public int largura;
	
	public Font fontLabels = new Font("Gill Sans MT", Font.BOLD, 13);
	public Color corDoPainel = new Color(255, 255, 255);
	public Color corDoBotao1 = new Color(0, 164, 82);
	public Color corDoJList = new Color(255, 255, 187);
	
			
	
	public void criarTela() {
		
	JFrame tela = new JFrame();	
	tela.setTitle(titulo);
	tela.setSize(largura, altura);
	tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	tela.setLayout(null);
	
	Container painel = tela.getContentPane();
	painel.setBackground(corDoPainel);
	
	ImageIcon icone = new ImageIcon("src/br/senai/sp/jandira/img/matematica.png");
	JLabel labelIcone = new JLabel(icone);
	labelIcone.setBounds(-60, -20, 200, 200);
		
	JLabel labelTabuada = new JLabel();
	labelTabuada.setText("Tabuada 1.0");
	labelTabuada.setBounds(70, 20, 410, 80);
	labelTabuada.setFont(new Font("Trebuchet MS", Font.BOLD, 45));
	labelTabuada.setForeground(Color.red);
		
	JLabel labelDescription = new JLabel();
	labelDescription.setText("Com a tabuada 1.0 os seus problemas acabaram. Calcule");
	labelDescription.setBounds(80, 50, 410, 80);
	labelDescription.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
	labelDescription.setForeground(Color.gray);
	
	JLabel labelDescription2 = new JLabel();
	labelDescription2.setText("a tabuada que desejar em segundos!");
	labelDescription2.setBounds(80, 65, 410, 80);
	labelDescription2.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
	labelDescription2.setForeground(Color.gray);
	
	JLabel labelMult = new JLabel();
	labelMult.setText("Multiplicando: ");
	labelMult.setBounds(100, 150, 150, 20);
	labelMult.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
	
	JTextField textFieldMult = new JTextField();
	textFieldMult.setBounds(230, 150, 120, 25);
	textFieldMult.setBorder(new LineBorder(Color.black));
	textFieldMult.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
	textFieldMult.setHorizontalAlignment(textFieldMult.RIGHT);
	
	JLabel labelMinimoMult = new JLabel();
	labelMinimoMult.setText("Mínimo Multiplicador: ");
	labelMinimoMult.setBounds(40, 190, 210, 20);
	labelMinimoMult.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
	
	JTextField textFieldMinimoMult = new JTextField();
	textFieldMinimoMult.setBounds(230, 190, 120, 25);
	textFieldMinimoMult.setBorder(new LineBorder(Color.black));
	textFieldMinimoMult.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
	textFieldMinimoMult.setHorizontalAlignment(textFieldMinimoMult.RIGHT);
	
	JLabel labelMaximoMult = new JLabel();
	labelMaximoMult.setText("Máximo Multiplicador: ");
	labelMaximoMult.setBounds(40, 230, 210, 20);
	labelMaximoMult.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
	
	JTextField textFieldMaximoMult = new JTextField();
	textFieldMaximoMult.setBounds(230, 230, 120, 25);
	textFieldMaximoMult.setBorder(new LineBorder(Color.black));
	textFieldMaximoMult.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
	textFieldMaximoMult.setHorizontalAlignment(textFieldMaximoMult.RIGHT);
	
	JButton botaoCalcular = new JButton();
	botaoCalcular.setText("Calcular");
	botaoCalcular.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
	botaoCalcular.setBounds(40, 285, 200, 35);
	botaoCalcular.setBackground(corDoBotao1);
	botaoCalcular.setForeground(Color.white);
	botaoCalcular.setBorder(new LineBorder(Color.black));
	
	JButton botaoLimpar = new JButton();
	botaoLimpar.setText("Limpar");
	botaoLimpar.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
	botaoLimpar.setBounds(245, 285, 120, 35);
	botaoLimpar.setBackground(Color.red);
	botaoLimpar.setForeground(Color.white);
	botaoLimpar.setBorder(new LineBorder(Color.black));
	
	JLabel labelResultado = new JLabel();
	labelResultado.setText("Resultado: ");
	labelResultado.setBounds(40, 330, 210, 20);
	labelResultado.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
	
	JScrollPane scroll = new JScrollPane();
	scroll.setBounds(40, 350, 325, 200);
	JList<String> listLista1 = new JList<>();
	listLista1.setBackground(corDoJList);
	listLista1.setBorder(new LineBorder(Color.black));
	listLista1.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
	
	painel.add(labelIcone);
	painel.add(labelTabuada);
	painel.add(labelDescription);
	painel.add(labelDescription2);	
	painel.add(labelMult);
	painel.add(textFieldMult);
	painel.add(labelMinimoMult);
	painel.add(textFieldMinimoMult);
	painel.add(labelMaximoMult);
	painel.add(textFieldMaximoMult);
	painel.add(botaoCalcular);
	painel.add(botaoLimpar);
	painel.add(listLista1);
	painel.add(labelResultado);
	painel.add(scroll);

	
	tela.setVisible(true);
	
	botaoCalcular.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			try {
			
				Tabuada tabuada = new Tabuada();
				tabuada.multiplicando = Integer.parseInt(textFieldMult.getText());
				tabuada.minMult = Integer.parseInt(textFieldMinimoMult.getText());			
				tabuada.maxMult = Integer.parseInt(textFieldMaximoMult.getText());
			
				if (tabuada.minMult <= tabuada.maxMult) {
					
					listLista1.setListData(tabuada.getTabuada());
					scroll.getViewport().add(listLista1);
			
				} else {
					JOptionPane.showMessageDialog(null, "O mínimo multiplicador é maior que o máximo multiplicador!!", "Erro",JOptionPane.ERROR_MESSAGE, null);
					textFieldMult.setText(null);
					textFieldMinimoMult.setText(null);
					textFieldMaximoMult.setText(null);
						
				}
			
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Não é possível realizar o cálculo!!", "Erro",JOptionPane.ERROR_MESSAGE, null);
				textFieldMult.setText(null);
				textFieldMinimoMult.setText(null);
				textFieldMaximoMult.setText(null);
			
			}
			
		}
	});
	
		botaoLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == botaoLimpar);
				textFieldMult.setText(null);
				textFieldMinimoMult.setText(null);
				textFieldMaximoMult.setText(null);
				
				DefaultListModel<String> lista = new DefaultListModel<>();
				listLista1.setModel(lista);
				
			}
		});
		
	}		
}


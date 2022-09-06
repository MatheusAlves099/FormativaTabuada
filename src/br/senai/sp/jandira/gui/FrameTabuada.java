package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameTabuada {

	public String titulo;
	public int altura;
	public int largura;
	
	public Font fontLabels = new Font("Gill Sans MT", Font.BOLD, 13);
	public Color corDoPainel = new Color(255, 255, 255);
	public Color corReservaAzul = new Color(0, 121, 242);
			
	
	public void criarTela() {
		
	JFrame tela = new JFrame();	
	tela.setTitle(titulo);
	tela.setSize(largura, altura);
	tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	tela.setLayout(null);
	
	Container painel = tela.getContentPane();
	painel.setBackground(corDoPainel);
		
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
	labelDescription2.setBounds(80, 50, 410, 80);
	labelDescription2.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
	labelDescription2.setForeground(Color.gray);
	
	painel.add(labelTabuada);
	painel.add(labelDescription);
	
	tela.setVisible(true);
		
	}
}

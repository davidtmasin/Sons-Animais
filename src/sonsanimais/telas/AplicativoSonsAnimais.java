package sonsanimais.telas;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import sonsanimais.classes.*;

public class AplicativoSonsAnimais extends JFrame {

	private JPanel contentPane;
	JTextArea txtInformacaoAnimal;
	
	String nomeDoPet;
	String nomePopular;
	String nomeCientifico;
	String expectativaVida;
	String informacoes1;
	String informacoes2;
	String informacoes3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AplicativoSonsAnimais frame = new AplicativoSonsAnimais();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AplicativoSonsAnimais() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AplicativoSonsAnimais.class.getResource("/sonsanimais/imagens/paw.png")));
		setTitle("Os animais");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Eras Demi ITC", Font.PLAIN, 20));
		scrollPane.setViewportBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Sobre o nosso amiguinho:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		scrollPane.setBounds(10, 230, 464, 220);
		contentPane.add(scrollPane);
		
		txtInformacaoAnimal = new JTextArea();
		txtInformacaoAnimal.setWrapStyleWord(true);
		txtInformacaoAnimal.setMargin(new Insets(8, 8, 2, 2));
		txtInformacaoAnimal.setTabSize(80);
		txtInformacaoAnimal.setColumns(1);
		txtInformacaoAnimal.setLineWrap(true);
		txtInformacaoAnimal.setEditable(false);
		txtInformacaoAnimal.setFont(new Font("Ebrima", Font.PLAIN, 18));
		txtInformacaoAnimal.setLocation(116, 0);
		scrollPane.setViewportView(txtInformacaoAnimal);
		
		JButton btnGato = new JButton("");
		btnGato.setForeground(Color.BLACK);
		btnGato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tocarSom("miau");
				infoAnimal("gato");
			}
		});
		btnGato.setIcon(new ImageIcon(AplicativoSonsAnimais.class.getResource("/sonsanimais/imagens/cat.png")));
		btnGato.setBounds(30, 50, 70, 70);
		contentPane.add(btnGato);
		
		JButton btnCachorro = new JButton("");
		btnCachorro.setForeground(Color.BLACK);
		btnCachorro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tocarSom("auuu");
				infoAnimal("cachorro");
			}
		});
		btnCachorro.setIcon(new ImageIcon(AplicativoSonsAnimais.class.getResource("/sonsanimais/imagens/dog.png")));
		btnCachorro.setBounds(120, 50, 70, 70);
		contentPane.add(btnCachorro);
		
		JButton btnLeao = new JButton("");
		btnLeao.setForeground(Color.BLACK);
		btnLeao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tocarSom("lion");
				infoAnimal("leao");
			}
		});
		btnLeao.setIcon(new ImageIcon(AplicativoSonsAnimais.class.getResource("/sonsanimais/imagens/lion.png")));
		btnLeao.setBounds(210, 50, 70, 70);
		contentPane.add(btnLeao);
		
		JButton btnElefante = new JButton("");
		btnElefante.setForeground(Color.BLACK);
		btnElefante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tocarSom("elefante");
				infoAnimal("elefante");
			}
		});
		btnElefante.setIcon(new ImageIcon(AplicativoSonsAnimais.class.getResource("/sonsanimais/imagens/elephant.png")));
		btnElefante.setBounds(300, 50, 70, 70);
		contentPane.add(btnElefante);
		
		JButton btnMacaco = new JButton("");
		btnMacaco.setForeground(Color.BLACK);
		btnMacaco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tocarSom("macaco");
				infoAnimal("macaco");
			}
		});
		btnMacaco.setIcon(new ImageIcon(AplicativoSonsAnimais.class.getResource("/sonsanimais/imagens/monkey.png")));
		btnMacaco.setBounds(390, 50, 70, 70);
		contentPane.add(btnMacaco);
		
		JLabel lblNewLabel = new JLabel("ESCOLHA UM BICHINHO");  
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Eras Medium ITC", Font.BOLD, 22));
		lblNewLabel.setBounds(120, 11, 250, 28);
		contentPane.add(lblNewLabel);
		
		JButton btnCavalo = new JButton("");
		btnCavalo.setForeground(Color.BLACK);
		btnCavalo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tocarSom("cavalo");
				infoAnimal("cavalo");
			}
		});
		btnCavalo.setIcon(new ImageIcon(AplicativoSonsAnimais.class.getResource("/sonsanimais/imagens/horse.png")));
		btnCavalo.setBounds(30, 149, 70, 70);
		contentPane.add(btnCavalo);
		
		JButton btnPato = new JButton("");
		btnPato.setForeground(Color.BLACK);
		btnPato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tocarSom("pato");
				infoAnimal("pato");
			}
		});
		btnPato.setIcon(new ImageIcon(AplicativoSonsAnimais.class.getResource("/sonsanimais/imagens/duck.png")));
		btnPato.setBounds(120, 149, 70, 70);
		contentPane.add(btnPato);
		
		JButton btnPorco = new JButton("");
		btnPorco.setForeground(Color.BLACK);
		btnPorco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tocarSom("porco");
				infoAnimal("porco");
			}
		});
		btnPorco.setIcon(new ImageIcon(AplicativoSonsAnimais.class.getResource("/sonsanimais/imagens/pig.png")));
		btnPorco.setBounds(210, 149, 70, 70);
		contentPane.add(btnPorco);
		
		JButton btnSapo = new JButton("");
		btnSapo.setForeground(Color.BLACK);
		btnSapo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tocarSom("sapo");
				infoAnimal("sapo");
			}
		});
		btnSapo.setIcon(new ImageIcon(AplicativoSonsAnimais.class.getResource("/sonsanimais/imagens/frog-prince.png")));
		btnSapo.setBounds(300, 149, 70, 70);
		contentPane.add(btnSapo);
		
		JButton btnGalinha = new JButton("");
		btnGalinha.setForeground(Color.BLACK);
		btnGalinha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tocarSom("galinha");
				infoAnimal("galinha");
			}
		});
		btnGalinha.setIcon(new ImageIcon(AplicativoSonsAnimais.class.getResource("/sonsanimais/imagens/hen.png")));
		btnGalinha.setBounds(390, 149, 70, 70);
		contentPane.add(btnGalinha);
		
		JLabel bgFrame = new JLabel("");
		bgFrame.setVerticalAlignment(SwingConstants.TOP);
		bgFrame.setHorizontalAlignment(SwingConstants.CENTER);
		bgFrame.setIcon(new ImageIcon(AplicativoSonsAnimais.class.getResource("/sonsanimais/imagens/bgFrame5.jpg")));
		bgFrame.setBounds(0, 0, 484, 461);
		contentPane.add(bgFrame);
		
		
	}
	
	//Método para tocar audio em formato .wav
	public void tocarSom(String arquivoAudio) {
		URL urlAudio = getClass().getResource(arquivoAudio +".wav"); 
				//AplicativoSonsAnimais.class.getResource("");
		AudioClip audioClip = Applet.newAudioClip(urlAudio);
		audioClip.play();
	}
	
	//Método responsável pela informação do animal
	
	public void infoAnimal(String animal) {
		switch(animal) {
		case "cachorro":
			
			txtInformacaoAnimal.selectAll();
			txtInformacaoAnimal.replaceSelection("");
			
			nomeDoPet = "Derecky";
			nomePopular = "cachorro ou cão";
			nomeCientifico = "Canis Lupus Familiaris";
			expectativaVida = "10 a 13 anos.";
			Cachorro cachorro = new Cachorro(nomePopular, nomeCientifico, expectativaVida, nomeDoPet);
			
			informacoes1 = cachorro.toString();
 			informacoes2 = cachorro.somAnimal();
			informacoes3 = cachorro.onomatopeiaSomAnimal();
			txtInformacaoAnimal.append(informacoes1);
			txtInformacaoAnimal.append(informacoes2);
			txtInformacaoAnimal.append(informacoes3);			
			break;
			
		case "gato":
			txtInformacaoAnimal.selectAll();
			txtInformacaoAnimal.replaceSelection("");
			
			nomeDoPet = "Jubileu";
			nomePopular = "gato ou gato caseiro";
			nomeCientifico = "Felis Catus";
			expectativaVida = "15 a 20 anos.";
			Gato gato = new Gato(nomePopular, nomeCientifico, expectativaVida, nomeDoPet);
			
			informacoes1 = gato.toString();
 			informacoes2 = gato.somAnimal();
			informacoes3 = gato.onomatopeiaSomAnimal();
			txtInformacaoAnimal.append(informacoes1);
			txtInformacaoAnimal.append(informacoes2);
			txtInformacaoAnimal.append(informacoes3);
			break;
			
		case "leao": 
			txtInformacaoAnimal.selectAll();
			txtInformacaoAnimal.replaceSelection("");
			break;
			
		case "elefante": 
			txtInformacaoAnimal.selectAll();
			txtInformacaoAnimal.replaceSelection("");
			break;
			
		case "macaco": 
			txtInformacaoAnimal.selectAll();
			txtInformacaoAnimal.replaceSelection("");
			break;
			
		case "cavalo": 
			txtInformacaoAnimal.selectAll();
			txtInformacaoAnimal.replaceSelection("");
			break;
			
		case"pato":
			txtInformacaoAnimal.selectAll();
			txtInformacaoAnimal.replaceSelection("");
			break;
			
		case "porco": 
			txtInformacaoAnimal.selectAll();
			txtInformacaoAnimal.replaceSelection("");
				break;
				
		case "sapo": 
			txtInformacaoAnimal.selectAll();
			txtInformacaoAnimal.replaceSelection("");
			break;
			
		case "galinha": 
			txtInformacaoAnimal.selectAll();
			txtInformacaoAnimal.replaceSelection("");			
			break;
			
		}
	}
	
	
	
}


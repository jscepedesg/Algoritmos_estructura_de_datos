package EjecutableLista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import listas.Lista;

public class EstructuraLista extends JFrame{
	
	private PanelIngreso pnlIngreso;
	private PanelOpciones pnlOpciones;
	private PanelInfo pnlInfo;
	
	 Controlador ctrl;

	public EstructuraLista(Controlador ctrl)
	{
		//Configuracion del Jframe
		setSize(500,385);
		setTitle("Estructura Lista");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		//Color JFrame
		this.getContentPane().setBackground(Color.GRAY.darker().darker().darker());
		//Centar JFrame
		util.Util.centrarVentana(this);
		//Esquema de organizacion
		 getContentPane( ).setLayout( null ); 
		//Integrar el controlador
		 this.ctrl = ctrl;
		//Instaciar los paneles
		 pnlIngreso = new PanelIngreso(ctrl);
		 pnlOpciones = new PanelOpciones(ctrl);
		 pnlInfo = new PanelInfo();
		 
		 getContentPane( ).add( pnlIngreso );
	     pnlIngreso.setBounds( 10, 10, 230, 225 );
	     
	     getContentPane( ).add( pnlInfo );
	     pnlInfo.setBounds( 255, 10, 230, 225 );
	     
	     getContentPane( ).add( pnlOpciones );
	     pnlOpciones.setBounds( 10, 245, 475, 100 );
	     
	  // Conecta objetos a controlar
		  ctrl.conectar(pnlInfo,pnlIngreso);
		 
	}
		
	public class PanelIngreso extends JPanel
	{

		private JLabel inf[] = new JLabel[6];
		 private JTextField text[] = new JTextField[4];
		 private JComboBox combo;
		
		public PanelIngreso(Controlador ctrl)
		{
			setBorder(BorderFactory.createLineBorder(Color.RED.darker().darker()));
			setBackground(new Color(254,128,129));
			setLayout( null );
			
			//Lbl Nombre
			 inf[0] = new JLabel("Nombre: ");
			 Font auxFont=inf[0].getFont();
		     inf[0].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 20));
		     inf[0].setForeground(Color.BLACK.darker().darker().darker().darker());
		     inf[0].setBounds(10, 55, 125, 35);
		     add(inf[0]);
		     
		     inf[1] = new JLabel("Apellido: ");
			 Font auxFont1=inf[1].getFont();
		     inf[1].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 20));
		     inf[1].setForeground(Color.BLACK.darker().darker().darker().darker());
		     inf[1].setBounds(10, 85, 125, 35);
		     add(inf[1]);
		     
		     inf[2] = new JLabel("Edad: ");
			 Font auxFont2=inf[2].getFont();
		     inf[2].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 20));
		     inf[2].setForeground(Color.BLACK.darker().darker().darker().darker());
		     inf[2].setBounds(10, 115, 125, 35);
		     add(inf[2]);
		     
		     inf[3] = new JLabel("Cedula: ");
			 Font auxFont3=inf[3].getFont();
		     inf[3].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 20));
		     inf[3].setForeground(Color.BLACK.darker().darker().darker().darker());
		     inf[3].setBounds(10, 145, 125, 35);
		     add(inf[3]);
		     
		     inf[4] = new JLabel("Hora: ");
			 Font auxFont4=inf[4].getFont();
		     inf[4].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 20));
		     inf[4].setForeground(Color.BLACK.darker().darker().darker().darker());
		     inf[4].setBounds(10, 175, 125, 35);
		     add(inf[4]);
		     
		     //LBL Agregar
		     inf[5] = new JLabel("Agregar: ");
			 Font auxFont5=inf[5].getFont();
		     inf[5].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 28));
		     inf[5].setForeground(new Color(0,64,112));
		     inf[5].setBounds(10, 5, 125, 35);
		     add(inf[5]);
		    
		     //Text Nombre 
		     text[0] = new JTextField();
		     text[0].setBounds( 120, 63, 100, 20 );
		     add(text[0]);
		     
		     //Text Apellido
		     text[1] = new JTextField();
		     text[1].setBounds( 120, 93, 100, 20 );
		     add(text[1]);
		     
		     //Text Edad
		     text[2] = new JTextField();
		     text[2].setBounds( 120, 123, 50, 20 );
		     add(text[2]);
		     
		     //Text Cedula
		     text[3] = new JTextField();
		     text[3].setBounds( 120, 153, 80, 20 );
		     add(text[3]);
		     
		     
		     combo = new JComboBox();
			 combo.setEditable(false);
				
				for(int i = 8;i<19;i++)
				{
					for(int j=0;j<50;j=j+20)
					{
						if(i<10)
						{
							if(j!=0)
							{
							combo.addItem("0"+i+":"+j);
							}
							else if(j==0)
							{
								combo.addItem("0"+i+":"+j+"0");
							}
						}
						else if(i>9)
						{
							if(j!=0)
							{
							combo.addItem(i+":"+j);
							}
							else if(j==0)
							{
								combo.addItem(i+":"+j+"0");
							}
						}
						if(i==18&&j==20)
						{
							j=50;
						}
					     
					}
				}
				
				
				combo.setBounds(120, 180, 85, 30);
				add(combo);
		}
		
		public String getIngresoNom(){return text[0].getText();}
		public String getIngresoApe(){return text[1].getText();}
		public String getIngresoed(){return text[2].getText();}
		public String getIngresoce(){return text[3].getText();}
		public String getIngresoho(){return (String)combo.getSelectedItem();}
		
	}
	
	public class PanelOpciones extends JPanel implements ActionListener
	{
		private JButton opc[] = new JButton[4];
		private Controlador ctrl;

		public PanelOpciones(Controlador ctrl)
		{
			setBorder(BorderFactory.createLineBorder(Color.RED.darker().darker()));
			setBackground(new Color(254,128,129));
			setLayout( null );
			//Integar controlador
			this.ctrl=ctrl;
			
			opc[0] = new JButton("Agregar");
			opc[0].addActionListener(this);
		    add(opc[0]);
			opc[0].setBounds(50, 30, 80, 30);
			
			opc[1] = new JButton("Estado");
			opc[1].addActionListener(this);
		    add(opc[1]);
			opc[1].setBounds(150, 30, 80, 30);
			
			opc[2] = new JButton("Tamaño");
			opc[2].addActionListener(this);
		    add(opc[2]);
			opc[2].setBounds(250, 30, 80, 30);
			
			opc[3] = new JButton("Eliminar");
			opc[3].addActionListener(this);
		    add(opc[3]);
			opc[3].setBounds(350, 30, 80, 30);
		}

		
		public void actionPerformed(ActionEvent e) 
		{
			Object btnpuch = e.getSource();
			
			if(btnpuch==opc[0])
			{
				ctrl.setAgrega();
			}
			else if(btnpuch==opc[1])
			{
				ctrl.setEstado();
			}
			else if(btnpuch==opc[2])
			{
				ctrl.setTamaño();
			}
			else if(btnpuch==opc[3])
			{
				ctrl.setEliminar();
			}
			
		}
		
	}
	
	public class PanelInfo extends JPanel
	{
		private JLabel inf[] = new JLabel[9];
		public PanelInfo()
		{
			setBorder(BorderFactory.createLineBorder(Color.RED.darker().darker()));
			setBackground(new Color(254,128,129));
			setLayout( null );
			
			//Lbl Numero
			 inf[0] = new JLabel("Informacion: ");
			 Font auxFont=inf[0].getFont();
		     inf[0].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 28));
		     inf[0].setForeground(new Color(0,64,112));
		     inf[0].setBounds(10, 5, 185, 35);
		     add(inf[0]);
		     
		     inf[1] = new JLabel("Tamaño: ");
			 Font auxFont1=inf[1].getFont();
		     inf[1].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 20));
		     inf[1].setForeground(Color.BLACK);
		     inf[1].setBounds(10, 53, 185, 35);
		     add(inf[1]);
		     
		     inf[2] = new JLabel("Estado: ");
			 Font auxFont2=inf[2].getFont();
		     inf[2].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 20));
		     inf[2].setForeground(Color.BLACK);
		     inf[2].setBounds(10, 85, 185, 35);
		     add(inf[2]);
		     
		     inf[3] = new JLabel("Agrego: ");
			 Font auxFont3=inf[3].getFont();
		     inf[3].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 20));
		     inf[3].setForeground(Color.BLACK);
		     inf[3].setBounds(10, 117, 185, 35);
		     add(inf[3]);
		     
		     inf[7] = new JLabel("Eliminó: ");
			 Font auxFont7=inf[7].getFont();
		     inf[7].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 20));
		     inf[7].setForeground(Color.BLACK);
		     inf[7].setBounds(10, 165, 185, 35);
		     add(inf[7]);
		     
		     inf[4] = new JLabel(" ");
			 Font auxFont4=inf[4].getFont();
		     inf[4].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 18));
		     inf[4].setForeground(Color.BLACK);
		     inf[4].setBounds(150, 53, 50, 35);
		     add(inf[4]);
		     
		     inf[5] = new JLabel(" ");
			 Font auxFont5=inf[5].getFont();
		     inf[5].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 15));
		     inf[5].setForeground(Color.BLACK);
		     inf[5].setBounds(150, 85, 100, 35);
		     add(inf[5]);
		     
		     inf[6] = new JLabel(" ");
			 Font auxFont6=inf[6].getFont();
		     inf[6].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 10));
		     inf[6].setForeground(Color.BLACK);
		     inf[6].setBounds(10, 143, 200, 35);
		     add(inf[6]);
		     
		     inf[8] = new JLabel(" ");
			 Font auxFont8=inf[8].getFont();
		     inf[8].setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 10));
		     inf[8].setForeground(Color.BLACK);
		     inf[8].setBounds(10, 188, 250, 35);
		     add(inf[8]);
			
			
		}
		
		public void setTamaño(String tam){inf[4].setText(tam);}
		public void setEstado(String esta){inf[5].setText(esta);}
		public void setAgrega(String nom,String apel,String edad,String ced,String hora)
			{
				inf[6].setText(nom+", "+apel+", "+edad+", "+ced+", "+hora);
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instancia el panel
		EstructuraLista ventana = new  EstructuraLista(new Controlador());
		ventana.setVisible(true);
		//Instancia la estructura
		Lista lista = new Lista();
		
		
	}

}



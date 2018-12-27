package EjecutableLista;

import javax.swing.JOptionPane;

import EjecutableLista.EstructuraLista.PanelInfo;
import EjecutableLista.EstructuraLista.PanelIngreso;
import listas.Lista;
import tipos_class.Paciente;

	public class Controlador
	{
		private PanelInfo pnlInfo;
		private PanelIngreso pnlIngreso;
		private Mundo mundo;

		public Controlador()
		{
			mundo = new Mundo();
		}
		public void conectar(PanelInfo pnlInfo, PanelIngreso pnlIngreso) 
		{
			this.pnlInfo=pnlInfo;
			this.pnlIngreso=pnlIngreso;
		}
		
		public void setAgrega()
		{
			String inf[] = new String[5];
			inf[0] = pnlIngreso.getIngresoNom();
			inf[1] = pnlIngreso.getIngresoApe();
			inf[2] = pnlIngreso.getIngresoed();
			inf[3] = pnlIngreso.getIngresoce();
			inf[4] = pnlIngreso.getIngresoho();
			pnlInfo.setAgrega(inf[0],inf[1],inf[2],inf[3],inf[4]);
			try
			{
			mundo.setAgregar(inf[0],inf[1],Integer.parseInt(inf[2]),Integer.parseInt(inf[3]),inf[4]);
			}
			catch(NumberFormatException exepcion)
			{
				JOptionPane.showMessageDialog(null,"No se han ingresado los valores", "ERROR",JOptionPane.ERROR_MESSAGE);
			}
		}
		
		public void setEstado()
		{
			String esta;
			esta =mundo.getEstado();
			pnlInfo.setEstado(esta);
		}
		
		public void setTamaño()
		{
			String tam =mundo.getTamaño();
			pnlInfo.setTamaño(tam);
		}
		
		public void setEliminar()
		{
			JOptionPane.showMessageDialog(null,"La estructura carece de la opción", "ERROR",JOptionPane.ERROR_MESSAGE);
		}
		
		
		public class Mundo
		{
			Lista<Paciente> lista = new Lista<Paciente>();
			
			public void setAgregar(String nombre,String apellido,int edad,int cedula,String hora)
			{
				lista.setAdd(new Paciente(nombre,apellido,edad,cedula,hora));
			}
			
			public String getEstado()
			{
				boolean es =lista.getIsEmpty();
				if(es)
				{
					return "Vació";
				}
				else
				{
					return "LLeno";
				}
			}

			public String getTamaño()
			{
				int tam =lista.getSize();
				return String.valueOf(tam);
			}
			
			/*public Paciente[] getEliminar()
			{
				return 
			}*/
			
			
		}
		
	}
	
	

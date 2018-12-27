package EjecutableCola;

import javax.swing.JOptionPane;

import EjecutableCola.EstructuraCola.PanelInfo1;
import EjecutableCola.EstructuraCola.PanelIngreso1;
import EjecutableLista.EstructuraLista.PanelInfo;
import EjecutableLista.EstructuraLista.PanelIngreso;
import cola.Queue;
import listas.Lista;
import tipos_class.Paciente;

	public class Controlador1
	{
		private PanelInfo1 pnlInfo1;
		private PanelIngreso1 pnlIngreso1;
		private Mundo1 mundo1;

		public Controlador1()
		{
			mundo1 = new Mundo1();
		}
		public void conectar1(PanelInfo1 pnlInfo1, PanelIngreso1 pnlIngreso1) 
		{
			this.pnlInfo1=pnlInfo1;
			this.pnlIngreso1=pnlIngreso1;
		}
		
		public void setAgrega()
		{
			String inf[] = new String[5];
			inf[0] = pnlIngreso1.getIngresoNom();
			inf[1] = pnlIngreso1.getIngresoApe();
			inf[2] = pnlIngreso1.getIngresoed();
			inf[3] = pnlIngreso1.getIngresoce();
			inf[4] = pnlIngreso1.getIngresoho();
			pnlInfo1.setAgrega(inf[0],inf[1],inf[2],inf[3],inf[4]);
			try
			{
			mundo1.setAgregar(inf[0],inf[1],Integer.parseInt(inf[2]),Integer.parseInt(inf[3]),inf[4]);
			}
			catch(NumberFormatException exepcion)
			{
				JOptionPane.showMessageDialog(null,"No se han ingresado los valores", "ERROR",JOptionPane.ERROR_MESSAGE);
			}
		}
		
		public void setEstado()
		{
			String esta;
			esta =mundo1.getEstado();
			pnlInfo1.setEstado(esta);
		}
		
		public void setTamaño()
		{
			String tam =mundo1.getTamaño();
			pnlInfo1.setTamaño(tam);
		}
		
		public void setEliminar()
		{
			Paciente elemento = mundo1.getEliminar();
			String inf[] = new String[5];
			try
			{
			inf[0] = elemento.getNombre();
			inf[1] = elemento.getApellido();
			inf[2] = String.valueOf(elemento.getEdad());
			inf[3] = String.valueOf(elemento.getCedula());
			inf[4] = elemento.getHora();
			
			pnlInfo1.setElimina(inf[0],inf[1],inf[2],inf[3],inf[4]);
			}
			catch(NullPointerException exepcion)
			{
				JOptionPane.showMessageDialog(null,"No se han ingresado los valores", "ERROR",JOptionPane.ERROR_MESSAGE);
			}
			
		}
		
		
		public class Mundo1
		{
			Queue<Paciente> cola = new Queue<Paciente>();
			
			public void setAgregar(String nombre,String apellido,int edad,int cedula,String hora)
			{
				cola.setEnqueue(new Paciente(nombre, apellido, edad, cedula, hora));
			}
			
			public String getEstado()
			{
				boolean es =cola.getIsEmpty();
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
				int tam =cola.getSize();
				return String.valueOf(tam);
			}
			
			public Paciente getEliminar()
			{
				return cola.getDequeue();
			}
			
			
		}
		
	}
	
	

package EjecutablePila;

import javax.swing.JOptionPane;

import EjecutableCola.EstructuraCola.PanelInfo1;
import EjecutableCola.EstructuraCola.PanelIngreso1;
import EjecutableLista.EstructuraLista.PanelInfo;
import EjecutableLista.EstructuraLista.PanelIngreso;
import EjecutablePila.EstructuraPila.PanelInfo2;
import EjecutablePila.EstructuraPila.PanelIngreso2;
import cola.Queue;
import listas.Lista;
import pila.Stack;
import tipos_class.Paciente;

	public class Controlador2
	{
		private PanelInfo2 pnlInfo2;
		private PanelIngreso2 pnlIngreso2;
		private Mundo2 mundo2;

		public Controlador2()
		{
			mundo2 = new Mundo2();
		}
		public void conectar2(PanelInfo2 pnlInfo2, PanelIngreso2 pnlIngreso2) 
		{
			this.pnlInfo2=pnlInfo2;
			this.pnlIngreso2=pnlIngreso2;
		}
		
		public void setAgrega()
		{
			String inf[] = new String[5];
			inf[0] = pnlIngreso2.getIngresoNom();
			inf[1] = pnlIngreso2.getIngresoApe();
			inf[2] = pnlIngreso2.getIngresoed();
			inf[3] = pnlIngreso2.getIngresoce();
			inf[4] = pnlIngreso2.getIngresoho();
			pnlInfo2.setAgrega(inf[0],inf[1],inf[2],inf[3],inf[4]);
			try
			{
			mundo2.setAgregar(inf[0],inf[1],Integer.parseInt(inf[2]),Integer.parseInt(inf[3]),inf[4]);
			}
			catch(NumberFormatException exepcion)
			{
				JOptionPane.showMessageDialog(null,"No se han ingresado los valores", "ERROR",JOptionPane.ERROR_MESSAGE);
			}
		}
		
		public void setEstado()
		{
			String esta;
			esta =mundo2.getEstado();
			pnlInfo2.setEstado(esta);
		}
		
		public void setTamaño()
		{
			String tam =mundo2.getTamaño();
			pnlInfo2.setTamaño(tam);
		}
		
		public void setEliminar()
		{
			Paciente elemento = mundo2.getEliminar();
			String inf[] = new String[5];
			try
			{
			inf[0] = elemento.getNombre();
			inf[1] = elemento.getApellido();
			inf[2] = String.valueOf(elemento.getEdad());
			inf[3] = String.valueOf(elemento.getCedula());
			inf[4] = elemento.getHora();
			
			pnlInfo2.setElimina(inf[0],inf[1],inf[2],inf[3],inf[4]);
			}
			catch(NullPointerException exepcion)
			{
				JOptionPane.showMessageDialog(null,"No se han ingresado los valores", "ERROR",JOptionPane.ERROR_MESSAGE);
			}
			
		}
		
		
		public class Mundo2
		{
			Stack<Paciente> pila = new Stack<Paciente>();
			
			public void setAgregar(String nombre,String apellido,int edad,int cedula,String hora)
			{
				pila.setPush(new Paciente(nombre,apellido,edad,cedula,hora));
			}
			
			public String getEstado()
			{
				boolean es =pila.getIsEmpty();
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
				int tam = pila.getSize();
				return String.valueOf(tam);
			}
			
			public Paciente getEliminar()
			{
				return pila.getPop();
			}
			
			
		}
		
	}
	
	

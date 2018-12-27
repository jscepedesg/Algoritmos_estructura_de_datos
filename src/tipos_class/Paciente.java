package tipos_class;

public class Paciente {
	
	private String nombre,apellido,hora;
    private int edad,cedula;
    public Paciente(String nombre,String apellido,int edad,int cedula,String hora)
    {
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.cedula=cedula;
        this.hora=hora;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    public String getApellido()
    {
        return apellido;
    }
    
    public int getEdad()
    {
        return edad;
    }
    public int getCedula()
    {
        return cedula;    
    }
    public String getHora()
    {
        return hora;
    }

}

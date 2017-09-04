
public class Estacionamiento
{
    private Estacionamiento vehiculos[];
    
    public Estacionamiento()
    {
        Vehiculo[] vehiculos= new Vehiculo[150];
        
    }
    
    public void espacio()
    {
        if(vehiculos.length > 150)
        {
            System.out.println("Estacionamiento Lleno");
        }else
        {
            for(int i=0; i < vehiculos.length; i++)
            {
                //vehiculos[i].registro(vehicu);
            }
        }
    }
}
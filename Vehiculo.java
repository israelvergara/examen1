
public class Vehiculo
{
    private String placas;
    private int horas;
    private int minutos;
    private int costo;
    
    public Vehiculo()
    {
        horas = 0;
        minutos = 0;
        costo = 15;
        placas = "";
    }
    
    public boolean registro(int horaIni, int minIni, String placas)
    {
        if(placas == ""){
           horas = horaIni;
           minutos = minIni;
           this.placas = placas;
           return true;
        }
        return false;
    }
    
    public void salida(int horaFin, int minFin, String placas)
    {
        int horaTotal=0;
        this.placas = placas;
        if (placas == this.placas){
            if(horas < horaFin)
            {
                if(minutos > 0 )
                {
                    horaTotal = horaFin - horas;
                    horaTotal +=1;
                }
                horaTotal = horaFin - horas;
                horaTotal *= costo;
                System.out.println(horaTotal);
               
            }
        }
        else
        {
            System.out.println("EL vehiculo no se encuentra");
        }
    }
}
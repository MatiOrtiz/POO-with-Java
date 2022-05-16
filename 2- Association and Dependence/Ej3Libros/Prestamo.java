
public class Prestamo{
    
    //Atributos de Instancia
    private Libro libro;
    private String socio;
    private Fecha fechaPrestamo, fechaDevolucion;
    private int dias;
    
    //Constructor
    public Prestamo(Libro i, Fecha fp, int d, String s){
        libro= i;
        fechaPrestamo= fp;
        dias= d;
        socio= s;
    }
    
    //Comandos
    public void establecerFechaDev(Fecha fd){
        fechaDevolucion= fd;    
    }
    
    //Consultas
    public Libro obtenerLibro(){
        return libro;
    }
    public Fecha obtenerFechaPrestamo(){
        return fechaPrestamo;
    }
    public Fecha obtenerPlazoDev(){
        return fechaPrestamo.sumaDias(dias);
    }
    public Fecha obtenerFechaDev(){
        return fechaDevolucion;
    }
    private int difDias(){
        int dif = 0;
        if(obtenerFechaDev().obtenerDia() - obtenerPlazoDev().obtenerDia() > 0)
            dif =  obtenerFechaDev().obtenerDia() - obtenerPlazoDev().obtenerDia();
            else dif = 0;
        if (obtenerFechaDev().obtenerMes() - obtenerPlazoDev().obtenerMes() > 0)
            dif += (obtenerFechaDev().obtenerMes() - obtenerPlazoDev().obtenerMes());
        return dif;
    }
    public String obtenerSocio(){
        return socio;
    }
    public boolean estaAtrasado(Fecha hoy){
        return fechaDevolucion == null && obtenerPlazoDev().esAnterior(hoy);
    }
    public Fecha penalizacion(){
        Fecha dias;
        int p1=3;
        int p2=5;
        int p3=10;
        if (libro.obtenerCategoria() == 'A'){
            p1*=2;
            p2*=2;
            p3*=2;
        }
            
        if(difDias() > 0 && difDias() < 7)
            dias = obtenerFechaDev().sumaDias(p1);
            else if(difDias() > 7 && difDias() < 21) 
                    dias = obtenerFechaDev().sumaDias(p2);
                    else if(difDias() >=21)
                            dias = obtenerFechaDev().sumaDias(p3);
        else dias = null;
        return dias;
    }
    public boolean equals(Prestamo p){
        return libro == p.obtenerLibro() && socio.equals(p.obtenerSocio()) && fechaPrestamo.equals(p.obtenerFechaPrestamo());     
    }
    public String toString(){
        return "Socio: " + socio + ", Libro: " + libro + ", Fecha de prestamo: " + obtenerFechaPrestamo() + ", Fecha de Devolucion: " + obtenerFechaDev();     
    }
    
}

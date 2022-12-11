package javaJuego;

public class seca extends skincare
{
    private int tipoPielS = 2;
    private int horarioS;
    private double limpiadorCremosoS;
    private double exfolianteS;
    private double cremaHidratanteS;
    private double protectorSolarS;
    private double aceiteFacial;
    private double desmaquillanteS;

    
    public double getDesmaquillanteS() {
        return desmaquillanteS;
    }
    public void setDesmaquillanteS(double desmaquillanteS) {
        this.desmaquillanteS = desmaquillanteS;
    }
    public int getTipoPielS() {
        return tipoPielS;
    }
    public void setTipoPielS(int tipoPielS) {
        this.tipoPielS = tipoPielS;
    }

    public int getHorarioS() {
        return horarioS;
    }
    public void setHorarioS(int horarioS) {
        this.horarioS = horarioS;
    }

    public double getLimpiadorCremosoS() {
        return limpiadorCremosoS;
    }
    public void setLimpiadorCremosoS(double limpiadorCremosoS) {
        this.limpiadorCremosoS = limpiadorCremosoS;
    }

    public double getExfolianteS() {
        return exfolianteS;
    }
    public void setExfolianteS(double exfolianteS) {
        this.exfolianteS = exfolianteS;
    }

    public double getCremaHidratanteS() {
        return cremaHidratanteS;
    }
    public void setCremaHidratanteS(double cremaHidratanteS) {
        this.cremaHidratanteS = cremaHidratanteS;
    }

    public double getProtectorSolarS() {
        return protectorSolarS;
    }
    public void setProtectorSolarS(double protectorSolarS) {
        this.protectorSolarS = protectorSolarS;
    }

    public double getAceiteFacial() {
        return aceiteFacial;
    }
    public void setAceiteFacial(double aceiteFacial) {
        this.aceiteFacial = aceiteFacial;
    }
    


    public seca(){}
    public seca(int tipoPielS, int horarioS, double limpiadorCremosoS, double exfolianteS, double cremaHidratanteS,
            double protectorSolarS, double aceiteFacial, double desmaquillanteS) {
        this.tipoPielS = tipoPielS;
        this.horarioS = horarioS;
        this.limpiadorCremosoS = limpiadorCremosoS;
        this.exfolianteS = exfolianteS;
        this.cremaHidratanteS = cremaHidratanteS;
        this.protectorSolarS = protectorSolarS;
        this.aceiteFacial = aceiteFacial;
        this.desmaquillanteS = desmaquillanteS;
    }

    @Override
    public void mostrarTipoPiel() 
    {
        System.out.println("Su tipo de piel es: ");
        System.out.println(getTipoPielS() + " SECA");
    }
    
    @Override
    public void mostrarSkincare() 
    {
        System.out.println("si su seleccion de Horario fue: ");
        System.out.println(getHorarioS());
        if (getHorarioS() == 1 ) 
        {
            System.out.println("Los que debe utilizar es: \n Limpiador cremoso \n Exfoliante facial \n Crema hidratante \n Protector Solar \n Aceite Facial");
        } 
        else if(getHorarioS() == 2 ) 
        {
            System.out.println("Los que debe utilizar es: \n Desmaquillante \n limpieza \n tonico \n serum \n crema hidratante");
        }  
    }

    @Override
    public void calcularPrecioProducto() {
        double resultado;
        resultado = getLimpiadorCremosoS() + getExfolianteS() + getCremaHidratanteS() + getProtectorSolarS() + getAceiteFacial() + getDesmaquillanteS();
        System.out.println("El total segun los precios de los productos que tiene en mente para comprar seria de: " + resultado);
    }
}

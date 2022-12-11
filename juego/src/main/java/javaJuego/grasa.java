package javaJuego;

public class grasa extends skincare
{
    private int tipoPielG = 1;
    private int horarioG;
    private double limpiadorG;
    private double tonicoG;
    private double serumG;
    private double cremaHidratanteG;
    private double protectorSolarG;
    private double desmaquillanteG;

    
    public int getTipoPielG() {
        return tipoPielG;
    }
    public void setTipoPielG(int tipoPielG) {
        this.tipoPielG = tipoPielG;
    }

    public int getHorarioG() {
        return horarioG;
    }
    public void setHorarioG(int horarioG) {
        this.horarioG = horarioG;
    }

    public double getLimpiadorG() {
        return limpiadorG;
    }
    public void setLimpiadorG(double limpiadorG) {
        this.limpiadorG = limpiadorG;
    }

    public double getTonicoG() {
        return tonicoG;
    }
    public void setTonicoG(double tonicoG) {
        this.tonicoG = tonicoG;
    }

    public double getSerumG() {
        return serumG;
    }
    public void setSerumG(double serumG) {
        this.serumG = serumG;
    }

    public double getCremaHidratanteG() {
        return cremaHidratanteG;
    }
    public void setCremaHidratanteG(double cremaHidratanteG) {
        this.cremaHidratanteG = cremaHidratanteG;
    }

    public double getProtectorSolarG() {
        return protectorSolarG;
    }
    public void setProtectorSolarG(double protectorSolarG) {
        this.protectorSolarG = protectorSolarG;
    }
    public double getDesmaquillanteG() {
        return desmaquillanteG;
    }
    public void setDesmaquillanteG(double desmaquillanteG) {
        this.desmaquillanteG = desmaquillanteG;
    }



    public grasa(){}
    public grasa(int tipoPielG, int horarioG, double limpiadorG, double tonicoG, double serumG, double cremaHidratanteG,
            double protectorSolarG, double desmaquillanteG) {
        this.tipoPielG = tipoPielG;
        this.horarioG = horarioG;
        this.limpiadorG = limpiadorG;
        this.tonicoG = tonicoG;
        this.serumG = serumG;
        this.cremaHidratanteG = cremaHidratanteG;
        this.protectorSolarG = protectorSolarG;
        this.desmaquillanteG = desmaquillanteG;
    }

    @Override
    public void mostrarTipoPiel() 
    {
        System.out.println("Su tipo de piel es: ");
        System.out.println(getTipoPielG() + " GRASA");
    }

    @Override
    public void mostrarSkincare() 
    {
        System.out.println("si su seleccion de Horario fue: ");
        System.out.println(getHorarioG() );
        if (getHorarioG() == 1 ) 
        {
            System.out.println("Los que debe utilizar es: \n Limpieza \n Tonico \n Serum \n Crema hidratante \n Protector Solar" );
        } 
        else if(getHorarioG() == 2 ) 
        {
            System.out.println("Los que debe utilizar es: \n Desmaquillante \n Limpieza \n Tonico \n Serum \n Crema hidratante");
        }
    }

    @Override
    public void calcularPrecioProducto() 
    {
        double resultado;
        resultado = getLimpiadorG() + getTonicoG() + getSerumG() + getCremaHidratanteG() + getProtectorSolarG() + getDesmaquillanteG();
        System.out.println("El total segun los precios de los productos que tiene en mente para comprar seria de: " + resultado);   
    }
}

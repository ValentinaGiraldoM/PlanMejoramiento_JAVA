package javaJuego;

public class mixta extends skincare
{
    private int tipoPielM = 3;
    private int horarioM;
    private double limpiadorM;
    private double exfolianteM;
    private double mascarillaM;
    private double hidratanteM;
    private double contornoOjosM;
    private double serumM;
    private double desmaquillanteM;
    private double protectorSolarM;


    public int getTipoPielM() {
        return tipoPielM;
    }
    public void setTipoPielM(int tipoPielM) {
        this.tipoPielM = tipoPielM;
    }

    public int getHorarioM() {
        return horarioM;
    }
    public void setHorarioM(int horarioM) {
        this.horarioM = horarioM;
    }

    public double getLimpiadorM() {
        return limpiadorM;
    }
    public void setLimpiadorM(double limpiadorM) {
        this.limpiadorM = limpiadorM;
    }

    public double getExfolianteM() {
        return exfolianteM;
    }
    public void setExfolianteM(double exfolianteM) {
        this.exfolianteM = exfolianteM;
    }

    public double getMascarillaM() {
        return mascarillaM;
    }
    public void setMascarillaM(double mascarillaM) {
        this.mascarillaM = mascarillaM;
    }

    public double getHidratanteM() {
        return hidratanteM;
    }
    public void setHidratanteM(double hidratanteM) {
        this.hidratanteM = hidratanteM;
    }

    public double getContornoOjosM() {
        return contornoOjosM;
    }
    public void setContornoOjosM(double contornoOjosM) {
        this.contornoOjosM = contornoOjosM;
    }

    public double getSerumM() {
        return serumM;
    }
    public void setSerumM(double serumM) {
        this.serumM = serumM;
    }

    public double getDesmaquillanteM() {
        return desmaquillanteM;
    }
    public void setDesmaquillanteM(double desmaquillanteM) {
        this.desmaquillanteM = desmaquillanteM;
    }

    public double getProtectorSolarM() {
        return protectorSolarM;
    }
    public void setProtectorSolarM(double protectorSolarM) {
        this.protectorSolarM = protectorSolarM;
    }


    public mixta(){}
    public mixta(int tipoPielM, int horarioM, double limpiadorM, double exfolianteM, double mascarillaM,
            double hidratanteM, double contornoOjosM, double serumM, double desmaquillanteM, double protectorSolarM) {
        this.tipoPielM = tipoPielM;
        this.horarioM = horarioM;
        this.limpiadorM = limpiadorM;
        this.exfolianteM = exfolianteM;
        this.mascarillaM = mascarillaM;
        this.hidratanteM = hidratanteM;
        this.contornoOjosM = contornoOjosM;
        this.serumM = serumM;
        this.desmaquillanteM = desmaquillanteM;
        this.protectorSolarM = protectorSolarM;
    }

    @Override
    public void mostrarTipoPiel() 
    {
        System.out.println("Su tipo de piel es: ");
        System.out.println(getTipoPielM() + " MIXTA");
    }
    
    @Override
    public void mostrarSkincare() 
    {
        System.out.println("si su seleccion de Horario fue: ");
        System.out.println(getHorarioM());
        if (getHorarioM() == 1 ) 
        {
            System.out.println("Los que debe utilizar es: \n Limpiador \n Exfoliante facial \n Mascarilla \n Hidratación \n Contorno de ojos \n Serum \n Protector Solar ");
        } 
        else if(getHorarioM() == 2 ) 
        {
            System.out.println("Los que debe utilizar es: \n Desmaquillante \n limpieza \n tonico \n Contorno de ojos \n serum \n crema hidratante");
        }
    }

    @Override
    public void calcularPrecioProducto() {
        double resultado;
        resultado = getLimpiadorM() + getExfolianteM() + getMascarillaM() + getHidratanteM() + getContornoOjosM() + getSerumM() + getDesmaquillanteM() + getProtectorSolarM();
        System.out.println("El total segun los precios de los productos que tiene en mente para comprar seria de: " + resultado);
        
    }
}

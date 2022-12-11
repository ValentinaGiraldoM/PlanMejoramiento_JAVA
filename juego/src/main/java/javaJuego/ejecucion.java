package javaJuego;
import java.util.Scanner;

public class ejecucion 
{
    public static void main(String[] args) 
    {
        int respuesta;
        int continuar;
        Scanner lector = new Scanner(System.in);
        grasa G = new grasa();
        seca S = new seca();
        mixta M = new mixta();

        do {

            System.out.println("ingrese el tipo de piel \n 1) Piel Grasa \n 2) Piel Seca \n 3) Piel Mixta");
            respuesta = lector.nextInt();

            if ( G.getTipoPielG() == respuesta) 
            {
                G.mostrarTipoPiel();
                System.out.println("___________________________________________________________________________");
                System.out.println("Ingrese el horaraio en el que desea hacer su skincare \n 1) Dia \n 2) Noche ");
                G.setHorarioG(lector.nextInt());
                System.out.println("___________________________________________________________________________");
                G.mostrarSkincare();
                System.out.println("___________________________________________________________________________");
                System.out.println("Ingrese el precio de cada producto segun usted desee comprar");
                System.out.println("LIMPIADOR");
                G.setLimpiadorG(lector.nextDouble());
                System.out.println("TONICO");
                G.setTonicoG(lector.nextDouble());
                System.out.println("SERUM");
                G.setSerumG(lector.nextDouble());
                System.out.println("CREMA HIDRATANTE");
                G.setCremaHidratanteG(lector.nextDouble());
                System.out.println("DESMAQUILLANTE");
                G.setDesmaquillanteG(lector.nextDouble());
                System.out.println("PROTECTOR SOLAR");
                G.setProtectorSolarG(lector.nextDouble());
                System.out.println("___________________________________________________________________________");
                G.calcularPrecioProducto();
                System.out.println("___________________________________________________________________________");
            } 
            else if( S.getTipoPielS() == respuesta) 
            {
                S.mostrarTipoPiel();
                System.out.println("Ingrese el horaraio en el que desea hacer su skincare \n 1) Dia \n 2) Noche ");
                S.setHorarioS(lector.nextInt());
                System.out.println("___________________________________________________________________________");
                S.mostrarSkincare();
                System.out.println("___________________________________________________________________________");
                System.out.println("Ingrese el precio de cada producto segun usted desee comprar");
                System.out.println("LIMPIADOR CREMOSO");
                S.setLimpiadorCremosoS(lector.nextDouble());
                System.out.println("EXFOLIANTE FACIAL");
                S.setExfolianteS(lector.nextDouble());
                System.out.println("CREMA HIDRATANTE");
                S.setCremaHidratanteS(lector.nextDouble());
                System.out.println("DESMAQUILLANTE");
                S.setDesmaquillanteS(lector.nextDouble());
                System.out.println("PROTECTOR SOLAR");
                S.setProtectorSolarS(lector.nextDouble());
                System.out.println("ACEITE FACIAL");
                S.setAceiteFacial(lector.nextDouble());
                System.out.println("___________________________________________________________________________");
                S.calcularPrecioProducto();
                System.out.println("___________________________________________________________________________");
            }
            else if( M.getTipoPielM() == respuesta) 
            {
                M.mostrarTipoPiel();
                System.out.println("Ingrese el horaraio en el que desea hacer su skincare \n 1) Dia \n 2) Noche ");
                M.setHorarioM(lector.nextInt());
                System.out.println("___________________________________________________________________________");
                M.mostrarSkincare();
                System.out.println("___________________________________________________________________________");
                System.out.println("Ingrese el precio de cada producto segun usted desee comprar");
                System.out.println("LIMPIADOR");
                M.setLimpiadorM(lector.nextDouble());
                System.out.println("EXFOLIANTE FACIAL");
                M.setExfolianteM(lector.nextDouble());
                System.out.println("MASCARILLA");
                M.setMascarillaM(lector.nextDouble());
                System.out.println("HIDRATANTE");
                M.setHidratanteM(lector.nextDouble());
                System.out.println("CONTORNO DE OJOS");
                M.setContornoOjosM(lector.nextDouble());
                System.out.println("SERUM");
                M.setSerumM(lector.nextDouble());
                System.out.println("DESMAQUILLANTE");
                M.setDesmaquillanteM(lector.nextDouble());
                System.out.println("PROTECTOR SOLAR");
                M.setProtectorSolarM(lector.nextDouble());
                System.out.println("___________________________________________________________________________");
                M.calcularPrecioProducto();
                System.out.println("___________________________________________________________________________");
            }

            System.out.println("\nEscriba el numero 0 si desea continuar de lo contrario ingrese cualquier otro numero para finalizar ");
            continuar = lector.nextInt();
            System.out.println("_____________________________________________________________________________");
        } while (continuar==0);

        System.out.println("Ha finalizado, Gracias.");
        
lector.close();
    }
}

<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inicio</title>
    <link rel="stylesheet" href="../assets/css/style.css">
    <link rel="icon" href="../assets/img/iconBelleza.png" type="image/png">
</head>
<body>

    <header class="Menu">
        <nav class="nav">
            <p class="principal nav-link"> SKINCARE</p>
            <ul class="nav-menu">
                <li class="nav-menu-item"><a href="grasa.jsp" class="nav-menu-link nav-link">PIEL GRASA</a></li>
                <li class="nav-menu-item"><a href="seca.jsp" class="nav-menu-link nav-link">PIEL SECA</a></li>
                <li class="nav-menu-item"><a href="mixta.jsp" class="nav-menu-link nav-link">PIEL MIXTA</a></li>
            </ul>
        </nav>
    </header>

        <a  href="grasa.jsp"><img src="../assets/img/flecha_atras.png" alt="atras" width="50px" height="50px"></a>
        
        <h1 id="SkinGrasa">Piel Grasa</h1>
        <p class="SkinTextGrasa"><i><b> Ingrese los precios de los productos para conocer el valor total</b></i></p>

        <form class="Form-pielGrasa">
            <label for="LimpiezaG">Limpiador:</label>
            <input type="text" class="form-control" id="LimpiezaG" name="LimpiadorGrasa"
            required placeholder="Ingrese el precio del Limpiador">
            <br><br>

            <label for="TonicoG">Tonico:</label>
            <input type="text" class="form-control" id="TonicoG" name="TonicoGrasa"
            required placeholder="Ingrese el precio del Tonico">
            <br><br>

            <label for="SerumG">Serum:</label>
            <input type="text" class="form-control" id="SerumG" name="SerumGrasa"
            required placeholder="Ingrese el precio del Serum">
            <br><br>

            <label for="CremaHidratanteG">Crema Hidratante:</label>
            <input type="text" class="form-control" id="CremaHidratanteG" name="CremaHidratanteGrasa"
            required placeholder="Ingrese el precio de la Crema Hidratante">
            <br><br>

            <label for="ProtSolarG">Protector Solar:</label>
            <input type="text" class="form-control" id="ProtSolarG" name="ProtecSolarGrasa"
            required placeholder="Ingrese el precio del Protector Solar">
            <br><br>

            <label for="DesmaquillanteG">Desmaquillante:</label>
            <input type="text" class="form-control" id="DesmaquillanteG" name="DesmaquillanteGrasa"
            required placeholder="Ingrese el precio del Desmaquillante">
            <br><br>

            <input class="BtnCalSkinGrasa" type="submit" value="Calcular">
        </form> 
 
        <br>

        <hr>

        <a  href="seca.jsp"><img src="../assets/img/flecha_atras.png" alt="atras" width="50px" height="50px"></a>
        
        <h1 id="SkinSeca">Piel Seca</h1>
        <p class="SkinTextSeca"><i><b> Ingrese los precios de los productos para conocer el valor total</b></i></p>

        <form class="Form-pielSeca">
            <label for="LimpiezaS">Limpiador Cremoso:</label>
            <input type="text" class="form-control" id="LimpiezaS" name="LimpiadorSeca"
            required placeholder="Ingrese el precio del Limpiador">
            <br><br>

            <label for="ExfolianteS">Exfoliante Facial:</label>
            <input type="text" class="form-control" id="ExfolianteS" name="ExfolianteSeca"
            required placeholder="Ingrese el precio del Exfoliante">
            <br><br>

            <label for="CremaHidratanteS">Crema Hidratante:</label>
            <input type="text" class="form-control" id="CremaHidratanteS" name="CremaHidratanteSeca"
            required placeholder="Ingrese el precio de la Crema Hidratante">
            <br><br>
            
            <label for="AceiFacialS">Aceite Facial:</label>
            <input type="text" class="form-control" id="AceiFacialS" name="SerumSeca"
            required placeholder="Ingrese el precio del Aceite Facial ">
            <br><br>

            <label for="ProtSolarS">Protector Solar:</label>
            <input type="text" class="form-control" id="ProtSolarS" name="ProtecSolarSeca"
            required placeholder="Ingrese el precio del Protector Solar">
            <br><br>

            <label for="DesmaquillanteS">Desmaquillante:</label>
            <input type="text" class="form-control" id="DesmaquillanteS" name="DesmaquillanteSeca"
            required placeholder="Ingrese el precio del Desmaquillante">
            <br><br>

            <input class="BtnCalSkinSeca" type="submit" value="Calcular">
        </form> 
 
        <br>

        <hr>

        <a  href="mixta.jsp"><img src="../assets/img/flecha_atras.png" alt="atras" width="50px" height="50px"></a>
        
        <h1 id="SkinMixta">Piel Mixta</h1>
        <p class="SkinTextMixta"><i><b> Ingrese los precios de los productos para conocer el valor total</b></i></p>

        <form class="Form-pielMixta">
            <label for="LimpiezaM">Limpiador:</label>
            <input type="text" class="form-control" id="LimpiezaM" name="LimpiadorMixta"
            required placeholder="Ingrese el precio del Limpiador">
            <br><br>

            <label for="ExfolianteM">Exfoliante:</label>
            <input type="text" class="form-control" id="ExfolianteM" name="ExfolianteMixta"
            required placeholder="Ingrese el precio del Exfoliante">
            <br><br>

            <label for="MascarillaM">Mascarilla:</label>
            <input type="text" class="form-control" id="MascarillaM" name="MascarillaMixta"
            required placeholder="Ingrese el precio de la Mascarilla ">
            <br><br>

            <label for="HidratanteM">Hidratante:</label>
            <input type="text" class="form-control" id="HidratanteM" name="HidratanteMixta"
            required placeholder="Ingrese el precio del Hidratante">
            <br><br>

            <label for="ContornOjosM">Contorno de ojos:</label>
            <input type="text" class="form-control" id="ContornOjosM" name="ContornOjosMixta"
            required placeholder="Ingrese el precio del Contorno de ojos">
            <br><br>

            <label for="SeruM">Serum:</label>
            <input type="text" class="form-control" id="SeruM" name="SeruMixta"
            required placeholder="Ingrese el precio del Serum">
            <br><br>

            <label for="ProtSolarM">Protector Solar:</label>
            <input type="text" class="form-control" id="ProtSolarM" name="ProtecSolarMixta"
            required placeholder="Ingrese el precio del Protector Solar">
            <br><br>

            <label for="DesmaquillanteM">Desmaquillante:</label>
            <input type="text" class="form-control" id="DesmaquillanteM" name="DesmaquillanteMixta"
            required placeholder="Ingrese el precio del Desmaquillante">
            <br><br>

            <input class="BtnCalSkinMixta" type="submit" value="Calcular">
        </form> 
 
        <br>
        
    
</body>
</html>
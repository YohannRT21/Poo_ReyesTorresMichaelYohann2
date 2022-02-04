function validar(formulario){
    //quiero validar el tamaño del nombre
    if(formulario.nombre.value.length <5){
        alert("Escriba por lo menos 6 caracteres en el campo nombre")
        formulario.nombre.focus();
        return(false);
    }

    var checkOK = "QWERTYUIOPASDFGHJKLÑZXCVBNM"+"qwertyuiopasdfghjklñzxcvbnm";
    var checkStr = formulario.nombre.value;
    var allvaid = true;

    for(var i = 0; i < checkStr.length; i++){
        var ch = checkStr.charAt(i);
        
            for(var j = 0; j < checkOK.length; j++){
                if(ch == checkOK.charAt(j))
                break;
        }    
                if(j == checkOK.length){
                    allvaid = false;
                    break;
                }
    }
    if(!allvaid){
        alert("Escribe solo letras en el campo Nombre");
        formulario.nombre.focus();
        return(false);
    }
}
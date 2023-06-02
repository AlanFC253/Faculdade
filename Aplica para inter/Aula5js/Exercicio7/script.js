document.querySelector("#btn")
.addEventListener("click",function(){

    let altura = Number(document.querySelector("#altura").value);
    let peso = Number(document.querySelector("#peso").value);
    let imc =peso/(altura*altura);
    let select = document.querySelector("#sexo");
	let codigo = select.options[select.selectedIndex].value;
    console.log(imc)
    if(codigo=="Homen"){
        Homens(imc);
    }else{
        Mulheres(imc)
    }     
})

function Homens(imc){
    if(imc < 20.7){
        document.querySelector("#txt").innerHTML="Abaixo do peso:<br>"+imc.toFixed(1);
    }else{
        if(imc>=20.7 && imc <= 26.4){
            document.querySelector("#txt").innerHTML="No peso normal <br>:"+imc.toFixed(1);
        }else{
            if(imc>26.4 && imc<=27.8){
                document.querySelector("#txt").innerHTML="Marginalmente acima do peso <br>:"+imc.toFixed(1);
            }else{
                if(imc>27.8 && imc<= 31.1){
                    document.querySelector("#txt").innerHTML="Acima do peso ideal:<br>"+imc.toFixed(1);
                }else{
                    if(imc >31.1){
                        document.querySelector("#txt").innerHTML="Obeso::<br><br>"+imc.toFixed(1);
                    }
                }
            }
        }
    }
}

function Mulheres(imc){
    if(imc < 19.1){
        document.querySelector("#txt").innerHTML="Abaixo do peso:<br>"+imc.toFixed(1);
    }else{
        if(imc>=19.1 && imc <= 25.81){
            document.querySelector("#txt").innerHTML="No peso normal:<br>"+imc.toFixed(1);
        }else{
            if(imc>25.8 && imc<=27.3){
                document.querySelector("#txt").innerHTML="Marginalmente acima do peso:<br>"+imc.toFixed(1);
            }else{
                if(imc>27.3 && imc<= 32.3){
                    document.querySelector("#txt").innerHTML="Acima do peso ideal:<br>"+imc.toFixed(1);
                }else{
                    if(imc >32.3){
                        document.querySelector("#txt").innerHTML="Obeso:<br>"+imc.toFixed(1);
                    }
                }
            }
        }
    }
}
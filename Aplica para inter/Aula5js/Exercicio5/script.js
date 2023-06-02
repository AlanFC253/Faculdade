document.querySelector("#btn")
.addEventListener("click",function(){
    let nota1=Number(document.querySelector("#nota1").value);
    let nota2=Number(document.querySelector("#nota2").value);
    let nota3=Number(document.querySelector("#nota3").value);
    let resultado=(nota1+nota2+nota3)/3;
    console.log(resultado);

    if(resultado>=6){
        document.querySelector("#txt").innerHTML="Aprovado";
    }else{
        if(resultado>=3 && resultado<6){
            document.querySelector("#txt").innerHTML="Exame";
        }else{
            document.querySelector("#txt").innerHTML="Reprovado";
        }
    }

})
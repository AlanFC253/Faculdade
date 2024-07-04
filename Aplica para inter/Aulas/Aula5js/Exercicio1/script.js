"use strict"

let button = document.getElementById("botao");

button.addEventListener("click", ()=>
{
    
    let valor =Number(document.getElementById("valor").value); 
    let parcelas =Number(document.getElementById("parcelas").value);
    console.log(parcelas);
    if(parcelas==1){
        alert("O valor ficara o mesmo")
    }else if(parcelas = 2){
        valor=valor+(valor*3/100)
        valor=valor/parcelas
        alert("O valor de cada parcela sera:"+valor)
    }else{
        valor=valor+(valor*7/100)
        valor=valor/parcelas
        alert("O valor de cada parcela sera:"+valor)
        }
    }
)


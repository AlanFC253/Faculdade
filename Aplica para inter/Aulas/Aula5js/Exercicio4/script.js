let btn=document.querySelector("#btn")
.addEventListener( "click",function(){
    let base=Number(document.querySelector("#base").value);
    let altura=Number(document.querySelector("#altura").value);
    let retangulo= base*altura;
    document.querySelector("#txt").innerHTML=retangulo;
    }
)
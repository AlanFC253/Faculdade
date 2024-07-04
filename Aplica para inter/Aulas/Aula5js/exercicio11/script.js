
document.querySelector("#btn").addEventListener("click",function(){
    numero=Number(document.querySelector("#numero").value);
    document.querySelector("#txt").value=Conta(numero);
})

function Conta(n){
    var soma=0;
    for(let i=1;i<=n;i++){
        soma=soma+i      
    } 
    return soma;
}


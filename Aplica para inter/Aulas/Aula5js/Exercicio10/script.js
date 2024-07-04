document.querySelector("#btn").addEventListener("click",function(){
    let numero=Number(document.querySelector("#numero").value);
    let conta=1;
    for(let i=1;i<=numero;i++){
        conta=i*conta;
    }
    document.querySelector("#txt").value=conta;
})
let botao1=document.querySelector("#b1")
let botao2=document.querySelector("#b2")


botao1.addEventListener("click",function(){
    let saida=document.querySelector("#saida")
    let entrada=document.querySelector("#txt_texto").value
    saida.innerHTML=`<p>${entrada.toUpperCase()}</p>`
})

botao2.addEventListener("click",function(){
    let saida=document.querySelector("#saida")
    let entrada=document.querySelector("#txt_texto").value
    let conteudo=""

   
    for(let i=0;i<entrada.length;i++){
    conteudo+=`${entrada[i]}<br>`
}
    
    saida.innerHTML=conteudo
})
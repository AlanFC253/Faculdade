document.querySelector("#btn").addEventListener("click",function(){
    let qtdLinhas = Number(document.querySelector("#qtdlinhas").value)
    let qtdColunas = Number(document.querySelector("#qtdcolunas").value)
    

    let saida=document.querySelector("#saida")
    let table=``
    let i=1
    
    while(i<=qtdLinhas){
        table+=`<tr>`
        let j=1
        while(j<=qtdColunas){
            if((j%2)==0){
                table+=`<td class="par"> ${i},${j} </td>`
                j++            
            }else{
                table+=`<td class="impar"> ${i},${j} </td>`
                j++
            }
    }
    table+=`</tr>`
    i++

    }
    saida.innerHTML=`<table>${table}</table>`;
   
})

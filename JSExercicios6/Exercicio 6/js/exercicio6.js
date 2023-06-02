let nome =[]
let rgm =[]
let notaParcial=[]
let notaExercício=[]
let notaProjeto=[]
let notaRegimental=[]
let media=[]
let qualificação=[]
let a=0

document.querySelector("#btn1").addEventListener("click",function(){
    nome[a]=document.querySelector("#nome").value
    rgm[a]=document.querySelector("#rgm").value
    notaParcial[a]=Number(document.querySelector("#nota_parc").value)
    notaExercício[a]=Number(document.querySelector("#nota_exer").value)
    notaRegimental[a]=Number(document.querySelector("#nota_regi").value)
    notaProjeto[a]=Number(document.querySelector("#nota_proj").value)
    media[a]=Number(notaParcial[a]+notaExercício[a]+notaProjeto[a]+notaRegimental[a])
    if(media[a]<1){
        qualificação[a]=`<td class="vermelho">reprovado</td>`
    }else if(media[a]>=2 && media[a]<6){
        qualificação[a]=`<td class="amarelo">prova</td>`
    }else{
        qualificação[a]=`<td class="verde">Passou</td>`
    }
    document.querySelector("#nome").value=""
    document.querySelector("#rgm").value=""
    document.querySelector("#nota_parc").value=""
    document.querySelector("#nota_exer").value=""
    document.querySelector("#nota_regi").value=""
    document.querySelector("#nota_proj").value="" 
    a++
})

document.querySelector("#btn2").addEventListener("click",function(){
    let resposta=document.querySelector("#resposta")
    resposta.innerHTML+=`<tr><th>Nome</th><th>RGM</th><th>Nota Parcial</th><th>Nota Exericio</th><th>notaRegimental</th><th>notaProjeto</th><th>Media</th><th>Qualificação</th></tr>`
    for (let i = 0; i <= a-1; i++) { 
        resposta.innerHTML+=`
        <tr>
        <td>${nome[i]}</td>
        <td>${rgm[i]}</td>
        <td>${notaParcial[i]}</td>
        <td>${notaExercício[i]}</td>
        <td>${notaRegimental[i]}</td>
        <td>${notaProjeto[i]}</td>
        <td>${media[i]}</td>
        ${qualificação[i]}
        </tr>`
    }    
})


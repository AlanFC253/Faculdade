let botao1=document.querySelector("#btn1");
let botao2=document.querySelector("#btn2");
let botao3= document.querySelector("#btn3");
let timer=0;
let inicial = 0;

botao1.addEventListener("click", function(){
    exibirDiv("divCronometro")
    if(timer ==0){
        timer = setInterval(function(){
            inicial++
            document.querySelector("#txtNum").innerHTML=inicial;
        },100);
    }
})

botao2.addEventListener("click", function(){
    exibirDiv("divSlide")
})

let contImagem = 1;

document.querySelector("#ant").addEventListener("click",function(){
    if (contImagem>1){
        contImagem--;
    }else{
        contImagem =5;
    }
    exibirImagem();
})

document.querySelector("#prox").addEventListener("click",function(){
    if (contImagem<5){
        contImagem++;
    }else{
        contImagem=1;
    }
    exibirImagem();
})

function exibirImagem(){
    let img = `img${contImagem}.jpg`  
    document.querySelector("#imagens").src = `imagens/${img}`;
}

botao3.addEventListener("click", function(){
    exibirDiv("divTabuada")
})

document.querySelector("#btntab").addEventListener("click",function(){
    let x=Number(document.querySelector("#txtNumTab").value);
    let tabuada=" ";
        for(let i = 0;i<=11;i++){
            tabuada+=`${x} X ${i} = ${x*i}<br>`
        }
    document.querySelector("#restab").innerHTML=tabuada;
})

function exibirDiv(div){
    let tagsdiv = document.querySelectorAll("div");
    for (let i = 0 ;i <tagsdiv.length;i++){
        if(tagsdiv[i].id.indexOf("div")>=0){
            if(tagsdiv[i].id==div){
                tagsdiv[i].style.display="block"
            }else{
                tagsdiv[i].style.display="none"
            }
        }
    }
}


function Soma(event){
    let num1=Number(document.querySelector("#num1").value)
    let num2=Number(document.querySelector("#num2").value)
    let conta=num1+num2
    document.querySelector("#resultado").value=conta
}

function Subtração(event){
    let num1=Number(document.querySelector("#num1").value)
    let num2=Number(document.querySelector("#num2").value)
    let conta=num1-num2
    document.querySelector("#resultado").value=conta
}

function Multiplicacao(event){
    let num1=Number(document.querySelector("#num1").value)
    let num2=Number(document.querySelector("#num2").value)
    let conta=num1*num2
    document.querySelector("#resultado").value=conta
}

function Divisao(event){
    let num1=Number(document.querySelector("#num1").value)
    let num2=Number(document.querySelector("#num2").value)
    
    if(num1==0){
    document.querySelector("#resultado").value="ERRO, VALO INVALIDO"
    }else{
    let conta=num1/num2
    document.querySelector("#resultado").value=conta
    }
}
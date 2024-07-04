let btn=document.querySelector("#btn");

btn.addEventListener("click",function(){
    let input1=Number(document.querySelector("#input1").value);
    let input2=Number(document.querySelector("#input2").value);
    let txt = document.querySelector("#txt");

    if(input1>input2){
        txt.innerHTML=`${input1} é maior quer ${input2}`;
    }else{
        if(input1<input2){
            txt.innerHTML=`${input2} é maior quer ${input1}`;
        }else{
            if(input1==input2){
                txt.innerHTML=`Os numeros são iguais`;
            }else{
                txt.innerHTML=`valor invalido`;
            }
        }
    }
})
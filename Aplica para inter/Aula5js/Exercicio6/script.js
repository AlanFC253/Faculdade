document.querySelector("#btn")
.addEventListener("click",function(){

    let preço=Number(document.querySelector("#preço").value);
    let select = document.querySelector("#select");
	let codigo = select.options[select.selectedIndex].value;
    console.log(codigo)
   
    switch(codigo){
        case "1":
            resultado= preço-(preço*10/100);
            document.querySelector("#txt").innerHTML=resultado;
        case "2":
            resultado= preço-(preço*5/100);
            document.querySelector("#txt").innerHTML=resultado;
        case "3":
            resultado= preço+(preço*10/100);
            document.querySelector("#txt").innerHTML=resultado;
    }
})


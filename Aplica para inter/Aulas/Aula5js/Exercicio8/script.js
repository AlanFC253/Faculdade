document.querySelector("#btn").
addEventListener("click", function(){
    let salario = Number(document.querySelector("#salario").value);

    if(salario<1434){
        document.querySelector("#imposto").value=salario
    }else{
        if(salario>=1434 && salario<2150){
            document.querySelector("#imposto").value=salario+(salario*7.5/100)
        }else{
            if(salario>=2150 && salario<2866){
                document.querySelector("#imposto").value=salario+(salario*15/100)
            }else{
                if(salario>=2866 && salario<3582){
                    document.querySelector("#imposto").value=salario+(salario*22.5/100)
                }else{
                    document.querySelector("#imposto").value=salario+(salario*27.5/100)
                }
            }
        }
    }
    
})
  

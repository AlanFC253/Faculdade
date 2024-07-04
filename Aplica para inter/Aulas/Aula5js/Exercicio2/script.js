"use strict"
let btn = document.querySelector("#btn");
btn.addEventListener("click", function(event){   
    let txt1 =Number(document. querySelector("#txt1").value);
    parOUimpar(txt1)
    });


    function parOUimpar(t){
        if(t%2==0){
            document.querySelector("#txt2").innerHTML="par";
        }else{
            document.querySelector("#txt2").innerHTML="impar";
        }
    }

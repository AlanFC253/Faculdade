window.onload=function(){

let botoes=document.querySelectorAll("button");
var visor =document.querySelector(".visor_input");



for(let i=0;i<botoes.length;i++){

  botoes[i].addEventListener("click",function(){
    let x = visor.value
    if(this.value=="="){
      visor.value=eval(visor.value);
    }else if(this.value=="C"){
      visor.value="";
    }else if(this.value=="pow"){
      let x = visor.value
      visor.value=""
        document.querySelector("#btn_igual").addEventListener("click",function() {
          let y=visor.value
          visor.value=Math.pow(x,y)
        })
    }else if(this.value=="round"){
      visor.value=Math.round(visor.value)
    }else if(this.value=="sqrt"){
      visor.value=Math.sqrt(visor.value)
    }else{
      visor.value+= this.value;
    }
  })
}
}

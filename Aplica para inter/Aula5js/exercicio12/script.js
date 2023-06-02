let num = Math.round(Math.random()*100)
let numeroDoUsuario=0
let i=1
while(num!=numeroDoUsuario){
    numeroDoUsuario=prompt("que numero to pensando?")
    if(num==numeroDoUsuario){
        alert("Boa! Você precisou de "+i+" tentativas para conseguir acertar!")
    }else{
        if(confirm("Errou, tenta denovo?")==true){
            i++
            continue
        }else{
            break
        }
    }
}

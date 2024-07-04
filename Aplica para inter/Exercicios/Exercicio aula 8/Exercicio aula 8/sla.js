let idade =[]
let idadeTotal
let idadeP
let a = true

while (a) {
    idadeP=prompt("sdasdasd")
    if (idadeP>=0) {
        idade.push(idadeP)
    }else if (idadeP =="n"||idadeP=="N") {
    a=false
    }
}

console.log(idade)
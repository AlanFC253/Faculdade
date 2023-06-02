window.onload = function() {
    let i = 0;
    var name = "";
    let comfirma=true;
    
            while (name != null) {
                if(comfirma==true)
                {i = i += 1;
                var name = prompt("Insira o nome");
                inserirow();}
                else{
                    break
                }
                comfirma=confirm("Deseja continuar?")
            }
    
            function inserirow() {
               
                let table = document.getElementById("Table");
                let row = table.insertRow(-1);
                let namecell1 = row.insertCell(-1);
                let namecell2 = row.insertCell(0);
                namecell1.innerHTML = name;
                namecell2.innerHTML = i;
        }

    }

function getJson(cep) {
            
    var cep = document.getElementById("cep").value;
       
        $.getJSON(`https://viacep.com.br/ws/${cep}/json/`, function(data){
        
        var rua = data.logradouro;
        var bairro = data.bairro;
        var cidade = data.localidade;
        var estado = data.uf;
        var erro = data.erro;
        
        if(erro){
            document.getElementById("rua").value = "";
            document.getElementById("bairro").value = "";
            document.getElementById("cidade").value = "";
            document.getElementById("estado").value = "";
            alert("CEP INVALIDO!");
        }else{
            document.getElementById("rua").value = rua;
            document.getElementById("bairro").value = bairro;
            document.getElementById("cidade").value = cidade;
            document.getElementById("estado").value = estado;
        }                
    });
                    
}
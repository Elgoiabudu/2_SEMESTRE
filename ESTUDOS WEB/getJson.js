function getJson() {
            
    var cep = document.getElementById("cep").value;

        if (cep == "" || cep.length != 8) {
            alert("Digite o CEP!");
            document.getElementById("cep").focus();
            return false;
        }
       
        $.getJSON(`https://viacep.com.br/ws/${cep}/json/`, function(data){
        
        var rua = data.logradouro;
        var bairro = data.bairro;
        var cidade = data.localidade;
        var estado = data.uf;
        var erro = data.erro;
        
        if(erro){
            alert("CEP INVALIDO!");
            document.getElementById("rua").value = "";
            document.getElementById("bairro").value = "";
            document.getElementById("cidade").value = "";
            document.getElementById("estado").value = "";
            document.getElementById("cep").value = "";
            document.getElementById("cep").focus();
        }else{
            document.getElementById("rua").value = rua;
            document.getElementById("bairro").value = bairro;
            document.getElementById("cidade").value = cidade;
            document.getElementById("estado").value = estado;
        }                
    });
                    
}
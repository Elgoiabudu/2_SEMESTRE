function getJson() {
            
    var cep = document.getElementById("cep").value;
       
        $.getJSON(`https://viacep.com.br/ws/${cep}/json/`, function(data){
        
        var rua = data.logradouro;
        var bairro = data.bairro;
        var cidade = data.localidade;
        var erro = data.erro;
        
        if(erro == "true"){
            document.getElementById("rua").value = "";
            document.getElementById("bairro").value = "";
            document.getElementById("cidade").value = "";
            alert("CEP INVALIDO!");
        }else{
            document.getElementById("rua").value = rua;
            document.getElementById("bairro").value = bairro;
            document.getElementById("cidade").value = cidade;
        }                
    });

                    
}


function estados() {
    var estados = [
            {nome: "Acre", sigla: "AC"},
            {nome: "Alagoas", sigla: "AL"},
            {nome: "Amapa", sigla: "AP"},
            {nome: "Amazonas", sigla: "AM"},
            {nome: "Bahia", sigla: "BA"},
            {nome: "Ceara", sigla: "CE"},
            {nome: "Distrito Federal", sigla: "DF"},
            {nome: "Espirito Santo", sigla: "ES"},
            {nome: "Goias", sigla: "GO"},
            {nome: "Maranhao", sigla: "MA"},
            {nome: "Mato Grosso", sigla: "MT"},
            {nome: "Mato Grosso do Sul", sigla: "MS"},
            {nome: "Minas Gerais", sigla: "MG"},
            {nome: "Para", sigla: "PA"},
            {nome: "Paraiba", sigla: "PB"},
            {nome: "Parana", sigla: "PR"},
            {nome: "Pernambuco", sigla: "PE"},
            {nome: "Piaui", sigla: "PI"},
            {nome: "Rio de Janeiro", sigla: "RJ"},
            {nome: "Rio Grande do Norte", sigla: "RN"},
            {nome: "Rio Grande do Sul", sigla: "RS"},
            {nome: "Rondonia", sigla: "RO"},
            {nome: "Roraima", sigla: "RR"},
            {nome: "Santa Catarina", sigla: "SC"},
            {nome: "Sao Paulo", sigla: "SP"},
            {nome: "Sergipe", sigla: "SE"},
            {nome: "Tocantins", sigla: "TO"}    
        ];        

        var tamanho = estados.length;
        
        function newOption(params) {
            $("body").append("<option>Teste<option/>")
        }
        
        for (let index = 0; index < estados.length; index++) {  

            console.log(estados[index].nome);

        }

}
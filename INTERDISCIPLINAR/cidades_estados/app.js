function carregar_cidade(uf) {
    
    if (uf == "") {
        let conteudo = '<select name="cidades" id="cidades"><option>SELECIONE UM ESTADO</option></select>';
        $("#lista").html(conteudo);
    }else{
        let url_estados = `https://servicodados.ibge.gov.br/api/v1/localidades/estados/${uf}/distritos`;
    
        $.getJSON(url_estados, function(data){
    
            let conteudo;
            $.each(data, function(v, val) {
            conteudo += `<option value="${val.nome}">${val.nome}</option>`;
            });    
    
            
            $("#lista").html(conteudo);
        });    
        console.log(uf);        
    }
    
}

function capturar(cidade) {
    
    cid = document.getElementById(cidade);    

    console.log(cid);
}
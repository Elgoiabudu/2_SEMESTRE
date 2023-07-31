function cnpj(v) {
    v = v.replace(/\D/g, "")                           //Remove tudo o que não é dígito
    v = v.replace(/^(\d{2})(\d)/, "$1.$2")             //Coloca ponto entre o segundo e o terceiro dígitos
    v = v.replace(/^(\d{2})\.(\d{3})(\d)/, "$1.$2.$3") //Coloca ponto entre o quinto e o sexto dígitos
    v = v.replace(/\.(\d{3})(\d)/, ".$1/$2")           //Coloca uma barra entre o oitavo e o nono dígitos
    v = v.replace(/(\d{4})(\d)/, "$1-$2")              //Coloca um hífen depois do bloco de quatro dígitos
    return v
}

function cpf(id) {
    var v = document.getElementById(id).value;

    v = v.replace(/\D/g, "")                    //Remove tudo o que não é dígito
    v = v.replace(/(\d{3})(\d)/, "$1.$2")       //Coloca um ponto entre o terceiro e o quarto dígitos
    v = v.replace(/(\d{3})(\d)/, "$1.$2")       //Coloca um ponto entre o terceiro e o quarto dígitos
    //de novo (para o segundo bloco de números)
    v = v.replace(/(\d{3})(\d{1,2})$/, "$1-$2") //Coloca um hífen entre o terceiro e o quarto dígitos

    document.getElementById(id).value = v;
}

const getCPF = (event) => {
    let input = event.target;
    input.value = cpfMask(input.value);
}

const cpfMask = (v) => {
    v = v.replace(/\D/g, "")                    //Remove tudo o que não é dígito
    v = v.replace(/(\d{3})(\d)/, "$1.$2")       //Coloca um ponto entre o terceiro e o quarto dígitos
    v = v.replace(/(\d{3})(\d)/, "$1.$2")       //Coloca um ponto entre o terceiro e o quarto dígitos
    //de novo (para o segundo bloco de números)
    v = v.replace(/(\d{3})(\d{1,2})$/, "$1-$2") //Coloca um hífen entre o terceiro e o quarto dígitos
    return v
}

const handlePhone = (event) => {
    let input = event.target
    input.value = phoneMask(input.value)
}

const phoneMask = (value) => {
    if (!value) return ""
    value = value.replace(/\D/g, '')
    value = value.replace(/(\d{2})(\d)/, "($1) $2")
    value = value.replace(/(\d)(\d{4})$/, "$1-$2")
    return value
}

function mudarEstado(el, btn) {
    var display = document.getElementById(el).style.display;    
    do {
        var display = document.getElementById(el).style.display;
        if (display == "none") {
            document.getElementById(el).style.display = 'block';
            document.getElementById(btn).style.display = 'none';            
        } else {
            document.getElementById(el).style.display = 'none';
            document.getElementById(btn).style.display = 'block';            
        }
    } while (display == "");


}

function visivel(el) {
    var display = document.getElementById(el).style.display;
    document.getElementById(el).style.display = 'block';
}

function removerAcentos(newStringComAcento) {
    var string = newStringComAcento;
    var mapaAcentosHex = {
        a: /[\xE0-\xE6]/g,
        e: /[\xE8-\xEB]/g,
        i: /[\xEC-\xEF]/g,
        o: /[\xF2-\xF6]/g,
        u: /[\xF9-\xFC]/g,
        c: /\xE7/g,
        n: /\xF1/g
    };

    for (var letra in mapaAcentosHex) {
        var expressaoRegular = mapaAcentosHex[letra];
        string = string.replace(expressaoRegular, letra);
    }

    return string;
}

function getCEP(cep, id) {

    $.getJSON(`https://viacep.com.br/ws/${cep}/json/`, function (data) {

        try {

            var rua = data.logradouro;
            var bairro = data.bairro;
            var cidade = data.localidade;
            var estado = data.uf;

            var erro = data.erro;

            document.getElementById("rua_" + id).value = rua.toUpperCase();
            document.getElementById("bairro_" + id).value = bairro.toUpperCase();
            document.getElementById("cidade_" + id).value = cidade.toUpperCase();
            document.getElementById("estado_" + id).value = estado;

            // if (erro) {
            //     alert("CEP Invalido!");
            // }else{
            // }
        } catch (error) {
            alert("CEP Invalido!");
            document.getElementById("cep_" + id).value = "";
            document.getElementById("rua_" + id).value = "";
            document.getElementById("bairro_" + id).value = "";
            document.getElementById("cidade_" + id).value = "";
            document.getElementById("estado_" + id).value = "";
        }
    });
}

function anoSerie(valor, id) {
    var alvo = document.getElementById(id);

    if (valor < 1 || valor > 9) {
        alert("VALOR INVALIDO!");
        alvo.value = "";
    }
}

function reset(elemento) {
    var form = document.getElementById(elemento);
    form.reset();
}

function serial(id){
    var dados = $(id).serialize();
    alert(dados);
}
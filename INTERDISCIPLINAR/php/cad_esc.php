<?php

function semAcento($texto){
    return preg_replace(array("/(á|à|ã|â|ä)/",
    "/(Á|À|Ã|Â|Ä)/",
    "/(é|è|ê|ë)/",
    "/(É|È|Ê|Ë)/",
    "/(í|ì|î|ï)/",
    "/(Í|Ì|Î|Ï)/",
    "/(ó|ò|õ|ô|ö)/",
    "/(Ó|Ò|Õ|Ô|Ö)/",
    "/(ú|ù|û|ü)/",
    "/(Ú|Ù|Û|Ü)/","/(ñ)/","/(Ñ)/"),
    explode(" ","a A e E i I o O u U n N"),$texto);
}



Include 'conexao.php';

$nome_esc = strtoupper($_POST["nome_esc"]);
$cod_esc = $_POST["cod_esc"];
$cep_esc = $_POST["cep_esc"];
$rua_esc = semAcento($_POST["rua_esc"]);
$bairro_esc = semAcento($_POST["bairro_esc"]);
$cidade_esc = semAcento($_POST["cidade_esc"]);
$estado_esc = $_POST["estado_esc"];
$num_esc = $_POST["num_esc"];

$sql = mysql_query("select * from tb_escolas where cod_esc = '$cod_esc'");    

if (mysql_num_rows($sql) > 0) {
    echo "<script>
            alert('ESCOLA JA CADASTRADA!');
            window.location.href = 'cadastro.html';
        </script>";
}else{
    $sql = mysql_query("insert into tb_escolas 
    (
        nome_esc,
        cod_esc,
        cep_esc,
        rua_esc,
        bairro_esc,
        cidade_esc,
        estado_esc,
        num_esc
    )
    values
    (
        '$nome_esc',
        '$cod_esc',
        '$cep_esc',
        '$rua_esc',
        '$bairro_esc',
        '$cidade_esc',
        '$estado_esc',
        '$num_esc'
    )"
    );
}

?>
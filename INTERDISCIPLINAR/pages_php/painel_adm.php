<?php 
Include '../php/conexao.php';
$query_estados = mysql_query("SELECT * FROM municipio");
?>


<!DOCTYPE html>
<html lang="pt-br">
<head>    
    <link rel="stylesheet" href="../css/index.css">      
    <script src="../js/functions.js"></script>        
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.3/jquery.min.js"></script>
    
    <title>NOTEx - Cadastros</title>

</head>
<body>
    <div class="header">
        
        <div class="item">
            <h1>NOTEx / Cadastros / Escolas e Usuarios</h1>                             
        </div>
        
        <div class="item">
            <input type="button" class="btn" value="Voltar">                    
        </div>

    </div>

    <div id="menu-superior" class="menu-superior">
        
        <input type="button" class="btn_serv" 
        id="btn-cad-esc" onclick="mudarEstado('cad_esc', 'menu-superior')" 
        value="CADASTRAR ESCOLA">
        
        <input type="button" class="btn_serv" 
        id="btn-cad-user" onclick="mudarEstado('cad_user','menu-superior')" 
        value="CADASTRAR USUARIO">        

    </div>

    <div class="container-index">       
        <div id="cad_esc" class="item-index">
        <div class="sair">
            <input type="reset" class="btn-sair" onclick="mudarEstado('cad_esc', 'menu-superior')" value="X">
        </div>
        <h2>CADASTRAR ESCOLA</h2>
            <form action="../php/cad_esc.php" method="post" class="login">                                                                            
                    <fieldset>
                        <legend>Dados de cadastro</legend>
                        <input type="text" name="nome_esc" id="nome_esc" class="text-index"  placeholder="DIGITE O NOME DA ESCOLA" required>
                        <input type="number" name="cod_esc" class="text-index" placeholder="COD. ESCOLA" required>
                    </fieldset>
                    <fieldset>
                        <legend>Endereco</legend>
                        <input type="text" name="cep_esc" id="cep_esc" class="text-index" placeholder="Digite o CEP" onfocusout="getCEP(this.value, 'esc')">
                        <input type="text" name="rua_esc" id="rua_esc" class="text-index" placeholder="Rua" readonly>
                        <input type="text" name="bairro_esc" id="bairro_esc" class="text-index" placeholder="Bairro" readonly>
                        <input type="text" name="cidade_esc" id="cidade_esc" class="text-index" placeholder="Cidade" readonly>                    
                        <input type="text" name="estado_esc" id="estado_esc" class="text-index" placeholder="Estado" readonly>
                        <input type="number" name="num_esc" id="num_esc" class="text-index" placeholder="Numero" min="1">
                    </fieldset>                                          
                    <div>
                        <input type="submit" class="btn" value="Cadastrar">                    
                        <input type="reset" class="btn" onclick="mudarEstado('cad_esc', 'menu-superior')" value="Cancelar">
                    </div>                    
            </form>
        </div>
        <div id="cad_user" class="item-index">
            <div class="sair">
            <input type="reset" class="btn-sair" onclick="mudarEstado('cad_user','menu-superior')" value="X">
            </div>
            <h2>CADASTRAR USUARIO</h2>
            <form action="#" class="login">   
                    <fieldset>
                        <legend>Dados Pessoais</legend>
                        <input type="text" name="nome" class="text-index" maxlength="50" placeholder="DIGITE O NOME DO USUARIO"  required>
                        <input type="text" name="sobrenome" class="text-index" maxlength="50" placeholder="DIGITE O SOBRENOME DO USUARIO" required>
                        <input type="email" class="text-index" maxlength="50" placeholder="DIGITE O EMAIL DO USUARIO" required>
                        <input type="text" name="cpf" id="cpf" class="text-index" 
                        maxlength="14" onkeyup="getCPF(event)" placeholder="DIGITE O CPF DO USUARIO" required>
                        <input type="tel" name="tel" class="text-index" 
                        maxlength="15" onkeyup="handlePhone(event)" placeholder="DIGITE O TELEFONE DO USUARIO" required>
                    </fieldset>   
                    <fieldset>
                        <legend>Endereco</legend>
                        <input type="text" name="cep_user" id="cep_user" class="text-index" placeholder="Digite o CEP" onfocusout="getCEP(this.value, 'user')">
                        <input type="text" name="rua_user" id="rua_user" class="text-index" placeholder="Rua" disabled>
                        <input type="text" name="bairro_user" id="bairro_user" class="text-index" placeholder="Bairro" disabled>
                        <input type="text" name="cidade_user" id="cidade_user" class="text-index" placeholder="Cidade" disabled>                    
                        <input type="text" name="estado_user" id="estado" class="text-index" placeholder="Estado" disabled>
                        <input type="number" name="num_user" id="num_user" class="text-index" placeholder="Numero">
                    </fieldset>
                    
                    <fieldset>
                        <legend>Dados de Acesso</legend>
                        <select name="escola" id="" class="text-index" >
                        <!-- Colocar o while com nome da escola cadastrada -->
                        </select>
                        <div>
                            <select name="usuario" id="" class="text-index">
                                <option>TIPO DE USUARIO</option>
                                <option>GESTOR</option>
                                <option>SECRETARIA</option>
                                <option>PROFESSOR COORDENADOR</option>
                                <option>PROFESSOR</option>
                            </select>  
                        </div>            
                    </fieldset>
                    <div>
                        <input type="button" class="btn" value="Cadastrar">                    
                        <input type="reset" class="btn" onclick="mudarEstado('cad_user','menu-superior')" value="Cancelar">
                    </div>
            </form>
        </div>
    </div>    
</body>
</html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>Login Usuário- SESC</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!-- Bootstrap CSS -->
        <link href="css/style.css" rel="stylesheet">
        <link href="css/bootstrap.min.css" rel="stylesheet">

    </head>
    <body>
        <div class="container"> 
            <form action="listaDependentes.jsp" method="" accept-charset="utf-8" class="form-login">
                <hl><img src="img/sescLogo.png"></hl>

                <hr>
                <h4 class="form-login-heading">Entre com CPF e Senha</h4>
                <label form="inputCPF"></label>
                <input type="cpf" id="inputEmail" class="form-control" placeholder="CPF" 
                       required autofocus>

                <label form="inputPassword"></label>
                <input type="password" id="inputPassword" class="form-control" 
                       placeholder="Senha" onkeyup="somenteNumeros(this)" required>

                <div class="checkbox">
                    <label>
                        <!--<input type="checkbox" value="recuperarSenha">Recuperar Senha-->
                        <a href="recuperaSenha.jsp" class="btn-link">Recuperar Senha</a>
                    </label>
                    <br>
                    <label>
                        <!--<input type="checkbox" value="voltar">Voltar-->
                        <a href="login.jsp" class="btn-link">Primeiro Acesso </a>
                    </label>
                </div>
                <button type="submit" class="btn btn-lg btn-primary btn-block">Entrar</button>
                <br>
                <a href="" class="btn btn-secondary btn-block">Cancelar</a>
                <hr>
            </form>
        </div>
        <script src="js/funcoes.js"></script>
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>

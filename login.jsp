<%@page contentType="text/html" pageEncoding="UTF-8"%>
﻿<!DOCTYPE html>
<html lang="pt-br">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>Primeiro Acesso - SESC</title>

        <!-- Bootstrap CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/bootstrap.css" rel="stylesheet">
    </head>

    <body>

        <div id="main" class="container">
            <hl><img src="img/sescLogo.png"></hl>
            <hr/>
            <h3 class="page-header">Primeiro Acesso</h3>
            <hr />
            <form action="index.jsp">
                <div class="row"> <!-- Pessoal -->
                    
                    <div class="form-group col-md-5">
                        <label for="lbEmail">E-MAIL</label>
                        <input type="email" class="form-control" name="email" id="email" required>
                    </div>
                    
                  <div class="form-group col-md-4">
                        <label for="lbLogin">Login(CPF)</label>
                        <input type="text" name="login" class="form-control" id="nome" required>
                    </div>


                    
                    
                    
                <hr />
                <div id="actions" class="row">
                    <div class="col-md-12">
                        <a href="index.jsp" class="btn btn-secondary">Cancelar</a>
                        <button type="submit" class="btn btn-primary"
                                >Confirmar >></button>
                    </div>
                </div>
            </form>

            <div> 
                <footer>
                    <hr >
                </footer>
            </div>
        </div>

        <!-- jQuery (necessario para os plugins Javascript do Bootstrap) -->
        <script src="js/funcoes.js"></script>
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>

</html>
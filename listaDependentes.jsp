
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>Pré-Cadastro de Associado (Dependentes) - SESC</title>

        <!-- Bootstrap CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/bootstrap.css" rel="stylesheet">
    </head>

    <body>


        <div id="main" class="container" style="margin-top: 30px">
            <hl><img src="img/sescLogo.png"></hl>
            <div id="top" class="row">
                <div class="col-sm-3">
                    <h2>Dependentes</h2>
                </div>

                <div class="col-sm-3">
                    <a href="preCadDependente.jsp" class="btn btn-primary pull-right h2">Incluir Dependente</a>
                </div>
            </div>
            <!-- /#top -->


            <hr />
            <div id="list" class="row">

                <div class="table-responsive col-md-12">
                    <table class="table table-striped" cellspacing="0" cellpadding="0">
                        <thead>
                            <tr>
                                <th>NOME</th>
                                <th>PARENTESCO</th>
                                <th class="actions">AÇÃO</th>             
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td> </td>
                                <td> </td>
                                <td class="actions">
                                    <a class="btn btn-warning btn-xs" href="#">Editar</a>
                                    <a class="btn btn-danger btn-xs" href="#" data-toggle="modal" data-target="#delete-modal">Excluir</a>
                                </td>
                            </tr>

                        </tbody>
                    </table>
                </div>

            </div>
            <!-- /#list -->
            <hr />

            <div id="actions" class="row">
                <div class="col-md-12">

                    <a href="cadastro.jsp" class="btn btn-primary">Proximo >> </a>

                </div>

            </div>
            <!-- /#main -->


        </div>

        <!-- jQuery (necessario para os plugins Javascript do Bootstrap) -->
        <script src="js/funcoes.js"></script>
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>

</html>

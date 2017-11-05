
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>Pré-Cadastro de Associado (Usuário) - SESC</title>

        <!-- Bootstrap CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/bootstrap.css" rel="stylesheet">
    </head>

    <body>
        <div id="main" class="container">
            <hl><img src="img/sescLogo.png"></hl>
            <hr/>
            <h3 class="page-header">Pré-Cadastro de Dependente</h3>
            <hr />
            <form action="#">
                <div class="row"> <!-- Pessoal -->
                        <div class="form-group col-md-5">
                            <label for="lbCpf">CPF</label>
                            <input type="text" name="cpf" class="form-control" 
                                   onkeyup="somenteNumeros(this)" id="cpf" required>
                        </div>

                        <div class="form-group col-md-7">
                            <label for="lbNome">NOME</label>
                            <input type="text" name="nome" class="form-control" id="nome" required>
                        </div>

                        <div class="form-group col-md-4">
                            <label for="lbDtNascimento">DATA DE NASCIMENTO</label>
                            <input type="text" name="dtNascimento" class="form-control" 
                                   id="dtNascimento" required>
                        </div>

                        <div class="form-group col-md-3">
                            <label for="lbSexo">SEXO</label>
                            <select class="form-control" name="sexo" id="sexo" required>
                                <option></option>
                                <option>Masculino</option>
                                <option>Feminino</option>
                            </select>
                        </div>

                        <div class="form-group col-md-5">
                            <label for="lbStCivil">ESTADO CIVIL</label>
                            <select class="form-control" name="stCivil" id="stCivil" required>
                                <option></option>
                                <option>Solteiro</option>
                                <option>Casado</option>
                                <option>Separado</option>
                                <option>Divorciado</option>
                                <option>Viúvo</option>
                            </select>
                        </div>

                        <div class="form-group col-md-4">
                            <label for="lbparentesco">PARENTESCO</label>
                            <select class="form-control" name="parentesco" id="parentesco">
                                <option></option>
                                <option>Esposo(a)</option>
                                <option>Filho</option>
                                <option>Filha</option>
                                <option>Mãe</option>
                                <option>Pai</option>
                                <option>Enteado</option>
                                <option>Enteada</option>
                                <option>Irmão inv. Menor 21 anos</option>
                                <option>Companheiro</option>
                                <option>Indefinido</option>
                            </select>

                        </div>

                    </div>

                    <hr />

                    <div class="row"> <!-- Endereço -->
                        <div class="form-group col-md-2">
                            <label for="lbCep">CEP</label>
                            <input name="cep" type="text" id="cep" value="" size="10" maxlength="9"
                                   onkeyup="somenteNumeros(this)"
                                   onblur="pesquisacep(this.value);"  class="form-control" required/>
                        </div>

                        <div class="form-group col-md-6">
                            <label for="lbEndereco">ENDEREÇO</label>
                            <input name="endereco" type="text" id="endereco" size="60"
                                   class="form-control" disabled/>
                        </div>

                        <div class="form-group col-md-4">
                            <label for="lbComplemento">COMPLEMENTO</label>
                            <input type="text" name="complemento" class="form-control" 
                                   class="form-control" id="complemento">
                        </div>

                        <div class="form-group col-md-3">
                            <label for="lbBairro">BAIRRO</label>
                            <input name="bairro" type="text" id="bairro" size="40" 
                                   class="form-control" disabled/>
                        </div>

                        <div class="form-group col-md-1">
                            <label for="lbUF">UF</label>
                            <input name="uf" type="text" id="uf" size="2" 
                                   class="form-control" disabled/>
                        </div>

                        <div class="form-group col-md-4">
                            <label for="lbCidade">CIDADE</label>
                            <input name="cidade" type="text" id="cidade" size="40" 
                                   class="form-control" disabled/>
                        </div>

                        <div class="form-group col-md-4">
                            <label for="lbHabitacao">HABITAÇÃO</label>
                            <select class="form-control" name="habitacao" id="habitacao" required>
                                <option></option>
                                <option>Própria</option>
                                <option>Alugada</option>
                                <option>Pensão</option>
                                <option>Gratúita</option>
                            </select>
                        </div>

                    </div>

                    <hr />

                    <div class="row"> <!-- Outros -->
                        <div class="form-group col-md-6">
                            <label for="lbNomePai">NOME DO PAI</label>
                            <input type="text" name="nomePai" class="form-control" id="nomePai">
                        </div>

                        <div class="form-group col-md-6">
                            <label for="lbNomeMae">NOME DA MÃE</label>
                            <input type="text" name="nomeMae" class="form-control" id="nomeMae" required>
                        </div>

                        <div class="form-group col-md-3">
                            <label for="lbRG">RG</label>
                            <input type="text" name="rg" 
                                   onkeyup="somenteNumeros(this)" class="form-control" id="rg" required>
                        </div>

                        <div class="form-group col-md-2">
                            <label for="lbOrgEmissor">EMISSOR</label>
                            <input type="text" name="emissor" class="form-control" id="orgEmissor" required>
                        </div>

                        <div class="form-group col-md-4">
                            <label for="lbNaturalidade">NATURALIDADE</label>
                            <input type="text" name="naturalidade" class="form-control" 
                                   id="naturalidade" required>
                        </div>
                        <div class="form-group col-md-3">
                            <label for="lbNacionalidade">NACIONALIDADE</label>
                            <input type="text" name="nacionalidade" class="form-control" 
                                   id="nacionalidade" required>
                        </div>

                        <div class="form-group col-md-5">
                            <label for="lbProfissao">PROFISSÃO</label>
                            <input type="text" name="profissao" class="form-control"
                                   id="profissao" required>
                        </div>
                        <div class="form-group col-md-3">
                            <label for="lbRenda">RENDA MENSAL</label>
                            <input type="text" name="renda" class="form-control" 
                                   onkeyup="somenteNumeros(this)" id="renda" required>
                        </div>
                        <div class="form-group col-md-4">
                            <label for="lbGrauIntrucao">GRAU DE INSTRUÇÃO</label>
                            <select class="form-control" name="grauInstrucao" id="grauIntrucao" required>
                                <option></option>
                                <option>Analfabeto</option>
                                <option>Alfabetizado</option>
                                <option>1º Grau Incompleto</option>
                                <option>1º Grau Completo</option>
                                <option>2º Grau Incompleto</option>
                                <option>2º Grau Completo</option>
                                <option>Superior Incompleto</option>
                                <option>Superior Completo</option>
                            </select>
                        </div>

                    </div>

                    <hr />

                    <div class="row"> <!-- Contato -->
                        <div class="form-group col-md-3">
                            <label for="lbTelefoneCel">TELEFONE CELULAR</label>
                            <input type="text" class="form-control" 
                                   onkeyup="somenteNumeros(this)" name="celular" id="telCelular" required>
                        </div>

                        <div class="form-group col-md-2">
                            <label for="lbResidencial">RESIDENCIAL</label>
                            <input type="text" class="form-control" 
                                   onkeyup="somenteNumeros(this)" name="residemcial" id="telResidencial">
                        </div>

                        <div class="form-group col-md-2">
                            <label for="lbComercial">COMERCIAL</label>
                            <input type="text" class="form-control" 
                                   onkeyup="somenteNumeros(this)" name="comercial" id="telComercial">
                        </div>

                        <div class="form-group col-md-5">
                            <label for="lbEmail">E-MAIL</label>
                            <input type="email" class="form-control" name="email" id="email" required>
                        </div>

                    </div>
                </div>

                <hr />
                <div id="actions" class="row">
                    <div class="col-md-12">
                        <a href="index.jsp" class="btn btn-secondary">Cancelar</a>
                        <button type="submit" class="btn btn-primary">Proximo >></button>
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

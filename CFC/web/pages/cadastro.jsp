<form action="control" method="POST">
    <input type="hidden" name="ac" value="gravarUser"/>
    <div class="form-group">
        <label for="matricula">Matricula:</label>
        <input id="matricula" name="matricula" class="form-control" type="text"
               placeholder="Digite a matricula...">
    </div>
    <div class="form-group">
        <label for="nome">Nome Completo:</label>
        <input id="nome" name="nome" class="form-control" type="text"
               placeholder="Digite o nome complelto...">
    </div>
    <div class="form-group">
        <label for="cpf">CPF:</label>
        <input id="cpf" name="cpf" class="form-control" type="text" placeholder="Digite o CPF...">
    </div>
      <div class="form-group">
        <label for="login">Login</label>
        <input id="login" name="login" class="form-control" type="text" placeholder="Digite o Login...">
    </div>
      <div class="form-group">
        <label for="senha">Senha</label>
        <input id="senha" name="senha" class="form-control" type="text" placeholder="Digite o Senha...">
    </div>
    <div class="form-group">
        <label for="dt_nasc">Data Nascimento:</label>
        <input id="dt_nasc" class="form-control" name="dt_nasc" type="date">
    </div>
    <div>
        <button class="btn btn-primary" type="submit"> Salvar</button>
    </div>
</form>

package Model.Classe;

import Model.Classe.Endereco;
import Model.Classe.Login;
import Model.Classe.TabelaAula;
import Model.Classe.TabelaPreco;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-01T23:44:27")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> qtdaulaTeorica;
    public static volatile SingularAttribute<Usuario, String> ativado;
    public static volatile SingularAttribute<Usuario, Login> loginIdlogin;
    public static volatile SingularAttribute<Usuario, Integer> idusuario;
    public static volatile ListAttribute<Usuario, Endereco> enderecoList;
    public static volatile SingularAttribute<Usuario, String> qtdaulaPratica;
    public static volatile SingularAttribute<Usuario, String> rg;
    public static volatile SingularAttribute<Usuario, String> cpf;
    public static volatile ListAttribute<Usuario, TabelaPreco> tabelaPrecoList;
    public static volatile ListAttribute<Usuario, TabelaAula> tabelaAulaList;
    public static volatile SingularAttribute<Usuario, String> dataNascimento;
    public static volatile SingularAttribute<Usuario, String> nota;
    public static volatile SingularAttribute<Usuario, String> email;

}
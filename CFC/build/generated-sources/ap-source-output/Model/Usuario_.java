package Model;

import Model.Endereco;
import Model.Login;
import Model.Professor;
import Model.TabelaAula;
import Model.TabelaPreco;
import Model.UsuarioPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-24T00:16:53")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, Integer> qtdaulaTeorica;
    public static volatile SingularAttribute<Usuario, Short> ativado;
    public static volatile SingularAttribute<Usuario, Endereco> endereco;
    public static volatile SingularAttribute<Usuario, TabelaPreco> tabelaPreco;
    public static volatile SingularAttribute<Usuario, Login> login;
    public static volatile SingularAttribute<Usuario, UsuarioPK> usuarioPK;
    public static volatile ListAttribute<Usuario, Professor> professorList;
    public static volatile SingularAttribute<Usuario, Integer> qtdaulaPratica;
    public static volatile SingularAttribute<Usuario, String> rg;
    public static volatile SingularAttribute<Usuario, Integer> cpf;
    public static volatile ListAttribute<Usuario, TabelaAula> tabelaAulaList;
    public static volatile SingularAttribute<Usuario, Date> dataNascimento;
    public static volatile SingularAttribute<Usuario, Integer> nota;
    public static volatile SingularAttribute<Usuario, String> email;

}
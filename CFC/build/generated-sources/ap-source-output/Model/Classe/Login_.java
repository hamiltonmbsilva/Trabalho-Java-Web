package Model.Classe;

import Model.Classe.Atendente;
import Model.Classe.Professor;
import Model.Classe.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-01T23:44:27")
@StaticMetamodel(Login.class)
public class Login_ { 

    public static volatile SingularAttribute<Login, String> senha;
    public static volatile ListAttribute<Login, Atendente> atendenteList;
    public static volatile ListAttribute<Login, Usuario> usuarioList;
    public static volatile SingularAttribute<Login, Integer> idlogin;
    public static volatile SingularAttribute<Login, String> nome;
    public static volatile SingularAttribute<Login, String> painel;
    public static volatile SingularAttribute<Login, String> login;
    public static volatile ListAttribute<Login, Professor> professorList;
    public static volatile SingularAttribute<Login, String> status;

}
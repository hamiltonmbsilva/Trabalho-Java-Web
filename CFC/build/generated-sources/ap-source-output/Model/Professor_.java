package Model;

import Model.Login;
import Model.ProfessorPK;
import Model.TabelaAula;
import Model.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-24T00:16:53")
@StaticMetamodel(Professor.class)
public class Professor_ { 

    public static volatile SingularAttribute<Professor, ProfessorPK> professorPK;
    public static volatile SingularAttribute<Professor, Usuario> usuario;
    public static volatile ListAttribute<Professor, TabelaAula> tabelaAulaList;
    public static volatile SingularAttribute<Professor, Login> login;

}
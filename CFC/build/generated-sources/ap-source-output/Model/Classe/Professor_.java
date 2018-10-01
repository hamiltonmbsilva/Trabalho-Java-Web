package Model.Classe;

import Model.Classe.Login;
import Model.Classe.TabelaAula;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-30T21:18:43")
@StaticMetamodel(Professor.class)
public class Professor_ { 

    public static volatile SingularAttribute<Professor, Login> loginIdlogin;
    public static volatile ListAttribute<Professor, TabelaAula> tabelaAulaList;
    public static volatile SingularAttribute<Professor, Integer> idprofessor;

}
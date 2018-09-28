package Model.Classe;

import Model.Classe.Professor;
import Model.Classe.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-28T02:32:37")
@StaticMetamodel(TabelaAula.class)
public class TabelaAula_ { 

    public static volatile SingularAttribute<TabelaAula, String> aulaTeorica;
    public static volatile SingularAttribute<TabelaAula, String> marcarSimulado;
    public static volatile SingularAttribute<TabelaAula, String> aulaPratica;
    public static volatile SingularAttribute<TabelaAula, Professor> professorIdprofessor;
    public static volatile SingularAttribute<TabelaAula, Usuario> usuarioIdusuario;
    public static volatile SingularAttribute<TabelaAula, Integer> idtabelaAula;
    public static volatile SingularAttribute<TabelaAula, Short> aulaDada;

}
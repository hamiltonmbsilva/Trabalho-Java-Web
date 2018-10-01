package Model.Classe;

import Model.Classe.Professor;
import Model.Classe.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-30T21:18:43")
@StaticMetamodel(TabelaAula.class)
public class TabelaAula_ { 

    public static volatile SingularAttribute<TabelaAula, String> aulaTeorica;
    public static volatile SingularAttribute<TabelaAula, String> marcarSimulado;
    public static volatile SingularAttribute<TabelaAula, String> aulaPratica;
    public static volatile SingularAttribute<TabelaAula, Professor> professorIdprofessor;
    public static volatile SingularAttribute<TabelaAula, Usuario> usuarioIdusuario;
    public static volatile SingularAttribute<TabelaAula, Integer> idtabelaAula;
    public static volatile SingularAttribute<TabelaAula, Date> dataTeorica;
    public static volatile SingularAttribute<TabelaAula, Date> dataPratica;

}
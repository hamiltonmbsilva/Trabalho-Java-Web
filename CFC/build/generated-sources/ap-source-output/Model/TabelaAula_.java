package Model;

import Model.Professor;
import Model.TabelaAulaPK;
import Model.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-24T00:16:53")
@StaticMetamodel(TabelaAula.class)
public class TabelaAula_ { 

    public static volatile SingularAttribute<TabelaAula, Professor> professor;
    public static volatile SingularAttribute<TabelaAula, TabelaAulaPK> tabelaAulaPK;
    public static volatile SingularAttribute<TabelaAula, String> aulaTeorica;
    public static volatile SingularAttribute<TabelaAula, String> marcarSimulado;
    public static volatile SingularAttribute<TabelaAula, String> aulaPratica;
    public static volatile SingularAttribute<TabelaAula, Usuario> usuario;
    public static volatile SingularAttribute<TabelaAula, Short> aulaDada;

}
package Model;

import Model.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-24T00:16:53")
@StaticMetamodel(Endereco.class)
public class Endereco_ { 

    public static volatile SingularAttribute<Endereco, String> cidade;
    public static volatile SingularAttribute<Endereco, String> estado;
    public static volatile SingularAttribute<Endereco, String> complemento;
    public static volatile ListAttribute<Endereco, Usuario> usuarioList;
    public static volatile SingularAttribute<Endereco, Integer> numero;
    public static volatile SingularAttribute<Endereco, Integer> idendereco;
    public static volatile SingularAttribute<Endereco, String> rua;

}
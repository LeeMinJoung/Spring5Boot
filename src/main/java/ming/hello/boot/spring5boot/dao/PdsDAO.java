package ming.hello.boot.spring5boot.dao;

import ming.hello.boot.spring5boot.model.Pds;
import ming.hello.boot.spring5boot.model.PdsAttach;

public interface PdsDAO {

    int insertPds(Pds p);

    int insertPdsAttach(PdsAttach pa);

}

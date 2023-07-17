package ming.hello.boot.spring5boot.mybatis;

import ming.hello.boot.spring5boot.model.Pds;
import ming.hello.boot.spring5boot.model.PdsAttach;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PdsMapper {

    int insertPds(Pds b);

    int lastPdsPno();

    int insertPdsAttach(PdsAttach pa);

    List<Pds> selectPds(int stnum);

    Pds selectOnePds(String pno);

    int selectCountPds();



    /*
    int updateViewPds(String bno);

    List<Pds> selectFindPds(Map<String, Object> params);

    int countFindPds(Map<String, Object> params);
    */

}

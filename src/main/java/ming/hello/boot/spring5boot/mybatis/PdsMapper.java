package ming.hello.boot.spring5boot.mybatis;

import ming.hello.boot.spring5boot.model.Pds;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PdsMapper {

    int insertPds(Pds b);

    int lastPdsPno();

    /*
    List<Pds> selectPds(int stnum);

    Pds selectOnePds(String bno);

    int updateViewPds(String bno);

    int selectCountPds();

    List<Pds> selectFindPds(Map<String, Object> params);

    int countFindPds(Map<String, Object> params);
    */

}

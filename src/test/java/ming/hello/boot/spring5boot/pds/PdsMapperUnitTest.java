package ming.hello.boot.spring5boot.pds;

import ming.hello.boot.spring5boot.model.Pds;
import ming.hello.boot.spring5boot.model.PdsAttach;
import ming.hello.boot.spring5boot.model.PdsComment;
import ming.hello.boot.spring5boot.mybatis.PdsMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class PdsMapperUnitTest {

    @Autowired
    private PdsMapper pdsMapper;

    @Test
    @DisplayName("PdsMapper lastid Test")
    @Transactional
    void lastIdPds() {
        Pds p = new Pds();
        p.setUserid("abc123"); p.setTitle("테스트");
        p.setContents("테스트"); p.setIpaddr("127.0.0.1");

        pdsMapper.insertPds(p);
        int result = pdsMapper.lastPdsPno();

        assertNotNull(result);
    }

    @Test
    @DisplayName("PdsMapper selectOnePA Test")
    void selectOnePA() {
        String pno = "8";

        PdsAttach result = pdsMapper.selectOnePdsAttach(pno);
        assertNotNull(result);
    }

    @Test
    @DisplayName("PdsMapper selectPC Test")
    void selectPdsComments() {
        String pno = "8";

        List<PdsComment> results = pdsMapper.selectPdsComment(pno);
        assertNotNull(results);
    }

    @Test
    @DisplayName("PdsMapper newcomment Test")
    //@Transactional
    void newcomment() {
        PdsComment pc = new PdsComment();
        pc.setUserid("abc123"); pc.setComments("테스트");
        pc.setPno("8");

        int result = pdsMapper.insertPdsComment(pc);

        assertNotNull(result);
    }

}

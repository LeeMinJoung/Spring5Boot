package ming.hello.boot.spring5boot.pds;


import ming.hello.boot.spring5boot.dao.PdsDAO;
import ming.hello.boot.spring5boot.dao.PdsDAOImpl;
import ming.hello.boot.spring5boot.model.Pds;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.context.annotation.Import;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import(PdsDAOImpl.class)
public class PdsDAOUnitTest {

    @Autowired private PdsDAO pdao;

    @Test
    @DisplayName("PdsDAO select Test")
    void selectBoard() {
        int cpg = 1;
        int stnum = (cpg - 1) * 25;

        List<Pds> results = pdao.selectPds(stnum);

        //System.out.println(results);
        assertNotNull(results);
    }

    @Test
    @DisplayName("PdsDAO selectOne Test")
    void selectOnePds() {
        String pno = "5";

        Pds result = pdao.selectOnePds(pno);
        assertNotNull(result);
    }

}
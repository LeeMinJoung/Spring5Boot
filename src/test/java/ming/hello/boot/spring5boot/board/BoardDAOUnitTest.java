package ming.hello.boot.spring5boot.board;

import ming.hello.boot.spring5boot.dao.BoardDAO;
import ming.hello.boot.spring5boot.dao.BoardDAOImpl;
import ming.hello.boot.spring5boot.dao.MemberDAO;
import ming.hello.boot.spring5boot.dao.MemberDAOImpl;
import ming.hello.boot.spring5boot.model.Board;
import ming.hello.boot.spring5boot.model.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.context.annotation.Import;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import(BoardDAOImpl.class)
public class BoardDAOUnitTest {

    @Autowired private BoardDAO bdao;

    @Test
    @DisplayName("BoardDAO select Test")
    void selectBoard() {
        List<Board> results = bdao.selectBoard();

        //System.out.println(results);
        assertNotNull(results);
    }

}
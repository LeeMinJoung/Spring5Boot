package ming.hello.boot.spring5boot.service;

import lombok.RequiredArgsConstructor;
import ming.hello.boot.spring5boot.dao.BoardDAO;
import ming.hello.boot.spring5boot.model.Board;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bsrv")
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    final BoardDAO bdao;

    @Override
    public boolean saveBoard(Board b) {
        return false;
    }

    @Override
    public List<Board> readBoard() {

        return bdao.selectBoard();
    }

    @Override
    public Board readOneBoard(String bno) {
        return null;
    }
}
package ming.hello.boot.spring5boot.service;

import lombok.RequiredArgsConstructor;
import ming.hello.boot.spring5boot.dao.PdsDAO;
import ming.hello.boot.spring5boot.model.Pds;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service("psrv")
@RequiredArgsConstructor
public class PdsServiceImpl implements PdsService{

    final PdsDAO pdao;

    @Override
    public int newPds(Pds p) {

        return pdao.insertPds(p);
    }

    @Override
    public boolean newPdsAttach(MultipartFile attach, int pno) {
        return false;
    }
}

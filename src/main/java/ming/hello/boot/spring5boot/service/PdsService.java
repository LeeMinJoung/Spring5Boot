package ming.hello.boot.spring5boot.service;

import ming.hello.boot.spring5boot.model.Pds;
import org.springframework.web.multipart.MultipartFile;


public interface PdsService {
    int newPds(Pds p);
    boolean newPdsAttach(MultipartFile attach, int pno);
}
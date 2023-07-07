package ming.hello.boot.spring5boot.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import ming.hello.boot.spring5boot.model.Member;
import ming.hello.boot.spring5boot.model.Zipcode;

import java.util.List;

public interface MemberService {

    boolean saveMember(Member m);

    List<Member> readMember();

    String findzip(String dong) throws JsonProcessingException;
}

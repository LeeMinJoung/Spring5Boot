package ming.hello.boot.spring5boot.dao;

import ming.hello.boot.spring5boot.model.Member;
import ming.hello.boot.spring5boot.model.Zipcode;

import java.util.List;

public interface MemberDAO {

    int insertMember(Member m);

    List<Member> selectMember();

    List<Zipcode> selectzip(String dong);

    int selectOneUserid(String uid);
}

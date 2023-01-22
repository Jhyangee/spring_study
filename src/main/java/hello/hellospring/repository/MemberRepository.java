package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    //1.저장
    Member save(Member member);
    //2. 해당 값 찾아오기
    Optional<Member> findById(Long id);
    Optional<Member> findByNmae(String name);
    //3. 전체 조회
    List<Member> findAll();

}

package dlrtn.example.springsecurity.repository;

import dlrtn.example.springsecurity.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String> {
}

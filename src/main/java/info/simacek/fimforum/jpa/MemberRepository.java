package info.simacek.fimforum.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import info.simacek.fimforum.domain.Member;

public interface MemberRepository  extends JpaRepository<Member, Integer> {

}

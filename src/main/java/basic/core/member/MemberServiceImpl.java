package basic.core.member;

public class MemberServiceImpl implements MemberService{
    // 추상화뿐만 아니라 구현체에도 의존하는 문제 발생. DIP 원칙 위반
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}

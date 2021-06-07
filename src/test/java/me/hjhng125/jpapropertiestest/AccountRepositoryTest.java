package me.hjhng125.jpapropertiestest;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

@DataJpaTest
@ActiveProfiles("test")
class AccountRepositoryTest {

    @Autowired
    private AccountRepository accountRepository;

    @Test
    void CRUD_test() {
        Account save = accountRepository.save(Account.builder()
            .email("hjhng125@nate.com")
            .password("pass")
            .userName("hjhng")
            .build());

        System.out.println(save);
        assertThat(save).isNotNull();
    }
}
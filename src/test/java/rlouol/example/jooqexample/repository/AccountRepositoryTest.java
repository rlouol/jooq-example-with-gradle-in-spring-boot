package rlouol.example.jooqexample.repository;

import org.jooq.DSLContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jooq.JooqTest;
import org.springframework.context.annotation.Import;
import rlouol.example.jooqexample.entity.AccountEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@JooqTest
@Import(AccountRepository.class)
class AccountRepositoryTest {
    @Autowired
    private DSLContext dsl;
    @Autowired
    private AccountRepository repository;

    @Test
    void getList1() {
        AccountEntity expected = new AccountEntity("PGM", "pgm@naver.com");
        List<AccountEntity> list = repository.getList1();
        assertEquals(list.size(), 1);
        assertEquals(list.get(0).getEmail(), expected.getEmail());
        assertEquals(list.get(0).getUsername(), expected.getUsername());
    }

    @Test
    void getList2() {
        AccountEntity expected = new AccountEntity("PGM", "pgm@naver.com");
        List<AccountEntity> list = repository.getList2();
        assertEquals(list.size(), 1);
        assertEquals(list.get(0).getEmail(), expected.getEmail());
        assertEquals(list.get(0).getUsername(), expected.getUsername());
    }
}
package rlouol.example.jooqexample.repository;

import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.stereotype.Repository;
import rlouol.example.jooqexample.entity.AccountEntity;
import rlouol.example.jooqexample.tables.Account;

import java.util.List;

@Repository
public class AccountRepository {
    private final DSLContext dsl;

    public AccountRepository(DSLContext dsl) {
        this.dsl = dsl;
    }

    public List<AccountEntity> getList1() {
        return dsl.select(DSL.field("username"), DSL.field("email"))
                .from(DSL.table("account")).fetchInto(AccountEntity.class);
    }

    public List<AccountEntity> getList2() {
        return dsl.select(Account.ACCOUNT.USERNAME, Account.ACCOUNT.EMAIL)
                .from(Account.ACCOUNT).fetchInto(AccountEntity.class);
    }
}

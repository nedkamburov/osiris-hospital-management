package com.healthcare.management.system.db.infrastructure;

import com.healthcare.management.system.db.infrastructure.model.UserEntity;
import com.healthcare.management.system.domain.DomainUser;
import com.healthcare.management.system.domain.DomainUserDAO;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class DomainUserDAOHibernateImpl implements DomainUserDAO {

    private final EntityManager entityManager;
    private final UserEntityMapper userEntityMapper;

    @Override
    public List<DomainUser> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<UserEntity> theQuery = currentSession.createQuery("from UserEntity", UserEntity.class);

        List<UserEntity> users = theQuery.getResultList();

        return users.stream().map(userEntityMapper::toDomainObject).collect(Collectors.toList());
    }

    @Override
    public void createOrUpdate(DomainUser domainUser) {
        Session currentSession = entityManager.unwrap(Session.class);

        UserEntity userEntity = userEntityMapper.toEntityObject(domainUser);
        currentSession.saveOrUpdate(userEntity);
    }

    @Override
    public DomainUser findById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);

        UserEntity userEntity = currentSession.get(UserEntity.class, theId);
        return userEntityMapper.toDomainObject(userEntity);
    }

    @Override
    public void deleteById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<UserEntity> theQuery = currentSession.createQuery("delete from UserEntity where id=:userId");
        theQuery.setParameter("userId", theId);
        theQuery.executeUpdate();
    }
}

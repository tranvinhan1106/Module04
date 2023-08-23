package codegym.vn.repository;

import codegym.vn.entity.Picture;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PictureRepositoryImpl implements PictureRepository{
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public List<Picture> findAll() {
        return entityManager.createQuery("FROM Picture p").getResultList();
    }

    @Override
    public void create(Picture picture) {
        entityManager.persist(picture);
    }
}

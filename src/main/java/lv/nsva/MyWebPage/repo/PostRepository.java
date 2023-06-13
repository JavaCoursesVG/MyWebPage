package lv.nsva.MyWebPage.repo;

import lv.nsva.MyWebPage.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}

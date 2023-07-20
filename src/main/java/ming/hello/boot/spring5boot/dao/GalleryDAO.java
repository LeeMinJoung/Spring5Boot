package ming.hello.boot.spring5boot.dao;

import ming.hello.boot.spring5boot.model.Gallery;

import java.util.List;

public interface GalleryDAO {

    List<Gallery> selectGallery(int stnum);
}

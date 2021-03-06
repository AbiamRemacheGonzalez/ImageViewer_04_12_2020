package imageviewer.apps.mock.implementations;

import imageviewer.model.Image;
import imageviewer.view.ImageLoader;
import java.util.ArrayList;
import java.util.List;

public class MockImageLoader implements ImageLoader{
    @Override
    public List<Image> load() {
        List<Image> list = new ArrayList<>();
        list.add(new Image("imagen 1"));
        list.add(new Image("imagen 2"));
        list.add(new Image("imagen 3"));
        list.add(new Image("imagen 4"));
        return list;
    }
}

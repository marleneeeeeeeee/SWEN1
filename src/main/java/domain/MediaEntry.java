package domain;

import lombok.Getter;
import lombok.Setter;

import java.rmi.server.UID;
import java.util.List;

public class MediaEntry implements Entity {
    private UID id;
    @Getter
    @Setter
    private String title;
    @Getter
    @Setter
    private String description;
    @Getter
    @Setter
    private int releaseYear;
    @Getter
    @Setter
    private List<GENRE> genre;

    @Override
    public UID getId() {
        return id;
    }
}


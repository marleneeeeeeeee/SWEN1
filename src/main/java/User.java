import lombok.Getter;
import lombok.Setter;

import java.rmi.server.UID;
import java.util.List;

public class User {
    @Getter @Setter
    private String username;
    private UID userId;
    private String password;
    private List<MediaEntry> ownEntries;
    private List<MediaEntry> favoriteEntries;
    private List<Rating> ownRatings;
    private List<Rating> likedRatings;


}

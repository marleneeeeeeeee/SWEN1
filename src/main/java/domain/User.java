package domain;

import Service.PasswordHasher;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

public class User implements Entity{
    @Getter @Setter
    private String username;
    private UUID id;
    private String passwordHash;

    // for later
    private List<MediaEntry> ownEntries;
    private List<MediaEntry> favoriteEntries;
    private List<Rating> ownRatings;
    private List<Rating> likedRatings;


    // new User
    public User(String username, String plainPassword) {
        if (username == null || username.isBlank())
            throw new IllegalArgumentException("Username required");
        if (plainPassword == null || plainPassword.length() < 8)
            throw new IllegalArgumentException("Password must be at least 8 characters");

        this.id = UUID.randomUUID();
        this.username = username;
        this.passwordHash = PasswordHasher.hash(plainPassword);
    }

    // existing Users
    public User(String username, String passwordHash, UUID id){
        this.id = id;
        this.passwordHash = passwordHash;
        this.username = username;
    }

    @Override
    public UUID getId() {
        return id;
    }

    public String toString(){
        return "id: "+ id + ", Username: "+ username + ", PasswordHash: " + passwordHash;
    }
}

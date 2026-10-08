package domain;

import java.sql.Timestamp;
import java.util.UUID;

public class Rating implements Entity{
    private UUID id;
    private MediaEntry entry;
    private int creatorId;
    private int stars;
    private int likes;
    private boolean hidden;
    private String comment;
    private Timestamp timestamp;

    public Rating(int creatorId, int stars, MediaEntry entry, String comment){
        this.creatorId = creatorId;
        this.comment = comment;
        this.stars = stars;
        this.entry = entry;
        new java.util.Date();
        timestamp = new Timestamp(System.currentTimeMillis());
    }
    public void like(){
        likes++;
    }

    @Override
    public UUID getId() {
        return id;
    }
}


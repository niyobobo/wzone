package rw.wastezone.waste.model;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "message")
public class MessageModel {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String message;

    @Ignore
    public MessageModel(String message) {
        this.message = message;
    }

    public MessageModel(int id, String message) {
        this.id = id;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}

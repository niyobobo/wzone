package rw.wastezone.waste.data;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import rw.wastezone.waste.model.MessageModel;

import static androidx.room.OnConflictStrategy.REPLACE;

@Dao
public interface MessageDao {

    @Insert(onConflict = REPLACE)
    void insertMessage(MessageModel model);

    @Query("SELECT * FROM message")
    LiveData<List<MessageModel>> getMessage();
}

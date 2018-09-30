package rw.wastezone.waste.data;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;
import rw.wastezone.waste.model.MessageModel;

@androidx.room.Database(entities = {MessageModel.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    private static final String DATABASE_NAME = "hahiye_db";
    private static AppDatabase sInstance;

    public static AppDatabase getInstance(final Context context) {
        if (sInstance == null) {
            synchronized (AppDatabase.class) {
                if (sInstance == null) {
                    sInstance = Room.databaseBuilder(context.getApplicationContext(),
                            AppDatabase.class,
                            DATABASE_NAME).build();
                }
            }
        }
        return sInstance;
    }

    public abstract MessageDao messageDao();
}

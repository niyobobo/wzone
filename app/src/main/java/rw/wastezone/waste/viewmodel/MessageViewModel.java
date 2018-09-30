package rw.wastezone.waste.viewmodel;

import android.app.Application;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import rw.wastezone.waste.data.AppDatabase;
import rw.wastezone.waste.model.MessageModel;

public class MessageViewModel extends AndroidViewModel {

    private ExecutorService mExecutorService;
    private AppDatabase mAppDatabase;

    public MessageViewModel(@NonNull Application application) {
        super(application);
        mExecutorService = Executors.newSingleThreadExecutor();
        mAppDatabase = AppDatabase.getInstance(application);
    }

    public LiveData<List<MessageModel>> getMessages() {
        return mAppDatabase.messageDao().getMessage();
    }

    public void insertMessage(MessageModel model) {
        mExecutorService.execute(() -> mAppDatabase.messageDao().insertMessage(model));
    }
}

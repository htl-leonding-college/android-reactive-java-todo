package at.htl.todo;


import android.os.Bundle;
import android.util.Log;

import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;

import javax.inject.Inject;

import at.htl.todo.model.TodoService;
import at.htl.todo.ui.layout.MainView;
import at.htl.todo.util.config.Config;
import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends ComponentActivity {

    static final String TAG = MainActivity.class.getSimpleName();

//    @Inject
//    Config config;

    @Inject
    MainView mainView;

    @Inject
    TodoService todoService;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Config.load(this);
        var base_url = Config.getProperty("json.placeholder.baseurl");
        Log.i(TAG, "onCreate: " + base_url);

        mainView.buildContent(this);
        todoService.getAll();
    }
}


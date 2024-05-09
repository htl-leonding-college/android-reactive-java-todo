package at.htl.todo;

import android.app.Application;
import javax.inject.Singleton;
import dagger.hilt.android.HiltAndroidApp;

/** Our application entry point.
 * Needed as the dependency injection container.
 */
@HiltAndroidApp
@Singleton
public class TodoApplication extends Application {
}

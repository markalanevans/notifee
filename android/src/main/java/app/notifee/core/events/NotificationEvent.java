package app.notifee.core.events;

import android.os.Bundle;

import androidx.annotation.Nullable;

import app.notifee.core.KeepForSdk;
import app.notifee.core.bundles.NotificationBundle;

@KeepForSdk
public class NotificationEvent {
  @KeepForSdk
  public final static String TYPE_DELIVERED = "delivered";
  @KeepForSdk
  public final static String TYPE_DISMISSED = "dismissed";
  @KeepForSdk
  public final static String TYPE_OPENED = "opened";

  private final String type;
  private final Bundle extras;
  private final NotificationBundle notification;

  public NotificationEvent(String type, NotificationBundle bundle) {
    this.type = type;
    this.notification = bundle;
    this.extras = null;
  }

  public NotificationEvent(String type, NotificationBundle bundle, Bundle extras) {
    this.type = type;
    this.notification = bundle;
    this.extras = extras;
  }

  @KeepForSdk
  public String getType() {
    return type;
  }

  @KeepForSdk
  public NotificationBundle getNotification() {
    return notification;
  }

  @KeepForSdk
  @Nullable
  public Bundle getExtras() {
    return extras;
  }
}

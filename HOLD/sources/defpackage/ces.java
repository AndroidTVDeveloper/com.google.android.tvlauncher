package defpackage;

import android.content.Context;

/* renamed from: ces  reason: default package */
/* compiled from: PG */
public final class ces {
    public volatile boolean a;

    public ces(Context context) {
        this.a = context.getSharedPreferences("com.google.android.libraries.social.silentfeedback.usageReporting", 0).getBoolean("optedIn", false);
    }
}

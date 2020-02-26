package p000;

import android.content.Context;

/* renamed from: ces */
/* compiled from: PG */
public final class ces {

    /* renamed from: a */
    public volatile boolean f5386a;

    public ces(Context context) {
        this.f5386a = context.getSharedPreferences("com.google.android.libraries.social.silentfeedback.usageReporting", 0).getBoolean("optedIn", false);
    }
}

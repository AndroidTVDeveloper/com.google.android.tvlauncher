package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.util.Log;

/* renamed from: cge */
/* compiled from: PG */
public final class cge {

    /* renamed from: a */
    public final ContentResolver f5457a;

    public cge(Context context) {
        this.f5457a = context.getApplicationContext().getContentResolver();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: byi.a(android.content.ContentResolver, java.lang.String, boolean):boolean
     arg types: [android.content.ContentResolver, java.lang.String, int]
     candidates:
      byi.a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object
      byi.a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String
      byi.a(java.lang.Object, java.lang.String, java.lang.String):void
      byi.a(android.content.ContentResolver, java.lang.String, boolean):boolean */
    /* renamed from: a */
    public static final boolean m4702a(ContentResolver contentResolver, String str) {
        try {
            return byi.m4371a(contentResolver, str, false);
        } catch (SecurityException e) {
            Log.w("PrimesSettings", "Gservices failed to get value", e);
            return false;
        }
    }
}

package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.util.Log;

/* renamed from: cge  reason: default package */
/* compiled from: PG */
public final class cge {
    public final ContentResolver a;

    public cge(Context context) {
        this.a = context.getApplicationContext().getContentResolver();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: byi.a(android.content.ContentResolver, java.lang.String, boolean):boolean
     arg types: [android.content.ContentResolver, java.lang.String, int]
     candidates:
      byi.a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object
      byi.a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String
      byi.a(java.lang.Object, java.lang.String, java.lang.String):void
      byi.a(android.content.ContentResolver, java.lang.String, boolean):boolean */
    public static final boolean a(ContentResolver contentResolver, String str) {
        try {
            return byi.a(contentResolver, str, false);
        } catch (SecurityException e) {
            Log.w("PrimesSettings", "Gservices failed to get value", e);
            return false;
        }
    }
}

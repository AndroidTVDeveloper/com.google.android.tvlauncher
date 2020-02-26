package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;

/* renamed from: ddw  reason: default package */
/* compiled from: PG */
public final class ddw {
    public static final String[] a = {"icon", "title", "action"};
    public final Drawable b;
    public final String c;
    public final String d;

    public ddw(Drawable drawable, String str, String str2) {
        this.c = str;
        this.d = str2;
        this.b = drawable;
    }

    public final boolean a() {
        return !TextUtils.isEmpty(this.c) && this.d != null;
    }
}

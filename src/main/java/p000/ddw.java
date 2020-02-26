package p000;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;

/* renamed from: ddw */
/* compiled from: PG */
public final class ddw {

    /* renamed from: a */
    public static final String[] f8350a = {"icon", "title", "action"};

    /* renamed from: b */
    public final Drawable f8351b;

    /* renamed from: c */
    public final String f8352c;

    /* renamed from: d */
    public final String f8353d;

    public ddw(Drawable drawable, String str, String str2) {
        this.f8352c = str;
        this.f8353d = str2;
        this.f8351b = drawable;
    }

    /* renamed from: a */
    public final boolean mo4167a() {
        return !TextUtils.isEmpty(this.f8352c) && this.f8353d != null;
    }
}

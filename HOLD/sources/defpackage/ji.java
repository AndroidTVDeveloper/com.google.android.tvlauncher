package defpackage;

import android.graphics.Rect;
import android.view.View;

/* renamed from: ji  reason: default package */
/* compiled from: PG */
public abstract class ji {
    public final jx a;

    public /* synthetic */ ji(jx jxVar) {
        new Rect();
        this.a = jxVar;
    }

    public abstract int a(View view);

    public abstract int b(View view);

    public static ji a(jx jxVar) {
        return new jg(jxVar);
    }
}

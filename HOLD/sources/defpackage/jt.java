package defpackage;

import android.view.View;

/* renamed from: jt  reason: default package */
/* compiled from: PG */
public class jt {
    public int a;
    public int b;
    public int c;
    public int d;

    public jt a(km kmVar) {
        View view = kmVar.a;
        this.a = view.getLeft();
        this.b = view.getTop();
        this.c = view.getRight();
        this.d = view.getBottom();
        return this;
    }
}

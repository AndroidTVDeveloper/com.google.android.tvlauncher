package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewDebug;
import android.view.ViewGroup;

/* renamed from: gs  reason: default package */
/* compiled from: PG */
public final class gs extends ir {
    @ViewDebug.ExportedProperty
    public boolean a;
    @ViewDebug.ExportedProperty
    public int b;
    @ViewDebug.ExportedProperty
    public int c;
    @ViewDebug.ExportedProperty
    public boolean d;
    @ViewDebug.ExportedProperty
    public boolean e;
    public boolean f;

    public gs() {
        super(-2);
        this.a = false;
    }

    public gs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public gs(gs gsVar) {
        super(gsVar);
        this.a = gsVar.a;
    }

    public gs(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}

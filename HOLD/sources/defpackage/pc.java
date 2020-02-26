package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.leanback.widget.VerticalGridView;

/* renamed from: pc  reason: default package */
/* compiled from: PG */
public final class pc extends jp {
    private final int b;
    private final int c;
    private final int d;
    private final pf e;
    private final /* synthetic */ pe f;

    public pc(pe peVar, int i, int i2, int i3) {
        this.f = peVar;
        this.b = i;
        this.c = i3;
        this.d = i2;
        this.e = (pf) peVar.j.get(i3);
    }

    public final int a() {
        pf pfVar = this.e;
        if (pfVar != null) {
            return (pfVar.c - pfVar.b) + 1;
        }
        return 0;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: pe.a(android.view.View, boolean, int, boolean):void
     arg types: [android.view.View, boolean, int, int]
     candidates:
      pe.a(android.view.View, boolean, float, android.view.animation.Interpolator):void
      pe.a(android.view.View, boolean, int, boolean):void */
    public final /* bridge */ /* synthetic */ void a(km kmVar, int i) {
        pf pfVar;
        CharSequence charSequence;
        pd pdVar = (pd) kmVar;
        TextView textView = pdVar.p;
        boolean z = true;
        if (!(textView == null || (pfVar = this.e) == null)) {
            int i2 = pfVar.b + i;
            CharSequence[] charSequenceArr = pfVar.d;
            if (charSequenceArr == null) {
                charSequence = String.format(pfVar.e, Integer.valueOf(i2));
            } else {
                charSequence = charSequenceArr[i2];
            }
            textView.setText(charSequence);
        }
        pe peVar = this.f;
        View view = pdVar.a;
        if (((VerticalGridView) peVar.i.get(this.c)).r() != i) {
            z = false;
        }
        peVar.a(view, z, this.c, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final /* bridge */ /* synthetic */ km a(ViewGroup viewGroup, int i) {
        TextView textView;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.b, viewGroup, false);
        int i2 = this.d;
        if (i2 != 0) {
            textView = (TextView) inflate.findViewById(i2);
        } else {
            textView = (TextView) inflate;
        }
        return new pd(inflate, textView);
    }

    public final /* bridge */ /* synthetic */ void b(km kmVar) {
        ((pd) kmVar).a.setFocusable(this.f.isActivated());
    }
}

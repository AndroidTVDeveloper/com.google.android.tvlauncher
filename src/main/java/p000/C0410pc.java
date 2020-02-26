package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.leanback.widget.VerticalGridView;

/* renamed from: pc */
/* compiled from: PG */
public final class C0410pc extends C0261jp {

    /* renamed from: b */
    private final int f10117b;

    /* renamed from: c */
    private final int f10118c;

    /* renamed from: d */
    private final int f10119d;

    /* renamed from: e */
    private final C0413pf f10120e;

    /* renamed from: f */
    private final /* synthetic */ C0412pe f10121f;

    public C0410pc(C0412pe peVar, int i, int i2, int i3) {
        this.f10121f = peVar;
        this.f10117b = i;
        this.f10118c = i3;
        this.f10119d = i2;
        this.f10120e = (C0413pf) peVar.f10131j.get(i3);
    }

    /* renamed from: a */
    public final int mo2794a() {
        C0413pf pfVar = this.f10120e;
        if (pfVar != null) {
            return (pfVar.f10139c - pfVar.f10138b) + 1;
        }
        return 0;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: pe.a(android.view.View, boolean, int, boolean):void
     arg types: [android.view.View, boolean, int, int]
     candidates:
      pe.a(android.view.View, boolean, float, android.view.animation.Interpolator):void
      pe.a(android.view.View, boolean, int, boolean):void */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2797a(C0285km kmVar, int i) {
        C0413pf pfVar;
        CharSequence charSequence;
        C0411pd pdVar = (C0411pd) kmVar;
        TextView textView = pdVar.f10122p;
        boolean z = true;
        if (!(textView == null || (pfVar = this.f10120e) == null)) {
            int i2 = pfVar.f10138b + i;
            CharSequence[] charSequenceArr = pfVar.f10140d;
            if (charSequenceArr == null) {
                charSequence = String.format(pfVar.f10141e, Integer.valueOf(i2));
            } else {
                charSequence = charSequenceArr[i2];
            }
            textView.setText(charSequence);
        }
        C0412pe peVar = this.f10121f;
        View view = pdVar.f9783a;
        if (((VerticalGridView) peVar.f10130i.get(this.f10118c)).mo5622r() != i) {
            z = false;
        }
        peVar.mo5735a(view, z, this.f10118c, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0285km mo2795a(ViewGroup viewGroup, int i) {
        TextView textView;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f10117b, viewGroup, false);
        int i2 = this.f10119d;
        if (i2 != 0) {
            textView = (TextView) inflate.findViewById(i2);
        } else {
            textView = (TextView) inflate;
        }
        return new C0411pd(inflate, textView);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo5311b(C0285km kmVar) {
        ((C0411pd) kmVar).f9783a.setFocusable(this.f10121f.isActivated());
    }
}

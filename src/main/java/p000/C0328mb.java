package p000;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.preference.MultiSelectListPreference;
import com.google.android.tvlauncher.R;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* renamed from: mb */
/* compiled from: PG */
public final class C0328mb extends C0261jp implements C0330md {

    /* renamed from: b */
    private final CharSequence[] f9943b;

    /* renamed from: c */
    private final CharSequence[] f9944c;

    /* renamed from: d */
    private final Set f9945d;

    /* renamed from: e */
    private final /* synthetic */ C0332mf f9946e;

    public C0328mb(C0332mf mfVar, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2, Set set) {
        this.f9946e = mfVar;
        this.f9943b = charSequenceArr;
        this.f9944c = charSequenceArr2;
        this.f9945d = new HashSet(set);
    }

    /* renamed from: a */
    public final int mo2794a() {
        return this.f9943b.length;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2797a(C0285km kmVar, int i) {
        C0331me meVar = (C0331me) kmVar;
        meVar.f9951p.setChecked(this.f9945d.contains(this.f9944c[i].toString()));
        meVar.f9952q.setText(this.f9943b[i]);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0285km mo2795a(ViewGroup viewGroup, int i) {
        return new C0331me(LayoutInflater.from(viewGroup.getContext()).inflate((int) R.layout.leanback_list_preference_item_multi, viewGroup, false), this);
    }

    /* renamed from: a */
    public final void mo5575a(C0331me meVar) {
        int d = meVar.mo5436d();
        if (d != -1) {
            String charSequence = this.f9944c[d].toString();
            if (this.f9945d.contains(charSequence)) {
                this.f9945d.remove(charSequence);
            } else {
                this.f9945d.add(charSequence);
            }
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) this.f9946e.mo5580a();
            if (multiSelectListPreference.mo1095b((Object) new HashSet(this.f9945d))) {
                multiSelectListPreference.mo1082a((Set) new HashSet(this.f9945d));
                this.f9946e.f9955a = this.f9945d;
            } else if (this.f9945d.contains(charSequence)) {
                this.f9945d.remove(charSequence);
            } else {
                this.f9945d.add(charSequence);
            }
            mo5303O();
        }
    }
}

package p000;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.preference.ListPreference;
import com.google.android.tvlauncher.R;

@Deprecated
/* renamed from: mc */
/* compiled from: PG */
public final class C0329mc extends C0261jp implements C0330md {

    /* renamed from: b */
    private final CharSequence[] f9947b;

    /* renamed from: c */
    private final CharSequence[] f9948c;

    /* renamed from: d */
    private CharSequence f9949d;

    /* renamed from: e */
    private final /* synthetic */ C0332mf f9950e;

    public C0329mc(C0332mf mfVar, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2, CharSequence charSequence) {
        this.f9950e = mfVar;
        this.f9947b = charSequenceArr;
        this.f9948c = charSequenceArr2;
        this.f9949d = charSequence;
    }

    /* renamed from: a */
    public final int mo2794a() {
        return this.f9947b.length;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2797a(C0285km kmVar, int i) {
        C0331me meVar = (C0331me) kmVar;
        meVar.f9951p.setChecked(this.f9948c[i].equals(this.f9949d));
        meVar.f9952q.setText(this.f9947b[i]);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0285km mo2795a(ViewGroup viewGroup, int i) {
        return new C0331me(LayoutInflater.from(viewGroup.getContext()).inflate((int) R.layout.leanback_list_preference_item_single, viewGroup, false), this);
    }

    /* renamed from: a */
    public final void mo5575a(C0331me meVar) {
        int d = meVar.mo5436d();
        if (d != -1) {
            CharSequence charSequence = this.f9948c[d];
            ListPreference listPreference = (ListPreference) this.f9950e.mo5580a();
            if (d >= 0) {
                String charSequence2 = this.f9948c[d].toString();
                if (listPreference.mo1095b((Object) charSequence2)) {
                    listPreference.mo1075a(charSequence2);
                    this.f9949d = charSequence;
                }
            }
            this.f9950e.getFragmentManager().popBackStack();
            mo5303O();
        }
    }
}

package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.tvlauncher.R;

/* renamed from: chp */
/* compiled from: PG */
public final class chp {

    /* renamed from: a */
    public cir f5574a;

    /* renamed from: b */
    public ImageView f5575b;

    /* renamed from: c */
    public Drawable f5576c;

    /* renamed from: d */
    public int f5577d;

    /* renamed from: e */
    public int f5578e;

    /* renamed from: f */
    private final Context f5579f;

    public chp(Context context) {
        this.f5579f = context;
    }

    /* renamed from: a */
    public final void mo2819a() {
        String str;
        int i;
        cir cir = this.f5574a;
        if (cir != null) {
            chn chn = cir.f5665a;
            if (chn == null) {
                String valueOf = String.valueOf(cir);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                sb.append("Null for launch item. Source was : ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            } else if (this.f5575b != null) {
                cjd cjd = cir.f5709c;
                agj a = new agj((byte) 0).mo195a(this.f5576c).mo205c(this.f5576c).mo199a(C0594vy.f10649a).mo198a((C0544ub) new dae(this.f5579f.getColor(R.color.app_banner_background_color), true));
                int i2 = this.f5577d;
                if (i2 > 0 && (i = this.f5578e) > 0) {
                    a = a.mo192a(i2, i);
                }
                C0512sx c = C0497si.m8296c(this.f5579f);
                cjd cjd2 = cjd.ICON;
                int ordinal = cjd.ordinal();
                C0509su suVar = null;
                if (ordinal == 0) {
                    String str2 = chn.f5564d;
                    if (str2 != null) {
                        suVar = c.mo5945a(str2);
                    }
                } else if (ordinal == 1 && (str = chn.f5565e) != null) {
                    suVar = c.mo5945a(str);
                }
                if (suVar == null) {
                    suVar = c.mo5944a(this.f5574a);
                }
                suVar.mo202b(a).mo5937a((ahg) new cho(this.f5575b));
            } else {
                String valueOf2 = String.valueOf(cir);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 41);
                sb2.append("Null for target image view. Source was : ");
                sb2.append(valueOf2);
                throw new IllegalArgumentException(sb2.toString());
            }
        } else {
            throw new IllegalArgumentException("Null for source.");
        }
    }
}

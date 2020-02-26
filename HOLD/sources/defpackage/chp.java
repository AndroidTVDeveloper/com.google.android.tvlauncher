package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.tvlauncher.R;

/* renamed from: chp  reason: default package */
/* compiled from: PG */
public final class chp {
    public cir a;
    public ImageView b;
    public Drawable c;
    public int d;
    public int e;
    private final Context f;

    public chp(Context context) {
        this.f = context;
    }

    public final void a() {
        String str;
        int i;
        cir cir = this.a;
        if (cir != null) {
            chn chn = cir.a;
            if (chn == null) {
                String valueOf = String.valueOf(cir);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                sb.append("Null for launch item. Source was : ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            } else if (this.b != null) {
                cjd cjd = cir.c;
                agj a2 = new agj((byte) 0).a(this.c).c(this.c).a(vy.a).a((ub) new dae(this.f.getColor(R.color.app_banner_background_color), true));
                int i2 = this.d;
                if (i2 > 0 && (i = this.e) > 0) {
                    a2 = a2.a(i2, i);
                }
                sx c2 = si.c(this.f);
                cjd cjd2 = cjd.ICON;
                int ordinal = cjd.ordinal();
                su suVar = null;
                if (ordinal == 0) {
                    String str2 = chn.d;
                    if (str2 != null) {
                        suVar = c2.a(str2);
                    }
                } else if (ordinal == 1 && (str = chn.e) != null) {
                    suVar = c2.a(str);
                }
                if (suVar == null) {
                    suVar = c2.a(this.a);
                }
                suVar.b(a2).a((ahg) new cho(this.b));
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

package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.hardware.hdmi.HdmiDeviceInfo;
import android.media.tv.TvInputInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.tvlauncher.R;
import java.util.Map;
import java.util.Objects;

/* renamed from: cwg  reason: default package */
/* compiled from: PG */
public final class cwg {
    public final String a;
    public final cwg b;
    public final TvInputInfo c;
    public final int d;
    public final Uri e;
    public int f;
    public int g;
    public String h;
    public int i;
    public int j;
    public String k;
    public String l;
    private final HdmiDeviceInfo m;
    private Drawable n;
    private int o;

    public cwg(TvInputInfo tvInputInfo, cwg cwg, int i2) {
        int i3;
        this.a = tvInputInfo.getId();
        this.b = cwg;
        this.c = tvInputInfo;
        if (tvInputInfo.getHdmiDeviceInfo() == null || !tvInputInfo.getHdmiDeviceInfo().isCecDevice()) {
            i3 = (tvInputInfo.getHdmiDeviceInfo() == null || !tvInputInfo.getHdmiDeviceInfo().isMhlDevice()) ? tvInputInfo.getType() : -6;
        } else {
            int deviceType = tvInputInfo.getHdmiDeviceInfo().getDeviceType();
            i3 = deviceType != 0 ? deviceType != 1 ? deviceType != 3 ? deviceType != 4 ? deviceType != 5 ? -2 : -9 : -5 : -10 : -4 : -8;
        }
        this.d = i3;
        this.e = null;
        if (tvInputInfo.getType() == 1007) {
            this.m = tvInputInfo.getHdmiDeviceInfo();
        } else {
            this.m = null;
        }
        this.g = i2;
    }

    private final boolean d() {
        int i2 = this.d;
        return i2 == -3 || i2 == -7;
    }

    public cwg(String str, String str2, Uri uri) {
        this.a = str;
        this.b = null;
        this.c = null;
        this.m = null;
        this.d = -3;
        this.e = uri;
        this.o = 0;
        this.g = 0;
        this.h = str2 == null ? "" : str2;
        this.i = Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        TvInputInfo tvInputInfo;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cwg)) {
            return false;
        }
        cwg cwg = (cwg) obj;
        if (d() && cwg.d() && this.d == cwg.d) {
            return true;
        }
        TvInputInfo tvInputInfo2 = this.c;
        return (tvInputInfo2 == null || (tvInputInfo = cwg.c) == null || !tvInputInfo2.equals(tvInputInfo)) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final Drawable a(Context context, int i2) {
        Drawable drawable;
        Drawable drawable2 = this.n;
        if (drawable2 != null && this.g == this.o) {
            return drawable2;
        }
        this.o = i2;
        if (this.c != null) {
            if (!cwe.a(context).f || (drawable = this.c.loadIcon(context, this.g)) == null) {
                drawable = this.c.loadIcon(context);
            }
            this.n = drawable;
            if (drawable != null) {
                return drawable;
            }
        }
        Integer a2 = cvm.a(this.d);
        if (a2 == null) {
            a2 = Integer.valueOf((int) R.drawable.ic_icon_32dp_hdmi);
        }
        Drawable a3 = bg.a(context, a2.intValue());
        this.n = a3;
        return a3;
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        HdmiDeviceInfo hdmiDeviceInfo = this.m;
        return (hdmiDeviceInfo == null || TextUtils.isEmpty(hdmiDeviceInfo.getDisplayName())) ? this.h : this.m.getDisplayName();
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.d), this.c);
    }

    /* access modifiers changed from: package-private */
    public final void a(Context context) {
        Integer num;
        cwe a2 = cwe.a(context);
        int i2 = this.d;
        Map map = a2.c;
        this.f = (map == null || (num = (Integer) map.get(Integer.valueOf(i2))) == null) ? Integer.MAX_VALUE : num.intValue();
        TvInputInfo tvInputInfo = this.c;
        if (tvInputInfo != null) {
            CharSequence loadCustomLabel = tvInputInfo.loadCustomLabel(context);
            if (TextUtils.isEmpty(loadCustomLabel)) {
                loadCustomLabel = this.c.loadLabel(context);
            }
            if (loadCustomLabel == null) {
                this.h = "";
            } else {
                this.h = loadCustomLabel.toString();
            }
            this.i = this.c.getServiceInfo().metaData.getInt("input_sort_key", Integer.MAX_VALUE);
            cwg cwg = this.b;
            if (cwg != null) {
                String a3 = cwg.a();
                this.k = a3;
                this.l = a3;
            } else {
                this.l = this.h;
            }
            this.n = a(context, this.g);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return d() || this.g != 2;
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        return !b();
    }

    /* access modifiers changed from: package-private */
    public final void b(Context context) {
        if (this.e != null) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.input_icon_view_size);
            si.c(context).a(this.e).b(new agj((byte) 0).a(dimensionPixelSize, dimensionPixelSize).d()).b();
        }
    }
}

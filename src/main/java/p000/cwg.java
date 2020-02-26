package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.hardware.hdmi.HdmiDeviceInfo;
import android.media.tv.TvInputInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.tvlauncher.R;
import java.util.Map;
import java.util.Objects;

/* renamed from: cwg */
/* compiled from: PG */
public final class cwg {

    /* renamed from: a */
    public final String f7749a;

    /* renamed from: b */
    public final cwg f7750b;

    /* renamed from: c */
    public final TvInputInfo f7751c;

    /* renamed from: d */
    public final int f7752d;

    /* renamed from: e */
    public final Uri f7753e;

    /* renamed from: f */
    public int f7754f;

    /* renamed from: g */
    public int f7755g;

    /* renamed from: h */
    public String f7756h;

    /* renamed from: i */
    public int f7757i;

    /* renamed from: j */
    public int f7758j;

    /* renamed from: k */
    public String f7759k;

    /* renamed from: l */
    public String f7760l;

    /* renamed from: m */
    private final HdmiDeviceInfo f7761m;

    /* renamed from: n */
    private Drawable f7762n;

    /* renamed from: o */
    private int f7763o;

    public cwg(TvInputInfo tvInputInfo, cwg cwg, int i) {
        int i2;
        this.f7749a = tvInputInfo.getId();
        this.f7750b = cwg;
        this.f7751c = tvInputInfo;
        if (tvInputInfo.getHdmiDeviceInfo() == null || !tvInputInfo.getHdmiDeviceInfo().isCecDevice()) {
            i2 = (tvInputInfo.getHdmiDeviceInfo() == null || !tvInputInfo.getHdmiDeviceInfo().isMhlDevice()) ? tvInputInfo.getType() : -6;
        } else {
            int deviceType = tvInputInfo.getHdmiDeviceInfo().getDeviceType();
            i2 = deviceType != 0 ? deviceType != 1 ? deviceType != 3 ? deviceType != 4 ? deviceType != 5 ? -2 : -9 : -5 : -10 : -4 : -8;
        }
        this.f7752d = i2;
        this.f7753e = null;
        if (tvInputInfo.getType() == 1007) {
            this.f7761m = tvInputInfo.getHdmiDeviceInfo();
        } else {
            this.f7761m = null;
        }
        this.f7755g = i;
    }

    /* renamed from: d */
    private final boolean m5799d() {
        int i = this.f7752d;
        return i == -3 || i == -7;
    }

    public cwg(String str, String str2, Uri uri) {
        this.f7749a = str;
        this.f7750b = null;
        this.f7751c = null;
        this.f7761m = null;
        this.f7752d = -3;
        this.f7753e = uri;
        this.f7763o = 0;
        this.f7755g = 0;
        this.f7756h = str2 == null ? "" : str2;
        this.f7757i = Integer.MAX_VALUE;
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
        if (m5799d() && cwg.m5799d() && this.f7752d == cwg.f7752d) {
            return true;
        }
        TvInputInfo tvInputInfo2 = this.f7751c;
        return (tvInputInfo2 == null || (tvInputInfo = cwg.f7751c) == null || !tvInputInfo2.equals(tvInputInfo)) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Drawable mo3870a(Context context, int i) {
        Drawable drawable;
        Drawable drawable2 = this.f7762n;
        if (drawable2 != null && this.f7755g == this.f7763o) {
            return drawable2;
        }
        this.f7763o = i;
        if (this.f7751c != null) {
            if (!cwe.m5770a(context).f7735f || (drawable = this.f7751c.loadIcon(context, this.f7755g)) == null) {
                drawable = this.f7751c.loadIcon(context);
            }
            this.f7762n = drawable;
            if (drawable != null) {
                return drawable;
            }
        }
        Integer a = cvm.m5750a(this.f7752d);
        if (a == null) {
            a = Integer.valueOf((int) R.drawable.ic_icon_32dp_hdmi);
        }
        Drawable a2 = C0035bg.m3107a(context, a.intValue());
        this.f7762n = a2;
        return a2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo3871a() {
        HdmiDeviceInfo hdmiDeviceInfo = this.f7761m;
        return (hdmiDeviceInfo == null || TextUtils.isEmpty(hdmiDeviceInfo.getDisplayName())) ? this.f7756h : this.f7761m.getDisplayName();
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f7752d), this.f7751c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3872a(Context context) {
        Integer num;
        cwe a = cwe.m5770a(context);
        int i = this.f7752d;
        Map map = a.f7732c;
        this.f7754f = (map == null || (num = (Integer) map.get(Integer.valueOf(i))) == null) ? Integer.MAX_VALUE : num.intValue();
        TvInputInfo tvInputInfo = this.f7751c;
        if (tvInputInfo != null) {
            CharSequence loadCustomLabel = tvInputInfo.loadCustomLabel(context);
            if (TextUtils.isEmpty(loadCustomLabel)) {
                loadCustomLabel = this.f7751c.loadLabel(context);
            }
            if (loadCustomLabel == null) {
                this.f7756h = "";
            } else {
                this.f7756h = loadCustomLabel.toString();
            }
            this.f7757i = this.f7751c.getServiceInfo().metaData.getInt("input_sort_key", Integer.MAX_VALUE);
            cwg cwg = this.f7750b;
            if (cwg != null) {
                String a2 = cwg.mo3871a();
                this.f7759k = a2;
                this.f7760l = a2;
            } else {
                this.f7760l = this.f7756h;
            }
            this.f7762n = mo3870a(context, this.f7755g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo3874b() {
        return m5799d() || this.f7755g != 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo3875c() {
        return !mo3874b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo3873b(Context context) {
        if (this.f7753e != null) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.input_icon_view_size);
            C0497si.m8296c(context).mo5942a(this.f7753e).mo202b(new agj((byte) 0).mo192a(dimensionPixelSize, dimensionPixelSize).mo207d()).mo5940b();
        }
    }
}
